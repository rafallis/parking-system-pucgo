<template>
  <div v-if="currentVeiculo">
    <div class="mb-3">
      <label for="idVeiculo" class="form-label">ID</label>
      <input type="text" class="form-control" id="idVeiculo" required name="idVeiculo" v-model="currentVeiculo.idVeiculo">
    </div>
    <div class="mb-3">
      <label for="placa" class="form-label">Placa</label>
      <input type="text" class="form-control" id="placa" required name="placa" v-model="currentVeiculo.placa">
    </div>
    <div class="mb-3">
      <label for="modelo" class="form-label">Modelo</label>
      <input type="email" class="form-control" id="modelo" required name="modelo" v-model="currentVeiculo.idModelo">
    </div>
    <div class="mb-3">
      <label for="categoria" class="form-label">Categoria</label>
      <input type="text" class="form-control" id="categoria" required name="categoria" v-model="currentVeiculo.categoria.descricao">
    </div>
    <div class="alert alert-success" role="alert" v-if="message">
      {{message}}
    </div>
  </div>
</template>

<script>
import VeiculoDataService from "@/services/VeiculoDataService";

export default {
  name: 'edit-veiculo',
  data() {
    return {
      currentVeiculo: null,
      message: ''
    }
  },
  methods: {
    getCustomer(id) {
      VeiculoDataService.get(id)
          .then(response => {
            this.currentVeiculo = response.data
          })
          .catch(e => {
            alert(e)
          })
    },
    updateCustomer() {
      VeiculoDataService.update(this.currentVeiculo.id, this.currentVeiculo)
          .then(() => {
            this.message = 'The customer was updated successfully!'
          })
          .catch(e => {
            alert(e)
          })
    },
    deleteCustomer() {
      VeiculoDataService.delete(this.currentVeiculo.id)
          .then(() => {
            this.$router.push({name: 'veiculos'})
          })
          .catch(e => {
            alert(e)
          })
    }
  },
  mounted() {
    this.getCustomer(this.$route.params.id)
  }
}
</script>

<style scoped>

</style>