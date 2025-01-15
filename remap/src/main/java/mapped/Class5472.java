// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5472 implements Class5470
{
    private static String[] field22745;
    private Class3090[] field22746;
    private int field22747;
    
    public Class5472(final WorldInfo class8660) {
        this.field22746 = new Class3090[] { Class7102.field27633 };
        this.field22747 = 1;
    }
    
    public Class5472 method16711(final Class3090[] field22746) {
        this.field22746 = field22746;
        return this;
    }
    
    public Class5472 method16712(final int field22747) {
        this.field22747 = field22747;
        return this;
    }
    
    public Class3090[] method16713() {
        return this.field22746;
    }
    
    public int method16714() {
        return this.field22747;
    }
}
