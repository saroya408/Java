package pong;

class PongGame {

	public static void main(String[] args) {
		Zen.create(500, 500);
		Zen.setColor(255, 255, 255);
		Zen.fillRect(0, 0, 500, 500);
		Zen.setColor(0, 0, 0);
		Zen.drawLine(250, 0, 250, 500);
		Ball b = new Ball();
		Paddle p1 = new Paddle();
		Paddle p2 = new Paddle();
		p1.x = 10;
		p2.x = 490;
		p2.upkey = 'k';
		p2.downkey = 'j';

		int p1score = 0;
		int p2score = 0;

		while (true) {
			drawBackground();
			Zen.setColor(255, 255, 255);
			Zen.setFont("Times New Roman-75");
			Zen.drawText(p1score + "vs" + p2score, 10, 100);
			b.draw();
			p1.draw();
			b.move();
			p1.move();
			p2.draw();
			p2.move();

			if (b.x <= 10) {
				p2score = p2score + 1;
				b.x = 250;
				b.y = 250;

			}

			if (b.x >= 490) {
				p1score = p1score + 1;
				b.x = 250;
				b.y = 250;

			}

			if (Math.abs(p1.x - b.x) <= 15 && Math.abs(p1.y - b.y) <= 50) {
				b.dx = -1 * b.dx;

			}

			if (Math.abs(p2.x - b.x) <= 15 && Math.abs(p2.y - b.y) <= 50) {
				b.dx = -1 * b.dx;
			}

			Zen.flipBuffer();
			Zen.sleep(10);

		}

	}

	public static void drawBackground() {
		Zen.setColor(0, 0, 0);
		Zen.fillRect(0, 0, 500, 500);

	}
}
