// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface Class822
{
    void method4822(final PlayerEntity p0);
    
    @Nullable
    PlayerEntity method4823();
    
    Class57 method4825();
    
    void method4826(final Class57 p0);
    
    void method4828(final Class9017 p0);
    
    void method4831(final ItemStack p0);
    
    World method4838();
    
    int method4821();
    
    void method4827(final int p0);
    
    boolean method4830();
    
    Class7795 method4832();
    
    default boolean method4853() {
        return false;
    }
    
    default void method4854(final PlayerEntity playerEntity, final ITextComponent class513, final int n) {
        final OptionalInt method2833 = playerEntity.method2833(new Class504((n, class464, class465) -> new Class3423(n, class464, this), class513));
        if (method2833.isPresent()) {
            final Class57 method2834 = this.method4825();
            if (!method2834.isEmpty()) {
                playerEntity.method2834(method2833.getAsInt(), method2834, n, this.method4821(), this.method4830(), this.method4853());
            }
        }
    }
}
