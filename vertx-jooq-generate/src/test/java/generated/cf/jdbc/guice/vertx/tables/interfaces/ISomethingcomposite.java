/*
 * This file is generated by jOOQ.
 */
package generated.cf.jdbc.guice.vertx.tables.interfaces;


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
public interface ISomethingcomposite extends VertxPojo, Serializable {

    /**
     * Setter for <code>VERTX.SOMETHINGCOMPOSITE.SOMEID</code>.
     */
    public ISomethingcomposite setSomeid(Integer value);

    /**
     * Getter for <code>VERTX.SOMETHINGCOMPOSITE.SOMEID</code>.
     */
    public Integer getSomeid();

    /**
     * Setter for <code>VERTX.SOMETHINGCOMPOSITE.SOMESECONDID</code>.
     */
    public ISomethingcomposite setSomesecondid(Integer value);

    /**
     * Getter for <code>VERTX.SOMETHINGCOMPOSITE.SOMESECONDID</code>.
     */
    public Integer getSomesecondid();

    /**
     * Setter for <code>VERTX.SOMETHINGCOMPOSITE.SOMEJSONOBJECT</code>.
     */
    public ISomethingcomposite setSomejsonobject(JsonObject value);

    /**
     * Getter for <code>VERTX.SOMETHINGCOMPOSITE.SOMEJSONOBJECT</code>.
     */
    public JsonObject getSomejsonobject();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ISomethingcomposite
     */
    public void from(generated.cf.jdbc.guice.vertx.tables.interfaces.ISomethingcomposite from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ISomethingcomposite
     */
    public <E extends generated.cf.jdbc.guice.vertx.tables.interfaces.ISomethingcomposite> E into(E into);

    @Override
    public default ISomethingcomposite fromJson(io.vertx.core.json.JsonObject json) {
        setSomeid(json.getInteger("SOMEID"));
        setSomesecondid(json.getInteger("SOMESECONDID"));
        setSomejsonobject(json.getJsonObject("SOMEJSONOBJECT"));
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("SOMEID",getSomeid());
        json.put("SOMESECONDID",getSomesecondid());
        json.put("SOMEJSONOBJECT",getSomejsonobject());
        return json;
    }

}
