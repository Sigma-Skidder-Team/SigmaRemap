// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6971 implements Class6972
{
    private String field27261;
    
    public Class6971(final String field27261) {
        this.field27261 = field27261;
    }
    
    public String method21396() {
        return this.field27261;
    }
    
    @Override
    public int hashCode() {
        return this.field27261.hashCode();
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof Class6971 && ((Class6971)o).field27261.equals(this.field27261);
    }
    
    @Override
    public String toString() {
        return "[Command=" + this.field27261 + "]";
    }
}
