// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;

public class Class4096 extends Class3820
{
    public Class4096(final Class8959 class8959) {
        super(class8959);
    }
    
    public static boolean method12339(final Class51 class51) {
        return Class4049.method12247(class51) && class51.method316("title", 8) && class51.method323("title").length() <= 32 && class51.method316("author", 8);
    }
    
    public static int method12340(final Class8321 class8321) {
        return class8321.method27657().method319("generation");
    }
    
    public static int method12341(final Class8321 class8321) {
        final Class51 method27657 = class8321.method27657();
        return (method27657 == null) ? 0 : method27657.method328("pages", 8).size();
    }
    
    @Override
    public Class2250 method11729(final Class8321 class8321) {
        if (class8321.method27656()) {
            final String method323 = class8321.method27657().method323("title");
            if (!Class8272.method27500(method323)) {
                return new Class2260(method323);
            }
        }
        return super.method11729(class8321);
    }
    
    @Override
    public void method11728(final Class8321 class8321, final Class1847 class8322, final List<Class2250> list, final Class1981 class8323) {
        if (class8321.method27656()) {
            final Class51 method27657 = class8321.method27657();
            final String method27658 = method27657.method323("author");
            if (!Class8272.method27500(method27658)) {
                list.add(new Class2259("book.byAuthor", new Object[] { method27658 }).method8469(Class2116.field12316));
            }
            list.add(new Class2259("book.generation." + method27657.method319("generation"), new Object[0]).method8469(Class2116.field12316));
        }
    }
    
    @Override
    public Class2201 method11694(final Class7075 class7075) {
        final Class1847 method21654 = class7075.method21654();
        final Class354 method21655 = class7075.method21639();
        final Class7096 method21656 = method21654.method6701(method21655);
        if (method21656.method21696() != Class7521.field29813) {
            return Class2201.field13402;
        }
        return Class3930.method12040(method21654, method21655, method21656, class7075.method21651()) ? Class2201.field13400 : Class2201.field13402;
    }
    
    @Override
    public Class9355<Class8321> method11695(final Class1847 class1847, final Class512 class1848, final Class316 class1849) {
        final Class8321 method2715 = class1848.method2715(class1849);
        class1848.method2835(method2715, class1849);
        class1848.method2859(Class8276.field33981.method8449(this));
        return Class9355.method34674(method2715);
    }
    
    public static boolean method12342(final Class8321 class8321, final Class7492 class8322, final Class512 class8323) {
        final Class51 method27657 = class8321.method27657();
        if (method27657 == null || method27657.method329("resolved")) {
            return false;
        }
        method27657.method312("resolved", true);
        if (!method12339(method27657)) {
            return false;
        }
        final Class52 method27658 = method27657.method328("pages", 8);
        for (int i = 0; i < method27658.size(); ++i) {
            final String method27659 = method27658.method353(i);
            Class2250 method27660;
            try {
                method27660 = Class9479.method35294(class8322, Class5953.method17873(method27659), class8323, 0);
            }
            catch (final Exception ex) {
                method27660 = new Class2260(method27659);
            }
            method27658.set(i, Class50.method290(Class5953.method17869(method27660)));
        }
        method27657.method295("pages", method27658);
        return true;
    }
    
    @Override
    public boolean method11730(final Class8321 class8321) {
        return true;
    }
}
