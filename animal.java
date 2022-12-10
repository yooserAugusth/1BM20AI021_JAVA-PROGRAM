public abstract class Animal {
	protected int legs;

	protected Animal(int legs) {
		this.legs = legs;
	}

	public void walk() {
		System.out.println("This animal walk by " + legs + " legs.");
	}

	public abstract void eat();
}

class cat extends Animal implements pet {
	private String catName;

	public cat() {
		this("");
	}

	public cat(String name) {
		super(4);
		catName = name;
	}


	public void eat() {
		System.out.println("Cat eat fishes");
	}

	public String getName() {
		return catName;
	}

	public void setName(String name) {
		catName = name;
	}

	public void play() {
		throw new UnsupportedOperationException("Not supported yet.");
	}
}

class fish extends Animal implements pet {
	public fish() {
		super(0);
	}

	private String fishName;// Override

	public void eat() {
		System.out.println("Fish eat plants");
	}

	public String getName() {
		return fishName;
	}

	public void setName(String name) {
		fishName = name;
	}

	public void play() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	// @Overridepublic
	public void walk() {
		System.out.println("Fish has no legs.");
	}
}

class spider extends Animal {
	public spider() {
		super(8);
	}

	public void eat() {
		System.out.println("Spider eat insects");
	}
}

interface pet {
	public String getName();

	public void setName(String name);

	public void play();
}

class testAnimals {
	public static void main(String[] args) {
		fish d = new fish();
		cat c = new cat("Fluffy");
		Animal a = new fish();
		Animal e = new spider();
		pet p = new cat();
		d.setName("MyFish");
		d.eat();
		System.out.println("This fish's name is" + d.getName());
		d.walk();
		c.eat();
		System.out.println("This fish's name is" + c.getName());
		c.walk();
		((fish) a).setName("MyFish2");
		((fish) a).eat();
		System.out.println("This fish's name is" + ((fish) a).getName());
		((fish) a).walk();
		((spider) e).eat();
		((spider) e).walk();
		((cat) p).setName("MyCat");
		((cat) p).eat();
		System.out.println("This fish's name is" + ((cat) p).getName());
		((cat) p).walk();
	}
}
