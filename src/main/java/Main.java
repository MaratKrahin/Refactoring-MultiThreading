
public class Main {
    public static void main(String[] args) {
        final int poolSize = 64;
        MyServer myServer = new MyServer(poolSize);
        myServer.listen(8080);

    }
}