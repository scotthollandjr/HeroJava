import java.util.ArrayList;
import java.util.HashMap;

public class Superhero {
  private String mName;
  private int mAge;
  private String mRole;
  private HashMap<String, Integer> mStats = new HashMap<String, Integer>();


  public Superhero(String name, int age, String role) {
    mName = name;
    mAge = age;
    mRole = role;
    this.setRole(role);
  }

  public String getName() {
    return mName;
  }

  public int getAge() {
    return mAge;
  }

  public String getRole() {
    return mRole;
  }

  public Integer getStat(String stat) {
    return mStats.get(stat);
  }

  public void setRole(String role) {
    if (role == "priest") {
      mStats.put("health", 10);
      mStats.put("attack", 0);
      mStats.put("defense", 2);

    } else if (role == "knight") {
      mStats.put("health", 8);
      mStats.put("attack", 5);
      mStats.put("defense", 10);
    } else { //(role = "soldier")
      mStats.put("health", 8);
      mStats.put("attack", 8);
      mStats.put("defense", 5);
    }
  }
}
