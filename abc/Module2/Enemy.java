
public class Enemy {
	
	    public abstract void attack();
	}

	class EasyEnemy extends Enemy {
	    @Override
	    public void attack() {
	        System.out.println("Easy Enemy attacks weakly!");
	    }
	}

	class MediumEnemy extends Enemy {
	    @Override
	    public void attack() {
	        System.out.println("Medium Enemy attacks moderately!");
	    }
	}

	class HardEnemy extends Enemy {
	    @Override
	    public void attack() {
	        System.out.println("Hard Enemy attacks fiercely!");
	    }
	}

	abstract class EnemyFactory {
	    public abstract Enemy createEnemy();
	}

	class EasyEnemyFactory extends EnemyFactory {
	    @Override
	    public Enemy createEnemy() {
	        return new EasyEnemy();
	    }
	}

	class MediumEnemyFactory extends EnemyFactory {
	    @Override
	    public Enemy createEnemy() {
	        return new MediumEnemy();
	    }
	}

	class HardEnemyFactory extends EnemyFactory {
	    @Override
	    public Enemy createEnemy() {
	        return new HardEnemy();
	    }
	}



