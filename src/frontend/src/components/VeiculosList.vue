<template>
  <div>
    <table class="table">
      <thead>
      <tr>
        <th scope="col">ID</th>
        <th scope="col">Placa</th>
        <th scope="col">Modelo</th>
        <th scope="col">Categoria</th>
        <th scope="col">Garagem</th>
      </tr>
      </thead>
      <tbody v-for="(veiculo, index) in veiculos" :key="index">
      <tr>
        <td>{{veiculo.idVeiculo}}</td>
        <td>{{veiculo.placa}}</td>
        <td>{{veiculo.idModelo}}</td>
        <td>{{veiculo.categoria.descricao}}</td>
        <td>{{veiculo.idGaragem}}</td>
      </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import VeiculoDataService from "@/services/VeiculoDataService";

export default {
  name: "veiculos",
  data() {
    return {
      currentVeiculo: null,
      veiculos: []
    }
  },
  methods: {
    retrieveVeiculos() {
      VeiculoDataService.getAll()
        .then(response => {
          this.veiculos = response.data
        })
      .catch(e => {
        alert(e)
      })
    }
  },
  mounted() {
    this.retrieveVeiculos()
  }
}
</script>

<style scoped>

</style>