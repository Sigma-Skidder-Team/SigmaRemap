// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3743 extends Class3737
{
    private int field17162;
    private int field17163;
    private int[] field17164;
    private int[] field17165;
    private int[] field17166;
    private int[] field17167;
    private int[] field17168;
    private int[] field17169;
    private boolean[] field17170;
    
    public Class3743() {
        super("EAC-3 Specific Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        final long method33137 = class9131.method33137(2);
        this.field17162 = (int)(method33137 >> 3 & 0x1FFFL);
        this.field17163 = (int)(method33137 & 0x7L);
        for (int i = 0; i < this.field17163; ++i) {
            final long method33138 = class9131.method33137(3);
            this.field17164[i] = (int)(method33138 >> 22 & 0x3L);
            this.field17165[i] = (int)(method33138 >> 17 & 0x1FL);
            this.field17166[i] = (int)(method33138 >> 12 & 0x1FL);
            this.field17167[i] = (int)(method33138 >> 9 & 0x7L);
            this.field17170[i] = ((method33138 >> 5 & 0x1L) == 0x1L);
            this.field17168[i] = (int)(method33138 >> 1 & 0xFL);
            if (this.field17168[i] > 0) {
                this.field17169[i] = (int)((method33138 << 8 | (long)class9131.method33135()) & 0x1FFL);
            }
        }
    }
    
    public int method11526() {
        return this.field17162;
    }
    
    public int method11527() {
        return this.field17163;
    }
    
    public int[] method11528() {
        return this.field17164;
    }
    
    public int[] method11529() {
        return this.field17165;
    }
    
    public int[] method11530() {
        return this.field17166;
    }
    
    public int[] method11531() {
        return this.field17167;
    }
    
    public boolean[] method11532() {
        return this.field17170;
    }
    
    public int[] method11533() {
        return this.field17168;
    }
    
    public int[] method11534() {
        return this.field17169;
    }
}
