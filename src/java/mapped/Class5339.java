// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.BufferUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class Class5339 implements Class5337
{
    private int field22384;
    private int field22385;
    private int field22386;
    private int field22387;
    private Class7416 field22388;
    private int field22389;
    private ByteBuffer field22390;
    
    @Override
    public int method16480() {
        return this.field22389;
    }
    
    @Override
    public ByteBuffer method16485() {
        return this.field22390;
    }
    
    @Override
    public int method16482() {
        return this.field22386;
    }
    
    @Override
    public int method16483() {
        return this.field22387;
    }
    
    @Override
    public ByteBuffer method16491(final InputStream inputStream) throws IOException {
        return this.method16492(inputStream, false, null);
    }
    
    @Override
    public ByteBuffer method16492(final InputStream inputStream, final boolean b, final int[] array) throws IOException {
        return this.method16493(inputStream, b, false, array);
    }
    
    @Override
    public ByteBuffer method16493(final InputStream inputStream, final boolean b, final boolean b2, final int[] array) throws IOException {
        if (array != null) {
            throw new IOException("Transparent color not support in custom PNG Decoder");
        }
        final Class7416 class7416 = new Class7416(inputStream);
        if (class7416.method22788()) {
            this.field22384 = class7416.method22786();
            this.field22385 = class7416.method22785();
            this.field22387 = this.method16497(this.field22384);
            this.field22386 = this.method16497(this.field22385);
            final int n = class7416.method22787() ? 4 : 3;
            this.field22389 = (class7416.method22787() ? 32 : 24);
            class7416.method22790(this.field22390 = BufferUtils.createByteBuffer(this.field22387 * this.field22386 * n), this.field22387 * n, (n != 4) ? Class7416.field28559 : Class7416.field28560);
            if (this.field22385 < this.field22386 - 1) {
                final int n2 = (this.field22386 - 1) * (this.field22387 * n);
                final int n3 = (this.field22385 - 1) * (this.field22387 * n);
                for (int i = 0; i < this.field22387; ++i) {
                    for (int j = 0; j < n; ++j) {
                        this.field22390.put(n2 + i + j, this.field22390.get(i + j));
                        this.field22390.put(n3 + this.field22387 * n + i + j, this.field22390.get(n3 + i + j));
                    }
                }
            }
            if (this.field22384 < this.field22387 - 1) {
                for (int k = 0; k < this.field22386; ++k) {
                    for (int l = 0; l < n; ++l) {
                        this.field22390.put((k + 1) * (this.field22387 * n) - n + l, this.field22390.get(k * (this.field22387 * n) + l));
                        this.field22390.put(k * (this.field22387 * n) + this.field22384 * n + l, this.field22390.get(k * (this.field22387 * n) + (this.field22384 - 1) * n + l));
                    }
                }
            }
            if (!class7416.method22787()) {
                if (b2) {
                    final ByteBuffer byteBuffer = BufferUtils.createByteBuffer(this.field22387 * this.field22386 * 4);
                    for (int n4 = 0; n4 < this.field22387; ++n4) {
                        for (int n5 = 0; n5 < this.field22386; ++n5) {
                            final int n6 = n5 * 3 + n4 * this.field22386 * 3;
                            final int n7 = n5 * 4 + n4 * this.field22386 * 4;
                            byteBuffer.put(n7, this.field22390.get(n6));
                            byteBuffer.put(n7 + 1, this.field22390.get(n6 + 1));
                            byteBuffer.put(n7 + 2, this.field22390.get(n6 + 2));
                            if (n4 < this.method16481() && n5 < this.method16484()) {
                                byteBuffer.put(n7 + 3, (byte)(-1));
                            }
                            else {
                                byteBuffer.put(n7 + 3, (byte)0);
                            }
                        }
                    }
                    this.field22389 = 32;
                    this.field22390 = byteBuffer;
                }
            }
            if (array != null) {
                for (int n8 = 0; n8 < this.field22387 * this.field22386 * 4; n8 += 4) {
                    int n9 = 1;
                    for (int n10 = 0; n10 < 3; ++n10) {
                        if (this.method16496(this.field22390.get(n8 + n10)) != array[n10]) {
                            n9 = 0;
                        }
                    }
                    if (n9 != 0) {
                        this.field22390.put(n8 + 3, (byte)0);
                    }
                }
            }
            this.field22390.position();
            return this.field22390;
        }
        throw new IOException("Only RGB formatted images are supported by the PNGLoader");
    }
    
    private int method16496(final byte b) {
        if (b >= 0) {
            return b;
        }
        return 256 + b;
    }
    
    private int method16497(final int n) {
        int i;
        for (i = 2; i < n; i *= 2) {}
        return i;
    }
    
    @Override
    public void method16490(final boolean b) {
    }
    
    @Override
    public int method16484() {
        return this.field22384;
    }
    
    @Override
    public int method16481() {
        return this.field22385;
    }
}
