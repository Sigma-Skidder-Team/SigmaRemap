// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3739 extends Class3737
{
    private int field17145;
    private int field17146;
    private int field17147;
    private int field17148;
    private byte field17149;
    private byte[][] field17150;
    private byte[][] field17151;
    
    public Class3739() {
        super("AVC Specific Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        this.field17145 = class9131.method33135();
        this.field17146 = class9131.method33135();
        this.field17149 = (byte)class9131.method33135();
        this.field17147 = class9131.method33135();
        this.field17148 = (class9131.method33135() & 0x3) + 1;
        final int n = class9131.method33135() & 0x1F;
        this.field17150 = new byte[n][];
        for (int i = 0; i < n; ++i) {
            class9131.method33138(this.field17150[i] = new byte[(int)class9131.method33137(2)]);
        }
        final int method33135 = class9131.method33135();
        this.field17151 = new byte[method33135][];
        for (int j = 0; j < method33135; ++j) {
            class9131.method33138(this.field17151[j] = new byte[(int)class9131.method33137(2)]);
        }
    }
    
    public int method11509() {
        return this.field17145;
    }
    
    public int method11510() {
        return this.field17146;
    }
    
    public byte method11511() {
        return this.field17149;
    }
    
    public int method11512() {
        return this.field17147;
    }
    
    public int method11513() {
        return this.field17148;
    }
    
    public byte[][] method11514() {
        return this.field17150;
    }
    
    public byte[][] method11515() {
        return this.field17151;
    }
}
