// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

import java.util.Optional;

public interface Class8976<T extends IRecipe<?>>
{
    public static final Class8976<Class3663> field37843 = method31917("crafting");
    public static final Class8976<Class3684> field37844 = method31917("smelting");
    public static final Class8976<Class3681> field37845 = method31917("blasting");
    public static final Class8976<Class3683> field37846 = method31917("smoking");
    public static final Class8976<Class3682> field37847 = method31917("campfire_cooking");
    public static final Class8976<Class3686> field37848 = method31917("stonecutting");
    
    default <T extends IRecipe<?>> Class8976<T> method31917(final String s) {
        return Registry.method512(Registry.field236, new ResourceLocation(s), (Class8976<T>)new Class8977(s));
    }
    
    default <C extends IInventory> Optional<T> method31918(final IRecipe<C> value, final World class1847, final C c) {
        return (Optional<T>)(value.matches(c, class1847) ? Optional.of(value) : Optional.empty());
    }
}
