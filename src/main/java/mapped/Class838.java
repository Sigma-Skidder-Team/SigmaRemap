// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.function.Predicate;

public class Class838 extends Class833
{
    private static final Class8810<Integer> field4455;
    private int field4456;
    private int field4457;
    private static final Predicate<Class511> field4458;
    
    public Class838(final Class7499<? extends Class838> class7499, final Class1847 class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.field2432.method33565(Class838.field4455, 0);
    }
    
    public int method4988() {
        return this.field2432.method33568(Class838.field4455);
    }
    
    public void method4989(final int i) {
        this.field2432.method33569(Class838.field4455, i);
    }
    
    @Override
    public void method1880(final Class8810<?> class8810) {
        if (Class838.field4455.equals(class8810)) {
            this.method1881();
        }
        super.method1880(class8810);
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method298("PuffState", this.method4988());
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        this.method4989(class51.method319("PuffState"));
    }
    
    @Override
    public Class8321 method4956() {
        return new Class8321(Class7739.field31359);
    }
    
    @Override
    public void method4142() {
        super.method4142();
        this.field4114.method22062(1, new Class3627(this));
    }
    
    @Override
    public void method1659() {
        if (!this.field2391.field10067) {
            if (this.method1768()) {
                if (this.method2749()) {
                    if (this.field4456 <= 0) {
                        if (this.method4988() != 0) {
                            if (this.field4457 > 60 && this.method4988() == 2) {
                                this.method1695(Class8520.field35500, this.method2720(), this.method2721());
                                this.method4989(1);
                            }
                            else if (this.field4457 > 100) {
                                if (this.method4988() == 1) {
                                    this.method1695(Class8520.field35500, this.method2720(), this.method2721());
                                    this.method4989(0);
                                }
                            }
                            ++this.field4457;
                        }
                    }
                    else {
                        if (this.method4988() != 0) {
                            if (this.field4456 > 40) {
                                if (this.method4988() == 1) {
                                    this.method1695(Class8520.field35501, this.method2720(), this.method2721());
                                    this.method4989(2);
                                }
                            }
                        }
                        else {
                            this.method1695(Class8520.field35501, this.method2720(), this.method2721());
                            this.method4989(1);
                        }
                        ++this.field4456;
                    }
                }
            }
        }
        super.method1659();
    }
    
    @Override
    public void method2736() {
        super.method2736();
        if (this.method1768()) {
            if (this.method4988() > 0) {
                for (final Class759 class759 : this.field2391.method6739((Class<? extends Class759>)Class759.class, this.method1886().method18496(0.3), (Predicate<? super Class759>)Class838.field4458)) {
                    if (!class759.method1768()) {
                        continue;
                    }
                    this.method4990(class759);
                }
            }
        }
    }
    
    private void method4990(final Class759 class759) {
        final int method4988 = this.method4988();
        if (class759.method1740(Class7929.method25693(this), (float)(1 + method4988))) {
            class759.method2655(new Class1948(Class9439.field40492, 60 * method4988, 0));
            this.method1695(Class8520.field35505, 1.0f, 1.0f);
        }
    }
    
    @Override
    public void method1736(final Class512 class512) {
        final int method4988 = this.method4988();
        if (class512 instanceof Class513) {
            if (method4988 > 0) {
                if (class512.method1740(Class7929.method25693(this), (float)(1 + method4988))) {
                    ((Class513)class512).field3039.method17469(new Class4306(9, 0.0f));
                    class512.method2655(new Class1948(Class9439.field40492, 60 * method4988, 0));
                }
            }
        }
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35499;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35502;
    }
    
    @Override
    public Class7795 method2683(final Class7929 class7929) {
        return Class8520.field35504;
    }
    
    @Override
    public Class7795 method4958() {
        return Class8520.field35503;
    }
    
    @Override
    public Class8295 method1933(final Class290 class290) {
        return super.method1933(class290).method27561(method4991(this.method4988()));
    }
    
    private static float method4991(final int n) {
        switch (n) {
            case 0: {
                return 0.5f;
            }
            case 1: {
                return 0.7f;
            }
            default: {
                return 1.0f;
            }
        }
    }
    
    static {
        field4455 = Class9184.method33564(Class838.class, Class7709.field30654);
        field4458 = (class511 -> {
            if (class511 != null) {
                if (class511 instanceof Class512 && (class511.method1639() || ((Class512)class511).method2889())) {
                    return false;
                }
                else {
                    return class511.method2712() != Class6363.field25464;
                }
            }
            else {
                return false;
            }
        });
    }
}
