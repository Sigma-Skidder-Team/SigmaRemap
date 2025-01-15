// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.io.OutputStream;
import java.io.IOException;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.Charset;

public class Class919 extends Thread
{
    private Class6794 field4893;
    private static final String field4894 = "\r\n";
    private static Charset field4895;
    
    public Class919(final Class6794 field4893) {
        super("HttpPipelineSender");
        this.field4893 = null;
        this.field4893 = field4893;
    }
    
    @Override
    public void run() {
        Class8821 method20802 = null;
        try {
            this.method5423();
            while (!Thread.interrupted()) {
                method20802 = this.field4893.method20802();
                this.method5424(method20802.method30768(), this.field4893.method20800());
                this.field4893.method20807(method20802);
            }
        }
        catch (final InterruptedException ex) {}
        catch (final Exception ex2) {
            this.field4893.method20812(method20802, ex2);
        }
    }
    
    private void method5423() throws IOException {
        final String method20819 = this.field4893.method20819();
        final int method20820 = this.field4893.method20820();
        final Socket socket = new Socket(this.field4893.method20821());
        socket.connect(new InetSocketAddress(method20819, method20820), 5000);
        this.field4893.method20799(socket);
    }
    
    private void method5424(final Class8153 class8153, final OutputStream outputStream) throws IOException {
        this.method5425(outputStream, class8153.method26853() + " " + class8153.method26854() + " " + class8153.method26855() + "\r\n");
        for (final String str : class8153.method26856().keySet()) {
            this.method5425(outputStream, str + ": " + class8153.method26856().get(str) + "\r\n");
        }
        this.method5425(outputStream, "\r\n");
    }
    
    private void method5425(final OutputStream outputStream, final String s) throws IOException {
        outputStream.write(s.getBytes(Class919.field4895));
    }
    
    static {
        Class919.field4895 = Charset.forName("ASCII");
    }
}
