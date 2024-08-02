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
        contratoDao.excluir();
        return "Excluido";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Buscado";
    }

    @Override
    public String editar() {
        contratoDao.editar();
        return "Editado";
    }
}
