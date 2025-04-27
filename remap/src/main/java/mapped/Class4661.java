// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.client.Manager;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;

public class Class4661 implements Emitter.Listener
{
    private static String[] field20167;
    public final /* synthetic */ Socket field20168;
    public final /* synthetic */ Manager field20169;
    public final /* synthetic */ String field20170;
    public final /* synthetic */ Manager field20171;
    
    public Class4661(final Manager field20171, final Socket field20172, final Manager field20173, final String field20174) {
        this.field20171 = field20171;
        this.field20168 = field20172;
        this.field20169 = field20173;
        this.field20170 = field20174;
    }
    
    @Override
    public void call(final Object... array) {
        this.field20168.id = Manager.method15091(this.field20169, this.field20170);
    }
}
