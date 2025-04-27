// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.emitter.Emitter;

public class Class8415
{
    private static String[] field34550;
    
    private Class8415() {
    }
    
    public static Handle method28106(final Emitter emitter, final String s, final Emitter.Listener class4962) {
        emitter.on(s, class4962);
        return new Class4247(emitter, s, class4962);
    }
}
