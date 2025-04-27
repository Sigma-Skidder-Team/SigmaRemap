// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.emitter.Emitter;

public class Class4686 implements Emitter.Listener
{
    private static String[] field20235;
    public final /* synthetic */ IRCManager field20236;
    
    public Class4686(final IRCManager field20236) {
        this.field20236 = field20236;
    }
    
    @Override
    public void call(final Object... array) {
        System.out.println(array[0]);
    }
}
