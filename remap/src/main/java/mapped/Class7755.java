// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public interface Class7755 extends Class7754<Class8228>
{
    public static final Class7755 field31688 = method24754("single_pool_element", Class8227::new);
    public static final Class7755 field31689 = method24754("list_pool_element", Class8231::new);
    public static final Class7755 field31690 = method24754("feature_pool_element", Class8229::new);
    public static final Class7755 field31691 = method24754("empty_pool_element", dynamic -> Class8230.field33794);
    
    default Class7755 method24754(final String s, final Class7755 class7755) {
        return Registry.register(Registry.field234, s, class7755);
    }
}
