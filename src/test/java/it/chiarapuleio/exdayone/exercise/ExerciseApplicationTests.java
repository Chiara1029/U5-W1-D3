package it.chiarapuleio.exdayone.exercise;

import it.chiarapuleio.exdayone.exercise.entities.Order;
import it.chiarapuleio.exdayone.exercise.entities.Table;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ExerciseApplicationTests {
	final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ExerciseApplication.class);

	@Test
	void contextLoads() {
	}

	@Test
	public void testIsTheSameTable(){
		Table table1 = (Table) ctx.getBean("table13");
		Order table2 = (Order) ctx.getBean("orderTest");
		assertEquals(table1, table2.getTable());
	}



}
