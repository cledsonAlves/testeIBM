package santander.com.br.testeibm.shared.connector.enums;

/**
 * Created by cledson.alves on 21/04/2018.
 */

public enum Type {
        field(1),
        text(2),
        image(3),
        checkbox(4),
        send(5);

        private String name;
        private int code;

        Type(int code) {
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