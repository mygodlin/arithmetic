package designMode.decorator;
/*
 * ������屻װ�ζ���Ҳ���Ǹ��ֹ��ף����ﶨ�����֣� 
 */ 
public class YuanYang implements GuoDi{

	@Override
    public float cost() {
        return 48.0f;
    }
	
    @Override
    public String name() {
        return "ԧ�����";
    }
    
}
