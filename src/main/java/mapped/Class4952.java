// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4952 extends Class4943<Class4952>
{
    private static String[] field21246;
    private final Class5772 field21247;
    private int field21248;
    
    public Class4952(final Class5772 field21247) {
        this.field21248 = 0;
        this.field21247 = field21247;
    }
    
    public Class4952 method14919() {
        return this;
    }
    
    public Class4952 method14920(final int field21248) {
        this.field21248 = field21248;
        return this;
    }
    
    @Override
    public Class125 method14888() {
        return new Class138(this.method14892(), this.field21247, this.field21248, null);
    }
}
