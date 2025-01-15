// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1095 implements Runnable
{
    private static String[] field5907;
    public final /* synthetic */ long field5908;
    public final /* synthetic */ long field5909;
    public final /* synthetic */ Class22 field5910;
    public final /* synthetic */ boolean field5911;
    public final /* synthetic */ Class5934 field5912;
    
    public Class1095(final Class5934 field5912, final long field5913, final long field5914, final Class22 field5915, final boolean field5916) {
        this.field5912 = field5912;
        this.field5908 = field5913;
        this.field5909 = field5914;
        this.field5910 = field5915;
        this.field5911 = field5916;
    }
    
    @Override
    public void run() {
        for (long field5908 = this.field5908; field5908 < this.field5909; ++field5908) {
            final long n = field5908 * Class5934.method17848(this.field5912);
            for (long n2 = 0L; n2 < Class5934.method17845(this.field5912); ++n2) {
                Class5934.method17840(this.field5912).method30452(this.field5910, n + n2 * Class5934.method17849(this.field5912), this.field5911);
            }
        }
    }
}
