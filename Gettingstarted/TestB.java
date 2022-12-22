package Gettingstarted;

public class TestB {
	public static void main(String args[]) {
		new TestAccessModify().methodPublic();
		new TestAccessModify().methodProtected();
		new TestAccessModify().methodDefault();

	}

	public void methodPublic() {

	}

	protected void methodProtected() {

	}

	void methodDefault() {

	}

	private void methodPrivate() {
	}
}
