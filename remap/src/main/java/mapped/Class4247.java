// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.emitter.Emitter;

public final class Class4247 implements Handle
{
    private static String[] field19066;
    public final /* synthetic */ Emitter field19067;
    public final /* synthetic */ String field19068;
    public final /* synthetic */ Emitter.Listener field19069;
    
    public Class4247(final Emitter field19067, final String field19068, final Emitter.Listener field19069) {
        this.field19067 = field19067;
        this.field19068 = field19068;
        this.field19069 = field19069;
    }
    
    @Override
    public void destroy() {
        this.field19067.off(this.field19068, this.field19069);
    }
}
