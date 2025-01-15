// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1256 implements Runnable
{
    private static String[] field6839;
    public final /* synthetic */ long field6840;
    public final /* synthetic */ long field6841;
    public final /* synthetic */ long field6842;
    public final /* synthetic */ Class22 field6843;
    public final /* synthetic */ long field6844;
    public final /* synthetic */ long field6845;
    public final /* synthetic */ Class8328 field6846;
    
    public Class1256(final Class8328 field6846, final long field6847, final long field6848, final long field6849, final Class22 field6850, final long field6851, final long field6852) {
        this.field6846 = field6846;
        this.field6840 = field6847;
        this.field6841 = field6848;
        this.field6842 = field6849;
        this.field6843 = field6850;
        this.field6844 = field6851;
        this.field6845 = field6852;
    }
    
    @Override
    public void run() {
        for (long field6840 = this.field6840; field6840 < this.field6841; ++field6840) {
            final long n = field6840 * this.field6842;
            final long n2 = (Class8328.method27762(this.field6846) - field6840) * this.field6842;
            final long n3 = n + Class8328.method27764(this.field6846);
            this.field6843.method171(n3, this.field6843.method135(n2 + 1L));
            this.field6843.method171(n3 + 1L, -this.field6843.method135(n2));
        }
        for (long field6841 = this.field6840; field6841 < this.field6841; ++field6841) {
            final long n4 = field6841 * this.field6842;
            final long n5 = (Class8328.method27762(this.field6846) - field6841 + 1L) * this.field6842;
            for (long n6 = Class8328.method27764(this.field6846) + 2L; n6 < this.field6842; n6 += 2L) {
                final long n7 = n5 - n6;
                final long n8 = n4 + n6;
                this.field6843.method171(n8, this.field6843.method135(n7));
                this.field6843.method171(n8 + 1L, -this.field6843.method135(n7 + 1L));
            }
        }
        for (long field6842 = this.field6844; field6842 < this.field6845; ++field6842) {
            final long n9 = (Class8328.method27762(this.field6846) - field6842) % Class8328.method27762(this.field6846) * this.field6842;
            final long n10 = field6842 * this.field6842;
            for (long n11 = 0L; n11 < this.field6842; n11 += 2L) {
                final long n12 = n9 + (this.field6842 - n11) % this.field6842;
                final long n13 = n10 + n11;
                this.field6843.method171(n12, this.field6843.method135(n13));
                this.field6843.method171(n12 + 1L, -this.field6843.method135(n13 + 1L));
            }
        }
    }
}
