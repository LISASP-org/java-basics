module org.lisasp.basics.test.jre {
    requires org.lisasp.basics.jre;

    opens org.lisasp.basics.test.jre.date;
    opens org.lisasp.basics.test.jre.io;

    requires transitive org.junit.jupiter.engine;
    requires transitive org.junit.jupiter.api;
}
