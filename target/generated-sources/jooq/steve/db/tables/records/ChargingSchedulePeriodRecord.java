/*
 * This file is generated by jOOQ.
 */
package jooq.steve.db.tables.records;


import java.math.BigDecimal;

import jooq.steve.db.tables.ChargingSchedulePeriod;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ChargingSchedulePeriodRecord extends TableRecordImpl<ChargingSchedulePeriodRecord> implements Record4<Integer, Integer, BigDecimal, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>stevedb.charging_schedule_period.charging_profile_pk</code>.
     */
    public ChargingSchedulePeriodRecord setChargingProfilePk(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for
     * <code>stevedb.charging_schedule_period.charging_profile_pk</code>.
     */
    public Integer getChargingProfilePk() {
        return (Integer) get(0);
    }

    /**
     * Setter for
     * <code>stevedb.charging_schedule_period.start_period_in_seconds</code>.
     */
    public ChargingSchedulePeriodRecord setStartPeriodInSeconds(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for
     * <code>stevedb.charging_schedule_period.start_period_in_seconds</code>.
     */
    public Integer getStartPeriodInSeconds() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>stevedb.charging_schedule_period.power_limit</code>.
     */
    public ChargingSchedulePeriodRecord setPowerLimit(BigDecimal value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.charging_schedule_period.power_limit</code>.
     */
    public BigDecimal getPowerLimit() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>stevedb.charging_schedule_period.number_phases</code>.
     */
    public ChargingSchedulePeriodRecord setNumberPhases(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.charging_schedule_period.number_phases</code>.
     */
    public Integer getNumberPhases() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Integer, BigDecimal, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, Integer, BigDecimal, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ChargingSchedulePeriod.CHARGING_SCHEDULE_PERIOD.CHARGING_PROFILE_PK;
    }

    @Override
    public Field<Integer> field2() {
        return ChargingSchedulePeriod.CHARGING_SCHEDULE_PERIOD.START_PERIOD_IN_SECONDS;
    }

    @Override
    public Field<BigDecimal> field3() {
        return ChargingSchedulePeriod.CHARGING_SCHEDULE_PERIOD.POWER_LIMIT;
    }

    @Override
    public Field<Integer> field4() {
        return ChargingSchedulePeriod.CHARGING_SCHEDULE_PERIOD.NUMBER_PHASES;
    }

    @Override
    public Integer component1() {
        return getChargingProfilePk();
    }

    @Override
    public Integer component2() {
        return getStartPeriodInSeconds();
    }

    @Override
    public BigDecimal component3() {
        return getPowerLimit();
    }

    @Override
    public Integer component4() {
        return getNumberPhases();
    }

    @Override
    public Integer value1() {
        return getChargingProfilePk();
    }

    @Override
    public Integer value2() {
        return getStartPeriodInSeconds();
    }

    @Override
    public BigDecimal value3() {
        return getPowerLimit();
    }

    @Override
    public Integer value4() {
        return getNumberPhases();
    }

    @Override
    public ChargingSchedulePeriodRecord value1(Integer value) {
        setChargingProfilePk(value);
        return this;
    }

    @Override
    public ChargingSchedulePeriodRecord value2(Integer value) {
        setStartPeriodInSeconds(value);
        return this;
    }

    @Override
    public ChargingSchedulePeriodRecord value3(BigDecimal value) {
        setPowerLimit(value);
        return this;
    }

    @Override
    public ChargingSchedulePeriodRecord value4(Integer value) {
        setNumberPhases(value);
        return this;
    }

    @Override
    public ChargingSchedulePeriodRecord values(Integer value1, Integer value2, BigDecimal value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ChargingSchedulePeriodRecord
     */
    public ChargingSchedulePeriodRecord() {
        super(ChargingSchedulePeriod.CHARGING_SCHEDULE_PERIOD);
    }

    /**
     * Create a detached, initialised ChargingSchedulePeriodRecord
     */
    public ChargingSchedulePeriodRecord(Integer chargingProfilePk, Integer startPeriodInSeconds, BigDecimal powerLimit, Integer numberPhases) {
        super(ChargingSchedulePeriod.CHARGING_SCHEDULE_PERIOD);

        setChargingProfilePk(chargingProfilePk);
        setStartPeriodInSeconds(startPeriodInSeconds);
        setPowerLimit(powerLimit);
        setNumberPhases(numberPhases);
    }
}
