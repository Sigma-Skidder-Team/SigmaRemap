// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.io.InputStream;
import org.newdawn.slick.util.xml.SlickXMLException;
import java.util.ArrayList;
import java.util.HashMap;

public class Class9003
{
    private HashMap field38005;
    private String field38006;
    private ArrayList field38007;
    private String field38008;
    
    public Class9003() {
        this.field38005 = new HashMap();
        this.field38007 = new ArrayList();
        this.field38008 = "add";
    }
    
    public Class9003(final String field38006) {
        this.field38005 = new HashMap();
        this.field38007 = new ArrayList();
        this.field38008 = "add";
        this.field38006 = field38006;
    }
    
    public void method32159(final String key, final Class value) {
        this.field38005.put(key, value);
    }
    
    public void method32160(final String e) {
        this.field38007.add(e);
    }
    
    public void method32161(final String field38008) {
        this.field38008 = field38008;
    }
    
    public void method32162(final String field38006) {
        this.field38006 = field38006;
    }
    
    public Object method32163(final String s) throws SlickXMLException {
        return this.method32164(s, Class8834.method30851(s));
    }
    
    public Object method32164(final String s, final InputStream inputStream) throws SlickXMLException {
        return this.method32168(new Class8195().method27141(s, inputStream));
    }
    
    public Object method32165(final String s, final Object o) throws SlickXMLException {
        return this.method32166(s, Class8834.method30851(s), o);
    }
    
    public Object method32166(final String s, final InputStream inputStream, final Object o) throws SlickXMLException {
        return this.method32169(new Class8195().method27141(s, inputStream), o);
    }
    
    private Class method32167(final String s) {
        final Class clazz = this.field38005.get(s);
        if (clazz != null) {
            return clazz;
        }
        if (this.field38006 != null) {
            try {
                return Class.forName(this.field38006 + "." + s);
            }
            catch (final ClassNotFoundException ex) {}
        }
        return null;
    }
    
    private Object method32168(final Class8017 class8017) throws SlickXMLException {
        return this.method32169(class8017, null);
    }
    
    private Object method32169(final Class8017 class8017, Object instance) throws SlickXMLException {
        final String method26273 = class8017.method26273();
        if (this.field38007.contains(method26273)) {
            return null;
        }
        Class<?> clazz;
        if (instance == null) {
            clazz = this.method32167(method26273);
        }
        else {
            clazz = instance.getClass();
        }
        if (clazz == null) {
            throw new Class2326("Unable to map element " + method26273 + " to a class, define the mapping");
        }
        try {
            if (instance == null) {
                instance = clazz.newInstance();
                final Method method26274 = this.method32177(clazz, "setXMLElementName", new Class[] { String.class });
                if (method26274 != null) {
                    this.method32176(method26274, instance, new Object[] { method26273 });
                }
                final Method method26275 = this.method32177(clazz, "setXMLElementContent", new Class[] { String.class });
                if (method26275 != null) {
                    this.method32176(method26275, instance, new Object[] { class8017.method26282() });
                }
            }
            final String[] method26276 = class8017.method26272();
            for (int i = 0; i < method26276.length; ++i) {
                final Method method26277 = this.method32173(clazz, "set" + method26276[i]);
                if (method26277 == null) {
                    final Field method26278 = this.method32172(clazz, method26276[i]);
                    if (method26278 != null) {
                        this.method32175(method26278, instance, this.method32170(class8017.method26274(method26276[i]), method26278.getType()));
                    }
                    else {
                        Class8452.method28207("Unable to find property on: " + clazz + " for attribute: " + method26276[i]);
                    }
                }
                else {
                    this.method32176(method26277, instance, new Object[] { this.method32170(class8017.method26274(method26276[i]), method26277.getParameterTypes()[0]) });
                }
            }
            final Class7595 method26279 = class8017.method26283();
            for (int j = 0; j < method26279.method23889(); ++j) {
                final Object method26280 = this.method32168(method26279.method23890(j));
                if (method26280 != null) {
                    final Method method26281 = this.method32174(clazz, this.field38008, method26280.getClass());
                    if (method26281 == null) {
                        Class8452.method28207("Unable to find method to add: " + method26280 + " to " + clazz);
                    }
                    else {
                        this.method32176(method26281, instance, new Object[] { method26280 });
                    }
                }
            }
            return instance;
        }
        catch (final InstantiationException ex) {
            throw new Class2326("Unable to instance " + clazz + " for element " + method26273 + ", no zero parameter constructor?", ex);
        }
        catch (final IllegalAccessException ex2) {
            throw new Class2326("Unable to instance " + clazz + " for element " + method26273 + ", no zero parameter constructor?", ex2);
        }
    }
    
    private Object method32170(final String str, Class method32171) throws SlickXMLException {
        if (method32171 == String.class) {
            return str;
        }
        try {
            method32171 = this.method32171(method32171);
            return method32171.getConstructor(String.class).newInstance(str);
        }
        catch (final Exception ex) {
            throw new Class2326("Failed to convert: " + str + " to the expected primitive type: " + method32171, ex);
        }
    }
    
    private Class method32171(final Class obj) {
        if (obj == Integer.TYPE) {
            return Integer.class;
        }
        if (obj == Double.TYPE) {
            return Double.class;
        }
        if (obj == Float.TYPE) {
            return Float.class;
        }
        if (obj == Boolean.TYPE) {
            return Boolean.class;
        }
        if (obj != Long.TYPE) {
            throw new RuntimeException("Unsupported primitive: " + obj);
        }
        return Long.class;
    }
    
    private Field method32172(final Class clazz, final String anotherString) {
        final Field[] declaredFields = clazz.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; ++i) {
            if (declaredFields[i].getName().equalsIgnoreCase(anotherString)) {
                if (declaredFields[i].getType().isPrimitive()) {
                    return declaredFields[i];
                }
                if (declaredFields[i].getType() == String.class) {
                    return declaredFields[i];
                }
            }
        }
        return null;
    }
    
    private Method method32173(final Class clazz, final String anotherString) {
        final Method[] declaredMethods = clazz.getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; ++i) {
            if (declaredMethods[i].getName().equalsIgnoreCase(anotherString)) {
                final Method method = declaredMethods[i];
                if (method.getParameterTypes().length == 1) {
                    return method;
                }
            }
        }
        return null;
    }
    
    private Method method32174(final Class clazz, final String anotherString, final Class clazz2) {
        final Method[] declaredMethods = clazz.getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; ++i) {
            if (declaredMethods[i].getName().equalsIgnoreCase(anotherString)) {
                final Method method = declaredMethods[i];
                if (method.getParameterTypes().length == 1) {
                    if (method.getParameterTypes()[0].isAssignableFrom(clazz2)) {
                        return method;
                    }
                }
            }
        }
        return null;
    }
    
    private void method32175(final Field field, final Object obj, final Object value) throws SlickXMLException {
        try {
            field.setAccessible(true);
            field.set(obj, value);
        }
        catch (final IllegalArgumentException ex) {
            throw new Class2326("Failed to set: " + field + " for an XML attribute, is it valid?", ex);
        }
        catch (final IllegalAccessException ex2) {
            throw new Class2326("Failed to set: " + field + " for an XML attribute, is it valid?", ex2);
        }
        finally {
            field.setAccessible(false);
        }
    }
    
    private void method32176(final Method obj, final Object obj2, final Object[] args) throws SlickXMLException {
        try {
            obj.setAccessible(true);
            obj.invoke(obj2, args);
        }
        catch (final IllegalArgumentException ex) {
            throw new Class2326("Failed to invoke: " + obj + " for an XML attribute, is it valid?", ex);
        }
        catch (final IllegalAccessException ex2) {
            throw new Class2326("Failed to invoke: " + obj + " for an XML attribute, is it valid?", ex2);
        }
        catch (final InvocationTargetException ex3) {
            throw new Class2326("Failed to invoke: " + obj + " for an XML attribute, is it valid?", ex3);
        }
        finally {
            obj.setAccessible(false);
        }
    }
    
    private Method method32177(final Class clazz, final String name, final Class[] parameterTypes) {
        try {
            return clazz.getMethod(name, (Class[])parameterTypes);
        }
        catch (final SecurityException ex) {
            return null;
        }
        catch (final NoSuchMethodException ex2) {
            return null;
        }
    }
}
