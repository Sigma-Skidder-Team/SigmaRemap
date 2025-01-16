// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import com.mojang.datafixers.Dynamic;

public class Class4408 implements Class4407
{
    private final BlockState field19738;
    private final BlockState field19739;
    private final BlockState field19740;
    
    public Class4408(final BlockState field19738, final BlockState field19739, final BlockState field19740) {
        this.field19738 = field19738;
        this.field19739 = field19739;
        this.field19740 = field19740;
    }
    
    @Override
    public BlockState method13338() {
        return this.field19738;
    }
    
    @Override
    public BlockState method13339() {
        return this.field19739;
    }
    
    public BlockState method13340() {
        return this.field19740;
    }
    
    public static Class4408 method13341(final Dynamic<?> dynamic) {
        return new Class4408(dynamic.get("top_material").map((Function) BlockState::deserialize).orElse(Blocks.AIR.getDefaultState()), dynamic.get("under_material").map((Function) BlockState::deserialize).orElse(Blocks.AIR.getDefaultState()), dynamic.get("underwater_material").map((Function) BlockState::deserialize).orElse(Blocks.AIR.getDefaultState()));
    }
}
