package leetcode.string.easy;

/*
  Given a valid (IPv4) IP address, return a defanged version of that IP address.
  A defanged IP address replaces every period "." with "[.]".

  Example 1:
  Input: address = "1.1.1.1"
  Output: "1[.]1[.]1[.]1"
* */

public class DefangingAnIpAddress {

  public static void main(String[] args) {
    DefangingAnIpAddress ipAddress = new DefangingAnIpAddress();
    System.out.println(ipAddress.defangIPaddr("1.1.1.1"));
  }

  public String defangIPaddr(String address) {
    return address.replace(".", "[.]");
  }
}
