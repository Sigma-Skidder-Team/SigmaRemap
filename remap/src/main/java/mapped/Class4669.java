// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.emitter.Emitter;

public class Class4669 implements Emitter.Listener
{
    private static String[] field20194;
    public final /* synthetic */ Class4966 field20195;
    public final /* synthetic */ Class4966 field20196;
    
    public Class4669(final Class4966 field20196, final Class4966 field20197) {
        this.field20196 = field20196;
        this.field20195 = field20197;
    }
    
    @Override
    public void call(final Object... array) {
        EventThread.exec(new Class894(this, array));
    }
}
