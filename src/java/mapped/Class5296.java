// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;

public class Class5296 extends Class5291
{
    private static String[] field22350;
    
    public Class7276 method16427(final ByteBuf byteBuf) throws Exception {
        final short unsignedByte = byteBuf.readUnsignedByte();
        if (unsignedByte != 255) {
            final Class1968 method7970 = Class1968.method7970(byteBuf.readByte());
            return new Class7276(unsignedByte, method7970, method7970.method7969().method16378(byteBuf));
        }
        return null;
    }
    
    public void method16428(final ByteBuf byteBuf, final Class7276 class7276) throws Exception {
        if (class7276 != null) {
            byteBuf.writeByte(class7276.method22294());
            byteBuf.writeByte(class7276.method22295().method7968());
            class7276.method22295().method7969().method16379(byteBuf, class7276.method22296());
        }
        else {
            byteBuf.writeByte(255);
        }
    }
}
