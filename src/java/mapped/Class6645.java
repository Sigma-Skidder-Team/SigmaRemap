// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class Class6645 extends Class6635 implements Class6640
{
    private static String[] field26274;
    private final Map<Integer, Class2072> field26275;
    
    public Class6645(final Class6108 class6108) {
        super(class6108);
        this.field26275 = new ConcurrentHashMap<Integer, Class2072>();
    }
    
    public void method20182(final int i) {
        this.field26275.remove(i);
    }
    
    public void method20183(final int i, final Class2072 class2072) {
        this.field26275.put(i, class2072);
    }
    
    public boolean method20184(final int i) {
        return this.field26275.containsKey(i);
    }
    
    public Optional<Class2072> method20185(final int i) {
        return (Optional<Class2072>)Optional.fromNullable((Object)this.field26275.get(i));
    }
    
    @Override
    public void method20099(final int i) {
        this.field26275.put(i, Class2072.field11952);
    }
}
