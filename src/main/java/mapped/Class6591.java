// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Set;
import java.util.List;
import java.util.regex.Matcher;
import java.util.Iterator;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.HashMap;
import java.util.regex.Pattern;

public class Class6591 extends Class6589
{
    private static final Pattern field26148;
    private static final Pattern field26149;
    private static final Pattern field26150;
    private Class5997 field26151;
    
    public Object method20025(final Class7577 class7577, final Class8440 class7578) {
        try {
            final Object method20026 = this.method20026(class7577, class7578);
            this.method20027(method20026, new HashMap<String, Object>(class7578.method28174()));
            return method20026;
        }
        catch (final Exception ex) {
            throw new Class2386(ex);
        }
    }
    
    public Object method20026(final Class7577 class7577, final Class8440 class7578) throws Exception {
        final Class<?> method20024 = this.method20024(class7578.method28173());
        final Class[] parameterTypes = new Class[class7578.method28175().size()];
        for (int i = 0; i < parameterTypes.length; ++i) {
            parameterTypes[i] = String.class;
        }
        final Constructor<?> declaredConstructor = method20024.getDeclaredConstructor((Class<?>[])parameterTypes);
        declaredConstructor.setAccessible(true);
        return declaredConstructor.newInstance(class7578.method28175().toArray());
    }
    
    public void method20027(final Object obj, final Map<String, Object> map) throws Exception {
        if (map == null) {
            throw new NullPointerException("Data for Compact Object Notation cannot be null.");
        }
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            final String str = entry.getKey();
            final Class1935 method15355 = this.method20008().method15355(obj.getClass(), str);
            try {
                method15355.method7826(obj, entry.getValue());
            }
            catch (final IllegalArgumentException ex) {
                throw new Class2386("Cannot set property='" + str + "' with value='" + map.get(str) + "' (" + map.get(str).getClass() + ") in " + obj);
            }
        }
    }
    
    public Class8440 method20028(final String input) {
        if (!input.endsWith(")")) {
            return null;
        }
        if (input.indexOf(40) < 0) {
            return null;
        }
        final Matcher matcher = Class6591.field26149.matcher(input);
        if (!matcher.matches()) {
            return null;
        }
        final String trim = matcher.group(1).trim();
        final String group = matcher.group(3);
        final Class8440 class8440 = new Class8440(trim);
        if (group.length() != 0) {
            final String[] split = group.split("\\s*,\\s*");
            for (int i = 0; i < split.length; ++i) {
                final String input2 = split[i];
                if (input2.indexOf(61) >= 0) {
                    final Matcher matcher2 = Class6591.field26150.matcher(input2);
                    if (!matcher2.matches()) {
                        return null;
                    }
                    class8440.method28174().put(matcher2.group(1), matcher2.group(2).trim());
                }
                else {
                    class8440.method28175().add(input2);
                }
            }
            return class8440;
        }
        return class8440;
    }
    
    private Class5997 method20029() {
        if (this.field26151 == null) {
            this.field26151 = this.method20030();
        }
        return this.field26151;
    }
    
    public Class5997 method20030() {
        return new Class6016(this);
    }
    
    @Override
    public Class5997 method19985(final Class7576 class7576) {
        if (!(class7576 instanceof Class7575)) {
            if (class7576 instanceof Class7577) {
                if (Class6591.field26148.matcher(((Class7577)class7576).method23856()).matches()) {
                    return this.method20029();
                }
            }
        }
        else {
            final List<Class9474> method23835 = ((Class7575)class7576).method23835();
            if (method23835.size() == 1) {
                final Class7576 method23836 = method23835.get(0).method35260();
                if (method23836 instanceof Class7577) {
                    if (Class6591.field26148.matcher(((Class7577)method23836).method23856()).matches()) {
                        return this.method20029();
                    }
                }
            }
        }
        return super.method19985(class7576);
    }
    
    public void method20031(final Object o, final List<?> list) {
        try {
            this.method20008().method15355(o.getClass(), this.method20032(o.getClass())).method7826(o, list);
        }
        catch (final Exception ex) {
            throw new Class2386(ex);
        }
    }
    
    public String method20032(final Class<?> clazz) {
        final Set<Class1935> method15352 = this.method20008().method15352(clazz);
        final Iterator<Class1935> iterator = method15352.iterator();
        while (iterator.hasNext()) {
            if (List.class.isAssignableFrom(iterator.next().method7821())) {
                continue;
            }
            iterator.remove();
        }
        if (method15352.size() == 0) {
            throw new Class2386("No list property found in " + clazz);
        }
        if (method15352.size() <= 1) {
            return method15352.iterator().next().method7823();
        }
        throw new Class2386("Many list properties found in " + clazz + "; Please override getSequencePropertyName() to specify which property to use.");
    }
    
    static {
        field26148 = Pattern.compile("\\p{Alpha}.*\\s*\\((?:,?\\s*(?:(?:\\w*)|(?:\\p{Alpha}\\w*\\s*=.+))\\s*)+\\)");
        field26149 = Pattern.compile("(\\p{Alpha}.*)(\\s*)\\((.*?)\\)");
        field26150 = Pattern.compile("\\s*(\\p{Alpha}\\w*)\\s*=(.+)");
    }
}
