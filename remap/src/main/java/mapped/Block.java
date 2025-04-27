// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.cache.CacheLoader;
import com.google.common.cache.CacheBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import java.util.Random;
import java.util.stream.Stream;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import com.google.common.cache.LoadingCache;
import org.apache.logging.log4j.Logger;

public class Block implements Class3832
{
    public static final Logger field17390;
    public static final Class94<BlockState> field17391;
    private static final Direction[] field17392;
    private static final LoadingCache<VoxelShape, Boolean> field17393;
    private static final VoxelShape field17394;
    private static final VoxelShape field17395;
    public final int field17396;
    public final float field17397;
    public final float field17398;
    public final boolean field17399;
    public final SoundType field17400;
    public final Material field17401;
    public final MaterialColor field17402;
    private final float field17403;
    private final float field17404;
    private final float field17405;
    public final StateContainer<Block, BlockState> field17406;
    private BlockState field17407;
    public final boolean field17408;
    private final boolean field17409;
    private final boolean field17410;
    private ResourceLocation field17411;
    private String field17412;
    private Item field17413;
    private static final ThreadLocal<Object2ByteLinkedOpenHashMap<Class8266>> field17414;
    
    public static int method11774(final BlockState class7096) {
        if (class7096 != null) {
            final boolean method563 = Block.field17391.method563(class7096) != 0;
            return ((method563 ? 1 : 0) != -1 && method563) ? 1 : 0;
        }
        return 0;
    }
    
    public static BlockState method11775(final int n) {
        final BlockState class7096 = Block.field17391.method499(n);
        return (class7096 != null) ? class7096 : Blocks.AIR.getDefaultState();
    }
    
    public static Block method11776(final Item class3820) {
        return (class3820 instanceof Class4036) ? ((Class4036)class3820).method12240() : Blocks.AIR;
    }
    
    public static BlockState method11777(final BlockState class7096, final BlockState class7097, final World class7098, final BlockPos class7099) {
        final VoxelShape method24541 = VoxelShapes.method24495(class7096.getCollisionShape(class7098, class7099), class7097.getCollisionShape(class7098, class7099), IBooleanFunction.ONLY_SECOND).withOffset(class7099.getX(), class7099.getY(), class7099.getZ());
        for (final Entity class7100 : class7098.method7127(null, method24541.getBoundingBox())) {
            class7100.method1878(class7100.getPosX(), class7100.getPosY() + 1.0 + VoxelShapes.method24498(Direction.Axis.Y, class7100.getBoundingBox().offset(0.0, 1.0, 0.0), Stream.of(method24541), -1.0), class7100.getPosZ());
        }
        return class7097;
    }
    
    public static VoxelShape method11778(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        return VoxelShapes.method24488(n / 16.0, n2 / 16.0, n3 / 16.0, n4 / 16.0, n5 / 16.0, n6 / 16.0);
    }
    
    @Deprecated
    public boolean canEntitySpawn(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final EntityType<?> class7099) {
        return class7096.isSolidSide(class7097, class7098, Direction.UP) && this.field17396 < 14;
    }
    
    @Deprecated
    public boolean method11780(final BlockState class7096) {
        return false;
    }
    
    @Deprecated
    public int getLightValue(final BlockState class7096) {
        return this.field17396;
    }
    
    @Deprecated
    public Material getMaterial(final BlockState class7096) {
        return this.field17401;
    }
    
    @Deprecated
    public MaterialColor method11783(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        return this.field17402;
    }
    
    @Deprecated
    public void method11784(final BlockState class7096, final Class1851 class7097, final BlockPos class7098, final int n) {
        try (final Class386 method1296 = Class386.method1296()) {
            for (final Direction class7099 : Block.field17392) {
                method1296.method1303(class7098).method1304(class7099);
                final BlockState method1297 = class7097.getBlockState(method1296);
                method11787(method1297, method1297.method21748(class7099.getOpposite(), class7096, class7097, method1296, class7098), class7097, method1296, n);
            }
        }
    }
    
    public boolean method11785(final Class7909<Block> class7909) {
        return class7909.method25618(this);
    }
    
    public static BlockState method11786(final BlockState class7096, final Class1851 class7097, final BlockPos class7098) {
        BlockState method21748 = class7096;
        final Mutable class7099 = new Mutable();
        for (final Direction class7100 : Block.field17392) {
            class7099.method1287(class7098).method1290(class7100);
            method21748 = method21748.method21748(class7100, class7097.getBlockState(class7099), class7097, class7098, class7099);
        }
        return method21748;
    }
    
    public static void method11787(final BlockState class7096, final BlockState class7097, final Class1851 class7098, final BlockPos class7099, final int n) {
        if (class7097 != class7096) {
            if (!class7097.method21706()) {
                class7098.setBlockState(class7099, class7097, n & 0xFFFFFFDF);
            }
            else if (!class7098.isRemote()) {
                class7098.method7149(class7099, (n & 0x20) == 0x0);
            }
        }
    }
    
    @Deprecated
    public void method11788(final BlockState class7096, final Class1851 class7097, final BlockPos class7098, final int n) {
    }
    
    @Deprecated
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        return class7096;
    }
    
    @Deprecated
    public BlockState method11790(final BlockState class7096, final Class2052 class7097) {
        return class7096;
    }
    
    @Deprecated
    public BlockState method11791(final BlockState class7096, final Class2181 class7097) {
        return class7096;
    }
    
    public Block(final Properties class9288) {
        final Class9500 class9289 = new Class9500(this);
        this.method11875(class9289);
        this.field17401 = Properties.method34297(class9288);
        this.field17402 = Properties.method34298(class9288);
        this.field17408 = Properties.method34299(class9288);
        this.field17400 = Properties.method34300(class9288);
        this.field17396 = Properties.method34301(class9288);
        this.field17398 = Properties.method34302(class9288);
        this.field17397 = Properties.method34303(class9288);
        this.field17399 = Properties.method34304(class9288);
        this.field17403 = Properties.method34305(class9288);
        this.field17404 = Properties.method34306(class9288);
        this.field17405 = Properties.method34307(class9288);
        this.field17409 = Properties.method34308(class9288);
        this.field17411 = Properties.method34309(class9288);
        this.field17410 = Properties.method34310(class9288);
        this.field17406 = class9289.method35380(BlockState::new);
        this.method11877(this.field17406.method32903());
    }
    
    public static boolean method11792(final Block class3833) {
        if (!(class3833 instanceof Class3972)) {
            if (class3833 != Blocks.field29517) {
                if (class3833 != Blocks.field29342) {
                    if (class3833 != Blocks.field29343) {
                        if (class3833 != Blocks.field29383) {
                            if (class3833 != Blocks.field29337) {
                                return class3833.method11785(Class7188.field27914);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
    
    @Deprecated
    public boolean method11793(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        if (class7096.getMaterial().method26443()) {
            if (class7096.isCollisionShapeOpaque(class7097, class7098)) {
                return !class7096.method21714();
            }
        }
        return false;
    }
    
    @Deprecated
    public boolean method11794(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        return this.field17401.method26440() && class7096.isCollisionShapeOpaque(class7097, class7098);
    }
    
    @Deprecated
    public boolean method11795(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        return class7096.method21746(class7097, class7098);
    }
    
    @Deprecated
    public boolean method11796(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final Class2084 class7099) {
        switch (Class9511.field40924[class7099.ordinal()]) {
            case 1: {
                return !class7096.isCollisionShapeOpaque(class7097, class7098);
            }
            case 2: {
                return class7097.getFluidState(class7098).isTagged(Class7324.field28319);
            }
            case 3: {
                return !class7096.isCollisionShapeOpaque(class7097, class7098);
            }
            default: {
                return false;
            }
        }
    }
    
    @Deprecated
    public Class2115 method11797(final BlockState class7096) {
        return Class2115.field12307;
    }
    
    @Deprecated
    public boolean method11798(final BlockState class7096, final Class7074 class7097) {
        return this.field17401.method26442() && (class7097.method21651().method27620() || class7097.method21651().getItem() != this.method11704());
    }
    
    @Deprecated
    public boolean method11799(final BlockState class7096, final Fluid class7097) {
        return this.field17401.method26442() || !this.field17401.method26439();
    }
    
    @Deprecated
    public float method11800(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        return this.field17397;
    }
    
    public boolean method11801(final BlockState class7096) {
        return this.field17399;
    }
    
    public boolean method11802() {
        return this instanceof Class3840;
    }
    
    @Deprecated
    public boolean method11803(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        return false;
    }
    
    @Deprecated
    public boolean method11804(final BlockState class7096) {
        return false;
    }
    
    public static boolean method11805(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final Direction class7099) {
        final BlockPos method1149 = class7098.method1149(class7099);
        final BlockState method1150 = class7097.getBlockState(method1149);
        if (class7096.method21724(method1150, class7099)) {
            return false;
        }
        if (!method1150.isSolid()) {
            return true;
        }
        final Class8266 class7100 = new Class8266(class7096, method1150, class7099);
        final Object2ByteLinkedOpenHashMap object2ByteLinkedOpenHashMap = Block.field17414.get();
        final byte andMoveToFirst = object2ByteLinkedOpenHashMap.getAndMoveToFirst(class7100);
        if (andMoveToFirst == 127) {
            final boolean method1151 = VoxelShapes.method24496(class7096.getFaceOcclusionShape(class7097, class7098, class7099), method1150.getFaceOcclusionShape(class7097, method1149, class7099.getOpposite()), IBooleanFunction.ONLY_FIRST);
            if (object2ByteLinkedOpenHashMap.size() == 2048) {
                object2ByteLinkedOpenHashMap.removeLastByte();
            }
            object2ByteLinkedOpenHashMap.putAndMoveToFirst(class7100, (byte)(method1151 ? 1 : 0));
            return method1151;
        }
        return andMoveToFirst != 0;
    }
    
    @Deprecated
    public final boolean method11806(final BlockState class7096) {
        return this.field17410;
    }
    
    @Deprecated
    public boolean method11807(final BlockState class7096, final BlockState class7097, final Direction class7098) {
        return false;
    }
    
    @Deprecated
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return VoxelShapes.fullCube();
    }
    
    @Deprecated
    public VoxelShape method11809(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return this.field17408 ? class7096.getShape(class7097, class7098) : VoxelShapes.empty();
    }
    
    @Deprecated
    public VoxelShape method11810(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        return class7096.getShape(class7097, class7098);
    }
    
    @Deprecated
    public VoxelShape method11811(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        return VoxelShapes.empty();
    }
    
    public static boolean method11812(final IBlockReader class1855, final BlockPos class1856) {
        final BlockState method6701 = class1855.getBlockState(class1856);
        return !method6701.method21755(Class7188.field27907) && !VoxelShapes.method24496(method6701.getCollisionShape(class1855, class1856).project(Direction.UP), Block.field17394, IBooleanFunction.ONLY_SECOND);
    }
    
    public static boolean method11813(final Class1852 class1852, final BlockPos class1853, final Direction class1854) {
        final BlockState method6701 = class1852.getBlockState(class1853);
        return !method6701.method21755(Class7188.field27907) && !VoxelShapes.method24496(method6701.getCollisionShape(class1852, class1853).project(class1854), Block.field17395, IBooleanFunction.ONLY_SECOND);
    }
    
    public static boolean hasSolidSide(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final Direction class7099) {
        return !class7096.method21755(Class7188.field27907) && method11815(class7096.getCollisionShape(class7097, class7098), class7099);
    }
    
    public static boolean method11815(final VoxelShape class7702, final Direction class7703) {
        return isOpaque(class7702.project(class7703));
    }
    
    public static boolean isOpaque(final VoxelShape class7702) {
        return Block.field17393.getUnchecked(class7702);
    }
    
    @Deprecated
    public final boolean method11817(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        return class7096.isSolid() && isOpaque(class7096.getRenderShape(class7097, class7098));
    }
    
    public boolean propagatesSkylightDown(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        return !isOpaque(class7096.getShape(class7097, class7098)) && class7096.getFluidState().isEmpty();
    }
    
    @Deprecated
    public int getOpacity(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        if (!class7096.isOpaqueCube(class7097, class7098)) {
            return class7096.propagatesSkylightDown(class7097, class7098) ? 0 : 1;
        }
        return class7097.getMaxLightLevel();
    }
    
    @Deprecated
    public boolean isTransparent(final BlockState class7096) {
        return false;
    }
    
    @Deprecated
    public void method11821(final BlockState class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        this.method11822(class7096, class7097, class7098, random);
    }
    
    @Deprecated
    public void method11822(final BlockState class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
    }
    
    public void method11823(final BlockState class7096, final World class7097, final BlockPos class7098, final Random random) {
    }
    
    public void method11824(final Class1851 class1851, final BlockPos class1852, final BlockState class1853) {
    }
    
    @Deprecated
    public void method11825(final BlockState class7096, final World class7097, final BlockPos class7098, final Block class7099, final BlockPos class7100, final boolean b) {
        Class9324.method34536(class7097, class7098);
    }
    
    public int tickRate(final Class1852 class1852) {
        return 10;
    }
    
    @Nullable
    @Deprecated
    public INamedContainerProvider getContainer(final BlockState class7096, final World class7097, final BlockPos class7098) {
        return null;
    }
    
    @Deprecated
    public void onBlockAdded(final BlockState class7096, final World class7097, final BlockPos class7098, final BlockState class7099, final boolean b) {
    }
    
    @Deprecated
    public void onReplaced(final BlockState class7096, final World class7097, final BlockPos class7098, final BlockState class7099, final boolean b) {
        if (this.method11802()) {
            if (class7096.getBlock() != class7099.getBlock()) {
                class7097.method6730(class7098);
            }
        }
    }
    
    @Deprecated
    public float getPlayerRelativeBlockHardness(final BlockState class7096, final PlayerEntity class7097, final IBlockReader class7098, final BlockPos class7099) {
        final float method21718 = class7096.method21718(class7098, class7099);
        if (method21718 != -1.0f) {
            return class7097.method2824(class7096) / method21718 / (class7097.method2825(class7096) ? 30 : 100);
        }
        return 0.0f;
    }
    
    @Deprecated
    public void spawnAdditionalDrops(final BlockState class7096, final World class7097, final BlockPos class7098, final ItemStack class7099) {
    }
    
    public ResourceLocation getLootTable() {
        if (this.field17411 == null) {
            final ResourceLocation method503 = Registry.BLOCK.getKey(this);
            this.field17411 = new ResourceLocation(method503.method7798(), "blocks/" + method503.method7797());
        }
        return this.field17411;
    }
    
    @Deprecated
    public List<ItemStack> getDrops(final BlockState class7096, final Class9098 class7097) {
        final ResourceLocation method11832 = this.getLootTable();
        if (method11832 != Class9020.field38063) {
            final Class7529 method11833 = class7097.method32877(Class6683.field26368, class7096).method32883(Class7104.field27719);
            return method11833.method23588().getServer().method1581().method6402(method11832).method34485(method11833);
        }
        return Collections.emptyList();
    }
    
    public static List<ItemStack> getDrops(final BlockState class7096, final Class1849 class7097, final BlockPos class7098, final TileEntity class7099) {
        return class7096.method21743(new Class9098(class7097).method32873(class7097.rand).method32877(Class6683.field26367, class7098).method32877(Class6683.field26370, ItemStack.EMPTY).method32878(Class6683.field26369, class7099));
    }
    
    public static List<ItemStack> getDrops(final BlockState class7096, final Class1849 class7097, final BlockPos class7098, final TileEntity class7099, final Entity class7100, final ItemStack class7101) {
        return class7096.method21743(new Class9098(class7097).method32873(class7097.rand).method32877(Class6683.field26367, class7098).method32877(Class6683.field26370, class7101).method32878(Class6683.field26362, class7100).method32878(Class6683.field26369, class7099));
    }
    
    public static void spawnDrops(final BlockState class7096, final World class7097, final BlockPos class7098) {
        if (class7097 instanceof Class1849) {
            getDrops(class7096, (Class1849)class7097, class7098, null).forEach(class7101 -> spawnAsEntity(class7099, class7100, class7101));
        }
        class7096.method21742(class7097, class7098, ItemStack.EMPTY);
    }
    
    public static void spawnDrops(final BlockState class7096, final World class7097, final BlockPos class7098, final TileEntity class7099) {
        if (class7097 instanceof Class1849) {
            getDrops(class7096, (Class1849)class7097, class7098, class7099).forEach(class7102 -> spawnAsEntity(class7100, class7101, class7102));
        }
        class7096.method21742(class7097, class7098, ItemStack.EMPTY);
    }
    
    public static void spawnAsEntity(final BlockState class7096, final World class7097, final BlockPos class7098, final TileEntity class7099, final Entity class7100, final ItemStack class7101) {
        if (class7097 instanceof Class1849) {
            getDrops(class7096, (Class1849)class7097, class7098, class7099, class7100, class7101).forEach(class7104 -> spawnAsEntity(class7102, class7103, class7104));
        }
        class7096.method21742(class7097, class7098, class7101);
    }
    
    public static void spawnAsEntity(final World class1847, final BlockPos class1848, final ItemStack class1849) {
        if (!class1847.isRemote) {
            if (!class1849.method27620()) {
                if (class1847.method6765().method31216(Class8878.field37320)) {
                    final Class427 class1850 = new Class427(class1847, class1848.getX() + (class1847.rand.nextFloat() * 0.5f + 0.25), class1848.getY() + (class1847.rand.nextFloat() * 0.5f + 0.25), class1848.getZ() + (class1847.rand.nextFloat() * 0.5f + 0.25), class1849);
                    class1850.method2114();
                    class1847.method6886(class1850);
                }
            }
        }
    }
    
    public void dropXpOnBlockBreak(final World class1847, final BlockPos class1848, int i) {
        if (!class1847.isRemote) {
            if (class1847.method6765().method31216(Class8878.field37320)) {
                while (i > 0) {
                    final int method2609 = Class508.method2609(i);
                    i -= method2609;
                    class1847.method6886(new Class508(class1847, class1848.getX() + 0.5, class1848.getY() + 0.5, class1848.getZ() + 0.5, method2609));
                }
            }
        }
    }
    
    public float method11841() {
        return this.field17398;
    }
    
    public void method11842(final World class1847, final BlockPos class1848, final Explosion class1849) {
    }
    
    @Deprecated
    public boolean method11843(final BlockState class7096, final Class1852 class7097, final BlockPos class7098) {
        return true;
    }
    
    @Deprecated
    public Class2201 method11844(final BlockState class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099, final Class316 class7100, final BlockRayTraceResult class7101) {
        return Class2201.field13402;
    }
    
    public void method11845(final World class1847, final BlockPos class1848, final Entity class1849) {
    }
    
    @Nullable
    public BlockState method11846(final Class7074 class7074) {
        return this.getDefaultState();
    }
    
    @Deprecated
    public void method11847(final BlockState class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099) {
    }
    
    @Deprecated
    public int method11848(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final Direction class7099) {
        return 0;
    }
    
    @Deprecated
    public boolean method11849(final BlockState class7096) {
        return false;
    }
    
    @Deprecated
    public void method11850(final BlockState class7096, final World class7097, final BlockPos class7098, final Entity class7099) {
    }
    
    @Deprecated
    public int method11851(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final Direction class7099) {
        return 0;
    }
    
    public void method11852(final World class1847, final PlayerEntity class1848, final BlockPos class1849, final BlockState class1850, final TileEntity class1851, final ItemStack class1852) {
        class1848.method2859(Class8276.field33979.method8449(this));
        class1848.method2876(0.005f);
        spawnAsEntity(class1850, class1847, class1849, class1851, class1848, class1852);
    }
    
    public void method11853(final World class1847, final BlockPos class1848, final BlockState class1849, final LivingEntity class1850, final ItemStack class1851) {
    }
    
    public boolean method11854() {
        return !this.field17401.method26439() && !this.field17401.method26438();
    }
    
    public ITextComponent method11855() {
        return new Class2259(this.getTranslationKey());
    }
    
    public String getTranslationKey() {
        if (this.field17412 == null) {
            this.field17412 = Util.method27836("block", Registry.BLOCK.getKey(this));
        }
        return this.field17412;
    }
    
    @Deprecated
    public boolean method11857(final BlockState class7096, final World class7097, final BlockPos class7098, final int n, final int n2) {
        return false;
    }
    
    @Deprecated
    public PushReaction method11858(final BlockState class7096) {
        return this.field17401.method26445();
    }
    
    @Deprecated
    public float method11859(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        return class7096.isCollisionShapeOpaque(class7097, class7098) ? 0.2f : 1.0f;
    }
    
    public void method11860(final World class1847, final BlockPos class1848, final Entity class1849, final float n) {
        class1849.method1705(n, 1.0f);
    }
    
    public void method11861(final IBlockReader class1855, final Entity class1856) {
        class1856.method1936(class1856.getMotion().mul(1.0, 0.0, 1.0));
    }
    
    public ItemStack method11862(final IBlockReader class1855, final BlockPos class1856, final BlockState class1857) {
        return new ItemStack(this);
    }
    
    public void method11863(final Class7207 class7207, final NonNullList<ItemStack> class7208) {
        class7208.add(new ItemStack(this));
    }
    
    @Deprecated
    public IFluidState method11864(final BlockState class7096) {
        return Class7558.field29974.getDefaultState();
    }
    
    public float method11865() {
        return this.field17403;
    }
    
    public float method11866() {
        return this.field17404;
    }
    
    public float method11867() {
        return this.field17405;
    }
    
    @Deprecated
    public long method11868(final BlockState class7096, final BlockPos class7097) {
        return MathHelper.method35688(class7097);
    }
    
    public void onProjectileCollision(final World class1847, final BlockState class1848, final BlockRayTraceResult class1849, final Entity class1850) {
    }
    
    public void method11870(final World class1847, final BlockPos class1848, final BlockState class1849, final PlayerEntity class1850) {
        class1847.method6839(class1850, 2001, class1848, method11774(class1849));
    }
    
    public void method11871(final World class1847, final BlockPos class1848) {
    }
    
    public boolean method11872(final Explosion explosion) {
        return true;
    }
    
    @Deprecated
    public boolean method11873(final BlockState class7096) {
        return false;
    }
    
    @Deprecated
    public int method11874(final BlockState class7096, final World class7097, final BlockPos class7098) {
        return 0;
    }
    
    public void method11875(final Class9500<Block, BlockState> class9500) {
    }
    
    public StateContainer<Block, BlockState> getStateContainer() {
        return this.field17406;
    }
    
    public final void method11877(final BlockState field17407) {
        this.field17407 = field17407;
    }
    
    public final BlockState getDefaultState() {
        return this.field17407;
    }
    
    public Class2180 method11879() {
        return Class2180.field12913;
    }
    
    @Deprecated
    public Vec3d method11880(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        final Class2180 method11879 = this.method11879();
        if (method11879 != Class2180.field12913) {
            final long method11880 = MathHelper.method35689(class7098.getX(), 0, class7098.getZ());
            return new Vec3d(((method11880 & 0xFL) / 15.0f - 0.5) * 0.5, (method11879 != Class2180.field12915) ? 0.0 : (((method11880 >> 4 & 0xFL) / 15.0f - 1.0) * 0.2), ((method11880 >> 8 & 0xFL) / 15.0f - 0.5) * 0.5);
        }
        return Vec3d.ZERO;
    }
    
    public SoundType getSoundType(final BlockState class7096) {
        return this.field17400;
    }
    
    @Override
    public Item method11704() {
        if (this.field17413 == null) {
            this.field17413 = Item.method11698(this);
        }
        return this.field17413;
    }
    
    public boolean method11882() {
        return this.field17409;
    }
    
    @Override
    public String toString() {
        return "Block{" + Registry.BLOCK.getKey(this) + "}";
    }
    
    public void addInformation(final ItemStack class8321, final IBlockReader class8322, final List<ITextComponent> list, final ITooltipFlag class8323) {
    }
    
    static {
        field17390 = LogManager.getLogger();
        field17391 = new Class94<BlockState>();
        field17392 = new Direction[] { Direction.WEST, Direction.EAST, Direction.NORTH, Direction.SOUTH, Direction.DOWN, Direction.UP};
        field17393 = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build((CacheLoader)new Class6046());
        field17394 = VoxelShapes.method24494(VoxelShapes.fullCube(), method11778(2.0, 0.0, 2.0, 14.0, 16.0, 14.0), IBooleanFunction.ONLY_FIRST);
        field17395 = method11778(7.0, 0.0, 7.0, 9.0, 10.0, 9.0);
        field17414 = ThreadLocal.withInitial(() -> {
            final Class2270 class2270 = new Class2270(2048, 0.25f);
            class2270.defaultReturnValue((byte)127);
            return class2270;
        });
    }

    public static class Properties
    {
        private static String[] field39830;
        private Material field39831;
        private MaterialColor field39832;
        private boolean field39833;
        private SoundType field39834;
        private int field39835;
        private float field39836;
        private float field39837;
        private boolean field39838;
        private float field39839;
        private float field39840;
        private float field39841;
        private ResourceLocation field39842;
        private boolean field39843;
        private boolean field39844;

        private Properties(final Material field39831, final MaterialColor field39832) {
            this.field39833 = true;
            this.field39834 = SoundType.field30570;
            this.field39839 = 0.6f;
            this.field39840 = 1.0f;
            this.field39841 = 1.0f;
            this.field39843 = true;
            this.field39831 = field39831;
            this.field39832 = field39832;
        }

        public static Properties method34279(final Material class8059) {
            return create(class8059, class8059.method26446());
        }

        public static Properties method34280(final Material class8059, final Class181 class8060) {
            return create(class8059, class8060.method816());
        }

        public static Properties create(final Material class8059, final MaterialColor class8060) {
            return new Properties(class8059, class8060);
        }

        public static Properties method34282(final Block class3833) {
            final Properties class3834 = new Properties(class3833.field17401, class3833.field17402);
            class3834.field39831 = class3833.field17401;
            class3834.field39837 = class3833.field17397;
            class3834.field39836 = class3833.field17398;
            class3834.field39833 = class3833.field17408;
            class3834.field39838 = class3833.field17399;
            class3834.field39835 = class3833.field17396;
            class3834.field39832 = class3833.field17402;
            class3834.field39834 = class3833.field17400;
            class3834.field39839 = class3833.method11865();
            class3834.field39840 = class3833.method11866();
            class3834.field39844 = Block.method11888(class3833);
            class3834.field39843 = Block.method11889(class3833);
            return class3834;
        }

        public Properties method34283() {
            this.field39833 = false;
            this.field39843 = false;
            return this;
        }

        public Properties method34284() {
            this.field39843 = false;
            return this;
        }

        public Properties method34285(final float field39839) {
            this.field39839 = field39839;
            return this;
        }

        public Properties method34286(final float field39840) {
            this.field39840 = field39840;
            return this;
        }

        public Properties method34287(final float field39841) {
            this.field39841 = field39841;
            return this;
        }

        public Properties method34288(final SoundType field39834) {
            this.field39834 = field39834;
            return this;
        }

        public Properties method34289(final int field39835) {
            this.field39835 = field39835;
            return this;
        }

        public Properties hardnessAndResistance(final float field39837, final float b) {
            this.field39837 = field39837;
            this.field39836 = Math.max(0.0f, b);
            return this;
        }

        public Properties method34291() {
            return this.method34292(0.0f);
        }

        public Properties method34292(final float n) {
            this.hardnessAndResistance(n, n);
            return this;
        }

        public Properties method34293() {
            this.field39838 = true;
            return this;
        }

        public Properties method34294() {
            this.field39844 = true;
            return this;
        }

        public Properties method34295() {
            this.field39842 = Class9020.field38063;
            return this;
        }

        public Properties method34296(final Block class3833) {
            this.field39842 = class3833.getLootTable();
            return this;
        }
    }
}
