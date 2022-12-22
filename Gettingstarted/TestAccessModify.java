package Gettingstarted;

class TestAccessModify {
	public void methodPublic(){
		methodPrivate();
	}
	
	protected void methodProtected(){
		methodPrivate();
	}
	
	void methodDefault(){
		methodPrivate();
	}
	
	private void methodPrivate(){}
}
