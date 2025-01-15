// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6326 extends Class6322
{
    private final boolean field25322;
    private final boolean field25323;
    
    public Class6326(final boolean field25322, final boolean field25323) {
        super("write_mask_state", () -> {
            if (!b) {
                Class8726.method30010(b);
            }
            if (!b2) {
                Class8726.method30049(b2, b2, b2, b2);
            }
            return;
        }, () -> {
            if (!b3) {
                Class8726.method30010(true);
            }
            if (!b4) {
                Class8726.method30049(true, true, true, true);
            }
            return;
        });
        this.field25322 = field25322;
        this.field25323 = field25323;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final Class6326 class6326 = (Class6326)o;
            return this.field25322 == class6326.field25322 && this.field25323 == class6326.field25323;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return Class7827.method25282(this.field25322, this.field25323);
    }
}
