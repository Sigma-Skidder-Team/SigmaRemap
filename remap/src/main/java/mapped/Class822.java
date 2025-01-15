// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface Class822
{
    void method4822(final Class512 p0);
    
    @Nullable
    Class512 method4823();
    
    Class57 method4825();
    
    void method4826(final Class57 p0);
    
    void method4828(final Class9017 p0);
    
    void method4831(final ItemStack p0);
    
    Class1847 method4838();
    
    int method4821();
    
    void method4827(final int p0);
    
    boolean method4830();
    
    Class7795 method4832();
    
    default boolean method4853() {
        return false;
    }
    
    default void method4854(final Class512 class512, final ITextComponent class513, final int n) {
        final OptionalInt method2833 = class512.method2833(new Class504((n, class464, class465) -> new Class3423(n, class464, this), class513));
        if (method2833.isPresent()) {
            final Class57 method2834 = this.method4825();
            if (!method2834.isEmpty()) {
                class512.method2834(method2833.getAsInt(), method2834, n, this.method4821(), this.method4830(), this.method4853());
            }
        }
    }
}
