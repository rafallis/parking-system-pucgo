<template>
  <div id="app">
    <nav class="navbar navbar-expand-lg narbar-dark bg-dark">
      <div class="container-fluid">
        <router-link to="/" class="navbar-brand">Locadora de Veículos</router-link>
        <div class="collapse navbar-collapse">
          <div class="navbar-nav">
            <router-link to="/veiculos" class="nav-link">Lista de Veiculos</router-link>
            <router-link to="/contratos" class="nav-link">Lista de Contratos</router-link>
            <router-link to="/contratos/novo" class="nav-link">Adicionar Novo Contrato</router-link>
          </div>
        </div>
      </div>
    </nav>
    <div class="container">
      <router-view />
    </div>
  </div>
</template>

<script>

export default {
  name: 'App',
}
</script>
