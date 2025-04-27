// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.client.Socket;

public class Class1247 implements Runnable
{
    private static String[] field6784;
    public final /* synthetic */ String field6785;
    public final /* synthetic */ Object[] field6786;
    public final /* synthetic */ Socket field6787;
    
    public Class1247(final Socket field6787, final String field6788, final Object[] field6789) {
        this.field6787 = field6787;
        this.field6785 = field6788;
        this.field6786 = field6789;
    }
    
    @Override
    public void run() {
        if (!Socket.RESERVED_EVENTS.containsKey(this.field6785)) {
            final int n = this.field6786.length - 1;
            Object[] field6786;
            Ack ack;
            if (this.field6786.length > 0 && this.field6786[n] instanceof Ack) {
                field6786 = new Object[n];
                System.arraycopy(this.field6786, 0, field6786, 0, n);
                ack = (Ack)this.field6786[n];
            }
            else {
                field6786 = this.field6786;
                ack = null;
            }
            this.field6787.emit(this.field6785, field6786, ack);
            return;
        }
        Socket.method14967(this.field6787, this.field6785, this.field6786);
    }
}
