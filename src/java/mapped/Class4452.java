// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Comparator;

public class Class4452 implements Comparator<Class8131>
{
    private static String[] field19800;
    public final /* synthetic */ Class8866 field19801;
    
    public Class4452(final Class8866 field19801) {
        this.field19801 = field19801;
    }
    
    @Override
    public int compare(final Class8131 class8131, final Class8131 class8132) {
        final Class399 method26798 = class8131.method26798();
        final Class399 method26799 = class8132.method26798();
        final float method26800 = Class8845.method30918(Class8845.method30922(method26798).field32884, this.field19801.field37269.field4684.field2399);
        final float method26801 = Class8845.method30918(Class8845.method30922(method26799).field32884, this.field19801.field37269.field4684.field2399);
        if (method26800 - method26801 < 0.0f) {
            return -1;
        }
        if (method26800 - method26801 != 0.0f) {
            return 1;
        }
        final float method26802 = this.field19801.field37269.field4684.method1732(method26798);
        final float method26803 = this.field19801.field37269.field4684.method1732(method26799);
        if (method26802 - method26803 < 0.0f) {
            return -1;
        }
        if (method26802 - method26803 != 0.0f) {
            return 1;
        }
        return 0;
    }
}
