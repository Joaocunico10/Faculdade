const botao = document.getElementById('btn');
const input = document.querySelector('input');
const ul = document.getElementById('uls');

botao.addEventListener("click", function(){
    let valor = input.value;
    let li = document.createElement("li");

    li.innerText = valor;

    ul.appendChild(li)

    input.value = " ";
})