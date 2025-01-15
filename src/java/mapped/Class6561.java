// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class6561 extends Class6560
{
    private static String[] field26061;
    private boolean field26062;
    
    public Class6561(final int n, final int n2, final boolean b, final int n3, final Class7668[] array, final int[] array2, final List<Class74> list) {
        super(n, n2, b, n3, array, array2, list);
        this.field26062 = false;
    }
    
    public Class6561(final int n, final int n2) {
        this(n, n2, true, 0, new Class7668[16], null, new ArrayList<Class74>());
        this.field26062 = true;
    }
    
    public boolean method19902() {
        return this.field26058 != null && this.field26055;
    }
    
    @Override
    public boolean method19884() {
        return this.field26058 != null;
    }
    
    public boolean method19903() {
        return this.field26062;
    }
}
