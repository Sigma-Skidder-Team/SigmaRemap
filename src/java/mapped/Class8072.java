// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8072
{
    private int field33258;
    
    public boolean method26490() {
        ++this.field33258;
        return this.field33258 == 1;
    }
    
    public boolean method26491() {
        if (this.field33258 > 0) {
            --this.field33258;
            return this.field33258 == 0;
        }
        return false;
    }
    
    public boolean method26492() {
        return this.field33258 > 0;
    }
    
    public int method26493() {
        return this.field33258;
    }
    
    @Override
    public String toString() {
        return "lockCount: " + this.field33258;
    }
}
