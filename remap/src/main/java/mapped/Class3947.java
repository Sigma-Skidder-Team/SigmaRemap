// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class Class3947 extends Class3841
{
    private static String[] field17845;
    
    public Class3947(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public TileEntity method11898(final IBlockReader class1855) {
        return new Class494();
    }
    
    @Override
    public void method11831(final Class7096 class7096, final World class7097, final BlockPos class7098, final ItemStack class7099) {
        super.method11831(class7096, class7097, class7098, class7099);
        this.method11840(class7097, class7098, 15 + class7097.rand.nextInt(15) + class7097.rand.nextInt(15));
    }
    
    @Override
    public Class2115 method11797(final Class7096 class7096) {
        return Class2115.field12307;
    }
    
    @Override
    public ItemStack method11862(final IBlockReader class1855, final BlockPos class1856, final Class7096 class1857) {
        return ItemStack.EMPTY;
    }
}
