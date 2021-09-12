package org.lisasp.basics.test.spring.jpa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.lisasp.basics.spring.jpa.TimestampedEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity()
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TestTimestampedEntity extends TimestampedEntity {

    @Column(nullable = false)
    private String name;

    public TestTimestampedEntity(String id, String name) {
        super(id);
        setName(name);
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) {
            return false;
        }
        TestTimestampedEntity entity = (TestTimestampedEntity) o;
        if ((name == null) != (entity.getName() == null)) {
            return false;
        }
        return name == null || name.equals(entity.getName());
    }

    public void simulateSave() {
        beforeSave();
    }

    public String toString() {
        return String.format("TestEntity(%s, %d, %s, %s)",
                             getId(),
                             getVersion(),
                             getLastModification() == null ? "<null>" : getLastModification().toString(),
                             getName());
    }
}
