/*
 * This file is generated by jOOQ.
 */
package generated.cf.reactive.regular.vertx;


import generated.cf.reactive.regular.vertx.tables.Something;
import generated.cf.reactive.regular.vertx.tables.Somethingcomposite;
import generated.cf.reactive.regular.vertx.tables.Somethingwithoutjson;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in vertx
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>vertx.something</code>.
     */
    public static final Something SOMETHING = generated.cf.reactive.regular.vertx.tables.Something.SOMETHING;

    /**
     * The table <code>vertx.somethingComposite</code>.
     */
    public static final Somethingcomposite SOMETHINGCOMPOSITE = generated.cf.reactive.regular.vertx.tables.Somethingcomposite.SOMETHINGCOMPOSITE;

    /**
     * The table <code>vertx.somethingWithoutJson</code>.
     */
    public static final Somethingwithoutjson SOMETHINGWITHOUTJSON = generated.cf.reactive.regular.vertx.tables.Somethingwithoutjson.SOMETHINGWITHOUTJSON;
}
