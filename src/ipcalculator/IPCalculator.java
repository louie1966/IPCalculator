package ipcalculator;

import java.util.ArrayList;
import java.util.Arrays;

public class IPCalculator {

    int firstOctet;
    int secondOctet;
    int thirdOctet;
    int fourthOctet;
    String ipAddress;

    public IPCalculator() {

    }

    public IPCalculator(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    // Getters
    public int getFirstOctet() {
        return this.firstOctet;
    }

    public int getSecondOctet() {
        return this.secondOctet;
    }

    public int getThirdOctet() {
        return this.thirdOctet;
    }

    public int getFourthOctet() {
        return this.fourthOctet;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    // Setters
    public void setFirstOctet(int newFirstOctet) {
        this.firstOctet = newFirstOctet;
    }

    public void setSecondOctet(int newSecondOctet) {
        this.secondOctet = newSecondOctet;
    }

    public void setThirdOctet(int newThirdOctet) {
        this.thirdOctet = newThirdOctet;
    }

    public void setFourthOctet(int newFourthOctet) {
        this.fourthOctet = newFourthOctet;
    }

    public void setIpAddress(String newIpAddress) {
        this.ipAddress = newIpAddress;
    }

    // Methods
    public void fillOctets() {
        String ipaddress = this.getIpAddress();
        String[] octets = ipaddress.split("\\.");
        setFirstOctet(Integer.parseInt(octets[0]));
        setSecondOctet(Integer.parseInt(octets[1]));
        setThirdOctet(Integer.parseInt(octets[2]));
        setFourthOctet(Integer.parseInt(octets[3]));
        System.out.println(getFirstOctet() + " , " + getSecondOctet() + " , " + getThirdOctet() + " , " + getFourthOctet());

    }

    public static void main(String[] args) {
        IPCalculator calc = new IPCalculator("192.168.0.12");
        calc.fillOctets();

    }

}
