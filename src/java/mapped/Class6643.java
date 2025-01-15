// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class Class6643 extends Class6635 implements Class6640
{
    private static String[] field26269;
    private final Map<Integer, Class1989> field26270;
    
    public Class6643(final Class6108 class6108) {
        super(class6108);
        this.field26270 = new ConcurrentHashMap<Integer, Class1989>();
    }
    
    public void method20172(final int i) {
        this.field26270.remove(i);
    }
    
    public void method20173(final int i, final Class1989 class1989) {
        this.field26270.put(i, class1989);
    }
    
    public boolean method20174(final int i) {
        return this.field26270.containsKey(i);
    }
    
    public Optional<Class1989> method20175(final int i) {
        return (Optional<Class1989>)Optional.fromNullable((Object)this.field26270.get(i));
    }
    
    @Override
    public void method20099(final int i) {
        this.field26270.put(i, Class1989.field11014);
    }
}
