// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;

public class Class5269 extends Class5260<Float> implements Class5264<Float>
{
    public Class5269() {
        super(Float.class);
    }
    
    public Float method16403(final ByteBuf byteBuf) {
        return byteBuf.readFloat();
    }
    
    public void method16404(final ByteBuf byteBuf, final Float n) {
        byteBuf.writeFloat((float)n);
    }
    
    public Float method16405(final Object o) {
        if (o instanceof Number) {
            return ((Number)o).floatValue();
        }
        if (!(o instanceof Boolean)) {
            return (Float)o;
        }
        return o ? 1.0f : 0.0f;
    }
}
