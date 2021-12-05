<template>
  <div>
    <table class="table">
      <thead>
      <tr>
        <th scope="col">ID</th>
        <th scope="col">Ativo</th>
        <th scope="col">Data Retirada</th>
        <th scope="col">Data Devolução</th>
        <th scope="col">Valor Diaria</th>
        <th scope="col">Valor Seguro</th>
        <th scope="col">Veiculo</th>
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
        <td><a :href="'/veiculos/' + contrato.veiculo.idVeiculo" class="btn btn-primary">{{contrato.veiculo.idVeiculo}}</a></td>
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