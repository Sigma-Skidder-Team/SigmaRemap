// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.List;

public class Class4951 extends Class4950<Class4951>
{
    private static String[] field21244;
    private final List<Class6368> field21245;
    
    public Class4951(final Class4950<?>... array) {
        this.field21245 = Lists.newArrayList();
        for (int length = array.length, i = 0; i < length; ++i) {
            this.field21245.add(array[i].method14912());
        }
    }
    
    public Class4951 method14918() {
        return this;
    }
    
    @Override
    public Class4951 method14917(final Class4950<?> class4950) {
        this.field21245.add(class4950.method14912());
        return this;
    }
    
    @Override
    public Class6368 method14912() {
        return new Class6370(this.field21245.toArray(new Class6368[0]), this.method14916());
    }
}
