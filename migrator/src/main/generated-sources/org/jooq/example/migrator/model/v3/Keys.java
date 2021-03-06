/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.migrator.model.v3;


import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.UniqueKey;
import org.jooq.example.migrator.model.v3.tables.Author;
import org.jooq.example.migrator.model.v3.tables.Book;
import org.jooq.example.migrator.model.v3.tables.SchemaVersion;
import org.jooq.example.migrator.model.v3.tables.records.AuthorRecord;
import org.jooq.example.migrator.model.v3.tables.records.BookRecord;
import org.jooq.example.migrator.model.v3.tables.records.SchemaVersionRecord;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>FLYWAY_TEST</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2",
        "schema version:FLYWAY_TEST_3"
    },
    date = "2017-04-24T22:18:07.033Z",
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AuthorRecord> PK_T_AUTHOR = UniqueKeys0.PK_T_AUTHOR;
    public static final UniqueKey<BookRecord> PK_T_BOOK = UniqueKeys0.PK_T_BOOK;
    public static final UniqueKey<SchemaVersionRecord> SCHEMA_VERSION_PK = UniqueKeys0.SCHEMA_VERSION_PK;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<BookRecord, AuthorRecord> FK_T_BOOK_AUTHOR_ID = ForeignKeys0.FK_T_BOOK_AUTHOR_ID;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<AuthorRecord> PK_T_AUTHOR = createUniqueKey(Author.AUTHOR, "PK_T_AUTHOR", Author.AUTHOR.ID);
        public static final UniqueKey<BookRecord> PK_T_BOOK = createUniqueKey(Book.BOOK, "PK_T_BOOK", Book.BOOK.ID);
        public static final UniqueKey<SchemaVersionRecord> SCHEMA_VERSION_PK = createUniqueKey(SchemaVersion.SCHEMA_VERSION, "schema_version_pk", SchemaVersion.SCHEMA_VERSION.INSTALLED_RANK);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<BookRecord, AuthorRecord> FK_T_BOOK_AUTHOR_ID = createForeignKey(org.jooq.example.migrator.model.v3.Keys.PK_T_AUTHOR, Book.BOOK, "FK_T_BOOK_AUTHOR_ID", Book.BOOK.AUTHOR_ID);
    }
}
