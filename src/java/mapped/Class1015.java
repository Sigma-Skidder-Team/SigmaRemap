package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Predicate;

public class Class1015 extends Class1014 implements Class1016 {
   private static final Class9289<Integer> field5672 = Class9361.<Integer>method35441(Class1015.class, Class7784.field33391);
   private static final Predicate<Class1006> field5673 = new Class119();
   private static final Class3257 field5674 = Class8514.field37954;
   private static final Set<Class3257> field5675 = Sets.newHashSet(
      new Class3257[]{Class8514.field37841, Class8514.field37960, Class8514.field37959, Class8514.field38112}
   );
   private static final Map<Class8992<?>, Class9455> field5676 = Util.<Map<Class8992<?>, Class9455>>method38508(Maps.newHashMap(), var0 -> {
      var0.put(Class8992.field41010, Class6067.field26885);
      var0.put(Class8992.field41013, Class6067.field26907);
      var0.put(Class8992.field41017, Class6067.field26886);
      var0.put(Class8992.field41021, Class6067.field26887);
      var0.put(Class8992.field41022, Class6067.field26888);
      var0.put(Class8992.field41024, Class6067.field26889);
      var0.put(Class8992.field41026, Class6067.field26890);
      var0.put(Class8992.field41027, Class6067.field26891);
      var0.put(Class8992.field41034, Class6067.field26892);
      var0.put(Class8992.field41036, Class6067.field26893);
      var0.put(Class8992.field41037, Class6067.field26894);
      var0.put(Class8992.field41039, Class6067.field26895);
      var0.put(Class8992.field41040, Class6067.field26896);
      var0.put(Class8992.field41049, Class6067.field26897);
      var0.put(Class8992.field41063, Class6067.field26898);
      var0.put(Class8992.field41065, Class6067.field26899);
      var0.put(Class8992.field41066, Class6067.field26900);
      var0.put(Class8992.field41067, Class6067.field26901);
      var0.put(Class8992.field41072, Class6067.field26902);
      var0.put(Class8992.field41075, Class6067.field26903);
      var0.put(Class8992.field41077, Class6067.field26904);
      var0.put(Class8992.field41078, Class6067.field26905);
      var0.put(Class8992.field41080, Class6067.field26906);
      var0.put(Class8992.field41085, Class6067.field26907);
      var0.put(Class8992.field41087, Class6067.field26908);
      var0.put(Class8992.field41097, Class6067.field26909);
      var0.put(Class8992.field41099, Class6067.field26910);
      var0.put(Class8992.field41101, Class6067.field26911);
      var0.put(Class8992.field41102, Class6067.field26912);
      var0.put(Class8992.field41103, Class6067.field26913);
      var0.put(Class8992.field41106, Class6067.field26914);
      var0.put(Class8992.field41107, Class6067.field26915);
      var0.put(Class8992.field41109, Class6067.field26916);
   });
   public float field5677;
   public float field5678;
   public float field5679;
   public float field5680;
   private float field5681 = 1.0F;
   private boolean field5682;
   private BlockPos field5683;

   public Class1015(Class8992<? extends Class1015> var1, Class1655 var2) {
      super(var1, var2);
      this.field5596 = new Class6832(this, 10, false);
      this.method4224(Class2163.field14195, -1.0F);
      this.method4224(Class2163.field14196, -1.0F);
      this.method4224(Class2163.field14207, -1.0F);
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, Class39 var5) {
      this.method4415(this.field5054.nextInt(5));
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
      return Class1006.method4220().method21849(Class9173.field42105, 6.0).method21849(Class9173.field42109, 0.4F).method21849(Class9173.field42108, 0.2F);
   }

   @Override
   public Class6990 method4221(Class1655 var1) {
      Class6995 var4 = new Class6995(this, var1);
      var4.method21685(false);
      var4.method21674(true);
      var4.method21686(true);
      return var4;
   }

   @Override
   public float method2957(Class2090 var1, Class8847 var2) {
      return var2.field39969 * 0.6F;
   }

   @Override
   public void method2871() {
      if (this.field5683 == null
         || !this.field5683.method8317(this.getPositionVec(), 3.46)
         || !this.field5024.method6738(this.field5683).method23448(Blocks.JUKEBOX)) {
         this.field5682 = false;
         this.field5683 = null;
      }

      if (this.field5024.field9016.nextInt(400) == 0) {
         method4409(this.field5024, this);
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
      this.field5678 = (float)((double)this.field5678 + (double)(!this.field5036 && !this.method3328() ? 4 : -1) * 0.3);
      this.field5678 = MathHelper.method37777(this.field5678, 0.0F, 1.0F);
      if (!this.field5036 && this.field5681 < 1.0F) {
         this.field5681 = 1.0F;
      }

      this.field5681 = (float)((double)this.field5681 * 0.9);
      Vector3d var3 = this.method3433();
      if (!this.field5036 && var3.field18049 < 0.0) {
         this.method3434(var3.method11347(1.0, 0.6, 1.0));
      }

      this.field5677 = this.field5677 + this.field5681 * 2.0F;
   }

   public static boolean method4409(Class1655 var0, Entity var1) {
      if (var1.method3066() && !var1.method3245() && var0.field9016.nextInt(2) == 0) {
         List var4 = var0.<Class1006>method6772(Class1006.class, var1.method3389().method19664(20.0), field5673);
         if (!var4.isEmpty()) {
            Class1006 var5 = (Class1006)var4.get(var0.field9016.nextInt(var4.size()));
            if (!var5.method3245()) {
               Class9455 var6 = method4412(var5.method3204());
               var0.method6743(
                  (PlayerEntity)null, var1.getPosX(), var1.getPosY(), var1.getPosZ(), var6, var1.method2864(), 0.7F, method4413(var0.field9016)
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
   public Class2274 method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.method3094(var2);
      if (!this.method4393() && field5675.contains(var5.method32107())) {
         if (!var1.field4919.field29609) {
            var5.method32182(1);
         }

         if (!this.method3245()) {
            this.field5024
               .method6743(
                  (PlayerEntity)null,
                  this.getPosX(),
                  this.getPosY(),
                  this.getPosZ(),
                  Class6067.field26882,
                  this.method2864(),
                  1.0F,
                  1.0F + (this.field5054.nextFloat() - this.field5054.nextFloat()) * 0.2F
               );
         }

         if (!this.field5024.field9020) {
            if (this.field5054.nextInt(10) != 0) {
               this.field5024.method6786(this, (byte)6);
            } else {
               this.method4399(var1);
               this.field5024.method6786(this, (byte)7);
            }
         }

         return Class2274.method9002(this.field5024.field9020);
      } else if (var5.method32107() != field5674) {
         if (!this.method4416() && this.method4393() && this.method4401(var1)) {
            if (!this.field5024.field9020) {
               this.method4403(!this.method4402());
            }

            return Class2274.method9002(this.field5024.field9020);
         } else {
            return super.method4285(var1, var2);
         }
      } else {
         if (!var1.field4919.field29609) {
            var5.method32182(1);
         }

         this.method3035(new Class2023(Class8254.field35485, 900));
         if (var1.method2801() || !this.method3362()) {
            this.method2741(Class8654.method31117(var1), Float.MAX_VALUE);
         }

         return Class2274.method9002(this.field5024.field9020);
      }
   }

   @Override
   public boolean method4381(ItemStack var1) {
      return false;
   }

   public static boolean method4410(Class8992<Class1015> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      Class7380 var7 = var1.method6738(var3.method8313());
      return (
            var7.method23446(Class7645.field32767)
               || var7.method23448(Blocks.field36395)
               || var7.method23446(Class7645.field32751)
               || var7.method23448(Blocks.AIR)
         )
         && var1.method7021(var3, 0) > 8;
   }

   @Override
   public boolean method2921(float var1, float var2) {
      return false;
   }

   @Override
   public void method2761(double var1, boolean var3, Class7380 var4, BlockPos var5) {
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
   public Class9455 method4241() {
      return method4411(this.field5024, this.field5024.field9016);
   }

   public static Class9455 method4411(Class1655 var0, Random var1) {
      if (var0.method6997() != Class2197.field14351 && var1.nextInt(1000) == 0) {
         ArrayList var4 = Lists.newArrayList(field5676.keySet());
         return method4412((Class8992<?>)var4.get(var1.nextInt(var4.size())));
      } else {
         return Class6067.field26880;
      }
   }

   private static Class9455 method4412(Class8992<?> var0) {
      return field5676.getOrDefault(var0, Class6067.field26880);
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field26884;
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field26881;
   }

   @Override
   public void method3241(BlockPos var1, Class7380 var2) {
      this.method2863(Class6067.field26917, 0.15F, 1.0F);
   }

   @Override
   public float method3243(float var1) {
      this.method2863(Class6067.field26883, 0.15F, 1.0F);
      return var1 + this.field5678 / 2.0F;
   }

   @Override
   public boolean method3244() {
      return true;
   }

   @Override
   public float method3100() {
      return method4413(this.field5054);
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
      return MathHelper.method37775(this.field5063.<Integer>method35445(field5672), 0, 4);
   }

   public void method4415(int var1) {
      this.field5063.method35446(field5672, var1);
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field5672, 0);
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      var1.method102("Variant", this.method4414());
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      this.method4415(var1.method122("Variant"));
   }

   public boolean method4416() {
      return !this.field5036;
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
