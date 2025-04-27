// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.emitter.Emitter;

public class Class4673 implements Emitter.Listener
{
    private static String[] field20203;
    public final /* synthetic */ Class4966 field20204;
    public final /* synthetic */ Class4966 field20205;
    
    public Class4673(final Class4966 field20205, final Class4966 field20206) {
        this.field20205 = field20205;
        this.field20204 = field20206;
    }
    
    @Override
    public void call(final Object... array) {
        EventThread.exec(new Class1141(this, array));
    }
}
