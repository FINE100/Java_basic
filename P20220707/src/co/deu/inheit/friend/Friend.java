package co.deu.inheit.friend;

public class Friend {
	private String name;
	private String phone;
	
	

public Friend(String name, String phone) {
	super();
	this.name = name;
	this.phone = phone;  // source - Generate construction ... 
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getPhone() {
	return phone;
}



public void setPhone(String phone) {
	this.phone = phone;
}



@Override
public String toString() {
	return "Friend [이름 : " + name + ", 연락처 : " + phone + "]";
}

public void showInfo() {
	//친구이름, 연락처
	System.out.printf("친구의 이름 : %5s 연락처 : %14s\n", name, phone);
}




}




