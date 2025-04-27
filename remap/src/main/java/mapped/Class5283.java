// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.BitSet;
import io.netty.buffer.ByteBuf;

public class Class5283 extends Class5278<Class6562, Class6646>
{
    public static final int field22342 = 16;
    private static final int field22343 = 16;
    private static final int field22344 = 256;
    
    public Class5283(final Class6646 class6646) {
        super(class6646, Class6562.class);
    }
    
    private static long method16420(final int n, final int n2) {
        return ((long)n << 32) + n2 + 2147483648L;
    }
    
    @Override
    public Class<? extends Class5260> method16380() {
        return Class5317.class;
    }
    
    public Class6562 method16421(final ByteBuf byteBuf, final Class6646 class6646) throws Exception {
        final boolean b = class6646.method20121().method18207(Class6651.class).method20211().method16335(Class5223.class) && Class8563.method28792().method23287();
        final int method23288 = Class8563.method28792().method23288();
        final int int1 = byteBuf.readInt();
        final int int2 = byteBuf.readInt();
        final long method23289 = method16420(int1, int2);
        final boolean b2 = byteBuf.readByte() != 0;
        final int unsignedShort = byteBuf.readUnsignedShort();
        final int intValue = Class5260.field22312.method16378(byteBuf);
        final BitSet set = new BitSet(16);
        final Class7668[] array = new Class7668[16];
        int[] array2 = null;
        for (int i = 0; i < 16; ++i) {
            if ((unsignedShort & 1 << i) != 0x0) {
                set.set(i);
            }
        }
        final int cardinality = set.cardinality();
        if (intValue >= 4096) {
            final boolean remove = class6646.method20189().remove(method23289);
            if (cardinality == 0) {
                if (b2) {
                    if (!remove) {
                        if (class6646.method20188().contains(method23289)) {
                            class6646.method20188().remove(method23289);
                            return new Class6561(int1, int2);
                        }
                    }
                }
            }
            final int readerIndex = byteBuf.readerIndex();
            class6646.method20188().add(method23289);
            for (int j = 0; j < 16; ++j) {
                if (set.get(j)) {
                    final Class7668 class6647 = Class8324.field34196.method16378(byteBuf);
                    array[j] = class6647;
                    if (b) {
                        class6647.method24330(36, method23288);
                    }
                }
            }
            for (int k = 0; k < 16; ++k) {
                if (set.get(k)) {
                    array[k].method24340(byteBuf);
                }
            }
            int l = intValue - (byteBuf.readerIndex() - readerIndex);
            if (l >= 2048) {
                for (int bitIndex = 0; bitIndex < 16; ++bitIndex) {
                    if (set.get(bitIndex)) {
                        array[bitIndex].method24341(byteBuf);
                        l -= 2048;
                    }
                }
            }
            if (l >= 256) {
                array2 = new int[256];
                for (int n = 0; n < 256; ++n) {
                    array2[n] = (byteBuf.readByte() & 0xFF);
                }
                l -= 256;
            }
            if (l > 0) {
                Class8563.method28793().method34742().log(Level.WARNING, l + " Bytes left after reading chunks! (" + b2 + ")");
            }
            return new Class6561(int1, int2, b2, unsignedShort, array, array2, new ArrayList<Class74>());
        }
        return new Class6561(int1, int2);
    }
    
    public void method16422(final ByteBuf byteBuf, final Class6646 class6646, final Class6562 class6647) throws Exception {
        if (!(class6647 instanceof Class6561)) {
            throw new Exception("Incompatible chunk, " + class6647.getClass());
        }
        final Class6561 class6648 = (Class6561)class6647;
        byteBuf.writeInt(class6648.method19885());
        byteBuf.writeInt(class6648.method19886());
        if (class6648.method19903()) {
            return;
        }
        byteBuf.writeByte(class6648.method19887() ? 1 : 0);
        Class5260.field22312.method16379(byteBuf, class6648.method19888());
        final ByteBuf buffer = byteBuf.alloc().buffer();
        try {
            for (int i = 0; i < 16; ++i) {
                final Class7668 class6649 = class6648.method19889()[i];
                if (class6649 != null) {
                    Class8794.field36976.method16379(buffer, class6649);
                    class6649.method24343(buffer);
                    if (class6649.method24345()) {
                        class6649.method24344(buffer);
                    }
                }
            }
            buffer.readerIndex(0);
            Class5260.field22312.method16379(byteBuf, buffer.readableBytes() + (class6648.method19902() ? 256 : 0));
            byteBuf.writeBytes(buffer);
        }
        finally {
            buffer.release();
        }
        if (class6648.method19902()) {
            final int[] method19890 = class6648.method19890();
            for (int length = method19890.length, j = 0; j < length; ++j) {
                byteBuf.writeByte((byte)method19890[j]);
            }
        }
    }
}
