const api = 'http://localhost:8080/api/livros';

document.addEventListener('DOMContentLoaded', carregarLivros);

function carregarLivros() {
    fetch(api)
        .then(res => res.json())
        .then(data => {
            const tabela = document.getElementById('tabelaLivros');
            tabela.innerHTML = '';
            data.forEach(livro => {
                tabela.innerHTML += `
                    <tr>
                        <td>${livro.titulo}</td>
                        <td>${livro.autor}</td>
                        <td>${livro.editora || ''}</td>
                        <td>${livro.anoPublicacao || ''}</td>
                        <td>${livro.isbn || ''}</td>
                        <td>
                            <button onclick="editarLivro(${livro.id})">Editar</button>
                            <button onclick="deletarLivro(${livro.id})" class="excluir">Excluir</button>
                        </td>
                    </tr>
                `;
            });
        })
        .catch(error => console.error('Erro ao carregar livros:', error));
}

document.getElementById('livroForm').addEventListener('submit', function (e) {
    e.preventDefault();

    const livro = {
        titulo: document.getElementById('titulo').value,
        autor: document.getElementById('autor').value,
        editora: document.getElementById('editora').value,
        anoPublicacao: document.getElementById('anoPublicacao').value,
        isbn: document.getElementById('isbn').value
    };

    const id = document.getElementById('livroId').value;

    if (id) {
        // Atualizar livro
        fetch(`${api}/${id}`, {
            method: 'PUT',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify(livro)
        }).then(() => {
            carregarLivros();
            limparFormulario();
        }).catch(error => console.error('Erro ao atualizar livro:', error));
    } else {
        // Criar novo livro
        fetch(api, {
            method: 'POST',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify(livro)
        }).then(() => {
            carregarLivros();
            limparFormulario();
        }).catch(error => console.error('Erro ao criar livro:', error));
    }
});

function editarLivro(id) {
    fetch(`${api}/${id}`)
        .then(res => res.json())
        .then(livro => {
            document.getElementById('livroId').value = livro.id;
            document.getElementById('titulo').value = livro.titulo;
            document.getElementById('autor').value = livro.autor;
            document.getElementById('editora').value = livro.editora || '';  // Garantir que o valor seja vazio, caso não exista
            document.getElementById('anoPublicacao').value = livro.anoPublicacao || '';  // Garantir que o valor seja vazio, caso não exista
            document.getElementById('isbn').value = livro.isbn || '';  // Garantir que o valor seja vazio, caso não exista

            document.getElementById('form-title').textContent = 'Editar Livro';
            document.getElementById('cancelarEdicao').style.display = 'inline-block';
        })
        .catch(error => console.error('Erro ao carregar livro para edição:', error));
}

function deletarLivro(id) {
    if (confirm('Deseja realmente excluir este livro?')) {
        fetch(`${api}/${id}`, {method: 'DELETE'})
            .then(() => carregarLivros())
            .catch(error => console.error('Erro ao excluir livro:', error));
    }
}

document.getElementById('cancelarEdicao').addEventListener('click', function () {
    limparFormulario();
});

function limparFormulario() {
    document.getElementById('livroForm').reset();
    document.getElementById('livroId').value = '';
    document.getElementById('form-title').textContent = 'Cadastrar Livro';
    document.getElementById('cancelarEdicao').style.display = 'none';
}
