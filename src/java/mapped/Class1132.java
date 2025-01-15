// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1132 implements Runnable
{
    private static String[] field6119;
    public final /* synthetic */ long field6120;
    public final /* synthetic */ long field6121;
    public final /* synthetic */ long field6122;
    public final /* synthetic */ Class17 field6123;
    public final /* synthetic */ boolean field6124;
    public final /* synthetic */ Class8983 field6125;
    
    public Class1132(final Class8983 field6125, final long field6126, final long field6127, final long field6128, final Class17 field6129, final boolean field6130) {
        this.field6125 = field6125;
        this.field6120 = field6126;
        this.field6121 = field6127;
        this.field6122 = field6128;
        this.field6123 = field6129;
        this.field6124 = field6130;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(2L * Class8983.method31978(this.field6125), false);
        for (long field6120 = this.field6120; field6120 < this.field6121; ++field6120) {
            final long n = 2L * field6120;
            for (long n2 = 0L; n2 < Class8983.method31978(this.field6125); ++n2) {
                final long n3 = 2L * n2;
                final long n4 = n2 * this.field6122 + n;
                class17.method171(n3, this.field6123.method137(n4));
                class17.method171(n3 + 1L, this.field6123.method137(n4 + 1L));
            }
            Class8983.method31977(this.field6125).method26077(class17, this.field6124);
            for (long n5 = 0L; n5 < Class8983.method31978(this.field6125); ++n5) {
                final long n6 = 2L * n5;
                final long n7 = n5 * this.field6122 + n;
                this.field6123.method171(n7, class17.method137(n6));
                this.field6123.method171(n7 + 1L, class17.method137(n6 + 1L));
            }
        }
    }
}
