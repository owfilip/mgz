/*
 * This file is generated by jOOQ.
*/
package com.project.mgz.models.db.tables.records;


import com.project.mgz.models.db.tables.Resources;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ResourcesRecord extends UpdatableRecordImpl<ResourcesRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = 926069403;

    /**
     * Setter for <code>public.resources.id</code>.
     */
    public ResourcesRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.resources.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.resources.name</code>.
     */
    public ResourcesRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.resources.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.resources.owner</code>.
     */
    public ResourcesRecord setOwner(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.resources.owner</code>.
     */
    public String getOwner() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Resources.RESOURCES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Resources.RESOURCES.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Resources.RESOURCES.OWNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getOwner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcesRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcesRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcesRecord value3(String value) {
        setOwner(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcesRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ResourcesRecord
     */
    public ResourcesRecord() {
        super(Resources.RESOURCES);
    }

    /**
     * Create a detached, initialised ResourcesRecord
     */
    public ResourcesRecord(String id, String name, String owner) {
        super(Resources.RESOURCES);

        set(0, id);
        set(1, name);
        set(2, owner);
    }
}