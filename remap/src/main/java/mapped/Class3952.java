// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

import java.util.Random;

public class Class3952 extends Class3841
{
    private static String[] field17851;
    public static final VoxelShape field17852;
    
    public Class3952(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public TileEntity method11898(final Class1855 class1855) {
        return new Class489();
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3952.field17852;
    }
    
    @Override
    public void method11850(final BlockState class7096, final World class7097, final BlockPos class7098, final Entity class7099) {
        if (!class7097.isRemote) {
            if (!class7099.isPassenger()) {
                if (!class7099.isBeingRidden()) {
                    if (class7099.method1855()) {
                        if (VoxelShapes.method24496(VoxelShapes.method24489(class7099.getBoundingBox().method18499(-class7098.getX(), -class7098.getY(), -class7098.getZ())), class7096.getShape(class7097, class7098), Class9306.field39924)) {
                            class7099.method1854((class7097.dimension.getType() != DimensionType.field2225) ? DimensionType.field2225 : DimensionType.field2223);
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public void method11823(final BlockState class7096, final World class7097, final BlockPos class7098, final Random random) {
        class7097.method6709(Class8432.field34639, class7098.getX() + (double)random.nextFloat(), class7098.getY() + 0.8, class7098.getZ() + (double)random.nextFloat(), 0.0, 0.0, 0.0);
    }
    
    @Override
    public ItemStack method11862(final Class1855 class1855, final BlockPos class1856, final BlockState class1857) {
        return ItemStack.field34174;
    }
    
    @Override
    public boolean method11799(final BlockState class7096, final Class7255 class7097) {
        return false;
    }
    
    static {
        field17852 = Block.method11778(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
    }
}