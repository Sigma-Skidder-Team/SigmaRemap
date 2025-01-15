// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashSet;
import java.util.Set;

public class Class3658 extends Class3643
{
    private static String[] field16937;
    private static final Set<Integer> field16938;
    
    public static Class7220 method11259() {
        return new Class7222(new Class3658());
    }
    
    @Override
    public int method11202(final Class6108 class6108, final Class8322 class6109, final int n) {
        if (this.method11260(class6108, class6109)) {
            return n;
        }
        final Class8322 method27702 = class6109.method27702(Class222.field775);
        if (Class3658.field16938.contains(this.method11205(class6108, method27702)) && this.method11260(class6108, method27702)) {
            return n;
        }
        return 0;
    }
    
    private boolean method11260(final Class6108 class6108, final Class8322 class6109) {
        if (!this.method11261(class6108, class6109, Class222.field773)) {
            if (!this.method11261(class6108, class6109, Class222.field774)) {
                if (!this.method11261(class6108, class6109, Class222.field771)) {
                    if (!this.method11261(class6108, class6109, Class222.field772)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    private boolean method11261(final Class6108 class6108, final Class8322 class6109, final Class222 class6110) {
        return Class8881.field37363.contains(this.method11205(class6108, class6109.method27702(class6110)));
    }
    
    static {
        field16938 = new HashSet<Integer>();
    }
}
