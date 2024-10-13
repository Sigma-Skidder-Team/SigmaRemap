package net.minecraft.client.multiplayer;

import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import mapped.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.inventory.container.ClickType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.network.play.client.*;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.GameType;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PlayerController {
   private static final Logger field31357 = LogManager.getLogger();
   public final Minecraft mc;
   public final ClientPlayNetHandler connection;
   private BlockPos field31360 = new BlockPos(-1, -1, -1);
   private ItemStack field31361 = ItemStack.EMPTY;
   public float field31362;
   private float field31363;
   public int field31364;
   private boolean field31365;
   private GameType currentGameType = GameType.field11102;
   private GameType field31367 = GameType.field11101;
   private final Object2ObjectLinkedOpenHashMap<Pair<BlockPos, CPlayerDiggingPacket.Action>, Vector3d> field31368 = new Object2ObjectLinkedOpenHashMap();
   private int currentPlayerItem;

   public PlayerController(Minecraft var1, ClientPlayNetHandler var2) {
      this.mc = var1;
      this.connection = var2;
   }

   public void setPlayerCapabilities(PlayerEntity var1) {
      this.currentGameType.method8155(var1.abilities);
   }

   public void method23128(GameType var1) {
      this.field31367 = var1;
   }

   public void setGameType(GameType var1) {
      if (var1 != this.currentGameType) {
         this.field31367 = this.currentGameType;
      }

      this.currentGameType = var1;
      this.currentGameType.method8155(this.mc.player.abilities);
   }

   public boolean shouldDrawHUD() {
      return this.currentGameType.method8158();
   }

   public boolean onPlayerDestroyBlock(BlockPos var1) {
      if (!this.mc.player.blockActionRestricted(this.mc.world, var1, this.currentGameType)) {
         ClientWorld var4 = this.mc.world;
         BlockState var5 = var4.getBlockState(var1);
         if (!this.mc.player.getHeldItemMainhand().getItem().canPlayerBreakBlockWhileHolding(var5, var4, var1, this.mc.player)) {
            return false;
         } else {
            Block var6 = var5.getBlock();
            if ((var6 instanceof CommandBlockBlock || var6 instanceof StructureBlock || var6 instanceof JigsawBlock) && !this.mc.player.canUseCommandBlock()) {
               return false;
            } else if (!var5.isAir()) {
               var6.onBlockHarvested(var4, var1, var5, this.mc.player);
               FluidState var7 = var4.getFluidState(var1);
               boolean var8 = var4.setBlockState(var1, var7.getBlockState(), 11);
               if (var8) {
                  var6.onPlayerDestroy(var4, var1, var5);
               }

               return var8;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   public boolean clickBlock(BlockPos var1, Direction var2) {
      if (!this.mc.player.blockActionRestricted(this.mc.world, var1, this.currentGameType)) {
         if (!this.mc.world.getWorldBorder().contains(var1)) {
            return false;
         } else {
            if (!this.currentGameType.isCreative()) {
               if (!this.field31365 || !this.isHittingPosition(var1)) {
                  if (this.field31365) {
                     this.sendDiggingPacket(CPlayerDiggingPacket.Action.ABORT_DESTROY_BLOCK, this.field31360, var2);
                  }

                  BlockState var5 = this.mc.world.getBlockState(var1);
                  this.mc.getTutorial().method37026(this.mc.world, var1, var5, 0.0F);
                  this.sendDiggingPacket(CPlayerDiggingPacket.Action.START_DESTROY_BLOCK, var1, var2);
                  boolean var6 = !var5.isAir();
                  if (var6 && this.field31362 == 0.0F) {
                     var5.onBlockClicked(this.mc.world, var1, this.mc.player);
                  }

                  if (var6 && var5.method23406(this.mc.player, this.mc.player.world, var1) >= 1.0F) {
                     this.onPlayerDestroyBlock(var1);
                  } else {
                     this.field31365 = true;
                     this.field31360 = var1;
                     this.field31361 = this.mc.player.getHeldItemMainhand();
                     this.field31362 = 0.0F;
                     this.field31363 = 0.0F;
                     this.mc.world.sendBlockBreakProgress(this.mc.player.getEntityId(), this.field31360, (int)(this.field31362 * 10.0F) - 1);
                  }
               }
            } else {
               BlockState var7 = this.mc.world.getBlockState(var1);
               this.mc.getTutorial().method37026(this.mc.world, var1, var7, 1.0F);
               this.sendDiggingPacket(CPlayerDiggingPacket.Action.START_DESTROY_BLOCK, var1, var2);
               this.onPlayerDestroyBlock(var1);
               this.field31364 = 5;
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public void resetBlockRemoving() {
      if (this.field31365) {
         BlockState var3 = this.mc.world.getBlockState(this.field31360);
         this.mc.getTutorial().method37026(this.mc.world, this.field31360, var3, -1.0F);
         this.sendDiggingPacket(CPlayerDiggingPacket.Action.ABORT_DESTROY_BLOCK, this.field31360, Direction.DOWN);
         this.field31365 = false;
         this.field31362 = 0.0F;
         this.mc.world.sendBlockBreakProgress(this.mc.player.getEntityId(), this.field31360, -1);
         this.mc.player.resetCooldown();
      }
   }

   public boolean onPlayerDamageBlock(BlockPos var1, Direction var2) {
      this.syncCurrentPlayItem();
      if (this.field31364 <= 0) {
         if (this.currentGameType.isCreative() && this.mc.world.getWorldBorder().contains(var1)) {
            this.field31364 = 5;
            BlockState var7 = this.mc.world.getBlockState(var1);
            this.mc.getTutorial().method37026(this.mc.world, var1, var7, 1.0F);
            this.sendDiggingPacket(CPlayerDiggingPacket.Action.START_DESTROY_BLOCK, var1, var2);
            this.onPlayerDestroyBlock(var1);
            return true;
         } else if (!this.isHittingPosition(var1)) {
            return this.clickBlock(var1, var2);
         } else {
            BlockState var5 = this.mc.world.getBlockState(var1);
            if (!var5.isAir()) {
               this.field31362 = this.field31362 + var5.method23406(this.mc.player, this.mc.player.world, var1);
               if (this.field31363 % 4.0F == 0.0F) {
                  SoundType var6 = var5.getSoundType();
                  this.mc
                     .getSoundHandler()
                     .method1000(new MinecraftSoundManager(var6.method29715(), Class2266.field14732, (var6.getVolume() + 1.0F) / 8.0F, var6.method29711() * 0.5F, var1));
               }

               this.field31363++;
               this.mc.getTutorial().method37026(this.mc.world, var1, var5, MathHelper.clamp(this.field31362, 0.0F, 1.0F));
               if (this.field31362 >= 1.0F) {
                  this.field31365 = false;
                  this.sendDiggingPacket(CPlayerDiggingPacket.Action.STOP_DESTROY_BLOCK, var1, var2);
                  this.onPlayerDestroyBlock(var1);
                  this.field31362 = 0.0F;
                  this.field31363 = 0.0F;
                  this.field31364 = 5;
               }

               this.mc.world.sendBlockBreakProgress(this.mc.player.getEntityId(), this.field31360, (int)(this.field31362 * 10.0F) - 1);
               return true;
            } else {
               this.field31365 = false;
               return false;
            }
         }
      } else {
         this.field31364--;
         return true;
      }
   }

   /**
    * player reach distance = 4F
    */
   public float getBlockReachDistance() {
      return this.currentGameType.isCreative() ? 5.0F : 3.0F;
   }

   public void tick() {
      this.syncCurrentPlayItem();
      if (!this.connection.getNetworkManager().isChannelOpen()) {
         this.connection.getNetworkManager().handleDisconnection();
      } else {
         this.connection.getNetworkManager().tick();
      }
   }

   private boolean isHittingPosition(BlockPos var1) {
      ItemStack var4 = this.mc.player.getHeldItemMainhand();
      boolean var5 = this.field31361.isEmpty() && var4.isEmpty();
      if (!this.field31361.isEmpty() && !var4.isEmpty()) {
         var5 = var4.getItem() == this.field31361.getItem()
            && ItemStack.method32127(var4, this.field31361)
            && (var4.method32115() || var4.method32117() == this.field31361.method32117());
      }

      return var1.equals(this.field31360) && var5;
   }

   public void syncCurrentPlayItem() {
      int i = this.mc.player.inventory.currentItem;
      if (i != this.currentPlayerItem) {
         this.currentPlayerItem = i;
         this.connection.sendPacket(new CHeldItemChangePacket(this.currentPlayerItem));
      }
   }

   public ActionResultType func_217292_a(ClientPlayerEntity var1, ClientWorld var2, Hand var3, BlockRayTraceResult var4) {
      this.syncCurrentPlayItem();
      BlockPos var7 = var4.getPos();
      if (this.mc.world.getWorldBorder().contains(var7)) {
         ItemStack var8 = var1.getHeldItem(var3);
         if (this.currentGameType == GameType.SPECTATOR) {
            this.connection.sendPacket(new CPlayerTryUseItemOnBlockPacket(var3, var4));
            return ActionResultType.SUCCESS;
         } else {
            boolean var9 = !var1.getHeldItemMainhand().isEmpty() || !var1.getHeldItemOffhand().isEmpty();
            boolean var10 = var1.method2851() && var9;
            if (!var10) {
               ActionResultType var11 = var2.getBlockState(var7).onBlockActivated(var2, var1, var3, var4);
               if (var11.isSuccessOrConsume()) {
                  this.connection.sendPacket(new CPlayerTryUseItemOnBlockPacket(var3, var4));
                  return var11;
               }
            }

            this.connection.sendPacket(new CPlayerTryUseItemOnBlockPacket(var3, var4));
            if (!var8.isEmpty() && !var1.method2976().method19635(var8.getItem())) {
               ItemUseContext var14 = new ItemUseContext(var1, var3, var4);
               ActionResultType var12;
               if (!this.currentGameType.isCreative()) {
                  var12 = var8.onItemUse(var14);
               } else {
                  int var13 = var8.getCount();
                  var12 = var8.onItemUse(var14);
                  var8.setCount(var13);
               }

               return var12;
            } else {
               return ActionResultType.field14820;
            }
         }
      } else {
         return ActionResultType.FAIL;
      }
   }

   public ActionResultType processRightClick(PlayerEntity var1, World var2, Hand var3) {
      if (this.currentGameType != GameType.SPECTATOR) {
         this.syncCurrentPlayItem();
         this.connection.sendPacket(new CPlayerTryUseItemPacket(var3));
         ItemStack var6 = var1.getHeldItem(var3);
         if (!var1.method2976().method19635(var6.getItem())) {
            int var7 = var6.getCount();
            Class6794 var8 = var6.method32110(var2, var1, var3);
            ItemStack var9 = (ItemStack)var8.method20695();
            if (var9 != var6) {
               var1.setHeldItem(var3, var9);
            }

            return var8.method20694();
         } else {
            return ActionResultType.field14820;
         }
      } else {
         return ActionResultType.field14820;
      }
   }

   public ClientPlayerEntity createPlayer(ClientWorld var1, Class8286 var2, Class6943 var3) {
      return this.func_239167_a_(var1, var2, var3, false, false);
   }

   public ClientPlayerEntity func_239167_a_(ClientWorld var1, Class8286 var2, Class6943 var3, boolean var4, boolean var5) {
      return new ClientPlayerEntity(this.mc, var1, this.connection, var2, var3, var4, var5);
   }

   public void attackEntity(PlayerEntity var1, Entity var2) {
      this.syncCurrentPlayItem();
      this.connection.sendPacket(new CUseEntityPacket(var2, var1.isSneaking()));
      if (this.currentGameType != GameType.SPECTATOR) {
         var1.attackTargetEntityWithCurrentItem(var2);
         var1.resetCooldown();
      }
   }

   public ActionResultType interactWithEntity(PlayerEntity var1, Entity var2, Hand var3) {
      this.syncCurrentPlayItem();
      this.connection.sendPacket(new CUseEntityPacket(var2, var3, var1.isSneaking()));
      return this.currentGameType != GameType.SPECTATOR ? var1.interactOn(var2, var3) : ActionResultType.field14820;
   }

   public ActionResultType interactWithEntity(PlayerEntity var1, Entity var2, EntityRayTraceResult var3, Hand var4) {
      this.syncCurrentPlayItem();
      Vector3d var7 = var3.getHitVec().method11337(var2.getPosX(), var2.getPosY(), var2.getPosZ());
      this.connection.sendPacket(new CUseEntityPacket(var2, var4, var7, var1.isSneaking()));
      return this.currentGameType != GameType.SPECTATOR ? var2.applyPlayerInteraction(var1, var7, var4) : ActionResultType.field14820;
   }

   public ItemStack windowClick(int windowId, int slotId, int mouseButton, ClickType type, PlayerEntity player) {
      short short1 = player.openContainer.getNextTransactionID(player.inventory);
      ItemStack itemstack = player.openContainer.slotClick(slotId, mouseButton, type, player);
      this.connection.sendPacket(new CClickWindowPacket(windowId, slotId, mouseButton, type, itemstack, short1));
      return itemstack;
   }

   public void sendPlaceRecipePacket(int var1, IRecipe<?> var2, boolean var3) {
      this.connection.sendPacket(new CPlaceRecipePacket(var1, var2, var3));
   }

   public void sendEnchantPacket(int var1, int var2) {
      this.connection.sendPacket(new CEnchantItemPacket(var1, var2));
   }

   public void sendSlotPacket(ItemStack var1, int var2) {
      if (this.currentGameType.isCreative()) {
         this.connection.sendPacket(new CCreativeInventoryActionPacket(var2, var1));
      }
   }

   public void sendPacketDropItem(ItemStack var1) {
      if (this.currentGameType.isCreative() && !var1.isEmpty()) {
         this.connection.sendPacket(new CCreativeInventoryActionPacket(-1, var1));
      }
   }

   public void onStoppedUsingItem(PlayerEntity var1) {
      this.syncCurrentPlayItem();
      this.connection.sendPacket(new CPlayerDiggingPacket(CPlayerDiggingPacket.Action.RELEASE_USE_ITEM, BlockPos.ZERO, Direction.DOWN));
      var1.stopActiveHand();
   }

   public boolean gameIsSurvivalOrAdventure() {
      return this.currentGameType.method8158();
   }

   public boolean isNotCreative() {
      return !this.currentGameType.isCreative();
   }

   public boolean isInCreativeMode() {
      return this.currentGameType.isCreative();
   }

   public boolean extendedReach() {
      return this.currentGameType.isCreative();
   }

   public boolean isRidingHorse() {
      return this.mc.player.isPassenger() && this.mc.player.getRidingEntity() instanceof AbstractHorseEntity;
   }

   public boolean isSpectatorMode() {
      return this.currentGameType == GameType.SPECTATOR;
   }

   public GameType method23156() {
      return this.field31367;
   }

   public GameType getCurrentGameType() {
      return this.currentGameType;
   }

   public boolean getIsHittingBlock() {
      return this.field31365;
   }

   public void pickItem(int var1) {
      this.connection.sendPacket(new CPickItemPacket(var1));
   }

   private void sendDiggingPacket(CPlayerDiggingPacket.Action var1, BlockPos var2, Direction var3) {
      ClientPlayerEntity var6 = this.mc.player;
      this.field31368.put(Pair.of(var2, var1), var6.getPositionVec());
      this.connection.sendPacket(new CPlayerDiggingPacket(var1, var2, var3));
   }

   public void acknowledgePlayerDiggingReceived(ClientWorld var1, BlockPos var2, BlockState var3, CPlayerDiggingPacket.Action var4, boolean var5) {
      Vector3d var8 = (Vector3d)this.field31368.remove(Pair.of(var2, var4));
      BlockState var9 = var1.getBlockState(var2);
      if ((var8 == null || !var5 || var4 != CPlayerDiggingPacket.Action.START_DESTROY_BLOCK && var9 != var3) && var9 != var3) {
         var1.method6851(var2, var3);
         ClientPlayerEntity var10 = this.mc.player;
         if (var8 != null && var1 == var10.world && var10.func_242278_a(var2, var3)) {
            var10.method3270(var8.x, var8.y, var8.z);
         }
      }

      while (this.field31368.size() >= 50) {
         Pair var11 = (Pair)this.field31368.firstKey();
         this.field31368.removeFirst();
         field31357.error("Too many unacked block actions, dropping " + var11);
      }
   }
}
