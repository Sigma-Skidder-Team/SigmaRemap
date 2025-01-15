// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4959 extends Class4943<Class4959>
{
    private static String[] field21265;
    private final Class5770 field21266;
    private boolean field21267;
    
    public Class4959(final Class5770 field21266) {
        this.field21266 = field21266;
    }
    
    public Class4959 method14936() {
        return this;
    }
    
    public Class4959 method14937() {
        this.field21267 = true;
        return this;
    }
    
    @Override
    public Class125 method14888() {
        return new Class133(this.method14892(), this.field21266, this.field21267, null);
    }
}
