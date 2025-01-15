// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class8352
{
    private final String field34277;
    private final String field34278;
    
    public Class8352(final String field34277, final String field34278) {
        if (field34278 != null) {
            this.field34277 = field34277;
            this.field34278 = field34278;
            return;
        }
        throw new NullPointerException("Suffix must be provided.");
    }
    
    public String method27873() {
        return this.field34277;
    }
    
    public String method27874() {
        return this.field34278;
    }
}
