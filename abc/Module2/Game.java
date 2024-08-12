
public class Game {
	    public static void main(String[] args) {
	        GameState gameState = GameState.getInstance();

	        AbstractFactory factory;
	        EnemyFactory enemyFactory;

	        switch (gameState.getDifficulty()) {
	            case "Easy":
	                factory = new EasyFactory();
	                enemyFactory = new EasyEnemyFactory();
	                break;
	            case "Medium":
	                factory = new MediumFactory();
	                enemyFactory = new MediumEnemyFactory();
	                break;
	            case "Hard":
	                factory = new HardFactory();
	                enemyFactory = new HardEnemyFactory();
	                break;
	            default:
	                throw new IllegalArgumentException("Unknown difficulty: " + gameState.getDifficulty());
	        }

	        // Create weapons, power-ups, and enemies
	        Weapon weapon = factory.createWeapon();
	        PowerUp powerUp = factory.createPowerUp();
	        Enemy enemy = enemyFactory.createEnemy();

	        // Use them in the game
	        weapon.use();
	        powerUp.activate();
	        enemy.attack();

	        // Move to the next level
	        gameState.nextLevel();
	        System.out.println("Moved to level " + gameState.getCurrentLevel());
	    }
	}


