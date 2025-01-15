// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class9487
{
    private static String[] field40776;
    private static final int field40777 = 32768;
    private static final int field40778 = 32767;
    private int field40779;
    private int field40780;
    private int field40781;
    private final int[] field40782;
    private int field40783;
    
    public Class9487() {
        this.field40782 = new int[32768];
        this.field40779 = 0;
        this.field40780 = 0;
        this.field40781 = 0;
    }
    
    public int method35312() {
        return this.field40780;
    }
    
    public int method35313(int n) {
        this.field40780 += n;
        int n2 = 0;
        int field40781 = this.field40781;
        if (field40781 + n >= 32768) {
            while (n-- > 0) {
                n2 = (n2 << 1 | ((this.field40782[field40781] != 0) ? 1 : 0));
                field40781 = (field40781 + 1 & 0x7FFF);
            }
        }
        else {
            while (n-- > 0) {
                n2 = (n2 << 1 | ((this.field40782[field40781++] != 0) ? 1 : 0));
            }
        }
        this.field40781 = field40781;
        return n2;
    }
    
    public int method35314() {
        ++this.field40780;
        final int n = this.field40782[this.field40781];
        this.field40781 = (this.field40781 + 1 & 0x7FFF);
        return n;
    }
    
    public void method35315(final int n) {
        int field40779 = this.field40779;
        this.field40782[field40779++] = (n & 0x80);
        this.field40782[field40779++] = (n & 0x40);
        this.field40782[field40779++] = (n & 0x20);
        this.field40782[field40779++] = (n & 0x10);
        this.field40782[field40779++] = (n & 0x8);
        this.field40782[field40779++] = (n & 0x4);
        this.field40782[field40779++] = (n & 0x2);
        this.field40782[field40779++] = (n & 0x1);
        if (field40779 != 32768) {
            this.field40779 = field40779;
        }
        else {
            this.field40779 = 0;
        }
    }
    
    public void method35316(final int n) {
        this.field40780 -= n;
        this.field40781 -= n;
        if (this.field40781 < 0) {
            this.field40781 += 32768;
        }
    }
    
    public void method35317(final int n) {
        final int n2 = n << 3;
        this.field40780 -= n2;
        this.field40781 -= n2;
        if (this.field40781 < 0) {
            this.field40781 += 32768;
        }
    }
}
