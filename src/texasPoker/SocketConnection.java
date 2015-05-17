package texasPoker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class SocketConnection {
	private static Socket player = null;// ��̬��ÿ������ά��ͬһ������
	private static ArrayList<String> MsgType = new ArrayList();
	private static PrintWriter printWriter = null;
	private static InputStreamReader streamReader = null;// InputStreamReader�ǵͲ�͸߲㴮��֮�������
	private static BufferedReader reader = null; // player.getInputStream()��Socketȡ�����봮��

	public SocketConnection() {
		// ��������˷������󣬷�����IP��ַ�ͷ����������Ķ˿ں�
		try {
			player = new Socket("127.0.0.1", 4242);
			// ͨ��printWriter ���������������Ϣ
			printWriter = new PrintWriter(player.getOutputStream());
			System.out.println("�����ѽ���...");
			streamReader = new InputStreamReader(player.getInputStream());
			// �������ݴ���������BufferedReader����ȡ����BufferReader���ӵ�InputStreamReder
			reader = new BufferedReader(streamReader);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String SendMsg(String msg) { // ������Ϣ
		printWriter.println(msg);
		printWriter.flush();
		return msg;
	}

	public static String ReadMsg() {
		String servermsg = null;
		try {
			while ((servermsg = reader.readLine()) != null) {
				MsgType.add(servermsg);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("���յ�����������Ϣ ��" + servermsg);
		return servermsg;
	}

	public static void CloseConnection() {
		try {
			player.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static ArrayList<String> getMsgList() {
		return MsgType;
	}
	public static Socket getSocket(){
		return player;
		
	}
}
