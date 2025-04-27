// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.emitter.Emitter;

public class Class4684 implements Emitter.Listener
{
    public final /* synthetic */ Class4966 field20228;
    public final /* synthetic */ Class4966 field20229;
    
    public Class4684(final Class4966 field20229, final Class4966 field20230) {
        this.field20229 = field20229;
        this.field20228 = field20230;
    }
    
    @Override
    public void call(final Object... array) {
        this.field20228.method14942("requestHeaders", array[0]);
    }
}
