// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.parser.Packet;

import java.util.logging.Logger;

public final class Class8171 implements Class8170
{
    private static final Logger field33662;
    
    private static Packet<String> method27012() {
        return new Packet<String>(4, "parser error");
    }
    
    private Class8171() {
    }
    
    static {
        field33662 = Logger.getLogger(Class8171.class.getName());
    }
}
