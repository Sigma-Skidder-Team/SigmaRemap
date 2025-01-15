// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.BooleanSupplier;

public class Class351 extends Class350
{
    private static String[] field2164;
    private final BooleanSupplier field2165;
    
    public Class351(final String s, final int n, final String s2, final BooleanSupplier field2165) {
        super(s, Class2136.field12467, n, s2);
        this.field2165 = field2165;
    }
    
    @Override
    public void method1071(final boolean b) {
        if (!this.field2165.getAsBoolean()) {
            super.method1071(b);
        }
        else if (b) {
            super.method1071(!this.method1056());
        }
    }
}
