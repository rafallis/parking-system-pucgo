<template>
  <div>
    <div v-if="!submitted">
      <div class="mb-3">
        <label for="ativo" class="form-label">Contrato Ativo</label>
        <input type="text" class="form-control" id="ativo" required name="ativo" v-model="contrato.ativo">
      </div>
      <div class="mb-3">
        <label class="form-label">Data Retirada</label>
        <Datepicker for="dataRetirada" class="form-control" id="dataRetirada" required name="retirada" v-model="contrato.dataRetirada"></Datepicker>
<!--        <input type="text" class="form-control" id="data-retirada" required name="retirada" v-model="contrato.data_retirada">-->
      </div>
      <div class="mb-3">
        <label class="form-label">Data Devolução</label>
        <Datepicker for="data-devolucao"  class="form-control" id="data-devolucao" required name="devolucao" v-model="contrato.dataDevolucao"></Datepicker>
<!--        <input type="text" class="form-control" id="data-devolucao" required name="devolucao" v-model="contrato.data_devolucao">-->
      </div>
      <div class="mb-3">
        <label for="valor-diaria" class="form-label">Valor Diaria</label>
        <input type="text" class="form-control" id="valor-diaria" required name="valor-diaria" v-model="contrato.valorDiaria">
      </div>
      <div class="mb-3">
        <label for="valor-seguro" class="form-label">Valor Seguro</label>
        <input type="number" class="form-control" id="valor-seguro" required name="valor-seguro" v-model="contrato.valorSeguro">
      </div>
      <div class="mb-3">
        <label for="id-cliente" class="form-label">Valor Diaria</label>
        <input type="number" class="form-control" id="id-cliente" required name="id-cliente" v-model="contrato.idCliente">
      </div>
      <div class="mb-3">
        <label for="id-filial-retirada" class="form-label">Filial Retirada</label>
        <input type="number" class="form-control" id="id-filial-retirada" required name="id-filial-retirada" v-model="contrato.idFilialRetirada">
      </div>
      <div class="mb-3">
        <label for="id-filial-devolucao" class="form-label">Filial Devolução</label>
        <input type="number" class="form-control" id="id-filial-devolucao" required name="id-filial-devolucao" v-model="contrato.idFilialDevolucao">
      </div>
      <div class="mb-3">
        <label for="id-veiculo" class="form-label">Veiculo</label>
        <input type="number" class="form-control" id="id-veiculo" required name="id-veiculo" v-model="contrato.idVeiculo">
      </div>
      <div class="mb-3">
        <button @click="saveContrato" class="btn btn-primary">Submit</button>
      </div>
    </div>

    <div v-else>
      <div class="alert alert-success" role="alert">
        Contrato salvo
      </div>
      <button @click="newContrato" class="btn btn-primary">Adicionar Novo Contrato</button>
    </div>
  </div>
</template>

<script>
import ContratoDataService from "@/services/ContratoDataService";
import Datepicker from 'vuejs-datepicker';

export default {
  name: 'add-contrato',
  components: {
    Datepicker
  },
  data() {
    return {
      contrato: {
        id: null,
        ativo: false,
        dataDevolucao: null,
        dataRetirada: new Date(),
        valorDiaria: 0.00,
        valorSeguro: 0.00,
        idCliente: 0,
        idFilialDevolucao: 0,
        idFilialRetirada: 0,
        idVeiculo: 0
      },
      submitted: false
    }
  },
  methods: {
    saveContrato() {
      let data = {
        ativo: this.contrato.ativo,
        dataDevolucao: this.contrato.dataDevolucao,
        dataRetirada: this.contrato.dataRetirada,
        valorDiaria: this.contrato.valorDiaria,
        valorSeguro: this.contrato.valorSeguro,
        idCliente: this.contrato.idCliente,
        idFilialDevolucao: this.contrato.idFilialDevolucao,
        idFilialRetirada: this.contrato.idFilialRetirada,
        idVeiculo: this.contrato.idVeiculo
      }
      ContratoDataService.create(data)
          .then(response => {
            this.contrato.if = response.data.id
            this.submitted = true
          })
          .catch( e=> {
            alert(e)
          })
    },
    newContrato() {
      this.submitted = false
      this.contrato = {}
    }
  }
}
</script>