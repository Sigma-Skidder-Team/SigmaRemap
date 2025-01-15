// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class293 implements Class292
{
    field1673;
    
    @Override
    public int method943(final Class6433 class6433, final int n, final int n2) {
        final double method28343 = class6433.method19190().method28343(n / 8.0, n2 / 8.0, 0.0, 0.0, 0.0);
        if (method28343 > 0.4) {
            return Class7983.field32846;
        }
        if (method28343 > 0.2) {
            return Class7983.field32847;
        }
        if (method28343 >= -0.4) {
            return (method28343 >= -0.2) ? Class7983.field32848 : Class7983.field32849;
        }
        return Class7983.field32850;
    }
}
