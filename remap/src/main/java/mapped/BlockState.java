// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import java.util.stream.Collectors;

import com.mojang.datafixers.util.Pair;

import java.util.Map;

import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;

import java.util.concurrent.atomic.AtomicInteger;

public class BlockState extends StateHolder<Block, BlockState> implements IStateHolder<BlockState> {
    private Cache cache;
    private final int lightLevel;
    private final boolean transparent;
    private int blockId = -1;
    private int metadata = -1;
    private ResourceLocation blockLocation;
    private int blockStateId = -1;
    private static final AtomicInteger blockStateIdCounter = new AtomicInteger(0);

    public int getBlockId() {
        if (this.blockId < 0) {
            this.blockId = Registry.BLOCK.getId(this.getBlock());
        }
        return this.blockId;
    }

    public int getMetadata() {
        if (this.metadata < 0) {
            this.metadata = BlockUtils.getMetadata(this);
            if (this.metadata < 0) {
                Config.warn("Metadata not found, block: " + this.getBlockLocation());
                this.metadata = 0;
            }
        }
        return this.metadata;
    }

    public ResourceLocation getBlockLocation() {
        if (this.blockLocation == null) {
            this.blockLocation = Registry.BLOCK.getKey(this.getBlock());
        }
        return this.blockLocation;
    }

    public int getBlockStateId() {
        if (this.blockStateId < 0) {
            this.blockStateId = BlockState.blockStateIdCounter.incrementAndGet();
        }
        return this.blockStateId;
    }

    public BlockState(final Block class3833, final ImmutableMap<IProperty<?>, Comparable<?>> immutableMap) {
        super(class3833, immutableMap);
        this.lightLevel = class3833.getLightValue(this);
        this.transparent = class3833.isTransparent(this);
    }

    public void method21695() {
        if (!this.getBlock().method11882()) {
            this.cache = new Cache(this);
        }
    }

    public Block getBlock() {
        return this.object;
    }

    public Material getMaterial() {
        return this.getBlock().getMaterial(this);
    }

    public boolean canEntitySpawn(final IBlockReader class1855, final BlockPos class1856, final EntityType<?> class1857) {
        return this.getBlock().canEntitySpawn(this, class1855, class1856, class1857);
    }

    public boolean propagatesSkylightDown(final IBlockReader class1855, final BlockPos class1856) {
        return (this.cache == null) ? this.getBlock().propagatesSkylightDown(this, class1855, class1856) : cache.propagatesSkylightDown;
    }

    public int getOpacity(final IBlockReader class1855, final BlockPos class1856) {
        return (this.cache == null) ? this.getBlock().getOpacity(this, class1855, class1856) : cache.opacity;
    }

    public VoxelShape getFaceOcclusionShape(final IBlockReader class1855, final BlockPos class1856, final Direction class1857) {
        return (this.cache != null && cache.renderShapes != null) ? cache.renderShapes[class1857.ordinal()] : VoxelShapes.getFaceShape(this.getRenderShape(class1855, class1856), class1857);
    }

    public boolean isCollisionShapeLargerThanFullBlock() {
        return this.cache == null || cache.isCollisionShapeLargerThanFullBlock;
    }

    public boolean method21703() {
        return this.transparent;
    }

    public int getLightValue() {
        final Class5719 class5719 = new Class5719(this);
        Class9463.method35173().method35188().method21097(class5719);
        if (!class5719.method16987()) {
            return this.lightLevel;
        }
        return 1;
    }

    public int method21705(final IBlockReader class1855, final BlockPos class1856) {
        return this.getLightValue();
    }

    public boolean method21706() {
        return this.getBlock().method11780(this);
    }

    public MaterialColor method21707(final IBlockReader class1855, final BlockPos class1856) {
        return this.getBlock().method11783(this, class1855, class1856);
    }

    public BlockState method21708(final Class2052 class2052) {
        return this.getBlock().method11790(this, class2052);
    }

    public BlockState method21709(final Class2181 class2181) {
        return this.getBlock().method11791(this, class2181);
    }

    public Class2115 method21710() {
        return this.getBlock().method11797(this);
    }

    public boolean method21711() {
        return this.getBlock().method11804(this);
    }

    public float method21712(final IBlockReader class1855, final BlockPos class1856) {
        return this.getBlock().method11859(this, class1855, class1856);
    }

    public boolean method21713(final IBlockReader class1855, final BlockPos class1856) {
        return this.getBlock().method11793(this, class1855, class1856);
    }

    public boolean method21714() {
        return this.getBlock().method11849(this);
    }

    public int method21715(final IBlockReader class1855, final BlockPos class1856, final Direction class1857) {
        return this.getBlock().method11848(this, class1855, class1856, class1857);
    }

    public boolean method21716() {
        return this.getBlock().method11873(this);
    }

    public int method21717(final World class1847, final BlockPos class1848) {
        return this.getBlock().method11874(this, class1847, class1848);
    }

    public float method21718(final IBlockReader class1855, final BlockPos class1856) {
        return this.getBlock().method11800(this, class1855, class1856);
    }

    public float method21719(final PlayerEntity playerEntity, final IBlockReader class513, final BlockPos class514) {
        return this.getBlock().method11830(this, playerEntity, class513, class514);
    }

    public int method21720(final IBlockReader class1855, final BlockPos class1856, final Direction class1857) {
        return this.getBlock().method11851(this, class1855, class1856, class1857);
    }

    public PushReaction method21721() {
        return this.getBlock().method11858(this);
    }

    public boolean isOpaqueCube(final IBlockReader class1855, final BlockPos class1856) {
        return (this.cache == null) ? this.getBlock().method11817(this, class1855, class1856) : cache.opaqueCube;
    }

    public boolean isSolid() {
        return (this.cache == null) ? this.getBlock().method11806(this) : cache.solid;
    }

    public boolean method21724(final BlockState class7096, final Direction class7097) {
        return this.getBlock().method11807(this, class7096, class7097);
    }

    public VoxelShape getShape(final IBlockReader class1855, final BlockPos class1856) {
        return this.getShape(class1855, class1856, ISelectionContext.dummy());
    }

    public VoxelShape getShape(final IBlockReader class1855, final BlockPos class1856, final ISelectionContext class1857) {
        return this.getBlock().method11808(this, class1855, class1856, class1857);
    }

    public VoxelShape getCollisionShape(final IBlockReader class1855, final BlockPos class1856) {
        return (this.cache == null) ? this.getCollisionShape(class1855, class1856, ISelectionContext.dummy()) : cache.collisionShape;
    }

    public VoxelShape getCollisionShape(final IBlockReader class1855, final BlockPos class1856, final ISelectionContext class1857) {
        return this.getBlock().method11809(this, class1855, class1856, class1857);
    }

    public VoxelShape getRenderShape(final IBlockReader class1855, final BlockPos class1856) {
        return this.getBlock().method11810(this, class1855, class1856);
    }

    public VoxelShape method21730(final IBlockReader class1855, final BlockPos class1856) {
        return this.getBlock().method11811(this, class1855, class1856);
    }

    public final boolean method21731(final IBlockReader class1855, final BlockPos class1856, final Entity class1857) {
        return Block.method11815(this.getCollisionShape(class1855, class1856, ISelectionContext.forEntity(class1857)), Direction.UP);
    }

    public Vec3d method21732(final IBlockReader class1855, final BlockPos class1856) {
        return this.getBlock().method11880(this, class1855, class1856);
    }

    public boolean method21733(final World class1847, final BlockPos class1848, final int n, final int n2) {
        return this.getBlock().method11857(this, class1847, class1848, n, n2);
    }

    public void method21734(final World class1847, final BlockPos class1848, final Block class1849, final BlockPos class1850, final boolean b) {
        this.getBlock().method11825(this, class1847, class1848, class1849, class1850, b);
    }

    public void method21735(final Class1851 class1851, final BlockPos class1852, final int n) {
        this.getBlock().method11784(this, class1851, class1852, n);
    }

    public void method21736(final Class1851 class1851, final BlockPos class1852, final int n) {
        this.getBlock().method11788(this, class1851, class1852, n);
    }

    public void method21737(final World class1847, final BlockPos class1848, final BlockState class1849, final boolean b) {
        this.getBlock().method11828(this, class1847, class1848, class1849, b);
    }

    public void method21738(final World class1847, final BlockPos class1848, final BlockState class1849, final boolean b) {
        this.getBlock().method11829(this, class1847, class1848, class1849, b);
    }

    public void method21739(final Class1849 class1849, final BlockPos class1850, final Random random) {
        this.getBlock().method11822(this, class1849, class1850, random);
    }

    public void method21740(final Class1849 class1849, final BlockPos class1850, final Random random) {
        this.getBlock().method11821(this, class1849, class1850, random);
    }

    public void method21741(final World class1847, final BlockPos class1848, final Entity class1849) {
        this.getBlock().method11850(this, class1847, class1848, class1849);
    }

    public void method21742(final World class1847, final BlockPos class1848, final ItemStack class1849) {
        this.getBlock().method11831(this, class1847, class1848, class1849);
    }

    public List<ItemStack> method21743(final Class9098 class9098) {
        return this.getBlock().method11833(this, class9098);
    }

    public Class2201 method21744(final World class1847, final PlayerEntity class1848, final Class316 class1849, final BlockRayTraceResult class1850) {
        return this.getBlock().method11844(this, class1847, class1850.method21447(), class1848, class1849, class1850);
    }

    public void method21745(final World class1847, final BlockPos class1848, final PlayerEntity class1849) {
        this.getBlock().method11847(this, class1847, class1848, class1849);
    }

    public boolean method21746(final IBlockReader class1855, final BlockPos class1856) {
        return this.getBlock().method11794(this, class1855, class1856);
    }

    public boolean method21747(final IBlockReader class1855, final BlockPos class1856) {
        return this.getBlock().method11795(this, class1855, class1856);
    }

    public BlockState method21748(final Direction class179, final BlockState class180, final Class1851 class181, final BlockPos class182, final BlockPos class183) {
        return this.getBlock().method11789(this, class179, class180, class181, class182, class183);
    }

    public boolean method21749(final IBlockReader class1855, final BlockPos class1856, final Class2084 class1857) {
        return this.getBlock().method11796(this, class1855, class1856, class1857);
    }

    public boolean method21750(final Class7074 class7074) {
        return this.getBlock().method11798(this, class7074);
    }

    public boolean method21751(final Fluid class7255) {
        return this.getBlock().method11799(this, class7255);
    }

    public boolean method21752(final Class1852 class1852, final BlockPos class1853) {
        return this.getBlock().method11843(this, class1852, class1853);
    }

    public boolean method21753(final IBlockReader class1855, final BlockPos class1856) {
        return this.getBlock().method11803(this, class1855, class1856);
    }

    @Nullable
    public Class434 method21754(final World class1847, final BlockPos class1848) {
        return this.getBlock().method11827(this, class1847, class1848);
    }

    public boolean method21755(final Class7909<Block> class7909) {
        return this.getBlock().method11785(class7909);
    }

    public IFluidState getFluidState() {
        return this.getBlock().method11864(this);
    }

    public boolean method21757() {
        return this.getBlock().method11801(this);
    }

    public long method21758(final BlockPos class354) {
        return this.getBlock().method11868(this, class354);
    }

    public SoundType getSoundType() {
        return this.getBlock().getSoundType(this);
    }

    public void onProjectileCollision(final World class1847, final BlockState class1848, final BlockRayTraceResult class1849, final Entity class1850) {
        this.getBlock().onProjectileCollision(class1847, class1848, class1849, class1850);
    }

    public boolean isSolidSide(final IBlockReader class1855, final BlockPos class1856, final Direction class1857) {
        return (this.cache == null) ? Block.hasSolidSide(this, class1855, class1856, class1857) : cache.solidSides[class1857.ordinal()];
    }

    public boolean isCollisionShapeOpaque(final IBlockReader class1855, final BlockPos class1856) {
        return (this.cache == null) ? Block.isOpaque(this.getCollisionShape(class1855, class1856)) : cache.opaqueCollisionShape;
    }

    public static <T> Dynamic<T> serialize(final DynamicOps<T> opsIn, final BlockState state) {
        final ImmutableMap<IProperty<?>, Comparable<?>> immutablemap = state.getValues();
        T t;
        if (immutablemap.isEmpty()) {
            t = opsIn.createMap(ImmutableMap.of(opsIn.createString("Name"), opsIn.createString(Registry.BLOCK.getKey(state.getBlock()).toString())));
        } else {
            t = opsIn.createMap(ImmutableMap.of(opsIn.createString("Name"), opsIn.createString(Registry.BLOCK.getKey(state.getBlock()).toString()), opsIn.createString("Properties"), opsIn.createMap(immutablemap.entrySet().stream().map((p_lambda$serialize$0_1_) ->
            {
                return Pair.of(opsIn.createString(p_lambda$serialize$0_1_.getKey().getName()), opsIn.createString(IStateHolder.getName(p_lambda$serialize$0_1_.getKey(), p_lambda$serialize$0_1_.getValue())));
            }).collect(Collectors.toMap(Pair::getFirst, Pair::getSecond)))));
        }
        return new Dynamic<>(opsIn, t);
    }

    public static <T> BlockState deserialize(final Dynamic<T> dynamic) {
        final Block block = Registry.BLOCK.getOrDefault(new ResourceLocation(dynamic.getElement("Name").flatMap(dynamic.getOps()::getStringValue).orElse("minecraft:air")));
        Map<String, String> map = dynamic.get("Properties").asMap((p_lambda$deserialize$1_0_) ->
        {
            return p_lambda$deserialize$1_0_.asString("");
        }, (p_lambda$deserialize$2_0_) ->
        {
            return p_lambda$deserialize$2_0_.asString("");
        });
        BlockState blockstate = block.getDefaultState();
        final StateContainer<Block, BlockState> statecontainer = block.getStateContainer();
        for (final Map.Entry<String, String> entry : map.entrySet()) {
            final String s = entry.getKey();
            final IProperty iproperty = statecontainer.getProperty(s);
            if (iproperty == null) {
                continue;
            }
            blockstate = IStateHolder.withString(blockstate, iproperty, s, dynamic.toString(), (String) entry.getValue());
        }
        return blockstate;
    }

    public static final class Cache {
        private static final Direction[] DIRECTIONS;
        private final boolean solid;
        private final boolean opaqueCube;
        private final boolean propagatesSkylightDown;
        private final int opacity;
        private final VoxelShape[] renderShapes;
        private final VoxelShape collisionShape;
        private final boolean isCollisionShapeLargerThanFullBlock;
        private final boolean[] solidSides;
        private final boolean opaqueCollisionShape;

        public Cache(final BlockState class7096) {
            final Block method21696 = class7096.getBlock();
            this.solid = method21696.method11806(class7096);
            this.opaqueCube = method21696.method11817(class7096, Class1859.field10138, BlockPos.ZERO);
            this.propagatesSkylightDown = method21696.propagatesSkylightDown(class7096, Class1859.field10138, BlockPos.ZERO);
            this.opacity = method21696.getOpacity(class7096, Class1859.field10138, BlockPos.ZERO);
            if (class7096.isSolid()) {
                this.renderShapes = new VoxelShape[Cache.DIRECTIONS.length];
                final VoxelShape method21697 = method21696.method11810(class7096, Class1859.field10138, BlockPos.ZERO);
                for (final Direction class7097 : Cache.DIRECTIONS) {
                    this.renderShapes[class7097.ordinal()] = VoxelShapes.getFaceShape(method21697, class7097);
                }
            } else {
                this.renderShapes = null;
            }
            this.collisionShape = method21696.method11809(class7096, Class1859.field10138, BlockPos.ZERO, ISelectionContext.dummy());
            this.isCollisionShapeLargerThanFullBlock = Arrays.stream(Direction.Axis.values()).anyMatch(class7099 -> this.collisionShape.method24535(class7099) < 0.0 || this.collisionShape.method24536(class7099) > 1.0);
            this.solidSides = new boolean[6];
            for (final Direction class7098 : Cache.DIRECTIONS) {
                this.solidSides[class7098.ordinal()] = Block.hasSolidSide(class7096, Class1859.field10138, BlockPos.ZERO, class7098);
            }
            this.opaqueCollisionShape = Block.isOpaque(class7096.getCollisionShape(Class1859.field10138, BlockPos.ZERO));
        }

        static {
            DIRECTIONS = Direction.values();
        }
    }
}
