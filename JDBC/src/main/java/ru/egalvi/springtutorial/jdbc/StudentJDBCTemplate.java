package ru.egalvi.springtutorial.jdbc;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    public void create(String name, Integer age) {
        String SQL = "insert into STUDENT (name, age) values (?, ?)";
        jdbcTemplateObject.update( SQL, name, age);
        System.out.println("Created Record Name = " + name + " Age = " + age);
        return;
    }

    public Student getStudent(Integer id) {
        String SQL = "select * from STUDENT where id = ?";
        Student student = jdbcTemplateObject.queryForObject(SQL,
                new Object[]{id}, new StudentMapper());
        return student;
    }

    public List<Student> listStudents() {
        String SQL = "select * from STUDENT";
        List <Student> students = jdbcTemplateObject.query(SQL,
                new StudentMapper());
        return students;
    }

    public void delete(Integer id){
        String SQL = "delete from STUDENT where id = ?";
        jdbcTemplateObject.update(SQL, id);
        System.out.println("Deleted Record with ID = " + id );
        return;
    }

    public void update(Integer id, Integer age){
        String SQL = "update STUDENT set age = ? where id = ?";
        jdbcTemplateObject.update(SQL, age, id);
        System.out.println("Updated Record with ID = " + id );
        return;
    }

    public void init(){
        String SQL = "CREATE TABLE STUDENT(" +
                "ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
                "NAME VARCHAR(20) NOT NULL, " +
                "AGE INT NOT NULL);";
        jdbcTemplateObject.execute(SQL);
        jdbcTemplateObject.execute("insert into STUDENT (name, age) values ('sdfa', 12)");
        System.out.println("Table created");
    }
}