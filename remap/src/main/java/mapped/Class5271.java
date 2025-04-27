// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;

public class Class5271 extends Class5260<Boolean> implements Class5264<Boolean>
{
    public Class5271() {
        super(Boolean.class);
    }
    
    public Boolean method16406(final ByteBuf byteBuf) {
        return byteBuf.readBoolean();
    }
    
    public void method16407(final ByteBuf byteBuf, final Boolean b) {
        byteBuf.writeBoolean(b);
    }
    
    public Boolean method16408(final Object o) {
        if (!(o instanceof Number)) {
            return (Boolean)o;
        }
        return ((Number)o).intValue() == 1;
    }
}
