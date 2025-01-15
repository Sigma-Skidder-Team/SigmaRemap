// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.net.SocketAddress;
import com.google.gson.JsonObject;
import java.io.File;

public class Class8009 extends Class8006<String, Class6026>
{
    public Class8009(final File file) {
        super(file);
    }
    
    @Override
    public Class6022<String> method26215(final JsonObject jsonObject) {
        return new Class6026(jsonObject);
    }
    
    public boolean method26222(final SocketAddress socketAddress) {
        return ((Class8006<String, V>)this).method26213(this.method26225(socketAddress));
    }
    
    public boolean method26223(final String s) {
        return ((Class8006<String, V>)this).method26213(s);
    }
    
    public Class6026 method26224(final SocketAddress socketAddress) {
        return this.method26207(this.method26225(socketAddress));
    }
    
    private String method26225(final SocketAddress socketAddress) {
        String s = socketAddress.toString();
        if (s.contains("/")) {
            s = s.substring(s.indexOf(47) + 1);
        }
        if (s.contains(":")) {
            s = s.substring(0, s.indexOf(58));
        }
        return s;
    }
}
