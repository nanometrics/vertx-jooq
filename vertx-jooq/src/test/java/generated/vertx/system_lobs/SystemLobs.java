/**
 * This class is generated by jOOQ
 */
package generated.vertx.system_lobs;


import generated.vertx.DefaultCatalog;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SystemLobs extends SchemaImpl {

    private static final long serialVersionUID = -1202841957;

    /**
     * The reference instance of <code>SYSTEM_LOBS</code>
     */
    public static final SystemLobs SYSTEM_LOBS = new SystemLobs();

    /**
     * No further instances allowed
     */
    private SystemLobs() {
        super("SYSTEM_LOBS", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }
}
