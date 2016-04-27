import java.util.ArrayList;

public class Squad {

ArrayList<Hero> mHeroes = new ArrayList<Hero>();

  public Squad(Hero... heroes) {
    for(Hero hero : heroes) {
      mHeroes.add(hero);
    }
  }
}
