// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;

public abstract class Class5278<T, X> extends Class5260<T>
{
    private final X field22341;
    
    public Class5278(final X field22341, final Class<T> clazz) {
        super(clazz);
        this.field22341 = field22341;
    }
    
    public abstract T method16414(final ByteBuf p0, final X p1) throws Exception;
    
    public abstract void method16415(final ByteBuf p0, final X p1, final T p2) throws Exception;
    
    @Override
    public T method16378(final ByteBuf byteBuf) throws Exception {
        return this.method16414(byteBuf, this.field22341);
    }
    
    @Override
    public void method16379(final ByteBuf byteBuf, final T t) throws Exception {
        this.method16415(byteBuf, this.field22341, t);
    }
}
