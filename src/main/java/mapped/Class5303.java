// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.DataOutput;
import io.netty.buffer.ByteBufOutputStream;
import java.io.DataInput;
import io.netty.buffer.ByteBufInputStream;
import com.google.common.base.Preconditions;
import io.netty.buffer.ByteBuf;

public class Class5303 extends Class5260<Class74>
{
    public Class5303() {
        super(Class74.class);
    }
    
    public Class74 method16436(final ByteBuf byteBuf) throws Exception {
        Preconditions.checkArgument(byteBuf.readableBytes() <= 2097152, "Cannot read NBT (got %s bytes)", byteBuf.readableBytes());
        final int readerIndex = byteBuf.readerIndex();
        if (byteBuf.readByte() != 0) {
            byteBuf.readerIndex(readerIndex);
            return (Class74)Class8089.method26579((DataInput)new ByteBufInputStream(byteBuf));
        }
        return null;
    }
    
    public void method16437(final ByteBuf byteBuf, final Class74 class74) throws Exception {
        if (class74 != null) {
            Class8089.method26582((DataOutput)new ByteBufOutputStream(byteBuf), class74);
        }
        else {
            byteBuf.writeByte(0);
        }
    }
    
    static {
        Class8116.method26702(60);
        Class8116.method26702(61);
        Class8116.method26702(65);
    }
}
