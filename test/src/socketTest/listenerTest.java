package socketTest;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class listenerTest {
	
	public String getID() throws UnknownHostException{
		//��ȡ������InetAddressʵ��
		InetAddress address = InetAddress.getLocalHost();
		address.getHostName();//��ȡ�������
		address.getHostAddress();//��ȡIP��ַ
		byte[] bytes = address.getAddress();//��ȡ�ֽ�������ʽ��IP��ַ���Ե�ָ���Ĳ���
		String IPaddress = bytes.toString();
		return IPaddress;
	}
	

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress address = InetAddress.getLocalHost();
		address.getHostName();//��ȡ�������
		address.getHostAddress();//��ȡIP��ַ
		byte[] bytes = address.getAddress();//��ȡ�ֽ�������ʽ��IP��ַ���Ե�ָ���Ĳ���
		String IPaddress = bytes.toString();
		for(byte bt:bytes){
			System.out.println(bt);
		}
		System.out.println(bytes+"\n"+address.getHostName());

	}

}