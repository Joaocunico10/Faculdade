/*base 3

funcao para adicionar o li
addeventlistner botao de adicionar
chamar funcao de criar o li
funcao de salvar o localStorage
document.addEventListeneer("DOMContentLoaded") -> carregar os elementos do localStorage
salvar so o texto como uma lista
transforma essa lista em json
*/
//botao
const botao = document.getElementById('btn');
const input = document.querySelector('input');
const ul = document.getElementById('uls');

botao.addEventListener("click", function(){
    let valor = input.value;
    
    lista.push(valor);
    criaLi(valor)
    salvaNome()

    input.value = "";
})

function criaLi(valor){
    let li = document.createElement("li");

    li.innerText = valor;

    ul.appendChild(li)

}

function salvaNome(listaRecuperada){
    localStorage.setItem('minhaLista', JSON.stringify(lista));
}

//LocalStorage - Lista
document.addEventListener("DOMContentLoaded", function(){
    const listaRecuperada = JSON.parse(localStorage.getItem('minhaLista')) || [];
    lista = listaRecuperada;

    for (const nomes of listaRecuperada) {
        criaLi(nomes);
    }

})