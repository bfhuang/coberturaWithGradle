package person;

import org.junit.Test;
import person.Person;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static person.Person.FATTER;
import static person.Person.HEALTHY;
import static person.Person.THINNER;

public class PersonTest {

    private Person person;

    //    BMI means body mass index 标准体重=体重公斤数 / 身高米数的平方
    @Test
    public void should_return_fatter_if_BMI_is_greater_than_24() {
        person = new Person(55, 1.5);

        assertThat(person.getBMI(), is(FATTER));
    }

    @Test
    public void should_return_fatter_if_BMI_is_equal_24() {
        person = new Person(54, 1.5);

        assertThat(person.getBMI(), is(FATTER));
    }

    @Test
    public void should_return_fatter_if_BMI_is_between_18_and_24() {
        person = new Person(45, 1.5);

        assertThat(person.getBMI(), is(HEALTHY));
    }

    @Test
    public void should_return_fatter_if_BMI_is_less_than_18() {
        person = new Person(40, 1.5);

        assertThat(person.getBMI(), is(THINNER));
    }
}
