// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;

public class Class4100 extends Class3820
{
    public Class4100(final Class8959 class8959) {
        super(class8959);
        this.method11705(new Class1932("blocking"), (class8321, class8322, class8323) -> {
            if (class8323 != null) {
                if (class8323.method2756()) {
                    if (class8323.method2766() == class8321) {
                        return 1.0f;
                    }
                }
            }
            return 0.0f;
        });
        Class3955.method12069(this, Class4055.field18147);
    }
    
    @Override
    public String method11718(final Class8321 class8321) {
        return (class8321.method27660("BlockEntityTag") == null) ? super.method11718(class8321) : (this.method11717() + '.' + method12343(class8321).method814());
    }
    
    @Override
    public void method11728(final Class8321 class8321, final Class1847 class8322, final List<Class2250> list, final Class1981 class8323) {
        Class4044.method12243(class8321, list);
    }
    
    @Override
    public Class1992 method11725(final Class8321 class8321) {
        return Class1992.field11157;
    }
    
    @Override
    public int method11726(final Class8321 class8321) {
        return 72000;
    }
    
    @Override
    public Class9355<Class8321> method11695(final Class1847 class1847, final Class512 class1848, final Class316 class1849) {
        final Class8321 method2715 = class1848.method2715(class1849);
        class1848.method2762(class1849);
        return Class9355.method34675(method2715);
    }
    
    @Override
    public boolean method11738(final Class8321 class8321, final Class8321 class8322) {
        return Class7855.field32237.method25618(class8322.method27622()) || super.method11738(class8321, class8322);
    }
    
    public static Class181 method12343(final Class8321 class8321) {
        return Class181.method819(class8321.method27659("BlockEntityTag").method319("Base"));
    }
}
