// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Comparator;

public class Class4467 implements Comparator<Class3820>
{
    private static String[] field19825;
    public final /* synthetic */ Class613 field19826;
    
    private Class4467(final Class613 field19826) {
        this.field19826 = field19826;
    }
    
    @Override
    public int compare(final Class3820 class3820, final Class3820 class3821) {
        int method23090;
        int method23091;
        if (this.field19826.field3581 != null) {
            if (!this.field19826.field3575.contains(this.field19826.field3581)) {
                final Class2248<?> field3581 = this.field19826.field3581;
                method23090 = Class691.method3867(this.field19826.field3583).method23090(field3581, class3820);
                method23091 = Class691.method3867(this.field19826.field3583).method23090(field3581, class3821);
            }
            else {
                final Class2248<?> field3582 = this.field19826.field3581;
                method23090 = ((class3820 instanceof Class4036) ? Class691.method3867(this.field19826.field3583).method23090(field3582, ((Class4036)class3820).method12240()) : -1);
                method23091 = ((class3821 instanceof Class4036) ? Class691.method3867(this.field19826.field3583).method23090(field3582, ((Class4036)class3821).method12240()) : -1);
            }
        }
        else {
            method23090 = 0;
            method23091 = 0;
        }
        return (method23090 != method23091) ? (this.field19826.field3582 * Integer.compare(method23090, method23091)) : (this.field19826.field3582 * Integer.compare(Class3820.method11696(class3820), Class3820.method11696(class3821)));
    }
}
