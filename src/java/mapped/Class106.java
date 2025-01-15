// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class106 implements Class103
{
    field327("up"), 
    field328("side"), 
    field329("none");
    
    private final String field330;
    
    private Class106(final String field330) {
        this.field330 = field330;
    }
    
    @Override
    public String toString() {
        return this.method596();
    }
    
    @Override
    public String method596() {
        return this.field330;
    }
}
