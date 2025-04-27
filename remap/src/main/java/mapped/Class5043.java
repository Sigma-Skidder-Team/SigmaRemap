// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.TreeSet;
import java.lang.reflect.Method;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.beans.IntrospectionException;
import java.beans.FeatureDescriptor;
import java.beans.Introspector;
import java.lang.reflect.Modifier;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class Class5043
{
    private final Map<Class<?>, Map<String, Class1935>> field21597;
    private final Map<Class<?>, Set<Class1935>> field21598;
    private Class2175 field21599;
    private boolean field21600;
    private boolean field21601;
    private final Class5995 field21602;
    private static final String field21603 = "transient";
    
    public Class5043() {
        this(new Class5995());
    }
    
    public Class5043(final Class5995 field21602) {
        this.field21597 = new HashMap<Class<?>, Map<String, Class1935>>();
        this.field21598 = new HashMap<Class<?>, Set<Class1935>>();
        this.field21599 = Class2175.field12901;
        this.field21600 = false;
        this.field21601 = false;
        this.field21602 = field21602;
        if (field21602.method17921()) {
            this.field21599 = Class2175.field12902;
        }
    }
    
    public Map<String, Class1935> method15350(final Class<?> beanClass, final Class2175 class2175) {
        if (this.field21597.containsKey(beanClass)) {
            return this.field21597.get(beanClass);
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean b = false;
        switch (Class9580.field41745[class2175.ordinal()]) {
            case 1: {
                for (Class<?> superclass = beanClass; superclass != null; superclass = superclass.getSuperclass()) {
                    for (final Field field : superclass.getDeclaredFields()) {
                        final int modifiers = field.getModifiers();
                        if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers) && !linkedHashMap.containsKey(field.getName())) {
                            linkedHashMap.put(field.getName(), new Class1939(field));
                        }
                    }
                }
                break;
            }
            default: {
                try {
                    for (final PropertyDescriptor propertyDescriptor : Introspector.getBeanInfo(beanClass).getPropertyDescriptors()) {
                        final Method readMethod = propertyDescriptor.getReadMethod();
                        if ((readMethod == null || !readMethod.getName().equals("getClass")) && !this.method15351(propertyDescriptor)) {
                            linkedHashMap.put(propertyDescriptor.getName(), new Class1938(propertyDescriptor));
                        }
                    }
                }
                catch (final IntrospectionException ex) {
                    throw new Class2386(ex);
                }
                for (Class<?> superclass2 = beanClass; superclass2 != null; superclass2 = superclass2.getSuperclass()) {
                    for (final Field field2 : superclass2.getDeclaredFields()) {
                        final int modifiers2 = field2.getModifiers();
                        if (!Modifier.isStatic(modifiers2) && !Modifier.isTransient(modifiers2)) {
                            if (Modifier.isPublic(modifiers2)) {
                                linkedHashMap.put(field2.getName(), new Class1939(field2));
                            }
                            else {
                                b = true;
                            }
                        }
                    }
                }
                break;
            }
        }
        if (linkedHashMap.isEmpty() && b) {
            throw new Class2386("No JavaBean properties found in " + beanClass.getName());
        }
        this.field21597.put(beanClass, linkedHashMap);
        return linkedHashMap;
    }
    
    private boolean method15351(final FeatureDescriptor featureDescriptor) {
        return Boolean.TRUE.equals(featureDescriptor.getValue("transient"));
    }
    
    public Set<Class1935> method15352(final Class<?> clazz) {
        return this.method15353(clazz, this.field21599);
    }
    
    public Set<Class1935> method15353(final Class<?> clazz, final Class2175 class2175) {
        if (!this.field21598.containsKey(clazz)) {
            final Set<Class1935> method15354 = this.method15354(clazz, class2175);
            this.field21598.put(clazz, method15354);
            return method15354;
        }
        return this.field21598.get(clazz);
    }
    
    public Set<Class1935> method15354(final Class<?> clazz, final Class2175 class2175) {
        final TreeSet set = new TreeSet();
        for (final Class1935 class2176 : this.method15350(clazz, class2175).values()) {
            if (!class2176.method7825()) {
                continue;
            }
            if (!this.field21600 && !class2176.method7824()) {
                continue;
            }
            set.add(class2176);
        }
        return set;
    }
    
    public Class1935 method15355(final Class<?> clazz, final String s) {
        return this.method15356(clazz, s, this.field21599);
    }
    
    public Class1935 method15356(final Class<?> clazz, final String str, final Class2175 class2175) {
        Class1935 class2176 = this.method15350(clazz, class2175).get(str);
        if (class2176 == null) {
            if (this.field21601) {
                class2176 = new Class1940(str);
            }
        }
        if (class2176 != null) {
            return class2176;
        }
        throw new Class2386("Unable to find property '" + str + "' on class: " + clazz.getName());
    }
    
    public void method15357(final Class2175 field21599) {
        if (this.field21602.method17921() && field21599 != Class2175.field12902) {
            throw new IllegalArgumentException("JVM is Android - only BeanAccess.FIELD is available");
        }
        if (this.field21599 != field21599) {
            this.field21599 = field21599;
            this.field21597.clear();
            this.field21598.clear();
        }
    }
    
    public void method15358(final boolean field21600) {
        if (this.field21600 != field21600) {
            this.field21600 = field21600;
            this.field21598.clear();
        }
    }
    
    public boolean method15359() {
        return this.field21600;
    }
    
    public void method15360(final boolean field21601) {
        if (this.field21601 != field21601) {
            this.field21601 = field21601;
            this.field21598.clear();
        }
    }
    
    public boolean method15361() {
        return this.field21601;
    }
}
