// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.client.Manager;
import io.socket.parser.Decoder;
import io.socket.parser.Packet;

public class Class7551 implements Decoder.Callback
{
    private static String[] field29952;
    public final /* synthetic */ Manager field29953;
    
    public Class7551(final Manager field29953) {
        this.field29953 = field29953;
    }
    
    @Override
    public void call(final Packet packet) {
        Manager.method15089(this.field29953, packet);
    }
}
