// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

import java.util.function.ToIntFunction;
import java.util.function.BiPredicate;
import java.util.function.BiConsumer;

public enum Class2120
{
    field12359("points", PlayerEntity::method2871, (class513, n) -> {
        if (n < class513.method2875()) {
            class513.method2917(n);
            return true;
        }
        else {
            return false;
        }
    }, class514 -> MathHelper.method35642(class514.field3028 * class514.method2875())),
    field12360("levels", Class513::method2874, (class515, n2) -> {
        class515.method2918(n2);
        return true;
    }, class516 -> class516.field3026);
    
    public final BiConsumer<Class513, Integer> field12361;
    public final BiPredicate<Class513, Integer> field12362;
    public final String field12363;
    private final ToIntFunction<Class513> field12364;
    
    Class2120(final String field12363, final BiConsumer<Class513, Integer> field12364, final BiPredicate<Class513, Integer> field12365, final ToIntFunction<Class513> field12366) {
        this.field12361 = field12364;
        this.field12363 = field12363;
        this.field12362 = field12365;
        this.field12364 = field12366;
    }
}
