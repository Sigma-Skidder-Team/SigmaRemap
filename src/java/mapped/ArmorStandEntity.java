package mapped;

import net.minecraft.entity.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Predicate;

public class ArmorStandEntity extends LivingEntity {
   private static final Class7087 field5565 = new Class7087(0.0F, 0.0F, 0.0F);
   private static final Class7087 field5566 = new Class7087(0.0F, 0.0F, 0.0F);
   private static final Class7087 field5567 = new Class7087(-10.0F, 0.0F, -10.0F);
   private static final Class7087 field5568 = new Class7087(-15.0F, 0.0F, 10.0F);
   private static final Class7087 field5569 = new Class7087(-1.0F, 0.0F, -1.0F);
   private static final Class7087 field5570 = new Class7087(1.0F, 0.0F, 1.0F);
   private static final EntitySize field5571 = new EntitySize(0.0F, 0.0F, true);
   private static final EntitySize field5572 = EntityType.field41006.getSize().method32099(0.5F);
   public static final DataParameter<Byte> field5573 = EntityDataManager.<Byte>createKey(ArmorStandEntity.class, DataSerializers.field33390);
   public static final DataParameter<Class7087> field5574 = EntityDataManager.<Class7087>createKey(ArmorStandEntity.class, DataSerializers.field33400);
   public static final DataParameter<Class7087> field5575 = EntityDataManager.<Class7087>createKey(ArmorStandEntity.class, DataSerializers.field33400);
   public static final DataParameter<Class7087> field5576 = EntityDataManager.<Class7087>createKey(ArmorStandEntity.class, DataSerializers.field33400);
   public static final DataParameter<Class7087> field5577 = EntityDataManager.<Class7087>createKey(ArmorStandEntity.class, DataSerializers.field33400);
   public static final DataParameter<Class7087> field5578 = EntityDataManager.<Class7087>createKey(ArmorStandEntity.class, DataSerializers.field33400);
   public static final DataParameter<Class7087> field5579 = EntityDataManager.<Class7087>createKey(ArmorStandEntity.class, DataSerializers.field33400);
   private static final Predicate<Entity> field5580 = var0 -> var0 instanceof AbstractMinecartEntity && ((AbstractMinecartEntity)var0).getMinecartType() == MinecartType.MINECART;
   private final NonNullList<ItemStack> field5581 = NonNullList.<ItemStack>method68(2, ItemStack.EMPTY);
   private final NonNullList<ItemStack> field5582 = NonNullList.<ItemStack>method68(4, ItemStack.EMPTY);
   private boolean field5583;
   public long field5584;
   private int field5585;
   private Class7087 field5586 = field5565;
   private Class7087 field5587 = field5566;
   private Class7087 field5588 = field5567;
   private Class7087 field5589 = field5568;
   private Class7087 field5590 = field5569;
   private Class7087 field5591 = field5570;

   public ArmorStandEntity(EntityType<? extends ArmorStandEntity> var1, World var2) {
      super(var1, var2);
      this.stepHeight = 0.0F;
   }

   public ArmorStandEntity(World var1, double var2, double var4, double var6) {
      this(EntityType.field41006, var1);
      this.setPosition(var2, var4, var6);
   }

   @Override
   public void recalculateSize() {
      double var3 = this.getPosX();
      double var5 = this.getPosY();
      double var7 = this.getPosZ();
      super.recalculateSize();
      this.setPosition(var3, var5, var7);
   }

   private boolean method4185() {
      return !this.method4203() && !this.method3247();
   }

   @Override
   public boolean isServerWorld() {
      return super.isServerWorld() && this.method4185();
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5573, (byte)0);
      this.dataManager.register(field5574, field5565);
      this.dataManager.register(field5575, field5566);
      this.dataManager.register(field5576, field5567);
      this.dataManager.register(field5577, field5568);
      this.dataManager.register(field5578, field5569);
      this.dataManager.register(field5579, field5570);
   }

   @Override
   public Iterable<ItemStack> method2946() {
      return this.field5581;
   }

   @Override
   public Iterable<ItemStack> getArmorInventoryList() {
      return this.field5582;
   }

   @Override
   public ItemStack getItemStackFromSlot(EquipmentSlotType var1) {
      switch (Class7259.field31147[var1.method8772().ordinal()]) {
         case 1:
            return this.field5581.get(var1.method8773());
         case 2:
            return this.field5582.get(var1.method8773());
         default:
            return ItemStack.EMPTY;
      }
   }

   @Override
   public void setItemStackToSlot(EquipmentSlotType var1, ItemStack var2) {
      switch (Class7259.field31147[var1.method8772().ordinal()]) {
         case 1:
            this.playEquipSound(var2);
            this.field5581.set(var1.method8773(), var2);
            break;
         case 2:
            this.playEquipSound(var2);
            this.field5582.set(var1.method8773(), var2);
      }
   }

   @Override
   public boolean method2963(int var1, ItemStack var2) {
      EquipmentSlotType var5;
      if (var1 != 98) {
         if (var1 != 99) {
            if (var1 != 100 + EquipmentSlotType.field13736.method8773()) {
               if (var1 != 100 + EquipmentSlotType.field13735.method8773()) {
                  if (var1 != 100 + EquipmentSlotType.field13734.method8773()) {
                     if (var1 != 100 + EquipmentSlotType.field13733.method8773()) {
                        return false;
                     }

                     var5 = EquipmentSlotType.field13733;
                  } else {
                     var5 = EquipmentSlotType.field13734;
                  }
               } else {
                  var5 = EquipmentSlotType.field13735;
               }
            } else {
               var5 = EquipmentSlotType.field13736;
            }
         } else {
            var5 = EquipmentSlotType.OFFHAND;
         }
      } else {
         var5 = EquipmentSlotType.field13731;
      }

      if (!var2.isEmpty() && !MobEntity.method4301(var5, var2) && var5 != EquipmentSlotType.field13736) {
         return false;
      } else {
         this.setItemStackToSlot(var5, var2);
         return true;
      }
   }

   @Override
   public boolean canPickUpItem(ItemStack var1) {
      EquipmentSlotType var4 = MobEntity.method4271(var1);
      return this.getItemStackFromSlot(var4).isEmpty() && !this.method4189(var4);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      ListNBT var4 = new ListNBT();

      for (ItemStack var6 : this.field5582) {
         CompoundNBT var7 = new CompoundNBT();
         if (!var6.isEmpty()) {
            var6.method32112(var7);
         }

         var4.add(var7);
      }

      var1.put("ArmorItems", var4);
      ListNBT var9 = new ListNBT();

      for (ItemStack var11 : this.field5581) {
         CompoundNBT var8 = new CompoundNBT();
         if (!var11.isEmpty()) {
            var11.method32112(var8);
         }

         var9.add(var8);
      }

      var1.put("HandItems", var9);
      var1.putBoolean("Invisible", this.isInvisible());
      var1.putBoolean("Small", this.method4197());
      var1.putBoolean("ShowArms", this.method4199());
      var1.putInt("DisabledSlots", this.field5585);
      var1.putBoolean("NoBasePlate", this.method4201());
      if (this.method4203()) {
         var1.putBoolean("Marker", this.method4203());
      }

      var1.put("Pose", this.method4187());
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      if (var1.contains("ArmorItems", 9)) {
         ListNBT var4 = var1.method131("ArmorItems", 10);

         for (int var5 = 0; var5 < this.field5582.size(); var5++) {
            this.field5582.set(var5, ItemStack.method32104(var4.method153(var5)));
         }
      }

      if (var1.contains("HandItems", 9)) {
         ListNBT var6 = var1.method131("HandItems", 10);

         for (int var8 = 0; var8 < this.field5581.size(); var8++) {
            this.field5581.set(var8, ItemStack.method32104(var6.method153(var8)));
         }
      }

      this.setInvisible(var1.getBoolean("Invisible"));
      this.method4196(var1.getBoolean("Small"));
      this.method4198(var1.getBoolean("ShowArms"));
      this.field5585 = var1.getInt("DisabledSlots");
      this.method4200(var1.getBoolean("NoBasePlate"));
      this.method4202(var1.getBoolean("Marker"));
      this.noClip = !this.method4185();
      CompoundNBT var7 = var1.getCompound("Pose");
      this.method4186(var7);
   }

   private void method4186(CompoundNBT var1) {
      ListNBT var4 = var1.method131("Head", 5);
      this.method4205(!var4.isEmpty() ? new Class7087(var4) : field5565);
      ListNBT var5 = var1.method131("Body", 5);
      this.method4206(!var5.isEmpty() ? new Class7087(var5) : field5566);
      ListNBT var6 = var1.method131("LeftArm", 5);
      this.method4207(!var6.isEmpty() ? new Class7087(var6) : field5567);
      ListNBT var7 = var1.method131("RightArm", 5);
      this.method4208(!var7.isEmpty() ? new Class7087(var7) : field5568);
      ListNBT var8 = var1.method131("LeftLeg", 5);
      this.method4209(!var8.isEmpty() ? new Class7087(var8) : field5569);
      ListNBT var9 = var1.method131("RightLeg", 5);
      this.method4210(!var9.isEmpty() ? new Class7087(var9) : field5570);
   }

   private CompoundNBT method4187() {
      CompoundNBT var3 = new CompoundNBT();
      if (!field5565.equals(this.field5586)) {
         var3.put("Head", this.field5586.method22012());
      }

      if (!field5566.equals(this.field5587)) {
         var3.put("Body", this.field5587.method22012());
      }

      if (!field5567.equals(this.field5588)) {
         var3.put("LeftArm", this.field5588.method22012());
      }

      if (!field5568.equals(this.field5589)) {
         var3.put("RightArm", this.field5589.method22012());
      }

      if (!field5569.equals(this.field5590)) {
         var3.put("LeftLeg", this.field5590.method22012());
      }

      if (!field5570.equals(this.field5591)) {
         var3.put("RightLeg", this.field5591.method22012());
      }

      return var3;
   }

   @Override
   public boolean canBePushed() {
      return false;
   }

   @Override
   public void collideWithEntity(Entity var1) {
   }

   @Override
   public void collideWithNearbyEntities() {
      List var3 = this.world.getEntitiesInAABBexcluding(this, this.getBoundingBox(), field5580);

      for (int var4 = 0; var4 < var3.size(); var4++) {
         Entity var5 = (Entity)var3.get(var4);
         if (this.getDistanceSq(var5) <= 0.2) {
            var5.applyEntityCollision(this);
         }
      }
   }

   @Override
   public ActionResultType applyPlayerInteraction(PlayerEntity var1, Vector3d var2, Hand var3) {
      ItemStack var6 = var1.getHeldItem(var3);
      if (this.method4203() || var6.getItem() == Items.field38088) {
         return ActionResultType.field14820;
      } else if (var1.isSpectator()) {
         return ActionResultType.SUCCESS;
      } else if (!var1.world.isRemote) {
         EquipmentSlotType var7 = MobEntity.method4271(var6);
         if (!var6.isEmpty()) {
            if (this.method4189(var7)) {
               return ActionResultType.FAIL;
            }

            if (var7.method8772() == Class1969.field12836 && !this.method4199()) {
               return ActionResultType.FAIL;
            }

            if (this.method4190(var1, var7, var6, var3)) {
               return ActionResultType.SUCCESS;
            }
         } else {
            EquipmentSlotType var8 = this.method4188(var2);
            EquipmentSlotType var9 = !this.method4189(var8) ? var8 : var7;
            if (this.hasItemInSlot(var9) && this.method4190(var1, var9, var6, var3)) {
               return ActionResultType.SUCCESS;
            }
         }

         return ActionResultType.field14820;
      } else {
         return ActionResultType.field14819;
      }
   }

   private EquipmentSlotType method4188(Vector3d var1) {
      EquipmentSlotType var4 = EquipmentSlotType.field13731;
      boolean var5 = this.method4197();
      double var6 = !var5 ? var1.y : var1.y * 2.0;
      EquipmentSlotType var8 = EquipmentSlotType.field13733;
      if (var6 >= 0.1 && var6 < 0.1 + (!var5 ? 0.45 : 0.8) && this.hasItemInSlot(var8)) {
         var4 = EquipmentSlotType.field13733;
      } else if (var6 >= 0.9 + (!var5 ? 0.0 : 0.3) && var6 < 0.9 + (!var5 ? 0.7 : 1.0) && this.hasItemInSlot(EquipmentSlotType.field13735)) {
         var4 = EquipmentSlotType.field13735;
      } else if (var6 >= 0.4 && var6 < 0.4 + (!var5 ? 0.8 : 1.0) && this.hasItemInSlot(EquipmentSlotType.field13734)) {
         var4 = EquipmentSlotType.field13734;
      } else if (var6 >= 1.6 && this.hasItemInSlot(EquipmentSlotType.field13736)) {
         var4 = EquipmentSlotType.field13736;
      } else if (!this.hasItemInSlot(EquipmentSlotType.field13731) && this.hasItemInSlot(EquipmentSlotType.OFFHAND)) {
         var4 = EquipmentSlotType.OFFHAND;
      }

      return var4;
   }

   private boolean method4189(EquipmentSlotType var1) {
      return (this.field5585 & 1 << var1.method8774()) != 0 || var1.method8772() == Class1969.field12836 && !this.method4199();
   }

   private boolean method4190(PlayerEntity var1, EquipmentSlotType var2, ItemStack var3, Hand var4) {
      ItemStack var7 = this.getItemStackFromSlot(var2);
      if (!var7.isEmpty() && (this.field5585 & 1 << var2.method8774() + 8) != 0) {
         return false;
      } else if (var7.isEmpty() && (this.field5585 & 1 << var2.method8774() + 16) != 0) {
         return false;
      } else if (var1.abilities.isCreativeMode && var7.isEmpty() && !var3.isEmpty()) {
         ItemStack var9 = var3.copy();
         var9.method32180(1);
         this.setItemStackToSlot(var2, var9);
         return true;
      } else if (var3.isEmpty() || var3.getCount() <= 1) {
         this.setItemStackToSlot(var2, var3);
         var1.setHeldItem(var4, var7);
         return true;
      } else if (var7.isEmpty()) {
         ItemStack var8 = var3.copy();
         var8.method32180(1);
         this.setItemStackToSlot(var2, var8);
         var3.method32182(1);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      if (this.world.isRemote || this.removed) {
         return false;
      } else if (DamageSource.field39004.equals(var1)) {
         this.remove();
         return false;
      } else if (this.isInvulnerableTo(var1) || this.field5583 || this.method4203()) {
         return false;
      } else if (var1.method31131()) {
         this.method4194(var1);
         this.remove();
         return false;
      } else if (!DamageSource.field38992.equals(var1)) {
         if (DamageSource.field38994.equals(var1) && this.getHealth() > 0.5F) {
            this.method4192(var1, 4.0F);
            return false;
         } else {
            boolean var5 = var1.getImmediateSource() instanceof AbstractArrowEntity;
            boolean var6 = var5 && ((AbstractArrowEntity)var1.getImmediateSource()).method3489() > 0;
            boolean var7 = "player".equals(var1.method31142());
            if (!var7 && !var5) {
               return false;
            } else if (var1.getTrueSource() instanceof PlayerEntity && !((PlayerEntity)var1.getTrueSource()).abilities.allowEdit) {
               return false;
            } else if (var1.method31146()) {
               this.method4195();
               this.method4191();
               this.remove();
               return var6;
            } else {
               long var8 = this.world.getGameTime();
               if (var8 - this.field5584 > 5L && !var5) {
                  this.world.setEntityState(this, (byte)32);
                  this.field5584 = var8;
               } else {
                  this.method4193(var1);
                  this.method4191();
                  this.remove();
               }

               return true;
            }
         }
      } else {
         if (!this.isBurning()) {
            this.setFire(5);
         } else {
            this.method4192(var1, 0.15F);
         }

         return false;
      }
   }

   @Override
   public void handleStatusUpdate(byte var1) {
      if (var1 != 32) {
         super.handleStatusUpdate(var1);
      } else if (this.world.isRemote) {
         this.world.method6745(this.getPosX(), this.getPosY(), this.getPosZ(), SoundEvents.field26359, this.method2864(), 0.3F, 1.0F, false);
         this.field5584 = this.world.getGameTime();
      }
   }

   @Override
   public boolean isInRangeToRenderDist(double var1) {
      double var5 = this.getBoundingBox().getAverageEdgeLength() * 4.0;
      if (Double.isNaN(var5) || var5 == 0.0) {
         var5 = 4.0;
      }

      var5 *= 64.0;
      return var1 < var5 * var5;
   }

   private void method4191() {
      if (this.world instanceof ServerWorld) {
         ((ServerWorld)this.world)
            .spawnParticle(
               new BlockParticleData(ParticleTypes.field34051, Blocks.field36400.method11579()),
               this.getPosX(),
               this.getPosYHeight(0.6666666666666666),
               this.getPosZ(),
               10,
               (double)(this.getWidth() / 4.0F),
               (double)(this.getHeight() / 4.0F),
               (double)(this.getWidth() / 4.0F),
               0.05
            );
      }
   }

   private void method4192(DamageSource var1, float var2) {
      float var5 = this.getHealth();
      var5 -= var2;
      if (!(var5 <= 0.5F)) {
         this.setHealth(var5);
      } else {
         this.method4194(var1);
         this.remove();
      }
   }

   private void method4193(DamageSource var1) {
      Block.method11557(this.world, this.getPosition(), new ItemStack(Items.ARMOR_STAND));
      this.method4194(var1);
   }

   private void method4194(DamageSource var1) {
      this.method4195();
      this.spawnDrops(var1);

      for (int var4 = 0; var4 < this.field5581.size(); var4++) {
         ItemStack var5 = this.field5581.get(var4);
         if (!var5.isEmpty()) {
            Block.method11557(this.world, this.getPosition().up(), var5);
            this.field5581.set(var4, ItemStack.EMPTY);
         }
      }

      for (int var6 = 0; var6 < this.field5582.size(); var6++) {
         ItemStack var7 = this.field5582.get(var6);
         if (!var7.isEmpty()) {
            Block.method11557(this.world, this.getPosition().up(), var7);
            this.field5582.set(var6, ItemStack.EMPTY);
         }
      }
   }

   private void method4195() {
      this.world.method6743((PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), SoundEvents.field26357, this.method2864(), 1.0F, 1.0F);
   }

   @Override
   public float updateDistance(float var1, float var2) {
      this.prevRenderYawOffset = this.prevRotationYaw;
      this.renderYawOffset = this.rotationYaw;
      return 0.0F;
   }

   @Override
   public float getStandingEyeHeight(Pose var1, EntitySize var2) {
      return var2.field39969 * (!this.isChild() ? 0.9F : 0.5F);
   }

   @Override
   public double getYOffset() {
      return !this.method4203() ? 0.1F : 0.0;
   }

   @Override
   public void travel(Vector3d var1) {
      if (this.method4185()) {
         super.travel(var1);
      }
   }

   @Override
   public void setRenderYawOffset(float var1) {
      this.prevRenderYawOffset = this.prevRotationYaw = var1;
      this.prevRotationYawHead = this.rotationYawHead = var1;
   }

   @Override
   public void setRotationYawHead(float var1) {
      this.prevRenderYawOffset = this.prevRotationYaw = var1;
      this.prevRotationYawHead = this.rotationYawHead = var1;
   }

   @Override
   public void tick() {
      super.tick();
      Class7087 var3 = this.dataManager.<Class7087>method35445(field5574);
      if (!this.field5586.equals(var3)) {
         this.method4205(var3);
      }

      Class7087 var4 = this.dataManager.<Class7087>method35445(field5575);
      if (!this.field5587.equals(var4)) {
         this.method4206(var4);
      }

      Class7087 var5 = this.dataManager.<Class7087>method35445(field5576);
      if (!this.field5588.equals(var5)) {
         this.method4207(var5);
      }

      Class7087 var6 = this.dataManager.<Class7087>method35445(field5577);
      if (!this.field5589.equals(var6)) {
         this.method4208(var6);
      }

      Class7087 var7 = this.dataManager.<Class7087>method35445(field5578);
      if (!this.field5590.equals(var7)) {
         this.method4209(var7);
      }

      Class7087 var8 = this.dataManager.<Class7087>method35445(field5579);
      if (!this.field5591.equals(var8)) {
         this.method4210(var8);
      }
   }

   @Override
   public void updatePotionMetadata() {
      this.setInvisible(this.field5583);
   }

   @Override
   public void setInvisible(boolean var1) {
      this.field5583 = var1;
      super.setInvisible(var1);
   }

   @Override
   public boolean isChild() {
      return this.method4197();
   }

   @Override
   public void onKillCommand() {
      this.remove();
   }

   @Override
   public boolean method3398() {
      return this.isInvisible();
   }

   @Override
   public Class2315 method3422() {
      return !this.method4203() ? super.method3422() : Class2315.field15865;
   }

   private void method4196(boolean var1) {
      this.dataManager.method35446(field5573, this.method4204(this.dataManager.<Byte>method35445(field5573), 1, var1));
   }

   public boolean method4197() {
      return (this.dataManager.<Byte>method35445(field5573) & 1) != 0;
   }

   private void method4198(boolean var1) {
      this.dataManager.method35446(field5573, this.method4204(this.dataManager.<Byte>method35445(field5573), 4, var1));
   }

   public boolean method4199() {
      return (this.dataManager.<Byte>method35445(field5573) & 4) != 0;
   }

   private void method4200(boolean var1) {
      this.dataManager.method35446(field5573, this.method4204(this.dataManager.<Byte>method35445(field5573), 8, var1));
   }

   public boolean method4201() {
      return (this.dataManager.<Byte>method35445(field5573) & 8) != 0;
   }

   private void method4202(boolean var1) {
      this.dataManager.method35446(field5573, this.method4204(this.dataManager.<Byte>method35445(field5573), 16, var1));
   }

   public boolean method4203() {
      return (this.dataManager.<Byte>method35445(field5573) & 16) != 0;
   }

   private byte method4204(byte var1, int var2, boolean var3) {
      if (!var3) {
         var1 = (byte)(var1 & ~var2);
      } else {
         var1 = (byte)(var1 | var2);
      }

      return var1;
   }

   public void method4205(Class7087 var1) {
      this.field5586 = var1;
      this.dataManager.method35446(field5574, var1);
   }

   public void method4206(Class7087 var1) {
      this.field5587 = var1;
      this.dataManager.method35446(field5575, var1);
   }

   public void method4207(Class7087 var1) {
      this.field5588 = var1;
      this.dataManager.method35446(field5576, var1);
   }

   public void method4208(Class7087 var1) {
      this.field5589 = var1;
      this.dataManager.method35446(field5577, var1);
   }

   public void method4209(Class7087 var1) {
      this.field5590 = var1;
      this.dataManager.method35446(field5578, var1);
   }

   public void method4210(Class7087 var1) {
      this.field5591 = var1;
      this.dataManager.method35446(field5579, var1);
   }

   public Class7087 method4211() {
      return this.field5586;
   }

   public Class7087 method4212() {
      return this.field5587;
   }

   public Class7087 method4213() {
      return this.field5588;
   }

   public Class7087 method4214() {
      return this.field5589;
   }

   public Class7087 method4215() {
      return this.field5590;
   }

   public Class7087 method4216() {
      return this.field5591;
   }

   @Override
   public boolean canBeCollidedWith() {
      return super.canBeCollidedWith() && !this.method4203();
   }

   @Override
   public boolean method3361(Entity var1) {
      return var1 instanceof PlayerEntity && !this.world.method6785((PlayerEntity)var1, this.getPosition());
   }

   @Override
   public HandSide getPrimaryHand() {
      return HandSide.field14418;
   }

   @Override
   public SoundEvent getFallSound(int var1) {
      return SoundEvents.field26358;
   }

   @Nullable
   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26359;
   }

   @Nullable
   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26357;
   }

   @Override
   public void method3353(ServerWorld var1, Class906 var2) {
   }

   @Override
   public boolean canBeHitWithPotion() {
      return false;
   }

   @Override
   public void notifyDataManagerChange(DataParameter<?> var1) {
      if (field5573.equals(var1)) {
         this.recalculateSize();
         this.preventEntitySpawning = !this.method4203();
      }

      super.notifyDataManagerChange(var1);
   }

   @Override
   public boolean attackable() {
      return false;
   }

   @Override
   public EntitySize getSize(Pose var1) {
      return this.method4217(this.method4203());
   }

   private EntitySize method4217(boolean var1) {
      if (!var1) {
         return !this.isChild() ? this.getType().getSize() : field5572;
      } else {
         return field5571;
      }
   }

   @Override
   public Vector3d method3287(float var1) {
      if (!this.method4203()) {
         return super.method3287(var1);
      } else {
         AxisAlignedBB var4 = this.method4217(false).method32097(this.getPositionVec());
         BlockPos var5 = this.getPosition();
         int var6 = Integer.MIN_VALUE;

         for (BlockPos var8 : BlockPos.method8359(
            new BlockPos(var4.minX, var4.minY, var4.minZ), new BlockPos(var4.maxX, var4.maxY, var4.maxZ)
         )) {
            int var9 = Math.max(this.world.method7020(Class1977.field12882, var8), this.world.method7020(Class1977.field12881, var8));
            if (var9 == 15) {
               return Vector3d.method11328(var8);
            }

            if (var9 > var6) {
               var6 = var9;
               var5 = var8.toImmutable();
            }
         }

         return Vector3d.method11328(var5);
      }
   }
}
