package texasPoker;

public class Game {		//�������

	public static void main(String[] args) {
		IpInfo.ServerIp = args[0];
		IpInfo.ServerPort = args[1];
		IpInfo.ClientIp = args[2];
		IpInfo.ClientPort = args[3];
		IpInfo.PlayerId = Integer.valueOf(args[4]).intValue();
		Player Meilier=new Player();
		//��Ϸû�н���
		while(!(SocketConnection.getSocket().isClosed())){
			Meilier.AnalysisMsg();
		}
	}
}
