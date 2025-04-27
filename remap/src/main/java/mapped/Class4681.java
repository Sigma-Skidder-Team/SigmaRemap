// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.emitter.Emitter;

public class Class4681 implements Emitter.Listener
{
    private static String[] field20221;
    public final /* synthetic */ Class4968 field20222;
    
    public Class4681(final Class4968 field20222) {
        this.field20222 = field20222;
    }
    
    @Override
    public void call(final Object... array) {
        Class4968.method15132(this.field20222, (array.length <= 0) ? 0L : ((long)array[0]));
    }
}
