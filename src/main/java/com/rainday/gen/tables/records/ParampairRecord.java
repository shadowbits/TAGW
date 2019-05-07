/*
 * This file is generated by jOOQ.
 */
package com.rainday.gen.tables.records;


import com.rainday.gen.tables.Parampair;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ParampairRecord extends UpdatableRecordImpl<ParampairRecord> implements Record6<Integer, Integer, String, String, String, String> {

    private static final long serialVersionUID = -1263088319;

    /**
     * Setter for <code>parampair.id</code>. 自增主键
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>parampair.id</code>. 自增主键
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>parampair.relay_id</code>. relayId
     */
    public void setRelayId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>parampair.relay_id</code>. relayId
     */
    public Integer getRelayId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>parampair.in_name</code>. 入参名称
     */
    public void setInName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>parampair.in_name</code>. 入参名称
     */
    public String getInName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>parampair.in_type</code>. 入参类型
     */
    public void setInType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>parampair.in_type</code>. 入参类型
     */
    public String getInType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>parampair.out_name</code>. 出参名称
     */
    public void setOutName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>parampair.out_name</code>. 出参名称
     */
    public String getOutName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>parampair.out_type</code>. 出参类型
     */
    public void setOutType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>parampair.out_type</code>. 出参类型
     */
    public String getOutType() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Parampair.PARAMPAIR.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Parampair.PARAMPAIR.RELAY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Parampair.PARAMPAIR.IN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Parampair.PARAMPAIR.IN_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Parampair.PARAMPAIR.OUT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Parampair.PARAMPAIR.OUT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getRelayId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getInName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getInType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getOutName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getOutType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getRelayId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getInName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getInType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getOutName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getOutType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParampairRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParampairRecord value2(Integer value) {
        setRelayId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParampairRecord value3(String value) {
        setInName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParampairRecord value4(String value) {
        setInType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParampairRecord value5(String value) {
        setOutName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParampairRecord value6(String value) {
        setOutType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParampairRecord values(Integer value1, Integer value2, String value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ParampairRecord
     */
    public ParampairRecord() {
        super(Parampair.PARAMPAIR);
    }

    /**
     * Create a detached, initialised ParampairRecord
     */
    public ParampairRecord(Integer id, Integer relayId, String inName, String inType, String outName, String outType) {
        super(Parampair.PARAMPAIR);

        set(0, id);
        set(1, relayId);
        set(2, inName);
        set(3, inType);
        set(4, outName);
        set(5, outType);
    }
}
