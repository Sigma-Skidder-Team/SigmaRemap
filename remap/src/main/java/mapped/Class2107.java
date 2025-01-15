// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class2107
{
    field12213(0, 0.0, 0.0, 0.0), 
    field12214(1, 0.7, 0.7, 0.8), 
    field12215(2, 0.4, 0.3, 0.35), 
    field12216(3, 0.7, 0.5, 0.2), 
    field12217(4, 0.3, 0.3, 0.8), 
    field12218(5, 0.1, 0.1, 0.2);
    
    private final int field12219;
    private final double[] field12220;
    
    private Class2107(final int field12219, final double n, final double n2, final double n3) {
        this.field12219 = field12219;
        this.field12220 = new double[] { n, n2, n3 };
    }
    
    public static Class2107 method8227(final int n) {
        for (final Class2107 class2107 : values()) {
            if (n == class2107.field12219) {
                return class2107;
            }
        }
        return Class2107.field12213;
    }
}
