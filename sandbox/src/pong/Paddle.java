package pong;

public class Paddle {

	int x;
	int y;
	
	char upkey = 's';
	char downkey = 'a';

	public void move() {
		if (Zen.isKeyPressed(upkey)) {
			y = y + 5;
		}
			if (Zen.isKeyPressed(downkey)){
				y = y - 5;
		}

	}

	public void draw() {
		Zen.setColor(65, 153, 255);
		Zen.fillRect(x- 10, y - 75, 20, 150);

	}

}
