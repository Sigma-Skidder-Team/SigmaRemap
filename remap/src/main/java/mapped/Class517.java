// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import com.google.common.collect.Ordering;
import net.minecraft.util.text.ITextComponent;

public abstract class Class517<T extends Class3418> extends Class516<T>
{
    public boolean field3103;
    
    public Class517(final T t, final Class464 class464, final ITextComponent class465) {
        super(t, class464, class465);
    }
    
    @Override
    public void init() {
        super.init();
        this.method2994();
    }
    
    public void method2994() {
        if (!this.minecraft.field4684.method2651().isEmpty()) {
            this.field3079 = 160 + (this.width - this.field3075 - 200) / 2;
            this.field3103 = true;
        }
        else {
            this.field3079 = (this.width - this.field3075) / 2;
            this.field3103 = false;
        }
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        super.method2975(n, n2, n3);
        if (this.field3103) {
            this.method2995();
        }
    }
    
    private void method2995() {
        final int n = this.field3079 - 124;
        final Collection<Class1948> method2651 = this.minecraft.field4684.method2651();
        if (!method2651.isEmpty()) {
            Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
            int n2 = 33;
            if (method2651.size() > 5) {
                n2 = 132 / (method2651.size() - 1);
            }
            final List sortedCopy = Ordering.natural().sortedCopy((Iterable)method2651);
            this.method2996(n, n2, sortedCopy);
            this.method2997(n, n2, sortedCopy);
            this.method2998(n, n2, sortedCopy);
        }
    }
    
    private void method2996(final int n, final int n2, final Iterable<Class1948> iterable) {
        this.minecraft.method5290().method5849(Class517.field3074);
        int field3080 = this.field3080;
        for (final Class1948 class1948 : iterable) {
            Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
            this.method3186(n, field3080, 0, 166, 140, 32);
            field3080 += n2;
        }
    }
    
    private void method2997(final int n, final int n2, final Iterable<Class1948> iterable) {
        final Class1787 method5325 = this.minecraft.method5325();
        int field3080 = this.field3080;
        final Iterator<Class1948> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            final Class1912 method5326 = method5325.method6446(iterator.next().method7906());
            this.minecraft.method5290().method5849(method5326.method7504().method6340());
            Class565.method3298(n + 6, field3080 + 7, this.method3303(), 18, 18, method5326);
            field3080 += n2;
        }
    }
    
    private void method2998(final int n, final int n2, final Iterable<Class1948> iterable) {
        int field3080 = this.field3080;
        for (final Class1948 class1948 : iterable) {
            String str = Class8822.method30773(class1948.method7906().method16455(), new Object[0]);
            if (class1948.method7908() >= 1) {
                if (class1948.method7908() <= 9) {
                    str = str + ' ' + Class8822.method30773("enchantment.level." + (class1948.method7908() + 1), new Object[0]);
                }
            }
            this.font.method6609(str, (float)(n + 10 + 18), (float)(field3080 + 6), 16777215);
            this.font.method6609(Class9434.method35057(class1948, 1.0f), (float)(n + 10 + 18), (float)(field3080 + 6 + 10), 8355711);
            field3080 += n2;
        }
    }
}
