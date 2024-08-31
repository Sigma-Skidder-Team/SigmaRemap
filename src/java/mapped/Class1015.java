package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.Util;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;

import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Predicate;

public class Class1015 extends Class1014 implements Class1016 {
   private static final DataParameter<Integer> field5672 = EntityDataManager.<Integer>createKey(Class1015.class, DataSerializers.field33391);
   private static final Predicate<Class1006> field5673 = new Class119();
   private static final Item field5674 = Items.field37954;
   private static final Set<Item> field5675 = Sets.newHashSet(
      new Item[]{Items.field37841, Items.field37960, Items.field37959, Items.field38112}
   );
   private static final Map<EntityType<?>, SoundEvent> field5676 = Util.<Map<EntityType<?>, SoundEvent>>make(Maps.newHashMap(), var0 -> {
      var0.put(EntityType.field41010, Sounds.field26885);
      var0.put(EntityType.field41013, Sounds.field26907);
      var0.put(EntityType.field41017, Sounds.field26886);
      var0.put(EntityType.field41021, Sounds.field26887);
      var0.put(EntityType.field41022, Sounds.field26888);
      var0.put(EntityType.field41024, Sounds.field26889);
      var0.put(EntityType.field41026, Sounds.field26890);
      var0.put(EntityType.field41027, Sounds.field26891);
      var0.put(EntityType.field41034, Sounds.field26892);
      var0.put(EntityType.field41036, Sounds.field26893);
      var0.put(EntityType.field41037, Sounds.field26894);
      var0.put(EntityType.field41039, Sounds.field26895);
      var0.put(EntityType.field41040, Sounds.field26896);
      var0.put(EntityType.field41049, Sounds.field26897);
      var0.put(EntityType.field41063, Sounds.field26898);
      var0.put(EntityType.field41065, Sounds.field26899);
      var0.put(EntityType.field41066, Sounds.field26900);
      var0.put(EntityType.field41067, Sounds.field26901);
      var0.put(EntityType.field41072, Sounds.field26902);
      var0.put(EntityType.field41075, Sounds.field26903);
      var0.put(EntityType.field41077, Sounds.field26904);
      var0.put(EntityType.field41078, Sounds.field26905);
      var0.put(EntityType.field41080, Sounds.field26906);
      var0.put(EntityType.field41085, Sounds.field26907);
      var0.put(EntityType.field41087, Sounds.field26908);
      var0.put(EntityType.field41097, Sounds.field26909);
      var0.put(EntityType.field41099, Sounds.field26910);
      var0.put(EntityType.field41101, Sounds.field26911);
      var0.put(EntityType.field41102, Sounds.field26912);
      var0.put(EntityType.field41103, Sounds.field26913);
      var0.put(EntityType.field41106, Sounds.field26914);
      var0.put(EntityType.field41107, Sounds.field26915);
      var0.put(EntityType.field41109, Sounds.field26916);
   });
   public float field5677;
   public float field5678;
   public float field5679;
   public float field5680;
   private float field5681 = 1.0F;
   private boolean field5682;
   private BlockPos field5683;

   public Class1015(EntityType<? extends Class1015> var1, World var2) {
      super(var1, var2);
      this.field5596 = new Class6832(this, 10, false);
      this.method4224(Class2163.field14195, -1.0F);
      this.method4224(Class2163.field14196, -1.0F);
      this.method4224(Class2163.field14207, -1.0F);
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, CompoundNBT var5) {
      this.method4415(this.rand.nextInt(5));
      if (var4 == null) {
         var4 = new Class5097(false);
      }

      return super.method4276(var1, var2, var3, (Class5093)var4, var5);
   }

   @Override
   public boolean method3005() {
      return false;
   }

   @Override
   public void method4219() {
      this.field5600.method20002(0, new Class2747(this, 1.25));
      this.field5600.method20002(0, new Class2603(this));
      this.field5600.method20002(1, new Class2612(this, PlayerEntity.class, 8.0F));
      this.field5600.method20002(2, new Class2778(this));
      this.field5600.method20002(2, new Class2725(this, 1.0, 5.0F, 1.0F, true));
      this.field5600.method20002(2, new Class2738(this, 1.0));
      this.field5600.method20002(3, new Class2619(this));
      this.field5600.method20002(3, new Class2611(this, 1.0, 3.0F, 7.0F));
   }

   public static Class7037 method4406() {
      return Class1006.method4220().method21849(Attributes.field42105, 6.0).method21849(Attributes.field42109, 0.4F).method21849(Attributes.MOVEMENT_SPEED, 0.2F);
   }

   @Override
   public Class6990 method4221(World var1) {
      Class6995 var4 = new Class6995(this, var1);
      var4.method21685(false);
      var4.method21674(true);
      var4.method21686(true);
      return var4;
   }

   @Override
   public float method2957(Pose var1, EntitySize var2) {
      return var2.field39969 * 0.6F;
   }

   @Override
   public void method2871() {
      if (this.field5683 == null
         || !this.field5683.method8317(this.getPositionVec(), 3.46)
         || !this.world.getBlockState(this.field5683).method23448(Blocks.JUKEBOX)) {
         this.field5682 = false;
         this.field5683 = null;
      }

      if (this.world.rand.nextInt(400) == 0) {
         method4409(this.world, this);
      }

      super.method2871();
      this.method4408();
   }

   @Override
   public void method3171(BlockPos var1, boolean var2) {
      this.field5683 = var1;
      this.field5682 = var2;
   }

   public boolean method4407() {
      return this.field5682;
   }

   private void method4408() {
      this.field5680 = this.field5677;
      this.field5679 = this.field5678;
      this.field5678 = (float)((double)this.field5678 + (double)(!this.onGround && !this.isPassenger() ? 4 : -1) * 0.3);
      this.field5678 = MathHelper.clamp(this.field5678, 0.0F, 1.0F);
      if (!this.onGround && this.field5681 < 1.0F) {
         this.field5681 = 1.0F;
      }

      this.field5681 = (float)((double)this.field5681 * 0.9);
      Vector3d var3 = this.method3433();
      if (!this.onGround && var3.y < 0.0) {
         this.method3434(var3.method11347(1.0, 0.6, 1.0));
      }

      this.field5677 = this.field5677 + this.field5681 * 2.0F;
   }

   public static boolean method4409(World var0, Entity var1) {
      if (var1.isAlive() && !var1.method3245() && var0.rand.nextInt(2) == 0) {
         List var4 = var0.<Class1006>method6772(Class1006.class, var1.getBoundingBox().method19664(20.0), field5673);
         if (!var4.isEmpty()) {
            Class1006 var5 = (Class1006)var4.get(var0.rand.nextInt(var4.size()));
            if (!var5.method3245()) {
               SoundEvent var6 = method4412(var5.getType());
               var0.method6743(
                  (PlayerEntity)null, var1.getPosX(), var1.getPosY(), var1.getPosZ(), var6, var1.method2864(), 0.7F, method4413(var0.rand)
               );
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      if (!this.method4393() && field5675.contains(var5.getItem())) {
         if (!var1.abilities.isCreativeMode) {
            var5.method32182(1);
         }

         if (!this.method3245()) {
            this.world
               .method6743(
                  (PlayerEntity)null,
                  this.getPosX(),
                  this.getPosY(),
                  this.getPosZ(),
                  Sounds.field26882,
                  this.method2864(),
                  1.0F,
                  1.0F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F
               );
         }

         if (!this.world.isRemote) {
            if (this.rand.nextInt(10) != 0) {
               this.world.method6786(this, (byte)6);
            } else {
               this.method4399(var1);
               this.world.method6786(this, (byte)7);
            }
         }

         return ActionResultType.method9002(this.world.isRemote);
      } else if (var5.getItem() != field5674) {
         if (!this.method4416() && this.method4393() && this.method4401(var1)) {
            if (!this.world.isRemote) {
               this.method4403(!this.method4402());
            }

            return ActionResultType.method9002(this.world.isRemote);
         } else {
            return super.method4285(var1, var2);
         }
      } else {
         if (!var1.abilities.isCreativeMode) {
            var5.method32182(1);
         }

         this.method3035(new Class2023(Effects.POISON, 900));
         if (var1.isCreative() || !this.method3362()) {
            this.method2741(Class8654.method31117(var1), Float.MAX_VALUE);
         }

         return ActionResultType.method9002(this.world.isRemote);
      }
   }

   @Override
   public boolean method4381(ItemStack var1) {
      return false;
   }

   public static boolean method4410(EntityType<Class1015> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      BlockState var7 = var1.getBlockState(var3.down());
      return (
            var7.method23446(BlockTags.field32767)
               || var7.method23448(Blocks.field36395)
               || var7.method23446(BlockTags.field32751)
               || var7.method23448(Blocks.AIR)
         )
         && var1.method7021(var3, 0) > 8;
   }

   @Override
   public boolean method2921(float var1, float var2) {
      return false;
   }

   @Override
   public void method2761(double var1, boolean var3, BlockState var4, BlockPos var5) {
   }

   @Override
   public boolean method4386(Class1018 var1) {
      return false;
   }

   @Nullable
   @Override
   public Class1045 method4389(ServerWorld var1, Class1045 var2) {
      return null;
   }

   @Override
   public boolean method3114(Entity var1) {
      return var1.method2741(Class8654.method31115(this), 3.0F);
   }

   @Nullable
   @Override
   public SoundEvent method4241() {
      return method4411(this.world, this.world.rand);
   }

   public static SoundEvent method4411(World var0, Random var1) {
      if (var0.method6997() != Difficulty.field14351 && var1.nextInt(1000) == 0) {
         ArrayList var4 = Lists.newArrayList(field5676.keySet());
         return method4412((EntityType<?>)var4.get(var1.nextInt(var4.size())));
      } else {
         return Sounds.field26880;
      }
   }

   private static SoundEvent method4412(EntityType<?> var0) {
      return field5676.getOrDefault(var0, Sounds.field26880);
   }

   @Override
   public SoundEvent method2879(Class8654 var1) {
      return Sounds.field26884;
   }

   @Override
   public SoundEvent method2880() {
      return Sounds.field26881;
   }

   @Override
   public void method3241(BlockPos var1, BlockState var2) {
      this.method2863(Sounds.field26917, 0.15F, 1.0F);
   }

   @Override
   public float method3243(float var1) {
      this.method2863(Sounds.field26883, 0.15F, 1.0F);
      return var1 + this.field5678 / 2.0F;
   }

   @Override
   public boolean method3244() {
      return true;
   }

   @Override
   public float method3100() {
      return method4413(this.rand);
   }

   public static float method4413(Random var0) {
      return (var0.nextFloat() - var0.nextFloat()) * 0.2F + 1.0F;
   }

   @Override
   public Class2266 method2864() {
      return Class2266.field14734;
   }

   @Override
   public boolean method3140() {
      return true;
   }

   @Override
   public void method3128(Entity var1) {
      if (!(var1 instanceof PlayerEntity)) {
         super.method3128(var1);
      }
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      if (!this.method2760(var1)) {
         this.method4403(false);
         return super.method2741(var1, var2);
      } else {
         return false;
      }
   }

   public int method4414() {
      return MathHelper.method37775(this.dataManager.<Integer>method35445(field5672), 0, 4);
   }

   public void method4415(int var1) {
      this.dataManager.method35446(field5672, var1);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5672, 0);
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      var1.method102("Variant", this.method4414());
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      this.method4415(var1.method122("Variant"));
   }

   public boolean method4416() {
      return !this.onGround;
   }

   @Override
   public Vector3d method3394() {
      return new Vector3d(0.0, (double)(0.5F * this.method3393()), (double)(this.method3429() * 0.4F));
   }

   // $VF: synthetic method
   public static Map method4418() {
      return field5676;
   }
}
