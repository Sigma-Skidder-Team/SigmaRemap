// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.emitter.Emitter;

public class Class4667 implements Emitter.Listener
{
    private static String[] field20189;
    public final /* synthetic */ Class4966 field20190;
    public final /* synthetic */ Class4966 field20191;
    
    public Class4667(final Class4966 field20191, final Class4966 field20192) {
        this.field20191 = field20191;
        this.field20190 = field20192;
    }
    
    @Override
    public void call(final Object... array) {
        EventThread.exec(new Class936(this, array));
    }
}
