// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8181 extends Class8178<Class8181>
{
    public Class8181(final String s, final int n, final int n2) {
        super(s, n, n2);
    }
    
    public Class8181 method27097() {
        try {
            this.field33685.setDoOutput(true);
            this.field33685.setRequestMethod("DELETE");
            this.field33685.connect();
            return this;
        }
        catch (final Exception ex) {
            throw new Class2356(ex.getMessage(), ex);
        }
    }
}
