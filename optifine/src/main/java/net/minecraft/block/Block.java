package net.minecraft.block;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.material.PushReaction;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ExperienceOrbEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.network.DebugPacketSender;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.StateContainer;
import net.minecraft.stats.Stats;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.Tag;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.Mirror;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ObjectIntIdentityMap;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.Explosion;
import net.minecraft.world.GameRules;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootParameterSets;
import net.minecraft.world.storage.loot.LootParameters;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.LootTables;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Block implements IItemProvider
{
    protected static final Logger LOGGER = LogManager.getLogger();
    public static final ObjectIntIdentityMap<BlockState> BLOCK_STATE_IDS = new ObjectIntIdentityMap<>();
    private static final Direction[] UPDATE_ORDER = new Direction[] {Direction.WEST, Direction.EAST, Direction.NORTH, Direction.SOUTH, Direction.DOWN, Direction.UP};
    private static final LoadingCache<VoxelShape, Boolean> OPAQUE_CACHE = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<VoxelShape, Boolean>()
    {
        public Boolean load(VoxelShape p_load_1_)
        {
            return !VoxelShapes.compare(VoxelShapes.fullCube(), p_load_1_, IBooleanFunction.NOT_SAME);
        }
    });
    private static final VoxelShape field_220083_b = VoxelShapes.combineAndSimplify(VoxelShapes.fullCube(), makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 16.0D, 14.0D), IBooleanFunction.ONLY_FIRST);
    private static final VoxelShape field_220084_c = makeCuboidShape(7.0D, 0.0D, 7.0D, 9.0D, 10.0D, 9.0D);
    protected final int lightValue;
    protected final float blockHardness;
    protected final float blockResistance;
    protected final boolean ticksRandomly;
    protected final SoundType soundType;
    protected final Material material;
    protected final MaterialColor materialColor;
    private final float slipperiness;
    private final float speedFactor;
    private final float jumpFactor;
    protected final StateContainer<Block, BlockState> stateContainer;
    private BlockState defaultState;
    protected final boolean blocksMovement;
    private final boolean variableOpacity;
    private final boolean isSolid;
    @Nullable
    private ResourceLocation lootTable;
    @Nullable
    private String translationKey;
    @Nullable
    private Item item;
    private static final ThreadLocal<Object2ByteLinkedOpenHashMap<Block.RenderSideCacheKey>> SHOULD_SIDE_RENDER_CACHE = ThreadLocal.withInitial(() ->
    {
        Object2ByteLinkedOpenHashMap<Block.RenderSideCacheKey> object2bytelinkedopenhashmap = new Object2ByteLinkedOpenHashMap<Block.RenderSideCacheKey>(2048, 0.25F)
        {
            protected void rehash(int p_rehash_1_)
            {
            }
        };
        object2bytelinkedopenhashmap.defaultReturnValue((byte)127);
        return object2bytelinkedopenhashmap;
    });

    public static int getStateId(@Nullable BlockState state)
    {
        if (state == null)
        {
            return 0;
        }
        else
        {
            int i = BLOCK_STATE_IDS.get(state);
            return i == -1 ? 0 : i;
        }
    }

    public static BlockState getStateById(int id)
    {
        BlockState blockstate = BLOCK_STATE_IDS.getByValue(id);
        return blockstate == null ? Blocks.AIR.getDefaultState() : blockstate;
    }

    public static Block getBlockFromItem(@Nullable Item itemIn)
    {
        return itemIn instanceof BlockItem ? ((BlockItem)itemIn).getBlock() : Blocks.AIR;
    }

    public static BlockState nudgeEntitiesWithNewState(BlockState oldState, BlockState newState, World worldIn, BlockPos pos)
    {
        VoxelShape voxelshape = VoxelShapes.combine(oldState.getCollisionShape(worldIn, pos), newState.getCollisionShape(worldIn, pos), IBooleanFunction.ONLY_SECOND).withOffset((double)pos.getX(), (double)pos.getY(), (double)pos.getZ());

        for (Entity entity : worldIn.getEntitiesWithinAABBExcludingEntity((Entity)null, voxelshape.getBoundingBox()))
        {
            double d0 = VoxelShapes.getAllowedOffset(Direction.Axis.Y, entity.getBoundingBox().offset(0.0D, 1.0D, 0.0D), Stream.of(voxelshape), -1.0D);
            entity.setPositionAndUpdate(entity.getPosX(), entity.getPosY() + 1.0D + d0, entity.getPosZ());
        }

        return newState;
    }

    public static VoxelShape makeCuboidShape(double x1, double y1, double z1, double x2, double y2, double z2)
    {
        return VoxelShapes.create(x1 / 16.0D, y1 / 16.0D, z1 / 16.0D, x2 / 16.0D, y2 / 16.0D, z2 / 16.0D);
    }

    @Deprecated
    public boolean canEntitySpawn(BlockState state, IBlockReader worldIn, BlockPos pos, EntityType<?> type)
    {
        return state.isSolidSide(worldIn, pos, Direction.UP) && this.lightValue < 14;
    }

    @Deprecated
    public boolean isAir(BlockState state)
    {
        return false;
    }

    @Deprecated
    public int getLightValue(BlockState state)
    {
        return this.lightValue;
    }

    @Deprecated
    public Material getMaterial(BlockState state)
    {
        return this.material;
    }

    @Deprecated
    public MaterialColor getMaterialColor(BlockState state, IBlockReader worldIn, BlockPos pos)
    {
        return this.materialColor;
    }

    @Deprecated
    public void updateNeighbors(BlockState stateIn, IWorld worldIn, BlockPos pos, int flags)
    {
        try (BlockPos.PooledMutable blockpos$pooledmutable = BlockPos.PooledMutable.retain())
        {
            for (Direction direction : UPDATE_ORDER)
            {
                blockpos$pooledmutable.setPos(pos).move(direction);
                BlockState blockstate = worldIn.getBlockState(blockpos$pooledmutable);
                BlockState blockstate1 = blockstate.updatePostPlacement(direction.getOpposite(), stateIn, worldIn, blockpos$pooledmutable, pos);
                replaceBlock(blockstate, blockstate1, worldIn, blockpos$pooledmutable, flags);
            }
        }
    }

    public boolean isIn(Tag<Block> tagIn)
    {
        return tagIn.contains(this);
    }

    public static BlockState getValidBlockForPosition(BlockState currentState, IWorld worldIn, BlockPos pos)
    {
        BlockState blockstate = currentState;
        BlockPos.Mutable blockpos$mutable = new BlockPos.Mutable();

        for (Direction direction : UPDATE_ORDER)
        {
            blockpos$mutable.setPos(pos).move(direction);
            blockstate = blockstate.updatePostPlacement(direction, worldIn.getBlockState(blockpos$mutable), worldIn, pos, blockpos$mutable);
        }

        return blockstate;
    }

    public static void replaceBlock(BlockState oldState, BlockState newState, IWorld worldIn, BlockPos pos, int flags)
    {
        if (newState != oldState)
        {
            if (newState.isAir())
            {
                if (!worldIn.isRemote())
                {
                    worldIn.destroyBlock(pos, (flags & 32) == 0);
                }
            }
            else
            {
                worldIn.setBlockState(pos, newState, flags & -33);
            }
        }
    }

    @Deprecated
    public void updateDiagonalNeighbors(BlockState state, IWorld worldIn, BlockPos pos, int flags)
    {
    }

    @Deprecated
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos)
    {
        return stateIn;
    }

    @Deprecated
    public BlockState rotate(BlockState state, Rotation rot)
    {
        return state;
    }

    @Deprecated
    public BlockState mirror(BlockState state, Mirror mirrorIn)
    {
        return state;
    }

    public Block(Block.Properties p_i3697_1_)
    {
        StateContainer.Builder<Block, BlockState> builder = new StateContainer.Builder<>(this);
        this.fillStateContainer(builder);
        this.material = p_i3697_1_.material;
        this.materialColor = p_i3697_1_.mapColor;
        this.blocksMovement = p_i3697_1_.blocksMovement;
        this.soundType = p_i3697_1_.soundType;
        this.lightValue = p_i3697_1_.lightValue;
        this.blockResistance = p_i3697_1_.resistance;
        this.blockHardness = p_i3697_1_.hardness;
        this.ticksRandomly = p_i3697_1_.ticksRandomly;
        this.slipperiness = p_i3697_1_.slipperiness;
        this.speedFactor = p_i3697_1_.speedFactor;
        this.jumpFactor = p_i3697_1_.jumpFactor;
        this.variableOpacity = p_i3697_1_.variableOpacity;
        this.lootTable = p_i3697_1_.lootTable;
        this.isSolid = p_i3697_1_.isSolid;
        this.stateContainer = builder.create(BlockState::new);
        this.setDefaultState(this.stateContainer.getBaseState());
    }

    public static boolean cannotAttach(Block blockIn)
    {
        return blockIn instanceof LeavesBlock || blockIn == Blocks.BARRIER || blockIn == Blocks.CARVED_PUMPKIN || blockIn == Blocks.JACK_O_LANTERN || blockIn == Blocks.MELON || blockIn == Blocks.PUMPKIN || blockIn.isIn(BlockTags.SHULKER_BOXES);
    }

    @Deprecated
    public boolean isNormalCube(BlockState state, IBlockReader worldIn, BlockPos pos)
    {
        return state.getMaterial().isOpaque() && state.isCollisionShapeOpaque(worldIn, pos) && !state.canProvidePower();
    }

    @Deprecated
    public boolean causesSuffocation(BlockState state, IBlockReader worldIn, BlockPos pos)
    {
        return this.material.blocksMovement() && state.isCollisionShapeOpaque(worldIn, pos);
    }

    @Deprecated
    public boolean isViewBlocking(BlockState state, IBlockReader worldIn, BlockPos pos)
    {
        return state.isSuffocating(worldIn, pos);
    }

    @Deprecated
    public boolean allowsMovement(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type)
    {
        switch (type)
        {
            case LAND:
                return !state.isCollisionShapeOpaque(worldIn, pos);

            case WATER:
                return worldIn.getFluidState(pos).isTagged(FluidTags.WATER);

            case AIR:
                return !state.isCollisionShapeOpaque(worldIn, pos);

            default:
                return false;
        }
    }

    @Deprecated
    public BlockRenderType getRenderType(BlockState state)
    {
        return BlockRenderType.MODEL;
    }

    @Deprecated
    public boolean isReplaceable(BlockState state, BlockItemUseContext useContext)
    {
        return this.material.isReplaceable() && (useContext.getItem().isEmpty() || useContext.getItem().getItem() != this.asItem());
    }

    @Deprecated
    public boolean isReplaceable(BlockState p_225541_1_, Fluid p_225541_2_)
    {
        return this.material.isReplaceable() || !this.material.isSolid();
    }

    @Deprecated
    public float getBlockHardness(BlockState blockState, IBlockReader worldIn, BlockPos pos)
    {
        return this.blockHardness;
    }

    public boolean ticksRandomly(BlockState state)
    {
        return this.ticksRandomly;
    }

    public boolean hasTileEntity()
    {
        return this instanceof ITileEntityProvider;
    }

    @Deprecated
    public boolean needsPostProcessing(BlockState state, IBlockReader worldIn, BlockPos pos)
    {
        return false;
    }

    @Deprecated
    public boolean isEmissiveRendering(BlockState p_225543_1_)
    {
        return false;
    }

    public static boolean shouldSideBeRendered(BlockState adjacentState, IBlockReader blockState, BlockPos blockAccess, Direction pos)
    {
        BlockPos blockpos = blockAccess.offset(pos);
        BlockState blockstate = blockState.getBlockState(blockpos);

        if (adjacentState.isSideInvisible(blockstate, pos))
        {
            return false;
        }
        else if (blockstate.isSolid())
        {
            Block.RenderSideCacheKey block$rendersidecachekey = new Block.RenderSideCacheKey(adjacentState, blockstate, pos);
            Object2ByteLinkedOpenHashMap<Block.RenderSideCacheKey> object2bytelinkedopenhashmap = SHOULD_SIDE_RENDER_CACHE.get();
            byte b0 = object2bytelinkedopenhashmap.getAndMoveToFirst(block$rendersidecachekey);

            if (b0 != 127)
            {
                return b0 != 0;
            }
            else
            {
                VoxelShape voxelshape = adjacentState.getFaceOcclusionShape(blockState, blockAccess, pos);
                VoxelShape voxelshape1 = blockstate.getFaceOcclusionShape(blockState, blockpos, pos.getOpposite());
                boolean flag = VoxelShapes.compare(voxelshape, voxelshape1, IBooleanFunction.ONLY_FIRST);

                if (object2bytelinkedopenhashmap.size() == 2048)
                {
                    object2bytelinkedopenhashmap.removeLastByte();
                }

                object2bytelinkedopenhashmap.putAndMoveToFirst(block$rendersidecachekey, (byte)(flag ? 1 : 0));
                return flag;
            }
        }
        else
        {
            return true;
        }
    }

    @Deprecated
    public final boolean isSolid(BlockState state)
    {
        return this.isSolid;
    }

    @Deprecated
    public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side)
    {
        return false;
    }

    @Deprecated
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context)
    {
        return VoxelShapes.fullCube();
    }

    @Deprecated
    public VoxelShape getCollisionShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context)
    {
        return this.blocksMovement ? state.getShape(worldIn, pos) : VoxelShapes.empty();
    }

    @Deprecated
    public VoxelShape getRenderShape(BlockState state, IBlockReader worldIn, BlockPos pos)
    {
        return state.getShape(worldIn, pos);
    }

    @Deprecated
    public VoxelShape getRaytraceShape(BlockState state, IBlockReader worldIn, BlockPos pos)
    {
        return VoxelShapes.empty();
    }

    public static boolean hasSolidSideOnTop(IBlockReader worldIn, BlockPos pos)
    {
        BlockState blockstate = worldIn.getBlockState(pos);
        return !blockstate.isIn(BlockTags.LEAVES) && !VoxelShapes.compare(blockstate.getCollisionShape(worldIn, pos).project(Direction.UP), field_220083_b, IBooleanFunction.ONLY_SECOND);
    }

    public static boolean hasEnoughSolidSide(IWorldReader worldIn, BlockPos pos, Direction directionIn)
    {
        BlockState blockstate = worldIn.getBlockState(pos);
        return !blockstate.isIn(BlockTags.LEAVES) && !VoxelShapes.compare(blockstate.getCollisionShape(worldIn, pos).project(directionIn), field_220084_c, IBooleanFunction.ONLY_SECOND);
    }

    public static boolean hasSolidSide(BlockState state, IBlockReader worldIn, BlockPos pos, Direction side)
    {
        return !state.isIn(BlockTags.LEAVES) && doesSideFillSquare(state.getCollisionShape(worldIn, pos), side);
    }

    public static boolean doesSideFillSquare(VoxelShape shape, Direction side)
    {
        VoxelShape voxelshape = shape.project(side);
        return isOpaque(voxelshape);
    }

    public static boolean isOpaque(VoxelShape shape)
    {
        return OPAQUE_CACHE.getUnchecked(shape);
    }

    @Deprecated
    public final boolean isOpaqueCube(BlockState state, IBlockReader worldIn, BlockPos pos)
    {
        return state.isSolid() ? isOpaque(state.getRenderShape(worldIn, pos)) : false;
    }

    public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos)
    {
        return !isOpaque(state.getShape(reader, pos)) && state.getFluidState().isEmpty();
    }

    @Deprecated
    public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos)
    {
        if (state.isOpaqueCube(worldIn, pos))
        {
            return worldIn.getMaxLightLevel();
        }
        else
        {
            return state.propagatesSkylightDown(worldIn, pos) ? 0 : 1;
        }
    }

    @Deprecated
    public boolean isTransparent(BlockState state)
    {
        return false;
    }

    @Deprecated
    public void randomTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random)
    {
        this.tick(state, worldIn, pos, random);
    }

    @Deprecated
    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand)
    {
    }

    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand)
    {
    }

    public void onPlayerDestroy(IWorld worldIn, BlockPos pos, BlockState state)
    {
    }

    @Deprecated
    public void neighborChanged(BlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving)
    {
        DebugPacketSender.func_218806_a(worldIn, pos);
    }

    public int tickRate(IWorldReader worldIn)
    {
        return 10;
    }

    @Nullable
    @Deprecated
    public INamedContainerProvider getContainer(BlockState state, World worldIn, BlockPos pos)
    {
        return null;
    }

    @Deprecated
    public void onBlockAdded(BlockState state, World worldIn, BlockPos pos, BlockState oldState, boolean isMoving)
    {
    }

    @Deprecated
    public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving)
    {
        if (this.hasTileEntity() && state.getBlock() != newState.getBlock())
        {
            worldIn.removeTileEntity(pos);
        }
    }

    @Deprecated
    public float getPlayerRelativeBlockHardness(BlockState state, PlayerEntity player, IBlockReader worldIn, BlockPos pos)
    {
        float f = state.getBlockHardness(worldIn, pos);

        if (f == -1.0F)
        {
            return 0.0F;
        }
        else
        {
            int i = player.canHarvestBlock(state) ? 30 : 100;
            return player.getDigSpeed(state) / f / (float)i;
        }
    }

    @Deprecated
    public void spawnAdditionalDrops(BlockState state, World worldIn, BlockPos pos, ItemStack stack)
    {
    }

    public ResourceLocation getLootTable()
    {
        if (this.lootTable == null)
        {
            ResourceLocation resourcelocation = Registry.BLOCK.getKey(this);
            this.lootTable = new ResourceLocation(resourcelocation.getNamespace(), "blocks/" + resourcelocation.getPath());
        }

        return this.lootTable;
    }

    @Deprecated
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder)
    {
        ResourceLocation resourcelocation = this.getLootTable();

        if (resourcelocation == LootTables.EMPTY)
        {
            return Collections.emptyList();
        }
        else
        {
            LootContext lootcontext = builder.withParameter(LootParameters.BLOCK_STATE, state).build(LootParameterSets.BLOCK);
            ServerWorld serverworld = lootcontext.getWorld();
            LootTable loottable = serverworld.getServer().getLootTableManager().getLootTableFromLocation(resourcelocation);
            return loottable.generate(lootcontext);
        }
    }

    public static List<ItemStack> getDrops(BlockState state, ServerWorld worldIn, BlockPos pos, @Nullable TileEntity tileEntityIn)
    {
        LootContext.Builder lootcontext$builder = (new LootContext.Builder(worldIn)).withRandom(worldIn.rand).withParameter(LootParameters.POSITION, pos).withParameter(LootParameters.TOOL, ItemStack.EMPTY).withNullableParameter(LootParameters.BLOCK_ENTITY, tileEntityIn);
        return state.getDrops(lootcontext$builder);
    }

    public static List<ItemStack> getDrops(BlockState state, ServerWorld worldIn, BlockPos pos, @Nullable TileEntity tileEntityIn, @Nullable Entity entityIn, ItemStack stack)
    {
        LootContext.Builder lootcontext$builder = (new LootContext.Builder(worldIn)).withRandom(worldIn.rand).withParameter(LootParameters.POSITION, pos).withParameter(LootParameters.TOOL, stack).withNullableParameter(LootParameters.THIS_ENTITY, entityIn).withNullableParameter(LootParameters.BLOCK_ENTITY, tileEntityIn);
        return state.getDrops(lootcontext$builder);
    }

    public static void spawnDrops(BlockState state, World worldIn, BlockPos pos)
    {
        if (worldIn instanceof ServerWorld)
        {
            getDrops(state, (ServerWorld)worldIn, pos, (TileEntity)null).forEach((p_220079_2_) ->
            {
                spawnAsEntity(worldIn, pos, p_220079_2_);
            });
        }

        state.spawnAdditionalDrops(worldIn, pos, ItemStack.EMPTY);
    }

    public static void spawnDrops(BlockState state, World worldIn, BlockPos pos, @Nullable TileEntity tileEntityIn)
    {
        if (worldIn instanceof ServerWorld)
        {
            getDrops(state, (ServerWorld)worldIn, pos, tileEntityIn).forEach((p_220061_2_) ->
            {
                spawnAsEntity(worldIn, pos, p_220061_2_);
            });
        }

        state.spawnAdditionalDrops(worldIn, pos, ItemStack.EMPTY);
    }

    public static void spawnDrops(BlockState state, World worldIn, BlockPos pos, @Nullable TileEntity tileEntityIn, Entity entityIn, ItemStack stack)
    {
        if (worldIn instanceof ServerWorld)
        {
            getDrops(state, (ServerWorld)worldIn, pos, tileEntityIn, entityIn, stack).forEach((p_220057_2_) ->
            {
                spawnAsEntity(worldIn, pos, p_220057_2_);
            });
        }

        state.spawnAdditionalDrops(worldIn, pos, stack);
    }

    public static void spawnAsEntity(World worldIn, BlockPos pos, ItemStack stack)
    {
        if (!worldIn.isRemote && !stack.isEmpty() && worldIn.getGameRules().getBoolean(GameRules.DO_TILE_DROPS))
        {
            float f = 0.5F;
            double d0 = (double)(worldIn.rand.nextFloat() * 0.5F) + 0.25D;
            double d1 = (double)(worldIn.rand.nextFloat() * 0.5F) + 0.25D;
            double d2 = (double)(worldIn.rand.nextFloat() * 0.5F) + 0.25D;
            ItemEntity itementity = new ItemEntity(worldIn, (double)pos.getX() + d0, (double)pos.getY() + d1, (double)pos.getZ() + d2, stack);
            itementity.setDefaultPickupDelay();
            worldIn.addEntity(itementity);
        }
    }

    protected void dropXpOnBlockBreak(World worldIn, BlockPos pos, int amount)
    {
        if (!worldIn.isRemote && worldIn.getGameRules().getBoolean(GameRules.DO_TILE_DROPS))
        {
            while (amount > 0)
            {
                int i = ExperienceOrbEntity.getXPSplit(amount);
                amount -= i;
                worldIn.addEntity(new ExperienceOrbEntity(worldIn, (double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, i));
            }
        }
    }

    public float getExplosionResistance()
    {
        return this.blockResistance;
    }

    public void onExplosionDestroy(World worldIn, BlockPos pos, Explosion explosionIn)
    {
    }

    @Deprecated
    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos)
    {
        return true;
    }

    @Deprecated
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit)
    {
        return ActionResultType.PASS;
    }

    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn)
    {
    }

    @Nullable
    public BlockState getStateForPlacement(BlockItemUseContext context)
    {
        return this.getDefaultState();
    }

    @Deprecated
    public void onBlockClicked(BlockState state, World worldIn, BlockPos pos, PlayerEntity player)
    {
    }

    @Deprecated
    public int getWeakPower(BlockState blockState, IBlockReader blockAccess, BlockPos pos, Direction side)
    {
        return 0;
    }

    @Deprecated
    public boolean canProvidePower(BlockState state)
    {
        return false;
    }

    @Deprecated
    public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn)
    {
    }

    @Deprecated
    public int getStrongPower(BlockState blockState, IBlockReader blockAccess, BlockPos pos, Direction side)
    {
        return 0;
    }

    public void harvestBlock(World worldIn, PlayerEntity player, BlockPos pos, BlockState state, @Nullable TileEntity te, ItemStack stack)
    {
        player.addStat(Stats.BLOCK_MINED.get(this));
        player.addExhaustion(0.005F);
        spawnDrops(state, worldIn, pos, te, player, stack);
    }

    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack)
    {
    }

    public boolean canSpawnInBlock()
    {
        return !this.material.isSolid() && !this.material.isLiquid();
    }

    public ITextComponent getNameTextComponent()
    {
        return new TranslationTextComponent(this.getTranslationKey());
    }

    public String getTranslationKey()
    {
        if (this.translationKey == null)
        {
            this.translationKey = Util.makeTranslationKey("block", Registry.BLOCK.getKey(this));
        }

        return this.translationKey;
    }

    @Deprecated
    public boolean eventReceived(BlockState state, World worldIn, BlockPos pos, int id, int param)
    {
        return false;
    }

    @Deprecated
    public PushReaction getPushReaction(BlockState state)
    {
        return this.material.getPushReaction();
    }

    @Deprecated
    public float getAmbientOcclusionLightValue(BlockState state, IBlockReader worldIn, BlockPos pos)
    {
        return state.isCollisionShapeOpaque(worldIn, pos) ? 0.2F : 1.0F;
    }

    public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance)
    {
        entityIn.onLivingFall(fallDistance, 1.0F);
    }

    public void onLanded(IBlockReader worldIn, Entity entityIn)
    {
        entityIn.setMotion(entityIn.getMotion().mul(1.0D, 0.0D, 1.0D));
    }

    public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state)
    {
        return new ItemStack(this);
    }

    public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items)
    {
        items.add(new ItemStack(this));
    }

    @Deprecated
    public IFluidState getFluidState(BlockState state)
    {
        return Fluids.EMPTY.getDefaultState();
    }

    public float getSlipperiness()
    {
        return this.slipperiness;
    }

    public float getSpeedFactor()
    {
        return this.speedFactor;
    }

    public float getJumpFactor()
    {
        return this.jumpFactor;
    }

    @Deprecated
    public long getPositionRandom(BlockState state, BlockPos pos)
    {
        return MathHelper.getPositionRandom(pos);
    }

    public void onProjectileCollision(World worldIn, BlockState state, BlockRayTraceResult hit, Entity projectile)
    {
    }

    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player)
    {
        worldIn.playEvent(player, 2001, pos, getStateId(state));
    }

    public void fillWithRain(World worldIn, BlockPos pos)
    {
    }

    public boolean canDropFromExplosion(Explosion explosionIn)
    {
        return true;
    }

    @Deprecated
    public boolean hasComparatorInputOverride(BlockState state)
    {
        return false;
    }

    @Deprecated
    public int getComparatorInputOverride(BlockState blockState, World worldIn, BlockPos pos)
    {
        return 0;
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
    }

    public StateContainer<Block, BlockState> getStateContainer()
    {
        return this.stateContainer;
    }

    protected final void setDefaultState(BlockState state)
    {
        this.defaultState = state;
    }

    public final BlockState getDefaultState()
    {
        return this.defaultState;
    }

    public Block.OffsetType getOffsetType()
    {
        return Block.OffsetType.NONE;
    }

    @Deprecated
    public Vec3d getOffset(BlockState state, IBlockReader worldIn, BlockPos pos)
    {
        Block.OffsetType block$offsettype = this.getOffsetType();

        if (block$offsettype == Block.OffsetType.NONE)
        {
            return Vec3d.ZERO;
        }
        else
        {
            long i = MathHelper.getCoordinateRandom(pos.getX(), 0, pos.getZ());
            return new Vec3d(((double)((float)(i & 15L) / 15.0F) - 0.5D) * 0.5D, block$offsettype == Block.OffsetType.XYZ ? ((double)((float)(i >> 4 & 15L) / 15.0F) - 1.0D) * 0.2D : 0.0D, ((double)((float)(i >> 8 & 15L) / 15.0F) - 0.5D) * 0.5D);
        }
    }

    public SoundType getSoundType(BlockState state)
    {
        return this.soundType;
    }

    public Item asItem()
    {
        if (this.item == null)
        {
            this.item = Item.getItemFromBlock(this);
        }

        return this.item;
    }

    public boolean isVariableOpacity()
    {
        return this.variableOpacity;
    }

    public String toString()
    {
        return "Block{" + Registry.BLOCK.getKey(this) + "}";
    }

    public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {
    }

    public static enum OffsetType
    {
        NONE,
        XZ,
        XYZ;
    }

    public static class Properties
    {
        private Material material;
        private MaterialColor mapColor;
        private boolean blocksMovement = true;
        private SoundType soundType = SoundType.STONE;
        private int lightValue;
        private float resistance;
        private float hardness;
        private boolean ticksRandomly;
        private float slipperiness = 0.6F;
        private float speedFactor = 1.0F;
        private float jumpFactor = 1.0F;
        private ResourceLocation lootTable;
        private boolean isSolid = true;
        private boolean variableOpacity;

        private Properties(Material p_i1460_1_, MaterialColor p_i1460_2_)
        {
            this.material = p_i1460_1_;
            this.mapColor = p_i1460_2_;
        }

        public static Block.Properties create(Material materialIn)
        {
            return create(materialIn, materialIn.getColor());
        }

        public static Block.Properties create(Material materialIn, DyeColor color)
        {
            return create(materialIn, color.getMapColor());
        }

        public static Block.Properties create(Material materialIn, MaterialColor mapColorIn)
        {
            return new Block.Properties(materialIn, mapColorIn);
        }

        public static Block.Properties from(Block blockIn)
        {
            Block.Properties block$properties = new Block.Properties(blockIn.material, blockIn.materialColor);
            block$properties.material = blockIn.material;
            block$properties.hardness = blockIn.blockHardness;
            block$properties.resistance = blockIn.blockResistance;
            block$properties.blocksMovement = blockIn.blocksMovement;
            block$properties.ticksRandomly = blockIn.ticksRandomly;
            block$properties.lightValue = blockIn.lightValue;
            block$properties.mapColor = blockIn.materialColor;
            block$properties.soundType = blockIn.soundType;
            block$properties.slipperiness = blockIn.getSlipperiness();
            block$properties.speedFactor = blockIn.getSpeedFactor();
            block$properties.variableOpacity = blockIn.variableOpacity;
            block$properties.isSolid = blockIn.isSolid;
            return block$properties;
        }

        public Block.Properties doesNotBlockMovement()
        {
            this.blocksMovement = false;
            this.isSolid = false;
            return this;
        }

        public Block.Properties notSolid()
        {
            this.isSolid = false;
            return this;
        }

        public Block.Properties slipperiness(float slipperinessIn)
        {
            this.slipperiness = slipperinessIn;
            return this;
        }

        public Block.Properties speedFactor(float factor)
        {
            this.speedFactor = factor;
            return this;
        }

        public Block.Properties jumpFactor(float factor)
        {
            this.jumpFactor = factor;
            return this;
        }

        protected Block.Properties sound(SoundType soundTypeIn)
        {
            this.soundType = soundTypeIn;
            return this;
        }

        protected Block.Properties lightValue(int lightValueIn)
        {
            this.lightValue = lightValueIn;
            return this;
        }

        public Block.Properties hardnessAndResistance(float hardnessIn, float resistanceIn)
        {
            this.hardness = hardnessIn;
            this.resistance = Math.max(0.0F, resistanceIn);
            return this;
        }

        protected Block.Properties zeroHardnessAndResistance()
        {
            return this.hardnessAndResistance(0.0F);
        }

        protected Block.Properties hardnessAndResistance(float hardnessAndResistance)
        {
            this.hardnessAndResistance(hardnessAndResistance, hardnessAndResistance);
            return this;
        }

        protected Block.Properties tickRandomly()
        {
            this.ticksRandomly = true;
            return this;
        }

        protected Block.Properties variableOpacity()
        {
            this.variableOpacity = true;
            return this;
        }

        protected Block.Properties noDrops()
        {
            this.lootTable = LootTables.EMPTY;
            return this;
        }

        public Block.Properties lootFrom(Block blockIn)
        {
            this.lootTable = blockIn.getLootTable();
            return this;
        }
    }

    public static final class RenderSideCacheKey
    {
        private final BlockState state;
        private final BlockState adjacentState;
        private final Direction side;

        public RenderSideCacheKey(BlockState damageTypeIn, BlockState source, Direction indirectEntityIn)
        {
            this.state = damageTypeIn;
            this.adjacentState = source;
            this.side = indirectEntityIn;
        }

        public boolean equals(Object p_equals_1_)
        {
            if (this == p_equals_1_)
            {
                return true;
            }
            else if (!(p_equals_1_ instanceof Block.RenderSideCacheKey))
            {
                return false;
            }
            else
            {
                Block.RenderSideCacheKey block$rendersidecachekey = (Block.RenderSideCacheKey)p_equals_1_;
                return this.state == block$rendersidecachekey.state && this.adjacentState == block$rendersidecachekey.adjacentState && this.side == block$rendersidecachekey.side;
            }
        }

        public int hashCode()
        {
            int i = this.state.hashCode();
            i = 31 * i + this.adjacentState.hashCode();
            i = 31 * i + this.side.hashCode();
            return i;
        }
    }
}
