// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.math.BigInteger;
import java.util.Set;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.Map;

public class Class6587 extends Class6586
{
    public static final Class6010 field26142;
    private static final Map<String, Boolean> field26143;
    private static final Pattern field26144;
    private static final Pattern field26145;
    
    public Class6587() {
        this.field26129.put(Class8542.field35874, new Class6014(this));
        this.field26129.put(Class8542.field35873, new Class6004(this));
        this.field26129.put(Class8542.field35870, new Class6003(this));
        this.field26129.put(Class8542.field35871, new Class6009(this));
        this.field26129.put(Class8542.field35869, new Class6012(this));
        this.field26129.put(Class8542.field35872, new Class6007());
        this.field26129.put(Class8542.field35868, new Class6005(this));
        this.field26129.put(Class8542.field35867, new Class6011(this));
        this.field26129.put(Class8542.field35866, new Class6001(this));
        this.field26129.put(Class8542.field35875, new Class6013(this));
        this.field26129.put(Class8542.field35876, new Class5996(this));
        this.field26129.put(Class8542.field35877, new Class5998(this));
        this.field26129.put(null, Class6587.field26142);
        this.field26128.put(Class2085.field12055, Class6587.field26142);
        this.field26128.put(Class2085.field12056, Class6587.field26142);
        this.field26128.put(Class2085.field12057, Class6587.field26142);
    }
    
    public void method20013(final Class7575 class7575) {
        this.method20014(class7575);
        if (class7575.method23844()) {
            class7575.method23840(this.method20015(class7575, true, new HashMap<Object, Integer>(), new ArrayList<Class9474>()));
        }
    }
    
    public void method20014(final Class7575 class7575) {
        final List<Class9474> method23835 = class7575.method23835();
        final HashMap hashMap = new HashMap(method23835.size());
        final TreeSet set = new TreeSet();
        int i = 0;
        for (final Class9474 class7576 : method23835) {
            final Class7576 method23836 = class7576.method35260();
            if (!method23836.method23845().equals(Class8542.field35865)) {
                final Object method23837 = this.method19983(method23836);
                if (method23837 != null) {
                    try {
                        method23837.hashCode();
                    }
                    catch (final Exception ex) {
                        throw new Class2390("while constructing a mapping", class7575.method23847(), "found unacceptable key " + method23837, class7576.method35260().method23847(), ex);
                    }
                }
                final Integer e = (Integer)hashMap.put(method23837, i);
                if (e != null) {
                    if (!this.method20011()) {
                        throw new Class2391(class7575.method23847(), method23837, class7576.method35260().method23847());
                    }
                    set.add(e);
                }
            }
            ++i;
        }
        final Iterator descendingIterator = set.descendingIterator();
        while (descendingIterator.hasNext()) {
            method23835.remove((int)descendingIterator.next());
        }
    }
    
    private List<Class9474> method20015(final Class7575 class7575, final boolean b, final Map<Object, Integer> map, final List<Class9474> list) {
        final Iterator<Class9474> iterator = class7575.method23835().iterator();
        while (iterator.hasNext()) {
            final Class9474 class7576 = iterator.next();
            final Class7576 method35260 = class7576.method35260();
            final Class7576 method35261 = class7576.method35261();
            if (method35260.method23845().equals(Class8542.field35865)) {
                iterator.remove();
                switch (Class9229.field39576[method35261.method23834().ordinal()]) {
                    case 1: {
                        this.method20015((Class7575)method35261, false, map, list);
                        continue;
                    }
                    case 2: {
                        for (final Class7576 class7577 : ((Class7573)method35261).method23835()) {
                            if (!(class7577 instanceof Class7575)) {
                                throw new Class2390("while constructing a mapping", class7575.method23847(), "expected a mapping for merging, but found " + class7577.method23834(), class7577.method23847());
                            }
                            this.method20015((Class7575)class7577, false, map, list);
                        }
                        continue;
                    }
                    default: {
                        throw new Class2390("while constructing a mapping", class7575.method23847(), "expected a mapping or list of mappings for merging, but found " + method35261.method23834(), method35261.method23847());
                    }
                }
            }
            else {
                final Object method35262 = this.method19983(method35260);
                if (!map.containsKey(method35262)) {
                    list.add(class7576);
                    map.put(method35262, list.size() - 1);
                }
                else {
                    if (!b) {
                        continue;
                    }
                    list.set(map.get(method35262), class7576);
                }
            }
        }
        return list;
    }
    
    @Override
    public void method20005(final Class7575 class7575, final Map<Object, Object> map) {
        this.method20013(class7575);
        super.method20005(class7575, map);
    }
    
    @Override
    public void method20006(final Class7575 class7575, final Set<Object> set) {
        this.method20013(class7575);
        super.method20006(class7575, set);
    }
    
    private Number method20016(final int n, String string, final int n2) {
        if (n < 0) {
            string = "-" + string;
        }
        Object o;
        try {
            o = Integer.valueOf(string, n2);
        }
        catch (final NumberFormatException ex) {
            final String s = string;
            final int n3 = n2;
            final Long n4 = (Long)(o = Long.valueOf(s, n3));
        }
        return (Number)o;
        try {
            final String s = string;
            final int n3 = n2;
            o = Long.valueOf(s, n3);
        }
        catch (final NumberFormatException ex2) {
            o = new BigInteger(string, n2);
        }
        return (Number)o;
    }
    
    static {
        field26142 = new Class6010();
        (field26143 = new HashMap<String, Boolean>()).put("yes", Boolean.TRUE);
        Class6587.field26143.put("no", Boolean.FALSE);
        Class6587.field26143.put("true", Boolean.TRUE);
        Class6587.field26143.put("false", Boolean.FALSE);
        Class6587.field26143.put("on", Boolean.TRUE);
        Class6587.field26143.put("off", Boolean.FALSE);
        field26144 = Pattern.compile("^([0-9][0-9][0-9][0-9])-([0-9][0-9]?)-([0-9][0-9]?)(?:(?:[Tt]|[ \t]+)([0-9][0-9]?):([0-9][0-9]):([0-9][0-9])(?:\\.([0-9]*))?(?:[ \t]*(?:Z|([-+][0-9][0-9]?)(?::([0-9][0-9])?)?))?)?$");
        field26145 = Pattern.compile("^([0-9][0-9][0-9][0-9])-([0-9][0-9]?)-([0-9][0-9]?)$");
    }
}
