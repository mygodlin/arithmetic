package designMode.decorator;
/*
 * ����װ���߳����� 
 */
public class PeiCai implements GuoDi{
	private GuoDi guodi;
    public PeiCai(GuoDi guodi) {          
    	super();
        this.guodi = guodi;
    }
	@Override
	public float cost() {
		return guodi.cost();
	}
	@Override
	public String name() {
		return guodi.name();
	} 
}
