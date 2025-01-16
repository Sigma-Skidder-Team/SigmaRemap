// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import javax.annotation.Nullable;
import com.google.common.collect.Maps;
import java.util.Map;

public class Class1905 implements AutoCloseable
{
    private static final ResourceLocation field10337;
    private static final Class6332 field10338;
    private final Class1663 field10339;
    private final Map<String, Class1845> field10340;
    
    public Class1905(final Class1663 field10339) {
        this.field10340 = Maps.newHashMap();
        this.field10339 = field10339;
    }
    
    public void method7390(final Class6356 class6356) {
        Class1845.method6634(this.method7392(class6356));
    }
    
    public void method7391(final Class7351 class7351, final Class7807 class7352, final Class6356 class7353, final boolean b, final int n) {
        Class1845.method6635(this.method7392(class7353), class7351, class7352, b, n);
    }
    
    private Class1845 method7392(final Class6356 class6356) {
        Class1845 class6357 = this.field10340.get(class6356.method18906());
        if (class6357 == null) {
            class6357 = new Class1845(this, class6356, null);
            this.field10340.put(class6356.method18906(), class6357);
        }
        return class6357;
    }
    
    @Nullable
    public Class1845 method7393(final String s) {
        return this.field10340.get(s);
    }
    
    public void method7394() {
        final Iterator<Class1845> iterator = this.field10340.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().close();
        }
        this.field10340.clear();
    }
    
    @Nullable
    public Class6356 method7395(final Class1845 class1845) {
        return (class1845 == null) ? null : Class1845.method6636(class1845);
    }
    
    @Override
    public void close() {
        this.method7394();
    }
    
    static {
        field10337 = new ResourceLocation("textures/map/map_icons.png");
        field10338 = Class6332.method18787(Class1905.field10337);
    }
}
