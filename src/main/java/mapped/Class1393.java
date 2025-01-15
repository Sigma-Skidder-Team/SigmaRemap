// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1393 implements Runnable
{
    private static String[] field7676;
    public final /* synthetic */ long field7677;
    public final /* synthetic */ long field7678;
    public final /* synthetic */ long field7679;
    public final /* synthetic */ long field7680;
    public final /* synthetic */ Class17 field7681;
    public final /* synthetic */ Class8983 field7682;
    
    public Class1393(final Class8983 field7682, final long field7683, final long field7684, final long field7685, final long field7686, final Class17 field7687) {
        this.field7682 = field7682;
        this.field7677 = field7683;
        this.field7678 = field7684;
        this.field7679 = field7685;
        this.field7680 = field7686;
        this.field7681 = field7687;
    }
    
    @Override
    public void run() {
        for (long field7677 = this.field7677; field7677 < this.field7678; ++field7677) {
            final long n = field7677 * this.field7679;
            final long n2 = (Class8983.method31978(this.field7682) - field7677 + 1L) * this.field7679;
            for (long field7678 = this.field7680; field7678 < Class8983.method31980(this.field7682); ++field7678) {
                final long n3 = 2L * field7678;
                final long n4 = 2L * (Class8983.method31980(this.field7682) - field7678);
                this.field7681.method171(n3, this.field7681.method137(n4));
                this.field7681.method171(n3 + 1L, -this.field7681.method137(n4 + 1L));
                final long n5 = n + n3;
                final long n6 = n2 - n3;
                this.field7681.method171(n5, this.field7681.method137(n6));
                this.field7681.method171(n5 + 1L, -this.field7681.method137(n6 + 1L));
            }
        }
    }
}
