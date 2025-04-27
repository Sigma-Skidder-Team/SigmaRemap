// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.BufferUtils;
import java.nio.ByteOrder;
import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.io.InputStream;

public class Class5340 implements Class5337
{
    private int field22391;
    private int field22392;
    private int field22393;
    private int field22394;
    private short field22395;
    
    private short method16498(final short n) {
        final int n2 = n & 0xFFFF;
        return (short)(n2 << 8 | (n2 & 0xFF00) >>> 8);
    }
    
    @Override
    public int method16480() {
        return this.field22395;
    }
    
    @Override
    public int method16484() {
        return this.field22393;
    }
    
    @Override
    public int method16481() {
        return this.field22394;
    }
    
    @Override
    public int method16483() {
        return this.field22391;
    }
    
    @Override
    public int method16482() {
        return this.field22392;
    }
    
    @Override
    public ByteBuffer method16491(final InputStream inputStream) throws IOException {
        return this.method16492(inputStream, true, null);
    }
    
    @Override
    public ByteBuffer method16492(final InputStream inputStream, final boolean b, final int[] array) throws IOException {
        return this.method16493(inputStream, b, false, array);
    }
    
    @Override
    public ByteBuffer method16493(final InputStream in, boolean b, boolean b2, final int[] array) throws IOException {
        if (array != null) {
            b2 = true;
        }
        final BufferedInputStream in2 = new BufferedInputStream(in, 100000);
        final DataInputStream dataInputStream = new DataInputStream(in2);
        final short n = (short)dataInputStream.read();
        final short n2 = (short)dataInputStream.read();
        final short n3 = (short)dataInputStream.read();
        this.method16498(dataInputStream.readShort());
        this.method16498(dataInputStream.readShort());
        final short n4 = (short)dataInputStream.read();
        this.method16498(dataInputStream.readShort());
        this.method16498(dataInputStream.readShort());
        if (n3 == 2) {
            this.field22393 = this.method16498(dataInputStream.readShort());
            this.field22394 = this.method16498(dataInputStream.readShort());
            this.field22395 = (short)dataInputStream.read();
            if (this.field22395 == 32) {
                b2 = false;
            }
            this.field22391 = this.method16499(this.field22393);
            this.field22392 = this.method16499(this.field22394);
            if (((short)dataInputStream.read() & 0x20) == 0x0) {
                b = !b;
            }
            if (n > 0) {
                in2.skip(n);
            }
            byte[] src;
            if (this.field22395 != 32 && !b2) {
                if (this.field22395 != 24) {
                    throw new RuntimeException("Only 24 and 32 bit TGAs are supported");
                }
                src = new byte[this.field22391 * this.field22392 * 3];
            }
            else {
                this.field22395 = 32;
                src = new byte[this.field22391 * this.field22392 * 4];
            }
            if (this.field22395 != 24) {
                if (this.field22395 == 32) {
                    if (!b) {
                        for (int i = 0; i < this.field22394; ++i) {
                            for (int j = 0; j < this.field22393; ++j) {
                                final byte byte1 = dataInputStream.readByte();
                                final byte byte2 = dataInputStream.readByte();
                                final byte byte3 = dataInputStream.readByte();
                                byte byte4;
                                if (!b2) {
                                    byte4 = dataInputStream.readByte();
                                }
                                else {
                                    byte4 = -1;
                                }
                                final int n5 = (j + i * this.field22391) * 4;
                                if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                                    src[n5] = byte3;
                                    src[n5 + 1] = byte2;
                                    src[n5 + 2] = byte1;
                                    src[n5 + 3] = byte4;
                                }
                                else {
                                    src[n5] = byte3;
                                    src[n5 + 1] = byte2;
                                    src[n5 + 2] = byte1;
                                    src[n5 + 3] = byte4;
                                }
                                if (byte4 == 0) {
                                    src[n5 + 2] = 0;
                                    src[n5] = (src[n5 + 1] = 0);
                                }
                            }
                        }
                    }
                    else {
                        for (int k = this.field22394 - 1; k >= 0; --k) {
                            for (int l = 0; l < this.field22393; ++l) {
                                final byte byte5 = dataInputStream.readByte();
                                final byte byte6 = dataInputStream.readByte();
                                final byte byte7 = dataInputStream.readByte();
                                byte byte8;
                                if (!b2) {
                                    byte8 = dataInputStream.readByte();
                                }
                                else {
                                    byte8 = -1;
                                }
                                final int n6 = (l + k * this.field22391) * 4;
                                src[n6] = byte7;
                                src[n6 + 1] = byte6;
                                src[n6 + 2] = byte5;
                                src[n6 + 3] = byte8;
                                if (byte8 == 0) {
                                    src[n6 + 2] = 0;
                                    src[n6] = (src[n6 + 1] = 0);
                                }
                            }
                        }
                    }
                }
            }
            else if (!b) {
                for (int n7 = 0; n7 < this.field22394; ++n7) {
                    for (int n8 = 0; n8 < this.field22393; ++n8) {
                        final byte byte9 = dataInputStream.readByte();
                        final byte byte10 = dataInputStream.readByte();
                        final byte byte11 = dataInputStream.readByte();
                        final int n9 = (n8 + n7 * this.field22391) * 3;
                        src[n9] = byte11;
                        src[n9 + 1] = byte10;
                        src[n9 + 2] = byte9;
                    }
                }
            }
            else {
                for (int n10 = this.field22394 - 1; n10 >= 0; --n10) {
                    for (int n11 = 0; n11 < this.field22393; ++n11) {
                        final byte byte12 = dataInputStream.readByte();
                        final byte byte13 = dataInputStream.readByte();
                        final byte byte14 = dataInputStream.readByte();
                        final int n12 = (n11 + n10 * this.field22391) * 3;
                        src[n12] = byte14;
                        src[n12 + 1] = byte13;
                        src[n12 + 2] = byte12;
                    }
                }
            }
            in.close();
            if (array != null) {
                for (int n13 = 0; n13 < src.length; n13 += 4) {
                    int n14 = 1;
                    for (int n15 = 0; n15 < 3; ++n15) {
                        if (src[n13 + n15] != array[n15]) {
                            n14 = 0;
                            break;
                        }
                    }
                    if (n14 != 0) {
                        src[n13 + 3] = 0;
                    }
                }
            }
            final ByteBuffer byteBuffer = BufferUtils.createByteBuffer(src.length);
            byteBuffer.put(src);
            final int n16 = this.field22395 / 8;
            if (this.field22394 < this.field22392 - 1) {
                final int n17 = (this.field22392 - 1) * (this.field22391 * n16);
                final int n18 = (this.field22394 - 1) * (this.field22391 * n16);
                for (int n19 = 0; n19 < this.field22391 * n16; ++n19) {
                    byteBuffer.put(n17 + n19, byteBuffer.get(n19));
                    byteBuffer.put(n18 + this.field22391 * n16 + n19, byteBuffer.get(this.field22391 * n16 + n19));
                }
            }
            if (this.field22393 < this.field22391 - 1) {
                for (int n20 = 0; n20 < this.field22392; ++n20) {
                    for (int n21 = 0; n21 < n16; ++n21) {
                        byteBuffer.put((n20 + 1) * (this.field22391 * n16) - n16 + n21, byteBuffer.get(n20 * (this.field22391 * n16) + n21));
                        byteBuffer.put(n20 * (this.field22391 * n16) + this.field22393 * n16 + n21, byteBuffer.get(n20 * (this.field22391 * n16) + (this.field22393 - 1) * n16 + n21));
                    }
                }
            }
            byteBuffer.flip();
            return byteBuffer;
        }
        throw new IOException("Slick only supports uncompressed RGB(A) TGA images");
    }
    
    private int method16499(final int n) {
        int i;
        for (i = 2; i < n; i *= 2) {}
        return i;
    }
    
    @Override
    public ByteBuffer method16485() {
        throw new RuntimeException("TGAImageData doesn't store it's image.");
    }
    
    @Override
    public void method16490(final boolean b) {
    }
}
