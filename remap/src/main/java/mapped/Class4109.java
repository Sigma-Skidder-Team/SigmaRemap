// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import javax.annotation.Nullable;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.StringReader;
import net.minecraft.util.math.BlockPos;

public class Class4109 extends Class4107
{
    public static final Class4109 field18212;
    
    private Class4109() {
    }
    
    @Nullable
    @Override
    public Class9038 method12350(final Class1852 class1852, final BlockPos class1853, final Class9038 class1854, final Class9038 class1855, final Class9092 class1856) {
        if (class1855.field38249.getBlock() != Blocks.JIGSAW) {
            return class1855;
        }
        final Class7572 class1857 = new Class7572(new StringReader(class1855.field38250.getString("final_state")), false);
        try {
            class1857.method23802(true);
        }
        catch (final CommandSyntaxException cause) {
            throw new RuntimeException(cause);
        }
        return (class1857.method23799().method21696() == Blocks.STRUCTURE_VOID) ? null : new Class9038(class1855.field38248, class1857.method23799(), null);
    }
    
    @Override
    public Class7756 method12351() {
        return Class7756.field31695;
    }
    
    @Override
    public <T> Dynamic<T> method12352(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic(dynamicOps, dynamicOps.emptyMap());
    }
    
    static {
        field18212 = new Class4109();
    }
}
