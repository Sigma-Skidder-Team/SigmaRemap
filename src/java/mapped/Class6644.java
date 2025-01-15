// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class Class6644 extends Class6635 implements Class6640
{
    private static String[] field26271;
    private final Map<Integer, Class266> field26272;
    private int field26273;
    
    public Class6644(final Class6108 class6108) {
        super(class6108);
        this.field26272 = new ConcurrentHashMap<Integer, Class266>();
    }
    
    public void method20176(final int i) {
        this.field26272.remove(i);
    }
    
    public void method20177(final int i, final Class266 class266) {
        this.field26272.put(i, class266);
    }
    
    public boolean method20178(final int i) {
        return this.field26272.containsKey(i);
    }
    
    public Optional<Class266> method20179(final int i) {
        return (Optional<Class266>)Optional.fromNullable((Object)this.field26272.get(i));
    }
    
    @Override
    public void method20099(final int n) {
        this.field26273 = n;
        this.field26272.put(n, Class266.field1309);
    }
    
    public int method20180() {
        return this.field26273;
    }
    
    public void method20181(final int field26273) {
        this.field26273 = field26273;
    }
}
