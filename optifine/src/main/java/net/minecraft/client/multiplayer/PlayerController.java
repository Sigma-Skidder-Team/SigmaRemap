package net.minecraft.client.multiplayer;

import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CommandBlockBlock;
import net.minecraft.block.JigsawBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StructureBlock;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SimpleSound;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.client.network.play.ClientPlayNetHandler;
import net.minecraft.client.util.ClientRecipeBook;
import net.minecraft.client.util.PosAndRotation;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.horse.AbstractHorseEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.IFluidState;
import net.minecraft.inventory.container.ClickType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.network.play.client.CClickWindowPacket;
import net.minecraft.network.play.client.CCreativeInventoryActionPacket;
import net.minecraft.network.play.client.CEnchantItemPacket;
import net.minecraft.network.play.client.CHeldItemChangePacket;
import net.minecraft.network.play.client.CPickItemPacket;
import net.minecraft.network.play.client.CPlaceRecipePacket;
import net.minecraft.network.play.client.CPlayerDiggingPacket;
import net.minecraft.network.play.client.CPlayerTryUseItemOnBlockPacket;
import net.minecraft.network.play.client.CPlayerTryUseItemPacket;
import net.minecraft.network.play.client.CUseEntityPacket;
import net.minecraft.stats.StatisticsManager;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.GameType;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PlayerController
{
    private static final Logger field_225325_a = LogManager.getLogger();
    private final Minecraft mc;
    private final ClientPlayNetHandler connection;
    private BlockPos currentBlock = new BlockPos(-1, -1, -1);
    private ItemStack currentItemHittingBlock = ItemStack.EMPTY;
    private float curBlockDamageMP;
    private float stepSoundTickCounter;
    private int blockHitDelay;
    private boolean isHittingBlock;
    private GameType currentGameType = GameType.SURVIVAL;
    private final Object2ObjectLinkedOpenHashMap<Pair<BlockPos, CPlayerDiggingPacket.Action>, PosAndRotation> field_225326_k = new Object2ObjectLinkedOpenHashMap<>();
    private int currentPlayerItem;

    public PlayerController(Minecraft p_i447_1_, ClientPlayNetHandler p_i447_2_)
    {
        this.mc = p_i447_1_;
        this.connection = p_i447_2_;
    }

    public static void clickBlockCreative(Minecraft mcIn, PlayerController playerController, BlockPos pos, Direction facing)
    {
        if (!mcIn.world.extinguishFire(mcIn.player, pos, facing))
        {
            playerController.onPlayerDestroyBlock(pos);
        }
    }

    public void setPlayerCapabilities(PlayerEntity player)
    {
        this.currentGameType.configurePlayerCapabilities(player.abilities);
    }

    public void setGameType(GameType type)
    {
        this.currentGameType = type;
        this.currentGameType.configurePlayerCapabilities(this.mc.player.abilities);
    }

    public boolean shouldDrawHUD()
    {
        return this.currentGameType.isSurvivalOrAdventure();
    }

    public boolean onPlayerDestroyBlock(BlockPos pos)
    {
        if (this.mc.player.func_223729_a(this.mc.world, pos, this.currentGameType))
        {
            return false;
        }
        else
        {
            World world = this.mc.world;
            BlockState blockstate = world.getBlockState(pos);

            if (!this.mc.player.getHeldItemMainhand().getItem().canPlayerBreakBlockWhileHolding(blockstate, world, pos, this.mc.player))
            {
                return false;
            }
            else
            {
                Block block = blockstate.getBlock();

                if ((block instanceof CommandBlockBlock || block instanceof StructureBlock || block instanceof JigsawBlock) && !this.mc.player.canUseCommandBlock())
                {
                    return false;
                }
                else if (blockstate.isAir())
                {
                    return false;
                }
                else
                {
                    block.onBlockHarvested(world, pos, blockstate, this.mc.player);
                    IFluidState ifluidstate = world.getFluidState(pos);
                    boolean flag = world.setBlockState(pos, ifluidstate.getBlockState(), 11);

                    if (flag)
                    {
                        block.onPlayerDestroy(world, pos, blockstate);
                    }

                    return flag;
                }
            }
        }
    }

    public boolean clickBlock(BlockPos loc, Direction face)
    {
        if (this.mc.player.func_223729_a(this.mc.world, loc, this.currentGameType))
        {
            return false;
        }
        else if (!this.mc.world.getWorldBorder().contains(loc))
        {
            return false;
        }
        else
        {
            if (this.currentGameType.isCreative())
            {
                BlockState blockstate = this.mc.world.getBlockState(loc);
                this.mc.getTutorial().onHitBlock(this.mc.world, loc, blockstate, 1.0F);
                this.func_225324_a(CPlayerDiggingPacket.Action.START_DESTROY_BLOCK, loc, face);
                clickBlockCreative(this.mc, this, loc, face);
                this.blockHitDelay = 5;
            }
            else if (!this.isHittingBlock || !this.isHittingPosition(loc))
            {
                if (this.isHittingBlock)
                {
                    this.func_225324_a(CPlayerDiggingPacket.Action.ABORT_DESTROY_BLOCK, this.currentBlock, face);
                }

                BlockState blockstate1 = this.mc.world.getBlockState(loc);
                this.mc.getTutorial().onHitBlock(this.mc.world, loc, blockstate1, 0.0F);
                this.func_225324_a(CPlayerDiggingPacket.Action.START_DESTROY_BLOCK, loc, face);
                boolean flag = !blockstate1.isAir();

                if (flag && this.curBlockDamageMP == 0.0F)
                {
                    blockstate1.onBlockClicked(this.mc.world, loc, this.mc.player);
                }

                if (flag && blockstate1.getPlayerRelativeBlockHardness(this.mc.player, this.mc.player.world, loc) >= 1.0F)
                {
                    this.onPlayerDestroyBlock(loc);
                }
                else
                {
                    this.isHittingBlock = true;
                    this.currentBlock = loc;
                    this.currentItemHittingBlock = this.mc.player.getHeldItemMainhand();
                    this.curBlockDamageMP = 0.0F;
                    this.stepSoundTickCounter = 0.0F;
                    this.mc.world.sendBlockBreakProgress(this.mc.player.getEntityId(), this.currentBlock, (int)(this.curBlockDamageMP * 10.0F) - 1);
                }
            }

            return true;
        }
    }

    public void resetBlockRemoving()
    {
        if (this.isHittingBlock)
        {
            BlockState blockstate = this.mc.world.getBlockState(this.currentBlock);
            this.mc.getTutorial().onHitBlock(this.mc.world, this.currentBlock, blockstate, -1.0F);
            this.func_225324_a(CPlayerDiggingPacket.Action.ABORT_DESTROY_BLOCK, this.currentBlock, Direction.DOWN);
            this.isHittingBlock = false;
            this.curBlockDamageMP = 0.0F;
            this.mc.world.sendBlockBreakProgress(this.mc.player.getEntityId(), this.currentBlock, -1);
            this.mc.player.resetCooldown();
        }
    }

    public boolean onPlayerDamageBlock(BlockPos posBlock, Direction directionFacing)
    {
        this.syncCurrentPlayItem();

        if (this.blockHitDelay > 0)
        {
            --this.blockHitDelay;
            return true;
        }
        else if (this.currentGameType.isCreative() && this.mc.world.getWorldBorder().contains(posBlock))
        {
            this.blockHitDelay = 5;
            BlockState blockstate1 = this.mc.world.getBlockState(posBlock);
            this.mc.getTutorial().onHitBlock(this.mc.world, posBlock, blockstate1, 1.0F);
            this.func_225324_a(CPlayerDiggingPacket.Action.START_DESTROY_BLOCK, posBlock, directionFacing);
            clickBlockCreative(this.mc, this, posBlock, directionFacing);
            return true;
        }
        else if (this.isHittingPosition(posBlock))
        {
            BlockState blockstate = this.mc.world.getBlockState(posBlock);

            if (blockstate.isAir())
            {
                this.isHittingBlock = false;
                return false;
            }
            else
            {
                this.curBlockDamageMP += blockstate.getPlayerRelativeBlockHardness(this.mc.player, this.mc.player.world, posBlock);

                if (this.stepSoundTickCounter % 4.0F == 0.0F)
                {
                    SoundType soundtype = blockstate.getSoundType();
                    this.mc.getSoundHandler().play(new SimpleSound(soundtype.getHitSound(), SoundCategory.BLOCKS, (soundtype.getVolume() + 1.0F) / 8.0F, soundtype.getPitch() * 0.5F, posBlock));
                }

                ++this.stepSoundTickCounter;
                this.mc.getTutorial().onHitBlock(this.mc.world, posBlock, blockstate, MathHelper.clamp(this.curBlockDamageMP, 0.0F, 1.0F));

                if (this.curBlockDamageMP >= 1.0F)
                {
                    this.isHittingBlock = false;
                    this.func_225324_a(CPlayerDiggingPacket.Action.STOP_DESTROY_BLOCK, posBlock, directionFacing);
                    this.onPlayerDestroyBlock(posBlock);
                    this.curBlockDamageMP = 0.0F;
                    this.stepSoundTickCounter = 0.0F;
                    this.blockHitDelay = 5;
                }

                this.mc.world.sendBlockBreakProgress(this.mc.player.getEntityId(), this.currentBlock, (int)(this.curBlockDamageMP * 10.0F) - 1);
                return true;
            }
        }
        else
        {
            return this.clickBlock(posBlock, directionFacing);
        }
    }

    public float getBlockReachDistance()
    {
        return this.currentGameType.isCreative() ? 5.0F : 4.5F;
    }

    public void tick()
    {
        this.syncCurrentPlayItem();

        if (this.connection.getNetworkManager().isChannelOpen())
        {
            this.connection.getNetworkManager().tick();
        }
        else
        {
            this.connection.getNetworkManager().handleDisconnection();
        }
    }

    private boolean isHittingPosition(BlockPos pos)
    {
        ItemStack itemstack = this.mc.player.getHeldItemMainhand();
        boolean flag = this.currentItemHittingBlock.isEmpty() && itemstack.isEmpty();

        if (!this.currentItemHittingBlock.isEmpty() && !itemstack.isEmpty())
        {
            flag = itemstack.getItem() == this.currentItemHittingBlock.getItem() && ItemStack.areItemStackTagsEqual(itemstack, this.currentItemHittingBlock) && (itemstack.isDamageable() || itemstack.getDamage() == this.currentItemHittingBlock.getDamage());
        }

        return pos.equals(this.currentBlock) && flag;
    }

    private void syncCurrentPlayItem()
    {
        int i = this.mc.player.inventory.currentItem;

        if (i != this.currentPlayerItem)
        {
            this.currentPlayerItem = i;
            this.connection.sendPacket(new CHeldItemChangePacket(this.currentPlayerItem));
        }
    }

    public ActionResultType func_217292_a(ClientPlayerEntity p_217292_1_, ClientWorld p_217292_2_, Hand p_217292_3_, BlockRayTraceResult p_217292_4_)
    {
        this.syncCurrentPlayItem();
        BlockPos blockpos = p_217292_4_.getPos();

        if (!this.mc.world.getWorldBorder().contains(blockpos))
        {
            return ActionResultType.FAIL;
        }
        else
        {
            ItemStack itemstack = p_217292_1_.getHeldItem(p_217292_3_);

            if (this.currentGameType == GameType.SPECTATOR)
            {
                this.connection.sendPacket(new CPlayerTryUseItemOnBlockPacket(p_217292_3_, p_217292_4_));
                return ActionResultType.SUCCESS;
            }
            else
            {
                boolean flag = !p_217292_1_.getHeldItemMainhand().isEmpty() || !p_217292_1_.getHeldItemOffhand().isEmpty();
                boolean flag1 = p_217292_1_.func_226563_dT_() && flag;

                if (!flag1)
                {
                    ActionResultType actionresulttype = p_217292_2_.getBlockState(blockpos).onBlockActivated(p_217292_2_, p_217292_1_, p_217292_3_, p_217292_4_);

                    if (actionresulttype.isSuccessOrConsume())
                    {
                        this.connection.sendPacket(new CPlayerTryUseItemOnBlockPacket(p_217292_3_, p_217292_4_));
                        return actionresulttype;
                    }
                }

                this.connection.sendPacket(new CPlayerTryUseItemOnBlockPacket(p_217292_3_, p_217292_4_));

                if (!itemstack.isEmpty() && !p_217292_1_.getCooldownTracker().hasCooldown(itemstack.getItem()))
                {
                    ItemUseContext itemusecontext = new ItemUseContext(p_217292_1_, p_217292_3_, p_217292_4_);
                    ActionResultType actionresulttype1;

                    if (this.currentGameType.isCreative())
                    {
                        int i = itemstack.getCount();
                        actionresulttype1 = itemstack.onItemUse(itemusecontext);
                        itemstack.setCount(i);
                    }
                    else
                    {
                        actionresulttype1 = itemstack.onItemUse(itemusecontext);
                    }

                    return actionresulttype1;
                }
                else
                {
                    return ActionResultType.PASS;
                }
            }
        }
    }

    public ActionResultType processRightClick(PlayerEntity player, World worldIn, Hand hand)
    {
        if (this.currentGameType == GameType.SPECTATOR)
        {
            return ActionResultType.PASS;
        }
        else
        {
            this.syncCurrentPlayItem();
            this.connection.sendPacket(new CPlayerTryUseItemPacket(hand));
            ItemStack itemstack = player.getHeldItem(hand);

            if (player.getCooldownTracker().hasCooldown(itemstack.getItem()))
            {
                return ActionResultType.PASS;
            }
            else
            {
                int i = itemstack.getCount();
                ActionResult<ItemStack> actionresult = itemstack.useItemRightClick(worldIn, player, hand);
                ItemStack itemstack1 = actionresult.getResult();

                if (itemstack1 != itemstack || itemstack1.getCount() != i)
                {
                    player.setHeldItem(hand, itemstack1);
                }

                return actionresult.getType();
            }
        }
    }

    public ClientPlayerEntity createPlayer(ClientWorld p_199681_1_, StatisticsManager p_199681_2_, ClientRecipeBook p_199681_3_)
    {
        return new ClientPlayerEntity(this.mc, p_199681_1_, this.connection, p_199681_2_, p_199681_3_);
    }

    public void attackEntity(PlayerEntity playerIn, Entity targetEntity)
    {
        this.syncCurrentPlayItem();
        this.connection.sendPacket(new CUseEntityPacket(targetEntity));

        if (this.currentGameType != GameType.SPECTATOR)
        {
            playerIn.attackTargetEntityWithCurrentItem(targetEntity);
            playerIn.resetCooldown();
        }
    }

    public ActionResultType interactWithEntity(PlayerEntity player, Entity target, Hand hand)
    {
        this.syncCurrentPlayItem();
        this.connection.sendPacket(new CUseEntityPacket(target, hand));
        return this.currentGameType == GameType.SPECTATOR ? ActionResultType.PASS : player.interactOn(target, hand);
    }

    public ActionResultType interactWithEntity(PlayerEntity player, Entity target, EntityRayTraceResult ray, Hand hand)
    {
        this.syncCurrentPlayItem();
        Vec3d vec3d = ray.getHitVec().subtract(target.getPosX(), target.getPosY(), target.getPosZ());
        this.connection.sendPacket(new CUseEntityPacket(target, hand, vec3d));
        return this.currentGameType == GameType.SPECTATOR ? ActionResultType.PASS : target.applyPlayerInteraction(player, vec3d, hand);
    }

    public ItemStack windowClick(int windowId, int slotId, int mouseButton, ClickType type, PlayerEntity player)
    {
        short short1 = player.openContainer.getNextTransactionID(player.inventory);
        ItemStack itemstack = player.openContainer.slotClick(slotId, mouseButton, type, player);
        this.connection.sendPacket(new CClickWindowPacket(windowId, slotId, mouseButton, type, itemstack, short1));
        return itemstack;
    }

    public void sendPlaceRecipePacket(int p_203413_1_, IRecipe<?> p_203413_2_, boolean p_203413_3_)
    {
        this.connection.sendPacket(new CPlaceRecipePacket(p_203413_1_, p_203413_2_, p_203413_3_));
    }

    public void sendEnchantPacket(int windowID, int button)
    {
        this.connection.sendPacket(new CEnchantItemPacket(windowID, button));
    }

    public void sendSlotPacket(ItemStack itemStackIn, int slotId)
    {
        if (this.currentGameType.isCreative())
        {
            this.connection.sendPacket(new CCreativeInventoryActionPacket(slotId, itemStackIn));
        }
    }

    public void sendPacketDropItem(ItemStack itemStackIn)
    {
        if (this.currentGameType.isCreative() && !itemStackIn.isEmpty())
        {
            this.connection.sendPacket(new CCreativeInventoryActionPacket(-1, itemStackIn));
        }
    }

    public void onStoppedUsingItem(PlayerEntity playerIn)
    {
        this.syncCurrentPlayItem();
        this.connection.sendPacket(new CPlayerDiggingPacket(CPlayerDiggingPacket.Action.RELEASE_USE_ITEM, BlockPos.ZERO, Direction.DOWN));
        playerIn.stopActiveHand();
    }

    public boolean gameIsSurvivalOrAdventure()
    {
        return this.currentGameType.isSurvivalOrAdventure();
    }

    public boolean isNotCreative()
    {
        return !this.currentGameType.isCreative();
    }

    public boolean isInCreativeMode()
    {
        return this.currentGameType.isCreative();
    }

    public boolean extendedReach()
    {
        return this.currentGameType.isCreative();
    }

    public boolean isRidingHorse()
    {
        return this.mc.player.isPassenger() && this.mc.player.getRidingEntity() instanceof AbstractHorseEntity;
    }

    public boolean isSpectatorMode()
    {
        return this.currentGameType == GameType.SPECTATOR;
    }

    public GameType getCurrentGameType()
    {
        return this.currentGameType;
    }

    public boolean getIsHittingBlock()
    {
        return this.isHittingBlock;
    }

    public void pickItem(int index)
    {
        this.connection.sendPacket(new CPickItemPacket(index));
    }

    private void func_225324_a(CPlayerDiggingPacket.Action p_225324_1_, BlockPos p_225324_2_, Direction p_225324_3_)
    {
        ClientPlayerEntity clientplayerentity = this.mc.player;
        this.field_225326_k.put(Pair.of(p_225324_2_, p_225324_1_), new PosAndRotation(clientplayerentity.getPositionVec(), clientplayerentity.rotationPitch, clientplayerentity.rotationYaw));
        this.connection.sendPacket(new CPlayerDiggingPacket(p_225324_1_, p_225324_2_, p_225324_3_));
    }

    public void func_225323_a(ClientWorld p_225323_1_, BlockPos p_225323_2_, BlockState p_225323_3_, CPlayerDiggingPacket.Action p_225323_4_, boolean p_225323_5_)
    {
        PosAndRotation posandrotation = this.field_225326_k.remove(Pair.of(p_225323_2_, p_225323_4_));

        if (posandrotation == null || !p_225323_5_ || p_225323_4_ != CPlayerDiggingPacket.Action.START_DESTROY_BLOCK && p_225323_1_.getBlockState(p_225323_2_) != p_225323_3_)
        {
            p_225323_1_.invalidateRegionAndSetBlock(p_225323_2_, p_225323_3_);

            if (posandrotation != null)
            {
                Vec3d vec3d = posandrotation.func_224783_a();
                this.mc.player.setPositionAndRotation(vec3d.x, vec3d.y, vec3d.z, posandrotation.func_224785_c(), posandrotation.func_224784_b());
            }
        }

        while (this.field_225326_k.size() >= 50)
        {
            Pair<BlockPos, CPlayerDiggingPacket.Action> pair = this.field_225326_k.firstKey();
            this.field_225326_k.removeFirst();
            field_225325_a.error("Too many unacked block actions, dropping " + pair);
        }
    }
}
