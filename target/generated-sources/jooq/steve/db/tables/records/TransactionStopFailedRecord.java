/*
 * This file is generated by jOOQ.
 */
package jooq.steve.db.tables.records;


import jooq.steve.db.enums.TransactionStopFailedEventActor;
import jooq.steve.db.tables.TransactionStopFailed;

import org.joda.time.DateTime;
import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TransactionStopFailedRecord extends TableRecordImpl<TransactionStopFailedRecord> implements Record7<Integer, DateTime, TransactionStopFailedEventActor, DateTime, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>stevedb.transaction_stop_failed.transaction_pk</code>.
     */
    public TransactionStopFailedRecord setTransactionPk(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.transaction_stop_failed.transaction_pk</code>.
     */
    public Integer getTransactionPk() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>stevedb.transaction_stop_failed.event_timestamp</code>.
     */
    public TransactionStopFailedRecord setEventTimestamp(DateTime value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.transaction_stop_failed.event_timestamp</code>.
     */
    public DateTime getEventTimestamp() {
        return (DateTime) get(1);
    }

    /**
     * Setter for <code>stevedb.transaction_stop_failed.event_actor</code>.
     */
    public TransactionStopFailedRecord setEventActor(TransactionStopFailedEventActor value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.transaction_stop_failed.event_actor</code>.
     */
    public TransactionStopFailedEventActor getEventActor() {
        return (TransactionStopFailedEventActor) get(2);
    }

    /**
     * Setter for <code>stevedb.transaction_stop_failed.stop_timestamp</code>.
     */
    public TransactionStopFailedRecord setStopTimestamp(DateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.transaction_stop_failed.stop_timestamp</code>.
     */
    public DateTime getStopTimestamp() {
        return (DateTime) get(3);
    }

    /**
     * Setter for <code>stevedb.transaction_stop_failed.stop_value</code>.
     */
    public TransactionStopFailedRecord setStopValue(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.transaction_stop_failed.stop_value</code>.
     */
    public String getStopValue() {
        return (String) get(4);
    }

    /**
     * Setter for <code>stevedb.transaction_stop_failed.stop_reason</code>.
     */
    public TransactionStopFailedRecord setStopReason(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.transaction_stop_failed.stop_reason</code>.
     */
    public String getStopReason() {
        return (String) get(5);
    }

    /**
     * Setter for <code>stevedb.transaction_stop_failed.fail_reason</code>.
     */
    public TransactionStopFailedRecord setFailReason(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.transaction_stop_failed.fail_reason</code>.
     */
    public String getFailReason() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, DateTime, TransactionStopFailedEventActor, DateTime, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Integer, DateTime, TransactionStopFailedEventActor, DateTime, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return TransactionStopFailed.TRANSACTION_STOP_FAILED.TRANSACTION_PK;
    }

    @Override
    public Field<DateTime> field2() {
        return TransactionStopFailed.TRANSACTION_STOP_FAILED.EVENT_TIMESTAMP;
    }

    @Override
    public Field<TransactionStopFailedEventActor> field3() {
        return TransactionStopFailed.TRANSACTION_STOP_FAILED.EVENT_ACTOR;
    }

    @Override
    public Field<DateTime> field4() {
        return TransactionStopFailed.TRANSACTION_STOP_FAILED.STOP_TIMESTAMP;
    }

    @Override
    public Field<String> field5() {
        return TransactionStopFailed.TRANSACTION_STOP_FAILED.STOP_VALUE;
    }

    @Override
    public Field<String> field6() {
        return TransactionStopFailed.TRANSACTION_STOP_FAILED.STOP_REASON;
    }

    @Override
    public Field<String> field7() {
        return TransactionStopFailed.TRANSACTION_STOP_FAILED.FAIL_REASON;
    }

    @Override
    public Integer component1() {
        return getTransactionPk();
    }

    @Override
    public DateTime component2() {
        return getEventTimestamp();
    }

    @Override
    public TransactionStopFailedEventActor component3() {
        return getEventActor();
    }

    @Override
    public DateTime component4() {
        return getStopTimestamp();
    }

    @Override
    public String component5() {
        return getStopValue();
    }

    @Override
    public String component6() {
        return getStopReason();
    }

    @Override
    public String component7() {
        return getFailReason();
    }

    @Override
    public Integer value1() {
        return getTransactionPk();
    }

    @Override
    public DateTime value2() {
        return getEventTimestamp();
    }

    @Override
    public TransactionStopFailedEventActor value3() {
        return getEventActor();
    }

    @Override
    public DateTime value4() {
        return getStopTimestamp();
    }

    @Override
    public String value5() {
        return getStopValue();
    }

    @Override
    public String value6() {
        return getStopReason();
    }

    @Override
    public String value7() {
        return getFailReason();
    }

    @Override
    public TransactionStopFailedRecord value1(Integer value) {
        setTransactionPk(value);
        return this;
    }

    @Override
    public TransactionStopFailedRecord value2(DateTime value) {
        setEventTimestamp(value);
        return this;
    }

    @Override
    public TransactionStopFailedRecord value3(TransactionStopFailedEventActor value) {
        setEventActor(value);
        return this;
    }

    @Override
    public TransactionStopFailedRecord value4(DateTime value) {
        setStopTimestamp(value);
        return this;
    }

    @Override
    public TransactionStopFailedRecord value5(String value) {
        setStopValue(value);
        return this;
    }

    @Override
    public TransactionStopFailedRecord value6(String value) {
        setStopReason(value);
        return this;
    }

    @Override
    public TransactionStopFailedRecord value7(String value) {
        setFailReason(value);
        return this;
    }

    @Override
    public TransactionStopFailedRecord values(Integer value1, DateTime value2, TransactionStopFailedEventActor value3, DateTime value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TransactionStopFailedRecord
     */
    public TransactionStopFailedRecord() {
        super(TransactionStopFailed.TRANSACTION_STOP_FAILED);
    }

    /**
     * Create a detached, initialised TransactionStopFailedRecord
     */
    public TransactionStopFailedRecord(Integer transactionPk, DateTime eventTimestamp, TransactionStopFailedEventActor eventActor, DateTime stopTimestamp, String stopValue, String stopReason, String failReason) {
        super(TransactionStopFailed.TRANSACTION_STOP_FAILED);

        setTransactionPk(transactionPk);
        setEventTimestamp(eventTimestamp);
        setEventActor(eventActor);
        setStopTimestamp(stopTimestamp);
        setStopValue(stopValue);
        setStopReason(stopReason);
        setFailReason(failReason);
    }
}
