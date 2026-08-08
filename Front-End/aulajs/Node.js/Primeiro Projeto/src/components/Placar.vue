<script setup>
defineProps({
    pontos: Number
})
</script>

<template>
    <div>
        <h2>Placar: {{ pontos }} pontos</h2>
    </div>
</template>

<style scoped>
.placar {
    background-color: #4CAF50;
    color: white;
    padding: 20px;
    border-radius: 5px;
    text-align: center;
    margin: 10px 0;
}
</style>