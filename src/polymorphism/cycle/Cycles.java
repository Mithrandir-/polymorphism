package polymorphism.cycle;
import static net.mindview.util.Print.*;

class Cycle {
	void play() {
		print("Cycle");
	}
}

class Unicycle extends Cycle {
	void play() {
		print("Unicycle");
	}
}

class Bicycle extends Cycle{
	void play() {
		print("Bicycle");
	}
}

public class Cycles {
	public static void ride(Cycle c) {
		c.play();
	}
	public static void main(String[] args) {
		Cycle c=new Cycle();
		Cycle u=new Unicycle();
		Cycle b=new Bicycle();
		ride(c);
		ride(u);
		ride(b);
	}
}
