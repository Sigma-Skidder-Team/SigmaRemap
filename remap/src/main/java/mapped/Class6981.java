// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.Vec3d;

import java.util.HashSet;
import java.util.Set;

public class Class6981 extends Class6977
{
    private static String[] field27277;
    
    public Class6981() {
        super(Class3999.class);
    }
    
    @Override
    public Set<Class9488> method21398(final BlockPos class354, final BlockState class355, final Class7614 class356) {
        final HashSet set = new HashSet();
        final BlockState method6701 = Minecraft.getInstance().world.getBlockState(class354);
        if (method6701.getBlock() instanceof Class3999) {
            set.add(new Class9488(class354, ((StateHolder<Object, BlockState>)method6701).with((IProperty<Comparable>)Class3999.field18026, (Comparable)class355.get((IProperty<V>)Class3999.field18026))));
        }
        return set;
    }
    
    @Override
    public Set<Class9488> method21399(final BlockPos field27548, final BlockState class7096, final Class7614 class7097) {
        final HashSet set = new HashSet();
        final Class7074 class7098 = new Class7074(this.field27275.world, this.field27275.player, Class316.field1877, new ItemStack(class7096.getBlock()), new BlockRayTraceResult(new Vec3d(0.0, 0.0, 0.0), Direction.UP, field27548, false));
        class7098.field27548 = field27548;
        class7098.field27549 = false;
        set.add(new Class9488(field27548, (BlockState)((StateHolder<Object, Object>)class7096.getBlock().method11846(class7098)).with((IProperty<Comparable>)Class3999.field18026, (Comparable)class7096.get((IProperty<V>)Class3999.field18026))));
        return set;
    }
}
