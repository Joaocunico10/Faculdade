const form = document.getElementById("formCadastro")

form.addEventListener("submit", function(event){
    event.preventDefault();

    const dados = {
        nome: document.getElementById("nome").value,
        email: document.getElementById("email").value,
        idade: document.getElementById("telefone").value
    }

    console.log(dados)

})