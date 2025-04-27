// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;

public class Class5292 extends Class5291
{
    private static String[] field22346;
    
    public Class7276 method16427(final ByteBuf byteBuf) throws Exception {
        final byte byte1 = byteBuf.readByte();
        if (byte1 != 127) {
            final Class1972 method7974 = Class1972.method7974((byte1 & 0xE0) >> 5);
            return new Class7276(byte1 & 0x1F, method7974, method7974.method7969().method16378(byteBuf));
        }
        return null;
    }
    
    public void method16428(final ByteBuf byteBuf, final Class7276 class7276) throws Exception {
        byteBuf.writeByte((byte)(class7276.method22295().method7968() << 5 | (class7276.method22294() & 0x1F)));
        class7276.method22295().method7969().method16379(byteBuf, class7276.method22296());
    }
}
