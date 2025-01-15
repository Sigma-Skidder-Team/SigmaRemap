// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.Optional;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import com.google.common.collect.ImmutableMap;
import net.minecraft.util.math.MathHelper;

public class Class6860 extends Class6851<Class511>
{
    private static String[] field26890;
    private static final ImmutableMap<EntityType<?>, Float> field26891;
    
    @Override
    public Set<Class8233<?>> method20953() {
        return (Set<Class8233<?>>)ImmutableSet.of((Object)Class8233.field33819);
    }
    
    @Override
    public void method20955(final Class1849 class1849, final Class511 class1850) {
        class1850.method2618().method1197(Class8233.field33819, this.method20968(class1850));
    }
    
    private Optional<Class511> method20968(final Class511 class511) {
        return this.method20969(class511).flatMap(list -> list.stream().filter(this::method20972).filter(class513 -> this.method20971(class512, class513)).min((class515, class516) -> this.method20970(class514, class515, class516)));
    }
    
    private Optional<List<Class511>> method20969(final Class511 class511) {
        return class511.method2618().method1198(Class8233.field33805);
    }
    
    private int method20970(final Class511 class511, final Class511 class512, final Class511 class513) {
        return MathHelper.floor(class512.method1734(class511) - class513.method1734(class511));
    }
    
    private boolean method20971(final Class511 class511, final Class511 class512) {
        final float floatValue = (float)Class6860.field26891.get((Object)class512.method1642());
        return class512.method1734(class511) <= floatValue * floatValue;
    }
    
    private boolean method20972(final Class511 class511) {
        return Class6860.field26891.containsKey((Object)class511.method1642());
    }
    
    static {
        field26891 = ImmutableMap.builder().put((Object) EntityType.field28973, (Object)8.0f).put((Object) EntityType.field28980, (Object)12.0f).put((Object) EntityType.field28990, (Object)8.0f).put((Object) EntityType.field28991, (Object)12.0f).put((Object) EntityType.field29045, (Object)15.0f).put((Object) EntityType.field29056, (Object)12.0f).put((Object) EntityType.field29041, (Object)8.0f).put((Object) EntityType.field29044, (Object)10.0f).put((Object) EntityType.field29052, (Object)8.0f).put((Object) EntityType.field29054, (Object)8.0f).build();
    }
}
