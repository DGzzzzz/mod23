package com.br.dg;

public class ContratoService implements IContratoService {
    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String excluir() {
        return "Excluido";
    }

    @Override
    public String buscar() {
        return "Buscado";
    }

    @Override
    public String editar() {
        return "Editado";
    }
}
