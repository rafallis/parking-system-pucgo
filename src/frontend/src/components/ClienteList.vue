<template>
  <div>
    <table class="table">
      <thead>
      <tr>
        <th scope="col">Id</th>
        <th scope="col">CPF</th>
        <th scope="col">Nome</th>
        <th scope="col">Pontos</th>
        <th scope="col">Actions</th>
      </tr>
      </thead>
      <tbody v-for="(cliente, index) in clientes" :key="index">
      <tr>
        <td>{{cliente.pessoa.id}}</td>
        <td>{{cliente.pessoa.cpf}}</td>
        <td>{{cliente.pessoa.name}}</td>
        <td>{{cliente.pontuacao}}</td>
        <td><a :href="'/clientes/' + cliente.id" class="btn btn-primary">Edit</a></td>
      </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import ClienteDataService from "@/services/ClienteDataService";

export default {
  name: "clientes",
  data() {
    return {
      clientes: []
    }
  },
  methods: {
    retrieveClientes() {
      ClienteDataService.getAll()
        .then(response => {
          this.clientes = response.data
        })
      .catch(e => {
        alert(e)
      })
    }
  },
  mounted() {
    this.retrieveClientes()
  }
}
</script>

<style scoped>

</style>