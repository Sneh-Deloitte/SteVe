/*
 * This file is generated by jOOQ.
 */
package jooq.steve.db.tables;


import de.rwth.idsg.steve.utils.DateTimeConverter;

import java.util.Arrays;
import java.util.List;

import jooq.steve.db.Indexes;
import jooq.steve.db.Keys;
import jooq.steve.db.Stevedb;
import jooq.steve.db.tables.records.ConnectorMeterValueRecord;

import org.joda.time.DateTime;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConnectorMeterValue extends TableImpl<ConnectorMeterValueRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>stevedb.connector_meter_value</code>
     */
    public static final ConnectorMeterValue CONNECTOR_METER_VALUE = new ConnectorMeterValue();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ConnectorMeterValueRecord> getRecordType() {
        return ConnectorMeterValueRecord.class;
    }

    /**
     * The column <code>stevedb.connector_meter_value.connector_pk</code>.
     */
    public final TableField<ConnectorMeterValueRecord, Integer> CONNECTOR_PK = createField(DSL.name("connector_pk"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>stevedb.connector_meter_value.transaction_pk</code>.
     */
    public final TableField<ConnectorMeterValueRecord, Integer> TRANSACTION_PK = createField(DSL.name("transaction_pk"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>stevedb.connector_meter_value.value_timestamp</code>.
     */
    public final TableField<ConnectorMeterValueRecord, DateTime> VALUE_TIMESTAMP = createField(DSL.name("value_timestamp"), SQLDataType.TIMESTAMP(6), this, "", new DateTimeConverter());

    /**
     * The column <code>stevedb.connector_meter_value.value</code>.
     */
    public final TableField<ConnectorMeterValueRecord, String> VALUE = createField(DSL.name("value"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>stevedb.connector_meter_value.reading_context</code>.
     */
    public final TableField<ConnectorMeterValueRecord, String> READING_CONTEXT = createField(DSL.name("reading_context"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>stevedb.connector_meter_value.format</code>.
     */
    public final TableField<ConnectorMeterValueRecord, String> FORMAT = createField(DSL.name("format"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>stevedb.connector_meter_value.measurand</code>.
     */
    public final TableField<ConnectorMeterValueRecord, String> MEASURAND = createField(DSL.name("measurand"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>stevedb.connector_meter_value.location</code>.
     */
    public final TableField<ConnectorMeterValueRecord, String> LOCATION = createField(DSL.name("location"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>stevedb.connector_meter_value.unit</code>.
     */
    public final TableField<ConnectorMeterValueRecord, String> UNIT = createField(DSL.name("unit"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>stevedb.connector_meter_value.phase</code>.
     */
    public final TableField<ConnectorMeterValueRecord, String> PHASE = createField(DSL.name("phase"), SQLDataType.VARCHAR(255), this, "");

    private ConnectorMeterValue(Name alias, Table<ConnectorMeterValueRecord> aliased) {
        this(alias, aliased, null);
    }

    private ConnectorMeterValue(Name alias, Table<ConnectorMeterValueRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>stevedb.connector_meter_value</code> table
     * reference
     */
    public ConnectorMeterValue(String alias) {
        this(DSL.name(alias), CONNECTOR_METER_VALUE);
    }

    /**
     * Create an aliased <code>stevedb.connector_meter_value</code> table
     * reference
     */
    public ConnectorMeterValue(Name alias) {
        this(alias, CONNECTOR_METER_VALUE);
    }

    /**
     * Create a <code>stevedb.connector_meter_value</code> table reference
     */
    public ConnectorMeterValue() {
        this(DSL.name("connector_meter_value"), null);
    }

    public <O extends Record> ConnectorMeterValue(Table<O> child, ForeignKey<O, ConnectorMeterValueRecord> key) {
        super(child, key, CONNECTOR_METER_VALUE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Stevedb.STEVEDB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.CONNECTOR_METER_VALUE_CMV_VALUE_TIMESTAMP_IDX, Indexes.CONNECTOR_METER_VALUE_FK_CM_PK_IDX, Indexes.CONNECTOR_METER_VALUE_FK_TID_CM_IDX);
    }

    @Override
    public List<ForeignKey<ConnectorMeterValueRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_PK_CM, Keys.FK_TID_CM);
    }

    private transient Connector _connector;
    private transient TransactionStart _transactionStart;

    /**
     * Get the implicit join path to the <code>stevedb.connector</code> table.
     */
    public Connector connector() {
        if (_connector == null)
            _connector = new Connector(this, Keys.FK_PK_CM);

        return _connector;
    }

    /**
     * Get the implicit join path to the <code>stevedb.transaction_start</code>
     * table.
     */
    public TransactionStart transactionStart() {
        if (_transactionStart == null)
            _transactionStart = new TransactionStart(this, Keys.FK_TID_CM);

        return _transactionStart;
    }

    @Override
    public ConnectorMeterValue as(String alias) {
        return new ConnectorMeterValue(DSL.name(alias), this);
    }

    @Override
    public ConnectorMeterValue as(Name alias) {
        return new ConnectorMeterValue(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ConnectorMeterValue rename(String name) {
        return new ConnectorMeterValue(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ConnectorMeterValue rename(Name name) {
        return new ConnectorMeterValue(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, Integer, DateTime, String, String, String, String, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
