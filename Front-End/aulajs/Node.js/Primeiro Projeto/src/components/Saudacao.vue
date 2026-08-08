<script setup>
defineProps({
    nome: String
})
</script>

<template>
    <div>
        <h2>Olá, {{ nome }}! Bem-vindo!</h2>
    </div>
</template>

<style scoped>
div {
    background-color: #ffeb3b;
    padding: 20px;
    border-radius: 5px;
    margin: 10px 0;
}
</style>