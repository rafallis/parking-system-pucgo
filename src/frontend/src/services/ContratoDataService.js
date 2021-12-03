import http from '../http-common'

class ContratoDataService {
    getAll() {
        return http.get('/contratos')
    }

    get(idContrato) {
        return http.get(`/contratos/${idContrato}`)
    }

    create(data) {
        return http.post('/contratos/novo', data)
    }

    update(idContrato, data) {
        return http.put(`/contratos/${idContrato}`, data)
    }

    delete(idContrato) {
        return http.delete(`/contratos/${idContrato}`)
    }
}

export default new ContratoDataService()