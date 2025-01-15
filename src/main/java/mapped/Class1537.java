// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1537 implements Runnable
{
    private static String[] field8586;
    public final /* synthetic */ long field8587;
    public final /* synthetic */ long field8588;
    public final /* synthetic */ Class20 field8589;
    public final /* synthetic */ long field8590;
    public final /* synthetic */ Object[] field8591;
    public final /* synthetic */ int field8592;
    
    public Class1537(final long field8587, final long field8588, final Class20 field8589, final long field8590, final Object[] field8591, final int field8592) {
        this.field8587 = field8587;
        this.field8588 = field8588;
        this.field8589 = field8589;
        this.field8590 = field8590;
        this.field8591 = field8591;
        this.field8592 = field8592;
    }
    
    @Override
    public void run() {
        for (long field8587 = this.field8587; field8587 < this.field8588; ++field8587) {
            this.field8589.method154(this.field8590 + field8587, this.field8591[this.field8592 + (int)field8587]);
        }
    }
}
