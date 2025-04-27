// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.client.Socket;

public class Class1230 implements Runnable
{
    public final /* synthetic */ Object[] field6688;
    public final /* synthetic */ Socket field6689;
    
    public Class1230(final Socket field6689, final Object[] field6690) {
        this.field6689 = field6689;
        this.field6688 = field6690;
    }
    
    @Override
    public void run() {
        this.field6689.emit("message", this.field6688);
    }
}
