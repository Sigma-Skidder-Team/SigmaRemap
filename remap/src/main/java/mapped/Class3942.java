// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class Class3942 extends Class3841
{
    public static final Class7114<Direction> field17832;
    public static final ResourceLocation field17833;
    private final Class181 field17834;
    
    public Class3942(final Class181 field17834, final Class9288 class9288) {
        super(class9288);
        this.field17834 = field17834;
        this.method11877(((StateHolder<O, Class7096>)this.field17406.method32903()).with(Class3942.field17832, Direction.UP));
    }
    
    @Override
    public TileEntity method11898(final IBlockReader class1855) {
        return new Class440(this.field17834);
    }
    
    @Override
    public boolean method11794(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098) {
        return true;
    }
    
    @Override
    public Class2115 method11797(final Class7096 class7096) {
        return Class2115.field12306;
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099, final Class316 class7100, final BlockRayTraceResult class7101) {
        if (class7097.isRemote) {
            return Class2201.field13400;
        }
        if (class7099.isSpectator()) {
            return Class2201.field13400;
        }
        final TileEntity method6727 = class7097.getTileEntity(class7098);
        if (!(method6727 instanceof Class440)) {
            return Class2201.field13402;
        }
        final Direction class7102 = class7096.method21772(Class3942.field17832);
        final Class440 class7103 = (Class440)method6727;
        if (class7103.method2234() != Class2100.field12169 || class7097.method6976(VoxelShapes.fullCube().getBoundingBox().expand(0.5f * class7102.getXOffset(), 0.5f * class7102.getYOffset(), 0.5f * class7102.getZOffset()).contract(class7102.getXOffset(), class7102.getYOffset(), class7102.getZOffset()).offset(class7098.method1149(class7102)))) {
            class7099.method2833(class7103);
            class7099.method2857(Class8276.field34045);
        }
        return Class2201.field13400;
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        return ((StateHolder<O, Class7096>)this.getDefaultState()).with(Class3942.field17832, class7074.method21648());
    }
    
    @Override
    public void method11875(final Class9500<Block, Class7096> class9500) {
        class9500.method35378(Class3942.field17832);
    }
    
    @Override
    public void method11870(final World class1847, final BlockPos class1848, final Class7096 class1849, final PlayerEntity class1850) {
        final TileEntity method6727 = class1847.getTileEntity(class1848);
        Label_0015: {
            if (method6727 instanceof Class440) {
                final Class440 class1851 = (Class440)method6727;
                if (!class1847.isRemote) {
                    if (class1850.method2889()) {
                        if (!class1851.method2156()) {
                            final ItemStack method6728 = method12061(this.method12060());
                            final CompoundNBT method6729 = class1851.method2245(new CompoundNBT());
                            if (!method6729.method331()) {
                                method6728.method27676("BlockEntityTag", method6729);
                            }
                            if (class1851.hasCustomName()) {
                                method6728.method27665(class1851.getCustomName());
                            }
                            final Class427 class1852 = new Class427(class1847, class1848.getX(), class1848.getY(), class1848.getZ(), method6728);
                            class1852.method2114();
                            class1847.method6886(class1852);
                            break Label_0015;
                        }
                    }
                }
                class1851.method2326(class1850);
            }
        }
        super.method11870(class1847, class1848, class1849, class1850);
    }
    
    @Override
    public List<ItemStack> method11833(final Class7096 class7096, Class9098 method32879) {
        final TileEntity class7097 = method32879.method32882(Class6683.field26369);
        if (class7097 instanceof Class440) {
            method32879 = method32879.method32879(Class3942.field17833, (class441, consumer) -> {
                for (int i = 0; i < class440.method2239(); ++i) {
                    consumer.accept(class440.method2157(i));
                }
            });
        }
        return super.method11833(class7096, method32879);
    }
    
    @Override
    public void method11853(final World class1847, final BlockPos class1848, final Class7096 class1849, final LivingEntity class1850, final ItemStack class1851) {
        if (class1851.method27667()) {
            final TileEntity method6727 = class1847.getTileEntity(class1848);
            if (method6727 instanceof Class440) {
                ((Class440)method6727).method2335(class1851.method27664());
            }
        }
    }
    
    @Override
    public void method11829(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class7096 class7099, final boolean b) {
        if (class7096.method21696() != class7099.method21696()) {
            if (class7097.getTileEntity(class7098) instanceof Class440) {
                class7097.method6783(class7098, class7096.method21696());
            }
            super.method11829(class7096, class7097, class7098, class7099, b);
        }
    }
    
    @Override
    public void method11883(final ItemStack class8321, final IBlockReader class8322, final List<ITextComponent> list, final Class1981 class8323) {
        super.method11883(class8321, class8322, list, class8323);
        final CompoundNBT method27660 = class8321.method27660("BlockEntityTag");
        if (method27660 != null) {
            if (method27660.contains("LootTable", 8)) {
                list.add(new StringTextComponent("???????"));
            }
            if (method27660.contains("Items", 9)) {
                final Class2265<ItemStack> method27661 = Class2265.method8507(27, ItemStack.EMPTY);
                Class8508.method28426(method27660, method27661);
                int n = 0;
                int n2 = 0;
                for (final ItemStack class8324 : method27661) {
                    if (class8324.method27620()) {
                        continue;
                    }
                    ++n2;
                    if (n > 4) {
                        continue;
                    }
                    ++n;
                    final ITextComponent method27662 = class8324.method27664().deepCopy();
                    method27662.appendText(" x").appendText(String.valueOf(class8324.method27690()));
                    list.add(method27662);
                }
                if (n2 - n > 0) {
                    list.add(new Class2259("container.shulkerBox.more", new Object[] { n2 - n }).applyTextStyle(TextFormatting.ITALIC));
                }
            }
        }
    }
    
    @Override
    public PushReaction method11858(final Class7096 class7096) {
        return PushReaction.DESTROY;
    }
    
    @Override
    public VoxelShape method11808(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        final TileEntity method6727 = class7097.getTileEntity(class7098);
        return (method6727 instanceof Class440) ? VoxelShapes.method24489(((Class440)method6727).method2235(class7096)) : VoxelShapes.fullCube();
    }
    
    @Override
    public boolean method11873(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public int method11874(final Class7096 class7096, final World class7097, final BlockPos class7098) {
        return Class3418.method10898((Class446)class7097.getTileEntity(class7098));
    }
    
    @Override
    public ItemStack method11862(final IBlockReader class1855, final BlockPos class1856, final Class7096 class1857) {
        final ItemStack method11862 = super.method11862(class1855, class1856, class1857);
        final CompoundNBT method11863 = ((Class440)class1855.getTileEntity(class1856)).method2245(new CompoundNBT());
        if (!method11863.method331()) {
            method11862.method27676("BlockEntityTag", method11863);
        }
        return method11862;
    }
    
    @Nullable
    public static Class181 method12057(final Item class3820) {
        return method12058(Block.method11776(class3820));
    }
    
    @Nullable
    public static Class181 method12058(final Block class3833) {
        return (class3833 instanceof Class3942) ? ((Class3942)class3833).method12060() : null;
    }
    
    public static Block method12059(final Class181 class181) {
        if (class181 == null) {
            return Class7521.field29648;
        }
        switch (Class9395.field40302[class181.ordinal()]) {
            case 1: {
                return Class7521.field29649;
            }
            case 2: {
                return Class7521.field29650;
            }
            case 3: {
                return Class7521.field29651;
            }
            case 4: {
                return Class7521.field29652;
            }
            case 5: {
                return Class7521.field29653;
            }
            case 6: {
                return Class7521.field29654;
            }
            case 7: {
                return Class7521.field29655;
            }
            case 8: {
                return Class7521.field29656;
            }
            case 9: {
                return Class7521.field29657;
            }
            case 10: {
                return Class7521.field29658;
            }
            default: {
                return Class7521.field29659;
            }
            case 12: {
                return Class7521.field29660;
            }
            case 13: {
                return Class7521.field29661;
            }
            case 14: {
                return Class7521.field29662;
            }
            case 15: {
                return Class7521.field29663;
            }
            case 16: {
                return Class7521.field29664;
            }
        }
    }
    
    @Nullable
    public Class181 method12060() {
        return this.field17834;
    }
    
    public static ItemStack method12061(final Class181 class181) {
        return new ItemStack(method12059(class181));
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return ((StateHolder<O, Class7096>)class7096).with(Class3942.field17832, class7097.method8142(class7096.method21772(Class3942.field17832)));
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.method21772(Class3942.field17832)));
    }
    
    static {
        field17832 = Class3834.field17415;
        field17833 = new ResourceLocation("contents");
    }
}
