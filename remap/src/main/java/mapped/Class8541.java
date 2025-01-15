// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8541
{
    private String field35859;
    private Class2114 field35860;
    private Class327 field35861;
    private Class5147 field35862;
    
    public Class8541(final String field35859, final Class2114 field35860, final Class327 field35861) {
        this.field35859 = field35859;
        this.field35860 = field35860;
        this.field35861 = field35861;
        this.field35862 = field35860.method8241(field35859);
    }
    
    public void method28649(final int n) {
        this.field35862.method16078(n);
    }
    
    public void method28650() {
        if (this.field35862.method16084()) {
            try {
                this.field35860.method8242(this.field35861, this.field35862);
            }
            catch (final RuntimeException ex) {
                Class8885.method31270("Error updating custom uniform: " + this.field35862.method16081());
                Class8885.method31270(ex.getClass().getName() + ": " + ex.getMessage());
                this.field35862.method16085();
                Class8885.method31270("Custom uniform disabled: " + this.field35862.method16081());
            }
        }
    }
    
    public void method28651() {
        this.field35862.method16086();
    }
    
    public String method28652() {
        return this.field35859;
    }
    
    public Class2114 method28653() {
        return this.field35860;
    }
    
    public Class327 method28654() {
        return this.field35861;
    }
    
    public Class5147 method28655() {
        return this.field35862;
    }
    
    @Override
    public String toString() {
        return this.field35860.name().toLowerCase() + " " + this.field35859;
    }
}
