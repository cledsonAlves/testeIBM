package santander.com.br.testeibm.features.home.model;

/**
 * Created by cledson.alves on 20/04/2018.
 */

import java.util.Map;

public class Cell {
    private long id;
    private long type;
    private String message;
    private String typefield;
    private boolean hidden;
    private long topSpacing;
    private Long show;
    private boolean required;

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public long getType() { return type; }
    public void setType(long value) { this.type = value; }

    public String getMessage() { return message; }
    public void setMessage(String value) { this.message = value; }

    public String getTypefield() { return typefield; }
    public void setTypefield(String value) { this.typefield = value; }

    public boolean getHidden() { return hidden; }
    public void setHidden(boolean value) { this.hidden = value; }

    public long getTopSpacing() { return topSpacing; }
    public void setTopSpacing(long value) { this.topSpacing = value; }

    public Long getShow() { return show; }
    public void setShow(Long value) { this.show = value; }

    public boolean getRequired() { return required; }
    public void setRequired(boolean value) { this.required = value; }
}
