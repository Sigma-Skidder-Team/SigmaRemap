// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;

public class Class5298 extends Class5260<Class7668>
{
    private static final int field22352 = 14;
    
    public Class5298() {
        super("Chunk Section Type", Class7668.class);
    }
    
    public Class7668 method16429(final ByteBuf byteBuf) throws Exception {
        final Class7668 class7668 = new Class7668();
        final short unsignedByte;
        int i = unsignedByte = byteBuf.readUnsignedByte();
        if (i == 0 || i > 8) {
            i = 14;
        }
        final long n = (1L << i) - 1L;
        final int n2 = (i != 14) ? Class5260.field22312.method16378(byteBuf) : 0;
        class7668.method24332();
        for (int j = 0; j < n2; ++j) {
            class7668.method24331(Class5260.field22312.method16378(byteBuf));
        }
        final long[] array = new long[(int)Class5260.field22312.method16378(byteBuf)];
        if (array.length > 0) {
            final int k = (int)Math.ceil(4096 * i / 64.0);
            if (array.length != k) {
                throw new IllegalStateException("Block data length (" + array.length + ") does not match expected length (" + k + ")! bitsPerBlock=" + i + ", originalBitsPerBlock=" + unsignedByte);
            }
            for (int l = 0; l < array.length; ++l) {
                array[l] = byteBuf.readLong();
            }
            for (int n3 = 0; n3 < 4096; ++n3) {
                final int n4 = n3 * i;
                final int n5 = n4 / 64;
                final int n6 = ((n3 + 1) * i - 1) / 64;
                final int n7 = n4 % 64;
                int n8;
                if (n5 != n6) {
                    n8 = (int)((array[n5] >>> n7 | array[n6] << 64 - n7) & n);
                }
                else {
                    n8 = (int)(array[n5] >>> n7 & n);
                }
                if (i != 14) {
                    class7668.method24325(n3, n8);
                }
                else {
                    class7668.method24333(n3, n8);
                }
            }
        }
        return class7668;
    }
    
    public void method16430(final ByteBuf byteBuf, final Class7668 class7668) throws Exception {
        int n;
        for (n = 4; class7668.method24327() > 1 << n; ++n) {}
        if (n > 8) {
            n = 14;
        }
        final long n2 = (1L << n) - 1L;
        byteBuf.writeByte(n);
        if (n != 14) {
            Class5260.field22312.method16379(byteBuf, class7668.method24327());
            for (int i = 0; i < class7668.method24327(); ++i) {
                Class5260.field22312.method16379(byteBuf, class7668.method24328(i));
            }
        }
        final int j = (int)Math.ceil(4096 * n / 64.0);
        Class5260.field22312.method16379(byteBuf, j);
        final long[] array = new long[j];
        for (int k = 0; k < 4096; ++k) {
            final int n3 = (n != 14) ? class7668.method24326(k) : class7668.method24323(k);
            final int n4 = k * n;
            final int n5 = n4 / 64;
            final int n6 = ((k + 1) * n - 1) / 64;
            final int n7 = n4 % 64;
            array[n5] = ((array[n5] & ~(n2 << n7)) | ((long)n3 & n2) << n7);
            if (n5 != n6) {
                final int n8 = 64 - n7;
                array[n6] = (array[n6] >>> n8 << n8 | ((long)n3 & n2) >> n8);
            }
        }
        final long[] array2 = array;
        for (int length = array2.length, l = 0; l < length; ++l) {
            byteBuf.writeLong(array2[l]);
        }
    }
}
