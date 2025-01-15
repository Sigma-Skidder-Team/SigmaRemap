// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class639 extends Class623<Class639>
{
    public final /* synthetic */ Class613 field3638;
    
    private Class639(final Class613 field3638) {
        this.field3638 = field3638;
    }
    
    @Override
    public void method3467(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b, final float n8) {
        final Item class3820 = Class691.method3870(this.field3638.field3583).field3579.get(n);
        Class691.method3871(this.field3638.field3583, n3 + 40, n2, class3820);
        for (int i = 0; i < Class691.method3870(this.field3638.field3583).field3575.size(); ++i) {
            Class9455<?> method8449;
            if (!(class3820 instanceof Class4036)) {
                method8449 = null;
            }
            else {
                method8449 = Class691.method3870(this.field3638.field3583).field3575.get(i).method8449(((Class4036)class3820).method12240());
            }
            this.method3668(method8449, n3 + Class691.method3868(this.field3638.field3583, i), n2, n % 2 == 0);
        }
        for (int j = 0; j < Class691.method3870(this.field3638.field3583).field3576.size(); ++j) {
            this.method3668(Class691.method3870(this.field3638.field3583).field3576.get(j).method8449((Object)class3820), n3 + Class691.method3868(this.field3638.field3583, j + Class691.method3870(this.field3638.field3583).field3575.size()), n2, n % 2 == 0);
        }
    }
    
    public void method3668(final Class9455<?> class9455, final int n, final int n2, final boolean b) {
        final String s = (class9455 != null) ? class9455.method35136(Class691.method3867(this.field3638.field3583).method23091(class9455)) : "-";
        this.field3638.method3297(this.field3638.field3583.field3156, s, n - this.field3638.field3583.field3156.method6617(s), n2 + 5, b ? 16777215 : 9474192);
    }
}
