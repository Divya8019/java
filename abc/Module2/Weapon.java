
public class Weapon {
	    public abstract void use();
	}

	abstract class PowerUp {
	    public abstract void activate();
	}

	class EasyWeapon extends Weapon {
	    @Override
	    public void use() {
	        System.out.println("Using an easy weapon!");
	    }
	}

	class EasyPowerUp extends PowerUp {
	    @Override
	    public void activate() {
	        System.out.println("Activating an easy power-up!");
	    }
	}

	class MediumWeapon extends Weapon {
	    @Override
	    public void use() {
	        System.out.println("Using a medium weapon!");
	    }
	}

	class MediumPowerUp extends PowerUp {
	    @Override
	    public void activate() {
	        System.out.println("Activating a medium power-up!");
	    }
	}

	class HardWeapon extends Weapon {
	    @Override
	    public void use() {
	        System.out.println("Using a hard weapon!");
	    }
	}

	class HardPowerUp extends PowerUp {
	    @Override
	    public void activate() {
	        System.out.println("Activating a hard power-up!");
	    }
	}

	abstract class AbstractFactory {
	    public abstract Weapon createWeapon();
	    public abstract PowerUp createPowerUp();
	}

	class EasyFactory extends AbstractFactory {
	    @Override
	    public Weapon createWeapon() {
	        return new EasyWeapon();
	    }

	    @Override
	    public PowerUp createPowerUp() {
	        return new EasyPowerUp();
	    }
	}

	class MediumFactory extends AbstractFactory {
	    @Override
	    public Weapon createWeapon() {
	        return new MediumWeapon();
	    }

	    @Override
	    public PowerUp createPowerUp() {
	        return new MediumPowerUp();
	    }
	}

	class HardFactory extends AbstractFactory {
	    @Override
	    public Weapon createWeapon() {
	        return new HardWeapon();
	    }

	    @Override
	    public PowerUp createPowerUp() {
	        return new HardPowerUp();
	    }
	}



