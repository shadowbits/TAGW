/*
 * This file is generated by jOOQ.
 */
package com.rainday.gen.tables.records;


import com.rainday.gen.tables.Relay;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class RelayRecord extends UpdatableRecordImpl<RelayRecord> implements Record8<Integer, Integer, String, String, String, String, Short, String> {

    private static final long serialVersionUID = -1190991890;

    /**
     * Setter for <code>relay.id</code>. 自增主键
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>relay.id</code>. 自增主键
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>relay.app_id</code>. application主键
     */
    public void setAppId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>relay.app_id</code>. application主键
     */
    public Integer getAppId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>relay.in_url</code>. inbound uri
     */
    public void setInUrl(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>relay.in_url</code>. inbound uri
     */
    public String getInUrl() {
        return (String) get(2);
    }

    /**
     * Setter for <code>relay.in_method</code>. inbound method
     */
    public void setInMethod(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>relay.in_method</code>. inbound method
     */
    public String getInMethod() {
        return (String) get(3);
    }

    /**
     * Setter for <code>relay.out_url</code>. outbound url
     */
    public void setOutUrl(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>relay.out_url</code>. outbound url
     */
    public String getOutUrl() {
        return (String) get(4);
    }

    /**
     * Setter for <code>relay.out_method</code>. outbound method
     */
    public void setOutMethod(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>relay.out_method</code>. outbound method
     */
    public String getOutMethod() {
        return (String) get(5);
    }

    /**
     * Setter for <code>relay.transmission</code>. 是否透传body
     */
    public void setTransmission(Short value) {
        set(6, value);
    }

    /**
     * Getter for <code>relay.transmission</code>. 是否透传body
     */
    public Short getTransmission() {
        return (Short) get(6);
    }

    /**
     * Setter for <code>relay.relay_status</code>. relay状态
     */
    public void setRelayStatus(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>relay.relay_status</code>. relay状态
     */
    public String getRelayStatus() {
        return (String) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, String, String, String, String, Short, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, String, String, String, String, Short, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Relay.RELAY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Relay.RELAY.APP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Relay.RELAY.IN_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Relay.RELAY.IN_METHOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Relay.RELAY.OUT_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Relay.RELAY.OUT_METHOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field7() {
        return Relay.RELAY.TRANSMISSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Relay.RELAY.RELAY_STATUS;
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
        return getAppId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getInUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getInMethod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getOutUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getOutMethod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component7() {
        return getTransmission();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getRelayStatus();
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
        return getAppId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getInUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getInMethod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getOutUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getOutMethod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value7() {
        return getTransmission();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getRelayStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RelayRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RelayRecord value2(Integer value) {
        setAppId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RelayRecord value3(String value) {
        setInUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RelayRecord value4(String value) {
        setInMethod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RelayRecord value5(String value) {
        setOutUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RelayRecord value6(String value) {
        setOutMethod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RelayRecord value7(Short value) {
        setTransmission(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RelayRecord value8(String value) {
        setRelayStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RelayRecord values(Integer value1, Integer value2, String value3, String value4, String value5, String value6, Short value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RelayRecord
     */
    public RelayRecord() {
        super(Relay.RELAY);
    }

    /**
     * Create a detached, initialised RelayRecord
     */
    public RelayRecord(Integer id, Integer appId, String inUrl, String inMethod, String outUrl, String outMethod, Short transmission, String relayStatus) {
        super(Relay.RELAY);

        set(0, id);
        set(1, appId);
        set(2, inUrl);
        set(3, inMethod);
        set(4, outUrl);
        set(5, outMethod);
        set(6, transmission);
        set(7, relayStatus);
    }
}
