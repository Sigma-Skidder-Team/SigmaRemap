// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.util.Arrays;
import java.util.ArrayList;

public class Class7299 extends Class7298
{
    @Override
    public String[] method22386(final Class573 class573, final int n) {
        if (class573 instanceof Class674) {
            return this.method22388(((Class674)class573).method3736(), n);
        }
        return null;
    }
    
    private String[] method22388(final Class5601 class5601, final int n) {
        final String method16858 = class5601.method16858();
        final String[] method16859 = this.method22389(Class8571.method28980(class5601.method16859()).trim());
        final Class5760 method16860 = Class8571.method28962();
        Object string = null;
        if (!method16858.equals(class5601.method16860())) {
            if (method16860.field23394) {
                string = "§8" + Class4647.method13876("of.general.id") + ": " + class5601.method16860();
            }
        }
        Object string2 = null;
        if (class5601.method16870() != null) {
            if (method16860.field23394) {
                string2 = "§8" + Class4647.method13876("of.general.from") + ": " + Class8571.method28888(class5601.method16870());
            }
        }
        Object string3 = null;
        if (class5601.method16865() != null) {
            if (method16860.field23394) {
                string3 = "§8" + Class4647.method13882() + ": " + (class5601.method16872() ? class5601.method16878(class5601.method16865()) : Class4647.method13876("of.general.ambiguous"));
            }
        }
        final ArrayList list = new ArrayList();
        list.add(method16858);
        list.addAll(Arrays.asList(method16859));
        if (string != null) {
            list.add(string);
        }
        if (string2 != null) {
            list.add(string2);
        }
        if (string3 != null) {
            list.add(string3);
        }
        return this.method22390(n, list);
    }
    
    private String[] method22389(String method35517) {
        if (method35517.length() > 0) {
            method35517 = Class9518.method35517(method35517, "//");
            final String[] split = method35517.split("\\. ");
            for (int i = 0; i < split.length; ++i) {
                split[i] = "- " + split[i].trim();
                split[i] = Class9518.method35518(split[i], ".");
            }
            return split;
        }
        return new String[0];
    }
    
    private String[] method22390(final int n, final List<String> list) {
        final Class1844 field4643 = Class8571.method28894().field4643;
        final ArrayList list2 = new ArrayList();
        for (int i = 0; i < list.size(); ++i) {
            final String s = list.get(i);
            if (s != null) {
                if (s.length() > 0) {
                    final Iterator<String> iterator = field4643.method6626(s, n).iterator();
                    while (iterator.hasNext()) {
                        list2.add(iterator.next());
                    }
                }
            }
        }
        return (String[])list2.toArray(new String[list2.size()]);
    }
}
