// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class643 extends Class623<Class643>
{
    private static String[] field3652;
    private final Class1947 field3653;
    public final /* synthetic */ Class610 field3654;
    
    public Class643(final Class610 field3654, final Class1947 field3655) {
        this.field3654 = field3654;
        this.field3653 = field3655;
    }
    
    @Override
    public void method3467(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b, final float n8) {
        this.field3654.field3564.font.method6625(true);
        this.field3654.drawCenteredString(this.field3654.field3564.font, this.field3653.toString(), Class610.method3571(this.field3654) / 2, n2 + 1, 16777215);
        this.field3654.field3564.font.method6625(Class704.method3907(this.field3654.field3564).method5845().method7903());
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        if (n3 != 0) {
            return false;
        }
        this.method3686();
        return true;
    }
    
    private void method3686() {
        this.field3654.method3570(this);
    }
}
