// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;

public class Class5288 extends Class5287
{
    public Class5288() {
        super("Item");
    }
    
    public Class7562 method16425(final ByteBuf byteBuf) throws Exception {
        final short short1 = byteBuf.readShort();
        if (short1 >= 0) {
            final Class7562 class7562 = new Class7562();
            class7562.method23744(short1);
            class7562.method23745(byteBuf.readByte());
            class7562.method23746(byteBuf.readShort());
            class7562.method23747(Class5260.field22322.method16378(byteBuf));
            return class7562;
        }
        return null;
    }
    
    public void method16426(final ByteBuf byteBuf, final Class7562 class7562) throws Exception {
        if (class7562 != null) {
            byteBuf.writeShort(class7562.method23740());
            byteBuf.writeByte((int)class7562.method23741());
            byteBuf.writeShort((int)class7562.method23742());
            Class5260.field22322.method16379(byteBuf, class7562.method23743());
        }
        else {
            byteBuf.writeShort(-1);
        }
    }
}
