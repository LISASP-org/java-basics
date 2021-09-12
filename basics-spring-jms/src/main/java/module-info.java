module org.lisasp.basics.spring.jms {
    exports org.lisasp.basics.spring.jms;

    requires org.slf4j;
    requires spring.jms;
    requires annotations;
    requires com.fasterxml.jackson.databind;
    requires jakarta.jms.api;

    requires static lombok;
}
