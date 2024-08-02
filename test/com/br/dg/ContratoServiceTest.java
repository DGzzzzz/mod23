package com.br.dg;

import org.junit.Assert;
import org.junit.Test;

import com.br.dg.mocks.ContratoDaoMock;

public class ContratoServiceTest {
    @Test
    public void testContratoService() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);

        String retornoSalvar = service.salvar();
        Assert.assertEquals("Erro ao salvar", "Sucesso", retornoSalvar);

        String retornoExcluir = service.excluir();
        Assert.assertEquals("Excluido", retornoExcluir);

        String retornoBuscar = service.buscar();
        Assert.assertEquals( "Buscado", retornoBuscar);

        String retornoEditar = service.editar();
        Assert.assertEquals("Editado", retornoEditar);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testEsperaErro() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        service.salvar();
        service.excluir();
        service.buscar();
        service.editar();
    }
}
