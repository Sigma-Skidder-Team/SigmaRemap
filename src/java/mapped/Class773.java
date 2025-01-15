// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import java.util.HashMap;
import java.util.Map;
import com.google.common.collect.Maps;
import javax.annotation.Nullable;

public class Class773 extends Class772 implements Class774, Class768
{
    private static final Class8810<Boolean> field4166;
    private final Class443 field4167;
    
    public Class773(final Class7499<? extends Class773> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.field4167 = new Class443(5);
    }
    
    @Override
    public void method4142() {
        super.method4142();
        this.field4114.method22062(0, new Class3490(this));
        this.field4114.method22062(2, new Class3459(this, this, 10.0f));
        this.field4114.method22062(3, new Class3595<Object>(this, 1.0, 8.0f));
        this.field4114.method22062(8, new Class3514(this, 0.6));
        this.field4114.method22062(9, new Class3628(this, Class512.class, 15.0f, 1.0f));
        this.field4114.method22062(10, new Class3628(this, Class759.class, 15.0f));
        this.field4115.method22062(1, new Class3547(this, (Class<?>[])new Class[] { Class776.class }).method11100((Class<?>[])new Class[0]));
        this.field4115.method22062(2, new Class3555<Object>(this, Class512.class, true));
        this.field4115.method22062(3, new Class3555<Object>(this, Class819.class, false));
        this.field4115.method22062(3, new Class3555<Object>(this, Class786.class, true));
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33408).method23941(0.3499999940395355);
        this.method2710(Class8107.field33405).method23941(24.0);
        this.method2710(Class8107.field33410).method23941(5.0);
        this.method2710(Class8107.field33406).method23941(32.0);
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.field2432.method33565(Class773.field4166, false);
    }
    
    public boolean method4279() {
        return this.field2432.method33568(Class773.field4166);
    }
    
    @Override
    public void method4280(final boolean b) {
        this.field2432.method33569(Class773.field4166, b);
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        final Class52 class52 = new Class52();
        for (int i = 0; i < this.field4167.method2239(); ++i) {
            final Class8321 method2157 = this.field4167.method2157(i);
            if (!method2157.method27620()) {
                ((AbstractList<Class51>)class52).add(method2157.method27627(new Class51()));
            }
        }
        class51.method295("Inventory", class52);
    }
    
    @Override
    public Class259 method4264() {
        if (this.method4279()) {
            return Class259.field1239;
        }
        if (!this.method4218(Class7739.field31611)) {
            return this.method4216() ? Class259.field1235 : Class259.field1241;
        }
        return Class259.field1238;
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        final Class52 method328 = class51.method328("Inventory", 10);
        for (int i = 0; i < method328.size(); ++i) {
            final Class8321 method329 = Class8321.method27619(method328.method346(i));
            if (!method329.method27620()) {
                this.field4167.method2258(method329);
            }
        }
        this.method4193(true);
    }
    
    @Override
    public float method4228(final Class354 class354, final Class1852 class355) {
        final Class3833 method21696 = class355.method6701(class354.method1139()).method21696();
        return (method21696 != Class7521.field29155 && method21696 != Class7521.field29175) ? (0.5f - class355.method6963(class354)) : 10.0f;
    }
    
    @Override
    public int method4181() {
        return 1;
    }
    
    @Nullable
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, final Class5496 class1854, final Class51 class1855) {
        this.method4184(class1852);
        this.method4187(class1852);
        return super.method4188(class1851, class1852, class1853, class1854, class1855);
    }
    
    @Override
    public void method4184(final Class9592 class9592) {
        final Class8321 class9593 = new Class8321(Class7739.field31611);
        if (this.field2423.nextInt(300) == 0) {
            final HashMap hashMap = Maps.newHashMap();
            hashMap.put(Class7882.field32381, 1);
            Class8742.method30198(hashMap, class9593);
        }
        this.method1803(Class2215.field13600, class9593);
    }
    
    @Override
    public boolean method1826(final Class399 class399) {
        return super.method1826(class399) || (class399 instanceof Class511 && ((Class511)class399).method2712() == Class6363.field25463 && this.method1825() == null && class399.method1825() == null);
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35465;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35467;
    }
    
    @Override
    public Class7795 method2683(final Class7929 class7929) {
        return Class8520.field35468;
    }
    
    @Override
    public void method4252(final Class511 class511, final float n) {
        final Class316 method23100 = Class7476.method23100(this, Class7739.field31611);
        final Class8321 method23101 = this.method2715(method23100);
        if (this.method4218(Class7739.field31611)) {
            Class4086.method12304(this.field2391, this, method23100, method23101, 1.6f, (float)(14 - this.field2391.method6954().method8235() * 4));
        }
        this.field2959 = 0;
    }
    
    @Override
    public void method4281(final Class511 class511, final Class8321 class512, final Class401 class513, final float n) {
        final Class399 class514 = (Class399)class513;
        final double n2 = class511.method1938() - this.method1938();
        final double n3 = class511.method1945() - this.method1945();
        final Class9138 method4282 = this.method4282(new Class5487(n2, class511.method1942(0.3333333333333333) - class514.method1941() + Class9546.method35641(n2 * n2 + n3 * n3) * 0.20000000298023224, n3), n);
        class513.method1958(method4282.method33311(), method4282.method33312(), method4282.method33313(), 1.6f, (float)(14 - this.field2391.method6954().method8235() * 4));
        this.method1695(Class8520.field35112, 1.0f, 1.0f / (this.method2633().nextFloat() * 0.4f + 0.8f));
    }
    
    private Class9138 method4282(final Class5487 class5487, final float n) {
        final Class5487 method16738 = class5487.method16738();
        Class5487 class5488 = method16738.method16740(new Class5487(0.0, 1.0, 0.0));
        if (class5488.method16753() <= 1.0E-7) {
            class5488 = method16738.method16740(this.method1745(1.0f));
        }
        final Class9389 class5489 = new Class9389(new Class9138(class5488), 90.0f, true);
        final Class9138 class5490 = new Class9138(method16738);
        class5490.method33325(class5489);
        final Class9389 class5491 = new Class9389(class5490, n, true);
        final Class9138 class5492 = new Class9138(method16738);
        class5492.method33325(class5491);
        return class5492;
    }
    
    @Override
    public void method4165(final Class427 class427) {
        final Class8321 method2107 = class427.method2107();
        if (!(method2107.method27622() instanceof Class4044)) {
            if (this.method4283(method2107.method27622())) {
                final Class8321 method2108 = this.field4167.method2258(method2107);
                if (!method2108.method27620()) {
                    method2107.method27691(method2108.method27690());
                }
                else {
                    class427.method1652();
                }
            }
        }
        else {
            super.method4165(class427);
        }
    }
    
    private boolean method4283(final Class3820 class3820) {
        return this.method4293() && class3820 == Class7739.field31556;
    }
    
    @Override
    public boolean method1893(final int n, final Class8321 class8321) {
        if (super.method1893(n, class8321)) {
            return true;
        }
        final int n2 = n - 300;
        if (n2 >= 0 && n2 < this.field4167.method2239()) {
            this.field4167.method2160(n2, class8321);
            return true;
        }
        return false;
    }
    
    @Override
    public void method4263(final int n, final boolean b) {
        final Class8792 method4292 = this.method4292();
        if (this.field2423.nextFloat() <= method4292.method30666()) {
            final Class8321 class8321 = new Class8321(Class7739.field31611);
            final HashMap hashMap = Maps.newHashMap();
            if (n <= method4292.method30665(Class2113.field12292)) {
                if (n > method4292.method30665(Class2113.field12291)) {
                    hashMap.put(Class7882.field32380, 1);
                }
            }
            else {
                hashMap.put(Class7882.field32380, 2);
            }
            hashMap.put(Class7882.field32379, 1);
            Class8742.method30198(hashMap, class8321);
            this.method1803(Class2215.field13600, class8321);
        }
    }
    
    @Override
    public Class7795 method4260() {
        return Class8520.field35466;
    }
    
    static {
        field4166 = Class9184.method33564(Class773.class, Class7709.field30661);
    }
}
