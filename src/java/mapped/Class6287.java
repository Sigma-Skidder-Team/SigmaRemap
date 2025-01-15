// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class6287
{
    private final Class2314 field25154;
    private final Class2314 field25155;
    
    public Class6287(final Class2314 field25154, final Class2314 field25155) {
        this.field25154 = field25154;
        this.field25155 = field25155;
    }
    
    @Override
    public String toString() {
        return "<" + this.getClass().getName() + "(" + this.method18617() + ")>";
    }
    
    public Class2314 method18615() {
        return this.field25154;
    }
    
    public Class2314 method18616() {
        return this.field25155;
    }
    
    public String method18617() {
        return "";
    }
    
    public abstract boolean method18614(final Class2211 p0);
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof Class6287 && this.toString().equals(o.toString());
    }
    
    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }
}
