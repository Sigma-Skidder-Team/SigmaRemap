// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5469 implements Class5470
{
    private static String[] field22739;
    private final long field22740;
    private final Class9505 field22741;
    private Class7068 field22742;
    
    public Class5469(final WorldInfo class8660) {
        this.field22742 = new Class7068();
        this.field22740 = class8660.getSeed();
        this.field22741 = class8660.method29570();
    }
    
    public Class5469 method16705(final Class7068 field22742) {
        this.field22742 = field22742;
        return this;
    }
    
    public long method16706() {
        return this.field22740;
    }
    
    public Class9505 method16707() {
        return this.field22741;
    }
    
    public Class7068 method16708() {
        return this.field22742;
    }
}
