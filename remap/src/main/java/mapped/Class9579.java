// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9579
{
    private static String[] field41739;
    private float field41740;
    private float field41741;
    private float[] field41742;
    public final /* synthetic */ Class2425 field41743;
    
    public Class9579(final Class2425 field41743, final float field41744, final float field41745) {
        this.field41743 = field41743;
        this.field41740 = field41744;
        this.field41741 = field41745;
        this.field41742 = new float[] { field41744, field41745 };
    }
    
    public float method35881() {
        return this.field41740;
    }
    
    public float method35882() {
        return this.field41741;
    }
    
    public float[] method35883() {
        return this.field41742;
    }
    
    @Override
    public int hashCode() {
        return (int)(this.field41740 * this.field41741 * 31.0f);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof Class9579)) {
            return false;
        }
        final Class9579 class9579 = (Class9579)o;
        return class9579.field41740 == this.field41740 && class9579.field41741 == this.field41741;
    }
}
