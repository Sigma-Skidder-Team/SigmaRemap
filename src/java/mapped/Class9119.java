// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9119
{
    private short field38638;
    private short field38639;
    private int field38640;
    
    public short method33015() {
        return this.field38638;
    }
    
    public short method33016() {
        return this.field38639;
    }
    
    public int method33017() {
        return this.field38640;
    }
    
    public void method33018(final short field38638) {
        this.field38638 = field38638;
    }
    
    public void method33019(final short field38639) {
        this.field38639 = field38639;
    }
    
    public void method33020(final int field38640) {
        this.field38640 = field38640;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Class9119) {
            final Class9119 class9119 = (Class9119)o;
            return class9119.method33021(this) && this.method33015() == class9119.method33015() && this.method33016() == class9119.method33016() && this.method33017() == class9119.method33017();
        }
        return false;
    }
    
    public boolean method33021(final Object o) {
        return o instanceof Class9119;
    }
    
    @Override
    public int hashCode() {
        return ((1 * 59 + this.method33015()) * 59 + this.method33016()) * 59 + this.method33017();
    }
    
    @Override
    public String toString() {
        return "BlockChangeRecord(horizontal=" + this.method33015() + ", y=" + this.method33016() + ", blockId=" + this.method33017() + ")";
    }
    
    public Class9119(final short field38638, final short field38639, final int field38640) {
        this.field38638 = field38638;
        this.field38639 = field38639;
        this.field38640 = field38640;
    }
}
