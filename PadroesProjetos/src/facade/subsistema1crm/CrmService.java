package facade.subsistema1crm;

public class CrmService {
    private CrmService()
        {
            super();
        }
    public static void gravarCliente(String nome,String cep, String cidade, String estado)
    {
        System.out.println("Cliente foi salvo no sistema CRM");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}
