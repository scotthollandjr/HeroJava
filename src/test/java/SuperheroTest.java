import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class SuperheroTest {

  @Test public void SuperheroInstantiatesCorrectly_true() {
    Superhero batman = new Superhero("Batman", 40, "knight");
    assertEquals(true, batman instanceof Superhero);
  }

  @Test public void superheroAddsName_String() {
    Superhero squad1 = new Superhero("Batman", 40, "knight");
    assertEquals("Batman", squad1.getName());
  }

  @Test public void superHeroAddsAge_int() {
    Superhero squad1 = new Superhero("Robin", 16, "priest");
    assertEquals(16, squad1.getAge());
  }

  @Test public void superheroAssignsRole_String() {
    Superhero squad1 = new Superhero("Quailman", 13, "soldier");
    assertEquals("soldier", squad1.getRole());
  }

  @Test public void superheroAccessStats_Integer() {
    Superhero squad1 = new Superhero("Quailman", 13, "soldier");
    assertEquals((Integer)8, squad1.getStat("health"));
    assertEquals((Integer)8, squad1.getStat("attack"));
    assertEquals((Integer)5, squad1.getStat("defense"));
  }

}
