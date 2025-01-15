// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8124
{
    public String field33468;
    public int field33469;
    public int field33470;
    public int field33471;
    public float field33472;
    public final boolean field33473;
    
    public Class8124(final String field33468, final int field33469, final int field33470, final int field33471) {
        this.field33472 = 64.0f;
        this.field33469 = field33469;
        this.field33470 = field33470;
        this.field33468 = field33468;
        this.field33471 = field33471;
        this.field33473 = true;
    }
    
    public Class8124(final String field33468, final int field33469, final int n, final int field33470, final int field33471) {
        this.field33472 = 64.0f;
        this.field33469 = field33469;
        this.field33470 = field33470;
        this.field33472 = (float)n;
        this.field33468 = field33468;
        this.field33471 = field33471;
        this.field33473 = false;
    }
    
    public Class8124(final Class4405 class4405) {
        this.field33472 = 64.0f;
        if (class4405.method13269("name")) {
            this.field33468 = class4405.method13268("name");
        }
        if (class4405.method13269("color")) {
            this.field33471 = class4405.method13262("color");
        }
        if (class4405.method13269("x")) {
            this.field33469 = class4405.method13262("x");
        }
        if (class4405.method13269("z")) {
            this.field33470 = class4405.method13262("z");
        }
        this.field33473 = true;
    }
    
    public Class4405 method26749() {
        final Class4405 class4405 = new Class4405();
        class4405.method13301("name", this.field33468);
        class4405.method13298("color", this.field33471);
        class4405.method13298("x", this.field33469);
        class4405.method13298("z", this.field33470);
        return class4405;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final Class8124 class8124 = (Class8124)o;
            if (class8124.field33468.equals(this.field33468)) {
                if (class8124.field33469 == this.field33469) {
                    if (class8124.field33470 == this.field33470) {
                        if (class8124.field33471 == this.field33471) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }
}
