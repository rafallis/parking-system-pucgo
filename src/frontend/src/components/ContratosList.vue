<template>
  <div>
    <table class="table">
      <thead>
      <tr>
        <th scope="col">First Name</th>
        <th scope="col">Last Name</th>
        <th scope="col">Email</th>
        <th scope="col">Phone</th>
        <th scope="col">Actions</th>
      </tr>
      </thead>
      <tbody v-for="(contrato, index) in contratos" :key="index">
      <tr>
        <td>{{contrato.id}}</td>
        <td>{{contrato.ativo}}</td>
        <td>{{contrato.dataRetirada}}</td>
        <td>{{contrato.dataDevolucao}}</td>
        <td>{{contrato.valorDiaria}}</td>
        <td>{{contrato.valorSeguro}}</td>
        <td>{{contrato.valorSeguro}}</td>
        <td><a :href="'/customers/' + customer.id" class="btn btn-primary">Edit</a></td>
      </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import ContratoDataService from "@/services/ContratoDataService";

export default {
  name: "contratos",
  data() {
    return {
      contratos: []
    }
  },
  methods: {
    retrieveContratos() {
      ContratoDataService.getAll()
        .then(response => {
          this.contratos = response.data
        })
      .catch(e => {
        alert(e)
      })
    }
  },
  mounted() {
    this.retrieveContratos()
  }
}
</script>

<style scoped>

</style>