// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;

public class Class5272 extends Class5260<Double> implements Class5264<Double>
{
    public Class5272() {
        super(Double.class);
    }
    
    public Double method16409(final ByteBuf byteBuf) {
        return byteBuf.readDouble();
    }
    
    public void method16410(final ByteBuf byteBuf, final Double n) {
        byteBuf.writeDouble((double)n);
    }
    
    public Double method16411(final Object o) {
        if (o instanceof Number) {
            return ((Number)o).doubleValue();
        }
        if (!(o instanceof Boolean)) {
            return (Double)o;
        }
        return o ? 1.0 : 0.0;
    }
}
