// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9462
{
    private static String[] field40673;
    private final long[] field40674;
    private int field40675;
    private int field40676;
    private int field40677;
    
    public Class9462() {
        this.field40674 = new long[240];
    }
    
    public void method35167(final long n) {
        this.field40674[this.field40677] = n;
        ++this.field40677;
        if (this.field40677 == 240) {
            this.field40677 = 0;
        }
        if (this.field40676 >= 240) {
            this.field40675 = this.method35171(this.field40677 + 1);
        }
        else {
            this.field40675 = 0;
            ++this.field40676;
        }
    }
    
    public int method35168(final long n, final int n2, final int n3) {
        return (int)(n / (double)(1000000000L / n3) * n2);
    }
    
    public int method35169() {
        return this.field40675;
    }
    
    public int method35170() {
        return this.field40677;
    }
    
    public int method35171(final int n) {
        return n % 240;
    }
    
    public long[] method35172() {
        return this.field40674;
    }
}
