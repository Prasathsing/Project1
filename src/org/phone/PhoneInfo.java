package org.phone;

public class PhoneInfo {
private void phoneName() {
System.out.println("Realme 5S");
}
private void phoneImeiNumber() {
System.out.println("7654347849");
}
private void camera() {
System.out.println("48MP");
}
private void storage() {
System.out.println("64GB");
}
private void osName() {
System.out.println("andriod 10");
}

private void BrowserVersion() {
System.out.println("99.045.23.89");
System.out.println("Chrome");
}

public static void main(String[]args) {
	PhoneInfo mobile=new PhoneInfo();
	mobile.phoneName();
	mobile.phoneImeiNumber();
	mobile.camera();
	mobile.storage();
	mobile.osName();

	mobile.BrowserVersion();


}
}
