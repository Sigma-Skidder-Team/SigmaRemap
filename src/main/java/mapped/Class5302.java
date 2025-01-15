// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;
import java.lang.reflect.Array;

public class Class5302<T> extends Class5260<T[]>
{
    private final Class5260<T> field22355;
    
    public Class5302(final Class5260<T> field22355) {
        super(field22355.method16382() + " Array", method16433(field22355.method16381()));
        this.field22355 = field22355;
    }
    
    public static Class<?> method16433(final Class<?> componentType) {
        return Array.newInstance(componentType, 0).getClass();
    }
    
    public T[] method16434(final ByteBuf byteBuf) throws Exception {
        final int intValue = Class5260.field22312.method16378(byteBuf);
        final Object[] array = (Object[])Array.newInstance(this.field22355.method16381(), intValue);
        for (int i = 0; i < intValue; ++i) {
            array[i] = this.field22355.method16378(byteBuf);
        }
        return (T[])array;
    }
    
    public void method16435(final ByteBuf byteBuf, final T[] array) throws Exception {
        Class5260.field22312.method16379(byteBuf, array.length);
        for (int length = array.length, i = 0; i < length; ++i) {
            this.field22355.method16379(byteBuf, array[i]);
        }
    }
}
