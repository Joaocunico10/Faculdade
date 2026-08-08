const aluno = {
    nome: 'Carlos'


}
let lista_nomes = ["Kevi", "Alex", "Djhonatan"];

function renderizar() {
    lista_tela.innerHTML = ""

    for (let nome of lista_nomes) {
        let item = document.createElement('li')
        item.innerText = nome
        lista_tela.appendChild(item)
    }
}

document.addEventListener("DOMContentLoaded", () => {
    renderizar()
})

add_final.addEventListener("click", () => {
    let valor_input = input.value

    lista_tela.innerHTML = ""

    lista_nomes.push(valor_input)
    console.log(lista_nomes)

    renderizar()
})

add_comeco.addEventListener("click", () => {
    let valor_input = input.value

    lista_tela.innerHTML = ""

    lista_nomes.unshift(valor_input)
    console.log(lista_nomes)

    renderizar()
})

remover_ultimo.addEventListener("click", () => {
    lista_nomes.pop()
    console.log(lista_nomes)
    renderizar()
})

remover_primeiro.addEventListener("click", () => {
    let valor_input = input.value

    lista_tela.innerHTML = ""

    lista_nomes.shift(lista_nomes)
    console.log(lista_nomes)
    renderizar()
})

filtro_letras.addEventListener("click", () => {
    lista_nomes = lista_nomes.filter(lista_nomes => lista_nomes.length > 5)
    renderizar()
})

maiusculo_todos.addEventListener("click", () => {
    lista_nomes = lista_nomes.map(lista_nomes => lista_nomes.toUpperCase())
    renderizar()
})

