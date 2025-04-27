// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.ArrayList;
import java.util.BitSet;
import io.netty.buffer.ByteBuf;

public class Class5284 extends Class5278<Class6562, Class6637>
{
    private static String[] field22345;
    
    public Class5284(final Class6637 class6637) {
        super(class6637, Class6562.class);
    }
    
    public Class6562 method16416(final ByteBuf byteBuf, final Class6637 class6637) throws Exception {
        final boolean b = class6637.method20121().method18207(Class6651.class).method20211().method16335(Class5223.class) && Class8563.method28792().method23287();
        final int method23288 = Class8563.method28792().method23288();
        final int int1 = byteBuf.readInt();
        final int int2 = byteBuf.readInt();
        final boolean boolean1 = byteBuf.readBoolean();
        final int intValue = Class5260.field22312.method16378(byteBuf);
        Class5260.field22312.method16378(byteBuf).intValue();
        final BitSet set = new BitSet(16);
        final Class7668[] array = new Class7668[16];
        for (int i = 0; i < 16; ++i) {
            if ((intValue & 1 << i) != 0x0) {
                set.set(i);
            }
        }
        for (int j = 0; j < 16; ++j) {
            if (set.get(j)) {
                final Class7668 class6638 = Class8794.field36976.method16378(byteBuf);
                (array[j] = class6638).method24340(byteBuf);
                if (class6637.method20126() == Class2183.field12925) {
                    class6638.method24341(byteBuf);
                }
                if (b) {
                    class6638.method24330(36, method23288);
                }
            }
        }
        final int[] array2 = boolean1 ? new int[256] : null;
        if (boolean1) {
            for (int k = 0; k < 256; ++k) {
                array2[k] = (byteBuf.readByte() & 0xFF);
            }
        }
        return new Class6560(int1, int2, boolean1, intValue, array, array2, new ArrayList<Class74>());
    }
    
    public void method16417(final ByteBuf byteBuf, final Class6637 class6637, final Class6562 class6638) throws Exception {
        byteBuf.writeInt(class6638.method19885());
        byteBuf.writeInt(class6638.method19886());
        byteBuf.writeBoolean(class6638.method19887());
        Class5260.field22312.method16379(byteBuf, class6638.method19888());
        final ByteBuf buffer = byteBuf.alloc().buffer();
        try {
            for (int i = 0; i < 16; ++i) {
                final Class7668 class6639 = class6638.method19889()[i];
                if (class6639 != null) {
                    Class8794.field36976.method16379(buffer, class6639);
                    class6639.method24343(buffer);
                    if (class6639.method24345()) {
                        class6639.method24344(buffer);
                    }
                }
            }
            buffer.readerIndex(0);
            Class5260.field22312.method16379(byteBuf, buffer.readableBytes() + (class6638.method19884() ? 256 : 0));
            byteBuf.writeBytes(buffer);
        }
        finally {
            buffer.release();
        }
        if (class6638.method19884()) {
            final int[] method19890 = class6638.method19890();
            for (int length = method19890.length, j = 0; j < length; ++j) {
                byteBuf.writeByte((byte)method19890[j]);
            }
        }
    }
    
    @Override
    public Class<? extends Class5260> method16380() {
        return Class5317.class;
    }
}
