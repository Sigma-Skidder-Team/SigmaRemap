package mapped;

import com.google.common.collect.Maps;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.server.SMountEntityPacket;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.*;

public abstract class MobEntity extends LivingEntity {
   private static final DataParameter<Byte> field5592 = EntityDataManager.<Byte>createKey(MobEntity.class, DataSerializers.field33390);
   public int field5593;
   public int field5594;
   public Class8092 field5595;
   public Class6829 field5596;
   public Class7956 field5597;
   private final Class7395 field5598;
   public Class6990 field5599;
   public final Class6603 field5600;
   public final Class6603 field5601;
   private LivingEntity field5602;
   private final Class9363 field5603;
   private final NonNullList<ItemStack> field5604 = NonNullList.<ItemStack>method68(2, ItemStack.EMPTY);
   public final float[] field5605 = new float[2];
   private final NonNullList<ItemStack> field5606 = NonNullList.<ItemStack>method68(4, ItemStack.EMPTY);
   public final float[] field5607 = new float[4];
   private boolean field5608;
   private boolean field5609;
   private final Map<Class2163, Float> field5610 = Maps.newEnumMap(Class2163.class);
   private ResourceLocation field5611;
   private long field5612;
   private Entity field5613;
   private int field5614;
   private CompoundNBT field5615;
   private BlockPos field5616 = BlockPos.ZERO;
   private float field5617 = -1.0F;

   public MobEntity(EntityType<? extends MobEntity> var1, World var2) {
      super(var1, var2);
      this.field5600 = new Class6603(var2.method6821());
      this.field5601 = new Class6603(var2.method6821());
      this.field5595 = new Class8092(this);
      this.field5596 = new Class6829(this);
      this.field5597 = new Class7956(this);
      this.field5598 = this.method4226();
      this.field5599 = this.method4221(var2);
      this.field5603 = new Class9363(this);
      Arrays.fill(this.field5607, 0.085F);
      Arrays.fill(this.field5605, 0.085F);
      if (var2 != null && !var2.isRemote) {
         this.method4219();
      }
   }

   public void method4219() {
   }

   public static Class7037 method4220() {
      return LivingEntity.method2997().method21849(Attributes.field42106, 16.0).method21848(Attributes.field42111);
   }

   public Class6990 method4221(World var1) {
      return new Class6991(this, var1);
   }

   public boolean method4222() {
      return false;
   }

   public float method4223(Class2163 var1) {
      MobEntity var4;
      if (this.getRidingEntity() instanceof MobEntity && ((MobEntity)this.getRidingEntity()).method4222()) {
         var4 = (MobEntity)this.getRidingEntity();
      } else {
         var4 = this;
      }

      Float var5 = var4.field5610.get(var1);
      return var5 != null ? var5 : var1.method8884();
   }

   public void method4224(Class2163 var1, float var2) {
      this.field5610.put(var1, var2);
   }

   public boolean method4225(Class2163 var1) {
      return var1 != Class2163.field14195 && var1 != Class2163.field14197 && var1 != Class2163.field14199 && var1 != Class2163.field14187;
   }

   public Class7395 method4226() {
      return new Class7395(this);
   }

   public Class8092 method4227() {
      return this.field5595;
   }

   public Class6829 method4228() {
      if (this.isPassenger() && this.getRidingEntity() instanceof MobEntity) {
         MobEntity var3 = (MobEntity)this.getRidingEntity();
         return var3.method4228();
      } else {
         return this.field5596;
      }
   }

   public Class7956 method4229() {
      return this.field5597;
   }

   public Class6990 method4230() {
      if (this.isPassenger() && this.getRidingEntity() instanceof MobEntity) {
         MobEntity var3 = (MobEntity)this.getRidingEntity();
         return var3.method4230();
      } else {
         return this.field5599;
      }
   }

   public Class9363 method4231() {
      return this.field5603;
   }

   @Nullable
   public LivingEntity method4232() {
      return this.field5602;
   }

   public void method4233(LivingEntity var1) {
      this.field5602 = var1;
      Class9299.method35055(Class9299.field42862, this, var1);
   }

   @Override
   public boolean canAttack(EntityType<?> var1) {
      return var1 != EntityType.field41034;
   }

   public boolean method4234(Class3262 var1) {
      return false;
   }

   public void method4235() {
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5592, (byte)0);
   }

   public int method4236() {
      return 80;
   }

   public void method4237() {
      SoundEvent var3 = this.getAmbientSound();
      if (var3 != null) {
         this.playSound(var3, this.getSoundVolume(), this.getSoundPitch());
      }
   }

   @Override
   public void baseTick() {
      super.baseTick();
      this.world.getProfiler().startSection("mobBaseTick");
      if (this.isAlive() && this.rand.nextInt(1000) < this.field5593++) {
         this.method4238();
         this.method4237();
      }

      this.world.getProfiler().endSection();
   }

   @Override
   public void playHurtSound(DamageSource var1) {
      this.method4238();
      super.playHurtSound(var1);
   }

   private void method4238() {
      this.field5593 = -this.method4236();
   }

   @Override
   public int getExperiencePoints(PlayerEntity var1) {
      if (this.field5594 <= 0) {
         return this.field5594;
      } else {
         int var4 = this.field5594;

         for (int var5 = 0; var5 < this.field5606.size(); var5++) {
            if (!this.field5606.get(var5).isEmpty() && this.field5607[var5] <= 1.0F) {
               var4 += 1 + this.rand.nextInt(3);
            }
         }

         for (int var6 = 0; var6 < this.field5604.size(); var6++) {
            if (!this.field5604.get(var6).isEmpty() && this.field5605[var6] <= 1.0F) {
               var4 += 1 + this.rand.nextInt(3);
            }
         }

         return var4;
      }
   }

   public void method4239() {
      if (!this.world.isRemote) {
         this.world.setEntityState(this, (byte)20);
      } else {
         for (int var3 = 0; var3 < 20; var3++) {
            double var4 = this.rand.nextGaussian() * 0.02;
            double var6 = this.rand.nextGaussian() * 0.02;
            double var8 = this.rand.nextGaussian() * 0.02;
            double var10 = 10.0;
            this.world
               .addParticle(
                  ParticleTypes.field34089,
                  this.getPosXWidth(1.0) - var4 * 10.0,
                  this.getPosYRandom() - var6 * 10.0,
                  this.getPosZRandom(1.0) - var8 * 10.0,
                  var4,
                  var6,
                  var8
               );
         }
      }
   }

   @Override
   public void handleStatusUpdate(byte var1) {
      if (var1 != 20) {
         super.handleStatusUpdate(var1);
      } else {
         this.method4239();
      }
   }

   @Override
   public void tick() {
      if (Class7944.method26938() && this.method4311()) {
         this.method4313();
      } else {
         super.tick();
         if (!this.world.isRemote) {
            this.method4293();
            if (this.ticksExisted % 5 == 0) {
               this.method4240();
            }
         }
      }
   }

   public void method4240() {
      boolean var3 = !(this.method3407() instanceof MobEntity);
      boolean var4 = !(this.getRidingEntity() instanceof BoatEntity);
      this.field5600.method20010(Class2240.field14657, var3);
      this.field5600.method20010(Class2240.field14659, var3 && var4);
      this.field5600.method20010(Class2240.field14658, var3);
   }

   @Override
   public float updateDistance(float var1, float var2) {
      this.field5598.method23626();
      return var2;
   }

   @Nullable
   public SoundEvent getAmbientSound() {
      return null;
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putBoolean("CanPickUpLoot", this.method4280());
      var1.putBoolean("PersistenceRequired", this.field5609);
      ListNBT var4 = new ListNBT();

      for (ItemStack var6 : this.field5606) {
         CompoundNBT var7 = new CompoundNBT();
         if (!var6.isEmpty()) {
            var6.method32112(var7);
         }

         var4.add(var7);
      }

      var1.put("ArmorItems", var4);
      ListNBT var12 = new ListNBT();

      for (ItemStack var15 : this.field5604) {
         CompoundNBT var8 = new CompoundNBT();
         if (!var15.isEmpty()) {
            var15.method32112(var8);
         }

         var12.add(var8);
      }

      var1.put("HandItems", var12);
      ListNBT var14 = new ListNBT();

      for (float var10 : this.field5607) {
         var14.add(Class32.method90(var10));
      }

      var1.put("ArmorDropChances", var14);
      ListNBT var17 = new ListNBT();

      for (float var11 : this.field5605) {
         var17.add(Class32.method90(var11));
      }

      var1.put("HandDropChances", var17);
      if (this.field5613 == null) {
         if (this.field5615 != null) {
            var1.put("Leash", this.field5615.method79());
         }
      } else {
         CompoundNBT var20 = new CompoundNBT();
         if (!(this.field5613 instanceof LivingEntity)) {
            if (this.field5613 instanceof Class995) {
               BlockPos var22 = ((Class995)this.field5613).method4085();
               var20.putInt("X", var22.getX());
               var20.putInt("Y", var22.getY());
               var20.putInt("Z", var22.getZ());
            }
         } else {
            UUID var23 = this.field5613.getUniqueID();
            var20.method104("UUID", var23);
         }

         var1.put("Leash", var20);
      }

      var1.putBoolean("LeftHanded", this.method4306());
      if (this.field5611 != null) {
         var1.method109("DeathLootTable", this.field5611.toString());
         if (this.field5612 != 0L) {
            var1.method103("DeathLootTableSeed", this.field5612);
         }
      }

      if (this.method4305()) {
         var1.putBoolean("NoAI", this.method4305());
      }
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      if (var1.contains("CanPickUpLoot", 1)) {
         this.method4281(var1.getBoolean("CanPickUpLoot"));
      }

      this.field5609 = var1.getBoolean("PersistenceRequired");
      if (var1.contains("ArmorItems", 9)) {
         ListNBT var4 = var1.method131("ArmorItems", 10);

         for (int var5 = 0; var5 < this.field5606.size(); var5++) {
            this.field5606.set(var5, ItemStack.method32104(var4.method153(var5)));
         }
      }

      if (var1.contains("HandItems", 9)) {
         ListNBT var6 = var1.method131("HandItems", 10);

         for (int var9 = 0; var9 < this.field5604.size(); var9++) {
            this.field5604.set(var9, ItemStack.method32104(var6.method153(var9)));
         }
      }

      if (var1.contains("ArmorDropChances", 9)) {
         ListNBT var7 = var1.method131("ArmorDropChances", 5);

         for (int var10 = 0; var10 < var7.size(); var10++) {
            this.field5607[var10] = var7.method159(var10);
         }
      }

      if (var1.contains("HandDropChances", 9)) {
         ListNBT var8 = var1.method131("HandDropChances", 5);

         for (int var11 = 0; var11 < var8.size(); var11++) {
            this.field5605[var11] = var8.method159(var11);
         }
      }

      if (var1.contains("Leash", 10)) {
         this.field5615 = var1.getCompound("Leash");
      }

      this.method4303(var1.getBoolean("LeftHanded"));
      if (var1.contains("DeathLootTable", 8)) {
         this.field5611 = new ResourceLocation(var1.getString("DeathLootTable"));
         this.field5612 = var1.getLong("DeathLootTableSeed");
      }

      this.method4302(var1.getBoolean("NoAI"));
   }

   @Override
   public void dropLoot(DamageSource var1, boolean var2) {
      super.dropLoot(var1, var2);
      this.field5611 = null;
   }

   @Override
   public Class9464 method3057(boolean var1, DamageSource var2) {
      return super.method3057(var1, var2).method36452(this.field5612, this.rand);
   }

   @Override
   public final ResourceLocation getLootTableResourceLocation() {
      return this.field5611 != null ? this.field5611 : this.method4242();
   }

   public ResourceLocation method4242() {
      return super.getLootTableResourceLocation();
   }

   public void method4243(float var1) {
      this.moveForward = var1;
   }

   public void method4244(float var1) {
      this.moveVertical = var1;
   }

   public void method4245(float var1) {
      this.moveStrafing = var1;
   }

   @Override
   public void setAIMoveSpeed(float var1) {
      super.setAIMoveSpeed(var1);
      this.method4243(var1);
   }

   @Override
   public void livingEntity() {
      super.livingEntity();
      this.world.getProfiler().startSection("looting");
      boolean var3 = this.world.getGameRules().getBoolean(Class5462.field24224);
      if (Class9299.field42847.method20214()) {
         var3 = Class9299.method35056(Class9299.field42847, this.world, this);
      }

      if (!this.world.isRemote && this.method4280() && this.isAlive() && !this.dead && var3) {
         for (ItemEntity var5 : this.world.<ItemEntity>method7182(ItemEntity.class, this.getBoundingBox().method19663(1.0, 0.0, 1.0))) {
            if (!var5.removed && !var5.method4124().isEmpty() && !var5.method4135() && this.method4253(var5.method4124())) {
               this.method4246(var5);
            }
         }
      }

      this.world.getProfiler().endSection();
   }

   public void method4246(ItemEntity var1) {
      ItemStack var4 = var1.method4124();
      if (this.method4247(var4)) {
         this.triggerItemPickupTrigger(var1);
         this.onItemPickup(var1, var4.getCount());
         var1.remove();
      }
   }

   public boolean method4247(ItemStack var1) {
      EquipmentSlotType var4 = method4271(var1);
      ItemStack var5 = this.getItemStackFromSlot(var4);
      boolean var6 = this.method4250(var1, var5);
      if (var6 && this.method4252(var1)) {
         double var7 = (double)this.method4269(var4);
         if (!var5.isEmpty() && (double)Math.max(this.rand.nextFloat() - 0.1F, 0.0F) < var7) {
            this.method3302(var5);
         }

         this.method4248(var4, var1);
         this.playEquipSound(var1);
         return true;
      } else {
         return false;
      }
   }

   public void method4248(EquipmentSlotType var1, ItemStack var2) {
      this.setItemStackToSlot(var1, var2);
      this.method4249(var1);
      this.field5609 = true;
   }

   public void method4249(EquipmentSlotType var1) {
      switch (Class8979.field40589[var1.method8772().ordinal()]) {
         case 1:
            this.field5605[var1.method8773()] = 2.0F;
            break;
         case 2:
            this.field5607[var1.method8773()] = 2.0F;
      }
   }

   public boolean method4250(ItemStack var1, ItemStack var2) {
      if (!var2.isEmpty()) {
         if (!(var1.getItem() instanceof ItemSword)) {
            if (var1.getItem() instanceof BowItem && var2.getItem() instanceof BowItem) {
               return this.method4251(var1, var2);
            } else if (var1.getItem() instanceof Class3261 && var2.getItem() instanceof Class3261) {
               return this.method4251(var1, var2);
            } else if (!(var1.getItem() instanceof ArmorItem)) {
               if (var1.getItem() instanceof Class3264) {
                  if (var2.getItem() instanceof Class3292) {
                     return true;
                  }

                  if (var2.getItem() instanceof Class3264) {
                     Class3264 var8 = (Class3264)var1.getItem();
                     Class3264 var10 = (Class3264)var2.getItem();
                     if (var8.method11779() == var10.method11779()) {
                        return this.method4251(var1, var2);
                     }

                     return var8.method11779() > var10.method11779();
                  }
               }

               return false;
            } else if (!EnchantmentHelper.method26334(var2)) {
               if (var2.getItem() instanceof ArmorItem) {
                  ArmorItem var7 = (ArmorItem)var1.getItem();
                  ArmorItem var9 = (ArmorItem)var2.getItem();
                  if (var7.method11807() == var9.method11807()) {
                     return var7.method11808() == var9.method11808() ? this.method4251(var1, var2) : var7.method11808() > var9.method11808();
                  } else {
                     return var7.method11807() > var9.method11807();
                  }
               } else {
                  return true;
               }
            } else {
               return false;
            }
         } else if (var2.getItem() instanceof ItemSword) {
            ItemSword var5 = (ItemSword)var1.getItem();
            ItemSword var6 = (ItemSword)var2.getItem();
            return var5.method11784() == var6.method11784() ? this.method4251(var1, var2) : var5.method11784() > var6.method11784();
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public boolean method4251(ItemStack var1, ItemStack var2) {
      if (var1.method32117() >= var2.method32117() && (!var1.method32141() || var2.method32141())) {
         return var1.method32141() && var2.method32141()
            ? var1.method32142().method97().stream().anyMatch(var0 -> !var0.equals("Damage"))
               && !var2.method32142().method97().stream().anyMatch(var0 -> !var0.equals("Damage"))
            : false;
      } else {
         return true;
      }
   }

   public boolean method4252(ItemStack var1) {
      return true;
   }

   public boolean method4253(ItemStack var1) {
      return this.method4252(var1);
   }

   public boolean method4254(double var1) {
      return true;
   }

   public boolean method4255() {
      return this.isPassenger();
   }

   public boolean method4256() {
      return false;
   }

   @Override
   public void method3447() {
      if (this.world.method6997() == Difficulty.field14351 && this.method4256()) {
         this.remove();
      } else if (!this.method4282() && !this.method4255()) {
         PlayerEntity var3 = this.world.method7185(this, -1.0);
         if (Class9299.field42844.method20214()) {
            Object var4 = Class9299.field42844.method20223(this);
            if (var4 != Class9561.field44533) {
               if (var4 == Class9561.field44532) {
                  this.remove();
                  var3 = null;
               }
            } else {
               this.field4973 = 0;
               var3 = null;
            }
         }

         if (var3 != null) {
            double var5 = var3.getDistanceSq(this);
            int var7 = this.getType().method33209().method522();
            int var8 = var7 * var7;
            if (var5 > (double)var8 && this.method4254(var5)) {
               this.remove();
            }

            int var9 = this.getType().method33209().method523();
            int var10 = var9 * var9;
            if (this.field4973 > 600 && this.rand.nextInt(800) == 0 && var5 > (double)var10 && this.method4254(var5)) {
               this.remove();
            } else if (var5 < (double)var10) {
               this.field4973 = 0;
            }
         }
      } else {
         this.field4973 = 0;
      }
   }

   @Override
   public final void updateEntityActionState() {
      this.field4973++;
      this.world.getProfiler().startSection("sensing");
      this.field5603.method35459();
      this.world.getProfiler().endSection();
      this.world.getProfiler().startSection("targetSelector");
      this.field5601.method20004();
      this.world.getProfiler().endSection();
      this.world.getProfiler().startSection("goalSelector");
      this.field5600.method20004();
      this.world.getProfiler().endSection();
      this.world.getProfiler().startSection("navigation");
      this.field5599.method21658();
      this.world.getProfiler().endSection();
      this.world.getProfiler().startSection("mob tick");
      this.updateAITasks();
      this.world.getProfiler().endSection();
      this.world.getProfiler().startSection("controls");
      this.world.getProfiler().startSection("move");
      this.field5596.method20810();
      this.world.getProfiler().endStartSection("look");
      this.field5595.method28037();
      this.world.getProfiler().endStartSection("jump");
      this.field5597.method27048();
      this.world.getProfiler().endSection();
      this.world.getProfiler().endSection();
      this.method4257();
   }

   public void method4257() {
      Class7393.method23620(this.world, this, this.field5600);
   }

   public void updateAITasks() {
   }

   public int method4259() {
      return 40;
   }

   public int method4260() {
      return 75;
   }

   public int method4261() {
      return 10;
   }

   public void method4262(Entity var1, float var2, float var3) {
      double var6 = var1.getPosX() - this.getPosX();
      double var8 = var1.getPosZ() - this.getPosZ();
      double var10;
      if (!(var1 instanceof LivingEntity)) {
         var10 = (var1.getBoundingBox().minY + var1.getBoundingBox().maxY) / 2.0 - this.getPosYEye();
      } else {
         LivingEntity var12 = (LivingEntity)var1;
         var10 = var12.getPosYEye() - this.getPosYEye();
      }

      double var13 = (double) MathHelper.sqrt(var6 * var6 + var8 * var8);
      float var15 = (float)(MathHelper.method37814(var8, var6) * 180.0F / (float)Math.PI) - 90.0F;
      float var16 = (float)(-(MathHelper.method37814(var10, var13) * 180.0F / (float)Math.PI));
      this.rotationPitch = this.method4263(this.rotationPitch, var16, var3);
      this.rotationYaw = this.method4263(this.rotationYaw, var15, var2);
   }

   private float method4263(float var1, float var2, float var3) {
      float var6 = MathHelper.method37792(var2 - var1);
      if (var6 > var3) {
         var6 = var3;
      }

      if (var6 < -var3) {
         var6 = -var3;
      }

      return var1 + var6;
   }

   public static boolean method4264(EntityType<? extends MobEntity> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      BlockPos var7 = var3.down();
      return var2 == Class2202.field14393 || var1.getBlockState(var7).method23385(var1, var7, var0);
   }

   public boolean method4265(Class1660 var1, Class2202 var2) {
      return true;
   }

   public boolean method4266(Class1662 var1) {
      return !var1.method7014(this.getBoundingBox()) && var1.checkNoEntityCollision(this);
   }

   public int method4267() {
      return 4;
   }

   public boolean method4268(int var1) {
      return false;
   }

   @Override
   public int getMaxFallHeight() {
      if (this.method4232() != null) {
         int var3 = (int)(this.getHealth() - this.method3075() * 0.33F);
         var3 -= (3 - this.world.method6997().getId()) * 4;
         if (var3 < 0) {
            var3 = 0;
         }

         return var3 + 3;
      } else {
         return 3;
      }
   }

   @Override
   public Iterable<ItemStack> method2946() {
      return this.field5604;
   }

   @Override
   public Iterable<ItemStack> getArmorInventoryList() {
      return this.field5606;
   }

   @Override
   public ItemStack getItemStackFromSlot(EquipmentSlotType var1) {
      switch (Class8979.field40589[var1.method8772().ordinal()]) {
         case 1:
            return this.field5604.get(var1.method8773());
         case 2:
            return this.field5606.get(var1.method8773());
         default:
            return ItemStack.EMPTY;
      }
   }

   @Override
   public void setItemStackToSlot(EquipmentSlotType var1, ItemStack var2) {
      switch (Class8979.field40589[var1.method8772().ordinal()]) {
         case 1:
            this.field5604.set(var1.method8773(), var2);
            break;
         case 2:
            this.field5606.set(var1.method8773(), var2);
      }
   }

   @Override
   public void dropSpecialItems(DamageSource var1, int var2, boolean var3) {
      super.dropSpecialItems(var1, var2, var3);

      for (EquipmentSlotType var9 : EquipmentSlotType.values()) {
         ItemStack var10 = this.getItemStackFromSlot(var9);
         float var11 = this.method4269(var9);
         boolean var12 = var11 > 1.0F;
         if (!var10.isEmpty()
            && !EnchantmentHelper.method26335(var10)
            && (var3 || var12)
            && Math.max(this.rand.nextFloat() - (float)var2 * 0.01F, 0.0F) < var11) {
            if (!var12 && var10.method32115()) {
               var10.method32118(var10.method32119() - this.rand.nextInt(1 + this.rand.nextInt(Math.max(var10.method32119() - 3, 1))));
            }

            this.method3302(var10);
            this.setItemStackToSlot(var9, ItemStack.EMPTY);
         }
      }
   }

   public float method4269(EquipmentSlotType var1) {
      float var4;
      switch (Class8979.field40589[var1.method8772().ordinal()]) {
         case 1:
            var4 = this.field5605[var1.method8773()];
            break;
         case 2:
            var4 = this.field5607[var1.method8773()];
            break;
         default:
            var4 = 0.0F;
      }

      return var4;
   }

   public void method4270(Class9755 var1) {
      if (this.rand.nextFloat() < 0.15F * var1.method38330()) {
         int var4 = this.rand.nextInt(2);
         float var5 = this.world.method6997() != Difficulty.field14354 ? 0.25F : 0.1F;
         if (this.rand.nextFloat() < 0.095F) {
            var4++;
         }

         if (this.rand.nextFloat() < 0.095F) {
            var4++;
         }

         if (this.rand.nextFloat() < 0.095F) {
            var4++;
         }

         boolean var6 = true;

         for (EquipmentSlotType var10 : EquipmentSlotType.values()) {
            if (var10.method8772() == Class1969.field12837) {
               ItemStack var11 = this.getItemStackFromSlot(var10);
               if (!var6 && this.rand.nextFloat() < var5) {
                  break;
               }

               var6 = false;
               if (var11.isEmpty()) {
                  Item var12 = method4272(var10, var4);
                  if (var12 != null) {
                     this.setItemStackToSlot(var10, new ItemStack(var12));
                  }
               }
            }
         }
      }
   }

   public static EquipmentSlotType method4271(ItemStack var0) {
      if (Class9299.field42922.method20214()) {
         EquipmentSlotType var3 = (EquipmentSlotType)Class9299.method35070(var0, Class9299.field42922);
         if (var3 != null) {
            return var3;
         }
      }

      Item var4 = var0.getItem();
      if (var4 != Blocks.field36589.method11581() && (!(var4 instanceof Class3292) || !(((Class3292)var4).method11845() instanceof Class3251))) {
         if (var4 instanceof ArmorItem) {
            return ((ArmorItem)var4).method11805();
         } else if (var4 != Items.field38120) {
            return !Class9561.method37052(var0, (PlayerEntity)null) ? EquipmentSlotType.field13731 : EquipmentSlotType.OFFHAND;
         } else {
            return EquipmentSlotType.field13735;
         }
      } else {
         return EquipmentSlotType.field13736;
      }
   }

   @Nullable
   public static Item method4272(EquipmentSlotType var0, int var1) {
      switch (Class8979.field40590[var0.ordinal()]) {
         case 1:
            if (var1 == 0) {
               return Items.field37844;
            } else if (var1 == 1) {
               return Items.field37860;
            } else if (var1 == 2) {
               return Items.field37848;
            } else if (var1 == 3) {
               return Items.field37852;
            } else if (var1 == 4) {
               return Items.field37856;
            }
         case 2:
            if (var1 == 0) {
               return Items.field37845;
            } else if (var1 == 1) {
               return Items.field37861;
            } else if (var1 == 2) {
               return Items.field37849;
            } else if (var1 == 3) {
               return Items.field37853;
            } else if (var1 == 4) {
               return Items.field37857;
            }
         case 3:
            if (var1 == 0) {
               return Items.field37846;
            } else if (var1 == 1) {
               return Items.field37862;
            } else if (var1 == 2) {
               return Items.field37850;
            } else if (var1 == 3) {
               return Items.field37854;
            } else if (var1 == 4) {
               return Items.field37858;
            }
         case 4:
            if (var1 == 0) {
               return Items.field37847;
            } else if (var1 == 1) {
               return Items.field37863;
            } else if (var1 == 2) {
               return Items.field37851;
            } else if (var1 == 3) {
               return Items.field37855;
            } else if (var1 == 4) {
               return Items.field37859;
            }
         default:
            return null;
      }
   }

   public void method4273(Class9755 var1) {
      float var4 = var1.method38330();
      this.method4274(var4);

      for (EquipmentSlotType var8 : EquipmentSlotType.values()) {
         if (var8.method8772() == Class1969.field12837) {
            this.method4275(var4, var8);
         }
      }
   }

   public void method4274(float var1) {
      if (!this.getHeldItemMainhand().isEmpty() && this.rand.nextFloat() < 0.25F * var1) {
         this.setItemStackToSlot(
            EquipmentSlotType.field13731, EnchantmentHelper.method26342(this.rand, this.getHeldItemMainhand(), (int)(5.0F + var1 * (float)this.rand.nextInt(18)), false)
         );
      }
   }

   public void method4275(float var1, EquipmentSlotType var2) {
      ItemStack var5 = this.getItemStackFromSlot(var2);
      if (!var5.isEmpty() && this.rand.nextFloat() < 0.5F * var1) {
         this.setItemStackToSlot(var2, EnchantmentHelper.method26342(this.rand, var5, (int)(5.0F + var1 * (float)this.rand.nextInt(18)), false));
      }
   }

   @Nullable
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, CompoundNBT var5) {
      this.getAttribute(Attributes.field42106).method38668(new AttributeModifier("Random spawn bonus", this.rand.nextGaussian() * 0.05, AttributeModifier.Operation.field13353));
      if (!(this.rand.nextFloat() < 0.05F)) {
         this.method4303(false);
      } else {
         this.method4303(true);
      }

      return var4;
   }

   public boolean method4277() {
      return false;
   }

   public void method4278() {
      this.field5609 = true;
   }

   public void method4279(EquipmentSlotType var1, float var2) {
      switch (Class8979.field40589[var1.method8772().ordinal()]) {
         case 1:
            this.field5605[var1.method8773()] = var2;
            break;
         case 2:
            this.field5607[var1.method8773()] = var2;
      }
   }

   public boolean method4280() {
      return this.field5608;
   }

   public void method4281(boolean var1) {
      this.field5608 = var1;
   }

   @Override
   public boolean canPickUpItem(ItemStack var1) {
      EquipmentSlotType var4 = method4271(var1);
      return this.getItemStackFromSlot(var4).isEmpty() && this.method4280();
   }

   public boolean method4282() {
      return this.field5609;
   }

   @Override
   public final ActionResultType processInitialInteract(PlayerEntity var1, Hand var2) {
      if (this.isAlive()) {
         if (this.method4297() != var1) {
            ActionResultType var5 = this.method4283(var1, var2);
            if (!var5.isSuccessOrConsume()) {
               var5 = this.method4285(var1, var2);
               return !var5.isSuccessOrConsume() ? super.processInitialInteract(var1, var2) : var5;
            } else {
               return var5;
            }
         } else {
            this.method4294(true, !var1.abilities.isCreativeMode);
            return ActionResultType.method9002(this.world.isRemote);
         }
      } else {
         return ActionResultType.field14820;
      }
   }

   private ActionResultType method4283(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      if (var5.getItem() == Items.LEAD && this.method4295(var1)) {
         this.method4298(var1, true);
         var5.method32182(1);
         return ActionResultType.method9002(this.world.isRemote);
      } else {
         if (var5.getItem() == Items.field38088) {
            ActionResultType var6 = var5.method32125(var1, this, var2);
            if (var6.isSuccessOrConsume()) {
               return var6;
            }
         }

         if (!(var5.getItem() instanceof SpawnEggItem)) {
            return ActionResultType.field14820;
         } else if (!(this.world instanceof ServerWorld)) {
            return ActionResultType.field14819;
         } else {
            SpawnEggItem var8 = (SpawnEggItem)var5.getItem();
            Optional<MobEntity> var7 = var8.method11856(var1, this, (EntityType<? extends MobEntity>)this.getType(), (ServerWorld)this.world, this.getPositionVec(), var5);
            var7.ifPresent(var2x -> this.method4284(var1, var2x));
            return !var7.isPresent() ? ActionResultType.field14820 : ActionResultType.SUCCESS;
         }
      }
   }

   public void method4284(PlayerEntity var1, MobEntity var2) {
   }

   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      return ActionResultType.field14820;
   }

   public boolean method4286() {
      return this.method4287(this.getPosition());
   }

   public boolean method4287(BlockPos var1) {
      return this.field5617 != -1.0F ? this.field5616.method8318(var1) < (double)(this.field5617 * this.field5617) : true;
   }

   public void method4288(BlockPos var1, int var2) {
      this.field5616 = var1;
      this.field5617 = (float)var2;
   }

   public BlockPos method4289() {
      return this.field5616;
   }

   public float method4290() {
      return this.field5617;
   }

   public boolean method4291() {
      return this.field5617 != -1.0F;
   }

   @Nullable
   public <T extends MobEntity> T method4292(EntityType<T> var1, boolean var2) {
      if (this.removed) {
         return null;
      } else {
         MobEntity var5 = (MobEntity)var1.create(this.world);
         var5.method3364(this);
         var5.method4308(this.isChild());
         var5.method4302(this.method4305());
         if (this.method3381()) {
            var5.method3379(this.method3380());
            var5.method3382(this.method3383());
         }

         if (this.method4282()) {
            var5.method4278();
         }

         var5.method3363(this.method3362());
         if (var2) {
            var5.method4281(this.method4280());

            for (EquipmentSlotType var9 : EquipmentSlotType.values()) {
               ItemStack var10 = this.getItemStackFromSlot(var9);
               if (!var10.isEmpty()) {
                  var5.setItemStackToSlot(var9, var10.copy());
                  var5.method4279(var9, this.method4269(var9));
                  var10.method32180(0);
               }
            }
         }

         this.world.addEntity(var5);
         if (this.isPassenger()) {
            Entity var11 = this.getRidingEntity();
            this.stopRiding();
            var5.startRiding(var11, true);
         }

         this.remove();
         return (T)var5;
      }
   }

   public void method4293() {
      if (this.field5615 != null) {
         this.method4300();
      }

      if (this.field5613 != null && (!this.isAlive() || !this.field5613.isAlive())) {
         this.method4294(true, true);
      }
   }

   public void method4294(boolean var1, boolean var2) {
      if (this.field5613 != null) {
         this.forceSpawn = false;
         if (!(this.field5613 instanceof PlayerEntity)) {
            this.field5613.forceSpawn = false;
         }

         this.field5613 = null;
         this.field5615 = null;
         if (!this.world.isRemote && var2) {
            this.entityDropItem(Items.LEAD);
         }

         if (!this.world.isRemote && var1 && this.world instanceof ServerWorld) {
            ((ServerWorld)this.world).getChunkProvider().sendToTrackingAndSelf(this, new SMountEntityPacket(this, (Entity)null));
         }
      }
   }

   public boolean method4295(PlayerEntity var1) {
      return !this.method4296() && !(this instanceof Class1008);
   }

   public boolean method4296() {
      return this.field5613 != null;
   }

   @Nullable
   public Entity method4297() {
      if (this.field5613 == null && this.field5614 != 0 && this.world.isRemote) {
         this.field5613 = this.world.getEntityByID(this.field5614);
      }

      return this.field5613;
   }

   public void method4298(Entity var1, boolean var2) {
      this.field5613 = var1;
      this.field5615 = null;
      this.forceSpawn = true;
      if (!(this.field5613 instanceof PlayerEntity)) {
         this.field5613.forceSpawn = true;
      }

      if (!this.world.isRemote && var2 && this.world instanceof ServerWorld) {
         ((ServerWorld)this.world).getChunkProvider().sendToTrackingAndSelf(this, new SMountEntityPacket(this, this.field5613));
      }

      if (this.isPassenger()) {
         this.stopRiding();
      }
   }

   public void method4299(int var1) {
      this.field5614 = var1;
      this.method4294(false, false);
   }

   @Override
   public boolean startRiding(Entity var1, boolean var2) {
      boolean var5 = super.startRiding(var1, var2);
      if (var5 && this.method4296()) {
         this.method4294(true, true);
      }

      return var5;
   }

   private void method4300() {
      if (this.field5615 != null && this.world instanceof ServerWorld) {
         if (!this.field5615.method106("UUID")) {
            if (this.field5615.contains("X", 99) && this.field5615.contains("Y", 99) && this.field5615.contains("Z", 99)) {
               BlockPos var3 = new BlockPos(this.field5615.getInt("X"), this.field5615.getInt("Y"), this.field5615.getInt("Z"));
               this.method4298(LeashKnotEntity.method4087(this.world, var3), true);
               return;
            }
         } else {
            UUID var5 = this.field5615.method105("UUID");
            Entity var4 = ((ServerWorld)this.world).getEntityByUuid(var5);
            if (var4 != null) {
               this.method4298(var4, true);
               return;
            }
         }

         if (this.ticksExisted > 100) {
            this.entityDropItem(Items.LEAD);
            this.field5615 = null;
         }
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

      if (!var2.isEmpty() && !method4301(var5, var2) && var5 != EquipmentSlotType.field13736) {
         return false;
      } else {
         this.setItemStackToSlot(var5, var2);
         return true;
      }
   }

   @Override
   public boolean canPassengerSteer() {
      return this.method4277() && super.canPassengerSteer();
   }

   public static boolean method4301(EquipmentSlotType var0, ItemStack var1) {
      EquipmentSlotType var4 = method4271(var1);
      return var4 == var0 || var4 == EquipmentSlotType.field13731 && var0 == EquipmentSlotType.OFFHAND || var4 == EquipmentSlotType.OFFHAND && var0 == EquipmentSlotType.field13731;
   }

   @Override
   public boolean isServerWorld() {
      return super.isServerWorld() && !this.method4305();
   }

   public void method4302(boolean var1) {
      byte var4 = this.dataManager.<Byte>method35445(field5592);
      this.dataManager.method35446(field5592, !var1 ? (byte)(var4 & -2) : (byte)(var4 | 1));
   }

   public void method4303(boolean var1) {
      byte var4 = this.dataManager.<Byte>method35445(field5592);
      this.dataManager.method35446(field5592, !var1 ? (byte)(var4 & -3) : (byte)(var4 | 2));
   }

   public void method4304(boolean var1) {
      byte var4 = this.dataManager.<Byte>method35445(field5592);
      this.dataManager.method35446(field5592, !var1 ? (byte)(var4 & -5) : (byte)(var4 | 4));
   }

   public boolean method4305() {
      return (this.dataManager.<Byte>method35445(field5592) & 1) != 0;
   }

   public boolean method4306() {
      return (this.dataManager.<Byte>method35445(field5592) & 2) != 0;
   }

   public boolean method4307() {
      return (this.dataManager.<Byte>method35445(field5592) & 4) != 0;
   }

   public void method4308(boolean var1) {
   }

   @Override
   public HandSide getPrimaryHand() {
      return !this.method4306() ? HandSide.field14418 : HandSide.field14417;
   }

   @Override
   public boolean canAttack(LivingEntity var1) {
      return var1.getType() == EntityType.PLAYER && ((PlayerEntity)var1).abilities.disableDamage ? false : super.canAttack(var1);
   }

   @Override
   public boolean attackEntityAsMob(Entity var1) {
      float var4 = (float)this.getAttributeValue(Attributes.field42110);
      float var5 = (float)this.getAttributeValue(Attributes.field42111);
      if (var1 instanceof LivingEntity) {
         var4 += EnchantmentHelper.method26318(this.getHeldItemMainhand(), ((LivingEntity)var1).getCreatureAttribute());
         var5 += (float) EnchantmentHelper.method26323(this);
      }

      int var6 = EnchantmentHelper.method26324(this);
      if (var6 > 0) {
         var1.setFire(var6 * 4);
      }

      boolean var7 = var1.attackEntityFrom(DamageSource.method31115(this), var4);
      if (var7) {
         if (var5 > 0.0F && var1 instanceof LivingEntity) {
            ((LivingEntity)var1)
               .applyKnockback(
                  var5 * 0.5F,
                  (double) MathHelper.sin(this.rotationYaw * (float) (Math.PI / 180.0)),
                  (double)(-MathHelper.cos(this.rotationYaw * (float) (Math.PI / 180.0)))
               );
            this.setMotion(this.getMotion().method11347(0.6, 1.0, 0.6));
         }

         if (var1 instanceof PlayerEntity) {
            PlayerEntity var8 = (PlayerEntity)var1;
            this.method4309(var8, this.getHeldItemMainhand(), !var8.isHandActive() ? ItemStack.EMPTY : var8.getActiveItemStack());
         }

         this.applyEnchantments(this, var1);
         this.method3020(var1);
      }

      return var7;
   }

   private void method4309(PlayerEntity var1, ItemStack var2, ItemStack var3) {
      if (!var2.isEmpty() && !var3.isEmpty() && var2.getItem() instanceof Class3265 && var3.getItem() == Items.field38119) {
         float var6 = 0.25F + (float) EnchantmentHelper.method26327(this) * 0.05F;
         if (this.rand.nextFloat() < var6) {
            var1.method2976().method19638(Items.field38119, 100);
            this.world.setEntityState(var1, (byte)30);
         }
      }
   }

   public boolean method4310() {
      if (this.world.method6740() && !this.world.isRemote) {
         float var3 = this.getBrightness();
         BlockPos var4 = !(this.getRidingEntity() instanceof BoatEntity)
            ? new BlockPos(this.getPosX(), (double)Math.round(this.getPosY()), this.getPosZ())
            : new BlockPos(this.getPosX(), (double)Math.round(this.getPosY()), this.getPosZ()).up();
         if (var3 > 0.5F && this.rand.nextFloat() * 30.0F < (var3 - 0.4F) * 2.0F && this.world.method7022(var4)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public void handleFluidJump(ITag<Fluid> var1) {
      if (!this.method4230().method21675()) {
         this.setMotion(this.getMotion().add(0.0, 0.3, 0.0));
      } else {
         super.handleFluidJump(var1);
      }
   }

   @Override
   public void setDead() {
      super.setDead();
      this.method4294(true, false);
   }

   private boolean method4311() {
      if (!this.isChild()) {
         if (this.hurtTime <= 0) {
            if (this.ticksExisted >= 20) {
               List var3 = this.method4312(this.method3395());
               if (var3 != null) {
                  if (var3.size() == 1) {
                     Entity var4 = (Entity)var3.get(0);
                     double var5 = Math.max(Math.abs(this.getPosX() - var4.getPosX()) - 16.0, 0.0);
                     double var7 = Math.max(Math.abs(this.getPosZ() - var4.getPosZ()) - 16.0, 0.0);
                     double var9 = var5 * var5 + var7 * var7;
                     return !this.isInRangeToRenderDist(var9);
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private List method4312(World var1) {
      World var4 = this.method3395();
      if (!(var4 instanceof ClientWorld)) {
         if (!(var4 instanceof ServerWorld)) {
            return null;
         } else {
            ServerWorld var6 = (ServerWorld)var4;
            return var6.method6870();
         }
      } else {
         ClientWorld var5 = (ClientWorld)var4;
         return var5.method6870();
      }
   }

   private void method4313() {
      this.field4973++;
      if (this instanceof Class1009) {
         float var3 = this.getBrightness();
         if (var3 > 0.5F) {
            this.field4973 += 2;
         }
      }

      this.method3447();
   }
}
