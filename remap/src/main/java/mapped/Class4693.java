// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.emitter.Emitter;

public class Class4693 implements Emitter.Listener
{
    private static String[] field20252;
    public final /* synthetic */ Class4968 field20253;
    public final /* synthetic */ Class4968 field20254;
    
    public Class4693(final Class4968 field20254, final Class4968 field20255) {
        this.field20254 = field20254;
        this.field20253 = field20255;
    }
    
    @Override
    public void call(final Object... array) {
        Class4968.method15142(this.field20253);
    }
}
