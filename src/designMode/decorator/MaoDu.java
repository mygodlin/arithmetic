package designMode.decorator;
 
public class MaoDu extends PeiCai{

	public MaoDu(GuoDi guodi) {
		super(guodi);
	}
    
	@Override
	public float cost() {
		return super.cost() + 30f;
	}
	@Override
	public String name() {
		return super.name() + "+" + "Ã«¶¹";
	} 
}
