// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1564 implements Runnable
{
    private static String[] field8753;
    public final /* synthetic */ long field8754;
    public final /* synthetic */ long field8755;
    public final /* synthetic */ Class20 field8756;
    public final /* synthetic */ long field8757;
    public final /* synthetic */ Class20 field8758;
    public final /* synthetic */ long field8759;
    
    public Class1564(final long field8754, final long field8755, final Class20 field8756, final long field8757, final Class20 field8758, final long field8759) {
        this.field8754 = field8754;
        this.field8755 = field8755;
        this.field8756 = field8756;
        this.field8757 = field8757;
        this.field8758 = field8758;
        this.field8759 = field8759;
    }
    
    @Override
    public void run() {
        for (long field8754 = this.field8754; field8754 < this.field8755; ++field8754) {
            this.field8756.method154(this.field8757 + field8754, this.field8758.method120(this.field8759 + field8754));
        }
    }
}
