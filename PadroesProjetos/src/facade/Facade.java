package facade;

public class Facade {
    public void migrarCliente(String nome, String cep)
    {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(estado)

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
