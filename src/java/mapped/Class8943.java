// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8943
{
    private final String field37631;
    private final String field37632;
    
    public Class8943(final String field37631, final Object o) {
        this.field37631 = field37631;
        if (o != null) {
            if (!(o instanceof Throwable)) {
                this.field37632 = o.toString();
            }
            else {
                final Throwable t = (Throwable)o;
                this.field37632 = "~~ERROR~~ " + t.getClass().getSimpleName() + ": " + t.getMessage();
            }
        }
        else {
            this.field37632 = "~~NULL~~";
        }
    }
    
    public String method31734() {
        return this.field37631;
    }
    
    public String method31735() {
        return this.field37632;
    }
}
