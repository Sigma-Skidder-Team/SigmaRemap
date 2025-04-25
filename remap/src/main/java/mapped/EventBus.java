// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Module;

import java.util.Iterator;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Collection;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventBus {
    public final Map<Class<? extends Class5730>, Class7557[]> field26967;
    public final Map<Class<? extends Module>, Map<Class<? extends Class5730>, List<Class7557>>> field26968;
    public int field26969;
    public long field26970;

    public EventBus() {
        this.field26967 = new HashMap<Class<? extends Class5730>, Class7557[]>();
        this.field26968 = new HashMap<Class<? extends Module>, Map<Class<? extends Class5730>, List<Class7557>>>();
        this.field26969 = 0;
        this.field26970 = System.currentTimeMillis();
    }

    public boolean method21087(final Method method) {
        if (method.isAnnotationPresent(EventListener.class)) {
            if (method.getParameterCount() == 1) {
                if (Class5730.class.isAssignableFrom(method.getParameterTypes()[0])) {
                    return true;
                }
            }
        }
        return false;
    }

    public Class7557[] method21088(final Class7557[] array) {
        final ArrayList list = new ArrayList();
        for (final Class2046 class2046 : Class2046.values()) {
            for (final Class7557 e : array) {
                if (e.method23727() == class2046) {
                    list.add(e);
                }
            }
        }
        return list.toArray(new Class7557[0]);
    }

    public boolean method21089(final Class7557[] array, final Class7557 class7557) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (array[i].equals(class7557)) {
                return true;
            }
        }
        return false;
    }

    public boolean method21090(final Class7557[] array, final Class<?> clazz, final Class7557 class7557) {
        try {
            final Method method = class7557.method23723().getClass().getMethod(class7557.method23726().getName(), class7557.method23726().getParameterTypes());
            return !this.method21089(array, class7557) && (method.getDeclaringClass() == clazz || !this.method21087(method));
        } catch (final NoSuchMethodException ex) {
            return true;
        } catch (final SecurityException ex2) {
            ex2.printStackTrace();
            return false;
        }
    }

    public Class2046 method21091(final Method method) {
        if (method.isAnnotationPresent(Class6763.class)) {
            return Class2046.field11655;
        }
        if (method.isAnnotationPresent(Class6757.class)) {
            return Class2046.field11656;
        }
        if (method.isAnnotationPresent(Class6759.class)) {
            return Class2046.field11658;
        }
        if (!method.isAnnotationPresent(Class6755.class)) {
            return Class2046.field11657;
        }
        return Class2046.field11659;
    }

    public void register(final Module class3167) {
        final Map map = this.field26968.get(class3167.getClass());
        if (map != null) {
            for (final Map.Entry<Class, V> entry : map.entrySet()) {
                final Class key = entry.getKey();
                final LinkedHashSet set = new LinkedHashSet((Collection) entry.getValue());
                final Class7557[] array = this.field26967.getOrDefault(key, new Class7557[0]);
                set.addAll((Collection) Arrays.asList(array));
                this.field26967.put(key, this.method21088((Class7557[]) set.toArray((Object[]) array)));
            }
        }
    }

    public void unregister(final Module class3167) {
        final Map map = this.field26968.get(class3167.getClass());
        if (map != null) {
            for (final Map.Entry<Class, V> entry : map.entrySet()) {
                final Class key = entry.getKey();
                final List c = (List) entry.getValue();
                final LinkedHashSet set = new LinkedHashSet(Arrays.asList((Object[]) this.field26967.getOrDefault(key, new Class7557[0])));
                set.removeAll(c);
                this.field26967.put(key, (Class7557[]) set.toArray((Object[]) new Class7557[0]));
            }
        }
        this.method21096();
    }

    public void register2(final Object o) {
        if (o != null) {
            for (Class<?> key = o.getClass(); key != null; key = key.getSuperclass()) {
                for (final Method method : key.getDeclaredMethods()) {
                    if (this.method21087(method)) {
                        method.setAccessible(true);
                        final Class2046 method2 = this.method21091(method);
                        final Class<?> clazz = method.getParameterTypes()[0];
                        Class7557[] original = this.field26967.get(clazz);
                        if (original == null) {
                            this.field26967.put((Class<? extends Class5730>) clazz, original = new Class7557[0]);
                        }
                        final Class7557 class7557 = new Class7557(o, key, method, method2);
                        if (this.method21090(original, key, class7557)) {
                            if (!Module.class.isAssignableFrom(key) || method.isAnnotationPresent(Class6754.class)) {
                                final Class7557[] array = Arrays.copyOf(original, original.length + 1);
                                array[array.length - 1] = class7557;
                                this.field26967.put((Class<? extends Class5730>) clazz, this.method21088(array));
                            } else if (!class7557.method23728()) {
                                final Map<Class<? extends Class5730>, List<Class7557>> map = this.field26968.getOrDefault(key, new HashMap<Class<? extends Class5730>, List<Class7557>>());
                                List list = map.get(clazz);
                                if (list == null) {
                                    map.put((Class<? extends Class5730>) clazz, list = new ArrayList());
                                }
                                list.add(class7557);
                                map.put((Class<? extends Class5730>) clazz, list);
                                this.field26968.put((Class) key, map);
                            } else {
                                Class9146.field38765.add(o);
                            }
                        }
                    }
                }
            }
            this.method21096();
        }
    }

    public void method21095(final Object o) {
        if (o != null) {
            return;
        }
    }

    public void method21096() {
        final Iterator<Class7557[]> iterator = this.field26967.values().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length != 0) {
                continue;
            }
            iterator.remove();
        }
    }

    public void post(final Class5730 class5730) {
        if (class5730 == null) {
            return;
        }
        final Class7557[] array = this.field26967.get(class5730.getClass());
        if (array == null) {
            return;
        }
        final int length = array.length;
        try {
            for (final Class7557 class5731 : array) {
                class5731.method23725().method22431(class5731.method23723(), class5730);
            }
        } catch (final Exception ex) {
            ex.printStackTrace();
            Client.getInstance().getLogger().error("An unhandled exception occured in an event handler's function");
        } catch (final Throwable t) {
            t.printStackTrace();
        }
    }
}
