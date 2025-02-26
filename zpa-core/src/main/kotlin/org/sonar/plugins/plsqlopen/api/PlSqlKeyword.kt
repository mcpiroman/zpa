/**
 * Z PL/SQL Analyzer
 * Copyright (C) 2015-2022 Felipe Zorzo
 * mailto:felipe AT felipezorzo DOT com DOT br
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.plugins.plsqlopen.api

import com.felipebz.flr.api.AstNode
import com.felipebz.flr.api.TokenType

enum class PlSqlKeyword(override val value: String, val isReserved: Boolean = false) : TokenType {
    ALL("all", true),
    ALTER("alter", true),
    AND("and", true),
    ANY("any", true),
    AS("as", true),
    ASC("asc", true),
    BEGIN("begin", true),
    BETWEEN("between", true),
    BY("by", true),
    CHAR("char", true),
    CHECK("check", true),
    CLUSTER("cluster", true),
    COMPRESS("compress", true),
    CONNECT("connect", true),
    CREATE("create", true),
    DECIMAL("decimal", true),
    DECLARE("declare", true),
    DEFAULT("default", true),
    DESC("desc", true),
    DISTINCT("distinct", true),
    DROP("drop", true),
    ELSE("else", true),
    END("end", true),
    EXCEPT("except", true),
    EXCLUSIVE("exclusive", true),
    FETCH("fetch", true),
    FLOAT("float", true),
    FOR("for", true),
    FROM("from", true),
    GRANT("grant", true),
    GROUP("group", true),
    HAVING("having", true),
    IDENTIFIED("identified", true),
    IN("in", true),
    INDEX("index", true),
    INSERT("insert", true),
    INTEGER("integer", true),
    INTERSECT("intersect", true),
    INTO("into", true),
    IS("is", true),
    LIKE("like", true),
    LOCK("lock", true),
    LONG("long", true),
    MINUS_KEYWORD("minus", true),
    NOCOMPRESS("nocompress", true),
    NOT("not", true),
    NOWAIT("nowait", true),
    NULL("null", true),
    OF("of", true),
    ON("on", true),
    OPTION("option", true),
    OR("or", true),
    ORDER("order", true),
    OUT("out", true),
    PCTFREE("pctfree", true),
    PRIOR("prior", true),
    PROCEDURE("procedure", true),
    PUBLIC("public", true),
    RAW("raw", true),
    RESOURCE("resource", true),
    REVOKE("revoke", true),
    SELECT("select", true),
    SET("set", true),
    SHARE("share", true),
    SIZE("size", true),
    SMALLINT("smallint", true),
    START("start", true),
    SYNONYM("synonym", true),
    TABLE("table", true),
    THEN("then", true),
    TO("to", true),
    TRIGGER("trigger", true),
    UNION("union", true),
    UNIQUE("unique", true),
    UPDATE("update", true),
    VALUES("values", true),
    VIEW("view", true),
    WHEN("when", true),
    WHERE("where", true),
    WITH("with", true),
    A("a"),
    ACCESSIBLE("accessible"),
    ADD("add"),
    ADMIN("admin"),
    AFTER("after"),
    AGENT("agent"),
    AGGREGATE("aggregate"),
    ANALYZE("analyze"),
    ANY_CS("any_cs"),
    ARRAY("array"),
    ARROW("arrow"),
    ASSOCIATE("associate"),
    AT("at"),
    AUDIT("audit"),
    AUTHID("authid"),
    AUTONOMOUS_TRANSACTION("autonomous_transaction"),
    BATCH("batch"),
    BEFORE("before"),
    BFILE("bfile"),
    BINARY_DOUBLE("binary_double"),
    BINARY_FLOAT("binary_float"),
    BINARY_INTEGER("binary_integer"),
    BLOB("blob"),
    BODY("body"),
    BOOLEAN("boolean"),
    BOTH("both"),
    BUFFER_POOL("buffer_pool"),
    BULK("bulk"),
    BULK_ROWCOUNT("bulk_rowcount"),
    BYTE("byte"),
    CACHE("cache"),
    CASCADE("cascade"),
    CASE("case"),
    CAST("cast"),
    CHARACTER("character"),
    CHARSET("charset"),
    CHARSETFORM("charsetform"),
    CHARSETID("charsetid"),
    CHUNK("chunk"),
    CLOB("clob"),
    CLONE("clone"),
    CLOSE("close"),
    CLUSTERS("clusters"),
    COLAUTH("colauth"),
    COLLATION("collation"),
    COLLECT("collect"),
    COLUMN("column"),
    COLUMNS("columns"),
    COMMENT("comment"),
    COMMIT("commit"),
    COMMITTED("committed"),
    COMPILE("compile"),
    COMPLETE("complete"),
    COMPOUND("compound"),
    CONNECT_BY_ROOT("connect_by_root"),
    CONSTANT("constant"),
    CONSTRAINT("constraint"),
    CONSTRUCTOR("constructor"),
    CONTAINER("container"),
    CONTENT("content"),
    CONTEXT("context"),
    CONTINUE("continue"),
    COUNT("count"),
    CRASH("crash"),
    CROSS("cross"),
    CROSSEDITION("crossedition"),
    CURRENT("current"),
    CURRENT_USER("current_user"),
    CURRVAL("currval"),
    CURSOR("cursor"),
    CYCLE("cycle"),
    DATABASE("database"),
    DATE("date"),
    DAY("day"),
    DB_ROLE_CHANGE("db_role_change"),
    DDL("ddl"),
    DEBUG("debug"),
    DEC("dec"),
    DEFAULTS("defaults"),
    DEFINER("definer"),
    DELEGATE("delegate"),
    DELETE("delete"),
    DENSE_RANK("dense_rank"),
    DEPRECATE("deprecate"),
    DETERMINISTIC("deterministic"),
    DISABLE("disable"),
    DISASSOCIATE("disassociate"),
    DOCUMENT("document"),
    DOUBLE("double"),
    DURATION("duration"),
    EACH("each"),
    EDITIONABLE("editionable"),
    ELEMENT("element"),
    ELSIF("elsif"),
    EMPTY("empty"),
    ENABLE("enable"),
    ENCODING("encoding"),
    ENCRYPT("encrypt"),
    ENTITYESCAPING("entityescaping"),
    ERROR("error"),
    ERRORS("errors"),
    ESCAPE("escape"),
    EVALNAME("evalname"),
    EXCEPTION("exception"),
    EXCEPTION_INIT("exception_init"),
    EXCEPTIONS("exceptions"),
    EXECUTE("execute"),
    EXISTS("exists"),
    EXIT("exit"),
    EXTEND("extend"),
    EXTERNAL("external"),
    EXTRACT("extract"),
    FALSE("false"),
    FINAL("final"),
    FIRST("first"),
    FOLLOWING("following"),
    FOLLOWS("follows"),
    FORALL("forall"),
    FORCE("force"),
    FOREIGN("foreign"),
    FORM("form"),
    FORWARD("forward"),
    FOUND("found"),
    FREELIST("freelist"),
    FREELISTS("freelists"),
    FREEPOOLS("freepools"),
    FULL("full"),
    FUNCTION("function"),
    GLOBAL("global"),
    GOTO("goto"),
    GROUPS("groups"),
    HASH("hash"),
    HIDE("hide"),
    HIERARCHY("hierarchy"),
    HOUR("hour"),
    IF("if"),
    IMMEDIATE("immediate"),
    INCREMENT("increment"),
    INDENT("indent"),
    INDEXES("indexes"),
    INDEXTYPE("indextype"),
    INDICATOR("indicator"),
    INDICES("indices"),
    INITIAL("initial"),
    INITRANS("initrans"),
    INLINE("inline"),
    INNER("inner"),
    INSTANTIABLE("instantiable"),
    INSTEAD("instead"),
    INT("int"),
    INTERFACE("interface"),
    INTERVAL("interval"),
    ISOLATION("isolation"),
    ISOPEN("isopen"),
    JAVA("java"),
    JOIN("join"),
    KEEP("keep"),
    KEY("key"),
    LANGUAGE("language"),
    LAST("last"),
    LEADING("leading"),
    LEFT("left"),
    LENGTH("length"),
    LESS("less"),
    LEVEL("level"),
    LEVELS("levels"),
    LIBRARY("library"),
    LIMIT("limit"),
    LIST("list"),
    LISTAGG("listagg"),
    LOB("lob"),
    LOCAL("local"),
    LOCKED("locked"),
    LOG("log"),
    LOGGING("logging"),
    LOGOFF("logoff"),
    LOGON("logon"),
    LOOP("loop"),
    MAP("map"),
    MAPPING("mapping"),
    MATCHED("matched"),
    MATERIALIZED("materialized"),
    MAXEXTENTS("maxextents"),
    MAXLEN("maxlen"),
    MAXVALUE("maxvalue"),
    MEMBER("member"),
    MERGE("merge"),
    METADATA("metadata"),
    MINEXTENTS("minextents"),
    MINING("mining"),
    MINUTE("minute"),
    MINVALUE("minvalue"),
    MOD_KEYWORD("mod"),
    MODE("mode"),
    MODEL("model"),
    MONTH("month"),
    MORE("more"),
    MULTISET("multiset"),
    NAME("name"),
    NATURAL("natural"),
    NATURALN("naturaln"),
    NCHAR("nchar"),
    NCLOB("nclob"),
    NESTED("nested"),
    NEW("new"),
    NEXT("next"),
    NEXTVAL("nextval"),
    NO("no"),
    NOAUDIT("noaudit"),
    NOCACHE("nocache"),
    NOCOPY("nocopy"),
    NOCYCLE("nocycle"),
    NOENTITYESCAPING("noentityescaping"),
    NOLOGGING("nologging"),
    NOMAPPING("nomapping"),
    NONE("none"),
    NONEDITIONABLE("noneditionable"),
    NOORDER("noorder"),
    NOSCHEMACHECK("noschemacheck"),
    NOTFOUND("notfound"),
    NOW("now"),
    NULLS("nulls"),
    NUMBER("number"),
    NUMERIC("numeric"),
    NVARCHAR2("nvarchar2"),
    OBJECT("object"),
    OFFSET("offset"),
    OLD("old"),
    ONLY("only"),
    OPEN("open"),
    OPERATOR("operator"),
    OPTIMAL("optimal"),
    ORDINALITY("ordinality"),
    OTHERS("others"),
    OUTER("outer"),
    OVER("over"),
    OVERFLOW("overflow"),
    OVERLAPS("overlaps"),
    OVERRIDING("overriding"),
    PACKAGE("package"),
    PARALLEL_ENABLE("parallel_enable"),
    PARAMETERS("parameters"),
    PARENT("parent"),
    PARTITION("partition"),
    PARTITIONS("partitions"),
    PASSING("passing"),
    PATH("path"),
    PCTINCREASE("pctincrease"),
    PCTUSED("pctused"),
    PCTVERSION("pctversion"),
    PERCENT("percent"),
    PIPE("pipe"),
    PIPELINED("pipelined"),
    PLS_INTEGER("pls_integer"),
    PLUGGABLE("pluggable"),
    POSITIVE("positive"),
    POSITIVEN("positiven"),
    PRAGMA("pragma"),
    PRECEDES("precedes"),
    PRECEDING("preceding"),
    PRECISION("precision"),
    PRESERVE("preserve"),
    PRIMARY("primary"),
    RAISE("raise"),
    RANGE_KEYWORD("range"),
    READ("read"),
    READS("reads"),
    REAL("real"),
    RECORD("record"),
    RECYCLE("recycle"),
    REF("ref"),
    REFERENCE("reference"),
    REFERENCES("references"),
    REFERENCING("referencing"),
    REFRESH("refresh"),
    REJECT("reject"),
    RELIES_ON("relies_on"),
    RENAME("rename"),
    REPLACE("replace"),
    RESTRICT_REFERENCES("restrict_references"),
    RESULT("result"),
    RESULT_CACHE("result_cache"),
    RETENTION("retention"),
    RETURN("return"),
    RETURNING("returning"),
    REUSE("reuse"),
    REVERSE("reverse"),
    RIGHT("right"),
    ROLE("role"),
    ROLLBACK("rollback"),
    ROW("row"),
    ROWCOUNT("rowcount"),
    ROWID("rowid"),
    ROWNUM("rownum"),
    ROWS("rows"),
    ROWTYPE("rowtype"),
    SAVE("save"),
    SAVEPOINT("savepoint"),
    SCHEMA("schema"),
    SCHEMACHECK("schemacheck"),
    SECOND("second"),
    SEGMENT("segment"),
    SELF("self"),
    SEQUENCE("sequence"),
    SERIALIZABLE("serializable"),
    SERIALLY_REUSABLE("serially_reusable"),
    SERVERERROR("servererror"),
    SESSION("session"),
    SETTINGS("settings"),
    SHARING("sharing"),
    SHOW("show"),
    SHUTDOWN("shutdown"),
    SIBLINGS("siblings"),
    SIGNTYPE("signtype"),
    SKIP("skip"),
    SOME("some"),
    SORT("sort"),
    SPECIFICATION("specification"),
    SQL("sql"),
    SQLERRM("sqlerrm"),
    STANDALONE("standalone"),
    STARTUP("startup"),
    STATEMENT_KEYWORD("statement"),
    STATIC("static"),
    STATISTICS("statistics"),
    STORAGE("storage"),
    STORE("store"),
    STRING("string"),
    STRUCT("struct"),
    SUBMULTISET("submultiset"),
    SUBPARTITION("subpartition"),
    SUBPARTITIONS("subpartitions"),
    SUBSTITUTABLE("substitutable"),
    SUBTYPE("subtype"),
    SUSPEND("suspend"),
    SYSDATE("sysdate"),
    TABAUTH("tabauth"),
    TABLESPACE("tablespace"),
    TDO("tdo"),
    TEMPLATE("template"),
    TEMPORARY("temporary"),
    THAN("than"),
    THE("the"),
    TIES("ties"),
    TIME("time"),
    TIMESTAMP("timestamp"),
    TRAILING("trailing"),
    TRANSACTION("transaction"),
    TREAT("treat"),
    TRIM("trim"),
    TRUE("true"),
    TRUNCATE("truncate"),
    TYPE("type"),
    UDF("udf"),
    UNBOUNDED("unbounded"),
    UNDER("under"),
    UNLIMITED("unlimited"),
    UNPLUG("unplug"),
    UROWID("urowid"),
    USE("use"),
    USING("using"),
    USING_NLS_COMP("using_nls_comp"),
    VALUE("value"),
    VARCHAR("varchar"),
    VARCHAR2("varchar2"),
    VARRAY("varray"),
    VARYING("varying"),
    VERSION("version"),
    VIEWS("views"),
    WAIT("wait"),
    WELLFORMED("wellformed"),
    WHILE("while"),
    WITHIN("within"),
    WITHOUT("without"),
    WORK("work"),
    WRITE("write"),
    XMLAGG("xmlagg"),
    XMLATTRIBUTES("xmlattributes"),
    XMLCAST("xmlcast"),
    XMLCOLATTVAL("xmlcolattval"),
    XMLELEMENT("xmlelement"),
    XMLEXISTS("xmlexists"),
    XMLFOREST("xmlforest"),
    XMLNAMESPACES("xmlnamespaces"),
    XMLPARSE("xmlparse"),
    XMLPI("xmlpi"),
    XMLQUERY("xmlquery"),
    XMLROOT("xmlroot"),
    XMLSERIALIZE("xmlserialize"),
    XMLTABLE("xmltable"),
    XMLTYPE("xmltype"),
    YEAR("year"),
    YES("yes"),
    ZONE("zone");

    override fun hasToBeSkippedFromAst(node: AstNode?) = false

    companion object {
        fun keywordValues(): Array<String> =
            values().map { it.value }.toTypedArray()

        val nonReservedKeywords: List<PlSqlKeyword> =
            values().filter { !it.isReserved }
    }
}
