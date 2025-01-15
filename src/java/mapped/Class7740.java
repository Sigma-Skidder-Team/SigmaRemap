// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7740
{
    private Class7356[] field31638;
    
    public Class7740() {
        this.field31638 = new Class7356[0];
    }
    
    public Class7740(final Class7356 class7356) {
        this.field31638 = new Class7356[0];
        this.method24696(class7356);
    }
    
    public void method24696(final Class7356 class7356) {
        this.field31638 = (Class7356[])Class8571.method28982(this.field31638, class7356);
    }
    
    public boolean method24697(final int n) {
        for (int i = 0; i < this.field31638.length; ++i) {
            if (this.field31638[i].method22597(n)) {
                return true;
            }
        }
        return false;
    }
    
    public int method24698() {
        return this.field31638.length;
    }
    
    public Class7356 method24699(final int n) {
        return this.field31638[n];
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < this.field31638.length; ++i) {
            final Class7356 class7356 = this.field31638[i];
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(class7356.toString());
        }
        sb.append("]");
        return sb.toString();
    }
}
