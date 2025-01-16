// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

import java.util.Collection;
import java.util.Collections;
import javax.annotation.Nullable;

public interface Class469
{
    void method2401(final IRecipe<?> p0);
    
    @Nullable
    IRecipe<?> method2402();
    
    default void method2403(final PlayerEntity playerEntity) {
        final IRecipe<?> method2402 = this.method2402();
        if (method2402 != null) {
            if (!method2402.isDynamic()) {
                playerEntity.method2862((Collection<IRecipe<?>>)Collections.singleton(method2402));
                this.method2401(null);
            }
        }
    }
    
    default boolean method2416(final World class1847, final Class513 class1848, final IRecipe<?> class1849) {
        if (!class1849.isDynamic()) {
            if (class1847.method6765().method31216(Class8878.field37335)) {
                if (!class1848.method2948().method19695(class1849)) {
                    return false;
                }
            }
        }
        this.method2401(class1849);
        return true;
    }
}
