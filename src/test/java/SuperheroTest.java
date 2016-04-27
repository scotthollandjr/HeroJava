import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class SuperheroTest {

  @Test
  public void SuperheroInstantiatesCorrectly_true() {
    Superhero batman = new Superhero();
    assertEquals(true, batman instanceof Superhero);
  }



}
