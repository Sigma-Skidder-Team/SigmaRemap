// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.client.Socket;

public class Class7874 implements Ack
{
    private static String[] field32318;
    public final /* synthetic */ boolean[] field32319;
    public final /* synthetic */ int field32320;
    public final /* synthetic */ Socket field32321;
    public final /* synthetic */ Socket field32322;
    
    public Class7874(final Socket field32322, final boolean[] field32323, final int field32324, final Socket field32325) {
        this.field32322 = field32322;
        this.field32319 = field32323;
        this.field32320 = field32324;
        this.field32321 = field32325;
    }
    
    @Override
    public void method25497(final Object... array) {
        EventThread.exec(new Class1109(this, array));
    }
}
