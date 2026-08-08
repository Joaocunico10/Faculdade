const botao = document.getElementById('btn');
const input = document.querySelector('input');
const ul = document.getElementById('uls');

botao.addEventListener("click", function() {
    let valor = input.value.trim();

    if (valor === "") return;

    let li = document.createElement("li");

    let span = document.createElement("span");
    span.innerText = valor;

    let btnRemover = document.createElement("button");
    btnRemover.innerText = "Remover";

    btnRemover.addEventListener("click", function() {
        li.remove();
    });

    span.addEventListener("click", function() {
        span.style.textDecoration = "line-through";
    });

    li.appendChild(span);
    li.appendChild(btnRemover);
    ul.appendChild(li);

    input.value = "";
});