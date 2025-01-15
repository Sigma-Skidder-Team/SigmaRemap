// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9063
{
    private final boolean field38374;
    private final boolean field38375;
    
    public Class9063(final boolean field38374, final boolean field38375) {
        this.field38374 = field38374;
        this.field38375 = field38375;
    }
    
    public boolean method32636() {
        return this.field38374;
    }
    
    public boolean method32637() {
        return this.field38375;
    }
    
    public boolean method32638() {
        return !this.field38374 && !this.field38375;
    }
    
    @Override
    public String toString() {
        return "implicit=[" + this.field38374 + ", " + this.field38375 + "]";
    }
}
