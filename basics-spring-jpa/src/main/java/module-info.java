module org.lisasp.basics.spring.jpa {
    exports org.lisasp.basics.spring.jpa;
    opens org.lisasp.basics.spring.jpa;

    requires jakarta.persistence;

    requires spring.data.commons;

    requires static lombok;
}
