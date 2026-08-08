<script setup>
defineProps({
    nome: String,
    curso: String
})
</script>


<template>
    <article>
        <h2>Aluno</h2>

        <p>Nome: {{ nome }}</p>

        <p>Curso: {{ curso }}</p>
    </article>
</template>