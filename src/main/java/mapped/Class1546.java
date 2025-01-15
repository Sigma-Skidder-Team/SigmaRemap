// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1546 implements Runnable
{
    private static String[] field8633;
    public final /* synthetic */ long field8634;
    public final /* synthetic */ long field8635;
    public final /* synthetic */ Class22 field8636;
    public final /* synthetic */ Class5934 field8637;
    
    public Class1546(final Class5934 field8637, final long field8638, final long field8639, final Class22 field8640) {
        this.field8637 = field8637;
        this.field8634 = field8638;
        this.field8635 = field8639;
        this.field8636 = field8640;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(Class5934.method17847(this.field8637), false);
        for (long field8634 = this.field8634; field8634 < this.field8635; ++field8634) {
            final long n = field8634 * Class5934.method17839(this.field8637);
            for (long n2 = 0L; n2 < Class5934.method17846(this.field8637); ++n2) {
                for (long n3 = 0L; n3 < Class5934.method17847(this.field8637); ++n3) {
                    class22.method169(n3, this.field8636.method135(n3 * Class5934.method17837(this.field8637) + n + n2));
                }
                Class5934.method17844(this.field8637).method30446(class22);
                for (long n4 = 0L; n4 < Class5934.method17847(this.field8637); ++n4) {
                    this.field8636.method169(n4 * Class5934.method17837(this.field8637) + n + n2, class22.method135(n4));
                }
            }
        }
    }
}
