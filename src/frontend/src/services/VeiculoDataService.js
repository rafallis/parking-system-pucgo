import http from '../http-common'

class VeiculoDataService {
    getAll() {
        return http.get('/veiculos')
    }

    get(idVeiculo) {
        return http.get(`/veiculos/${idVeiculo}`)
    }

    create(data) {
        return http.post('/veiculos/novo', data)
    }

    update(idVeiculo, data) {
        return http.put(`/veiculos/${idVeiculo}`, data)
    }

    delete(idVeiculo) {
        return http.delete(`/veiculos/${idVeiculo}`)
    }
}

export default new VeiculoDataService()