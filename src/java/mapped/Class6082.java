// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6082
{
    private int field24695;
    private int field24696;
    public final /* synthetic */ Class6647 field24697;
    
    public int method18137() {
        return this.field24695;
    }
    
    public int method18138() {
        return this.field24696;
    }
    
    public void method18139(final int field24695) {
        this.field24695 = field24695;
    }
    
    public void method18140(final int field24696) {
        this.field24696 = field24696;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Class6082) {
            final Class6082 class6082 = (Class6082)o;
            return class6082.method18141(this) && this.method18137() == class6082.method18137() && this.method18138() == class6082.method18138();
        }
        return false;
    }
    
    public boolean method18141(final Object o) {
        return o instanceof Class6082;
    }
    
    @Override
    public int hashCode() {
        return (1 * 59 + this.method18137()) * 59 + this.method18138();
    }
    
    @Override
    public String toString() {
        return "BlockStorage.ReplacementData(original=" + this.method18137() + ", replacement=" + this.method18138() + ")";
    }
    
    public Class6082(final Class6647 field24697, final int field24698, final int field24699) {
        this.field24697 = field24697;
        this.field24695 = field24698;
        this.field24696 = field24699;
    }
}
