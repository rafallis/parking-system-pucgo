import http from '../http-common'

class ClienteDataService {
    getAll() {
        return http.get('/clientes')
    }

    get(idCliente) {
        return http.get(`/clientes/${idCliente}`)
    }

    create(data) {
        return http.post('/clientes/novo', data)
    }

    update(idCliente, data) {
        return http.put(`/clientes/${idCliente}`, data)
    }

    delete(idCliente) {
        return http.delete(`/clientes/${idCliente}`)
    }
}

export default new ClienteDataService()