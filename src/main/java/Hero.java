import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Hero {
  private String mName;
  private Hero mVillain;
  private int mAge;
  private String mRole;
  private Random randomGenerator = new Random();
  private HashMap<String, Double> mStats = new HashMap<String, Double>();


  public Hero(String name, int age, String role) {
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

  public double getStat(String stat) {
    return mStats.get(stat);
  }

  public void takeDamage(double damageTaken) {
    this.mStats.put("health", this.mStats.get("health") - damageTaken);
  }

  public double attack() {
    double damage;
    double attack = this.mStats.get("attack");
    int attackMod = randomGenerator.nextInt(21);
    if (attackMod == 0) {
      damage = 0;
    } else if ((attackMod) >= 1 && (attackMod <= 5)) {
      damage = attack * .5;
    } else if ((attackMod) >= 6 && (attackMod <= 14)) {
      damage = attack;
    } else if ((attackMod) >= 15 && (attackMod <= 19)) {
      damage = attack * 1.5;
    } else {
      damage = attack  * 3;
    } //mVillain.takeDamage(damage);
    return damage;
  }

  // public double villainAttack() {
  //   int squadMember = randomGenerator.nextInt(4);
  //   superSquad.get(squadMember).takeDamage(damage);
  //
  // }

  // randomize(21)
  // 0 no hit
  // 1-5 attack * .5
  // 6-14 attack
  // 15-19 attack * 1.5
  // 20 attack * 3

  public void setRole(String role) {
    if (role == "priest") {
      mStats.put("health", 10.0);
      mStats.put("attack", 0.0);
      mStats.put("defense", 2.0);

    } else if (role == "knight") {
      mStats.put("health", 8.0);
      mStats.put("attack", 5.0);
      mStats.put("defense", 10.0);
    } else if (role == "soldier") {
      mStats.put("health", 8.0);
      mStats.put("attack", 8.0);
      mStats.put("defense", 5.0);
    } else { // (role == "villain")
      mStats.put("health", 30.0);
      mStats.put("attack", 8.0);
      mStats.put("defense", 8.0);
    }
  }
}
