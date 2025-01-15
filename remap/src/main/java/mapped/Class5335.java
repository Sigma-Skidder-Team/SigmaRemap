// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.ByteOrder;
import org.lwjgl.BufferUtils;
import java.nio.ByteBuffer;

public class Class5335 implements Class5336
{
    private int field22371;
    private int field22372;
    private int field22373;
    private int field22374;
    private byte[] field22375;
    
    public Class5335(final int field22371, final int field22372) {
        this.field22371 = field22371;
        this.field22372 = field22372;
        this.field22373 = this.method16489(field22371);
        this.field22374 = this.method16489(field22372);
        this.field22375 = new byte[this.field22373 * this.field22374 * 4];
    }
    
    public byte[] method16479() {
        return this.field22375;
    }
    
    @Override
    public int method16480() {
        return 32;
    }
    
    @Override
    public int method16481() {
        return this.field22372;
    }
    
    @Override
    public int method16482() {
        return this.field22374;
    }
    
    @Override
    public int method16483() {
        return this.field22373;
    }
    
    @Override
    public int method16484() {
        return this.field22371;
    }
    
    @Override
    public ByteBuffer method16485() {
        final ByteBuffer byteBuffer = BufferUtils.createByteBuffer(this.field22375.length);
        byteBuffer.put(this.field22375);
        byteBuffer.flip();
        return byteBuffer;
    }
    
    public void method16486(final int i, final int j, final int n, final int n2, final int n3, final int n4) {
        if (i >= 0) {
            if (i < this.field22371) {
                if (j >= 0) {
                    if (j < this.field22372) {
                        final int n5 = (i + j * this.field22373) * 4;
                        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                            this.field22375[n5] = (byte)n;
                            this.field22375[n5 + 1] = (byte)n2;
                            this.field22375[n5 + 2] = (byte)n3;
                            this.field22375[n5 + 3] = (byte)n4;
                        }
                        else {
                            this.field22375[n5] = (byte)n3;
                            this.field22375[n5 + 1] = (byte)n2;
                            this.field22375[n5 + 2] = (byte)n;
                            this.field22375[n5 + 3] = (byte)n4;
                        }
                        return;
                    }
                }
            }
        }
        throw new RuntimeException("Specified location: " + i + "," + j + " outside of image");
    }
    
    public Class7764 method16487() {
        return new Class7764(this);
    }
    
    public Class7764 method16488(final int n) {
        return new Class7764(this, n);
    }
    
    private int method16489(final int n) {
        int i;
        for (i = 2; i < n; i *= 2) {}
        return i;
    }
}
