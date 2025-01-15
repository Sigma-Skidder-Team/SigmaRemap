// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

import java.util.Optional;

public interface Class8976<T extends Class3662<?>>
{
    public static final Class8976<Class3663> field37843 = method31917("crafting");
    public static final Class8976<Class3684> field37844 = method31917("smelting");
    public static final Class8976<Class3681> field37845 = method31917("blasting");
    public static final Class8976<Class3683> field37846 = method31917("smoking");
    public static final Class8976<Class3682> field37847 = method31917("campfire_cooking");
    public static final Class8976<Class3686> field37848 = method31917("stonecutting");
    
    default <T extends Class3662<?>> Class8976<T> method31917(final String s) {
        return Class90.method512(Class90.field236, new Class1932(s), (Class8976<T>)new Class8977(s));
    }
    
    default <C extends Class446> Optional<T> method31918(final Class3662<C> value, final World class1847, final C c) {
        return (Optional<T>)(value.method11289(c, class1847) ? Optional.of(value) : Optional.empty());
    }
}
