<script setup></script>

<template>
  <div>
    <section>
      <nav>
        <RouterLink to="/">Home</RouterLink>
        <RouterLink to="/usuarios">Usuários</RouterLink>
      </nav>
      <hr>
      <RouterView />
    </section>
  </div>
</template>

<style scoped></style>
