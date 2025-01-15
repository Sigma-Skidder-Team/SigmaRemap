// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class5233
{
    private final Class2314 field22255;
    private final Class2314 field22256;
    
    public Class5233(final Class2314 field22255, final Class2314 field22256) {
        if (field22255 != null && field22256 != null) {
            this.field22255 = field22255;
            this.field22256 = field22256;
            return;
        }
        throw new Class2386("Token requires marks.");
    }
    
    public Class2314 method16348() {
        return this.field22255;
    }
    
    public Class2314 method16349() {
        return this.field22256;
    }
    
    public abstract Class2207 method16347();
}
