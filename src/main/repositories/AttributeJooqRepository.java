package main.repositories;

import main.exceptions.ResourceNotFoundException;
import main.modules.Attribute;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.table;

@Repository
public class AttributeJooqRepository {
    private final DSLContext dsl;

    public AttributeJooqRepository(DSLContext dsl) {
        this.dsl = dsl;
    }

    public String findNameById(Long id) {
        Record attribute = dsl.select()
                .from(table("attribute"))
                .where(field("id").eq(id))
                .fetchOptional()
                .orElseThrow(() -> new ResourceNotFoundException("Resource not found with id " + id));
        //404 error return instead
        Object name = attribute.get("name");
        return (String) name;
    }
    public Attribute findById(Long id) {
        List<Attribute> records = dsl.select()
                .from(table("attribute"))
                .where(field("id").eq(id))
                .fetchInto(Attribute.class);
        if (records.isEmpty()) {
            throw new ResourceNotFoundException("Resource not found with id " + id);
        }
        //404 error return instead
        return records.get(0);
    }
}