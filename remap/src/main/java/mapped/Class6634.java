// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import io.netty.buffer.ByteBuf;
import java.util.concurrent.TimeUnit;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.Sets;
import java.util.concurrent.ConcurrentHashMap;
import com.google.common.cache.Cache;
import java.util.Set;
import java.util.List;
import java.util.UUID;
import java.util.Map;

public class Class6634 extends Class6635 implements Class6640
{
    private final Map<Integer, UUID> field26230;
    private final Map<Integer, Class1974> field26231;
    private final Map<Integer, List<Class7276>> field26232;
    private final Map<Integer, Integer> field26233;
    private final Map<Integer, Class8254> field26234;
    private final Set<Integer> field26235;
    private final Set<Integer> field26236;
    private final Cache<Class8322, Integer> field26237;
    private boolean field26238;
    private boolean field26239;
    private int field26240;
    private Class8322 field26241;
    private boolean field26242;
    private Class2088 field26243;
    private String field26244;
    
    public Class6634(final Class6108 class6108) {
        super(class6108);
        this.field26230 = new ConcurrentHashMap<Integer, UUID>();
        this.field26231 = new ConcurrentHashMap<Integer, Class1974>();
        this.field26232 = new ConcurrentHashMap<Integer, List<Class7276>>();
        this.field26233 = new ConcurrentHashMap<Integer, Integer>();
        this.field26234 = new ConcurrentHashMap<Integer, Class8254>();
        this.field26235 = Sets.newConcurrentHashSet();
        this.field26236 = Sets.newConcurrentHashSet();
        this.field26237 = CacheBuilder.newBuilder().maximumSize(10L).expireAfterAccess(250L, TimeUnit.MILLISECONDS).build();
        this.field26238 = false;
        this.field26239 = false;
        this.field26240 = -1;
        this.field26241 = null;
        this.field26242 = false;
    }
    
    public UUID method20087(final int n) {
        UUID randomUUID = this.field26230.get(n);
        if (randomUUID == null) {
            randomUUID = UUID.randomUUID();
            this.field26230.put(n, randomUUID);
        }
        return randomUUID;
    }
    
    public void method20088(final Class7562 class7562) {
        this.method20089(this.field26240, class7562);
    }
    
    public void method20089(final int i, final Class7562 class7562) {
        final Class8699 class7563 = new Class8699(60, null, this.method20121());
        class7563.method29823(Class5260.field22312, i);
        class7563.method29823(Class5260.field22312, 1);
        class7563.method29823(Class5260.field22328, class7562);
        try {
            class7563.method29833(Class5224.class);
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void method20090(final Integer n) {
        this.field26231.remove(n);
        this.field26233.remove(n);
        this.field26230.remove(n);
        this.field26235.remove(n);
        this.field26236.remove(n);
        this.field26232.remove(n);
        final Class8254 class8254 = this.field26234.remove(n);
        if (class8254 != null) {
            class8254.method27380();
            Class8563.method28794().method33549().method29950(Class6483.class).method19518(this.method20121(), class8254.method27382());
        }
    }
    
    public boolean method20091(final int n, final int n2, final int n3) {
        if (this.field26237.size() != 0L) {
            for (final Class8322 class8322 : this.field26237.asMap().keySet()) {
                if (class8322.method27704() != n) {
                    continue;
                }
                if (class8322.method27705() != n2) {
                    continue;
                }
                if (class8322.method27706() != n3) {
                    continue;
                }
                return true;
            }
            return false;
        }
        return false;
    }
    
    public void method20092(final Class8322 class8322) {
        this.field26237.put((Object)class8322, (Object)0);
    }
    
    public void method20093(final int i, final List<Class7276> c) {
        final Class1974 class1974 = this.field26231.get(i);
        if (class1974 == null) {
            return;
        }
        for (final Class7276 class1975 : new ArrayList(c)) {
            if (class1974 == Class1974.field10909 && class1975.method22294() == 10) {
                c.remove(class1975);
            }
            if (class1974 == Class1974.field10908 && class1975.method22294() == 11) {
                c.remove(class1975);
            }
            if (class1974 == Class1974.field10896 && this.method20094(c, 12) == null) {
                c.add(new Class7276(12, Class1968.field10764, true));
            }
            if (class1974 == Class1974.field10925 && class1975.method22294() == 16 && (int)class1975.method22296() == Integer.MIN_VALUE) {
                class1975.method22299(0);
            }
            if (class1974 == Class1974.field10937) {
                if (class1975.method22294() == 0) {
                    final byte byteValue = (byte)class1975.method22296();
                    if (i != this.method20098() && Class8563.method28792().method23267()) {
                        if ((byteValue & 0x10) == 0x10) {
                            if (this.field26235.contains(i)) {
                                this.method20089(i, new Class7562((short)442, (byte)1, (short)0, null));
                            }
                            else {
                                this.method20089(i, null);
                            }
                        }
                        else {
                            this.method20089(i, null);
                        }
                    }
                }
                if (class1975.method22294() == 12 && Class8563.method28792().method23307()) {
                    c.add(new Class7276(13, Class1968.field10758, (byte)((((byte)class1975.method22296() & 0x80) == 0x0) ? 1 : 0)));
                }
            }
            if (class1974 == Class1974.field10885 && Class8563.method28792().method23268() && class1975.method22294() == 0 && this.method20094(c, 10) != null) {
                final Class7276 method20094 = this.method20094(c, 10);
                if (((byte)class1975.method22296() & 0x20) == 0x20 && ((byte)method20094.method22296() & 0x1) == 0x1 && ((String)this.method20094(c, 2).method22296()).length() != 0 && (boolean)this.method20094(c, 3).method22296() && !this.field26236.contains(i)) {
                    this.field26236.add(i);
                    try {
                        final Class8699 class1976 = new Class8699(37, null, this.method20121());
                        class1976.method29823(Class5260.field22312, i);
                        class1976.method29823(Class5260.field22304, (Short)0);
                        class1976.method29823(Class5260.field22304, (short)(128.0 * (Class8563.method28792().method23273() * 32.0)));
                        class1976.method29823(Class5260.field22304, (Short)0);
                        class1976.method29823(Class5260.field22294, true);
                        class1976.method29831(Class5224.class, true, false);
                    }
                    catch (final Exception ex) {}
                }
            }
            final UUID method20095 = this.method20121().method18207(Class6651.class).method20210();
            if (Class8563.method28792().method23270() && (class1974 == Class1974.field10908 || class1974 == Class1974.field10909)) {
                if (class1975.method22294() == 2) {
                    final Class8254 class1977 = this.field26234.get(i);
                    final String s = (String)class1975.method22296();
                    final String s2 = s.isEmpty() ? ((class1974 == Class1974.field10908) ? "Ender Dragon" : "Wither") : s;
                    if (class1977 == null) {
                        final Class8254 method20096 = Class8563.method28791().method31744(s2, Class320.field1894, Class2163.field12867);
                        this.field26234.put(i, method20096);
                        method20096.method27373(method20095);
                        method20096.method27379();
                        Class8563.method28794().method33549().method29950(Class6483.class).method19517(this.method20121(), method20096.method27382());
                    }
                    else {
                        class1977.method27368(s2);
                    }
                }
                else {
                    if (class1975.method22294() != 6 || Class8563.method28792().method23271()) {
                        continue;
                    }
                    final Class8254 class1978 = this.field26234.get(i);
                    final float max = Math.max(0.0f, Math.min((float)class1975.method22296() / ((class1974 == Class1974.field10908) ? 200.0f : 300.0f), 1.0f));
                    if (class1978 == null) {
                        final Class8254 method20097 = Class8563.method28791().method31745((class1974 == Class1974.field10908) ? "Ender Dragon" : "Wither", max, Class320.field1894, Class2163.field12867);
                        this.field26234.put(i, method20097);
                        method20097.method27373(method20095);
                        method20097.method27379();
                        Class8563.method28794().method33549().method29950(Class6483.class).method19517(this.method20121(), method20097.method27382());
                    }
                    else {
                        class1978.method27369(max);
                    }
                }
            }
        }
    }
    
    public Class7276 method20094(final List<Class7276> list, final int n) {
        for (final Class7276 class7276 : list) {
            if (n != class7276.method22294()) {
                continue;
            }
            return class7276;
        }
        return null;
    }
    
    public void method20095(final boolean field26242, final boolean b) {
        final Class8699 class8699 = new Class8699(65, null, this.method20121());
        class8699.method29823(Class5260.field22308, "viaversion");
        if (field26242) {
            if (!this.field26242) {
                class8699.method29823(Class5260.field22289, (Byte)0);
                class8699.method29823(Class5260.field22308, "viaversion");
                class8699.method29823(Class5260.field22308, "");
                class8699.method29823(Class5260.field22308, "");
                class8699.method29823(Class5260.field22289, (Byte)0);
                class8699.method29823(Class5260.field22308, "");
                class8699.method29823(Class5260.field22308, "never");
                class8699.method29823(Class5260.field22289, (Byte)0);
            }
            else {
                class8699.method29823(Class5260.field22289, (Byte)3);
            }
            class8699.method29823(Class5260.field22309, new String[] { this.method20121().method18207(Class6651.class).method20209() });
        }
        else {
            class8699.method29823(Class5260.field22289, (Byte)1);
        }
        this.field26242 = field26242;
        try {
            class8699.method29831(Class5224.class, true, b);
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void method20096(final int n, final List<Class7276> list) {
        final List list2 = this.field26232.get(n);
        if (list2 == null) {
            this.field26232.put(n, list);
        }
        else {
            list2.addAll(list);
        }
    }
    
    public void method20097(final int n) {
        final List list = this.field26232.get(n);
        if (list != null) {
            final Class8699 class8699 = new Class8699(57, null, this.method20121());
            class8699.method29823(Class5260.field22312, n);
            class8699.method29823(Class8794.field36974, list);
            Class9392.method34924(this.method20101().get(n), list);
            this.method20093(n, list);
            if (list.size() > 0) {
                try {
                    class8699.method29833(Class5224.class);
                }
                catch (final Exception ex) {
                    ex.printStackTrace();
                }
            }
            this.field26232.remove(n);
        }
    }
    
    public int method20098() {
        try {
            return Class8563.method28794().method33549().method29950(Class6486.class).method19520(this.method20121());
        }
        catch (final Exception ex) {
            return this.field26240;
        }
    }
    
    @Override
    public void method20099(final int i) {
        this.field26231.put(i, Class1974.field10937);
    }
    
    public Map<Integer, UUID> method20100() {
        return this.field26230;
    }
    
    public Map<Integer, Class1974> method20101() {
        return this.field26231;
    }
    
    public Map<Integer, List<Class7276>> method20102() {
        return this.field26232;
    }
    
    public Map<Integer, Integer> method20103() {
        return this.field26233;
    }
    
    public Map<Integer, Class8254> method20104() {
        return this.field26234;
    }
    
    public Set<Integer> method20105() {
        return this.field26235;
    }
    
    public Set<Integer> method20106() {
        return this.field26236;
    }
    
    public Cache<Class8322, Integer> method20107() {
        return this.field26237;
    }
    
    public boolean method20108() {
        return this.field26238;
    }
    
    public boolean method20109() {
        return this.field26239;
    }
    
    public int method20110() {
        return this.field26240;
    }
    
    public Class8322 method20111() {
        return this.field26241;
    }
    
    public boolean method20112() {
        return this.field26242;
    }
    
    public Class2088 method20113() {
        return this.field26243;
    }
    
    public String method20114() {
        return this.field26244;
    }
    
    public void method20115(final boolean field26238) {
        this.field26238 = field26238;
    }
    
    public void method20116(final boolean field26239) {
        this.field26239 = field26239;
    }
    
    public void method20117(final int field26240) {
        this.field26240 = field26240;
    }
    
    public void method20118(final Class8322 field26241) {
        this.field26241 = field26241;
    }
    
    public void method20119(final Class2088 field26243) {
        this.field26243 = field26243;
    }
    
    public void method20120(final String field26244) {
        this.field26244 = field26244;
    }
}
