<script setup>

import {onMounted, ref} from "vue"

const usuarios = ref([])

async function carregarUsuarios() {
    const resposta = await fetch('https://jsonplaceholder.typicode.com/users')

    usuarios.value = await resposta.json()

}

onMounted(() => {
    carregarUsuarios()
})
</script>

<template>
    <h2>Usuarios da API</h2>
    <div class="lista">
        <article v-for="usuario in usuarios" :key="usuario.id" class="article">
            <h3>Nome: {{ usuario.name }}</h3>
            <p>Email: {{ usuario.name }}</p>
            <p>Cidade: {{ usuario.address.city }}</p>
        </article>
    </div>
</template>

<style scoped>
.lista {
    display: flex;
    gap: 24px;
    flex-wrap: wrap;
    justify-content: flex-start;
}

.article {
    flex: 1 1 280px;
    background: #f9f9f9;
    border: 1px solid #ddd;
    border-radius: 10px;
    padding: 18px;
    box-shadow: 0 2px 8px rgba(0, 0, 0, 0.06);
    transition: transform 0.2s ease, box-shadow 0.2s ease;
}

.article:hover {
    transform: translateY(-2px);
    box-shadow: 0 6px 18px rgba(0, 0, 0, 0.12);
}

.article h3 {
    margin: 0 0 10px;
    font-size: 1.15rem;
}

.article p {
    margin: 4px 0;
    color: #4a4a4a;
    line-height: 1.4;
}
</style>