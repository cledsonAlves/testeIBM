package santander.com.br.testeibm.shared.connector.enums;

/**
 * Created by cledson.alves on 21/04/2018.
 */

public enum TypeField {
    text(1),
    telNumber(2),
    email(3);

    private String name;
    private int code;

    TypeField(int code) {
        this.name = name;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
