package santander.com.br.testeibm.shared.connector;

/**
 * Created by cledson.alves on 20/04/2018.
 */

public enum RouterEndPointEnum {

    FORMULARIO("https://floating-mountain-50292.herokuapp.com/cells.json"),
    ATIVO_FINANCEIRO("https://floating-mountain-50292.herokuapp.com/fund.json");

    private String endpoint;

    RouterEndPointEnum(final String endpoint)
    {
        this.endpoint = endpoint;
    }

    public String getEndpoint() {
        return endpoint;
    }
}