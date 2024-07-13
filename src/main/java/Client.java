import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {

    static {
        // msg = "测试字符串".getBytes();
        // VideoInfo.VideoFeature feature = VideoInfo.VideoFeature.newBuilder()
        //         .setAuthorGender(123)
        //         .setChannelId(321)
        //         .build();
        // msg = feature.toByteArray();

        msg = "{\"author_gender\":123,\"channel_id\":321}".getBytes();
    }

    public static byte msg[];

    public static void main(String[] args) throws IOException {
        System.out.println("客户端启动...");
        // 创建一个流套接字并将其连接到指定主机上的指定端口号
        Socket socket = new Socket("localhost", 8001);
        // 向服务器端发送数据
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        out.write(msg);
        out.close();
        socket.close();
    }
}
