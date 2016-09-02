
public class Borders { // pass width and height of frame to scale borders
						// positions
	private Border left = new Border(0, 0, 1, 400);
	private Border right = new Border(499, 0, 1, 400);
	private Border up = new Border(0, 0, 1, 500);
	private Border down = new Border(399, 0, 1, 500);

	public Border getRight() {
		return right;
	}

	public void setRight(Border right) {
		this.right = right;
	}

	public Border getLeft() {
		return left;
	}

	public void setLeft(Border left) {
		this.left = left;
	}

	public Border getUp() {
		return up;
	}

	public void setUp(Border up) {
		this.up = up;
	}

	public Border getDown() {
		return down;
	}

	public void setDown(Border down) {
		this.down = down;
	} // maybe it will be better to delete the ability to set borders manually.
		// It can cause problems within levelContainer where I generate bricks
		// and set new Borders()
}
