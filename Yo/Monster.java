public class Monster {
	int health;

	public Monster() {
		health = 500;
	}

	public boolean isAlive() {
		if (health <= 0) {
			return false;
		}
		return true;
	}

	public int attack(Protagonist p) {
		int dmg = (int)(Math.random() * 100 * p.mult);
		p.health -= dmg;
		return dmg;
	}
}
