import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PersonTest {
private final int age;
private final boolean expected;

public PersonTest (int age, boolean expected) {
    this.age=age;
    this.expected=expected;
}
@Parameterized.Parameters
public static Object[][] getTestData(){
    return new Object[][] {
            {9,false},
            {17,false},
            {18,true},
            {19,true},
            {21,true},

    };
}

    @Test
    public void checkIsAdultWhenAgeThenResult() {
    Person person=new Person();
    assertEquals(expected,person.checkIsAdult(age));
    }
}