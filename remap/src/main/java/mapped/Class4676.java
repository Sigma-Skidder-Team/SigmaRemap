// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.emitter.Emitter;

public class Class4676 implements Emitter.Listener
{
    private static String[] field20210;
    public final /* synthetic */ Runnable field20211;
    public final /* synthetic */ Class4966 field20212;
    
    public Class4676(final Class4966 field20212, final Runnable field20213) {
        this.field20212 = field20212;
        this.field20211 = field20213;
    }
    
    @Override
    public void call(final Object... array) {
        EventThread.exec(new Class1516(this));
    }
}
