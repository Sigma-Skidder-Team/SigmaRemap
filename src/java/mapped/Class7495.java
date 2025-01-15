// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.HashMap;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.net.URL;
import java.util.concurrent.ConcurrentSkipListMap;
import java.io.File;

public abstract class Class7495 implements Class7496
{
    private static final ThreadLocal<Class6873> field28941;
    private Class8583 field28942;
    private final File field28943;
    private ConcurrentSkipListMap<String, Object> field28944;
    
    public Class7495(final File field28943) {
        this.field28942 = new Class8583('.', 2);
        this.field28943 = field28943;
    }
    
    public abstract URL method23314();
    
    public synchronized Map<String, Object> method23320(final File file) {
        final List<String> method23316 = this.method23316();
        final URL method23317 = this.method23314();
        try {
            this.field28942.method29056(method23317.openStream());
            final Iterator iterator = method23316.iterator();
            while (iterator.hasNext()) {
                final List<String> method23318 = this.field28942.method29055((String)iterator.next());
                if (method23318 != null) {
                    method23318.clear();
                }
            }
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
        Map<?, ?> map = null;
        if (file.exists()) {
            try (final FileInputStream fileInputStream = new FileInputStream(file)) {
                map = (Map<?, ?>)Class7495.field28941.get().method20998(fileInputStream);
            }
            catch (final FileNotFoundException ex2) {
                ex2.printStackTrace();
            }
            catch (final IOException ex3) {
                ex3.printStackTrace();
            }
        }
        if (map == null) {
            map = new HashMap<Object, Object>();
        }
        Map<?, ?> map2 = map;
        try (final InputStream openStream = method23317.openStream()) {
            map2 = Class7495.field28941.get().method20998(openStream);
            final Iterator iterator2 = method23316.iterator();
            while (iterator2.hasNext()) {
                map2.remove(iterator2.next());
            }
            for (final Object next : map.keySet()) {
                if (map2.containsKey(next) && !method23316.contains(next.toString())) {
                    map2.put(next, map.get(next));
                }
            }
        }
        catch (final IOException ex4) {
            ex4.printStackTrace();
        }
        this.method23315((Map<String, Object>)map2);
        return (Map<String, Object>)map2;
    }
    
    public abstract void method23315(final Map<String, Object> p0);
    
    public synchronized void method23321(final File file, final Map<String, Object> map) {
        try {
            this.field28942.method29057(Class7495.field28941.get().method20988(map), file);
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public abstract List<String> method23316();
    
    @Override
    public void method23322(final String key, final Object value) {
        this.field28944.put(key, value);
    }
    
    @Override
    public void method23323() {
        this.field28943.getParentFile().mkdirs();
    }
    
    @Override
    public void method23324() {
        this.field28944 = new ConcurrentSkipListMap<String, Object>(this.method23320(this.field28943));
    }
    
    @Override
    public Map<String, Object> method23325() {
        return this.field28944;
    }
    
    public <T> T method23326(final String key, final Class<T> clazz, final T t) {
        final Object value = this.field28944.get(key);
        if (value == null) {
            return t;
        }
        return (T)value;
    }
    
    public boolean method23327(final String key, final boolean b) {
        final Boolean value = this.field28944.get(key);
        if (value == null) {
            return b;
        }
        return value;
    }
    
    public String method23328(final String key, final String s) {
        final String value = this.field28944.get(key);
        if (value == null) {
            return s;
        }
        return value;
    }
    
    public int method23329(final String key, final int n) {
        final Number value = this.field28944.get(key);
        if (value == null) {
            return n;
        }
        if (!(value instanceof Number)) {
            return n;
        }
        return value.intValue();
    }
    
    public double method23330(final String key, final double n) {
        final Number value = this.field28944.get(key);
        if (value == null) {
            return n;
        }
        if (!(value instanceof Number)) {
            return n;
        }
        return value.doubleValue();
    }
    
    public List<Integer> method23331(final String key) {
        final List<Integer> value = this.field28944.get(key);
        if (value == null) {
            return new ArrayList<Integer>();
        }
        return value;
    }
    
    static {
        field28941 = new Class2433();
    }
}
