package mapped;

import com.google.common.collect.Lists;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4408;
import com.mentalfrostbyte.jello.unmapped.Class8005;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.Pose;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;

import javax.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class ClientPlayerEntity extends AbstractClientPlayerEntity {
   private static String[] field6113;
   public final ClientPlayNetHandler connection;
   private final Class8286 field6115;
   private final Class6943 field6116;
   private final List<IAmbientSoundHandler> field6117 = Lists.newArrayList();
   private int field6118 = 0;
   public double field6119;
   public double field6120;
   public double field6121;
   public float field6122;
   public float field6123;
   public boolean field6124;
   private boolean field6125;
   private boolean field6126;
   private boolean field6127;
   private int field6128;
   private boolean field6129;
   private String field6130;
   public MovementInput field6131;
   public final Minecraft field6132;
   public int field6133;
   public int field6134;
   public float field6135;
   public float field6136;
   public float field6137;
   public float field6138;
   private int field6139;
   public float field6140;
   public float field6141;
   public float field6142;
   private boolean field6143;
   private Hand field6144;
   private boolean field6145;
   private boolean field6146 = true;
   private int field6147;
   private boolean field6148;
   private int field6149;
   private boolean field6150 = true;

   public ClientPlayerEntity(Minecraft var1, ClientWorld var2, ClientPlayNetHandler var3, Class8286 var4, Class6943 var5, boolean var6, boolean var7) {
      super(var2, var3.method15794());
      this.field6132 = var1;
      this.connection = var3;
      this.field6115 = var4;
      this.field6116 = var5;
      this.field6126 = var6;
      this.field6127 = var7;
      this.field6117.add(new Class8077(this, var1.getSoundHandler()));
      this.field6117.add(new Class8080(this));
      this.field6117.add(new Class8079(this, var1.getSoundHandler(), var2.getBiomeManager()));
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      return false;
   }

   @Override
   public void method3041(float var1) {
   }

   @Override
   public boolean method2758(Entity var1, boolean var2) {
      if (super.method2758(var1, var2)) {
         if (var1 instanceof AbstractMinecartEntity) {
            this.field6132.getSoundHandler().method1000(new Class6344(this, (AbstractMinecartEntity)var1));
         }

         if (var1 instanceof BoatEntity) {
            this.prevRotationYaw = var1.rotationYaw;
            this.rotationYaw = var1.rotationYaw;
            this.method3143(var1.rotationYaw);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method2895() {
      super.method2895();
      this.field6145 = false;
   }

   @Override
   public float method3282(float var1) {
      return this.rotationPitch;
   }

   @Override
   public float method3136(float var1) {
      return !this.isPassenger() ? this.rotationYaw : super.method3136(var1);
   }

   @Override
   public void tick() {
      if (this.world.method7017(new BlockPos(this.getPosX(), 0.0, this.getPosZ()))) {
         super.tick();
         if (!this.isPassenger()) {
            this.onUpdateWalkingPlayer();
         } else {
            this.connection.sendPacket(new Class5606(this.rotationYaw, this.rotationPitch, this.onGround));
            this.connection.sendPacket(new CInputPacket(this.field4982, this.field4984, this.field6131.field43913, this.field6131.field43914));
            Entity var3 = this.method3415();
            if (var3 != this && var3.method3418()) {
               this.connection.sendPacket(new CMoveVehiclePacket(var3));
            }
         }

         for (IAmbientSoundHandler var4 : this.field6117) {
            var4.tick();
         }
      }
   }

   public float method5387() {
      for (IAmbientSoundHandler var4 : this.field6117) {
         if (var4 instanceof Class8079) {
            return ((Class8079)var4).method27949();
         }
      }

      return 0.0F;
   }

   public void onUpdateWalkingPlayer() {
      AxisAlignedBB var3 = this.getBoundingBox();
      Class4399 var4 = new Class4399(this.getPosX(), var3.field28450, this.getPosZ(), this.rotationPitch, this.rotationYaw, this.onGround);
      Client.getInstance().getEventManager().call(var4);
      if (!var4.isCancelled()) {
         boolean var5 = this.method3337();
         if (var5 != this.field6127) {
            Class1865 var6 = !var5 ? Class1865.field10044 : Class1865.field10043;
            this.connection.sendPacket(new CEntityActionPacket(this, var6));
            this.field6127 = var5;
         }

         boolean var31 = this.method3331();
         if (var31 != this.field6126) {
            Class1865 var7 = !var31 ? Class1865.field10041 : Class1865.field10040;
            this.connection.sendPacket(new CEntityActionPacket(this, var7));
            this.field6126 = var31;
         }

         if (this.isCurrentViewEntity()) {
            double var8 = var4.method13909();
            double var10 = var4.method13911();
            double var12 = var4.method13913();
            float var14 = var4.method13915();
            float var15 = var4.method13917() % 360.0F;
            boolean var16 = var4.method13919();
            double var17 = var8 - this.field6119;
            double var19 = var10 - this.field6120;
            double var21 = var12 - this.field6121;
            double var23 = (double)(var15 - this.field6122 % 360.0F);
            double var25 = (double)(var14 - this.field6123);
            this.field6128++;
            boolean var27 = var4.method13907() || var17 * var17 + var19 * var19 + var21 * var21 > 9.0E-4 || this.field6128 >= 20;
            boolean var28 = var23 != 0.0 || var25 != 0.0;
            if (!this.isPassenger()) {
               if (var27 && var28) {
                  this.connection.sendPacket(new Class5604(var8, var10, var12, var15, var14, var16));
               } else if (!var27) {
                  if (!var28) {
                     if (this.field6124 != this.onGround || Class8005.method27372() == Class5989.field26129) {
                        this.connection.sendPacket(new CPlayerPacket(var16));
                     }
                  } else {
                     this.connection.sendPacket(new Class5606(var15, var14, var16));
                  }
               } else {
                  this.connection.sendPacket(new Class5605(var8, var10, var12, var16));
               }
            } else {
               Vector3d var29 = this.method3433();
               this.connection.sendPacket(new Class5604(var29.x, -999.0, var29.z, var15, var14, var16));
               var27 = false;
            }

            if (var27) {
               this.field6119 = var8;
               this.field6120 = var10;
               this.field6121 = var12;
               this.field6128 = 0;
            }

            if (var28) {
               this.field6122 = var15;
               this.field6123 = var14;
            }

            this.field6124 = this.onGround;
            this.field6146 = this.field6132.gameSettings.field44610;
         }

         for (Runnable var30 : var4.method13923()) {
            var30.run();
         }

         var4.method13906();
         Client.getInstance().getEventManager().call(var4);
      }
   }

   @Override
   public boolean drop(boolean var1) {
      CPlayerDiggingPacket.Action var4 = !var1 ? CPlayerDiggingPacket.Action.field13488 : CPlayerDiggingPacket.Action.field13487;
      this.connection.sendPacket(new CPlayerDiggingPacket(var4, BlockPos.ZERO, Direction.DOWN));
      return this.inventory
            .method3619(this.inventory.currentItem, var1 && !this.inventory.method4028().isEmpty() ? this.inventory.method4028().getCount() : 1)
         != ItemStack.EMPTY;
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
      this.connection.sendPacket(new CClientStatusPacket(CClientStatusPacketState.field14277));
   }

   @Override
   public void method2888(Class8654 var1, float var2) {
      if (!this.method2760(var1)) {
         this.method3043(this.getHealth() - var2);
      }
   }

   @Override
   public void method2772() {
      this.connection.sendPacket(new CCloseWindowPacket(this.field4905.field25471));
      this.method5390();
   }

   public void method5390() {
      this.inventory.method4056(ItemStack.EMPTY);
      super.method2772();
      this.field6132.displayGuiScreen((Screen)null);
   }

   public void method5391(float var1) {
      if (!this.field6129) {
         this.method3043(var1);
         this.field6129 = true;
      } else {
         float var4 = this.getHealth() - var1;
         if (!(var4 <= 0.0F)) {
            this.field4980 = var4;
            this.method3043(this.getHealth());
            this.hurtResistantTime = 20;
            this.method2888(Class8654.field39005, var4);
            this.field4953 = 10;
            this.field4952 = this.field4953;
         } else {
            this.method3043(var1);
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
   public boolean method3164() {
      return !this.abilities.field29607 && super.method3164();
   }

   @Override
   public boolean method3261() {
      return !this.abilities.field29607 && super.method3261();
   }

   @Override
   public boolean method3001() {
      return !this.abilities.field29607 && super.method3001();
   }

   public void method5392() {
      this.connection.sendPacket(new CEntityActionPacket(this, Class1865.field10045, MathHelper.method37767(this.method5406() * 100.0F)));
   }

   public void sendHorseInventory() {
      this.connection.sendPacket(new CEntityActionPacket(this, Class1865.field10047));
   }

   public void method5394(String var1) {
      this.field6130 = var1;
   }

   public String method5395() {
      return this.field6130;
   }

   public Class8286 method5396() {
      return this.field6115;
   }

   public Class6943 method5397() {
      return this.field6116;
   }

   public void method5398(Class4843<?> var1) {
      if (this.field6116.method21364(var1)) {
         this.field6116.method21365(var1);
         this.connection.sendPacket(new CMarkRecipeSeenPacket(var1));
      }
   }

   @Override
   public int method2807() {
      return this.field6118;
   }

   public void method5399(int var1) {
      this.field6118 = var1;
   }

   @Override
   public void sendStatusMessage(ITextComponent var1, boolean var2) {
      if (!var2) {
         this.field6132.ingameGUI.getChatGUI().method5930(var1);
      } else {
         this.field6132.ingameGUI.method5985(var1, false);
      }
   }

   private void setPlayerOffsetMotion(double var1, double var3) {
      BlockPos var7 = new BlockPos(var1, this.getPosY(), var3);
      if (this.method5401(var7)) {
         double var8 = var1 - (double)var7.getX();
         double var10 = var3 - (double)var7.getZ();
         Direction var12 = null;
         double var13 = Double.MAX_VALUE;
         Direction[] var15 = new Direction[]{Direction.WEST, Direction.EAST, Direction.NORTH, Direction.SOUTH};

         for (Direction var19 : var15) {
            double var20 = var19.method544().method328(var8, 0.0, var10);
            double var22 = var19.method535() != Class1892.field11092 ? var20 : 1.0 - var20;
            if (var22 < var13 && !this.method5401(var7.method8349(var19))) {
               var13 = var22;
               var12 = var19;
            }
         }

         if (var12 != null) {
            Vector3d var24 = this.method3433();
            if (var12.method544() != Class113.field413) {
               this.method3435(var24.x, var24.y, 0.1 * (double)var12.method541());
            } else {
               this.method3435(0.1 * (double)var12.method539(), var24.y, var24.z);
            }
         }
      }
   }

   private boolean method5401(BlockPos var1) {
      AxisAlignedBB var4 = this.getBoundingBox();
      AxisAlignedBB var5 = new AxisAlignedBB(
            (double)var1.getX(),
            var4.field28450,
            (double)var1.getZ(),
            (double)var1.getX() + 1.0,
            var4.field28453,
            (double)var1.getZ() + 1.0
         )
         .method19679(1.0E-7);
      return !this.world.method7056(this, var5, (var1x, var2) -> var1x.method23437(this.world, var2));
   }

   @Override
   public void setSprinting(boolean var1) {
      super.setSprinting(var1);
      this.field6134 = 0;
   }

   public void method5402(float var1, int var2, int var3) {
      this.field4922 = var1;
      this.field4921 = var2;
      this.field4920 = var3;
   }

   @Override
   public void sendMessage(ITextComponent var1, UUID var2) {
      this.field6132.ingameGUI.getChatGUI().method5930(var1);
   }

   @Override
   public void method2866(byte var1) {
      if (var1 >= 24 && var1 <= 28) {
         this.method5399(var1 - 24);
      } else {
         super.method2866(var1);
      }
   }

   public void method5403(boolean var1) {
      this.field6150 = var1;
   }

   public boolean isShowDeathScreen() {
      return this.field6150;
   }

   @Override
   public void method2863(SoundEvent var1, float var2, float var3) {
      this.world.method6745(this.getPosX(), this.getPosY(), this.getPosZ(), var1, this.method2864(), var2, var3, false);
   }

   @Override
   public void method2834(SoundEvent var1, Class2266 var2, float var3, float var4) {
      this.world.method6745(this.getPosX(), this.getPosY(), this.getPosZ(), var1, var2, var3, var4, false);
   }

   @Override
   public boolean method3138() {
      return true;
   }

   @Override
   public void method3154(Hand var1) {
      ItemStack var4 = this.getHeldItem(var1);
      if (!var4.isEmpty() && !this.isHandActive()) {
         super.method3154(var1);
         this.field6143 = true;
         this.field6144 = var1;
      }
   }

   @Override
   public boolean isHandActive() {
      return this.field6143;
   }

   @Override
   public void method3162() {
      super.method3162();
      this.field6143 = false;
   }

   @Override
   public Hand method3149() {
      return this.field6144;
   }

   @Override
   public void method3155(DataParameter<?> var1) {
      super.method3155(var1);
      if (field4934.equals(var1)) {
         boolean var4 = (this.dataManager.<Byte>method35445(field4934) & 1) > 0;
         Hand var5 = (this.dataManager.<Byte>method35445(field4934) & 2) <= 0 ? Hand.MAIN_HAND : Hand.field183;
         if (var4 && !this.field6143) {
            this.method3154(var5);
         } else if (!var4 && this.field6143) {
            this.method3162();
         }
      }

      if (FLAGS.equals(var1) && this.method3165() && !this.field6148) {
         this.field6132.getSoundHandler().method1000(new Class6343(this));
      }
   }

   public boolean method5405() {
      Entity var3 = this.getRidingEntity();
      return this.isPassenger() && var3 instanceof IJumpingMount && ((IJumpingMount)var3).canJump();
   }

   public float method5406() {
      return this.field6140;
   }

   @Override
   public void method2764(Class954 var1) {
      this.field6132.displayGuiScreen(new Class831(var1));
   }

   @Override
   public void method2890(Class911 var1) {
      this.field6132.displayGuiScreen(new Class1327(var1));
   }

   @Override
   public void method2770(Class969 var1) {
      this.field6132.displayGuiScreen(new Class1326(var1));
   }

   @Override
   public void method2891(Class964 var1) {
      this.field6132.displayGuiScreen(new Class1148(var1));
   }

   @Override
   public void method2892(Class965 var1) {
      this.field6132.displayGuiScreen(new Class1321(var1));
   }

   @Override
   public void method2769(ItemStack var1, Hand var2) {
      Item var5 = var1.getItem();
      if (var5 == Items.field38047) {
         this.field6132.displayGuiScreen(new Class828(this, var1, var2));
      }
   }

   @Override
   public void method2795(Entity var1) {
      this.field6132.particles.method1195(var1, ParticleTypes.field34054);
   }

   @Override
   public void method2796(Entity var1) {
      this.field6132.particles.method1195(var1, ParticleTypes.field34065);
   }

   @Override
   public boolean method3331() {
      return this.field6131 != null && this.field6131.field43914;
   }

   @Override
   public boolean method3336() {
      return this.field6125;
   }

   public boolean method5407() {
      return this.method3336() || this.method3338();
   }

   @Override
   public void updateEntityActionState() {
      super.updateEntityActionState();
      if (this.isCurrentViewEntity()) {
         this.field4982 = this.field6131.field43907;
         this.field4984 = this.field6131.field43908;
         this.field4981 = this.field6131.field43913;
         this.field6137 = this.field6135;
         this.field6138 = this.field6136;
         this.field6136 = (float)((double)this.field6136 + (double)(this.rotationPitch - this.field6136) * 0.5);
         this.field6135 = (float)((double)this.field6135 + (double)(this.rotationYaw - this.field6135) * 0.5);
      }
   }

   public boolean isCurrentViewEntity() {
      return this.field6132.getRenderViewEntity() == this;
   }

   @Override
   public void method2871() {
      this.field6134++;
      if (this.field6133 > 0) {
         this.field6133--;
      }

      this.method5409();
      boolean var3 = this.field6131.field43913;
      boolean var4 = this.field6131.field43914;
      boolean var5 = this.method5415();
      this.field6125 = !this.abilities.field29607
         && !this.method2951()
         && this.method3314(Pose.field13624)
         && (this.method3331() || !this.isSleeping() && !this.method3314(Pose.STANDING));
      this.field6131.method36336(this.method5407());
      this.field6132.getTutorial().method37023(this.field6131);
      if (this.isHandActive() && !this.isPassenger()) {
         Class4408 var6 = new Class4408(0.2F);
         Client.getInstance().getEventManager().call(var6);
         if (!var6.isCancelled()) {
            this.field6131.field43907 = this.field6131.field43907 * var6.method13940();
            this.field6131.field43908 = this.field6131.field43908 * var6.method13940();
            this.field6133 = 0;
         }
      }

      boolean var10 = false;
      if (this.field6147 > 0) {
         this.field6147--;
         var10 = true;
         this.field6131.field43913 = true;
      }

      if (!this.noClip) {
         this.setPlayerOffsetMotion(this.getPosX() - (double)this.method3429() * 0.35, this.getPosZ() + (double)this.method3429() * 0.35);
         this.setPlayerOffsetMotion(this.getPosX() - (double)this.method3429() * 0.35, this.getPosZ() - (double)this.method3429() * 0.35);
         this.setPlayerOffsetMotion(this.getPosX() + (double)this.method3429() * 0.35, this.getPosZ() - (double)this.method3429() * 0.35);
         this.setPlayerOffsetMotion(this.getPosX() + (double)this.method3429() * 0.35, this.getPosZ() + (double)this.method3429() * 0.35);
      }

      if (var4) {
         this.field6133 = 0;
      }

      boolean var7 = (float)this.method2932().method37574() > 6.0F || this.abilities.allowFlying;
      if ((this.onGround || this.canSwim())
         && !var4
         && !var5
         && this.method5415()
         && !this.method3337()
         && var7
         && !this.isHandActive()
         && !this.method3033(Effects.BLINDNESS)) {
         if (this.field6133 <= 0 && !this.field6132.gameSettings.keyBindSprint.isKeyDown()) {
            this.field6133 = 7;
         } else {
            this.setSprinting(true);
         }
      }

      if (!this.method3337()
         && (!this.method3250() || this.canSwim())
         && this.method5415()
         && var7
         && !this.isHandActive()
         && !this.method3033(Effects.BLINDNESS)
         && this.field6132.gameSettings.keyBindSprint.isKeyDown()) {
         this.setSprinting(true);
      }

      if (this.method3337()) {
         boolean var8 = !this.field6131.method36338() || !var7;
         boolean var9 = var8 || this.collidedHorizontally || this.method3250() && !this.canSwim();
         if (!this.method2951()) {
            if (var9) {
               this.setSprinting(false);
            }
         } else if (!this.onGround && !this.field6131.field43914 && var8 || !this.method3250()) {
            this.setSprinting(false);
         }
      }

      boolean var11 = false;
      if (this.abilities.allowFlying) {
         if (!this.field6132.playerController.method23155()) {
            if (!var3 && this.field6131.field43913 && !var10) {
               if (this.field4907 != 0) {
                  if (!this.method2951()) {
                     this.abilities.field29607 = !this.abilities.field29607;
                     var11 = true;
                     this.method2797();
                     this.field4907 = 0;
                  }
               } else {
                  this.field4907 = 7;
               }
            }
         } else if (!this.abilities.field29607) {
            this.abilities.field29607 = true;
            var11 = true;
            this.method2797();
         }
      }

      if (this.field6131.field43913 && !var11 && !var3 && !this.abilities.field29607 && !this.isPassenger() && !this.method3063()) {
         ItemStack var12 = this.method2943(Class2106.field13735);
         if (var12.getItem() == Items.field38120 && Class3256.method11698(var12) && this.tryToStartFallFlying()) {
            this.connection.sendPacket(new CEntityActionPacket(this, Class1865.field10048));
         }
      }

      this.field6148 = this.method3165();
      if (this.method3250() && this.field6131.field43914 && this.method2897()) {
         this.method3104();
      }

      if (!this.method3263(Class8953.field40469)) {
         if (this.field6149 > 0) {
            this.method3263(Class8953.field40469);
            this.field6149 = MathHelper.method37775(this.field6149 - 10, 0, 600);
         }
      } else {
         int var13 = !this.isSpectator() ? 1 : 10;
         this.field6149 = MathHelper.method37775(this.field6149 + var13, 0, 600);
      }

      if (this.abilities.field29607 && this.isCurrentViewEntity()) {
         int var14 = 0;
         if (this.field6131.field43914) {
            var14--;
         }

         if (this.field6131.field43913) {
            var14++;
         }

         if (var14 != 0) {
            this.method3434(this.method3433().method11339(0.0, (double)((float)var14 * this.abilities.method20714() * 3.0F), 0.0));
         }
      }

      if (!this.method5405()) {
         this.field6140 = 0.0F;
      } else {
         IJumpingMount var15 = (IJumpingMount)this.getRidingEntity();
         if (this.field6139 < 0) {
            this.field6139++;
            if (this.field6139 == 0) {
               this.field6140 = 0.0F;
            }
         }

         if (var3 && !this.field6131.field43913) {
            this.field6139 = -10;
            var15.method4966(MathHelper.method37767(this.method5406() * 100.0F));
            this.method5392();
         } else if (!var3 && this.field6131.field43913) {
            this.field6139 = 0;
            this.field6140 = 0.0F;
         } else if (var3) {
            this.field6139++;
            if (this.field6139 >= 10) {
               this.field6140 = 0.8F + 2.0F / (float)(this.field6139 - 9) * 0.1F;
            } else {
               this.field6140 = (float)this.field6139 * 0.1F;
            }
         }
      }

      super.method2871();
      if (this.onGround && this.abilities.field29607 && !this.field6132.playerController.method23155()) {
         this.abilities.field29607 = false;
         this.method2797();
      }
   }

   private void method5409() {
      this.field6142 = this.field6141;
      if (!this.inPortal) {
         if (this.method3033(Effects.NAUSEA) && this.method3034(Effects.NAUSEA).method8628() > 60) {
            this.field6141 += 0.006666667F;
            if (this.field6141 > 1.0F) {
               this.field6141 = 1.0F;
            }
         } else {
            if (this.field6141 > 0.0F) {
               this.field6141 -= 0.05F;
            }

            if (this.field6141 < 0.0F) {
               this.field6141 = 0.0F;
            }
         }
      } else {
         if (this.field6132.currentScreen != null && !this.field6132.currentScreen.isPauseScreen()) {
            if (this.field6132.currentScreen instanceof Class851) {
               this.method2772();
            }

            this.field6132.displayGuiScreen((Screen)null);
         }

         if (this.field6141 == 0.0F) {
            this.field6132.getSoundHandler().method1000(MinecraftSoundManager.method19296(Sounds.field26978, this.rand.nextFloat() * 0.4F + 0.8F, 0.25F));
         }

         this.field6141 += 0.0125F;
         if (this.field6141 >= 1.0F) {
            this.field6141 = 1.0F;
         }

         this.inPortal = false;
      }

      this.method2816();
   }

   @Override
   public void method2868() {
      super.method2868();
      this.field6145 = false;
      if (this.getRidingEntity() instanceof BoatEntity) {
         BoatEntity var3 = (BoatEntity)this.getRidingEntity();
         var3.method4173(this.field6131.field43911, this.field6131.field43912, this.field6131.field43909, this.field6131.field43910);
         this.field6145 = this.field6145 | (this.field6131.field43911 || this.field6131.field43912 || this.field6131.field43909 || this.field6131.field43910);
      }
   }

   public boolean isRowingBoat() {
      return this.field6145;
   }

   @Nullable
   @Override
   public Class2023 method3039(Effect var1) {
      if (var1 == Effects.NAUSEA) {
         this.field6142 = 0.0F;
         this.field6141 = 0.0F;
      }

      return super.method3039(var1);
   }

   @Override
   public void move(Class2107 var1, Vector3d var2) {
      double var5 = this.getPosX();
      double var7 = this.getPosZ();
      super.move(var1, var2);
      this.updateAutoJump((float)(this.getPosX() - var5), (float)(this.getPosZ() - var7));
   }

   public boolean method5411() {
      return this.field6146;
   }

   public void updateAutoJump(float var1, float var2) {
      if (this.method5413()) {
         Vector3d var5 = this.getPositionVec();
         Vector3d var6 = var5.method11339((double)var1, 0.0, (double)var2);
         Vector3d var7 = new Vector3d((double)var1, 0.0, (double)var2);
         float var8 = this.method2918();
         float var9 = (float)var7.method11349();
         if (var9 <= 0.001F) {
            Class8513 var10 = this.field6131.method36337();
            float var11 = var8 * var10.field37220;
            float var12 = var8 * var10.field37221;
            float var13 = MathHelper.sin(this.rotationYaw * (float) (Math.PI / 180.0));
            float var14 = MathHelper.cos(this.rotationYaw * (float) (Math.PI / 180.0));
            var7 = new Vector3d((double)(var11 * var14 - var12 * var13), var7.y, (double)(var12 * var14 + var11 * var13));
            var9 = (float)var7.method11349();
            if (var9 <= 0.001F) {
               return;
            }
         }

         float var42 = MathHelper.method37815(var9);
         Vector3d var43 = var7.method11344((double)var42);
         Vector3d var44 = this.method3322();
         float var45 = (float)(var44.x * var43.x + var44.z * var43.z);
         if (!(var45 < -0.15F)) {
            ISelectionContext var46 = ISelectionContext.forEntity(this);
            BlockPos var15 = new BlockPos(this.getPosX(), this.getBoundingBox().field28453, this.getPosZ());
            BlockState var16 = this.world.getBlockState(var15);
            if (var16.getCollisionShape(this.world, var15, var46).method19516()) {
               var15 = var15.up();
               BlockState var17 = this.world.getBlockState(var15);
               if (var17.getCollisionShape(this.world, var15, var46).method19516()) {
                  float var18 = 7.0F;
                  float var19 = 1.2F;
                  if (this.method3033(Effects.JUMP_BOOST)) {
                     var19 += (float)(this.method3034(Effects.JUMP_BOOST).method8629() + 1) * 0.75F;
                  }

                  float var20 = Math.max(var8 * 7.0F, 1.0F / var42);
                  Vector3d var21 = var6.method11338(var43.method11344((double)var20));
                  float var22 = this.method3429();
                  float var23 = this.method3430();
                  AxisAlignedBB var24 = new AxisAlignedBB(var5, var21.method11339(0.0, (double)var23, 0.0)).method19663((double)var22, 0.0, (double)var22);
                  Vector3d var25 = var5.method11339(0.0, 0.51F, 0.0);
                  var21 = var21.method11339(0.0, 0.51F, 0.0);
                  Vector3d var26 = var43.method11335(new Vector3d(0.0, 1.0, 0.0));
                  Vector3d var27 = var26.method11344((double)(var22 * 0.5F));
                  Vector3d var28 = var25.method11336(var27);
                  Vector3d var29 = var21.method11336(var27);
                  Vector3d var30 = var25.method11338(var27);
                  Vector3d var31 = var21.method11338(var27);
                  Iterator var32 = this.world.method7047(this, var24, var0 -> true).<AxisAlignedBB>flatMap(var0 -> var0.method19521().stream()).iterator();
                  float var33 = Float.MIN_VALUE;

                  while (var32.hasNext()) {
                     AxisAlignedBB var34 = (AxisAlignedBB)var32.next();
                     if (var34.method19672(var28, var29) || var34.method19672(var30, var31)) {
                        var33 = (float)var34.field28453;
                        Vector3d var35 = var34.method19685();
                        BlockPos var36 = new BlockPos(var35);

                        for (int var37 = 1; (float)var37 < var19; var37++) {
                           BlockPos var38 = var36.method8339(var37);
                           BlockState var39 = this.world.getBlockState(var38);
                           VoxelShape var40;
                           if (!(var40 = var39.getCollisionShape(this.world, var38, var46)).method19516()) {
                              var33 = (float)var40.method19513(Class113.field414) + (float)var38.getY();
                              if ((double)var33 - this.getPosY() > (double)var19) {
                                 return;
                              }
                           }

                           if (var37 > 1) {
                              var15 = var15.up();
                              BlockState var41 = this.world.getBlockState(var15);
                              if (!var41.getCollisionShape(this.world, var15, var46).method19516()) {
                                 return;
                              }
                           }
                        }
                        break;
                     }
                  }

                  if (var33 != Float.MIN_VALUE) {
                     float var49 = (float)((double)var33 - this.getPosY());
                     if (!(var49 <= 0.5F) && !(var49 > var19)) {
                        this.field6147 = 1;
                     }
                  }
               }
            }
         }
      }
   }

   private boolean method5413() {
      return this.method5411()
         && this.field6147 <= 0
         && this.onGround
         && !this.method2853()
         && !this.isPassenger()
         && this.method5414()
         && (double)this.method3229() >= 1.0;
   }

   private boolean method5414() {
      Class8513 var3 = this.field6131.method36337();
      return var3.field37220 != 0.0F || var3.field37221 != 0.0F;
   }

   private boolean method5415() {
      double var3 = 0.8;
      return !this.canSwim() ? (double)this.field6131.field43908 >= 0.8 : this.field6131.method36338();
   }

   public float method5416() {
      if (this.method3263(Class8953.field40469)) {
         float var3 = 600.0F;
         float var4 = 100.0F;
         if (!((float)this.field6149 >= 600.0F)) {
            float var5 = MathHelper.clamp((float)this.field6149 / 100.0F, 0.0F, 1.0F);
            float var6 = !((float)this.field6149 < 100.0F) ? MathHelper.clamp(((float)this.field6149 - 100.0F) / 500.0F, 0.0F, 1.0F) : 0.0F;
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
      return this.field4918;
   }

   @Override
   public boolean method2854() {
      boolean var3 = this.field4918;
      boolean var4 = super.method2854();
      if (!this.isSpectator()) {
         if (!var3 && var4) {
            this.world.method6745(this.getPosX(), this.getPosY(), this.getPosZ(), Sounds.field26329, Class2266.field14736, 1.0F, 1.0F, false);
            this.field6132.getSoundHandler().method1000(new Class6342(this));
         }

         if (var3 && !var4) {
            this.world.method6745(this.getPosX(), this.getPosY(), this.getPosZ(), Sounds.field26330, Class2266.field14736, 1.0F, 1.0F, false);
         }

         return this.field4918;
      } else {
         return this.field4918;
      }
   }

   @Override
   public Vector3d method2986(float var1) {
      if (!this.field6132.gameSettings.getPointOfView().func_243192_a()) {
         return super.method2986(var1);
      } else {
         float var4 = MathHelper.lerp(var1 * 0.5F, this.rotationYaw, this.prevRotationYaw) * (float) (Math.PI / 180.0);
         float var5 = MathHelper.lerp(var1 * 0.5F, this.rotationPitch, this.prevRotationPitch) * (float) (Math.PI / 180.0);
         double var6 = this.method2967() != Class2205.field14418 ? 1.0 : -1.0;
         Vector3d var8 = new Vector3d(0.39 * var6, -0.6, 0.3);
         return var8.method11350(-var5).method11351(-var4).method11338(this.method3286(var1));
      }
   }
}
