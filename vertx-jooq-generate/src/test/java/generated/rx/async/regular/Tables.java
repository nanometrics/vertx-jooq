/*
 * This file is generated by jOOQ.
 */
package generated.rx.async.regular;


import generated.rx.async.regular.tables.Something;
import generated.rx.async.regular.tables.Somethingcomposite;
import generated.rx.async.regular.tables.Somethingwithoutjson;

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
    public static final Something SOMETHING = generated.rx.async.regular.tables.Something.SOMETHING;

    /**
     * The table <code>vertx.somethingComposite</code>.
     */
    public static final Somethingcomposite SOMETHINGCOMPOSITE = generated.rx.async.regular.tables.Somethingcomposite.SOMETHINGCOMPOSITE;

    /**
     * The table <code>vertx.somethingWithoutJson</code>.
     */
    public static final Somethingwithoutjson SOMETHINGWITHOUTJSON = generated.rx.async.regular.tables.Somethingwithoutjson.SOMETHINGWITHOUTJSON;
}
