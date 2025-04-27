// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.client.Manager;
import io.socket.client.Socket;

public class Class1608 implements Runnable
{
    public final /* synthetic */ Socket field8979;
    
    public Class1608(final Socket field8979) {
        this.field8979 = field8979;
    }
    
    @Override
    public void run() {
        if (!Socket.method14964(this.field8979)) {
            Socket.method14965(this.field8979);
            Socket.method14966(this.field8979).method15054();
            if (Manager.ReadyState.OPEN == Socket.method14966(this.field8979).field21358) {
                Socket.method14961(this.field8979);
            }
            this.field8979.emit("connecting");
        }
    }
}
