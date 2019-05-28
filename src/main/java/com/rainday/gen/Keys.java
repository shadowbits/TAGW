/*
 * This file is generated by jOOQ.
 */
package com.rainday.gen;


import com.rainday.gen.tables.Application;
import com.rainday.gen.tables.Parampair;
import com.rainday.gen.tables.Relay;
import com.rainday.gen.tables.records.ApplicationRecord;
import com.rainday.gen.tables.records.ParampairRecord;
import com.rainday.gen.tables.records.RelayRecord;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;

import javax.annotation.Generated;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code></code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<ApplicationRecord, Integer> IDENTITY_APPLICATION = Identities0.IDENTITY_APPLICATION;
    public static final Identity<ParampairRecord, Integer> IDENTITY_PARAMPAIR = Identities0.IDENTITY_PARAMPAIR;
    public static final Identity<RelayRecord, Integer> IDENTITY_RELAY = Identities0.IDENTITY_RELAY;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ApplicationRecord> KEY_APPLICATION_PRIMARY = UniqueKeys0.KEY_APPLICATION_PRIMARY;
    public static final UniqueKey<ParampairRecord> KEY_PARAMPAIR_PRIMARY = UniqueKeys0.KEY_PARAMPAIR_PRIMARY;
    public static final UniqueKey<RelayRecord> KEY_RELAY_PRIMARY = UniqueKeys0.KEY_RELAY_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<ApplicationRecord, Integer> IDENTITY_APPLICATION = Internal.createIdentity(Application.APPLICATION, Application.APPLICATION.ID);
        public static Identity<ParampairRecord, Integer> IDENTITY_PARAMPAIR = Internal.createIdentity(Parampair.PARAMPAIR, Parampair.PARAMPAIR.ID);
        public static Identity<RelayRecord, Integer> IDENTITY_RELAY = Internal.createIdentity(Relay.RELAY, Relay.RELAY.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<ApplicationRecord> KEY_APPLICATION_PRIMARY = Internal.createUniqueKey(Application.APPLICATION, "KEY_application_PRIMARY", Application.APPLICATION.ID);
        public static final UniqueKey<ParampairRecord> KEY_PARAMPAIR_PRIMARY = Internal.createUniqueKey(Parampair.PARAMPAIR, "KEY_parampair_PRIMARY", Parampair.PARAMPAIR.ID);
        public static final UniqueKey<RelayRecord> KEY_RELAY_PRIMARY = Internal.createUniqueKey(Relay.RELAY, "KEY_relay_PRIMARY", Relay.RELAY.ID);
    }
}
