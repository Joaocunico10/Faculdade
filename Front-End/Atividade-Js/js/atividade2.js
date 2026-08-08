function mudarCor(){
    const botao = document.getElementById('btn');

    botao = addEventListener("click", function(){
        const h1 = document.querySelector("h1");
        h1.style.color = "red";
    })

}

mudarCor();