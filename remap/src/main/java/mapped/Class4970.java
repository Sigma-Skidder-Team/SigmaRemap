// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import net.minecraft.util.text.ITextComponent;
import org.apache.logging.log4j.LogManager;

import javax.annotation.Nullable;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public class Class4970
{
    private static final Logger field21431;
    private static final Map<Class8471<?>, Class8255<?, ?>> field21432;
    
    public static <T extends Class3418> void method15154(final Class8471<T> class8471, final Minecraft class8472, final int n, final ITextComponent class8473) {
        if (class8471 != null) {
            final Class8255<T, ?> method15155 = method15155(class8471);
            if (method15155 != null) {
                method15155.method27396(class8473, class8471, class8472, n);
            }
            else {
                Class4970.field21431.warn("Failed to create screen for menu type: {}", Registry.field235.getKey(class8471));
            }
        }
        else {
            Class4970.field21431.warn("Trying to open invalid screen with name: {}", class8473.getString());
        }
    }
    
    @Nullable
    private static <T extends Class3418> Class8255<T, ?> method15155(final Class8471<T> class8471) {
        return (Class8255)Class4970.field21432.get(class8471);
    }
    
    private static <M extends Class3418, U extends Screen & Class725<M>> void method15156(final Class8471<? extends M> class8471, final Class8255<M, U> class8472) {
        if (Class4970.field21432.put(class8471, class8472) == null) {
            return;
        }
        throw new IllegalStateException("Duplicate registration for " + Registry.field235.getKey(class8471));
    }
    
    public static boolean method15157() {
        boolean b = false;
        for (final Class8471 class8471 : Registry.field235) {
            if (Class4970.field21432.containsKey(class8471)) {
                continue;
            }
            Class4970.field21431.debug("Menu {} has no matching screen", Registry.field235.getKey(class8471));
            b = true;
        }
        return b;
    }
    
    static {
        field21431 = LogManager.getLogger();
        field21432 = Maps.newHashMap();
        method15156(Class8471.field34755, (Class8255<Class3418, Screen>)Class726::new);
        method15156(Class8471.field34756, (Class8255<Class3418, Screen>)Class726::new);
        method15156(Class8471.field34757, (Class8255<Class3418, Screen>)Class726::new);
        method15156(Class8471.field34758, (Class8255<Class3418, Screen>)Class726::new);
        method15156(Class8471.field34759, (Class8255<Class3418, Screen>)Class726::new);
        method15156(Class8471.field34760, (Class8255<Class3418, Screen>)Class726::new);
        method15156(Class8471.field34761, (Class8255<Class3418, Screen>)Class740::new);
        method15156(Class8471.field34762, (Class8255<Class3418, Screen>) AnvilScreen::new);
        method15156(Class8471.field34763, (Class8255<Class3418, Screen>)Class748::new);
        method15156(Class8471.field34764, (Class8255<Class3418, Screen>)Class523::new);
        method15156(Class8471.field34765, (Class8255<Class3418, Screen>)Class743::new);
        method15156(Class8471.field34766, (Class8255<Class3418, Screen>)Class520::new);
        method15156(Class8471.field34767, (Class8255<Class3418, Screen>)Class526::new);
        method15156(Class8471.field34768, (Class8255<Class3418, Screen>)Class522::new);
        method15156(Class8471.field34769, (Class8255<Class3418, Screen>)Class750::new);
        method15156(Class8471.field34770, (Class8255<Class3418, Screen>)Class741::new);
        method15156(Class8471.field34771, (Class8255<Class3418, Screen>)Class724::new);
        method15156(Class8471.field34772, (Class8255<Class3418, Screen>)Class744::new);
        method15156(Class8471.field34773, (Class8255<Class3418, Screen>)Class746::new);
        method15156(Class8471.field34774, (Class8255<Class3418, Screen>)Class745::new);
        method15156(Class8471.field34775, (Class8255<Class3418, Screen>)Class524::new);
        method15156(Class8471.field34776, (Class8255<Class3418, Screen>)Class749::new);
        method15156(Class8471.field34777, (Class8255<Class3418, Screen>)Class747::new);
    }
}
