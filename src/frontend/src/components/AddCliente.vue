<template>
  <div>
    <div v-if="!submitted">
      <div class="mb-3">
        <label for="name" class="form-label">Nome</label>
        <input type="text" class="form-control" id="name" required name="name" v-model="cliente.name">
      </div>
      <div class="mb-3">
        <label for="cpf" class="form-label">CPF</label>
        <input type="text" class="form-control" id="cpf" required name="cpf" v-model="cliente.cpf">
      </div>
    </div>

    <div v-else>
      <div class="alert alert-success" role="alert">
        Cliente salvo
      </div>
      <button @click="newCliente" class="btn btn-primary">Adicionar Novo Cliente</button>
    </div>
  </div>
</template>

<script>
import ClienteDataService from "@/services/ClienteDataService";

export default {
  name: 'add-cliente',
  data() {
    return {
      cliente: {
        id: null,
        name: null,
        cpf: null
      },
      submitted: false
    }
  },
  methods: {
    saveCliente() {
      var data = {
        name: this.cliente.name,
        cpf: this.cliente.cpf
      }
      ClienteDataService.create(data)
        .then(response => {
          this.cliente.if = response.data.id
          this.submitted = true
        })
      .catch( e=> {
        alert(e)
      })
    },
    newCliente() {
      this.submitted = false
      this.cliente = {}
    }
  }
}
</script>