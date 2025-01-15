// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class Class6641 extends Class6635 implements Class6640
{
    private static String[] field26264;
    private final Map<Integer, Class2148> field26265;
    
    public Class6641(final Class6108 class6108) {
        super(class6108);
        this.field26265 = new ConcurrentHashMap<Integer, Class2148>();
    }
    
    public void method20161(final int i) {
        this.field26265.remove(i);
    }
    
    public void method20162(final int i, final Class2148 class2148) {
        this.field26265.put(i, class2148);
    }
    
    public boolean method20163(final int i) {
        return this.field26265.containsKey(i);
    }
    
    public Optional<Class2148> method20164(final int i) {
        return (Optional<Class2148>)Optional.fromNullable((Object)this.field26265.get(i));
    }
    
    @Override
    public void method20099(final int i) {
        this.field26265.put(i, Class2148.field12663);
    }
}
