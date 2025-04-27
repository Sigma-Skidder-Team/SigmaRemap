// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.client.Socket;
import io.socket.parser.Packet;

import java.util.logging.Level;

public class Class1144 implements Runnable
{
    public final /* synthetic */ Socket field6187;
    
    public Class1144(final Socket field6187) {
        this.field6187 = field6187;
    }
    
    @Override
    public void run() {
        if (Socket.method14964(this.field6187)) {
            if (Socket.method14969().isLoggable(Level.FINE)) {
                Socket.method14969().fine(String.format("performing disconnect (%s)", Socket.method14974(this.field6187)));
            }
            Socket.method14972(this.field6187, new Packet(1));
        }
        Socket.method14975(this.field6187);
        if (Socket.method14964(this.field6187)) {
            Socket.method14963(this.field6187, "io client disconnect");
        }
    }
}
