// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.SortedMap;
import java.util.HashSet;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map;

public abstract class Class6586
{
    public final Map<Class2085, Class5997> field26128;
    public final Map<Class8542, Class5997> field26129;
    public final Map<String, Class5997> field26130;
    public Class8828 field26131;
    public final Map<Class7576, Object> field26132;
    private final Set<Class7576> field26133;
    private final ArrayList<Class9285<Map<Object, Object>, Class9285<Object, Object>>> field26134;
    private final ArrayList<Class9285<Set<Object>, Object>> field26135;
    public Class8542 field26136;
    private Class5043 field26137;
    private boolean field26138;
    private boolean field26139;
    public final Map<Class<?>, Class8051> field26140;
    public final Map<Class8542, Class<?>> field26141;
    
    public Class6586() {
        this.field26128 = new EnumMap<Class2085, Class5997>(Class2085.class);
        this.field26129 = new HashMap<Class8542, Class5997>();
        this.field26130 = new HashMap<String, Class5997>();
        this.field26139 = true;
        this.field26132 = new HashMap<Class7576, Object>();
        this.field26133 = new HashSet<Class7576>();
        this.field26134 = new ArrayList<Class9285<Map<Object, Object>, Class9285<Object, Object>>>();
        this.field26135 = new ArrayList<Class9285<Set<Object>, Object>>();
        this.field26140 = new HashMap<Class<?>, Class8051>();
        this.field26141 = new HashMap<Class8542, Class<?>>();
        this.field26136 = null;
        this.field26138 = false;
        this.field26140.put(SortedMap.class, new Class8051(SortedMap.class, Class8542.field35868, TreeMap.class));
        this.field26140.put(SortedSet.class, new Class8051(SortedSet.class, Class8542.field35866, TreeSet.class));
    }
    
    public void method19977(final Class8828 field26131) {
        this.field26131 = field26131;
    }
    
    public boolean method19978() {
        return this.field26131.method30801();
    }
    
    public Object method19979() {
        this.field26131.method30801();
        final Class7576 method30802 = this.field26131.method30802();
        if (this.field26136 != null) {
            method30802.method23848(this.field26136);
        }
        return this.method19981(method30802);
    }
    
    public Object method19980(final Class<?> clazz) {
        final Class7576 method30803 = this.field26131.method30803();
        if (method30803 != null && !Class8542.field35874.equals(method30803.method23845())) {
            if (Object.class == clazz) {
                if (this.field26136 != null) {
                    method30803.method23848(this.field26136);
                }
            }
            else {
                method30803.method23848(new Class8542(clazz));
            }
            return this.method19981(method30803);
        }
        return null;
    }
    
    public final Object method19981(final Class7576 class7576) {
        final Object method19983 = this.method19983(class7576);
        this.method19982();
        this.field26132.clear();
        this.field26133.clear();
        return method19983;
    }
    
    private void method19982() {
        if (!this.field26134.isEmpty()) {
            for (final Class9285 class9285 : this.field26134) {
                final Class9285 class9286 = (Class9285)class9285.method34272();
                ((Map<Object, Object>)class9285.method34273()).put(class9286.method34273(), class9286.method34272());
            }
            this.field26134.clear();
        }
        if (!this.field26135.isEmpty()) {
            for (final Class9285 class9287 : this.field26135) {
                ((Set<Object>)class9287.method34273()).add(class9287.method34272());
            }
            this.field26135.clear();
        }
    }
    
    public Object method19983(final Class7576 class7576) {
        if (!this.field26132.containsKey(class7576)) {
            return this.method19984(class7576);
        }
        return this.field26132.get(class7576);
    }
    
    public Object method19984(final Class7576 class7576) {
        if (!this.field26133.contains(class7576)) {
            this.field26133.add(class7576);
            final Class5997 method19985 = this.method19985(class7576);
            final Object o = this.field26132.containsKey(class7576) ? this.field26132.get(class7576) : method19985.method17922(class7576);
            this.method19991(class7576, o);
            this.field26132.put(class7576, o);
            this.field26133.remove(class7576);
            if (class7576.method23852()) {
                method19985.method17923(class7576, o);
            }
            return o;
        }
        throw new Class2390(null, null, "found unconstructable recursive node", class7576.method23847());
    }
    
    public Class5997 method19985(final Class7576 class7576) {
        if (class7576.method23853()) {
            return this.field26128.get(class7576.method23834());
        }
        final Class5997 class7577 = this.field26129.get(class7576.method23845());
        if (class7577 != null) {
            return class7577;
        }
        for (final String s : this.field26130.keySet()) {
            if (!class7576.method23845().method28658(s)) {
                continue;
            }
            return this.field26130.get(s);
        }
        return this.field26129.get(null);
    }
    
    public String method19986(final Class7577 class7577) {
        return class7577.method23856();
    }
    
    public List<Object> method19987(final int initialCapacity) {
        return new ArrayList<Object>(initialCapacity);
    }
    
    public Set<Object> method19988(final int initialCapacity) {
        return new LinkedHashSet<Object>(initialCapacity);
    }
    
    public Map<Object, Object> method19989(final int initialCapacity) {
        return new LinkedHashMap<Object, Object>(initialCapacity);
    }
    
    public Object method19990(final Class<?> clazz, final int length) {
        return Array.newInstance(clazz.getComponentType(), length);
    }
    
    public Object method19991(final Class7576 class7576, final Object o) {
        final Class<?> method23849 = class7576.method23849();
        if (!this.field26140.containsKey(method23849)) {
            return o;
        }
        return this.field26140.get(method23849).method26425(o);
    }
    
    public Object method19992(final Class7576 class7576) {
        try {
            return this.method19993(Object.class, class7576);
        }
        catch (final InstantiationException ex) {
            throw new Class2386(ex);
        }
    }
    
    public final Object method19993(final Class<?> clazz, final Class7576 class7576) throws InstantiationException {
        return this.method19994(clazz, class7576, true);
    }
    
    public Object method19994(final Class<?> clazz, final Class7576 class7576, final boolean b) throws InstantiationException {
        final Class<?> method23849 = class7576.method23849();
        if (this.field26140.containsKey(method23849)) {
            final Object method23850 = this.field26140.get(method23849).method26423(class7576);
            if (method23850 != null) {
                return method23850;
            }
        }
        if (b && clazz.isAssignableFrom(method23849) && !Modifier.isAbstract(method23849.getModifiers())) {
            try {
                final Constructor declaredConstructor = method23849.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                return declaredConstructor.newInstance();
            }
            catch (final NoSuchMethodException ex) {
                throw new InstantiationException("NoSuchMethodException:" + ex.getLocalizedMessage());
            }
            catch (final Exception ex2) {
                throw new Class2386(ex2);
            }
        }
        throw new InstantiationException();
    }
    
    public Set<Object> method19995(final Class7574<?> class7574) {
        try {
            return (Set)this.method19993(Set.class, class7574);
        }
        catch (final InstantiationException ex) {
            return this.method19988(class7574.method23835().size());
        }
    }
    
    public List<Object> method19996(final Class7573 class7573) {
        try {
            return (List)this.method19993(List.class, class7573);
        }
        catch (final InstantiationException ex) {
            return this.method19987(class7573.method23835().size());
        }
    }
    
    public Map<Object, Object> method19997(final Class7575 class7575) {
        try {
            return (Map)this.method19993(Map.class, class7575);
        }
        catch (final InstantiationException ex) {
            return this.method19989(class7575.method23835().size());
        }
    }
    
    public List<?> method19998(final Class7573 class7573) {
        final List<Object> method19996 = this.method19996(class7573);
        this.method20001(class7573, method19996);
        return method19996;
    }
    
    public Set<?> method19999(final Class7573 class7573) {
        final Set<Object> method19995 = this.method19995(class7573);
        this.method20001(class7573, method19995);
        return method19995;
    }
    
    public Object method20000(final Class7573 class7573) {
        return this.method20002(class7573, this.method19990(class7573.method23849(), class7573.method23835().size()));
    }
    
    public void method20001(final Class7573 class7573, final Collection<Object> collection) {
        final Iterator<Class7576> iterator = class7573.method23835().iterator();
        while (iterator.hasNext()) {
            collection.add(this.method19983(iterator.next()));
        }
    }
    
    public Object method20002(final Class7573 class7573, final Object o) {
        final Class<?> componentType = class7573.method23849().getComponentType();
        int n = 0;
        for (final Class7576 obj : class7573.method23835()) {
            if (obj.method23849() == Object.class) {
                obj.method23850(componentType);
            }
            final Object method19983 = this.method19983(obj);
            if (!componentType.isPrimitive()) {
                Array.set(o, n, method19983);
            }
            else {
                if (method19983 == null) {
                    throw new NullPointerException("Unable to construct element value for " + obj);
                }
                if (!Byte.TYPE.equals(componentType)) {
                    if (!Short.TYPE.equals(componentType)) {
                        if (!Integer.TYPE.equals(componentType)) {
                            if (!Long.TYPE.equals(componentType)) {
                                if (!Float.TYPE.equals(componentType)) {
                                    if (!Double.TYPE.equals(componentType)) {
                                        if (!Character.TYPE.equals(componentType)) {
                                            if (!Boolean.TYPE.equals(componentType)) {
                                                throw new Class2386("unexpected primitive type");
                                            }
                                            Array.setBoolean(o, n, (boolean)method19983);
                                        }
                                        else {
                                            Array.setChar(o, n, (char)method19983);
                                        }
                                    }
                                    else {
                                        Array.setDouble(o, n, ((Number)method19983).doubleValue());
                                    }
                                }
                                else {
                                    Array.setFloat(o, n, ((Number)method19983).floatValue());
                                }
                            }
                            else {
                                Array.setLong(o, n, ((Number)method19983).longValue());
                            }
                        }
                        else {
                            Array.setInt(o, n, ((Number)method19983).intValue());
                        }
                    }
                    else {
                        Array.setShort(o, n, ((Number)method19983).shortValue());
                    }
                }
                else {
                    Array.setByte(o, n, ((Number)method19983).byteValue());
                }
            }
            ++n;
        }
        return o;
    }
    
    public Set<Object> method20003(final Class7575 class7575) {
        final Set<Object> method19995 = this.method19995(class7575);
        this.method20006(class7575, method19995);
        return method19995;
    }
    
    public Map<Object, Object> method20004(final Class7575 class7575) {
        final Map<Object, Object> method19997 = this.method19997(class7575);
        this.method20005(class7575, method19997);
        return method19997;
    }
    
    public void method20005(final Class7575 class7575, final Map<Object, Object> map) {
        for (final Class9474 class7576 : class7575.method23835()) {
            final Class7576 method35260 = class7576.method35260();
            final Class7576 method35261 = class7576.method35261();
            final Object method35262 = this.method19983(method35260);
            if (method35262 != null) {
                try {
                    method35262.hashCode();
                }
                catch (final Exception ex) {
                    throw new Class2390("while constructing a mapping", class7575.method23847(), "found unacceptable key " + method35262, class7576.method35260().method23847(), ex);
                }
            }
            final Object method35263 = this.method19983(method35261);
            if (method35260.method23852()) {
                this.field26134.add(0, new Class9285<Map<Object, Object>, Class9285<Object, Object>>(map, new Class9285<Object, Object>(method35262, method35263)));
            }
            else {
                map.put(method35262, method35263);
            }
        }
    }
    
    public void method20006(final Class7575 class7575, final Set<Object> set) {
        for (final Class9474 class7576 : class7575.method23835()) {
            final Class7576 method35260 = class7576.method35260();
            final Object method35261 = this.method19983(method35260);
            if (method35261 != null) {
                try {
                    method35261.hashCode();
                }
                catch (final Exception ex) {
                    throw new Class2390("while constructing a Set", class7575.method23847(), "found unacceptable key " + method35261, class7576.method35260().method23847(), ex);
                }
            }
            if (method35260.method23852()) {
                this.field26135.add(0, new Class9285<Set<Object>, Object>(set, method35261));
            }
            else {
                set.add(method35261);
            }
        }
    }
    
    public void method20007(final Class5043 field26137) {
        this.field26137 = field26137;
        this.field26138 = true;
        final Iterator<Class8051> iterator = this.field26140.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().method26417(field26137);
        }
    }
    
    public final Class5043 method20008() {
        if (this.field26137 == null) {
            this.field26137 = new Class5043();
        }
        return this.field26137;
    }
    
    public Class8051 method20009(final Class8051 class8051) {
        if (class8051 != null) {
            this.field26141.put(class8051.method26402(), class8051.method26405());
            class8051.method26417(this.method20008());
            return this.field26140.put(class8051.method26405(), class8051);
        }
        throw new NullPointerException("TypeDescription is required.");
    }
    
    public final boolean method20010() {
        return this.field26138;
    }
    
    public boolean method20011() {
        return this.field26139;
    }
    
    public void method20012(final boolean field26139) {
        this.field26139 = field26139;
    }
}
