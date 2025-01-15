// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;
import java.io.IOException;
import java.io.InputStream;
import io.netty.buffer.ByteBufInputStream;
import java.io.DataOutput;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.Unpooled;

public class Class6481 extends Class6480
{
    private static String[] field25839;
    
    @Override
    public Class7562 method19507(final Class6108 class6108) {
        final Class869 method5277 = Class869.method5277();
        final Class8321 class6109 = Class464.method2352(Class8491.field34859) ? method5277.field4684.field3006.field2739.get(Class8491.field34859) : Class8321.field34174;
        final Class3820 method5278 = class6109.method27622();
        if (method5278 != null) {
            final Class7562 class6110 = new Class7562((short)Class3820.method11696(method5278), (byte)class6109.field34176, (short)class6109.method27632(), this.method19508(class6109.method27657()));
            Class9560.method35773(class6110);
            Class8378.method27920(class6110);
            Class9553.method35741(class6110);
            Class8748.method30245(class6110);
            Class8458.method28224(class6110);
            return class6110;
        }
        return new Class7562((short)0, (byte)0, (short)0, null);
    }
    
    @Override
    public Class74 method19508(final Class51 class51) {
        if (class51 == null) {
            return null;
        }
        final ByteBuf wrappedBuffer = Unpooled.wrappedBuffer(new byte[2048]);
        wrappedBuffer.resetWriterIndex();
        try {
            Class8097.method26597(class51, (DataOutput)new ByteBufOutputStream(wrappedBuffer));
            wrappedBuffer.writeByte(0);
            return (Class74)Class8089.method26578((InputStream)new ByteBufInputStream(wrappedBuffer), false);
        }
        catch (final IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
