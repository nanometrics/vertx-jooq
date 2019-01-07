/*
 * This file is generated by jOOQ.
 */
package generated.classic.jdbc.custom.vertx.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.vertx.core.json.JsonObject;

import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Somethingcomposite implements VertxPojo, Serializable {

    private static final long serialVersionUID = 433531364;

    private Integer    someid;
    private Integer    somesecondid;
    private JsonObject somejsonobject;

    public Somethingcomposite() {}

    public Somethingcomposite(Somethingcomposite value) {
        this.someid = value.someid;
        this.somesecondid = value.somesecondid;
        this.somejsonobject = value.somejsonobject;
    }

    public Somethingcomposite(
        Integer    someid,
        Integer    somesecondid,
        JsonObject somejsonobject
    ) {
        this.someid = someid;
        this.somesecondid = somesecondid;
        this.somejsonobject = somejsonobject;
    }

    public Integer getSomeid() {
        return this.someid;
    }

    public Somethingcomposite setSomeid(Integer someid) {
        this.someid = someid;
        return this;
    }

    public Integer getSomesecondid() {
        return this.somesecondid;
    }

    public Somethingcomposite setSomesecondid(Integer somesecondid) {
        this.somesecondid = somesecondid;
        return this;
    }

    public JsonObject getSomejsonobject() {
        return this.somejsonobject;
    }

    public Somethingcomposite setSomejsonobject(JsonObject somejsonobject) {
        this.somejsonobject = somejsonobject;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Somethingcomposite other = (Somethingcomposite) obj;
        if (someid == null) {
            if (other.someid != null)
                return false;
        }
        else if (!someid.equals(other.someid))
            return false;
        if (somesecondid == null) {
            if (other.somesecondid != null)
                return false;
        }
        else if (!somesecondid.equals(other.somesecondid))
            return false;
        if (somejsonobject == null) {
            if (other.somejsonobject != null)
                return false;
        }
        else if (!somejsonobject.equals(other.somejsonobject))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.someid == null) ? 0 : this.someid.hashCode());
        result = prime * result + ((this.somesecondid == null) ? 0 : this.somesecondid.hashCode());
        result = prime * result + ((this.somejsonobject == null) ? 0 : this.somejsonobject.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Somethingcomposite (");

        sb.append(someid);
        sb.append(", ").append(somesecondid);
        sb.append(", ").append(somejsonobject);

        sb.append(")");
        return sb.toString();
    }

    public Somethingcomposite(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    @Override
    public Somethingcomposite fromJson(io.vertx.core.json.JsonObject json) {
        setSomeid(json.getInteger("SOMEID"));
        setSomesecondid(json.getInteger("SOMESECONDID"));
        setSomejsonobject(json.getJsonObject("SOMEJSONOBJECT"));
        return this;
    }


    @Override
    public io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("SOMEID",getSomeid());
        json.put("SOMESECONDID",getSomesecondid());
        json.put("SOMEJSONOBJECT",getSomejsonobject());
        return json;
    }

}
