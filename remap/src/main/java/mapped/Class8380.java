// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8380
{
    private Class6772[] field34359;
    private int field34360;
    
    public Class8380() {
        this.field34359 = new Class6772[128];
    }
    
    public Class6772 method27923(final Class6772 class6772) {
        if (class6772.field26593 < 0) {
            if (this.field34360 == this.field34359.length) {
                final Class6772[] field34359 = new Class6772[this.field34360 << 1];
                System.arraycopy(this.field34359, 0, field34359, 0, this.field34360);
                this.field34359 = field34359;
            }
            this.field34359[this.field34360] = class6772;
            class6772.field26593 = this.field34360;
            this.method27927(this.field34360++);
            return class6772;
        }
        throw new IllegalStateException("OW KNOWS!");
    }
    
    public void method27924() {
        this.field34360 = 0;
    }
    
    public Class6772 method27925() {
        final Class6772 class6772 = this.field34359[0];
        final Class6772[] field34359 = this.field34359;
        final int n = 0;
        final Class6772[] field34360 = this.field34359;
        final int field34361 = this.field34360 - 1;
        this.field34360 = field34361;
        field34359[n] = field34360[field34361];
        this.field34359[this.field34360] = null;
        if (this.field34360 > 0) {
            this.method27928(0);
        }
        class6772.field26593 = -1;
        return class6772;
    }
    
    public void method27926(final Class6772 class6772, final float field26596) {
        final float field26597 = class6772.field26596;
        class6772.field26596 = field26596;
        if (field26596 >= field26597) {
            this.method27928(class6772.field26593);
        }
        else {
            this.method27927(class6772.field26593);
        }
    }
    
    private void method27927(int i) {
        final Class6772 class6772 = this.field34359[i];
        final float field26596 = class6772.field26596;
        while (i > 0) {
            final int n = i - 1 >> 1;
            final Class6772 class6773 = this.field34359[n];
            if (field26596 >= class6773.field26596) {
                break;
            }
            this.field34359[i] = class6773;
            class6773.field26593 = i;
            i = n;
        }
        this.field34359[i] = class6772;
        class6772.field26593 = i;
    }
    
    private void method27928(int field26593) {
        final Class6772 class6772 = this.field34359[field26593];
        final float field26594 = class6772.field26596;
        while (true) {
            final int n = 1 + (field26593 << 1);
            final int n2 = n + 1;
            if (n >= this.field34360) {
                break;
            }
            final Class6772 class6773 = this.field34359[n];
            final float field26595 = class6773.field26596;
            Class6772 class6774;
            float field26596;
            if (n2 < this.field34360) {
                class6774 = this.field34359[n2];
                field26596 = class6774.field26596;
            }
            else {
                class6774 = null;
                field26596 = Float.POSITIVE_INFINITY;
            }
            if (field26595 >= field26596) {
                if (field26596 >= field26594) {
                    break;
                }
                this.field34359[field26593] = class6774;
                class6774.field26593 = field26593;
                field26593 = n2;
            }
            else {
                if (field26595 >= field26594) {
                    break;
                }
                this.field34359[field26593] = class6773;
                class6773.field26593 = field26593;
                field26593 = n;
            }
        }
        this.field34359[field26593] = class6772;
        class6772.field26593 = field26593;
    }
    
    public boolean method27929() {
        return this.field34360 == 0;
    }
}
