// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1579 extends Class1574
{
    private static String[] field8829;
    public final /* synthetic */ int field8830;
    public final /* synthetic */ Class2082 field8831;
    public final /* synthetic */ Class1758 field8832;
    
    public Class1579(final Class1758 field8832, final String s, final Object[] array, final int field8833, final Class2082 field8834) {
        this.field8832 = field8832;
        this.field8830 = field8833;
        this.field8831 = field8834;
        super(s, array);
    }
    
    @Override
    public void method5660() {
        this.field8832.field9785.method23704(this.field8830, this.field8831);
        synchronized (this.field8832) {
            this.field8832.field9796.remove(this.field8830);
        }
    }
}
