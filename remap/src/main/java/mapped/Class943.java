// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class943 implements Runnable
{
    private static String[] field4975;
    public final /* synthetic */ long field4976;
    public final /* synthetic */ long field4977;
    public final /* synthetic */ Class22 field4978;
    public final /* synthetic */ boolean field4979;
    public final /* synthetic */ Class9117 field4980;
    
    public Class943(final Class9117 field4980, final long field4981, final long field4982, final Class22 field4983, final boolean field4984) {
        this.field4980 = field4980;
        this.field4976 = field4981;
        this.field4977 = field4982;
        this.field4978 = field4983;
        this.field4979 = field4984;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(Class9117.method33014(this.field4980), false);
        for (long field4976 = this.field4976; field4976 < this.field4977; ++field4976) {
            final long n = field4976 * Class9117.method33012(this.field4980);
            for (long n2 = 0L; n2 < Class9117.method33013(this.field4980); ++n2) {
                for (long n3 = 0L; n3 < Class9117.method33014(this.field4980); ++n3) {
                    class22.method169(n3, this.field4978.method135(n3 * Class9117.method33010(this.field4980) + n + n2));
                }
                Class9117.method33009(this.field4980).method29690(class22, this.field4979);
                for (long n4 = 0L; n4 < Class9117.method33014(this.field4980); ++n4) {
                    this.field4978.method169(n4 * Class9117.method33010(this.field4980) + n + n2, class22.method135(n4));
                }
            }
        }
    }
}
