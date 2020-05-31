
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flag Switzerland;
		Flag Czechia;
		Flag Canada;
		Flag VaticanCity;
		Flag Tajikistan;
		Flag Argentina;
		Flag Japan;
		Flag Palau;
		Flag Samoa;
		Flag MadeUpFlag;
		double base = 1;
		try {
			Switzerland = Flag.factorySquareFlag("Switzerland", base);
			System.out.println(Switzerland);
			VaticanCity = Flag.factorySquareFlag("Vatican City", base);
			System.out.println(VaticanCity);
			Czechia = Flag.factoryRectangleFlag1("Czechia", base);
			System.out.println(Czechia);
			Japan = Flag.factoryRectangleFlag1("Japan", base);
			System.out.println(Japan);
			Canada = Flag.factoryRectangleFlag2("Canada", base);
			System.out.println(Canada);
			Tajikistan = Flag.factoryRectangleFlag2("Tajikistan", base);
			System.out.println(Tajikistan);
			Samoa = Flag.factoryRectangleFlag2("Samoa", base);
			System.out.println(Samoa);
			Argentina = Flag.factoryRectangleFlag3("Argentina", base);
			System.out.println(Argentina);
			Palau = Flag.factoryRectangleFlag3("Palau", base);
			System.out.println(Palau);
			MadeUpFlag = Flag.factorySquareFlag("YOOO", base);
			System.out.println("The flag under this text was made for extra LOC");
			System.out.println(MadeUpFlag);
		} catch (FlagException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
