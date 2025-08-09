
public class Test {
	public static void main(String[] args) {
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		taro.phoneNumber = "1111-11-1111";
		taro.address = "北海道住所";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		System.out.println();
		
		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;
		jiro.phoneNumber = "2222-22-2222";
		jiro.address = "青森住所";
				
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		jiro.talk();
		jiro.walk();
		System.out.println();
		
		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumber = "333-33-3333";
		hanako.address = "岩手住所";
		
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		hanako.talk();
		hanako.walk();
		System.out.println();
		
		Person wakasa = new Person();
		wakasa.name = "若狭美帆";
		wakasa.age = 37;
		wakasa.phoneNumber = "4444-44-4444";
		wakasa.address = "秋田住所";
		
		System.out.println(wakasa.name);
		System.out.println(wakasa.age);
		System.out.println(wakasa.phoneNumber);
		System.out.println(wakasa.address);
		wakasa.talk();
		wakasa.walk();
		System.out.println();
	}

}
