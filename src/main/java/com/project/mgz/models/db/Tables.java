/*
 * This file is generated by jOOQ.
*/
package com.project.mgz.models.db;


import com.project.mgz.models.db.tables.Resources;
import com.project.mgz.models.db.tables.SchemaVersion;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.resources</code>.
     */
    public static final Resources RESOURCES = com.project.mgz.models.db.tables.Resources.RESOURCES;

    /**
     * The table <code>public.schema_version</code>.
     */
    public static final SchemaVersion SCHEMA_VERSION = com.project.mgz.models.db.tables.SchemaVersion.SCHEMA_VERSION;
}
