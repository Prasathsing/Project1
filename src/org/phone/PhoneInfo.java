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
public static void main(String[]args) {
	PhoneInfo mobile=new PhoneInfo();
	mobile.phoneName();
	mobile.phoneImeiNumber();
	mobile.camera();
	mobile.storage();
	mobile.osName();
}
}
