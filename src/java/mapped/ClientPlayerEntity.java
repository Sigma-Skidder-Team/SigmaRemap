package mapped;

import com.google.common.collect.Lists;
import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.EventSlowDown;
import com.mentalfrostbyte.jello.util.player.Rots;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.network.play.ClientPlayNetHandler;
import net.minecraft.client.util.ClientRecipeBook;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.Pose;
import net.minecraft.entity.item.BoatEntity;
import net.minecraft.entity.item.minecart.AbstractMinecartEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.play.client.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.tileentity.CommandBlockTileEntity;
import net.minecraft.tileentity.JigsawTileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.ITextComponent;

import javax.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class ClientPlayerEntity extends AbstractClientPlayerEntity {
   private static String[] field6113;
   public final ClientPlayNetHandler connection;
   private final StatisticsManager stats;
   private final ClientRecipeBook recipeBook;
   private final List<IAmbientSoundHandler> ambientSoundHandlers = Lists.newArrayList();
   private int permissionLevel = 0;
   public double lastReportedPosX;
   public double lastReportedPosY;
   public double lastReportedPosZ;
   public float lastReportedYaw;
   public float lastReportedPitch;
   public boolean prevOnGround;
   private boolean isCrouching;
   private boolean clientSneakState;
   private boolean serverSprintState;
   private int positionUpdateTicks;
   private boolean hasValidHealth;
   private String serverBrand;
   public MovementInput movementInput;
   public final Minecraft mc;
   public int sprintToggleTimer;
   public int sprintingTicksLeft;
   public float renderArmYaw;
   public float renderArmPitch;
   public float prevRenderArmYaw;
   public float prevRenderArmPitch;
   private int horseJumpPowerCounter;
   public float horseJumpPower;
   public float timeInPortal;
   public float prevTimeInPortal;
   private boolean handActive;
   private Hand activeHand;
   private boolean rowingBoat;
   private boolean autoJumpEnabled = true;
   private int autoJumpTime;
   private boolean wasFallFlying;
   private int counterInWater;
   private boolean showDeathScreen = true;

   public ClientPlayerEntity(Minecraft var1, ClientWorld var2, ClientPlayNetHandler var3, StatisticsManager var4,
         ClientRecipeBook var5, boolean var6, boolean var7) {
      super(var2, var3.method15794());
      this.mc = var1;
      this.connection = var3;
      this.stats = var4;
      this.recipeBook = var5;
      this.clientSneakState = var6;
      this.serverSprintState = var7;
      this.ambientSoundHandlers.add(new Class8077(this, var1.getSoundHandler()));
      this.ambientSoundHandlers.add(new Class8080(this));
      this.ambientSoundHandlers.add(new Class8079(this, var1.getSoundHandler(), var2.getBiomeManager()));
   }

   @Override
   public boolean attackEntityFrom(DamageSource source, float var2) {
      return false;
   }

   @Override
   public void heal(float var1) {
   }

   @Override
   public boolean startRiding(Entity var1, boolean var2) {
      if (super.startRiding(var1, var2)) {
         if (var1 instanceof AbstractMinecartEntity) {
            this.mc.getSoundHandler().method1000(new Class6344(this, (AbstractMinecartEntity) var1));
         }

         if (var1 instanceof BoatEntity) {
            this.prevRotationYaw = var1.rotationYaw;
            this.rotationYaw = var1.rotationYaw;
            this.setRotationYawHead(var1.rotationYaw);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void dismount() {
      super.dismount();
      this.rowingBoat = false;
   }

   @Override
   public float getPitch(float partialTicks) {
      return this.rotationPitch;
   }

   @Override
   public float getYaw(float partialTicks) {
      return !this.isPassenger() ? this.rotationYaw : super.getYaw(partialTicks);
   }

   @Override
   public void tick() {
      if (this.world.isBlockLoaded(new BlockPos(this.getPosX(), 0.0, this.getPosZ()))) {
         super.tick();
         if (!this.isPassenger()) {
            this.onUpdateWalkingPlayer();
         } else {
            this.connection
                  .sendPacket(new CPlayerPacket.RotationPacket(this.rotationYaw, this.rotationPitch, this.onGround));
            this.connection.sendPacket(new CInputPacket(this.moveStrafing, this.moveForward, this.movementInput.jump,
                  this.movementInput.sneaking));
            Entity var3 = this.method3415();
            if (var3 != this && var3.canPassengerSteer()) {
               this.connection.sendPacket(new CMoveVehiclePacket(var3));
            }
         }

         for (IAmbientSoundHandler var4 : this.ambientSoundHandlers) {
            var4.tick();
         }
      }
   }

   public float method5387() {
      for (IAmbientSoundHandler var4 : this.ambientSoundHandlers) {
         if (var4 instanceof Class8079) {
            return ((Class8079) var4).method27949();
         }
      }

      return 0.0F;
   }

   public void onUpdateWalkingPlayer() {
      AxisAlignedBB bounds = this.getBoundingBox();
      EventUpdate eventItself = new EventUpdate(this.getPosX(), bounds.minY, this.getPosZ(), this.rotationPitch,
            this.rotationYaw, this.onGround);
      Client.getInstance().eventManager.call(eventItself);
      if (!eventItself.isCancelled()) {
         boolean var5 = this.isSprinting();
         if (var5 != this.serverSprintState) {
            CEntityActionPacket.Action var6 = !var5 ? CEntityActionPacket.Action.STOP_SPRINTING
                  : CEntityActionPacket.Action.START_SPRINTING;
            this.connection.sendPacket(new CEntityActionPacket(this, var6));
            this.serverSprintState = var5;
         }

         boolean var31 = this.isSneaking();
         if (var31 != this.clientSneakState) {
            CEntityActionPacket.Action var7 = !var31 ? CEntityActionPacket.Action.RELEASE_SHIFT_KEY
                  : CEntityActionPacket.Action.PRESS_SHIFT_KEY;
            this.connection.sendPacket(new CEntityActionPacket(this, var7));
            this.clientSneakState = var31;
         }

         if (this.isCurrentViewEntity()) {
            double var8 = eventItself.getX();
            double var10 = eventItself.getY();
            double var12 = eventItself.getZ();
            float eventItselfPitch = eventItself.getPitch();
            float eventItselfYaw = eventItself.getYaw() % 360.0F;
            boolean var16 = eventItself.onGround();
            double var17 = var8 - this.lastReportedPosX;
            double var19 = var10 - this.lastReportedPosY;
            double var21 = var12 - this.lastReportedPosZ;
            double fixatedYaw = (double) (eventItselfYaw - this.lastReportedYaw % 360.0F);
            double fixedatedPitch = (double) (eventItselfPitch - this.lastReportedPitch);
            this.positionUpdateTicks++;
            boolean isMoving = eventItself.isMoving() || var17 * var17 + var19 * var19 + var21 * var21 > 9.0E-4
                  || this.positionUpdateTicks >= 20;
            boolean isLooking = fixatedYaw != 0.0 || fixedatedPitch != 0.0;
            if (!this.isPassenger()) {
               if (isMoving && isLooking) {
                  this.connection.sendPacket(new CPlayerPacket.PositionRotationPacket(var8, var10, var12,
                        eventItselfYaw, eventItselfPitch, var16));
               } else if (!isMoving) {
                  if (!isLooking) {
                     if (this.prevOnGround != this.onGround) {
                        this.connection.sendPacket(new CPlayerPacket(var16));
                     }
                  } else {
                     this.connection
                           .sendPacket(new CPlayerPacket.RotationPacket(eventItselfYaw, eventItselfPitch, var16));
                  }
               } else {
                  this.connection.sendPacket(new CPlayerPacket.PositionPacket(var8, var10, var12, var16));
               }
            } else {
               Vector3d var29 = this.getMotion();
               this.connection.sendPacket(new CPlayerPacket.PositionRotationPacket(var29.x, -999.0, var29.z,
                     eventItselfYaw, eventItselfPitch, var16));
               isMoving = false;
            }

            if (isMoving) {
               this.lastReportedPosX = var8;
               this.lastReportedPosY = var10;
               this.lastReportedPosZ = var12;
               this.positionUpdateTicks = 0;
            }

            if (isLooking) {
               this.lastReportedYaw = eventItselfYaw;
               this.lastReportedPitch = eventItselfPitch;
            }

            this.prevOnGround = this.onGround;
            this.autoJumpEnabled = this.mc.gameSettings.field44610;
         }

         for (Runnable var30 : eventItself.getRunnableList()) {
            var30.run();
         }

         eventItself.postUpdate();
         Client.getInstance().eventManager.call(eventItself);
      }
   }

   @Override
   public Vector3d getLookVec() {
      return this.getLook(1.0F);
   }

   /**
    * interpolated look vector
    */
   @Override
   public Vector3d getLook(float partialTicks) {
      if (Rots.rotating)
         return getVectorForRotation(Rots.pitch, Rots.yaw);
      else
         return getVectorForRotation(rotationPitch, rotationYaw);
   }

   @Override
   public boolean drop(boolean var1) {
      CPlayerDiggingPacket.Action var4 = !var1 ? CPlayerDiggingPacket.Action.DROP_ITEM
            : CPlayerDiggingPacket.Action.DROP_ALL_ITEMS;
      this.connection.sendPacket(new CPlayerDiggingPacket(var4, BlockPos.ZERO, net.minecraft.util.Direction.DOWN));
      return this.inventory
            .decrStackSize(this.inventory.currentItem,
                  var1 && !this.inventory.method4028().isEmpty() ? this.inventory.method4028().getCount()
                        : 1) != ItemStack.EMPTY;
   }

   public void method5389(String var1) {
      this.connection.sendPacket(new CChatMessagePacket(var1));
   }

   @Override
   public void swingArm(Hand var1) {
      super.swingArm(var1);
      this.connection.sendPacket(new CAnimateHandPacket(var1));
   }

   @Override
   public void respawnPlayer() {
      this.connection.sendPacket(new CClientStatusPacket(CClientStatusPacket.State.field14277));
   }

   @Override
   public void damageEntity(DamageSource var1, float var2) {
      if (!this.isInvulnerableTo(var1)) {
         this.setHealth(this.getHealth() - var2);
      }
   }

   @Override
   public void method2772() {
      this.connection.sendPacket(new CCloseWindowPacket(this.openContainer.windowId));
      this.method5390();
   }

   public void method5390() {
      this.inventory.setItemStack(ItemStack.EMPTY);
      super.method2772();
      this.mc.displayGuiScreen((Screen) null);
   }

   public void method5391(float var1) {
      if (!this.hasValidHealth) {
         this.setHealth(var1);
         this.hasValidHealth = true;
      } else {
         float var4 = this.getHealth() - var1;
         if (!(var4 <= 0.0F)) {
            this.lastDamage = var4;
            this.setHealth(this.getHealth());
            this.hurtResistantTime = 20;
            this.damageEntity(DamageSource.field39005, var4);
            this.maxHurtTime = 10;
            this.hurtTime = this.maxHurtTime;
         } else {
            this.setHealth(var1);
            if (var4 < 0.0F) {
               this.hurtResistantTime = 10;
            }
         }
      }
   }

   @Override
   public void method2797() {
      this.connection.sendPacket(new CPlayerAbilitiesPacket(this.abilities));
   }

   @Override
   public boolean method2905() {
      return true;
   }

   @Override
   public boolean hasStoppedClimbing() {
      return !this.abilities.isFlying && super.hasStoppedClimbing();
   }

   @Override
   public boolean method3261() {
      return !this.abilities.isFlying && super.method3261();
   }

   @Override
   public boolean getMovementSpeed() {
      return !this.abilities.isFlying && super.getMovementSpeed();
   }

   public void method5392() {
      this.connection.sendPacket(new CEntityActionPacket(this, CEntityActionPacket.Action.START_RIDING_JUMP,
            MathHelper.floor(this.method5406() * 100.0F)));
   }

   public void sendHorseInventory() {
      this.connection.sendPacket(new CEntityActionPacket(this, CEntityActionPacket.Action.OPEN_INVENTORY));
   }

   public void method5394(String var1) {
      this.serverBrand = var1;
   }

   public String method5395() {
      return this.serverBrand;
   }

   public StatisticsManager method5396() {
      return this.stats;
   }

   public ClientRecipeBook getRecipeBook() {
      return this.recipeBook;
   }

   public void method5398(IRecipe<?> var1) {
      if (this.recipeBook.method21364(var1)) {
         this.recipeBook.method21365(var1);
         this.connection.sendPacket(new CMarkRecipeSeenPacket(var1));
      }
   }

   @Override
   public int method2807() {
      return this.permissionLevel;
   }

   public void method5399(int var1) {
      this.permissionLevel = var1;
   }

   @Override
   public void sendStatusMessage(ITextComponent var1, boolean var2) {
      if (!var2) {
         this.mc.ingameGUI.getChatGUI().sendChatMessage(var1);
      } else {
         this.mc.ingameGUI.method5985(var1, false);
      }
   }

   private void setPlayerOffsetMotion(double var1, double var3) {
      BlockPos var7 = new BlockPos(var1, this.getPosY(), var3);
      if (this.method5401(var7)) {
         double var8 = var1 - (double) var7.getX();
         double var10 = var3 - (double) var7.getZ();
         net.minecraft.util.Direction var12 = null;
         double var13 = Double.MAX_VALUE;
         net.minecraft.util.Direction[] var15 = new net.minecraft.util.Direction[] { net.minecraft.util.Direction.WEST,
               net.minecraft.util.Direction.EAST, net.minecraft.util.Direction.NORTH,
               net.minecraft.util.Direction.SOUTH };

         for (net.minecraft.util.Direction var19 : var15) {
            double var20 = var19.getAxis().getCoordinate(var8, 0.0, var10);
            double var22 = var19.getAxisDirection() != net.minecraft.util.Direction.AxisDirection.POSITIVE ? var20
                  : 1.0 - var20;
            if (var22 < var13 && !this.method5401(var7.offset(var19))) {
               var13 = var22;
               var12 = var19;
            }
         }

         if (var12 != null) {
            Vector3d var24 = this.getMotion();
            if (var12.getAxis() != Direction.Axis.X) {
               this.setMotion(var24.x, var24.y, 0.1 * (double) var12.getZOffset());
            } else {
               this.setMotion(0.1 * (double) var12.getXOffset(), var24.y, var24.z);
            }
         }
      }
   }

   private boolean method5401(BlockPos var1) {
      AxisAlignedBB var4 = this.getBoundingBox();
      AxisAlignedBB var5 = new AxisAlignedBB(
            (double) var1.getX(),
            var4.minY,
            (double) var1.getZ(),
            (double) var1.getX() + 1.0,
            var4.maxY,
            (double) var1.getZ() + 1.0)
            .shrink(1.0E-7);
      return !this.world.func_242405_a(this, var5, (var1x, var2) -> var1x.method23437(this.world, var2));
   }

   @Override
   public void setSprinting(boolean var1) {
      super.setSprinting(var1);
      this.sprintingTicksLeft = 0;
   }

   public void method5402(float var1, int var2, int var3) {
      this.experience = var1;
      this.experienceTotal = var2;
      this.experienceLevel = var3;
   }

   @Override
   public void sendMessage(ITextComponent var1, UUID var2) {
      this.mc.ingameGUI.getChatGUI().sendChatMessage(var1);
   }

   @Override
   public void handleStatusUpdate(byte var1) {
      if (var1 >= 24 && var1 <= 28) {
         this.method5399(var1 - 24);
      } else {
         super.handleStatusUpdate(var1);
      }
   }

   public void method5403(boolean var1) {
      this.showDeathScreen = var1;
   }

   public boolean isShowDeathScreen() {
      return this.showDeathScreen;
   }

   @Override
   public void playSound(SoundEvent var1, float var2, float var3) {
      this.world.playSound(this.getPosX(), this.getPosY(), this.getPosZ(), var1, this.getSoundCategory(), var2, var3,
            false);
   }

   @Override
   public void method2834(SoundEvent var1, SoundCategory var2, float var3, float var4) {
      this.world.playSound(this.getPosX(), this.getPosY(), this.getPosZ(), var1, var2, var3, var4, false);
   }

   @Override
   public boolean isServerWorld() {
      return true;
   }

   @Override
   public void setActiveHand(Hand var1) {
      ItemStack var4 = this.getHeldItem(var1);
      if (!var4.isEmpty() && !this.isHandActive()) {
         super.setActiveHand(var1);
         this.handActive = true;
         this.activeHand = var1;
      }
   }

   @Override
   public boolean isHandActive() {
      return this.handActive;
   }

   @Override
   public void resetActiveHand() {
      super.resetActiveHand();
      this.handActive = false;
   }

   @Override
   public Hand getActiveHand() {
      return this.activeHand;
   }

   @Override
   public void notifyDataManagerChange(DataParameter<?> var1) {
      super.notifyDataManagerChange(var1);
      if (LIVING_FLAGS.equals(var1)) {
         boolean var4 = (this.dataManager.<Byte>method35445(LIVING_FLAGS) & 1) > 0;
         Hand var5 = (this.dataManager.<Byte>method35445(LIVING_FLAGS) & 2) <= 0 ? Hand.MAIN_HAND : Hand.OFF_HAND;
         if (var4 && !this.handActive) {
            this.setActiveHand(var5);
         } else if (!var4 && this.handActive) {
            this.resetActiveHand();
         }
      }

      if (FLAGS.equals(var1) && this.isElytraFlying() && !this.wasFallFlying) {
         this.mc.getSoundHandler().method1000(new Class6343(this));
      }
   }

   public boolean method5405() {
      Entity var3 = this.getRidingEntity();
      return this.isPassenger() && var3 instanceof IJumpingMount && ((IJumpingMount) var3).canJump();
   }

   public float method5406() {
      return this.horseJumpPower;
   }

   @Override
   public void method2764(Class954 var1) {
      this.mc.displayGuiScreen(new Class831(var1));
   }

   @Override
   public void method2890(CommandBlockLogic var1) {
      this.mc.displayGuiScreen(new Class1327(var1));
   }

   @Override
   public void method2770(CommandBlockTileEntity var1) {
      this.mc.displayGuiScreen(new Class1326(var1));
   }

   @Override
   public void method2891(Class964 var1) {
      this.mc.displayGuiScreen(new Class1148(var1));
   }

   @Override
   public void method2892(JigsawTileEntity var1) {
      this.mc.displayGuiScreen(new Class1321(var1));
   }

   @Override
   public void method2769(ItemStack var1, Hand var2) {
      Item var5 = var1.getItem();
      if (var5 == Items.field38047) {
         this.mc.displayGuiScreen(new Class828(this, var1, var2));
      }
   }

   @Override
   public void onCriticalHit(Entity var1) {
      this.mc.particles.addParticleEmitter(var1, ParticleTypes.CRIT);
   }

   @Override
   public void onEnchantmentCritical(Entity var1) {
      this.mc.particles.addParticleEmitter(var1, ParticleTypes.ENCHANTED_HIT);
   }

   @Override
   public boolean isSneaking() {
      return this.movementInput != null && this.movementInput.sneaking;
   }

   @Override
   public boolean isCrouching() {
      return this.isCrouching;
   }

   public boolean method5407() {
      return this.isCrouching() || this.method3338();
   }

   @Override
   public void updateEntityActionState() {
      super.updateEntityActionState();
      if (this.isCurrentViewEntity()) {
         this.moveStrafing = this.movementInput.moveStrafe;
         this.moveForward = this.movementInput.moveForward;
         this.isJumping = this.movementInput.jump;
         this.prevRenderArmYaw = this.renderArmYaw;
         this.prevRenderArmPitch = this.renderArmPitch;
         this.renderArmPitch = (float) ((double) this.renderArmPitch
               + (double) (this.rotationPitch - this.renderArmPitch) * 0.5);
         this.renderArmYaw = (float) ((double) this.renderArmYaw
               + (double) (this.rotationYaw - this.renderArmYaw) * 0.5);
      }
   }

   public boolean isCurrentViewEntity() {
      return this.mc.getRenderViewEntity() == this;
   }

   @Override
   public void livingTick() {
      this.sprintingTicksLeft++;
      if (this.sprintToggleTimer > 0) {
         this.sprintToggleTimer--;
      }

      this.method5409();
      boolean var3 = this.movementInput.jump;
      boolean var4 = this.movementInput.sneaking;
      boolean var5 = this.method5415();
      this.isCrouching = !this.abilities.isFlying
            && !this.isSwimming()
            && this.isPoseClear(Pose.field13624)
            && (this.isSneaking() || !this.isSleeping() && !this.isPoseClear(Pose.STANDING));
      this.movementInput.tickMovement(this.method5407());
      this.mc.getTutorial().method37023(this.movementInput);
      if (this.isHandActive() && !this.isPassenger()) {
         EventSlowDown var6 = new EventSlowDown(0.2F);
         Client.getInstance().eventManager.call(var6);
         if (!var6.isCancelled()) {
            this.movementInput.moveStrafe = this.movementInput.moveStrafe * var6.getSlowDown();
            this.movementInput.moveForward = this.movementInput.moveForward * var6.getSlowDown();
            this.sprintToggleTimer = 0;
         }
      }

      boolean var10 = false;
      if (this.autoJumpTime > 0) {
         this.autoJumpTime--;
         var10 = true;
         this.movementInput.jump = true;
      }

      if (!this.noClip) {
         this.setPlayerOffsetMotion(this.getPosX() - (double) this.getWidth() * 0.35,
               this.getPosZ() + (double) this.getWidth() * 0.35);
         this.setPlayerOffsetMotion(this.getPosX() - (double) this.getWidth() * 0.35,
               this.getPosZ() - (double) this.getWidth() * 0.35);
         this.setPlayerOffsetMotion(this.getPosX() + (double) this.getWidth() * 0.35,
               this.getPosZ() - (double) this.getWidth() * 0.35);
         this.setPlayerOffsetMotion(this.getPosX() + (double) this.getWidth() * 0.35,
               this.getPosZ() + (double) this.getWidth() * 0.35);
      }

      if (var4) {
         this.sprintToggleTimer = 0;
      }

      boolean var7 = (float) this.getFoodStats().getFoodLevel() > 6.0F || this.abilities.allowFlying;
      if ((this.onGround || this.canSwim())
            && !var4
            && !var5
            && this.method5415()
            && !this.isSprinting()
            && var7
            && !this.isHandActive()
            && !this.isPotionActive(Effects.BLINDNESS)) {
         if (this.sprintToggleTimer <= 0 && !this.mc.gameSettings.keyBindSprint.isKeyDown()) {
            this.sprintToggleTimer = 7;
         } else {
            this.setSprinting(true);
         }
      }

      if (!this.isSprinting()
            && (!this.isInWater() || this.canSwim())
            && this.method5415()
            && var7
            && !this.isHandActive()
            && !this.isPotionActive(Effects.BLINDNESS)
            && this.mc.gameSettings.keyBindSprint.isKeyDown()) {
         this.setSprinting(true);
      }

      if (this.isSprinting()) {
         boolean var8 = !this.movementInput.isMovingForward() || !var7;
         boolean var9 = var8 || this.collidedHorizontally || this.isInWater() && !this.canSwim();
         if (!this.isSwimming()) {
            if (var9) {
               this.setSprinting(false);
            }
         } else if (!this.onGround && !this.movementInput.sneaking && var8 || !this.isInWater()) {
            this.setSprinting(false);
         }
      }

      boolean var11 = false;
      if (this.abilities.allowFlying) {
         if (!this.mc.playerController.isSpectatorMode()) {
            if (!var3 && this.movementInput.jump && !var10) {
               if (this.flyToggleTimer != 0) {
                  if (!this.isSwimming()) {
                     this.abilities.isFlying = !this.abilities.isFlying;
                     var11 = true;
                     this.method2797();
                     this.flyToggleTimer = 0;
                  }
               } else {
                  this.flyToggleTimer = 7;
               }
            }
         } else if (!this.abilities.isFlying) {
            this.abilities.isFlying = true;
            var11 = true;
            this.method2797();
         }
      }

      if (this.movementInput.jump && !var11 && !var3 && !this.abilities.isFlying && !this.isPassenger()
            && !this.isOnLadder()) {
         ItemStack var12 = this.getItemStackFromSlot(EquipmentSlotType.CHEST);
         if (var12.getItem() == Items.ELYTRA && Class3256.method11698(var12) && this.tryToStartFallFlying()) {
            this.connection.sendPacket(new CEntityActionPacket(this, CEntityActionPacket.Action.START_FALL_FLYING));
         }
      }

      this.wasFallFlying = this.isElytraFlying();
      if (this.isInWater() && this.movementInput.sneaking && this.func_241208_cS_()) {
         this.handleFluidSneak();
      }

      if (!this.areEyesInFluid(FluidTags.WATER)) {
         if (this.counterInWater > 0) {
            this.areEyesInFluid(FluidTags.WATER);
            this.counterInWater = MathHelper.clamp(this.counterInWater - 10, 0, 600);
         }
      } else {
         int var13 = !this.isSpectator() ? 1 : 10;
         this.counterInWater = MathHelper.clamp(this.counterInWater + var13, 0, 600);
      }

      if (this.abilities.isFlying && this.isCurrentViewEntity()) {
         int var14 = 0;
         if (this.movementInput.sneaking) {
            var14--;
         }

         if (this.movementInput.jump) {
            var14++;
         }

         if (var14 != 0) {
            this.setMotion(
                  this.getMotion().add(0.0, (double) ((float) var14 * this.abilities.getFlySpeed() * 3.0F), 0.0));
         }
      }

      if (!this.method5405()) {
         this.horseJumpPower = 0.0F;
      } else {
         IJumpingMount var15 = (IJumpingMount) this.getRidingEntity();
         if (this.horseJumpPowerCounter < 0) {
            this.horseJumpPowerCounter++;
            if (this.horseJumpPowerCounter == 0) {
               this.horseJumpPower = 0.0F;
            }
         }

         if (var3 && !this.movementInput.jump) {
            this.horseJumpPowerCounter = -10;
            var15.method4966(MathHelper.floor(this.method5406() * 100.0F));
            this.method5392();
         } else if (!var3 && this.movementInput.jump) {
            this.horseJumpPowerCounter = 0;
            this.horseJumpPower = 0.0F;
         } else if (var3) {
            this.horseJumpPowerCounter++;
            if (this.horseJumpPowerCounter >= 10) {
               this.horseJumpPower = 0.8F + 2.0F / (float) (this.horseJumpPowerCounter - 9) * 0.1F;
            } else {
               this.horseJumpPower = (float) this.horseJumpPowerCounter * 0.1F;
            }
         }
      }

      super.livingTick();
      if (this.onGround && this.abilities.isFlying && !this.mc.playerController.isSpectatorMode()) {
         this.abilities.isFlying = false;
         this.method2797();
      }
   }

   private void method5409() {
      this.prevTimeInPortal = this.timeInPortal;
      if (!this.inPortal) {
         if (this.isPotionActive(Effects.NAUSEA) && this.getActivePotionEffect(Effects.NAUSEA).getDuration() > 60) {
            this.timeInPortal += 0.006666667F;
            if (this.timeInPortal > 1.0F) {
               this.timeInPortal = 1.0F;
            }
         } else {
            if (this.timeInPortal > 0.0F) {
               this.timeInPortal -= 0.05F;
            }

            if (this.timeInPortal < 0.0F) {
               this.timeInPortal = 0.0F;
            }
         }
      } else {
         if (this.mc.currentScreen != null && !this.mc.currentScreen.isPauseScreen()) {
            if (this.mc.currentScreen instanceof ContainerScreen) {
               this.method2772();
            }

            this.mc.displayGuiScreen((Screen) null);
         }

         if (this.timeInPortal == 0.0F) {
            this.mc.getSoundHandler().method1000(MinecraftSoundManager.method19296(SoundEvents.field26978,
                  this.rand.nextFloat() * 0.4F + 0.8F, 0.25F));
         }

         this.timeInPortal += 0.0125F;
         if (this.timeInPortal >= 1.0F) {
            this.timeInPortal = 1.0F;
         }

         this.inPortal = false;
      }

      this.decrementTimeUntilPortal();
   }

   @Override
   public void updateRidden() {
      super.updateRidden();
      this.rowingBoat = false;
      if (this.getRidingEntity() instanceof BoatEntity) {
         BoatEntity var3 = (BoatEntity) this.getRidingEntity();
         var3.method4173(this.movementInput.leftKeyDown, this.movementInput.rightKeyDown,
               this.movementInput.forwardKeyDown, this.movementInput.backKeyDown);
         this.rowingBoat = this.rowingBoat | (this.movementInput.leftKeyDown || this.movementInput.rightKeyDown
               || this.movementInput.forwardKeyDown || this.movementInput.backKeyDown);
      }
   }

   public boolean isRowingBoat() {
      return this.rowingBoat;
   }

   @Nullable
   @Override
   public EffectInstance removeActivePotionEffect(Effect var1) {
      if (var1 == Effects.NAUSEA) {
         this.prevTimeInPortal = 0.0F;
         this.timeInPortal = 0.0F;
      }

      return super.removeActivePotionEffect(var1);
   }

   @Override
   public void move(MoverType var1, Vector3d var2) {
      double var5 = this.getPosX();
      double var7 = this.getPosZ();
      super.move(var1, var2);
      this.updateAutoJump((float) (this.getPosX() - var5), (float) (this.getPosZ() - var7));
   }

   public boolean method5411() {
      return this.autoJumpEnabled;
   }

   public void updateAutoJump(float var1, float var2) {
      if (this.method5413()) {
         Vector3d var5 = this.getPositionVec();
         Vector3d var6 = var5.add((double) var1, 0.0, (double) var2);
         Vector3d var7 = new Vector3d((double) var1, 0.0, (double) var2);
         float var8 = this.getAIMoveSpeed();
         float var9 = (float) var7.lengthSquared();
         if (var9 <= 0.001F) {
            Vector2f var10 = this.movementInput.getMoveVector();
            float var11 = var8 * var10.x;
            float var12 = var8 * var10.y;
            float var13 = MathHelper.sin(this.rotationYaw * (float) (Math.PI / 180.0));
            float var14 = MathHelper.cos(this.rotationYaw * (float) (Math.PI / 180.0));
            var7 = new Vector3d((double) (var11 * var14 - var12 * var13), var7.y,
                  (double) (var12 * var14 + var11 * var13));
            var9 = (float) var7.lengthSquared();
            if (var9 <= 0.001F) {
               return;
            }
         }

         float var42 = MathHelper.method37815(var9);
         Vector3d var43 = var7.scale((double) var42);
         Vector3d var44 = this.getForward();
         float var45 = (float) (var44.x * var43.x + var44.z * var43.z);
         if (!(var45 < -0.15F)) {
            ISelectionContext var46 = ISelectionContext.forEntity(this);
            BlockPos var15 = new BlockPos(this.getPosX(), this.getBoundingBox().maxY, this.getPosZ());
            BlockState var16 = this.world.getBlockState(var15);
            if (var16.getCollisionShape(this.world, var15, var46).isEmpty()) {
               var15 = var15.up();
               BlockState var17 = this.world.getBlockState(var15);
               if (var17.getCollisionShape(this.world, var15, var46).isEmpty()) {
                  float var18 = 7.0F;
                  float var19 = 1.2F;
                  if (this.isPotionActive(Effects.JUMP_BOOST)) {
                     var19 += (float) (this.getActivePotionEffect(Effects.JUMP_BOOST).getAmplifier() + 1) * 0.75F;
                  }

                  float var20 = Math.max(var8 * 7.0F, 1.0F / var42);
                  Vector3d var21 = var6.add(var43.scale((double) var20));
                  float var22 = this.getWidth();
                  float var23 = this.getHeight();
                  AxisAlignedBB var24 = new AxisAlignedBB(var5, var21.add(0.0, (double) var23, 0.0))
                        .grow((double) var22, 0.0, (double) var22);
                  Vector3d var25 = var5.add(0.0, 0.51F, 0.0);
                  var21 = var21.add(0.0, 0.51F, 0.0);
                  Vector3d var26 = var43.method11335(new Vector3d(0.0, 1.0, 0.0));
                  Vector3d var27 = var26.scale((double) (var22 * 0.5F));
                  Vector3d var28 = var25.subtract(var27);
                  Vector3d var29 = var21.subtract(var27);
                  Vector3d var30 = var25.add(var27);
                  Vector3d var31 = var21.add(var27);
                  Iterator var32 = this.world.func_234867_d_(this, var24, var0 -> true)
                        .<AxisAlignedBB>flatMap(var0 -> var0.method19521().stream()).iterator();
                  float var33 = Float.MIN_VALUE;

                  while (var32.hasNext()) {
                     AxisAlignedBB var34 = (AxisAlignedBB) var32.next();
                     if (var34.intersects(var28, var29) || var34.intersects(var30, var31)) {
                        var33 = (float) var34.maxY;
                        Vector3d var35 = var34.getCenter();
                        BlockPos var36 = new BlockPos(var35);

                        for (int var37 = 1; (float) var37 < var19; var37++) {
                           BlockPos var38 = var36.up(var37);
                           BlockState var39 = this.world.getBlockState(var38);
                           VoxelShape var40;
                           if (!(var40 = var39.getCollisionShape(this.world, var38, var46)).isEmpty()) {
                              var33 = (float) var40.getEnd(Direction.Axis.Y) + (float) var38.getY();
                              if ((double) var33 - this.getPosY() > (double) var19) {
                                 return;
                              }
                           }

                           if (var37 > 1) {
                              var15 = var15.up();
                              BlockState var41 = this.world.getBlockState(var15);
                              if (!var41.getCollisionShape(this.world, var15, var46).isEmpty()) {
                                 return;
                              }
                           }
                        }
                        break;
                     }
                  }

                  if (var33 != Float.MIN_VALUE) {
                     float var49 = (float) ((double) var33 - this.getPosY());
                     if (!(var49 <= 0.5F) && !(var49 > var19)) {
                        this.autoJumpTime = 1;
                     }
                  }
               }
            }
         }
      }
   }

   private boolean method5413() {
      return this.method5411()
            && this.autoJumpTime <= 0
            && this.onGround
            && !this.method2853()
            && !this.isPassenger()
            && this.method5414()
            && (double) this.getJumpFactor() >= 1.0;
   }

   private boolean method5414() {
      Vector2f var3 = this.movementInput.getMoveVector();
      return var3.x != 0.0F || var3.y != 0.0F;
   }

   private boolean method5415() {
      double var3 = 0.8;
      return !this.canSwim() ? (double) this.movementInput.moveForward >= 0.8 : this.movementInput.isMovingForward();
   }

   public float method5416() {
      if (this.areEyesInFluid(FluidTags.WATER)) {
         float var3 = 600.0F;
         float var4 = 100.0F;
         if (!((float) this.counterInWater >= 600.0F)) {
            float var5 = MathHelper.clamp((float) this.counterInWater / 100.0F, 0.0F, 1.0F);
            float var6 = !((float) this.counterInWater < 100.0F)
                  ? MathHelper.clamp(((float) this.counterInWater - 100.0F) / 500.0F, 0.0F, 1.0F)
                  : 0.0F;
            return var5 * 0.6F + var6 * 0.39999998F;
         } else {
            return 1.0F;
         }
      } else {
         return 0.0F;
      }
   }

   @Override
   public boolean canSwim() {
      return this.eyesInWaterPlayer;
   }

   @Override
   public boolean method2854() {
      boolean var3 = this.eyesInWaterPlayer;
      boolean var4 = super.method2854();
      if (!this.isSpectator()) {
         if (!var3 && var4) {
            this.world.playSound(this.getPosX(), this.getPosY(), this.getPosZ(), SoundEvents.field26329,
                  SoundCategory.field14736, 1.0F, 1.0F, false);
            this.mc.getSoundHandler().method1000(new Class6342(this));
         }

         if (var3 && !var4) {
            this.world.playSound(this.getPosX(), this.getPosY(), this.getPosZ(), SoundEvents.field26330,
                  SoundCategory.field14736, 1.0F, 1.0F, false);
         }

         return this.eyesInWaterPlayer;
      } else {
         return this.eyesInWaterPlayer;
      }
   }

   @Override
   public Vector3d getLeashPosition(float var1) {
      if (!this.mc.gameSettings.getPointOfView().func_243192_a()) {
         return super.getLeashPosition(var1);
      } else {
         float var4 = MathHelper.lerp(var1 * 0.5F, this.rotationYaw, this.prevRotationYaw) * (float) (Math.PI / 180.0);
         float var5 = MathHelper.lerp(var1 * 0.5F, this.rotationPitch, this.prevRotationPitch)
               * (float) (Math.PI / 180.0);
         double var6 = this.getPrimaryHand() != HandSide.RIGHT ? 1.0 : -1.0;
         Vector3d var8 = new Vector3d(0.39 * var6, -0.6, 0.3);
         return var8.method11350(-var5).method11351(-var4).add(this.getEyePosition(var1));
      }
   }
}
