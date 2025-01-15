// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Class9164
{
    private static String[] field38823;
    public Socket field38824;
    public String field38825;
    public Class1681 field38826;
    public Class1679 field38827;
    public Class5041 field38828;
    public Class7547 field38829;
    public boolean field38830;
    
    public Class9164(final boolean field38830) {
        this.field38828 = Class5041.field21596;
        this.field38829 = Class7547.field29941;
        this.field38830 = field38830;
    }
    
    public Class9164 method33447(final Socket socket) throws IOException {
        return this.method33448(socket, ((InetSocketAddress)socket.getRemoteSocketAddress()).getHostName(), Class8753.method30275(Class8753.method30288(socket)), Class8753.method30276(Class8753.method30279(socket)));
    }
    
    public Class9164 method33448(final Socket field38824, final String field38825, final Class1681 field38826, final Class1679 field38827) {
        this.field38824 = field38824;
        this.field38825 = field38825;
        this.field38826 = field38826;
        this.field38827 = field38827;
        return this;
    }
    
    public Class9164 method33449(final Class5041 field38828) {
        this.field38828 = field38828;
        return this;
    }
    
    public Class9164 method33450(final Class7547 field38829) {
        this.field38829 = field38829;
        return this;
    }
    
    public Class1758 method33451() throws IOException {
        return new Class1758(this);
    }
}
