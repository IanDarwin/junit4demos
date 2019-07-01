package suites;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;

import org.junit.BeforeClass;
import org.junit.Test;

import com.darwinsys.sql.ConnectionUtil;

public class ClassSetup {

	private static Connection connection;

	@BeforeClass
	public static void getConnection() {
		connection = ConnectionUtil.getConnection("inmemorytestdb");
		assertNotNull(connection);
	}

	@Test
	public void testTablesExist() {
		// use Connection with Spring Template
		// "select count(*) from table1 where id = -1"
		// should return 0 for non-existend primary key
		// will throw Spring DataException if table invalid
	}

	@Test
	public void testTableHasData() {
		// use Connection with Spring template
		// "select count(id) from table1 where id = 1"
		// should return 1 for known primary key
	}
}
