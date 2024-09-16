package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.Random;
import java.util.function.Predicate;

public class Class1088 extends Class1018 {
   private static final DataParameter<BlockPos> field5956 = EntityDataManager.<BlockPos>createKey(Class1088.class, DataSerializers.field33401);
   private static final DataParameter<Boolean> field5957 = EntityDataManager.<Boolean>createKey(Class1088.class, DataSerializers.field33398);
   private static final DataParameter<Boolean> field5958 = EntityDataManager.<Boolean>createKey(Class1088.class, DataSerializers.field33398);
   private static final DataParameter<BlockPos> field5959 = EntityDataManager.<BlockPos>createKey(Class1088.class, DataSerializers.field33401);
   private static final DataParameter<Boolean> field5960 = EntityDataManager.<Boolean>createKey(Class1088.class, DataSerializers.field33398);
   private static final DataParameter<Boolean> field5961 = EntityDataManager.<Boolean>createKey(Class1088.class, DataSerializers.field33398);
   private int field5962;
   public static final Predicate<LivingEntity> field5963 = var0 -> var0.isChild() && !var0.isInWater();

   public Class1088(EntityType<? extends Class1088> var1, World var2) {
      super(var1, var2);
      this.method4224(Class2163.field14191, 0.0F);
      this.field5596 = new Class6838(this);
      this.stepHeight = 1.0F;
   }

   public void method5041(BlockPos var1) {
      this.dataManager.method35446(field5956, var1);
   }

   private BlockPos method5042() {
      return this.dataManager.<BlockPos>method35445(field5956);
   }

   private void method5043(BlockPos var1) {
      this.dataManager.method35446(field5959, var1);
   }

   private BlockPos method5044() {
      return this.dataManager.<BlockPos>method35445(field5959);
   }

   public boolean method5045() {
      return this.dataManager.<Boolean>method35445(field5957);
   }

   private void method5046(boolean var1) {
      this.dataManager.method35446(field5957, var1);
   }

   public boolean method5047() {
      return this.dataManager.<Boolean>method35445(field5958);
   }

   private void method5048(boolean var1) {
      this.field5962 = !var1 ? 0 : 1;
      this.dataManager.method35446(field5958, var1);
   }

   private boolean method5049() {
      return this.dataManager.<Boolean>method35445(field5960);
   }

   private void method5050(boolean var1) {
      this.dataManager.method35446(field5960, var1);
   }

   private boolean method5051() {
      return this.dataManager.<Boolean>method35445(field5961);
   }

   private void method5052(boolean var1) {
      this.dataManager.method35446(field5961, var1);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5956, BlockPos.ZERO);
      this.dataManager.register(field5957, false);
      this.dataManager.register(field5959, BlockPos.ZERO);
      this.dataManager.register(field5960, false);
      this.dataManager.register(field5961, false);
      this.dataManager.register(field5958, false);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putInt("HomePosX", this.method5042().getX());
      var1.putInt("HomePosY", this.method5042().getY());
      var1.putInt("HomePosZ", this.method5042().getZ());
      var1.putBoolean("HasEgg", this.method5045());
      var1.putInt("TravelPosX", this.method5044().getX());
      var1.putInt("TravelPosY", this.method5044().getY());
      var1.putInt("TravelPosZ", this.method5044().getZ());
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      int var4 = var1.getInt("HomePosX");
      int var5 = var1.getInt("HomePosY");
      int var6 = var1.getInt("HomePosZ");
      this.method5041(new BlockPos(var4, var5, var6));
      super.readAdditional(var1);
      this.method5046(var1.getBoolean("HasEgg"));
      int var7 = var1.getInt("TravelPosX");
      int var8 = var1.getInt("TravelPosY");
      int var9 = var1.getInt("TravelPosZ");
      this.method5043(new BlockPos(var7, var8, var9));
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, CompoundNBT var5) {
      this.method5041(this.getPosition());
      this.method5043(BlockPos.ZERO);
      return super.method4276(var1, var2, var3, var4, var5);
   }

   public static boolean method5053(EntityType<Class1088> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      return var3.getY() < var1.method6776() + 4 && Class3441.method12114(var1, var3) && var1.method7021(var3, 0) > 8;
   }

   @Override
   public void method4219() {
      this.field5600.addGoal(0, new Class2751(this, 1.2));
      this.field5600.addGoal(1, new Class2787(this, 1.0));
      this.field5600.addGoal(1, new Class2630(this, 1.0));
      this.field5600.addGoal(2, new Class2731(this, 1.1, Blocks.SEAGRASS.method11581()));
      this.field5600.addGoal(3, new Class2635(this, 1.0));
      this.field5600.addGoal(4, new Class2760(this, 1.0));
      this.field5600.addGoal(7, new Class2594(this, 1.0));
      this.field5600.addGoal(8, new Class2612(this, PlayerEntity.class, 8.0F));
      this.field5600.addGoal(9, new Class2743(this, 1.0, 100));
   }

   public static Class7037 method5054() {
      return MobEntity.method4220().method21849(Attributes.field42105, 30.0).method21849(Attributes.MOVEMENT_SPEED, 0.25);
   }

   @Override
   public boolean method2952() {
      return false;
   }

   @Override
   public boolean canBreatheUnderwater() {
      return true;
   }

   @Override
   public CreatureAttribute getCreatureAttribute() {
      return CreatureAttribute.field33509;
   }

   @Override
   public int method4236() {
      return 200;
   }

   @Nullable
   @Override
   public SoundEvent getAmbientSound() {
      return !this.isInWater() && this.onGround && !this.isChild() ? SoundEvents.field27164 : super.getAmbientSound();
   }

   @Override
   public void playSwimSound(float var1) {
      super.playSwimSound(var1 * 1.5F);
   }

   @Override
   public SoundEvent method2859() {
      return SoundEvents.field27175;
   }

   @Nullable
   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return !this.isChild() ? SoundEvents.field27170 : SoundEvents.field27171;
   }

   @Nullable
   @Override
   public SoundEvent getDeathSound() {
      return !this.isChild() ? SoundEvents.field27165 : SoundEvents.field27166;
   }

   @Override
   public void playStepSound(BlockPos var1, BlockState var2) {
      SoundEvent var5 = !this.isChild() ? SoundEvents.field27173 : SoundEvents.field27174;
      this.playSound(var5, 0.15F, 1.0F);
   }

   @Override
   public boolean method4502() {
      return super.method4502() && !this.method5045();
   }

   @Override
   public float determineNextStepDistance() {
      return this.distanceWalkedOnStepModified + 0.15F;
   }

   @Override
   public float getRenderScale() {
      return !this.isChild() ? 1.0F : 0.3F;
   }

   @Override
   public Class6990 method4221(World var1) {
      return new Class6998(this, var1);
   }

   @Nullable
   @Override
   public Class1045 method4389(ServerWorld var1, Class1045 var2) {
      return EntityType.field41096.create(var1);
   }

   @Override
   public boolean method4381(ItemStack var1) {
      return var1.getItem() == Blocks.SEAGRASS.method11581();
   }

   @Override
   public float method4339(BlockPos var1, IWorldReader var2) {
      if (!this.method5049() && var2.getFluidState(var1).method23486(FluidTags.field40469)) {
         return 10.0F;
      } else {
         return !Class3441.method12114(var2, var1) ? var2.method7009(var1) - 0.5F : 10.0F;
      }
   }

   @Override
   public void livingEntity() {
      super.livingEntity();
      if (this.isAlive() && this.method5047() && this.field5962 >= 1 && this.field5962 % 5 == 0) {
         BlockPos var3 = this.getPosition();
         if (Class3441.method12114(this.world, var3)) {
            this.world.playEvent(2001, var3, Block.getStateId(Blocks.SAND.method11579()));
         }
      }
   }

   @Override
   public void method4679() {
      super.method4679();
      if (!this.isChild() && this.world.getGameRules().getBoolean(Class5462.field24227)) {
         this.entityDropItem(Items.field37793, 1);
      }
   }

   @Override
   public void travel(Vector3d var1) {
      if (this.isServerWorld() && this.isInWater()) {
         this.moveRelative(0.1F, var1);
         this.move(MoverType.SELF, this.getMotion());
         this.setMotion(this.getMotion().scale(0.9));
         if (this.method4232() == null && (!this.method5049() || !this.method5042().method8317(this.getPositionVec(), 20.0))) {
            this.setMotion(this.getMotion().add(0.0, -0.005, 0.0));
         }
      } else {
         super.travel(var1);
      }
   }

   @Override
   public boolean method4295(PlayerEntity var1) {
      return false;
   }

   @Override
   public void method3353(ServerWorld var1, Class906 var2) {
      this.attackEntityFrom(DamageSource.field38993, Float.MAX_VALUE);
   }

   // $VF: synthetic method
   public static BlockPos method5056(Class1088 var0) {
      return var0.method5042();
   }

   // $VF: synthetic method
   public static void method5057(Class1088 var0, boolean var1) {
      var0.method5050(var1);
   }

   // $VF: synthetic method
   public static boolean method5058(Class1088 var0) {
      return var0.method5049();
   }

   // $VF: synthetic method
   public static int method5059(Class1088 var0) {
      return var0.field5962;
   }

   // $VF: synthetic method
   public static void method5060(Class1088 var0, boolean var1) {
      var0.method5048(var1);
   }

   // $VF: synthetic method
   public static Random method5061(Class1088 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static void method5062(Class1088 var0, boolean var1) {
      var0.method5046(var1);
   }

   // $VF: synthetic method
   public static int method5063(Class1088 var0) {
      return var0.field5962++;
   }

   // $VF: synthetic method
   public static boolean method5064(Class1088 var0) {
      return var0.method5051();
   }

   // $VF: synthetic method
   public static Random method5065(Class1088 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static void method5066(Class1088 var0, BlockPos var1) {
      var0.method5043(var1);
   }

   // $VF: synthetic method
   public static void method5067(Class1088 var0, boolean var1) {
      var0.method5052(var1);
   }

   // $VF: synthetic method
   public static BlockPos method5068(Class1088 var0) {
      return var0.method5044();
   }
}
