import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class SuperheroTest {

  @Test public void SuperheroInstantiatesCorrectly_true() {
    Superhero batman = new Superhero("Batman", 40);
    assertEquals(true, batman instanceof Superhero);
  }

  @Test public void superheroAddsName_String() {
    Superhero batman = new Superhero("Batman", 40);
    assertEquals("Batman", batman.getName());
  }

  @Test public void superHeroAddsAge_int() {
    Superhero drGradle = new Superhero("drGradle", 999);
    assertEquals(999, drGradle.getAge());
  }
}
