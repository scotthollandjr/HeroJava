import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class HeroTest {

  @Test public void HeroInstantiatesCorrectly_true() {
    Hero squad1 = new Hero("Batman", 40, "knight");
    assertEquals(true, squad1 instanceof Hero);
  }

  @Test public void superheroAddsName_String() {
    Hero squad1 = new Hero("Batman", 40, "knight");
    assertEquals("Batman", squad1.getName());
  }

  @Test public void superHeroAddsAge_int() {
    Hero squad1 = new Hero("Robin", 16, "priest");
    assertEquals(16, squad1.getAge());
  }

  @Test public void superheroAssignsRole_String() {
    Hero squad1 = new Hero("Quailman", 13, "soldier");
    assertEquals("soldier", squad1.getRole());
  }

  @Test public void superheroAccessStats_Integer() {
    Hero squad1 = new Hero("Quailman", 13, "soldier");
    assertEquals((double)8, squad1.getStat("health"), 0.1);
    assertEquals((double)8, squad1.getStat("attack"), 0.1);
    assertEquals((double)5, squad1.getStat("defense"), 0.1);
  }

  @Test public void superheroAttackGenerator_double() {
    Hero squad1 = new Hero("Robin", 16, "soldier");
    assertEquals((double)10, squad1.attack(), 0.1);
  }
}
