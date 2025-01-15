// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8180 extends Class8178<Class8180>
{
    public Class8180(final String s, final int n, final int n2) {
        super(s, n, n2);
    }
    
    public Class8180 method27096() {
        try {
            this.field33685.setDoInput(true);
            this.field33685.setDoOutput(true);
            this.field33685.setUseCaches(false);
            this.field33685.setRequestMethod("GET");
            return this;
        }
        catch (final Exception ex) {
            throw new Class2356(ex.getMessage(), ex);
        }
    }
}
