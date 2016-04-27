import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class SquadTest {

@Test public void SquadInstantiatesCorrectly_true() {
    Hero squad1 = new Hero("Batman", 40, "knight");
    Hero squad2 = new Hero("Robin", 16, "priest");
    Hero squad3 = new Hero("Quailman", 13, "soldier");
    Squad superSquad = new Squad(squad1, squad2, squad3);
    assertEquals(true, superSquad instanceof Squad);
  }

}
