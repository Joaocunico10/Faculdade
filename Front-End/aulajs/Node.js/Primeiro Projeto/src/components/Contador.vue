<script setup>
    import {ref} from 'vue'

    const emit = defineEmits(['limite'])

    const contador = ref(0)

    function aumentar(){
        contador.value++

        if(contador.value >= 10){
            emit('limite', contador.value)
        }
    }


</script>

<template>
    <section>
        <p>{{ contador }}</p>

        <button @click="aumentar">Aumentar</button>
    </section>
</template>