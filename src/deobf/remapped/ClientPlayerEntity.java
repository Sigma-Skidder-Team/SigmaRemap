package remapped;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

import net.minecraft.util.text.ITextComponent;

public class ClientPlayerEntity extends AbstractClientPlayerEntity {
   private static String[] field_30536;
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
   public final MinecraftClient client;
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

   public ClientPlayerEntity(MinecraftClient mc, ClientWorld world, ClientPlayNetHandler var3, StatisticsManager var4, ClientRecipeBook var5, boolean var6, boolean var7) {
      super(world, var3.getGameProfile());
      this.client = mc;
      this.connection = var3;
      this.stats = var4;
      this.recipeBook = var5;
      this.clientSneakState = var6;
      this.serverSprintState = var7;
      this.ambientSoundHandlers.add(new UnderwaterAmbientSoundHandler(this, mc.getSoundHandler()));
      this.ambientSoundHandlers.add(new BubbleColumnAmbientSoundHandler(this));
      this.ambientSoundHandlers.add(new BiomeSoundHandler(this, mc.getSoundHandler(), world.getBiomeManager()));
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      return false;
   }

   @Override
   public void heal(float var1) {
   }

   @Override
   public boolean startRiding(Entity entityIn, boolean force) {
      if (super.startRiding(entityIn, force)) {
         if (entityIn instanceof AbstractMinecartEntity) {
            this.client.getSoundHandler().play(new RidingMinecartTickableSound(this, (AbstractMinecartEntity)entityIn));
         }

         if (entityIn instanceof BoatEntity) {
            this.prevRotationYaw = entityIn.rotationYaw;
            this.rotationYaw = entityIn.rotationYaw;
            this.setRotationYawHead(entityIn.rotationYaw);
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
   public float getPitch(float var1) {
      return this.rotationPitch;
   }

   @Override
   public float getYaw(float var1) {
      return !this.isPassenger() ? this.rotationYaw : super.getYaw(var1);
   }

   @Override
   public void method_37123() {
      if (this.world.isBlockLoaded(new BlockPos(this.getPosX(), 0.0, this.getPosZ()))) {
         super.method_37123();
         if (!this.isPassenger()) {
            this.onUpdateWalkingPlayer();
         } else {
            this.connection.sendPacket(new RotationPacket(this.rotationYaw, this.rotationPitch, this.onGround));
            this.connection.sendPacket(new CInputPacket(this.field_29676, this.field_29673, this.movementInput.field_45284, this.movementInput.field_45289));
            Entity var3 = this.getLowestRidingEntity();
            if (var3 != this && var3.canPassengerSteer()) {
               this.connection.sendPacket(new CMoveVehiclePacket(var3));
            }
         }

         for (IAmbientSoundHandler var4 : this.ambientSoundHandlers) {
            var4.tick();
         }
      }
   }

   public float method_27306() {
      for (IAmbientSoundHandler var4 : this.ambientSoundHandlers) {
         if (var4 instanceof BiomeSoundHandler) {
            return ((BiomeSoundHandler)var4).method_31088();
         }
      }

      return 0.0F;
   }

   public void method_27305() {
      class_4092 var3 = this.getBoundingBox();
      class_1393 var4 = new class_1393(this.method_37302(), var3.field_19937, this.method_37156(), this.rotationPitch, this.rotationYaw, this.field_41726);
      SigmaMainClass.getInstance().getEventManager().call(var4);

      if (!var4.method_29716()) {
         boolean var5 = this.method_37321();
         if (var5 != this.serverSprintState) {
            Action var6 = !var5 ? Action.START_SPRINTING : Action.STOP_SPRINTING;
            this.connection.sendPacket(new class_2317(this, var6));
            this.serverSprintState = var5;
         }

         boolean flag3 = this.isSneaking();
         if (flag3 != this.clientSneakState) {
            Action centityactionpacket$action1 = !flag3 ? Action.PRESS_SHIFT_KEY : Action.RELEASE_SHIFT_KEY;
            this.connection.sendPacket(new class_2317(this, centityactionpacket$action1));
            this.clientSneakState = flag3;
         }

         if (this.method_27308()) {
            double var8 = var4.method_6450();
            double var10 = var4.method_6454();
            double var12 = var4.method_6438();
            float var14 = var4.method_6439();
            float var15 = var4.method_6442() % 360.0F;
            boolean var16 = var4.method_6446();
            double var17 = var8 - this.lastReportedPosX;
            double var19 = var10 - this.lastReportedPosY;
            double var21 = var12 - this.lastReportedPosZ;
            double var23 = (double)(var15 - this.lastReportedYaw % 360.0F);
            double var25 = (double)(var14 - this.lastReportedPitch);
            this.positionUpdateTicks++;
            boolean var27 = var4.method_6452() || var17 * var17 + var19 * var19 + var21 * var21 > 9.0E-4 || this.positionUpdateTicks >= 20;
            boolean var28 = var23 != 0.0 || var25 != 0.0;
            if (!this.isPassenger()) {
               if (var27 && var28) {
                  this.connection.sendPacket(new class_1514(var8, var10, var12, var15, var14, var16));
               } else if (!var27) {
                  if (!var28) {
                     if (this.prevOnGround != this.onGround || class_3347.method_15348() == class_412.field_1747) {
                        this.connection.sendPacket(new class_4609(var16));
                     }
                  } else {
                     this.connection.sendPacket(new RotationPacket(var15, var14, var16));
                  }
               } else {
                  this.connection.sendPacket(new class_9515(var8, var10, var12, var16));
               }
            } else {
               class_1343 var29 = this.method_37098();
               this.connection.sendPacket(new class_1514(var29.field_7336, -999.0, var29.field_7334, var15, var14, var16));
               var27 = false;
            }

            if (var27) {
               this.lastReportedPosX = var8;
               this.lastReportedPosY = var10;
               this.lastReportedPosZ = var12;
               this.positionUpdateTicks = 0;
            }

            if (var28) {
               this.lastReportedYaw = var15;
               this.lastReportedPitch = var14;
            }

            this.prevOnGround = this.onGround;
            this.autoJumpEnabled = this.client.gameOptions.field_45412;
         }

         for (Runnable var30 : var4.method_6447()) {
            var30.run();
         }

         var4.method_6440();
         SigmaMainClass.getInstance().getEventManager().call(var4);
      }
   }

   @Override
   public boolean method_3235(boolean var1) {
      class_7500 var4 = !var1 ? class_7500.field_38266 : class_7500.field_38265;
      this.connection.sendPacket(new class_1586(var4, BlockPos.field_7306, Direction.field_802));
      return this.inventory
            .method_31497(
               this.inventory.field_36404, var1 && !this.inventory.method_32403().method_28022() ? this.inventory.method_32403().method_27997() : 1
            )
         != ItemStack.EMPTY;
   }

   public void method_27307(String var1) {
      this.connection.sendPacket(new class_3211(var1));
   }

   @Override
   public void method_26597(Hand var1) {
      super.method_26597(var1);
      this.connection.sendPacket(new class_3195(var1));
   }

   @Override
   public void method_3205() {
      this.connection.sendPacket(new class_8559(class_2105.field_10549));
   }

   @Override
   public void method_26574(DamageSource var1, float var2) {
      if (!this.method_37180(var1)) {
         this.method_26456(this.method_26551() - var2);
      }
   }

   @Override
   public void method_3207() {
      this.connection.sendPacket(new class_1194(this.field_3874.field_19925));
      this.method_27327();
   }

   public void method_27327() {
      this.inventory.method_32408(ItemStack.EMPTY);
      super.method_3207();
      this.client.method_8609((Screen)null);
   }

   public void method_27310(float var1) {
      if (!this.hasValidHealth) {
         this.method_26456(var1);
         this.hasValidHealth = true;
      } else {
         float var4 = this.method_26551() - var1;
         if (!(var4 <= 0.0F)) {
            this.field_29601 = var4;
            this.method_26456(this.method_26551());
            this.field_41749 = 20;
            this.method_26574(DamageSource.field_31664, var4);
            this.field_29662 = 10;
            this.field_29645 = this.field_29662;
         } else {
            this.method_26456(var1);
            if (var4 < 0.0F) {
               this.field_41749 = 10;
            }
         }
      }
   }

   @Override
   public void method_3216() {
      this.connection.sendPacket(new class_9808(this.playerAbilities));
   }

   @Override
   public boolean method_3183() {
      return true;
   }

   @Override
   public boolean method_26492() {
      return !this.playerAbilities.isFlying && super.method_26492();
   }

   @Override
   public boolean method_37374() {
      return !this.playerAbilities.isFlying && super.method_37374();
   }

   @Override
   public boolean method_26412() {
      return !this.playerAbilities.isFlying && super.method_26412();
   }

   public void method_27321() {
      this.connection.sendPacket(new class_2317(this, Action.field_20103, MathHelper.floor(this.method_27313() * 100.0F)));
   }

   public void method_27311() {
      this.connection.sendPacket(new class_2317(this, Action.field_20101));
   }

   public void method_27315(String var1) {
      this.serverBrand = var1;
   }

   public String method_27309() {
      return this.serverBrand;
   }

   public StatisticsManager method_27331() {
      return this.stats;
   }

   public ClientRecipeBook method_27334() {
      return this.recipeBook;
   }

   public void method_27326(class_8932<?> var1) {
      if (this.recipeBook.method_5081(var1)) {
         this.recipeBook.method_5088(var1);
         this.connection.sendPacket(new class_6074(var1));
      }
   }

   @Override
   public int method_37352() {
      return this.permissionLevel;
   }

   public void method_27330(int var1) {
      this.permissionLevel = var1;
   }

   @Override
   public void method_3251(ITextComponent var1, boolean var2) {
      if (!var2) {
         this.client.field_9614.method_13991().method_18676(var1);
      } else {
         this.client.field_9614.method_13982(var1, false);
      }
   }

   private void method_27324(double var1, double var3) {
      BlockPos var7 = new BlockPos(var1, this.method_37309(), var3);
      if (this.method_27312(var7)) {
         double var8 = var1 - (double)var7.getX();
         double var10 = var3 - (double)var7.getZ();
         Direction var12 = null;
         double var13 = Double.MAX_VALUE;
         Direction[] var15 = new Direction[]{Direction.field_809, Direction.field_804, Direction.field_818, Direction.field_800};

         for (Direction var19 : var15) {
            double var20 = var19.method_1029().method_42630(var8, 0.0, var10);
            double var22 = var19.method_1049() != class_137.field_405 ? var20 : 1.0 - var20;
            if (var22 < var13 && !this.method_27312(var7.method_6098(var19))) {
               var13 = var22;
               var12 = var19;
            }
         }

         if (var12 != null) {
            class_1343 var24 = this.method_37098();
            if (var12.method_1029() != class_9249.field_47215) {
               this.method_37214(var24.field_7336, var24.field_7333, 0.1 * (double)var12.method_1034());
            } else {
               this.method_37214(0.1 * (double)var12.method_1041(), var24.field_7333, var24.field_7334);
            }
         }
      }
   }

   private boolean method_27312(BlockPos var1) {
      Box var4 = this.getBoundingBox();
      Box var5 = new Box(
            (double)var1.getX(),
            var4.field_19937,
            (double)var1.getZ(),
            (double)var1.getX() + 1.0,
            var4.field_19939,
            (double)var1.getZ() + 1.0
         )
         .method_18924(1.0E-7);
      return !this.world.method_6670(this, var5, (var1x, var2) -> var1x.method_8313(this.world, var2));
   }

   @Override
   public void method_37140(boolean var1) {
      super.method_37140(var1);
      this.sprintingTicksLeft = 0;
   }

   public void method_27314(float var1, int var2, int var3) {
      this.field_3842 = var1;
      this.field_3862 = var2;
      this.field_3840 = var3;
   }

   @Override
   public void method_26286(ITextComponent var1, UUID var2) {
      this.client.field_9614.method_13991().method_18676(var1);
   }

   @Override
   public void method_37336(byte var1) {
      if (var1 >= 24 && var1 <= 28) {
         this.method_27330(var1 - 24);
      } else {
         super.method_37336(var1);
      }
   }

   public void method_27333(boolean var1) {
      this.showDeathScreen = var1;
   }

   public boolean method_27329() {
      return this.showDeathScreen;
   }

   @Override
   public void method_37155(SoundEvent var1, float var2, float var3) {
      this.world.method_29527(this.getPosX(), this.method_37309(), this.getPosZ(), var1, this.method_37197(), var2, var3, false);
   }

   @Override
   public void method_3172(SoundEvent var1, class_562 var2, float var3, float var4) {
      this.world.method_29527(this.getPosX(), this.method_37309(), this.getPosZ(), var1, var2, var3, var4, false);
   }

   @Override
   public boolean method_26530() {
      return true;
   }

   @Override
   public void method_26462(Hand var1) {
      ItemStack var4 = this.method_26617(var1);
      if (!var4.method_28022() && !this.method_26554()) {
         super.method_26462(var1);
         this.handActive = true;
         this.activeHand = var1;
      }
   }

   @Override
   public boolean method_26554() {
      return this.handActive;
   }

   @Override
   public void method_26529() {
      super.method_26529();
      this.handActive = false;
   }

   @Override
   public Hand method_26500() {
      return this.activeHand;
   }

   @Override
   public void method_37191(class_7821<?> var1) {
      super.method_37191(var1);
      if (field_29638.equals(var1)) {
         boolean var4 = (this.field_41735.<Byte>method_36640(field_29638) & 1) > 0;
         Hand var5 = (this.field_41735.<Byte>method_36640(field_29638) & 2) <= 0 ? Hand.MAIN_HAND : Hand.OFF_HAND;
         if (var4 && !this.handActive) {
            this.method_26462(var5);
         } else if (!var4 && this.handActive) {
            this.method_26529();
         }
      }

      if (field_41770.equals(var1) && this.method_26618() && !this.wasFallFlying) {
         this.client.getSoundHandler().play(new class_7854(this));
      }
   }

   public boolean isRidingHorse() {
      Entity var3 = this.getRidingEntity();
      return this.isPassenger() && var3 instanceof class_9766 && ((class_9766)var3).method_45066();
   }

   public float method_27313() {
      return this.horseJumpPower;
   }

   @Override
   public void method_3244(class_8398 var1) {
      this.client.method_8609(new class_5904(var1));
   }

   @Override
   public void method_3243(class_8116 var1) {
      this.client.method_8609(new class_4348(var1));
   }

   @Override
   public void method_3193(class_7454 var1) {
      this.client.method_8609(new class_7808(var1));
   }

   @Override
   public void method_3218(class_945 var1) {
      this.client.method_8609(new class_5445(var1));
   }

   @Override
   public void method_3201(class_6786 var1) {
      this.client.method_8609(new class_3391(var1));
   }

   @Override
   public void method_3174(ItemStack var1, Hand var2) {
      class_2451 var5 = var1.method_27960();
      if (var5 == class_4897.field_24805) {
         this.client.method_8609(new class_4047(this, var1, var2));
      }
   }

   @Override
   public void method_3233(Entity var1) {
      this.client.field_9572.method_43051(var1, class_3090.field_15322);
   }

   @Override
   public void method_3226(Entity var1) {
      this.client.field_9572.method_43051(var1, class_3090.field_15360);
   }

   @Override
   public boolean isSneaking() {
      return this.movementInput != null && this.movementInput.field_45289;
   }

   @Override
   public boolean method_37382() {
      return this.isCrouching;
   }

   public boolean method_27323() {
      return this.method_37382() || this.method_37290();
   }

   @Override
   public void method_26417() {
      super.method_26417();
      if (this.method_27308()) {
         this.field_29676 = this.movementInput.field_45282;
         this.field_29673 = this.movementInput.field_45287;
         this.field_29654 = this.movementInput.field_45284;
         this.prevRenderArmYaw = this.renderArmYaw;
         this.prevRenderArmPitch = this.renderArmPitch;
         this.renderArmPitch = (float)((double)this.renderArmPitch + (double)(this.rotationPitch - this.renderArmPitch) * 0.5);
         this.renderArmYaw = (float)((double)this.renderArmYaw + (double)(this.rotationYaw - this.renderArmYaw) * 0.5);
      }
   }

   public boolean method_27308() {
      return this.client.getRenderViewEntity() == this;
   }

   @Override
   public void livingTick() {
      this.sprintingTicksLeft++;
      if (this.sprintToggleTimer > 0) {
         this.sprintToggleTimer--;
      }

      this.method_27318();
      boolean var3 = this.movementInput.field_45284;
      boolean var4 = this.movementInput.field_45289;
      boolean var5 = this.method_27319();
      this.isCrouching = !this.playerAbilities.isFlying
         && !this.method_37113()
         && this.method_37115(class_7653.field_38881)
         && (this.isSneaking() || !this.method_26507() && !this.method_37115(class_7653.field_38885));
      this.movementInput.method_40743(this.method_27323());
      this.client.method_8531().method_40529(this.movementInput);
      if (this.method_26554() && !this.isPassenger()) {
         class_3920 var6 = new class_3920(0.2F);
         SigmaMainClass.getInstance().getEventManager().call(var6);
         if (!var6.method_29716()) {
            this.movementInput.field_45282 = this.movementInput.field_45282 * var6.method_18145();
            this.movementInput.field_45287 = this.movementInput.field_45287 * var6.method_18145();
            this.sprintToggleTimer = 0;
         }
      }

      boolean var10 = false;
      if (this.autoJumpTime > 0) {
         this.autoJumpTime--;
         var10 = true;
         this.movementInput.field_45284 = true;
      }

      if (!this.field_41731) {
         this.method_27324(this.getPosX() - (double)this.method_37086() * 0.35, this.getPosZ() + (double)this.method_37086() * 0.35);
         this.method_27324(this.getPosX() - (double)this.method_37086() * 0.35, this.getPosZ() - (double)this.method_37086() * 0.35);
         this.method_27324(this.getPosX() + (double)this.method_37086() * 0.35, this.getPosZ() - (double)this.method_37086() * 0.35);
         this.method_27324(this.getPosX() + (double)this.method_37086() * 0.35, this.getPosZ() + (double)this.method_37086() * 0.35);
      }

      if (var4) {
         this.sprintToggleTimer = 0;
      }

      boolean var7 = (float)this.method_3161().method_42238() > 6.0F || this.playerAbilities.allowFlying;
      if ((this.onGround || this.method_37179())
         && !var4
         && !var5
         && this.method_27319()
         && !this.method_37321()
         && var7
         && !this.method_26554()
         && !this.isPotionActive(Effects.field_19736)) {
         if (this.sprintToggleTimer <= 0 && !this.client.gameOptions.keySprint.isKeyDown()) {
            this.sprintToggleTimer = 7;
         } else {
            this.method_37140(true);
         }
      }

      if (!this.method_37321()
         && (!this.method_37285() || this.method_37179())
         && this.method_27319()
         && var7
         && !this.method_26554()
         && !this.isPotionActive(Effects.field_19736)
         && this.client.gameOptions.keySprint.isKeyDown()) {
         this.method_37140(true);
      }

      if (this.method_37321()) {
         boolean var8 = !this.movementInput.method_40744() || !var7;
         boolean var9 = var8 || this.collidedHorizontally || this.method_37285() && !this.method_37179();
         if (!this.method_37113()) {
            if (var9) {
               this.method_37140(false);
            }
         } else if (!this.onGround && !this.movementInput.field_45289 && var8 || !this.method_37285()) {
            this.method_37140(false);
         }
      }

      boolean var11 = false;
      if (this.playerAbilities.allowFlying) {
         if (!this.client.playerController.method_42153()) {
            if (!var3 && this.movementInput.field_45284 && !var10) {
               if (this.field_3877 != 0) {
                  if (!this.method_37113()) {
                     this.playerAbilities.isFlying = !this.playerAbilities.isFlying;
                     var11 = true;
                     this.method_3216();
                     this.field_3877 = 0;
                  }
               } else {
                  this.field_3877 = 7;
               }
            }
         } else if (!this.playerAbilities.isFlying) {
            this.playerAbilities.isFlying = true;
            var11 = true;
            this.method_3216();
         }
      }

      if (this.movementInput.field_45284 && !var11 && !var3 && !this.playerAbilities.isFlying && !this.isPassenger() && !this.method_26505()) {
         ItemStack var12 = this.method_26520(class_6943.field_35708);
         if (var12.method_27960() == class_4897.field_24503 && class_3286.method_15061(var12) && this.method_3190()) {
            this.connection.sendPacket(new class_2317(this, Action.field_20093));
         }
      }

      this.wasFallFlying = this.method_26618();
      if (this.method_37285() && this.movementInput.field_45289 && this.method_26498()) {
         this.method_26411();
      }

      if (!this.method_37261(class_6503.field_33094)) {
         if (this.counterInWater > 0) {
            this.method_37261(class_6503.field_33094);
            this.counterInWater = MathHelper.clamp(this.counterInWater - 10, 0, 600);
         }
      } else {
         int var13 = !this.method_37221() ? 1 : 10;
         this.counterInWater = MathHelper.clamp(this.counterInWater + var13, 0, 600);
      }

      if (this.playerAbilities.isFlying && this.method_27308()) {
         int var14 = 0;
         if (this.movementInput.field_45289) {
            var14--;
         }

         if (this.movementInput.field_45284) {
            var14++;
         }

         if (var14 != 0) {
            this.method_37215(this.method_37098().method_6214(0.0, (double)((float)var14 * this.playerAbilities.getFlySpeed() * 3.0F), 0.0));
         }
      }

      if (!this.isRidingHorse()) {
         this.horseJumpPower = 0.0F;
      } else {
         class_9766 var15 = (class_9766)this.getRidingEntity();
         if (this.horseJumpPowerCounter < 0) {
            this.horseJumpPowerCounter++;
            if (this.horseJumpPowerCounter == 0) {
               this.horseJumpPower = 0.0F;
            }
         }

         if (var3 && !this.movementInput.field_45284) {
            this.horseJumpPowerCounter = -10;
            var15.method_45069(MathHelper.floor(this.method_27313() * 100.0F));
            this.method_27321();
         } else if (!var3 && this.movementInput.field_45284) {
            this.horseJumpPowerCounter = 0;
            this.horseJumpPower = 0.0F;
         } else if (var3) {
            this.horseJumpPowerCounter++;
            if (this.horseJumpPowerCounter >= 10) {
               this.horseJumpPower = 0.8F + 2.0F / (float)(this.horseJumpPowerCounter - 9) * 0.1F;
            } else {
               this.horseJumpPower = (float)this.horseJumpPowerCounter * 0.1F;
            }
         }
      }

      super.livingTick();
      if (this.onGround && this.playerAbilities.isFlying && !this.client.playerController.method_42153()) {
         this.playerAbilities.isFlying = false;
         this.method_3216();
      }
   }

   private void method_27318() {
      this.prevTimeInPortal = this.timeInPortal;
      if (!this.field_41772) {
         if (this.isPotionActive(Effects.NAUSEA) && this.method_26553(Effects.NAUSEA).method_10347() > 60) {
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
         if (this.client.field_9623 != null && !this.client.field_9623.method_1161()) {
            if (this.client.field_9623 instanceof class_2208) {
               this.method_3207();
            }

            this.client.method_8609((Screen)null);
         }

         if (this.timeInPortal == 0.0F) {
            this.client.getSoundHandler().play(class_4949.method_22680(SoundEvents.field_2846, this.field_41717.nextFloat() * 0.4F + 0.8F, 0.25F));
         }

         this.timeInPortal += 0.0125F;
         if (this.timeInPortal >= 1.0F) {
            this.timeInPortal = 1.0F;
         }

         this.field_41772 = false;
      }

      this.method_37263();
   }

   @Override
   public void method_37189() {
      super.method_37189();
      this.rowingBoat = false;
      if (this.getRidingEntity() instanceof BoatEntity) {
         BoatEntity var3 = (BoatEntity)this.getRidingEntity();
         var3.method_42093(this.movementInput.field_45283, this.movementInput.field_45286, this.movementInput.field_45288, this.movementInput.field_45290);
         this.rowingBoat = this.rowingBoat
            | (this.movementInput.field_45283 || this.movementInput.field_45286 || this.movementInput.field_45288 || this.movementInput.field_45290);
      }
   }

   public boolean method_27320() {
      return this.rowingBoat;
   }

   @Nullable
   @Override
   public class_2250 method_26421(class_1425 var1) {
      if (var1 == Effects.NAUSEA) {
         this.prevTimeInPortal = 0.0F;
         this.timeInPortal = 0.0F;
      }

      return super.method_26421(var1);
   }

   @Override
   public void method_37226(class_7412 var1, class_1343 var2) {
      double var5 = this.getPosX();
      double var7 = this.getPosZ();
      super.method_37226(var1, var2);
      this.method_27316((float)(this.getPosX() - var5), (float)(this.getPosZ() - var7));
   }

   public boolean method_27322() {
      return this.autoJumpEnabled;
   }

   public void method_27316(float var1, float var2) {
      if (this.method_27325()) {
         class_1343 var5 = this.method_37245();
         class_1343 var6 = var5.method_6214((double)var1, 0.0, (double)var2);
         class_1343 var7 = new class_1343((double)var1, 0.0, (double)var2);
         float var8 = this.method_26423();
         float var9 = (float)var7.method_6221();
         if (var9 <= 0.001F) {
            class_4895 var10 = this.movementInput.method_40746();
            float var11 = var8 * var10.field_24326;
            float var12 = var8 * var10.field_24329;
            float var13 = MathHelper.sin(this.rotationYaw * (float) (Math.PI / 180.0));
            float var14 = MathHelper.cos(this.rotationYaw * (float) (Math.PI / 180.0));
            var7 = new class_1343((double)(var11 * var14 - var12 * var13), var7.field_7333, (double)(var12 * var14 + var11 * var13));
            var9 = (float)var7.method_6221();
            if (var9 <= 0.001F) {
               return;
            }
         }

         float var42 = MathHelper.fastInvSqrt(var9);
         class_1343 var43 = var7.method_6209((double)var42);
         class_1343 var44 = this.method_37129();
         float var45 = (float)(var44.field_7336 * var43.field_7336 + var44.field_7334 * var43.field_7334);
         if (!(var45 < -0.15F)) {
            class_214 var46 = class_214.method_926(this);
            BlockPos var15 = new BlockPos(this.getPosX(), this.getBoundingBox().field_19939, this.getPosZ());
            class_2522 var16 = this.world.method_28262(var15);
            if (var16.method_8325(this.world, var15, var46).method_19485()) {
               var15 = var15.method_6081();
               class_2522 var17 = this.world.method_28262(var15);
               if (var17.method_8325(this.world, var15, var46).method_19485()) {
                  float var18 = 7.0F;
                  float var19 = 1.2F;
                  if (this.isPotionActive(Effects.field_19730)) {
                     var19 += (float)(this.method_26553(Effects.field_19730).method_10333() + 1) * 0.75F;
                  }

                  float var20 = Math.max(var8 * 7.0F, 1.0F / var42);
                  class_1343 var21 = var6.method_6215(var43.method_6209((double)var20));
                  float var22 = this.method_37086();
                  float var23 = this.method_37074();
                  Box var24 = new Box(var5, var21.method_6214(0.0, (double)var23, 0.0)).method_18899((double)var22, 0.0, (double)var22);
                  class_1343 var25 = var5.method_6214(0.0, 0.51F, 0.0);
                  var21 = var21.method_6214(0.0, 0.51F, 0.0);
                  class_1343 var26 = var43.method_6196(new class_1343(0.0, 1.0, 0.0));
                  class_1343 var27 = var26.method_6209((double)(var22 * 0.5F));
                  class_1343 var28 = var25.method_6194(var27);
                  class_1343 var29 = var21.method_6194(var27);
                  class_1343 var30 = var25.method_6215(var27);
                  class_1343 var31 = var21.method_6215(var27);
                  Iterator var32 = this.world.method_6676(this, var24, var0 -> true).<Box>flatMap(var0 -> var0.method_19492().stream()).iterator();
                  float var33 = Float.MIN_VALUE;

                  while (var32.hasNext()) {
                     Box var34 = (Box)var32.next();
                     if (var34.method_18908(var28, var29) || var34.method_18908(var30, var31)) {
                        var33 = (float)var34.field_19939;
                        class_1343 var35 = var34.method_18926();
                        BlockPos var36 = new BlockPos(var35);

                        for (int var37 = 1; (float)var37 < var19; var37++) {
                           BlockPos var38 = var36.method_6082(var37);
                           class_2522 var39 = this.world.method_28262(var38);
                           class_4190 var40;
                           if (!(var40 = var39.method_8325(this.world, var38, var46)).method_19485()) {
                              var33 = (float)var40.method_19495(class_9249.field_47216) + (float)var38.getY();
                              if ((double)var33 - this.method_37309() > (double)var19) {
                                 return;
                              }
                           }

                           if (var37 > 1) {
                              var15 = var15.method_6081();
                              class_2522 var41 = this.world.method_28262(var15);
                              if (!var41.method_8325(this.world, var15, var46).method_19485()) {
                                 return;
                              }
                           }
                        }
                        break;
                     }
                  }

                  if (var33 != Float.MIN_VALUE) {
                     float var49 = (float)((double)var33 - this.method_37309());
                     if (!(var49 <= 0.5F) && !(var49 > var19)) {
                        this.autoJumpTime = 1;
                     }
                  }
               }
            }
         }
      }
   }

   private boolean method_27325() {
      return this.method_27322()
         && this.autoJumpTime <= 0
         && this.onGround
         && !this.method_3178()
         && !this.isPassenger()
         && this.method_27332()
         && (double)this.method_37281() >= 1.0;
   }

   private boolean method_27332() {
      class_4895 var3 = this.movementInput.method_40746();
      return var3.field_24326 != 0.0F || var3.field_24329 != 0.0F;
   }

   private boolean method_27319() {
      double var3 = 0.8;
      return !this.method_37179() ? (double)this.movementInput.field_45287 >= 0.8 : this.movementInput.method_40744();
   }

   public float method_27328() {
      if (this.method_37261(class_6503.field_33094)) {
         float var3 = 600.0F;
         float var4 = 100.0F;
         if (!((float)this.counterInWater >= 600.0F)) {
            float var5 = MathHelper.clamp((float)this.counterInWater / 100.0F, 0.0F, 1.0F);
            float var6 = !((float)this.counterInWater < 100.0F) ? MathHelper.clamp(((float)this.counterInWater - 100.0F) / 500.0F, 0.0F, 1.0F) : 0.0F;
            return var5 * 0.6F + var6 * 0.39999998F;
         } else {
            return 1.0F;
         }
      } else {
         return 0.0F;
      }
   }

   @Override
   public boolean method_37179() {
      return this.field_3850;
   }

   @Override
   public boolean method_3192() {
      boolean var3 = this.field_3850;
      boolean var4 = super.method_3192();
      if (!this.method_37221()) {
         if (!var3 && var4) {
            this.world
               .method_29527(this.getPosX(), this.method_37309(), this.getPosZ(), SoundEvents.field_2053, class_562.field_3325, 1.0F, 1.0F, false);
            this.client.getSoundHandler().play(new class_5211(this));
         }

         if (var3 && !var4) {
            this.world
               .method_29527(this.getPosX(), this.method_37309(), this.getPosZ(), SoundEvents.field_2030, class_562.field_3325, 1.0F, 1.0F, false);
         }

         return this.field_3850;
      } else {
         return this.field_3850;
      }
   }

   @Override
   public class_1343 method_37202(float var1) {
      if (!this.client.gameOptions.getPointOfView().method_42383()) {
         return super.method_37202(var1);
      } else {
         float var4 = MathHelper.lerp(var1 * 0.5F, this.rotationYaw, this.prevRotationYaw) * (float) (Math.PI / 180.0);
         float var5 = MathHelper.lerp(var1 * 0.5F, this.rotationPitch, this.field_41762) * (float) (Math.PI / 180.0);
         double var6 = this.method_26432() != class_1736.field_8943 ? 1.0 : -1.0;
         class_1343 var8 = new class_1343(0.39 * var6, -0.6, 0.3);
         return var8.method_6212(-var5).method_6192(-var4).method_6215(this.method_37335(var1));
      }
   }
}
