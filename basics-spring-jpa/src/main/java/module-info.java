module org.lisasp.basics.spring.jpa {
    exports org.lisasp.basics.spring.jpa;
    opens org.lisasp.basics.spring.jpa;

    requires java.persistence;

    requires spring.data.commons;

    requires static lombok;
}
