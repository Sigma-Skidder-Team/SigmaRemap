// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import io.netty.buffer.ByteBuf;

public class Class5279 extends Class5278<Class6562, Class6637>
{
    public Class5279(final Class6637 class6637) {
        super(class6637, Class6562.class);
    }
    
    public Class6562 method16416(final ByteBuf byteBuf, final Class6637 class6637) throws Exception {
        final int int1 = byteBuf.readInt();
        final int int2 = byteBuf.readInt();
        final boolean boolean1 = byteBuf.readBoolean();
        final int intValue = Class5260.field22312.method16378(byteBuf);
        final Class74 class6638 = Class5260.field22322.method16378(byteBuf);
        final int[] array = (int[])(boolean1 ? new int[1024] : null);
        if (boolean1) {
            for (int i = 0; i < 1024; ++i) {
                array[i] = byteBuf.readInt();
            }
        }
        Class5260.field22312.method16378(byteBuf);
        final BitSet set = new BitSet(16);
        final Class7668[] array2 = new Class7668[16];
        for (int j = 0; j < 16; ++j) {
            if ((intValue & 1 << j) != 0x0) {
                set.set(j);
            }
        }
        for (int k = 0; k < 16; ++k) {
            if (set.get(k)) {
                final short short1 = byteBuf.readShort();
                final Class7668 class6639 = Class8609.field36136.method16378(byteBuf);
                class6639.method24348(short1);
                array2[k] = class6639;
            }
        }
        final ArrayList<Class74> list = new ArrayList<Class74>((Collection<? extends Class74>)Arrays.asList((Object[])Class5260.field22323.method16378(byteBuf)));
        if (byteBuf.readableBytes() > 0) {
            final byte[] array3 = Class5260.field22291.method16378(byteBuf);
            if (Class8563.method28794().method33559()) {
                Class8563.method28793().method34742().warning("Found " + array3.length + " more bytes than expected while reading the chunk: " + int1 + "/" + int2);
            }
        }
        return new Class6560(int1, int2, boolean1, intValue, array2, array, class6638, list);
    }
    
    public void method16417(final ByteBuf byteBuf, final Class6637 class6637, final Class6562 class6638) throws Exception {
        byteBuf.writeInt(class6638.method19885());
        byteBuf.writeInt(class6638.method19886());
        byteBuf.writeBoolean(class6638.method19887());
        Class5260.field22312.method16379(byteBuf, class6638.method19888());
        Class5260.field22322.method16379(byteBuf, class6638.method19891());
        if (class6638.method19884()) {
            final int[] method19890 = class6638.method19890();
            for (int length = method19890.length, i = 0; i < length; ++i) {
                byteBuf.writeInt(method19890[i]);
            }
        }
        final ByteBuf buffer = byteBuf.alloc().buffer();
        try {
            for (int j = 0; j < 16; ++j) {
                final Class7668 class6639 = class6638.method19889()[j];
                if (class6639 != null) {
                    buffer.writeShort(class6639.method24347());
                    Class8609.field36136.method16379(buffer, class6639);
                }
            }
            buffer.readerIndex(0);
            Class5260.field22312.method16379(byteBuf, buffer.readableBytes());
            byteBuf.writeBytes(buffer);
        }
        finally {
            buffer.release();
        }
        Class5260.field22323.method16379(byteBuf, class6638.method19892().toArray(new Class74[0]));
    }
    
    @Override
    public Class<? extends Class5260> method16380() {
        return Class5317.class;
    }
}
