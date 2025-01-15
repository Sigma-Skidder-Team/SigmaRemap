// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1081 implements Runnable
{
    private static String[] field5827;
    public final /* synthetic */ long field5828;
    public final /* synthetic */ long field5829;
    public final /* synthetic */ Class22 field5830;
    public final /* synthetic */ boolean field5831;
    public final /* synthetic */ Class9117 field5832;
    
    public Class1081(final Class9117 field5832, final long field5833, final long field5834, final Class22 field5835, final boolean field5836) {
        this.field5832 = field5832;
        this.field5828 = field5833;
        this.field5829 = field5834;
        this.field5830 = field5835;
        this.field5831 = field5836;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(Class9117.method33014(this.field5832), false);
        for (long field5828 = this.field5828; field5828 < this.field5829; ++field5828) {
            final long n = field5828 * Class9117.method33012(this.field5832);
            for (long n2 = 0L; n2 < Class9117.method33013(this.field5832); ++n2) {
                for (long n3 = 0L; n3 < Class9117.method33014(this.field5832); ++n3) {
                    class22.method169(n3, this.field5830.method135(n3 * Class9117.method33010(this.field5832) + n + n2));
                }
                Class9117.method33009(this.field5832).method29694(class22, this.field5831);
                for (long n4 = 0L; n4 < Class9117.method33014(this.field5832); ++n4) {
                    this.field5830.method169(n4 * Class9117.method33010(this.field5832) + n + n2, class22.method135(n4));
                }
            }
        }
    }
}
