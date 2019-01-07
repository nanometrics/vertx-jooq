/*
 * This file is generated by jOOQ.
 */
package generated.classic.reactive.regular.vertx.tables.daos;


import generated.classic.reactive.regular.vertx.tables.Somethingcomposite;
import generated.classic.reactive.regular.vertx.tables.records.SomethingcompositeRecord;

import io.github.jklingsporn.vertx.jooq.shared.reactive.AbstractReactiveVertxDAO;
import io.vertx.core.json.JsonObject;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;


import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.reactivepg.ReactiveClassicQueryExecutor;
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
public class SomethingcompositeDao extends AbstractReactiveVertxDAO<SomethingcompositeRecord, generated.classic.reactive.regular.vertx.tables.pojos.Somethingcomposite, Record2<Integer, Integer>, Future<List<generated.classic.reactive.regular.vertx.tables.pojos.Somethingcomposite>>, Future<generated.classic.reactive.regular.vertx.tables.pojos.Somethingcomposite>, Future<Integer>, Future<Record2<Integer, Integer>>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<SomethingcompositeRecord,generated.classic.reactive.regular.vertx.tables.pojos.Somethingcomposite,Record2<Integer, Integer>> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the POSTGREs types.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public SomethingcompositeDao(Configuration configuration, io.reactiverse.pgclient.PgClient delegate) {
        super(Somethingcomposite.SOMETHINGCOMPOSITE, generated.classic.reactive.regular.vertx.tables.pojos.Somethingcomposite.class, new ReactiveClassicQueryExecutor<SomethingcompositeRecord,generated.classic.reactive.regular.vertx.tables.pojos.Somethingcomposite,Record2<Integer, Integer>>(configuration,delegate,generated.classic.reactive.regular.vertx.tables.mappers.RowMappers.getSomethingcompositeMapper()));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<Integer, Integer> getId(generated.classic.reactive.regular.vertx.tables.pojos.Somethingcomposite object) {
        return compositeKeyRecord(object.getSomeid(), object.getSomesecondid());
    }

    /**
     * Find records that have <code>someSecondId IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.reactive.regular.vertx.tables.pojos.Somethingcomposite>> findManyBySomesecondid(List<Integer> values) {
        return findManyByCondition(Somethingcomposite.SOMETHINGCOMPOSITE.SOMESECONDID.in(values));
    }

    /**
     * Find records that have <code>someJsonObject IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.reactive.regular.vertx.tables.pojos.Somethingcomposite>> findManyBySomejsonobject(List<JsonObject> values) {
        return findManyByCondition(Somethingcomposite.SOMETHINGCOMPOSITE.SOMEJSONOBJECT.in(values));
    }

    @Override
    public ReactiveClassicQueryExecutor<SomethingcompositeRecord,generated.classic.reactive.regular.vertx.tables.pojos.Somethingcomposite,Record2<Integer, Integer>> queryExecutor(){
        return (ReactiveClassicQueryExecutor<SomethingcompositeRecord,generated.classic.reactive.regular.vertx.tables.pojos.Somethingcomposite,Record2<Integer, Integer>>) super.queryExecutor();
    }
}
