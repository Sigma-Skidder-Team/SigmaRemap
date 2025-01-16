package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.network.DebugPacketSender;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.particles.IParticleData;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.Difficulty;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.Random;
import java.util.UUID;

public class BeeEntity extends AnimalEntity implements IAngerable, Class1016 {
   private static final DataParameter<Byte> field5684 = EntityDataManager.<Byte>createKey(BeeEntity.class, DataSerializers.field33390);
   private static final DataParameter<Integer> field5685 = EntityDataManager.<Integer>createKey(BeeEntity.class, DataSerializers.VARINT);
   private static final RangedInteger field5686 = TickRangeConverter.convertRange(20, 39);
   private UUID field5687;
   private float field5688;
   private float field5689;
   private int field5690;
   private int field5691;
   private int field5692;
   private int field5693;
   private int field5694 = 0;
   private int field5695 = 0;
   private BlockPos field5696 = null;
   private BlockPos field5697 = null;
   private Class2663 field5698;
   private Class2664 field5699;
   private Class2665 field5700;
   private int field5701;

   public BeeEntity(EntityType<? extends BeeEntity> var1, World var2) {
      super(var1, var2);
      this.field5596 = new Class6832(this, 20, true);
      this.field5595 = new Class8094(this, this);
      this.method4224(PathNodeType.DANGER_FIRE, -1.0F);
      this.method4224(PathNodeType.WATER, -1.0F);
      this.method4224(PathNodeType.WATER_BORDER, 16.0F);
      this.method4224(PathNodeType.COCOA, -1.0F);
      this.method4224(PathNodeType.FENCE, -1.0F);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5684, (byte)0);
      this.dataManager.register(field5685, 0);
   }

   @Override
   public float getBlockPathWeight(BlockPos var1, IWorldReader var2) {
      return !var2.getBlockState(var1).isAir() ? 0.0F : 10.0F;
   }

   @Override
   public void method4219() {
      this.field5600.addGoal(0, new Class2651(this, this, 1.4F, true));
      this.field5600.addGoal(1, new Class2666(this, null));
      this.field5600.addGoal(2, new Class2785(this, 1.0));
      this.field5600.addGoal(3, new Class2680(this, 1.25, Class120.method342(ItemTags.field26107), false));
      this.field5698 = new Class2663(this);
      this.field5600.addGoal(4, this.field5698);
      this.field5600.addGoal(5, new Class2764(this, 1.25));
      this.field5600.addGoal(5, new Class2667(this, null));
      this.field5699 = new Class2664(this);
      this.field5600.addGoal(5, this.field5699);
      this.field5700 = new Class2665(this);
      this.field5600.addGoal(6, this.field5700);
      this.field5600.addGoal(7, new Class2662(this, null));
      this.field5600.addGoal(8, new Class2687(this));
      this.field5600.addGoal(9, new Class2603(this));
      this.field5601.addGoal(1, new Class2708(this, this).method10918(new Class[0]));
      this.field5601.addGoal(2, new Class2715(this));
      this.field5601.addGoal(3, new ResetAngerGoal<BeeEntity>(this, true));
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      if (this.method4432()) {
         var1.put("HivePos", NBTUtil.writeBlockPos(this.method4433()));
      }

      if (this.method4422()) {
         var1.put("FlowerPos", NBTUtil.writeBlockPos(this.method4421()));
      }

      var1.putBoolean("HasNectar", this.method4438());
      var1.putBoolean("HasStung", this.method4440());
      var1.putInt("TicksSincePollination", this.field5691);
      var1.putInt("CannotEnterHiveTicks", this.field5692);
      var1.putInt("CropsGrownSincePollination", this.field5693);
      this.method4364(var1);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      this.field5697 = null;
      if (var1.contains("HivePos")) {
         this.field5697 = NBTUtil.readBlockPos(var1.getCompound("HivePos"));
      }

      this.field5696 = null;
      if (var1.contains("FlowerPos")) {
         this.field5696 = NBTUtil.readBlockPos(var1.getCompound("FlowerPos"));
      }

      super.readAdditional(var1);
      this.method4439(var1.getBoolean("HasNectar"));
      this.method4441(var1.getBoolean("HasStung"));
      this.field5691 = var1.getInt("TicksSincePollination");
      this.field5692 = var1.getInt("CannotEnterHiveTicks");
      this.field5693 = var1.getInt("CropsGrownSincePollination");
      this.method4365((ServerWorld)this.world, var1);
   }

   @Override
   public boolean attackEntityAsMob(Entity var1) {
      boolean var4 = var1.attackEntityFrom(DamageSource.method31114(this), (float)((int)this.getAttributeValue(Attributes.ATTACK_DAMAGE)));
      if (var4) {
         this.applyEnchantments(this, var1);
         if (var1 instanceof LivingEntity) {
            ((LivingEntity)var1).method3079(((LivingEntity)var1).method3078() + 1);
            int var5 = 0;
            if (this.world.method6997() != Difficulty.NORMAL) {
               if (this.world.method6997() == Difficulty.HARD) {
                  var5 = 18;
               }
            } else {
               var5 = 10;
            }

            if (var5 > 0) {
               ((LivingEntity)var1).addPotionEffect(new EffectInstance(Effects.POISON, var5 * 20, 0));
            }
         }

         this.method4441(true);
         this.method4372();
         this.playSound(SoundEvents.field26393, 1.0F, 1.0F);
      }

      return var4;
   }

   @Override
   public void tick() {
      super.tick();
      if (this.method4438() && this.method4434() < 10 && this.rand.nextFloat() < 0.05F) {
         for (int var3 = 0; var3 < this.rand.nextInt(2) + 1; var3++) {
            this.method4419(
               this.world,
               this.getPosX() - 0.3F,
               this.getPosX() + 0.3F,
               this.getPosZ() - 0.3F,
               this.getPosZ() + 0.3F,
               this.getPosYHeight(0.5),
               ParticleTypes.field34111
            );
         }
      }

      this.method4428();
   }

   private void method4419(World var1, double var2, double var4, double var6, double var8, double var10, IParticleData var12) {
      var1.addParticle(
         var12,
         MathHelper.lerp(var1.rand.nextDouble(), var2, var4),
         var10,
         MathHelper.lerp(var1.rand.nextDouble(), var6, var8),
         0.0,
         0.0,
         0.0
      );
   }

   private void method4420(BlockPos var1) {
      Vector3d var4 = Vector3d.method11330(var1);
      int var5 = 0;
      BlockPos var6 = this.getPosition();
      int var7 = (int)var4.y - var6.getY();
      if (var7 <= 2) {
         if (var7 < -2) {
            var5 = -4;
         }
      } else {
         var5 = 4;
      }

      int var8 = 6;
      int var9 = 8;
      int var10 = var6.method8321(var1);
      if (var10 < 15) {
         var8 = var10 / 2;
         var9 = var10 / 2;
      }

      Vector3d var11 = Class8037.method27589(this, var8, var9, var5, var4, (float) (Math.PI / 10));
      if (var11 != null) {
         this.field5599.method21642(0.5F);
         this.field5599.method21654(var11.x, var11.y, var11.z, 1.0);
      }
   }

   @Nullable
   public BlockPos method4421() {
      return this.field5696;
   }

   public boolean method4422() {
      return this.field5696 != null;
   }

   public void method4423(BlockPos var1) {
      this.field5696 = var1;
   }

   private boolean method4424() {
      return this.field5691 > 3600;
   }

   private boolean method4425() {
      if (this.field5692 <= 0 && !Class2663.method10870(this.field5698) && !this.method4440() && this.method4232() == null) {
         boolean var3 = this.method4424() || this.world.method6795() || this.world.method6741() || this.method4438();
         return var3 && !this.method4430();
      } else {
         return false;
      }
   }

   public void method4426(int var1) {
      this.field5692 = var1;
   }

   public float method4427(float var1) {
      return MathHelper.lerp(var1, this.field5689, this.field5688);
   }

   private void method4428() {
      this.field5689 = this.field5688;
      if (!this.method4442()) {
         this.field5688 = Math.max(0.0F, this.field5688 - 0.24F);
      } else {
         this.field5688 = Math.min(1.0F, this.field5688 + 0.2F);
      }
   }

   @Override
   public void updateAITasks() {
      boolean var3 = this.method4440();
      if (!this.method3255()) {
         this.field5701 = 0;
      } else {
         this.field5701++;
      }

      if (this.field5701 > 20) {
         this.attackEntityFrom(DamageSource.field38999, 1.0F);
      }

      if (var3) {
         this.field5690++;
         if (this.field5690 % 5 == 0 && this.rand.nextInt(MathHelper.clamp(1200 - this.field5690, 1, 1200)) == 0) {
            this.attackEntityFrom(DamageSource.field39005, this.getHealth());
         }
      }

      if (!this.method4438()) {
         this.field5691++;
      }

      if (!this.world.isRemote) {
         this.method4366((ServerWorld)this.world, false);
      }
   }

   public void method4429() {
      this.field5691 = 0;
   }

   private boolean method4430() {
      if (this.field5697 == null) {
         return false;
      } else {
         TileEntity var3 = this.world.getTileEntity(this.field5697);
         return var3 instanceof BeehiveTileEntity && ((BeehiveTileEntity)var3).method3912();
      }
   }

   @Override
   public int method4348() {
      return this.dataManager.<Integer>method35445(field5685);
   }

   @Override
   public void method4347(int var1) {
      this.dataManager.method35446(field5685, var1);
   }

   @Override
   public UUID method4350() {
      return this.field5687;
   }

   @Override
   public void setAngerTarget(UUID var1) {
      this.field5687 = var1;
   }

   @Override
   public void method4346() {
      this.method4347(field5686.method29319(this.rand));
   }

   private boolean method4431(BlockPos var1) {
      TileEntity var4 = this.world.getTileEntity(var1);
      return !(var4 instanceof BeehiveTileEntity) ? false : !((BeehiveTileEntity)var4).method3914();
   }

   public boolean method4432() {
      return this.field5697 != null;
   }

   @Nullable
   public BlockPos method4433() {
      return this.field5697;
   }

   @Override
   public void method4257() {
      super.method4257();
      DebugPacketSender.method23623(this);
   }

   private int method4434() {
      return this.field5693;
   }

   private void method4435() {
      this.field5693 = 0;
   }

   private void method4436() {
      this.field5693++;
   }

   @Override
   public void livingTick() {
      super.livingTick();
      if (!this.world.isRemote) {
         if (this.field5692 > 0) {
            this.field5692--;
         }

         if (this.field5694 > 0) {
            this.field5694--;
         }

         if (this.field5695 > 0) {
            this.field5695--;
         }

         boolean var3 = this.method4369() && !this.method4440() && this.method4232() != null && this.method4232().getDistanceSq(this) < 4.0;
         this.method4443(var3);
         if (this.ticksExisted % 20 == 0 && !this.method4437()) {
            this.field5697 = null;
         }
      }
   }

   private boolean method4437() {
      if (!this.method4432()) {
         return false;
      } else {
         TileEntity var3 = this.world.getTileEntity(this.field5697);
         return var3 != null && var3.method3786() == TileEntityType.field21453;
      }
   }

   public boolean method4438() {
      return this.method4446(8);
   }

   private void method4439(boolean var1) {
      if (var1) {
         this.method4429();
      }

      this.method4445(8, var1);
   }

   public boolean method4440() {
      return this.method4446(4);
   }

   private void method4441(boolean var1) {
      this.method4445(4, var1);
   }

   private boolean method4442() {
      return this.method4446(2);
   }

   private void method4443(boolean var1) {
      this.method4445(2, var1);
   }

   private boolean method4444(BlockPos var1) {
      return !this.method4450(var1, 32);
   }

   private void method4445(int var1, boolean var2) {
      if (!var2) {
         this.dataManager.method35446(field5684, (byte)(this.dataManager.<Byte>method35445(field5684) & ~var1));
      } else {
         this.dataManager.method35446(field5684, (byte)(this.dataManager.<Byte>method35445(field5684) | var1));
      }
   }

   private boolean method4446(int var1) {
      return (this.dataManager.<Byte>method35445(field5684) & var1) != 0;
   }

   public static MutableAttribute method4447() {
      return MobEntity.method4220()
         .method21849(Attributes.MAX_HEALTH, 10.0)
         .method21849(Attributes.FLYING_SPEED, 0.6F)
         .method21849(Attributes.MOVEMENT_SPEED, 0.3F)
         .method21849(Attributes.ATTACK_DAMAGE, 2.0)
         .method21849(Attributes.FOLLOW_RANGE, 48.0);
   }

   @Override
   public Class6990 method4221(World var1) {
      Class6996 var4 = new Class6996(this, this, var1);
      var4.method21685(false);
      var4.method21674(false);
      var4.method21686(true);
      return var4;
   }

   @Override
   public boolean method4381(ItemStack var1) {
      return var1.getItem().method11743(ItemTags.field26107);
   }

   private boolean method4448(BlockPos var1) {
      return this.world.method6763(var1) && this.world.getBlockState(var1).getBlock().isIn(BlockTags.field32773);
   }

   @Override
   public void playStepSound(BlockPos var1, BlockState var2) {
   }

   @Override
   public SoundEvent getAmbientSound() {
      return null;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26390;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26389;
   }

   @Override
   public float getSoundVolume() {
      return 0.4F;
   }

   public BeeEntity method4389(ServerWorld var1, Class1045 var2) {
      return EntityType.BEE.create(var1);
   }

   @Override
   public float getStandingEyeHeight(Pose var1, EntitySize var2) {
      return !this.isChild() ? var2.field39969 * 0.5F : var2.field39969 * 0.5F;
   }

   @Override
   public boolean onLivingFall(float var1, float var2) {
      return false;
   }

   @Override
   public void updateFallState(double var1, boolean var3, BlockState var4, BlockPos var5) {
   }

   @Override
   public boolean makeFlySound() {
      return true;
   }

   public void method4449() {
      this.method4439(false);
      this.method4435();
   }

   @Override
   public boolean attackEntityFrom(DamageSource source, float var2) {
      if (!this.isInvulnerableTo(source)) {
         Entity var5 = source.getTrueSource();
         if (!this.world.isRemote) {
            Class2663.method10871(this.field5698);
         }

         return super.attackEntityFrom(source, var2);
      } else {
         return false;
      }
   }

   @Override
   public CreatureAttribute getCreatureAttribute() {
      return CreatureAttribute.field33507;
   }

   @Override
   public void handleFluidJump(ITag<Fluid> var1) {
      this.setMotion(this.getMotion().add(0.0, 0.01, 0.0));
   }

   @Override
   public Vector3d func_241205_ce_() {
      return new Vector3d(0.0, (double)(0.5F * this.getEyeHeight()), (double)(this.getWidth() * 0.2F));
   }

   private boolean method4450(BlockPos var1, int var2) {
      return var1.method8316(this.getPosition(), (double)var2);
   }

   // $VF: synthetic method
   public static Class2663 method4451(BeeEntity var0) {
      return var0.field5698;
   }

   // $VF: synthetic method
   public static boolean method4452(BeeEntity var0) {
      return var0.method4425();
   }

   // $VF: synthetic method
   public static BlockPos method4453(BeeEntity var0) {
      return var0.field5697;
   }

   // $VF: synthetic method
   public static BlockPos method4454(BeeEntity var0, BlockPos var1) {
      return var0.field5697 = var1;
   }

   // $VF: synthetic method
   public static Class6990 method4455(BeeEntity var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Class6990 method4456(BeeEntity var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Class6990 method4457(BeeEntity var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static boolean method4458(BeeEntity var0, BlockPos var1, int var2) {
      return var0.method4450(var1, var2);
   }

   // $VF: synthetic method
   public static boolean method4459(BeeEntity var0, BlockPos var1) {
      return var0.method4444(var1);
   }

   // $VF: synthetic method
   public static void method4460(BeeEntity var0, BlockPos var1) {
      var0.method4420(var1);
   }

   // $VF: synthetic method
   public static Class6990 method4461(BeeEntity var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Class6990 method4462(BeeEntity var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Class6990 method4463(BeeEntity var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Class6990 method4464(BeeEntity var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Class6990 method4465(BeeEntity var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Class6990 method4466(BeeEntity var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static int method4467(BeeEntity var0, int var1) {
      return var0.field5694 = var1;
   }

   // $VF: synthetic method
   public static Class6990 method4468(BeeEntity var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static BlockPos method4469(BeeEntity var0) {
      return var0.field5696;
   }

   // $VF: synthetic method
   public static boolean method4470(BeeEntity var0, BlockPos var1) {
      return var0.method4448(var1);
   }

   // $VF: synthetic method
   public static Class6990 method4471(BeeEntity var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Class6990 method4472(BeeEntity var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static BlockPos method4473(BeeEntity var0, BlockPos var1) {
      return var0.field5696 = var1;
   }

   // $VF: synthetic method
   public static Class6990 method4474(BeeEntity var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static int method4475(BeeEntity var0) {
      return var0.field5691;
   }

   // $VF: synthetic method
   public static int method4476(BeeEntity var0) {
      return var0.method4434();
   }

   // $VF: synthetic method
   public static Random method4477(BeeEntity var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static boolean method4478(BeeEntity var0) {
      return var0.method4437();
   }

   // $VF: synthetic method
   public static Random method4479(BeeEntity var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static void method4480(BeeEntity var0) {
      var0.method4436();
   }

   // $VF: synthetic method
   public static int method4481(BeeEntity var0) {
      return var0.field5695;
   }

   // $VF: synthetic method
   public static Random method4482(BeeEntity var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Class6990 method4483(BeeEntity var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Random method4484(BeeEntity var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static void method4485(BeeEntity var0, boolean var1) {
      var0.method4439(var1);
   }

   // $VF: synthetic method
   public static Class6990 method4486(BeeEntity var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static int method4487(BeeEntity var0, int var1) {
      return var0.field5695 = var1;
   }

   // $VF: synthetic method
   public static Random method4488(BeeEntity var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Class6990 method4489(BeeEntity var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Random method4490(BeeEntity var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method4491(BeeEntity var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static int method4492(BeeEntity var0) {
      return var0.field5694;
   }

   // $VF: synthetic method
   public static Class2664 method4493(BeeEntity var0) {
      return var0.field5699;
   }

   // $VF: synthetic method
   public static boolean method4494(BeeEntity var0, BlockPos var1) {
      return var0.method4431(var1);
   }

   // $VF: synthetic method
   public static Class6990 method4495(BeeEntity var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Random method4496(BeeEntity var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Class6990 method4497(BeeEntity var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Class6990 method4498(BeeEntity var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Class6990 method4499(BeeEntity var0) {
      return var0.field5599;
   }
}
