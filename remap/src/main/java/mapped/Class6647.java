// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Sets;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Set;

public class Class6647 extends Class6635
{
    private static String[] field26279;
    private static final Set<Integer> field26280;
    private final Map<Class8322, Class6082> field26281;
    
    public Class6647(final Class6108 class6108) {
        super(class6108);
        this.field26281 = new ConcurrentHashMap<Class8322, Class6082>();
    }
    
    public void method20190(final Class8322 class8322, final int n) {
        this.method20191(class8322, n, -1);
    }
    
    public void method20191(final Class8322 class8322, final int i, final int n) {
        if (Class6647.field26280.contains(i)) {
            this.field26281.put(class8322, new Class6082(this, i, n));
        }
    }
    
    public boolean method20192(final int i) {
        return Class6647.field26280.contains(i);
    }
    
    public boolean method20193(final Class8322 class8322) {
        return this.field26281.containsKey(class8322);
    }
    
    public Class6082 method20194(final Class8322 class8322) {
        return this.field26281.get(class8322);
    }
    
    public Class6082 method20195(final Class8322 class8322) {
        return this.field26281.remove(class8322);
    }
    
    static {
        (field26280 = Sets.newConcurrentHashSet()).add(5266);
        for (int i = 0; i < 16; ++i) {
            Class6647.field26280.add(972 + i);
        }
        for (int j = 0; j < 20; ++j) {
            Class6647.field26280.add(6854 + j);
        }
        for (int k = 0; k < 4; ++k) {
            Class6647.field26280.add(7110 + k);
        }
        for (int l = 0; l < 5; ++l) {
            Class6647.field26280.add(5447 + l);
        }
    }
}
