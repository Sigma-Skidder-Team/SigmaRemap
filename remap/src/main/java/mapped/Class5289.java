// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;

public class Class5289 extends Class5287
{
    public Class5289() {
        super("FlatVarIntItem");
    }
    
    public Class7562 method16425(final ByteBuf byteBuf) throws Exception {
        if (byteBuf.readBoolean()) {
            final Class7562 class7562 = new Class7562();
            class7562.method23744(Class5260.field22312.method16378(byteBuf));
            class7562.method23745(byteBuf.readByte());
            class7562.method23747(Class5260.field22322.method16378(byteBuf));
            return class7562;
        }
        return null;
    }
    
    public void method16426(final ByteBuf byteBuf, final Class7562 class7562) throws Exception {
        if (class7562 != null) {
            byteBuf.writeBoolean(true);
            Class5260.field22312.method16379(byteBuf, class7562.method23740());
            byteBuf.writeByte(class7562.method23741());
            Class5260.field22322.method16379(byteBuf, class7562.method23743());
        }
        else {
            byteBuf.writeBoolean(false);
        }
    }
}
