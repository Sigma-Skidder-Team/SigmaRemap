// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public class Class1903 implements AutoCloseable
{
    private static String[] field10328;
    private static final Logger field10329;
    private final Map<ResourceLocation, Class1844> field10330;
    private final Class1663 field10331;
    private boolean field10332;
    private final Class1662 field10333;
    
    public Class1903(final Class1663 field10331, final boolean field10332) {
        this.field10330 = Maps.newHashMap();
        this.field10333 = new Class1789(this);
        this.field10331 = field10331;
        this.field10332 = field10332;
    }
    
    @Nullable
    public Class1844 method7376(final ResourceLocation key) {
        return this.field10330.computeIfAbsent(key, class1932 -> {
            new Class1844(this.field10331, new Class1923(this.field10331, class1932));
            final Class1844 class1934;
            class1934.method6608(Lists.newArrayList((Object[])new Class1737[] { new Class1739() }));
            return class1934;
        });
    }
    
    public void method7377(final boolean field10332, final Executor executor, final Executor executor2) {
        if (field10332 != this.field10332) {
            this.field10332 = field10332;
            this.field10333.method5785(new Class7887(this), Minecraft.method5277().method5291(), Class5026.field21549, Class5026.field21549, executor, executor2);
        }
    }
    
    public Class1662 method7378() {
        return this.field10333;
    }
    
    @Override
    public void close() {
        this.field10330.values().forEach(Class1844::close);
    }
    
    static {
        field10329 = LogManager.getLogger();
    }
}
