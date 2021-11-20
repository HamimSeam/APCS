public class Protagonist {
	String name;
	int health = 500;
	int mult = 1;

	public Protagonist(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public boolean isAlive() {
		if (health <= 0) {
			return false;
		}
		return true;
	}

	public int attack(Monster m) {
		int dmg = (int)(Math.random()*100*mult);
		m.health -= dmg;
		return dmg;
	}

	public void specialize() {
		mult = 2;
	}

	public void normalize() {
		mult = 1;
	}
}
