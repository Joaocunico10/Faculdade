<script setup>
import { ref } from 'vue';
import Titulo from './components/Titulo.vue';
import CardAluno from './components/CardAluno.vue';
import Contador from './components/Contador.vue';
import Saudacao from './components/Saudacao.vue';
import Placar from './components/Placar.vue';
import GanhaPonto from './components/GanhaPonto.vue';

const pontos = ref(0)

function mostrarAlerta(valor) {
  alert(`O contador ja chegou em ${valor}`)
}

function ganharPonto() {
  pontos.value++
}

</script>



<template>
  <Titulo />

  <Saudacao nome="Joao" />
  <CardAluno nome="Maria" curso="Engenharia de agronomia" />

  <Contador @limite="mostrarAlerta" />

  <Placar :pontos="pontos" />
  <GanhaPonto @ganharPonto="ganharPonto" />
</template>

<style scoped></style>
