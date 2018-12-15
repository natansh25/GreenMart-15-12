package infinity1087.android.com.examplehr.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ResponseDatum implements Serializable {

    @SerializedName("$id")
    @Expose
    private String $id;
    @SerializedName("PG")
    @Expose
    private PG pG;
    @SerializedName("P")
    @Expose
    private P p;

    public String get$id() {
        return $id;
    }

    public void set$id(String $id) {
        this.$id = $id;
    }

    public PG getPG() {
        return pG;
    }

    public void setPG(PG pG) {
        this.pG = pG;
    }

    public P getP() {
        return p;
    }

    public void setP(P p) {
        this.p = p;
    }
}
