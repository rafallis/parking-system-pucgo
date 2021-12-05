<template>
  <div>
    <table class="table">
      <thead>
      <tr>
        <th scope="col">ID</th>
        <th scope="col">Placa</th>
        <th scope="col">Modelo</th>
        <th scope="col">Categoria</th>
      </tr>
      </thead>
      <tbody v-for="(veiculo, index) in veiculos" :key="index">
      <tr>
        <td>{{veiculo.idVeiculo}}</td>
        <td>{{veiculo.placa}}</td>
        <td>{{veiculo.idModelo}}</td>
        <td>{{veiculo.categoria.descricao}}</td>
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
    retrieveVeiculo(id) {
      VeiculoDataService.get(id)
        .then(response => {
          this.veiculos.push(response.data)
        })
      .catch(e => {
        alert(e)
      })
    },
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
    this.retrieveVeiculo(this.$route.params.id)
    this.retrieveVeiculos()
  }
}
</script>

<style scoped>

</style>