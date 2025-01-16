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
import net.minecraft.item.ItemStack;

public class Class6480 implements Class6477
{
    private static String[] field25838;
    
    public Class7562 method19507(final Class6108 class6108) {
        final Minecraft method5277 = Minecraft.method5277();
        final ItemStack class6109 = Class464.method2352(Class8491.field34859) ? method5277.field4684.field3006.field2739.get(Class8491.field34859) : ItemStack.field34174;
        final Item method5278 = class6109.getItem();
        if (method5278 != null) {
            final Class7562 class6110 = new Class7562((short) Item.method11696(method5278), (byte)class6109.field34176, (short)class6109.method27632(), this.method19508(class6109.method27657()));
            Class9560.method35773(class6110);
            Class8378.method27920(class6110);
            Class9553.method35741(class6110);
            Class8748.method30245(class6110);
            Class8458.method28224(class6110);
            return class6110;
        }
        return new Class7562((short)0, (byte)0, (short)0, null);
    }
    
    public Class74 method19508(final CompoundNBT class51) {
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
