package hello.hellospring.domain;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class Item {
    private Integer ID;
    private String NAME;
    private Integer PRICE;
    private String PICTURE;
    private String DETAIL;
    private Integer RECOMMENDED;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public Integer getPRICE() {
        return PRICE;
    }

    public void setPRICE(Integer PRICE) {
        this.PRICE = PRICE;
    }

    public String getPICTURE() {
        return PICTURE;
    }

    public void setPICTURE(String PICTURE) {
        this.PICTURE = PICTURE;
    }

    public String getDETAIL() {
        return DETAIL;
    }

    public void setDETAIL(String DETAIL) {
        this.DETAIL = DETAIL;
    }

    public Integer getRECOMMENDED() {
        return RECOMMENDED;
    }

    public void setRECOMMENDED(Integer RECOMMENDED) {
        this.RECOMMENDED = RECOMMENDED;
    }
}
