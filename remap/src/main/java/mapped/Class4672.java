// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.emitter.Emitter;

public class Class4672 implements Emitter.Listener
{
    private static String[] field20200;
    public final /* synthetic */ Class4968 field20201;
    public final /* synthetic */ Class4968 field20202;
    
    public Class4672(final Class4968 field20202, final Class4968 field20203) {
        this.field20202 = field20202;
        this.field20201 = field20203;
    }
    
    @Override
    public void call(final Object... array) {
        Class4968.method15141(this.field20201, (array.length <= 0) ? null : ((Class8437)array[0]));
    }
}
