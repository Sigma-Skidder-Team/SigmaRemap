// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6768
{
    private int field26579;
    private int field26580;
    private int field26581;
    
    public Class6768(final int field26579, final int field26580, final int field26581) {
        this.field26579 = field26579;
        this.field26580 = field26580;
        this.field26581 = field26581;
    }
    
    public int method20640() {
        return this.field26579;
    }
    
    public int method20641() {
        return this.field26580;
    }
    
    public int method20642() {
        return this.field26581;
    }
    
    public void method20643(final int field26579) {
        this.field26579 = field26579;
    }
    
    public void method20644(final int field26580) {
        this.field26580 = field26580;
    }
    
    public void method20645(final int field26581) {
        this.field26581 = field26581;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Class6768) {
            final Class6768 class6768 = (Class6768)o;
            return class6768.method20646(this) && this.method20640() == class6768.method20640() && this.method20641() == class6768.method20641() && this.method20642() == class6768.method20642();
        }
        return false;
    }
    
    public boolean method20646(final Object o) {
        return o instanceof Class6768;
    }
    
    @Override
    public int hashCode() {
        return ((59 + this.method20640()) * 59 + this.method20641()) * 59 + this.method20642();
    }
    
    @Override
    public String toString() {
        return "VillagerData(type=" + this.method20640() + ", profession=" + this.method20641() + ", level=" + this.method20642() + ")";
    }
}
