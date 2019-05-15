/*
 * This file is generated by jOOQ.
 */
package com.rainday.gen.tables;


import com.rainday.gen.DefaultSchema;
import com.rainday.gen.Indexes;
import com.rainday.gen.Keys;
import com.rainday.gen.tables.records.RelayRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Relay extends TableImpl<RelayRecord> {

    private static final long serialVersionUID = -1902487880;

    /**
     * The reference instance of <code>relay</code>
     */
    public static final Relay RELAY = new Relay();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RelayRecord> getRecordType() {
        return RelayRecord.class;
    }

    /**
     * The column <code>relay.id</code>. 自增主键
     */
    public final TableField<RelayRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "自增主键");

    /**
     * The column <code>relay.app_id</code>. application主键
     */
    public final TableField<RelayRecord, Integer> APP_ID = createField("app_id", org.jooq.impl.SQLDataType.INTEGER, this, "application主键");

    /**
     * The column <code>relay.in_url</code>. inbound uri
     */
    public final TableField<RelayRecord, String> IN_URL = createField("in_url", org.jooq.impl.SQLDataType.VARCHAR(512), this, "inbound uri");

    /**
     * The column <code>relay.in_method</code>. inbound method
     */
    public final TableField<RelayRecord, String> IN_METHOD = createField("in_method", org.jooq.impl.SQLDataType.VARCHAR(512), this, "inbound method");

    /**
     * The column <code>relay.out_url</code>. outbound url
     */
    public final TableField<RelayRecord, String> OUT_URL = createField("out_url", org.jooq.impl.SQLDataType.VARCHAR(512), this, "outbound url");

    /**
     * The column <code>relay.out_method</code>. outbound method
     */
    public final TableField<RelayRecord, String> OUT_METHOD = createField("out_method", org.jooq.impl.SQLDataType.VARCHAR(512), this, "outbound method");

    /**
     * The column <code>relay.transmission</code>. 是否透传body
     */
    public final TableField<RelayRecord, Short> TRANSMISSION = createField("transmission", org.jooq.impl.SQLDataType.SMALLINT, this, "是否透传body");

    /**
     * The column <code>relay.relay_status</code>. relay状态
     */
    public final TableField<RelayRecord, String> RELAY_STATUS = createField("relay_status", org.jooq.impl.SQLDataType.VARCHAR(512), this, "relay状态");

    /**
     * Create a <code>relay</code> table reference
     */
    public Relay() {
        this(DSL.name("relay"), null);
    }

    /**
     * Create an aliased <code>relay</code> table reference
     */
    public Relay(String alias) {
        this(DSL.name(alias), RELAY);
    }

    /**
     * Create an aliased <code>relay</code> table reference
     */
    public Relay(Name alias) {
        this(alias, RELAY);
    }

    private Relay(Name alias, Table<RelayRecord> aliased) {
        this(alias, aliased, null);
    }

    private Relay(Name alias, Table<RelayRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Relay(Table<O> child, ForeignKey<O, RelayRecord> key) {
        super(child, key, RELAY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.RELAY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<RelayRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RELAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RelayRecord> getPrimaryKey() {
        return Keys.KEY_RELAY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RelayRecord>> getKeys() {
        return Arrays.<UniqueKey<RelayRecord>>asList(Keys.KEY_RELAY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Relay as(String alias) {
        return new Relay(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Relay as(Name alias) {
        return new Relay(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Relay rename(String name) {
        return new Relay(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Relay rename(Name name) {
        return new Relay(name, null);
    }
}
