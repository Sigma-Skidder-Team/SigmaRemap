// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.DataInputStream;

public class Class9124
{
    private static String[] field38662;
    private boolean field38663;
    private boolean field38664;
    private boolean field38665;
    private boolean field38666;
    private boolean field38667;
    private int field38668;
    private int field38669;
    private int field38670;
    private int field38671;
    private boolean field38672;
    private boolean field38673;
    private int field38674;
    private int field38675;
    private int field38676;
    private int[] field38677;
    private int field38678;
    private byte[] field38679;
    
    public Class9124(final DataInputStream dataInputStream) throws IOException {
        this.method33080(dataInputStream);
        if (!this.field38664) {
            this.field38678 = dataInputStream.readUnsignedShort();
        }
        if (this.field38676 != 0) {
            if (!this.field38664) {
                this.field38677 = new int[this.field38676];
                for (int i = 0; i < this.field38676; ++i) {
                    this.field38677[i] = dataInputStream.readUnsignedShort();
                }
                this.field38678 = dataInputStream.readUnsignedShort();
            }
            for (int j = 0; j < this.field38676; ++j) {
                if (!this.field38664) {
                    this.field38678 = dataInputStream.readUnsignedShort();
                }
            }
        }
    }
    
    private void method33080(final DataInputStream dataInputStream) throws IOException {
        final int read = dataInputStream.read();
        this.field38663 = ((read >> 3 & 0x1) == 0x1);
        this.field38668 = (read >> 1 & 0x3);
        this.field38664 = ((read & 0x1) == 0x1);
        final int read2 = dataInputStream.read();
        this.field38669 = (read2 >> 6 & 0x3) + 1;
        this.field38670 = (read2 >> 2 & 0xF);
        this.field38665 = ((read2 >> 1 & 0x1) == 0x1);
        final int n = read2 << 8 | dataInputStream.read();
        this.field38671 = (n >> 6 & 0x7);
        this.field38666 = ((n >> 5 & 0x1) == 0x1);
        this.field38667 = ((n >> 4 & 0x1) == 0x1);
        this.field38672 = ((n >> 3 & 0x1) == 0x1);
        this.field38673 = ((n >> 2 & 0x1) == 0x1);
        final int n2 = n << 16 | dataInputStream.readUnsignedShort();
        this.field38674 = (n2 >> 5 & 0x1FFF);
        final int n3 = n2 << 8 | dataInputStream.read();
        this.field38675 = (n3 >> 2 & 0x7FF);
        this.field38676 = (n3 & 0x3);
    }
    
    public int method33081() {
        return this.field38674 - (this.field38664 ? 7 : 9);
    }
    
    public byte[] method33082() {
        if (this.field38679 == null) {
            (this.field38679 = new byte[2])[0] = (byte)(this.field38669 << 3);
            final byte[] field38679 = this.field38679;
            final int n = 0;
            field38679[n] |= (byte)(this.field38670 >> 1 & 0x7);
            this.field38679[1] = (byte)((this.field38670 & 0x1) << 7);
            final byte[] field38680 = this.field38679;
            final int n2 = 1;
            field38680[n2] |= (byte)(this.field38671 << 3);
        }
        return this.field38679;
    }
    
    public int method33083() {
        return Class2077.method8180(this.field38670).method8183();
    }
    
    public int method33084() {
        return Class2001.method8022(this.field38671).method8023();
    }
}
