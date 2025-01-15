// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Comparator;

public class Class4458 implements Comparator<Class8131>
{
    private static String[] field19809;
    public final /* synthetic */ Class8866 field19810;
    
    public Class4458(final Class8866 field19810) {
        this.field19810 = field19810;
    }
    
    @Override
    public int compare(final Class8131 class8131, final Class8131 class8132) {
        final Class399 method26798 = class8131.method26798();
        final Class399 method26799 = class8132.method26798();
        final int n = (method26798 instanceof Class512) ? Class8639.method29348((Class512)method26798) : 0;
        final int n2 = (method26799 instanceof Class512) ? Class8639.method29348((Class512)method26799) : 0;
        if (n - n2 < 0) {
            return -1;
        }
        if (n - n2 != 0) {
            return 1;
        }
        final float method26800 = this.field19810.field37269.field4684.method1732(method26798);
        final float method26801 = this.field19810.field37269.field4684.method1732(method26799);
        if (method26800 - method26801 < 0.0f) {
            return -1;
        }
        if (method26800 - method26801 != 0.0f) {
            return 1;
        }
        return 0;
    }
}
