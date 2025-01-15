// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.List;

public class Class4947 implements Class4946<Class4947>
{
    private static String[] field21234;
    private final List<Class9320> field21235;
    private final List<Class125> field21236;
    private Class8212 field21237;
    
    public Class4947() {
        this.field21235 = Lists.newArrayList();
        this.field21236 = Lists.newArrayList();
        this.field21237 = Class9317.field40010;
    }
    
    public Class4947 method14902(final Class4945 class4945) {
        this.field21235.add(class4945.method14900());
        return this;
    }
    
    public Class4947 method14903(final Class8212 field21237) {
        this.field21237 = field21237;
        return this;
    }
    
    public Class4947 method14904(final Class4942 class4942) {
        this.field21236.add(class4942.method14888());
        return this;
    }
    
    public Class4947 method14905() {
        return this;
    }
    
    public Class9317 method14906() {
        return new Class9317(this.field21237, this.field21235.toArray(new Class9320[0]), this.field21236.toArray(new Class125[0]), null);
    }
}
