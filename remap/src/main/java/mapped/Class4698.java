// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.emitter.Emitter;

public class Class4698 implements Emitter.Listener
{
    private static String[] field20264;
    public final /* synthetic */ Class4966 field20265;
    public final /* synthetic */ Class4966 field20266;
    
    public Class4698(final Class4966 field20266, final Class4966 field20267) {
        this.field20266 = field20266;
        this.field20265 = field20267;
    }
    
    @Override
    public void call(final Object... array) {
        EventThread.exec(new Class1135(this, array));
    }
}
