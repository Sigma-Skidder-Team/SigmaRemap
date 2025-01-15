// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7562
{
    private int field29986;
    private byte field29987;
    private short field29988;
    private Class74 field29989;
    
    @Deprecated
    public short method23738() {
        return (short)this.field29986;
    }
    
    @Deprecated
    public void method23739(final short field29986) {
        this.field29986 = field29986;
    }
    
    @Deprecated
    public Class7562(final short field29986, final byte field29987, final short field29988, final Class74 field29989) {
        this.field29986 = field29986;
        this.field29987 = field29987;
        this.field29988 = field29988;
        this.field29989 = field29989;
    }
    
    public int method23740() {
        return this.field29986;
    }
    
    public byte method23741() {
        return this.field29987;
    }
    
    public short method23742() {
        return this.field29988;
    }
    
    public Class74 method23743() {
        return this.field29989;
    }
    
    public void method23744(final int field29986) {
        this.field29986 = field29986;
    }
    
    public void method23745(final byte field29987) {
        this.field29987 = field29987;
    }
    
    public void method23746(final short field29988) {
        this.field29988 = field29988;
    }
    
    public void method23747(final Class74 field29989) {
        this.field29989 = field29989;
    }
    
    public Class7562() {
    }
    
    public Class7562(final int field29986, final byte field29987, final short field29988, final Class74 field29989) {
        this.field29986 = field29986;
        this.field29987 = field29987;
        this.field29988 = field29988;
        this.field29989 = field29989;
    }
    
    @Override
    public String toString() {
        return "Item(identifier=" + this.method23740() + ", amount=" + this.method23741() + ", data=" + this.method23742() + ", tag=" + this.method23743() + ")";
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Class7562)) {
            return false;
        }
        final Class7562 class7562 = (Class7562)o;
        if (!class7562.method23748(this)) {
            return false;
        }
        if (this.method23740() != class7562.method23740()) {
            return false;
        }
        if (this.method23741() != class7562.method23741()) {
            return false;
        }
        if (this.method23742() == class7562.method23742()) {
            final Class74 method23743 = this.method23743();
            final Class74 method23744 = class7562.method23743();
            if (method23743 != null) {
                if (!method23743.equals(method23744)) {
                    return false;
                }
            }
            else if (method23744 != null) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    public boolean method23748(final Object o) {
        return o instanceof Class7562;
    }
    
    @Override
    public int hashCode() {
        final int n = ((1 * 59 + this.method23740()) * 59 + this.method23741()) * 59 + this.method23742();
        final Class74 method23743 = this.method23743();
        return n * 59 + ((method23743 != null) ? method23743.hashCode() : 43);
    }
}
