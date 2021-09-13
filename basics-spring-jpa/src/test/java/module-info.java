module org.lisasp.basics.test.jpa {
    requires org.lisasp.basics.spring.jpa;

    opens org.lisasp.basics.test.spring.jpa to spring.core, org.hibernate.orm.core;

    requires spring.data.jpa;
    requires spring.beans;
    requires spring.context;
    requires spring.boot.autoconfigure;
    requires spring.boot;

    requires spring.test;

    requires org.mockito;
    requires net.bytebuddy;
    requires net.bytebuddy.agent;

    requires transitive org.junit.jupiter.api;
    requires transitive org.junit.jupiter.engine;
    requires transitive org.junit.jupiter.params;

    requires static lombok;
}
