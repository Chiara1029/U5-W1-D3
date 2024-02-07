package it.chiarapuleio.exdayone.exercise;

import it.chiarapuleio.exdayone.exercise.entities.Order;
import it.chiarapuleio.exdayone.exercise.entities.Table;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ExerciseApplicationTests {
    final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ExerciseApplication.class);

    @BeforeAll
    static void beforeAll() {
        System.out.println("Start tests.");
    }

    @Test
    void contextLoads() {
    }

    @Test
    public void testIsTheSameTable() {
        Table table1 = (Table) ctx.getBean("table13");
        Order table2 = (Order) ctx.getBean("orderTest");
        assertEquals(table1, table2.getTable());
    }

    @Test
    public void customerTableLimit(){
        Table customersLimit = (Table) ctx.getBean("table13");
        Order effectiveCustomers = (Order) ctx.getBean("orderTest");
        assertThat(customersLimit.getTableSeatsMax(), greaterThanOrEqualTo(effectiveCustomers.getTotalCostumers()));
    }

    @AfterAll
    static void afterAll() {
        System.out.println("End tests.");
    }
}
