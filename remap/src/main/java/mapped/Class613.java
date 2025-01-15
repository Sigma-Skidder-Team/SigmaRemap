// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Set;
import com.google.common.collect.Sets;
import com.google.common.collect.Lists;
import net.minecraft.util.text.ITextComponent;

import java.util.Comparator;
import java.util.List;

public class Class613 extends Class608<Class639>
{
    private static String[] field3574;
    public final List<Class2248<Class3833>> field3575;
    public final List<Class2248<Class3820>> field3576;
    private final int[] field3577;
    public int field3578;
    public final List<Class3820> field3579;
    public final Comparator<Class3820> field3580;
    public Class2248<?> field3581;
    public int field3582;
    public final /* synthetic */ Class691 field3583;
    
    public Class613(final Class691 field3583, final Class869 class869) {
        this.field3583 = field3583;
        super(class869, field3583.field3152, field3583.field3153, 32, field3583.field3153 - 64, 20);
        this.field3577 = new int[] { 3, 4, 1, 2, 5, 6 };
        this.field3578 = -1;
        this.field3580 = new Class4467(this, null);
        (this.field3575 = Lists.newArrayList()).add(Class8276.field33979);
        this.field3576 = Lists.newArrayList((Object[])new Class2248[] { Class8276.field33982, Class8276.field33980, Class8276.field33981, Class8276.field33983, Class8276.field33984 });
        this.method3528(true, 20);
        final Set identityHashSet = Sets.newIdentityHashSet();
        for (final Class3820 class870 : Class90.field211) {
            int n = 0;
            for (final Class2248 class871 : this.field3576) {
                if (!class871.method8446(class870)) {
                    continue;
                }
                if (Class691.method3867(field3583).method23091(class871.method8449(class870)) <= 0) {
                    continue;
                }
                n = 1;
            }
            if (n == 0) {
                continue;
            }
            identityHashSet.add(class870);
        }
        for (final Class3833 class872 : Class90.field208) {
            int n2 = 0;
            for (final Class2248 class873 : this.field3575) {
                if (!class873.method8446(class872)) {
                    continue;
                }
                if (Class691.method3867(field3583).method23091(class873.method8449(class872)) <= 0) {
                    continue;
                }
                n2 = 1;
            }
            if (n2 == 0) {
                continue;
            }
            identityHashSet.add(class872.method11704());
        }
        identityHashSet.remove(Class7739.field30754);
        this.field3579 = Lists.newArrayList((Iterable)identityHashSet);
        for (int i = 0; i < this.field3579.size(); ++i) {
            this.method3536(new Class639(this, null));
        }
    }
    
    @Override
    public void method3544(final int n, final int n2, final Class7392 class7392) {
        if (!this.field3540.field4650.method26957()) {
            this.field3578 = -1;
        }
        for (int i = 0; i < this.field3577.length; ++i) {
            Class691.method3869(this.field3583, n + Class691.method3868(this.field3583, i) - 18, n2 + 1, 0, (this.field3578 != i) ? 18 : 0);
        }
        if (this.field3581 != null) {
            Class691.method3869(this.field3583, n + (Class691.method3868(this.field3583, this.method3586(this.field3581)) - 36), n2 + 1, 18 * ((this.field3582 != 1) ? 1 : 2), 0);
        }
        for (int j = 0; j < this.field3577.length; ++j) {
            final int n3 = (this.field3578 == j) ? 1 : 0;
            Class691.method3869(this.field3583, n + Class691.method3868(this.field3583, j) - 18 + n3, n2 + 1 + n3, 18 * this.field3577[j], 18);
        }
    }
    
    @Override
    public int method3529() {
        return 375;
    }
    
    @Override
    public int method3555() {
        return this.field3543 / 2 + 140;
    }
    
    @Override
    public void method3545() {
        this.field3583.method3041();
    }
    
    @Override
    public void method3543(final int n, final int n2) {
        this.field3578 = -1;
        for (int i = 0; i < this.field3577.length; ++i) {
            final int n3 = n - Class691.method3868(this.field3583, i);
            if (n3 >= -36 && n3 <= 0) {
                this.field3578 = i;
                break;
            }
        }
        if (this.field3578 >= 0) {
            this.method3589(this.method3585(this.field3578));
            this.field3540.method5299().method6422(Class6836.method20933(Class8520.field35662, 1.0f));
        }
    }
    
    private Class2248<?> method3585(final int n) {
        return (Class2248<?>)((n >= this.field3575.size()) ? ((Class2248<Class3820>)this.field3576.get(n - this.field3575.size())) : ((Class2248<Class3833>)this.field3575.get(n)));
    }
    
    private int method3586(final Class2248<?> class2248) {
        final int index = this.field3575.indexOf(class2248);
        if (index < 0) {
            final int index2 = this.field3576.indexOf(class2248);
            return (index2 < 0) ? -1 : (index2 + this.field3575.size());
        }
        return index;
    }
    
    @Override
    public void method3546(final int n, final int n2) {
        if (n2 >= this.field3545) {
            if (n2 <= this.field3546) {
                final Class639 class639 = this.method3539(n, n2);
                final int n3 = (this.field3543 - this.method3529()) / 2;
                if (class639 == null) {
                    ITextComponent class640 = null;
                    final int n4 = n - n3;
                    for (int i = 0; i < this.field3577.length; ++i) {
                        final int method3868 = Class691.method3868(this.field3583, i);
                        if (n4 >= method3868 - 18 && n4 <= method3868) {
                            class640 = new Class2259(this.method3585(i).method8450(), new Object[0]);
                            break;
                        }
                    }
                    this.method3587(class640, n, n2);
                }
                else {
                    if (n < n3 + 40 || n > n3 + 40 + 20) {
                        return;
                    }
                    this.method3587(this.method3588(this.field3579.get(this.method3040().indexOf(class639))), n, n2);
                }
            }
        }
    }
    
    public void method3587(final ITextComponent class2250, final int n, final int n2) {
        if (class2250 != null) {
            final String method8461 = class2250.method8461();
            final int n3 = n + 12;
            final int n4 = n2 - 12;
            this.method3189(n3 - 3, n4 - 3, n3 + this.field3583.field3156.method6617(method8461) + 3, n4 + 8 + 3, -1073741824, -1073741824);
            Class8726.method30059();
            Class8726.method30065(0.0f, 0.0f, 400.0f);
            this.field3583.field3156.method6609(method8461, (float)n3, (float)n4, -1);
            Class8726.method30060();
        }
    }
    
    public ITextComponent method3588(final Class3820 class3820) {
        return class3820.method11715();
    }
    
    public void method3589(final Class2248<?> field3581) {
        if (field3581 == this.field3581) {
            if (this.field3582 != -1) {
                this.field3581 = null;
                this.field3582 = 0;
            }
            else {
                this.field3582 = 1;
            }
        }
        else {
            this.field3581 = field3581;
            this.field3582 = -1;
        }
        this.field3579.sort(this.field3580);
    }
}
