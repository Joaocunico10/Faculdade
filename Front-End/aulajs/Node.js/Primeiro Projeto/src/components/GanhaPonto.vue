<script setup>
const emit = defineEmits(['ganharPonto'])

function clicar() {
    emit('ganharPonto')
}
</script>

<template>
    <button @click="clicar">Ganhar Ponto!</button>
</template>

<style scoped>
button {
    background-color: #2196F3;
    color: white;
    padding: 10px 20px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    font-size: 16px;
}

button:hover {
    background-color: #0b7dda;
}
</style>