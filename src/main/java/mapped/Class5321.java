// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;

public class Class5321 extends Class5318
{
    public Class5321() {
        super("Flat Item Array");
    }
    
    public Class7562[] method16446(final ByteBuf byteBuf) throws Exception {
        final short shortValue = Class5260.field22304.method16378(byteBuf);
        final Class7562[] array = new Class7562[shortValue];
        for (short n = 0; n < shortValue; ++n) {
            array[n] = Class5260.field22334.method16378(byteBuf);
        }
        return array;
    }
    
    public void method16447(final ByteBuf byteBuf, final Class7562[] array) throws Exception {
        Class5260.field22304.method16379(byteBuf, (short)array.length);
        for (int length = array.length, i = 0; i < length; ++i) {
            Class5260.field22334.method16379(byteBuf, array[i]);
        }
    }
}
