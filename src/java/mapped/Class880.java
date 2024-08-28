package mapped;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.Class4436;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;

import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Predicate;

public abstract class Class880 extends Entity {
   private static final UUID field4931 = UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D");
   private static final UUID field4932 = UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038");
   private static final Class9689 field4933 = new Class9689(field4931, "Sprinting speed boost", 0.3F, Class2045.field13354);
   public static final Class9289<Byte> field4934 = Class9361.<Byte>method35441(Class880.class, Class7784.field33390);
   private static final Class9289<Float> field4935 = Class9361.<Float>method35441(Class880.class, Class7784.field33392);
   private static final Class9289<Integer> field4936 = Class9361.<Integer>method35441(Class880.class, Class7784.field33391);
   private static final Class9289<Boolean> field4937 = Class9361.<Boolean>method35441(Class880.class, Class7784.field33398);
   private static final Class9289<Integer> field4938 = Class9361.<Integer>method35441(Class880.class, Class7784.field33391);
   private static final Class9289<Integer> field4939 = Class9361.<Integer>method35441(Class880.class, Class7784.field33391);
   private static final Class9289<Optional<BlockPos>> field4940 = Class9361.<Optional<BlockPos>>method35441(Class880.class, Class7784.field33402);
   public static final Class8847 field4941 = Class8847.method32102(0.2F, 0.2F);
   private final Class9020 field4942;
   private final Class8039 field4943 = new Class8039(this);
   private final Map<Class7144, Class2023> field4944 = Maps.newHashMap();
   private final Class25<Class8848> field4945 = Class25.<Class8848>method68(2, Class8848.field39973);
   private final Class25<Class8848> field4946 = Class25.<Class8848>method68(4, Class8848.field39973);
   public boolean field4947;
   public Class79 field4948;
   public int field4949;
   public int field4950;
   public int field4951;
   public int field4952;
   public int field4953;
   public float field4954;
   public int field4955;
   public float field4956;
   public float field4957;
   public int field4958;
   public float field4959;
   public float field4960;
   public float field4961;
   public final int field4962 = 20;
   public final float field4963;
   public final float field4964;
   public float field4965;
   public float field4966;
   public float field4967;
   public float field4968;
   public float field4969 = 0.02F;
   public PlayerEntity field4970;
   public int field4971;
   public boolean field4972;
   public int field4973;
   public float field4974;
   public float field4975;
   public float field4976;
   public float field4977;
   public float field4978;
   public int field4979;
   public float field4980;
   public boolean field4981;
   public float field4982;
   public float field4983;
   public float field4984;
   public int field4985;
   public double field4986;
   public double field4987;
   public double field4988;
   public double field4989;
   public double field4990;
   public double field4991;
   public int field4992;
   private boolean field4993 = true;
   private Class880 field4994;
   private int field4995;
   private Class880 field4996;
   private int field4997;
   private float field4998;
   public int field4999;
   private float field5000;
   public Class8848 field5001 = Class8848.field39973;
   public int field5002;
   public int field5003;
   private BlockPos field5004;
   private Optional<BlockPos> field5005 = Optional.<BlockPos>empty();
   private Class8654 field5006;
   private long field5007;
   public int field5008;
   private float field5009;
   private float field5010;
   public Class6947<?> field5011;

   public Class880(Class8992<? extends Class880> var1, Class1655 var2) {
      super(var1, var2);
      this.field4942 = new Class9020(Class9614.method37375(var1));
      this.method3043(this.method3075());
      this.field5019 = true;
      this.field4964 = (float)((Math.random() + 1.0) * 0.01F);
      this.method3216();
      this.field4963 = (float)Math.random() * 12398.0F;
      this.field5031 = (float)(Math.random() * (float) (Math.PI * 2));
      this.field4967 = this.field5031;
      this.field5051 = 0.6F;
      Class8063 var5 = Class8063.field34602;
      this.field5011 = this.method2994(new Dynamic(var5, var5.createMap(ImmutableMap.of(var5.createString("memories"), var5.emptyMap()))));
   }

   public Class6947<?> method2992() {
      return this.field5011;
   }

   public Class6971<?> method2993() {
      return Class6947.method21400(ImmutableList.of(), ImmutableList.of());
   }

   public Class6947<?> method2994(Dynamic<?> var1) {
      return this.method2993().method21513(var1);
   }

   @Override
   public void method2995() {
      this.method2741(Class8654.field39004, Float.MAX_VALUE);
   }

   public boolean method2996(Class8992<?> var1) {
      return true;
   }

   @Override
   public void method2850() {
      this.field5063.method35442(field4934, (byte)0);
      this.field5063.method35442(field4936, 0);
      this.field5063.method35442(field4937, false);
      this.field5063.method35442(field4938, 0);
      this.field5063.method35442(field4939, 0);
      this.field5063.method35442(field4935, 1.0F);
      this.field5063.method35442(field4940, Optional.<BlockPos>empty());
   }

   public static Class7037 method2997() {
      return Class9767.method38416()
         .method21848(Class9173.field42105)
         .method21848(Class9173.field42107)
         .method21848(Class9173.field42108)
         .method21848(Class9173.field42113)
         .method21848(Class9173.field42114);
   }

   @Override
   public void method2761(double var1, boolean var3, Class7380 var4, BlockPos var5) {
      if (!this.method3250()) {
         this.method3258();
      }

      if (!this.field5024.field9020 && var3 && this.field5045 > 0.0F) {
         this.method3003();
         this.method3004();
      }

      if (!this.field5024.field9020 && this.field5045 > 3.0F && var3) {
         float var8 = (float)Class9679.method37773(this.field5045 - 3.0F);
         if (!var4.method23393()) {
            double var9 = Math.min((double)(0.2F + var8 / 15.0F), 2.5);
            int var11 = (int)(150.0 * var9);
            ((Class1657)this.field5024)
               .method6939(new Class7439(Class7940.field34051, var4), this.getPosX(), this.getPosY(), this.getPosZ(), var11, 0.0, 0.0, 0.0, 0.15F);
         }
      }

      super.method2761(var1, var3, var4, var5);
   }

   public boolean method2998() {
      return this.method3089() == Class7809.field33506;
   }

   public float method2999(float var1) {
      return Class9679.method37821(var1, this.field5010, this.field5009);
   }

   @Override
   public void method3000() {
      this.field4956 = this.field4957;
      if (this.field5062) {
         this.method3173().ifPresent(this::method3177);
      }

      if (this.method3001()) {
         this.method3002();
      }

      super.method3000();
      this.field5024.method6820().method22503("livingEntityBaseTick");
      boolean var3 = this instanceof PlayerEntity;
      if (this.method3066()) {
         if (!this.method3180()) {
            if (var3 && !this.field5024.method6810().method24525(this.method3389())) {
               double var4 = this.field5024.method6810().method24526(this) + this.field5024.method6810().method24546();
               if (var4 < 0.0) {
                  double var6 = this.field5024.method6810().method24548();
                  if (var6 > 0.0) {
                     this.method2741(Class8654.field38997, (float)Math.max(1, Class9679.method37769(-var4 * var6)));
                  }
               }
            }
         } else {
            this.method2741(Class8654.field38997, 1.0F);
         }
      }

      if (this.method3249() || this.field5024.field9020) {
         this.method3223();
      }

      boolean var8 = var3 && ((PlayerEntity)this).field4919.field29606;
      if (this.method3066()) {
         if (this.method3263(Class8953.field40469)
            && !this.field5024.method6738(new BlockPos(this.getPosX(), this.method3442(), this.getPosZ())).method23448(Class8487.field37013)) {
            if (!this.method2998() && !Class7182.method22538(this) && !var8) {
               this.method3352(this.method3011(this.method3351()));
               if (this.method3351() == -20) {
                  this.method3352(0);
                  Vector3d var9 = this.method3433();

                  for (int var10 = 0; var10 < 8; var10++) {
                     double var11 = this.field5054.nextDouble() - this.field5054.nextDouble();
                     double var13 = this.field5054.nextDouble() - this.field5054.nextDouble();
                     double var15 = this.field5054.nextDouble() - this.field5054.nextDouble();
                     this.field5024
                        .method6746(
                           Class7940.field34052,
                           this.getPosX() + var11,
                           this.getPosY() + var13,
                           this.getPosZ() + var15,
                           var9.field18048,
                           var9.field18049,
                           var9.field18050
                        );
                  }

                  this.method2741(Class8654.field38999, 2.0F);
               }
            }

            if (!this.field5024.field9020 && this.method3328() && this.method3421() != null && !this.method3421().method3007()) {
               this.method2759();
            }
         } else if (this.method3351() < this.method3350()) {
            this.method3352(this.method3012(this.method3351()));
         }

         if (!this.field5024.field9020) {
            BlockPos var17 = this.method3432();
            if (!Objects.equal(this.field5004, var17)) {
               this.field5004 = var17;
               this.method2762(var17);
            }
         }
      }

      if (this.method3066() && this.method3254()) {
         this.method3223();
      }

      if (this.field4952 > 0) {
         this.field4952--;
      }

      if (this.field5061 > 0 && !(this instanceof Class878)) {
         this.field5061--;
      }

      if (this.method3044()) {
         this.method3008();
      }

      if (this.field4971 <= 0) {
         this.field4970 = null;
      } else {
         this.field4971--;
      }

      if (this.field4996 != null && !this.field4996.method3066()) {
         this.field4996 = null;
      }

      if (this.field4994 != null) {
         if (this.field4994.method3066()) {
            if (this.field5055 - this.field4995 > 100) {
               this.method3017((Class880)null);
            }
         } else {
            this.method3017((Class880)null);
         }
      }

      this.method3024();
      this.field4977 = this.field4976;
      this.field4966 = this.field4965;
      this.field4968 = this.field4967;
      this.field5033 = this.field5031;
      this.field5034 = this.field5032;
      this.field5024.method6820().method22505();
   }

   public boolean method3001() {
      return this.field5055 % 5 == 0
         && this.method3433().field18048 != 0.0
         && this.method3433().field18050 != 0.0
         && !this.method2800()
         && Class7858.method26333(this)
         && this.method2889();
   }

   public void method3002() {
      Vector3d var3 = this.method3433();
      this.field5024
         .method6746(
            Class7940.field34076,
            this.getPosX() + (this.field5054.nextDouble() - 0.5) * (double)this.method3429(),
            this.getPosY() + 0.1,
            this.getPosZ() + (this.field5054.nextDouble() - 0.5) * (double)this.method3429(),
            var3.field18048 * -0.2,
            0.1,
            var3.field18050 * -0.2
         );
      float var4 = !(this.field5054.nextFloat() * 0.4F + this.field5054.nextFloat() > 0.9F) ? 0.0F : 0.6F;
      this.method2863(Class6067.field27092, var4, 0.6F + this.field5054.nextFloat() * 0.4F);
   }

   public boolean method2889() {
      return this.field5024.method6738(this.method3230()).method23446(Class7645.field32802);
   }

   @Override
   public float method2977() {
      return this.method2889() && Class7858.method26322(Class8122.field34907, this) > 0 ? 1.0F : super.method2977();
   }

   public boolean method2985(Class7380 var1) {
      return !var1.method23393() || this.method3165();
   }

   public void method3003() {
      Class9805 var3 = this.method3085(Class9173.field42108);
      if (var3 != null && var3.method38664(field4932) != null) {
         var3.method38671(field4932);
      }
   }

   public void method3004() {
      if (!this.method3260().method23393()) {
         int var3 = Class7858.method26322(Class8122.field34907, this);
         if (var3 > 0 && this.method2889()) {
            Class9805 var4 = this.method3085(Class9173.field42108);
            if (var4 == null) {
               return;
            }

            var4.method38667(new Class9689(field4932, "Soul speed boost", (double)(0.03F * (1.0F + (float)var3 * 0.35F)), Class2045.field13352));
            if (this.method3013().nextFloat() < 0.04F) {
               Class8848 var5 = this.method2943(Class2106.field13733);
               var5.method32121(1, this, var0 -> var0.method3184(Class2106.field13733));
            }
         }
      }
   }

   public void method2762(BlockPos var1) {
      int var4 = Class7858.method26322(Class8122.field34905, this);
      if (var4 > 0) {
         Class6089.method18829(this, this.field5024, var1, var4);
      }

      if (this.method2985(this.method3260())) {
         this.method3003();
      }

      this.method3004();
   }

   public boolean method3005() {
      return false;
   }

   public float method3006() {
      return !this.method3005() ? 1.0F : 0.5F;
   }

   public boolean method2897() {
      return true;
   }

   @Override
   public boolean method3007() {
      return false;
   }

   public void method3008() {
      this.field4955++;
      if (this.field4955 == 20) {
         this.method2904();

         for (int var3 = 0; var3 < 20; var3++) {
            double var4 = this.field5054.nextGaussian() * 0.02;
            double var6 = this.field5054.nextGaussian() * 0.02;
            double var8 = this.field5054.nextGaussian() * 0.02;
            this.field5024.method6746(Class7940.field34089, this.method3438(1.0), this.method3441(), this.method3445(1.0), var4, var6, var8);
         }
      }
   }

   public boolean method3009() {
      return !this.method3005();
   }

   public boolean method3010() {
      return !this.method3005();
   }

   public int method3011(int var1) {
      int var4 = Class7858.method26325(this);
      return var4 > 0 && this.field5054.nextInt(var4 + 1) > 0 ? var1 : var1 - 1;
   }

   public int method3012(int var1) {
      return Math.min(var1 + 4, this.method3350());
   }

   public int method2937(PlayerEntity var1) {
      return 0;
   }

   public boolean method2938() {
      return false;
   }

   public Random method3013() {
      return this.field5054;
   }

   @Nullable
   public Class880 method3014() {
      return this.field4994;
   }

   public int method3015() {
      return this.field4995;
   }

   public void method3016(PlayerEntity var1) {
      this.field4970 = var1;
      this.field4971 = this.field5055;
   }

   public void method3017(Class880 var1) {
      this.field4994 = var1;
      this.field4995 = this.field5055;
   }

   @Nullable
   public Class880 method3018() {
      return this.field4996;
   }

   public int method3019() {
      return this.field4997;
   }

   public void method3020(Entity var1) {
      if (!(var1 instanceof Class880)) {
         this.field4996 = null;
      } else {
         this.field4996 = (Class880)var1;
      }

      this.field4997 = this.field5055;
   }

   public int method3021() {
      return this.field4973;
   }

   public void method3022(int var1) {
      this.field4973 = var1;
   }

   public void method3023(Class8848 var1) {
      if (!var1.method32105()) {
         Class9455 var4 = Class6067.field26351;
         Class3257 var5 = var1.method32107();
         if (!(var5 instanceof Class3279)) {
            if (var5 == Class8514.field38120) {
               var4 = Class6067.field26350;
            }
         } else {
            var4 = ((Class3279)var5).method11806().method8788();
         }

         this.method2863(var4, 1.0F, 1.0F);
      }
   }

   @Override
   public void method2724(Class39 var1) {
      var1.method107("Health", this.method3042());
      var1.method101("HurtTime", (short)this.field4952);
      var1.method102("HurtByTimestamp", this.field4995);
      var1.method101("DeathTime", (short)this.field4955);
      var1.method107("AbsorptionAmount", this.method2959());
      var1.method99("Attributes", this.method3088().method33389());
      if (!this.field4944.isEmpty()) {
         Class41 var4 = new Class41();

         for (Class2023 var6 : this.field4944.values()) {
            var4.add(var6.method8637(new Class39()));
         }

         var1.method99("ActiveEffects", var4);
      }

      var1.method115("FallFlying", this.method3165());
      this.method3173().ifPresent(var1x -> {
         var1.method102("SleepingX", var1x.method8304());
         var1.method102("SleepingY", var1x.getY());
         var1.method102("SleepingZ", var1x.method8306());
      });
      DataResult var7 = this.field5011.method21402(Class8063.field34602);
      var7.resultOrPartial(field5012::error).ifPresent(var1x -> var1.method99("Brain", (Class30) var1x));
   }

   @Override
   public void method2723(Class39 var1) {
      this.method2958(var1.method124("AbsorptionAmount"));
      if (var1.method119("Attributes", 9) && this.field5024 != null && !this.field5024.field9020) {
         this.method3088().method33390(var1.method131("Attributes", 10));
      }

      if (var1.method119("ActiveEffects", 9)) {
         Class41 var4 = var1.method131("ActiveEffects", 10);

         for (int var5 = 0; var5 < var4.size(); var5++) {
            Class39 var6 = var4.method153(var5);
            Class2023 var7 = Class2023.method8639(var6);
            if (var7 != null) {
               this.field4944.put(var7.method8627(), var7);
            }
         }
      }

      if (var1.method119("Health", 99)) {
         this.method3043(var1.method124("Health"));
      }

      this.field4952 = var1.method121("HurtTime");
      this.field4955 = var1.method121("DeathTime");
      this.field4995 = var1.method122("HurtByTimestamp");
      if (var1.method119("Team", 8)) {
         String var8 = var1.method126("Team");
         Class8218 var10 = this.field5024.method6805().method20990(var8);
         boolean var11 = var10 != null && this.field5024.method6805().method20993(this.method3376(), var10);
         if (!var11) {
            field5012.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", var8);
         }
      }

      if (var1.method132("FallFlying")) {
         this.method3349(7, true);
      }

      if (var1.method119("SleepingX", 99) && var1.method119("SleepingY", 99) && var1.method119("SleepingZ", 99)) {
         BlockPos var9 = new BlockPos(var1.method122("SleepingX"), var1.method122("SleepingY"), var1.method122("SleepingZ"));
         this.method3174(var9);
         this.field5063.method35446(field5070, Class2090.field13621);
         if (!this.field5062) {
            this.method3177(var9);
         }
      }

      if (var1.method119("Brain", 10)) {
         this.field5011 = this.method2994(new Dynamic(Class8063.field34602, var1.method116("Brain")));
      }
   }

   public void method3024() {
      Iterator var3 = this.field4944.keySet().iterator();

      try {
         while (var3.hasNext()) {
            Class7144 var4 = (Class7144)var3.next();
            Class2023 var5 = this.field4944.get(var4);
            if (!var5.method8633(this, () -> this.method2791(var5, true))) {
               if (!this.field5024.field9020) {
                  var3.remove();
                  this.method2792(var5);
               }
            } else if (var5.method8628() % 600 == 0) {
               this.method2791(var5, false);
            }
         }
      } catch (ConcurrentModificationException var13) {
      }

      if (this.field4993) {
         if (!this.field5024.field9020) {
            this.method2813();
         }

         this.field4993 = false;
      }

      int var14 = this.field5063.<Integer>method35445(field4936);
      boolean var15 = this.field5063.<Boolean>method35445(field4937);
      if (var14 > 0) {
         boolean var6;
         if (this.method3342()) {
            var6 = this.field5054.nextInt(15) == 0;
         } else {
            var6 = this.field5054.nextBoolean();
         }

         if (var15) {
            var6 &= this.field5054.nextInt(5) == 0;
         }

         if (var6 && var14 > 0) {
            double var7 = (double)(var14 >> 16 & 0xFF) / 255.0;
            double var9 = (double)(var14 >> 8 & 0xFF) / 255.0;
            double var11 = (double)(var14 >> 0 & 0xFF) / 255.0;
            this.field5024
               .method6746(
                  var15 ? Class7940.field34048 : Class7940.field34068, this.method3438(0.5), this.method3441(), this.method3445(0.5), var7, var9, var11
               );
         }
      }
   }

   public void method2813() {
      if (!this.field4944.isEmpty()) {
         Collection var3 = this.field4944.values();
         this.field5063.method35446(field4937, method3028(var3));
         this.field5063.method35446(field4936, Class9741.method38184(var3));
         this.method3347(this.method3033(Class8254.field35480));
      } else {
         this.method3029();
         this.method3347(false);
      }
   }

   public double method3025(Entity var1) {
      double var4 = 1.0;
      if (this.method3334()) {
         var4 *= 0.8;
      }

      if (this.method3342()) {
         float var6 = this.method3097();
         if (var6 < 0.1F) {
            var6 = 0.1F;
         }

         var4 *= 0.7 * (double)var6;
      }

      if (var1 != null) {
         Class8848 var9 = this.method2943(Class2106.field13736);
         Class3257 var7 = var9.method32107();
         Class8992 var8 = var1.method3204();
         if (var8 == Class8992.field41078 && var7 == Class8514.field38058
            || var8 == Class8992.field41107 && var7 == Class8514.field38061
            || var8 == Class8992.field41017 && var7 == Class8514.field38062) {
            var4 *= 0.5;
         }
      }

      return var4;
   }

   public boolean method3026(Class880 var1) {
      return true;
   }

   public boolean method3027(Class880 var1, Class8522 var2) {
      return var2.method30210(this, var1);
   }

   public static boolean method3028(Collection<Class2023> var0) {
      for (Class2023 var4 : var0) {
         if (!var4.method8630()) {
            return false;
         }
      }

      return true;
   }

   public void method3029() {
      this.field5063.method35446(field4937, false);
      this.field5063.method35446(field4936, 0);
   }

   public boolean method3030() {
      if (this.field5024.field9020) {
         return false;
      } else {
         Iterator var3 = this.field4944.values().iterator();

         boolean var4;
         for (var4 = false; var3.hasNext(); var4 = true) {
            this.method2792((Class2023)var3.next());
            var3.remove();
         }

         return var4;
      }
   }

   public Collection<Class2023> method3031() {
      return this.field4944.values();
   }

   public Map<Class7144, Class2023> method3032() {
      return this.field4944;
   }

   public boolean method3033(Class7144 var1) {
      return this.field4944.containsKey(var1);
   }

   @Nullable
   public Class2023 method3034(Class7144 var1) {
      return this.field4944.get(var1);
   }

   public boolean method3035(Class2023 var1) {
      if (this.method3036(var1)) {
         Class2023 var4 = this.field4944.get(var1.method8627());
         if (var4 != null) {
            if (!var4.method8626(var1)) {
               return false;
            } else {
               this.method2791(var4, true);
               return true;
            }
         } else {
            this.field4944.put(var1.method8627(), var1);
            this.method2790(var1);
            return true;
         }
      } else {
         return false;
      }
   }

   public boolean method3036(Class2023 var1) {
      if (this.method3089() == Class7809.field33506) {
         Class7144 var4 = var1.method8627();
         if (var4 == Class8254.field35476 || var4 == Class8254.field35485) {
            return false;
         }
      }

      return true;
   }

   public void method3037(Class2023 var1) {
      if (this.method3036(var1)) {
         Class2023 var4 = this.field4944.put(var1.method8627(), var1);
         if (var4 != null) {
            this.method2791(var1, true);
         } else {
            this.method2790(var1);
         }
      }
   }

   public boolean method3038() {
      return this.method3089() == Class7809.field33506;
   }

   @Nullable
   public Class2023 method3039(Class7144 var1) {
      return this.field4944.remove(var1);
   }

   public boolean method3040(Class7144 var1) {
      Class2023 var4 = this.method3039(var1);
      if (var4 == null) {
         return false;
      } else {
         this.method2792(var4);
         return true;
      }
   }

   public void method2790(Class2023 var1) {
      this.field4993 = true;
      if (!this.field5024.field9020) {
         var1.method8627().method22301(this, this.method3088(), var1.method8629());
      }
   }

   public void method2791(Class2023 var1, boolean var2) {
      this.field4993 = true;
      if (var2 && !this.field5024.field9020) {
         Class7144 var5 = var1.method8627();
         var5.method22300(this, this.method3088(), var1.method8629());
         var5.method22301(this, this.method3088(), var1.method8629());
      }
   }

   public void method2792(Class2023 var1) {
      this.field4993 = true;
      if (!this.field5024.field9020) {
         var1.method8627().method22300(this, this.method3088(), var1.method8629());
      }
   }

   public void method3041(float var1) {
      float var4 = this.method3042();
      if (var4 > 0.0F) {
         this.method3043(var4 + var1);
      }
   }

   public float method3042() {
      return this.field5063.<Float>method35445(field4935);
   }

   public void method3043(float var1) {
      this.field5063.method35446(field4935, Class9679.method37777(var1, 0.0F, this.method3075()));
   }

   public boolean method3044() {
      return this.method3042() <= 0.0F;
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      if (this.method2760(var1)) {
         return false;
      } else if (!this.field5024.field9020) {
         if (this.method3044()) {
            return false;
         } else if (var1.method31141() && this.method3033(Class8254.field35478)) {
            return false;
         } else {
            if (this.method3176() && !this.field5024.field9020) {
               this.method2907();
            }

            this.field4973 = 0;
            float var5 = var2;
            if ((var1 == Class8654.field39008 || var1 == Class8654.field39009) && !this.method2943(Class2106.field13736).method32105()) {
               this.method2943(Class2106.field13736)
                  .method32121((int)(var2 * 4.0F + this.field5054.nextFloat() * var2 * 2.0F), this, var0 -> var0.method3184(Class2106.field13736));
               var2 *= 0.75F;
            }

            boolean var6 = false;
            float var7 = 0.0F;
            if (var2 > 0.0F && this.method3049(var1)) {
               this.method2887(var2);
               var7 = var2;
               var2 = 0.0F;
               if (!var1.method31129()) {
                  Entity var8 = var1.method31113();
                  if (var8 instanceof Class880) {
                     this.method2885((Class880)var8);
                  }
               }

               var6 = true;
            }

            this.field4960 = 1.5F;
            boolean var16 = true;
            if (!((float)this.field5061 > 10.0F)) {
               this.field4980 = var2;
               this.field5061 = 20;
               this.method2888(var1, var2);
               this.field4953 = 10;
               this.field4952 = this.field4953;
            } else {
               if (var2 <= this.field4980) {
                  return false;
               }

               this.method2888(var1, var2 - this.field4980);
               this.field4980 = var2;
               var16 = false;
            }

            this.field4954 = 0.0F;
            Entity var9 = var1.method31109();
            if (var9 != null) {
               if (var9 instanceof Class880) {
                  this.method3017((Class880)var9);
               }

               if (!(var9 instanceof PlayerEntity)) {
                  if (var9 instanceof Class1012) {
                     Class1012 var10 = (Class1012)var9;
                     if (var10.method4393()) {
                        this.field4971 = 100;
                        Class880 var11 = var10.method4400();
                        if (var11 != null && var11.method3204() == Class8992.field41111) {
                           this.field4970 = (PlayerEntity)var11;
                        } else {
                           this.field4970 = null;
                        }
                     }
                  }
               } else {
                  this.field4971 = 100;
                  this.field4970 = (PlayerEntity)var9;
               }
            }

            if (var16) {
               if (!var6) {
                  if (var1 instanceof Class8652 && ((Class8652)var1).method31108()) {
                     this.field5024.method6786(this, (byte)33);
                  } else {
                     byte var17;
                     if (var1 != Class8654.field38999) {
                        if (!var1.method31141()) {
                           if (var1 != Class8654.field39012) {
                              var17 = 2;
                           } else {
                              var17 = 44;
                           }
                        } else {
                           var17 = 37;
                        }
                     } else {
                        var17 = 36;
                     }

                     this.field5024.method6786(this, var17);
                  }
               } else {
                  this.field5024.method6786(this, (byte)29);
               }

               if (var1 != Class8654.field38999 && (!var6 || var2 > 0.0F)) {
                  this.method3141();
               }

               if (var9 == null) {
                  this.field4954 = (float)((int)(Math.random() * 2.0) * 180);
               } else {
                  double var12 = var9.getPosX() - this.getPosX();

                  double var14;
                  for (var14 = var9.getPosZ() - this.getPosZ(); var12 * var12 + var14 * var14 < 1.0E-4; var14 = (Math.random() - Math.random()) * 0.01) {
                     var12 = (Math.random() - Math.random()) * 0.01;
                  }

                  this.field4954 = (float)(Class9679.method37814(var14, var12) * 180.0F / (float)Math.PI - (double)this.field5031);
                  this.method3058(0.4F, var12, var14);
               }
            }

            if (!this.method3044()) {
               if (var16) {
                  this.method3048(var1);
               }
            } else if (!this.method3046(var1)) {
               Class9455 var18 = this.method2880();
               if (var16 && var18 != null) {
                  this.method2863(var18, this.method3099(), this.method3100());
               }

               this.method2737(var1);
            }

            boolean var19 = !var6 || var2 > 0.0F;
            if (var19) {
               this.field5006 = var1;
               this.field5007 = this.field5024.method6783();
            }

            if (this instanceof Class878) {
               Class9551.field44472.method15165((Class878)this, var1, var5, var2, var6);
               if (var7 > 0.0F && var7 < 3.4028235E37F) {
                  ((Class878)this).method2912(Class8876.field40131, Math.round(var7 * 10.0F));
               }
            }

            if (var9 instanceof Class878) {
               Class9551.field44471.method15093((Class878)var9, this, var1, var5, var2, var6);
            }

            return var19;
         }
      } else {
         return false;
      }
   }

   public void method2885(Class880 var1) {
      var1.method3045(this);
   }

   public void method3045(Class880 var1) {
      var1.method3058(0.5F, var1.getPosX() - this.getPosX(), var1.getPosZ() - this.getPosZ());
   }

   private boolean method3046(Class8654 var1) {
      if (var1.method31135()) {
         return false;
      } else {
         Class8848 var4 = null;

         for (Class79 var8 : Class79.values()) {
            Class8848 var9 = this.method3094(var8);
            if (var9.method32107() == Class8514.field38126) {
               var4 = var9.method32126();
               var9.method32182(1);
               break;
            }
         }

         if (var4 != null) {
            if (this instanceof Class878) {
               Class878 var10 = (Class878)this;
               var10.method2913(Class8876.field40098.method172(Class8514.field38126));
               Class9551.field44492.method15068(var10, var4);
            }

            this.method3043(1.0F);
            this.method3030();
            this.method3035(new Class2023(Class8254.field35476, 900, 1));
            this.method3035(new Class2023(Class8254.field35488, 100, 1));
            this.method3035(new Class2023(Class8254.field35478, 800, 0));
            this.field5024.method6786(this, (byte)35);
         }

         return var4 != null;
      }
   }

   @Nullable
   public Class8654 method3047() {
      if (this.field5024.method6783() - this.field5007 > 40L) {
         this.field5006 = null;
      }

      return this.field5006;
   }

   public void method3048(Class8654 var1) {
      Class9455 var4 = this.method2879(var1);
      if (var4 != null) {
         this.method2863(var4, this.method3099(), this.method3100());
      }
   }

   private boolean method3049(Class8654 var1) {
      Entity var4 = var1.method31113();
      boolean var5 = false;
      if (var4 instanceof Class884) {
         Class884 var6 = (Class884)var4;
         if (var6.method3489() > 0) {
            var5 = true;
         }
      }

      if (!var1.method31133() && this.method3163() && !var5) {
         Vector3d var9 = var1.method31112();
         if (var9 != null) {
            Vector3d var7 = this.method3281(1.0F);
            Vector3d var8 = var9.method11332(this.method3431()).method11333();
            var8 = new Vector3d(var8.field18048, 0.0, var8.field18050);
            if (var8.method11334(var7) < 0.0) {
               return true;
            }
         }
      }

      return false;
   }

   private void method3050(Class8848 var1) {
      if (!var1.method32105()) {
         if (!this.method3245()) {
            this.field5024
               .method6745(
                  this.getPosX(),
                  this.getPosY(),
                  this.getPosZ(),
                  Class6067.field26713,
                  this.method2864(),
                  0.8F,
                  0.8F + this.field5024.field9016.nextFloat() * 0.4F,
                  false
               );
         }

         this.method3157(var1, 5);
      }
   }

   public void method2737(Class8654 var1) {
      if (!this.field5041 && !this.field4972) {
         Entity var4 = var1.method31109();
         Class880 var5 = this.method3074();
         if (this.field4979 >= 0 && var5 != null) {
            var5.method2739(this, this.field4979, var1);
         }

         if (this.method3176()) {
            this.method2907();
         }

         this.field4972 = true;
         this.method3073().method27606();
         if (this.field5024 instanceof Class1657) {
            if (var4 != null) {
               var4.method2927((Class1657)this.field5024, this);
            }

            this.method3052(var1);
            this.method3051(var5);
         }

         this.field5024.method6786(this, (byte)3);
         this.method3211(Class2090.field13625);
      }
   }

   public void method3051(Class880 var1) {
      if (!this.field5024.field9020) {
         boolean var4 = false;
         if (var1 instanceof Class1079) {
            if (this.field5024.method6789().method17135(Class5462.field24224)) {
               BlockPos var5 = this.method3432();
               Class7380 var6 = Class8487.field36517.method11579();
               if (this.field5024.method6738(var5).method23393() && var6.method23443(this.field5024, var5)) {
                  this.field5024.method6725(var5, var6, 3);
                  var4 = true;
               }
            }

            if (!var4) {
               Class1000 var7 = new Class1000(this.field5024, this.getPosX(), this.getPosY(), this.getPosZ(), new Class8848(Class8514.field37345));
               this.field5024.method6916(var7);
            }
         }
      }
   }

   public void method3052(Class8654 var1) {
      Entity var4 = var1.method31109();
      int var5;
      if (!(var4 instanceof PlayerEntity)) {
         var5 = 0;
      } else {
         var5 = Class7858.method26330((Class880)var4);
      }

      boolean var6 = this.field4971 > 0;
      if (this.method3010() && this.field5024.method6789().method17135(Class5462.field24227)) {
         this.method3056(var1, var6);
         this.method3054(var1, var5, var6);
      }

      this.method2877();
      this.method3053();
   }

   public void method2877() {
   }

   public void method3053() {
      if (!this.field5024.field9020
         && (this.method2938() || this.field4971 > 0 && this.method3009() && this.field5024.method6789().method17135(Class5462.field24227))) {
         int var3 = this.method2937(this.field4970);

         while (var3 > 0) {
            int var4 = Class1003.method4179(var3);
            var3 -= var4;
            this.field5024.method6916(new Class1003(this.field5024, this.getPosX(), this.getPosY(), this.getPosZ(), var4));
         }
      }
   }

   public void method3054(Class8654 var1, int var2, boolean var3) {
   }

   public ResourceLocation method3055() {
      return this.method3204().method33212();
   }

   public void method3056(Class8654 var1, boolean var2) {
      ResourceLocation var5 = this.method3055();
      Class7318 var6 = this.field5024.method6715().method1411().method1058(var5);
      Class9464 var7 = this.method3057(var2, var1);
      var6.method23181(var7.method36460(Class8524.field38286), this::method3302);
   }

   public Class9464 method3057(boolean var1, Class8654 var2) {
      Class9464 var5 = new Class9464((Class1657)this.field5024)
         .method36450(this.field5054)
         .method36454(Class9525.field44330, this)
         .method36454(Class9525.field44335, this.method3431())
         .method36454(Class9525.field44332, var2)
         .method36455(Class9525.field44333, var2.method31109())
         .method36455(Class9525.field44334, var2.method31113());
      if (var1 && this.field4970 != null) {
         var5 = var5.method36454(Class9525.field44331, this.field4970).method36453(this.field4970.method2978());
      }

      return var5;
   }

   public void method3058(float var1, double var2, double var4) {
      var1 = (float)((double)var1 * (1.0 - this.method3086(Class9173.field42107)));
      if (!(var1 <= 0.0F)) {
         this.field5078 = true;
         Vector3d var8 = this.method3433();
         Vector3d var9 = new Vector3d(var2, 0.0, var4).method11333().method11344((double)var1);
         this.method3435(
            var8.field18048 / 2.0 - var9.field18048,
            !this.field5036 ? var8.field18049 : Math.min(0.4, var8.field18049 / 2.0 + (double)var1),
            var8.field18050 / 2.0 - var9.field18050
         );
      }
   }

   @Nullable
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field26612;
   }

   @Nullable
   public Class9455 method2880() {
      return Class6067.field26607;
   }

   public Class9455 method2926(int var1) {
      return var1 <= 4 ? Class6067.field26613 : Class6067.field26605;
   }

   public Class9455 method3059(Class8848 var1) {
      return var1.method32185();
   }

   public Class9455 method3060(Class8848 var1) {
      return var1.method32186();
   }

   @Override
   public void method3061(boolean var1) {
      super.method3061(var1);
      if (var1) {
         this.field5005 = Optional.<BlockPos>empty();
      }
   }

   public Optional<BlockPos> method3062() {
      return this.field5005;
   }

   public boolean method3063() {
      if (!this.method2800()) {
         BlockPos var3 = this.method3432();
         Class7380 var4 = this.method3064();
         Class3209 var5 = var4.method23383();
         if (!var5.method11540(Class7645.field32804)) {
            if (var5 instanceof Class3206 && this.method3065(var3, var4)) {
               this.field5005 = Optional.<BlockPos>of(var3);
               return true;
            } else {
               return false;
            }
         } else {
            this.field5005 = Optional.<BlockPos>of(var3);
            return true;
         }
      } else {
         return false;
      }
   }

   public Class7380 method3064() {
      return this.field5024.method6738(this.method3432());
   }

   private boolean method3065(BlockPos var1, Class7380 var2) {
      if (var2.<Boolean>method23463(Class3206.field18594)) {
         Class7380 var5 = this.field5024.method6738(var1.method8313());
         if (var5.method23448(Class8487.field36549) && var5.<Direction>method23463(Class3423.field19154) == var2.<Direction>method23463(Class3206.field18484)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean method3066() {
      return !this.field5041 && this.method3042() > 0.0F;
   }

   @Override
   public boolean method2921(float var1, float var2) {
      boolean var5 = super.method2921(var1, var2);
      int var6 = this.method3067(var1, var2);
      if (var6 <= 0) {
         return var5;
      } else {
         this.method2863(this.method2926(var6), 1.0F, 1.0F);
         this.method3068();
         this.method2741(Class8654.field39002, (float)var6);
         return true;
      }
   }

   public int method3067(float var1, float var2) {
      Class2023 var5 = this.method3034(Class8254.field35474);
      float var6 = var5 != null ? (float)(var5.method8629() + 1) : 0.0F;
      return Class9679.method37773((var1 - 3.0F - var6) * var2);
   }

   public void method3068() {
      if (!this.method3245()) {
         int var3 = Class9679.method37769(this.getPosX());
         int var4 = Class9679.method37769(this.getPosY() - 0.2F);
         int var5 = Class9679.method37769(this.getPosZ());
         Class7380 var6 = this.field5024.method6738(new BlockPos(var3, var4, var5));
         if (!var6.method23393()) {
            Class8447 var7 = var6.method23452();
            this.method2863(var7.method29716(), var7.method29710() * 0.5F, var7.method29711() * 0.75F);
         }
      }
   }

   @Override
   public void method3069() {
      this.field4953 = 10;
      this.field4952 = this.field4953;
      this.field4954 = 0.0F;
   }

   public int method3070() {
      return Class9679.method37769(this.method3086(Class9173.field42113));
   }

   public void method2886(Class8654 var1, float var2) {
   }

   public void method2887(float var1) {
   }

   public float method3071(Class8654 var1, float var2) {
      if (!var1.method31133()) {
         this.method2886(var1, var2);
         var2 = Class8913.method32581(var2, (float)this.method3070(), (float)this.method3086(Class9173.field42114));
      }

      return var2;
   }

   public float method3072(Class8654 var1, float var2) {
      if (!var1.method31136()) {
         if (this.method3033(Class8254.field35477) && var1 != Class8654.field39004) {
            int var5 = (this.method3034(Class8254.field35477).method8629() + 1) * 5;
            int var6 = 25 - var5;
            float var7 = var2 * (float)var6;
            float var8 = var2;
            var2 = Math.max(var7 / 25.0F, 0.0F);
            float var9 = var8 - var2;
            if (var9 > 0.0F && var9 < 3.4028235E37F) {
               if (!(this instanceof Class878)) {
                  if (var1.method31109() instanceof Class878) {
                     ((Class878)var1.method31109()).method2912(Class8876.field40129, Math.round(var9 * 10.0F));
                  }
               } else {
                  ((Class878)this).method2912(Class8876.field40133, Math.round(var9 * 10.0F));
               }
            }
         }

         if (!(var2 <= 0.0F)) {
            int var10 = Class7858.method26317(this.method2947(), var1);
            if (var10 > 0) {
               var2 = Class8913.method32582(var2, (float)var10);
            }

            return var2;
         } else {
            return 0.0F;
         }
      } else {
         return var2;
      }
   }

   public void method2888(Class8654 var1, float var2) {
      if (!this.method2760(var1)) {
         var2 = this.method3071(var1, var2);
         var2 = this.method3072(var1, var2);
         float var5 = Math.max(var2 - this.method2959(), 0.0F);
         this.method2958(this.method2959() - (var2 - var5));
         float var6 = var2 - var5;
         if (var6 > 0.0F && var6 < 3.4028235E37F && var1.method31109() instanceof Class878) {
            ((Class878)var1.method31109()).method2912(Class8876.field40128, Math.round(var6 * 10.0F));
         }

         if (var5 != 0.0F) {
            float var7 = this.method3042();
            this.method3043(var7 - var5);
            this.method3073().method27599(var1, var7, var5);
            this.method2958(this.method2959() - var5);
         }
      }
   }

   public Class8039 method3073() {
      return this.field4943;
   }

   @Nullable
   public Class880 method3074() {
      if (this.field4943.method27601() == null) {
         if (this.field4970 == null) {
            return this.field4994 == null ? null : this.field4994;
         } else {
            return this.field4970;
         }
      } else {
         return this.field4943.method27601();
      }
   }

   public final float method3075() {
      return (float)this.method3086(Class9173.field42105);
   }

   public final int method3076() {
      return this.field5063.<Integer>method35445(field4938);
   }

   public final void method3077(int var1) {
      this.field5063.method35446(field4938, var1);
   }

   public final int method3078() {
      return this.field5063.<Integer>method35445(field4939);
   }

   public final void method3079(int var1) {
      this.field5063.method35446(field4939, var1);
   }

   private int method3080() {
      if (!Class7182.method22536(this)) {
         return !this.method3033(Class8254.field35470) ? 6 : 6 + (1 + this.method3034(Class8254.field35470).method8629()) * 2;
      } else {
         return 6 - (1 + Class7182.method22537(this));
      }
   }

   public void method2820(Class79 var1) {
      this.method3081(var1, false);
   }

   public void method3081(Class79 var1, boolean var2) {
      if (!this.field4947 || this.field4949 >= this.method3080() / 2 || this.field4949 < 0) {
         this.field4949 = -1;
         this.field4947 = true;
         this.field4948 = var1;
         if (this.field5024 instanceof Class1657) {
            Class5469 var5 = new Class5469(this, var1 != Class79.field182 ? 3 : 0);
            Class1703 var6 = ((Class1657)this.field5024).method6883();
            if (!var2) {
               var6.method7380(this, var5);
            } else {
               var6.method7379(this, var5);
            }
         }
      }
   }

   @Override
   public void method2866(byte var1) {
      switch (var1) {
         case 2:
         case 33:
         case 36:
         case 37:
         case 44:
            boolean var4 = var1 == 33;
            boolean var5 = var1 == 36;
            boolean var6 = var1 == 37;
            boolean var7 = var1 == 44;
            this.field4960 = 1.5F;
            this.field5061 = 20;
            this.field4953 = 10;
            this.field4952 = this.field4953;
            this.field4954 = 0.0F;
            if (var4) {
               this.method2863(Class6067.field27145, this.method3099(), (this.field5054.nextFloat() - this.field5054.nextFloat()) * 0.2F + 1.0F);
            }

            Class8654 var8;
            if (var6) {
               var8 = Class8654.field38994;
            } else if (var5) {
               var8 = Class8654.field38999;
            } else if (var7) {
               var8 = Class8654.field39012;
            } else {
               var8 = Class8654.field39005;
            }

            Class9455 var9 = this.method2879(var8);
            if (var9 != null) {
               this.method2863(var9, this.method3099(), (this.field5054.nextFloat() - this.field5054.nextFloat()) * 0.2F + 1.0F);
            }

            this.method2741(Class8654.field39005, 0.0F);
            break;
         case 3:
            Class9455 var10 = this.method2880();
            if (var10 != null) {
               this.method2863(var10, this.method3099(), (this.field5054.nextFloat() - this.field5054.nextFloat()) * 0.2F + 1.0F);
            }

            if (!(this instanceof PlayerEntity)) {
               this.method3043(0.0F);
               this.method2737(Class8654.field39005);
            }
            break;
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 31:
         case 32:
         case 34:
         case 35:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 45:
         case 53:
         default:
            super.method2866(var1);
            break;
         case 29:
            this.method2863(Class6067.field27035, 1.0F, 0.8F + this.field5024.field9016.nextFloat() * 0.4F);
            break;
         case 30:
            this.method2863(Class6067.field27036, 0.8F, 0.8F + this.field5024.field9016.nextFloat() * 0.4F);
            break;
         case 46:
            short var11 = 128;

            for (int var12 = 0; var12 < 128; var12++) {
               double var13 = (double)var12 / 127.0;
               float var15 = (this.field5054.nextFloat() - 0.5F) * 0.2F;
               float var16 = (this.field5054.nextFloat() - 0.5F) * 0.2F;
               float var17 = (this.field5054.nextFloat() - 0.5F) * 0.2F;
               double var18 = Class9679.method37822(var13, this.field5025, this.getPosX())
                  + (this.field5054.nextDouble() - 0.5) * (double)this.method3429() * 2.0;
               double var20 = Class9679.method37822(var13, this.field5026, this.getPosY()) + this.field5054.nextDouble() * (double)this.method3430();
               double var22 = Class9679.method37822(var13, this.field5027, this.getPosZ())
                  + (this.field5054.nextDouble() - 0.5) * (double)this.method3429() * 2.0;
               this.field5024.method6746(Class7940.field34090, var18, var20, var22, (double)var15, (double)var16, (double)var17);
            }
            break;
         case 47:
            this.method3050(this.method2943(Class2106.field13731));
            break;
         case 48:
            this.method3050(this.method2943(Class2106.field13732));
            break;
         case 49:
            this.method3050(this.method2943(Class2106.field13736));
            break;
         case 50:
            this.method3050(this.method2943(Class2106.field13735));
            break;
         case 51:
            this.method3050(this.method2943(Class2106.field13734));
            break;
         case 52:
            this.method3050(this.method2943(Class2106.field13733));
            break;
         case 54:
            Class3379.method11977(this);
            break;
         case 55:
            this.method3082();
      }
   }

   private void method3082() {
      Class8848 var3 = this.method2943(Class2106.field13732);
      this.method2944(Class2106.field13732, this.method2943(Class2106.field13731));
      this.method2944(Class2106.field13731, var3);
   }

   @Override
   public void method3083() {
      this.method2741(Class8654.field39004, 4.0F);
   }

   public void method3084() {
      int var3 = this.method3080();
      if (!this.field4947) {
         this.field4949 = 0;
      } else {
         this.field4949++;
         if (this.field4949 >= var3) {
            this.field4949 = 0;
            this.field4947 = false;
         }
      }

      this.field4957 = (float)this.field4949 / (float)var3;
   }

   @Nullable
   public Class9805 method3085(Class4869 var1) {
      return this.method3088().method33380(var1);
   }

   public double method3086(Class4869 var1) {
      return this.method3088().method33383(var1);
   }

   public double method3087(Class4869 var1) {
      return this.method3088().method33384(var1);
   }

   public Class9020 method3088() {
      return this.field4942;
   }

   public Class7809 method3089() {
      return Class7809.field33505;
   }

   public Class8848 method3090() {
      return this.method2943(Class2106.field13731);
   }

   public Class8848 method3091() {
      return this.method2943(Class2106.field13732);
   }

   public boolean method3092(Class3257 var1) {
      return this.method3093(var1x -> var1x == var1);
   }

   public boolean method3093(Predicate<Class3257> var1) {
      return var1.test(this.method3090().method32107()) || var1.test(this.method3091().method32107());
   }

   public Class8848 method3094(Class79 var1) {
      if (var1 != Class79.field182) {
         if (var1 != Class79.field183) {
            throw new IllegalArgumentException("Invalid hand " + var1);
         } else {
            return this.method2943(Class2106.field13732);
         }
      } else {
         return this.method2943(Class2106.field13731);
      }
   }

   public void method3095(Class79 var1, Class8848 var2) {
      if (var1 != Class79.field182) {
         if (var1 != Class79.field183) {
            throw new IllegalArgumentException("Invalid hand " + var1);
         }

         this.method2944(Class2106.field13732, var2);
      } else {
         this.method2944(Class2106.field13731, var2);
      }
   }

   public boolean method3096(Class2106 var1) {
      return !this.method2943(var1).method32105();
   }

   @Override
   public abstract Iterable<Class8848> method2947();

   public abstract Class8848 method2943(Class2106 var1);

   @Override
   public abstract void method2944(Class2106 var1, Class8848 var2);

   public float method3097() {
      Iterable<Class8848> var3 = this.method2947();
      int var4 = 0;
      int var5 = 0;

      for (Class8848 var7 : var3) {
         if (!var7.method32105()) {
            var5++;
         }

         var4++;
      }

      return var4 <= 0 ? 0.0F : (float)var5 / (float)var4;
   }

   @Override
   public void method3098(boolean var1) {
      super.method3098(var1);
      Class9805 var4 = this.method3085(Class9173.field42108);
      if (var4.method38664(field4931) != null) {
         var4.method38670(field4933);
      }

      if (var1) {
         var4.method38667(field4933);
      }
   }

   public float method3099() {
      return 1.0F;
   }

   public float method3100() {
      return !this.method3005()
         ? (this.field5054.nextFloat() - this.field5054.nextFloat()) * 0.2F + 1.0F
         : (this.field5054.nextFloat() - this.field5054.nextFloat()) * 0.2F + 1.5F;
   }

   public boolean method2896() {
      return this.method3044();
   }

   @Override
   public void method3101(Entity var1) {
      if (!this.method3176()) {
         super.method3101(var1);
      }
   }

   private void method3102(Entity var1) {
      Vector3d var4;
      if (!var1.field5041 && !this.field5024.method6738(var1.method3432()).method23383().method11540(Class7645.field32797)) {
         var4 = var1.method3420(this);
      } else {
         var4 = new Vector3d(var1.getPosX(), var1.getPosY() + (double)var1.method3430(), var1.getPosZ());
      }

      this.method2793(var4.field18048, var4.field18049, var4.field18050);
   }

   @Override
   public boolean method2939() {
      return this.method3383();
   }

   public float method3103() {
      return 0.42F * this.method3229();
   }

   public void method2914() {
      float var3 = this.method3103();
      if (this.method3033(Class8254.field35474)) {
         var3 += 0.1F * (float)(this.method3034(Class8254.field35474).method8629() + 1);
      }

      Vector3d var4 = this.method3433();
      Class4436 var5 = new Class4436(new Vector3d(var4.field18048, (double)var3, var4.field18050));
      if (this instanceof ClientPlayerEntity) {
         Client.getInstance().getEventManager().call(var5);
      }

      if (!var5.isCancelled()) {
         this.method3434(var5.method14001());
         if (this.method3337() && !var5.method14000()) {
            float var6 = this.field5031 * (float) (Math.PI / 180.0);
            this.method3434(this.method3433().method11339((double)(-Class9679.method37763(var6) * 0.2F), 0.0, (double)(Class9679.method37764(var6) * 0.2F)));
         }

         this.field5078 = true;
      }
   }

   public void method3104() {
      this.method3434(this.method3433().method11339(0.0, -0.04F, 0.0));
   }

   public void method3105(Class7608<Class7631> var1) {
      this.method3434(this.method3433().method11339(0.0, 0.04F, 0.0));
   }

   public float method3106() {
      return 0.8F;
   }

   public boolean method3107(Class7631 var1) {
      return false;
   }

   public void method2915(Vector3d var1) {
      if (this.method3138() || this.method3418()) {
         double var4 = 0.08;
         boolean var6 = this.method3433().field18049 <= 0.0;
         if (var6 && this.method3033(Class8254.field35494)) {
            var4 = 0.01;
            this.field5045 = 0.0F;
         }

         Class7379 var7 = this.field5024.method6739(this.method3432());
         if (this.method3250() && this.method2897() && !this.method3107(var7.method23472())) {
            double var34 = this.getPosY();
            float var38 = !this.method3337() ? this.method3106() : 0.9F;
            float var39 = 0.02F;
            float var14 = (float)Class7858.method26326(this);
            if (var14 > 3.0F) {
               var14 = 3.0F;
            }

            if (!this.field5036) {
               var14 *= 0.5F;
            }

            if (var14 > 0.0F) {
               var38 += (0.54600006F - var38) * var14 / 3.0F;
               var39 += (this.method2918() - var39) * var14 / 3.0F;
            }

            if (this.method3033(Class8254.field35496)) {
               var38 = 0.96F;
            }

            this.method3265(var39, var1);
            this.move(Class2107.field13742, this.method3433());
            Vector3d var15 = this.method3433();
            if (this.field5037 && this.method3063()) {
               var15 = new Vector3d(var15.field18048, 0.2, var15.field18050);
            }

            this.method3434(var15.method11347((double)var38, 0.8F, (double)var38));
            Vector3d var16 = this.method3110(var4, var6, this.method3433());
            this.method3434(var16);
            if (this.field5037 && this.method3224(var16.field18048, var16.field18049 + 0.6F - this.getPosY() + var34, var16.field18050)) {
               this.method3435(var16.field18048, 0.3F, var16.field18050);
            }
         } else if (this.method3264() && this.method2897() && !this.method3107(var7.method23472())) {
            double var10 = this.getPosY();
            this.method3265(0.02F, var1);
            this.move(Class2107.field13742, this.method3433());
            if (!(this.method3427(Class8953.field40470) <= this.method3428())) {
               this.method3434(this.method3433().method11344(0.5));
            } else {
               this.method3434(this.method3433().method11347(0.5, 0.8F, 0.5));
               Vector3d var36 = this.method3110(var4, var6, this.method3433());
               this.method3434(var36);
            }

            if (!this.method3247()) {
               this.method3434(this.method3433().method11339(0.0, -var4 / 4.0, 0.0));
            }

            Vector3d var37 = this.method3433();
            if (this.field5037 && this.method3224(var37.field18048, var37.field18049 + 0.6F - this.getPosY() + var10, var37.field18050)) {
               this.method3435(var37.field18048, 0.3F, var37.field18050);
            }
         } else if (!this.method3165()) {
            BlockPos var8 = this.method3230();
            float var9 = this.field5024.method6738(var8).method23383().method11571();
            float var12 = !this.field5036 ? 0.91F : var9 * 0.91F;
            Vector3d var13 = this.method3109(var1, var9);
            double var29 = var13.field18049;
            if (!this.method3033(Class8254.field35491)) {
               if (this.field5024.field9020 && !this.field5024.method7017(var8)) {
                  if (!(this.getPosY() > 0.0)) {
                     var29 = 0.0;
                  } else {
                     var29 = -0.1;
                  }
               } else if (!this.method3247()) {
                  var29 -= var4;
               }
            } else {
               var29 += (0.05 * (double)(this.method3034(Class8254.field35491).method8629() + 1) - var13.field18049) * 0.2;
               this.field5045 = 0.0F;
            }

            this.method3435(var13.field18048 * (double)var12, var29 * 0.98F, var13.field18050 * (double)var12);
         } else {
            Vector3d var31 = this.method3433();
            if (var31.field18049 > -0.5) {
               this.field5045 = 1.0F;
            }

            Vector3d var33 = this.method3320();
            float var35 = this.field5032 * (float) (Math.PI / 180.0);
            double var17 = Math.sqrt(var33.field18048 * var33.field18048 + var33.field18050 * var33.field18050);
            double var19 = Math.sqrt(method3234(var31));
            double var21 = var33.method11348();
            float var23 = Class9679.method37764(var35);
            var23 = (float)((double)var23 * (double)var23 * Math.min(1.0, var21 / 0.4));
            var31 = this.method3433().method11339(0.0, var4 * (-1.0 + (double)var23 * 0.75), 0.0);
            if (var31.field18049 < 0.0 && var17 > 0.0) {
               double var24 = var31.field18049 * -0.1 * (double)var23;
               var31 = var31.method11339(var33.field18048 * var24 / var17, var24, var33.field18050 * var24 / var17);
            }

            if (var35 < 0.0F && var17 > 0.0) {
               double var41 = var19 * (double)(-Class9679.method37763(var35)) * 0.04;
               var31 = var31.method11339(-var33.field18048 * var41 / var17, var41 * 3.2, -var33.field18050 * var41 / var17);
            }

            if (var17 > 0.0) {
               var31 = var31.method11339(
                  (var33.field18048 / var17 * var19 - var31.field18048) * 0.1, 0.0, (var33.field18050 / var17 * var19 - var31.field18050) * 0.1
               );
            }

            this.method3434(var31.method11347(0.99F, 0.98F, 0.99F));
            this.move(Class2107.field13742, this.method3433());
            if (this.field5037 && !this.field5024.field9020) {
               double var42 = Math.sqrt(method3234(this.method3433()));
               double var26 = var19 - var42;
               float var28 = (float)(var26 * 10.0 - 3.0);
               if (var28 > 0.0F) {
                  this.method2863(this.method2926((int)var28), 1.0F, 1.0F);
                  this.method2741(Class8654.field39003, var28);
               }
            }

            if (this.field5036 && !this.field5024.field9020) {
               this.method3349(7, false);
            }
         }
      }

      this.method3108(this, this instanceof Class1016);
   }

   public void method3108(Class880 var1, boolean var2) {
      var1.field4959 = var1.field4960;
      double var5 = var1.getPosX() - var1.field5025;
      double var7 = !var2 ? 0.0 : var1.getPosY() - var1.field5026;
      double var9 = var1.getPosZ() - var1.field5027;
      float var11 = Class9679.method37766(var5 * var5 + var7 * var7 + var9 * var9) * 4.0F;
      if (var11 > 1.0F) {
         var11 = 1.0F;
      }

      var1.field4960 = var1.field4960 + (var11 - var1.field4960) * 0.4F;
      var1.field4961 = var1.field4961 + var1.field4960;
   }

   public Vector3d method3109(Vector3d var1, float var2) {
      this.method3265(this.method3112(var2), var1);
      this.method3434(this.method3111(this.method3433()));
      this.move(Class2107.field13742, this.method3433());
      Vector3d var5 = this.method3433();
      if ((this.field5037 || this.field4981) && this.method3063()) {
         var5 = new Vector3d(var5.field18048, 0.2, var5.field18050);
      }

      return var5;
   }

   public Vector3d method3110(double var1, boolean var3, Vector3d var4) {
      if (!this.method3247() && !this.method3337()) {
         double var7;
         if (var3 && Math.abs(var4.field18049 - 0.005) >= 0.003 && Math.abs(var4.field18049 - var1 / 16.0) < 0.003) {
            var7 = -0.003;
         } else {
            var7 = var4.field18049 - var1 / 16.0;
         }

         return new Vector3d(var4.field18048, var7, var4.field18050);
      } else {
         return var4;
      }
   }

   private Vector3d method3111(Vector3d var1) {
      if (this.method3063()) {
         this.field5045 = 0.0F;
         float var4 = 0.15F;
         double var5 = Class9679.method37778(var1.field18048, -0.15F, 0.15F);
         double var7 = Class9679.method37778(var1.field18050, -0.15F, 0.15F);
         double var9 = Math.max(var1.field18049, -0.15F);
         if (var9 < 0.0 && !this.method3064().method23448(Class8487.field37053) && this.method3164() && this instanceof PlayerEntity) {
            var9 = 0.0;
         }

         var1 = new Vector3d(var5, var9, var7);
      }

      return var1;
   }

   private float method3112(float var1) {
      return !this.field5036 ? this.field4969 : this.method2918() * (0.21600002F / (var1 * var1 * var1));
   }

   public float method2918() {
      return this.field4998;
   }

   public void method3113(float var1) {
      this.field4998 = var1;
   }

   public boolean method3114(Entity var1) {
      this.method3020(var1);
      return false;
   }

   @Override
   public void tick() {
      super.tick();
      this.method3150();
      this.method3152();
      if (!this.field5024.field9020) {
         int var11 = this.method3076();
         if (var11 > 0) {
            if (this.field4950 <= 0) {
               this.field4950 = 20 * (30 - var11);
            }

            this.field4950--;
            if (this.field4950 <= 0) {
               this.method3077(var11 - 1);
            }
         }

         int var12 = this.method3078();
         if (var12 > 0) {
            if (this.field4951 <= 0) {
               this.field4951 = 20 * (30 - var12);
            }

            this.field4951--;
            if (this.field4951 <= 0) {
               this.method3079(var12 - 1);
            }
         }

         this.method3115();
         if (this.field5055 % 20 == 0) {
            this.method3073().method27606();
         }

         if (!this.field5086) {
            boolean var13 = this.method3033(Class8254.field35490);
            if (this.method3348(6) != var13) {
               this.method3349(6, var13);
            }
         }

         if (this.method3176() && !this.method3178()) {
            this.method2907();
         }
      }

      this.method2871();
      double var3 = this.getPosX() - this.field5025;
      double var5 = this.getPosZ() - this.field5027;
      float var7 = (float)(var3 * var3 + var5 * var5);
      float var8 = this.field4965;
      float var9 = 0.0F;
      this.field4974 = this.field4975;
      float var10 = 0.0F;
      if (var7 > 0.0025000002F) {
         var10 = 1.0F;
         var9 = (float)Math.sqrt((double)var7) * 3.0F;
         float var14 = (float)Class9679.method37814(var5, var3) * (180.0F / (float)Math.PI) - 90.0F;
         float var15 = Class9679.method37771(Class9679.method37792(this.field5031) - var14);
         if (95.0F < var15 && var15 < 265.0F) {
            var8 = var14 - 180.0F;
         } else {
            var8 = var14;
         }
      }

      if (this.field4957 > 0.0F) {
         var8 = this.field5031;
      }

      if (!this.field5036) {
         var10 = 0.0F;
      }

      this.field4975 = this.field4975 + (var10 - this.field4975) * 0.3F;
      this.field5024.method6820().method22503("headTurn");
      var9 = this.method3123(var8, var9);
      this.field5024.method6820().method22505();
      this.field5024.method6820().method22503("rangeChecks");

      while (this.field5031 - this.field5033 < -180.0F) {
         this.field5033 -= 360.0F;
      }

      while (this.field5031 - this.field5033 >= 180.0F) {
         this.field5033 += 360.0F;
      }

      while (this.field4965 - this.field4966 < -180.0F) {
         this.field4966 -= 360.0F;
      }

      while (this.field4965 - this.field4966 >= 180.0F) {
         this.field4966 += 360.0F;
      }

      while (this.field5032 - this.field5034 < -180.0F) {
         this.field5034 -= 360.0F;
      }

      while (this.field5032 - this.field5034 >= 180.0F) {
         this.field5034 += 360.0F;
      }

      while (this.field4967 - this.field4968 < -180.0F) {
         this.field4968 -= 360.0F;
      }

      while (this.field4967 - this.field4968 >= 180.0F) {
         this.field4968 += 360.0F;
      }

      this.field5024.method6820().method22505();
      this.field4976 += var9;
      if (!this.method3165()) {
         this.field5003 = 0;
      } else {
         this.field5003++;
      }

      if (this.method3176()) {
         this.field5032 = 0.0F;
      }
   }

   private void method3115() {
      Map var3 = this.method3116();
      if (var3 != null) {
         this.method3117(var3);
         if (!var3.isEmpty()) {
            this.method3118(var3);
         }
      }
   }

   @Nullable
   private Map<Class2106, Class8848> method3116() {
      EnumMap var3 = null;

      for (Class2106 var7 : Class2106.values()) {
         Class8848 var8;
         switch (Class8717.field39333[var7.method8772().ordinal()]) {
            case 1:
               var8 = this.method3121(var7);
               break;
            case 2:
               var8 = this.method3119(var7);
               break;
            default:
               continue;
         }

         Class8848 var9 = this.method2943(var7);
         if (!Class8848.method32128(var9, var8)) {
            if (var3 == null) {
               var3 = Maps.newEnumMap(Class2106.class);
            }

            var3.put(var7, var9);
            if (!var8.method32105()) {
               this.method3088().method33386(var8.method32171(var7));
            }

            if (!var9.method32105()) {
               this.method3088().method33387(var9.method32171(var7));
            }
         }
      }

      return var3;
   }

   private void method3117(Map<Class2106, Class8848> var1) {
      Class8848 var4 = (Class8848)var1.get(Class2106.field13731);
      Class8848 var5 = (Class8848)var1.get(Class2106.field13732);
      if (var4 != null
         && var5 != null
         && Class8848.method32128(var4, this.method3121(Class2106.field13732))
         && Class8848.method32128(var5, this.method3121(Class2106.field13731))) {
         ((Class1657)this.field5024).method6883().method7380(this, new Class5464(this, (byte)55));
         var1.remove(Class2106.field13731);
         var1.remove(Class2106.field13732);
         this.method3122(Class2106.field13731, var4.method32126());
         this.method3122(Class2106.field13732, var5.method32126());
      }
   }

   private void method3118(Map<Class2106, Class8848> var1) {
      ArrayList var4 = Lists.newArrayListWithCapacity(var1.size());
      var1.forEach((var2, var3) -> {
         Class8848 var6 = var3.method32126();
         var4.add(Pair.of(var2, var6));
         switch (Class8717.field39333[var2.method8772().ordinal()]) {
            case 1:
               this.method3122(var2, var6);
               break;
            case 2:
               this.method3120(var2, var6);
         }
      });
      ((Class1657)this.field5024).method6883().method7380(this, new Class5588(this.method3205(), var4));
   }

   private Class8848 method3119(Class2106 var1) {
      return this.field4946.get(var1.method8773());
   }

   private void method3120(Class2106 var1, Class8848 var2) {
      this.field4946.set(var1.method8773(), var2);
   }

   private Class8848 method3121(Class2106 var1) {
      return this.field4945.get(var1.method8773());
   }

   private void method3122(Class2106 var1, Class8848 var2) {
      this.field4945.set(var1.method8773(), var2);
   }

   public float method3123(float var1, float var2) {
      float var5 = Class9679.method37792(var1 - this.field4965);
      this.field4965 += var5 * 0.3F;
      float var6 = Class9679.method37792(this.field5031 - this.field4965);
      boolean var7 = var6 < -90.0F || var6 >= 90.0F;
      if (var6 < -75.0F) {
         var6 = -75.0F;
      }

      if (var6 >= 75.0F) {
         var6 = 75.0F;
      }

      this.field4965 = this.field5031 - var6;
      if (var6 * var6 > 2500.0F) {
         this.field4965 += var6 * 0.2F;
      }

      if (var7) {
         var2 *= -1.0F;
      }

      return var2;
   }

   public void method2871() {
      if (this.field4999 > 0) {
         this.field4999--;
      }

      if (this.method3418()) {
         this.field4985 = 0;
         this.method3201(this.getPosX(), this.getPosY(), this.getPosZ());
      }

      if (this.field4985 <= 0) {
         if (!this.method3138()) {
            this.method3434(this.method3433().method11344(0.98));
         }
      } else {
         double var10 = this.getPosX() + (this.field4986 - this.getPosX()) / (double)this.field4985;
         double var12 = this.getPosY() + (this.field4987 - this.getPosY()) / (double)this.field4985;
         double var14 = this.getPosZ() + (this.field4988 - this.getPosZ()) / (double)this.field4985;
         double var16 = Class9679.method37793(this.field4989 - (double)this.field5031);
         this.field5031 = (float)((double)this.field5031 + var16 / (double)this.field4985);
         this.field5032 = (float)((double)this.field5032 + (this.field4990 - (double)this.field5032) / (double)this.field4985);
         this.field4985--;
         this.method3215(var10, var12, var14);
         this.method3214(this.field5031, this.field5032);
      }

      if (this.field4992 > 0) {
         this.field4967 = (float)((double)this.field4967 + Class9679.method37793(this.field4991 - (double)this.field4967) / (double)this.field4992);
         this.field4992--;
      }

      Vector3d var3 = this.method3433();
      double var4 = var3.field18048;
      double var6 = var3.field18049;
      double var8 = var3.field18050;
      if (Math.abs(var3.field18048) < 0.003) {
         var4 = 0.0;
      }

      if (Math.abs(var3.field18049) < 0.003) {
         var6 = 0.0;
      }

      if (Math.abs(var3.field18050) < 0.003) {
         var8 = 0.0;
      }

      this.method3435(var4, var6, var8);
      this.field5024.method6820().method22503("ai");
      if (!this.method2896()) {
         if (this.method3138()) {
            this.field5024.method6820().method22503("newAi");
            this.updateEntityActionState();
            this.field5024.method6820().method22505();
         }
      } else {
         this.field4981 = false;
         this.field4982 = 0.0F;
         this.field4984 = 0.0F;
      }

      this.field5024.method6820().method22505();
      this.field5024.method6820().method22503("jump");
      if (this.field4981 && this.method2897()) {
         double var18;
         if (!this.method3264()) {
            var18 = this.method3427(Class8953.field40469);
         } else {
            var18 = this.method3427(Class8953.field40470);
         }

         boolean var20 = this.method3250() && var18 > 0.0;
         double var21 = this.method3428();
         if (!var20 || this.field5036 && !(var18 > var21)) {
            if (!this.method3264() || this.field5036 && !(var18 > var21)) {
               if ((this.field5036 || var20 && var18 <= var21) && this.field4999 == 0) {
                  this.method2914();
                  this.field4999 = 10;
               }
            } else {
               this.method3105(Class8953.field40470);
            }
         } else {
            this.method3105(Class8953.field40469);
         }
      } else {
         this.field4999 = 0;
      }

      this.field5024.method6820().method22505();
      this.field5024.method6820().method22503("travel");
      this.field4982 *= 0.98F;
      this.field4984 *= 0.98F;
      this.method3125();
      Class6488 var23 = this.method3389();
      this.method2915(new Vector3d((double)this.field4982, (double)this.field4983, (double)this.field4984));
      this.field5024.method6820().method22505();
      this.field5024.method6820().method22503("push");
      if (this.field5008 > 0) {
         this.field5008--;
         this.method3127(var23, this.method3389());
      }

      this.method3126();
      this.field5024.method6820().method22505();
      if (!this.field5024.field9020 && this.method3124() && this.method3254()) {
         this.method2741(Class8654.field38999, 1.0F);
      }
   }

   public boolean method3124() {
      return false;
   }

   private void method3125() {
      boolean var3 = this.method3348(7);
      if (var3 && !this.field5036 && !this.method3328() && !this.method3033(Class8254.field35491)) {
         Class8848 var4 = this.method2943(Class2106.field13735);
         if (var4.method32107() == Class8514.field38120 && Class3256.method11698(var4)) {
            var3 = true;
            if (!this.field5024.field9020 && (this.field5003 + 1) % 20 == 0) {
               var4.method32121(1, this, var0 -> var0.method3184(Class2106.field13735));
            }
         } else {
            var3 = false;
         }
      } else {
         var3 = false;
      }

      if (!this.field5024.field9020) {
         this.method3349(7, var3);
      }
   }

   public void updateEntityActionState() {
   }

   public void method3126() {
      List var3 = this.field5024.method6770(this, this.method3389(), Class8088.method27981(this));
      if (!var3.isEmpty()) {
         int var4 = this.field5024.method6789().method17136(Class5462.field24241);
         if (var4 > 0 && var3.size() > var4 - 1 && this.field5054.nextInt(4) == 0) {
            int var5 = 0;

            for (int var6 = 0; var6 < var3.size(); var6++) {
               if (!((Entity)var3.get(var6)).method3328()) {
                  var5++;
               }
            }

            if (var5 > var4 - 1) {
               this.method2741(Class8654.field38998, 6.0F);
            }
         }

         for (int var7 = 0; var7 < var3.size(); var7++) {
            Entity var8 = (Entity)var3.get(var7);
            this.method3128(var8);
         }
      }
   }

   public void method3127(Class6488 var1, Class6488 var2) {
      Class6488 var5 = var1.method19666(var2);
      List var6 = this.field5024.method7181(this, var5);
      if (var6.isEmpty()) {
         if (this.field5037) {
            this.field5008 = 0;
         }
      } else {
         for (int var7 = 0; var7 < var6.size(); var7++) {
            Entity var8 = (Entity)var6.get(var7);
            if (var8 instanceof Class880) {
               this.method2900((Class880)var8);
               this.field5008 = 0;
               this.method3434(this.method3433().method11344(-0.2));
               break;
            }
         }
      }

      if (!this.field5024.field9020 && this.field5008 <= 0) {
         this.method3153(4, false);
      }
   }

   public void method3128(Entity var1) {
      var1.method3101(this);
   }

   public void method2900(Class880 var1) {
   }

   public void method3129(int var1) {
      this.field5008 = var1;
      if (!this.field5024.field9020) {
         this.method3153(4, true);
      }
   }

   public boolean method3130() {
      return (this.field5063.<Byte>method35445(field4934) & 4) != 0;
   }

   @Override
   public void method2759() {
      Entity var3 = this.method3421();
      super.method2759();
      if (var3 != null && var3 != this.method3421() && !this.field5024.field9020) {
         this.method3102(var3);
      }
   }

   @Override
   public void method2868() {
      super.method2868();
      this.field4974 = this.field4975;
      this.field4975 = 0.0F;
      this.field5045 = 0.0F;
   }

   @Override
   public void method3131(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.field4986 = var1;
      this.field4987 = var3;
      this.field4988 = var5;
      this.field4989 = (double)var7;
      this.field4990 = (double)var8;
      this.field4985 = var9;
   }

   @Override
   public void method3132(float var1, int var2) {
      this.field4991 = (double)var1;
      this.field4992 = var2;
   }

   public void method3133(boolean var1) {
      this.field4981 = var1;
   }

   public void method3134(Class1000 var1) {
      PlayerEntity var4 = var1.method4128() == null ? null : this.field5024.method7196(var1.method4128());
      if (var4 instanceof Class878) {
         Class9551.field44505.method15090((Class878)var4, var1.method4124(), this);
      }
   }

   public void method2751(Entity var1, int var2) {
      if (!var1.field5041 && !this.field5024.field9020 && (var1 instanceof Class1000 || var1 instanceof Class884 || var1 instanceof Class1003)) {
         ((Class1657)this.field5024).method6883().method7380(var1, new Class5467(var1.method3205(), this.method3205(), var2));
      }
   }

   public boolean method3135(Entity var1) {
      Vector3d var4 = new Vector3d(this.getPosX(), this.method3442(), this.getPosZ());
      Vector3d var5 = new Vector3d(var1.getPosX(), var1.method3442(), var1.getPosZ());
      return this.field5024.method7036(new Class6809(var4, var5, Class2271.field14774, Class1985.field12962, this)).method31417() == Class2100.field13689;
   }

   @Override
   public float method3136(float var1) {
      return var1 != 1.0F ? Class9679.method37821(var1, this.field4968, this.field4967) : this.field4967;
   }

   public float method3137(float var1) {
      float var4 = this.field4957 - this.field4956;
      if (var4 < 0.0F) {
         var4++;
      }

      return this.field4956 + var4 * var1;
   }

   public boolean method3138() {
      return !this.field5024.field9020;
   }

   @Override
   public boolean method3139() {
      return !this.field5041;
   }

   @Override
   public boolean method3140() {
      return this.method3066() && !this.method2800() && !this.method3063();
   }

   @Override
   public void method3141() {
      this.field5039 = this.field5054.nextDouble() >= this.method3086(Class9173.field42107);
   }

   @Override
   public float method3142() {
      return this.field4967;
   }

   @Override
   public void method3143(float var1) {
      this.field4967 = var1;
   }

   @Override
   public void method3144(float var1) {
      this.field4965 = var1;
   }

   @Override
   public Vector3d method3145(Class113 var1, Class9502 var2) {
      return method3146(super.method3145(var1, var2));
   }

   public static Vector3d method3146(Vector3d var0) {
      return new Vector3d(var0.field18048, var0.field18049, 0.0);
   }

   public float method2959() {
      return this.field5000;
   }

   public void method2958(float var1) {
      if (var1 < 0.0F) {
         var1 = 0.0F;
      }

      this.field5000 = var1;
   }

   public void method2730() {
   }

   public void method2731() {
   }

   public void method3147() {
      this.field4993 = true;
   }

   public abstract Class2205 method2967();

   public boolean method3148() {
      return (this.field5063.<Byte>method35445(field4934) & 1) > 0;
   }

   public Class79 method3149() {
      return (this.field5063.<Byte>method35445(field4934) & 2) <= 0 ? Class79.field182 : Class79.field183;
   }

   private void method3150() {
      if (this.method3148()) {
         if (!Class8848.method32131(this.method3094(this.method3149()), this.field5001)) {
            this.method3162();
         } else {
            this.field5001 = this.method3094(this.method3149());
            this.field5001.method32183(this.field5024, this, this.method3159());
            if (this.method3151()) {
               this.method3156(this.field5001, 5);
            }

            if (--this.field5002 == 0 && !this.field5024.field9020 && !this.field5001.method32140()) {
               this.method2786();
            }
         }
      }
   }

   private boolean method3151() {
      int var3 = this.method3159();
      Class9427 var4 = this.field5001.method32107().method11745();
      boolean var5 = var4 != null && var4.method36161();
      var5 |= var3 <= this.field5001.method32137() - 7;
      return var5 && var3 % 4 == 0;
   }

   private void method3152() {
      this.field5010 = this.field5009;
      if (!this.method3166()) {
         this.field5009 = Math.max(0.0F, this.field5009 - 0.09F);
      } else {
         this.field5009 = Math.min(1.0F, this.field5009 + 0.09F);
      }
   }

   public void method3153(int var1, boolean var2) {
      int var5 = this.field5063.<Byte>method35445(field4934);
      if (!var2) {
         var5 &= ~var1;
      } else {
         var5 |= var1;
      }

      this.field5063.method35446(field4934, (byte)var5);
   }

   public void method3154(Class79 var1) {
      Class8848 var4 = this.method3094(var1);
      if (!var4.method32105() && !this.method3148()) {
         this.field5001 = var4;
         this.field5002 = var4.method32137();
         if (!this.field5024.field9020) {
            this.method3153(1, true);
            this.method3153(2, var1 == Class79.field183);
         }
      }
   }

   @Override
   public void method3155(Class9289<?> var1) {
      super.method3155(var1);
      if (!field4940.equals(var1)) {
         if (field4934.equals(var1) && this.field5024.field9020) {
            if (this.method3148() && this.field5001.method32105()) {
               this.field5001 = this.method3094(this.method3149());
               if (!this.field5001.method32105()) {
                  this.field5002 = this.field5001.method32137();
               }
            } else if (!this.method3148() && !this.field5001.method32105()) {
               this.field5001 = Class8848.field39973;
               this.field5002 = 0;
            }
         }
      } else if (this.field5024.field9020) {
         this.method3173().ifPresent(this::method3177);
      }
   }

   @Override
   public void method2787(Class2062 var1, Vector3d var2) {
      super.method2787(var1, var2);
      this.field4968 = this.field4967;
      this.field4965 = this.field4967;
      this.field4966 = this.field4965;
   }

   public void method3156(Class8848 var1, int var2) {
      if (!var1.method32105() && this.method3148()) {
         if (var1.method32138() == Class2103.field13708) {
            this.method2863(this.method3059(var1), 0.5F, this.field5024.field9016.nextFloat() * 0.1F + 0.9F);
         }

         if (var1.method32138() == Class2103.field13707) {
            this.method3157(var1, var2);
            this.method2863(
               this.method3060(var1), 0.5F + 0.5F * (float)this.field5054.nextInt(2), (this.field5054.nextFloat() - this.field5054.nextFloat()) * 0.2F + 1.0F
            );
         }
      }
   }

   private void method3157(Class8848 var1, int var2) {
      for (int var5 = 0; var5 < var2; var5++) {
         Vector3d var6 = new Vector3d(((double)this.field5054.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         var6 = var6.method11350(-this.field5032 * (float) (Math.PI / 180.0));
         var6 = var6.method11351(-this.field5031 * (float) (Math.PI / 180.0));
         double var7 = (double)(-this.field5054.nextFloat()) * 0.6 - 0.3;
         Vector3d var9 = new Vector3d(((double)this.field5054.nextFloat() - 0.5) * 0.3, var7, 0.6);
         var9 = var9.method11350(-this.field5032 * (float) (Math.PI / 180.0));
         var9 = var9.method11351(-this.field5031 * (float) (Math.PI / 180.0));
         var9 = var9.method11339(this.getPosX(), this.method3442(), this.getPosZ());
         this.field5024
            .method6746(
               new Class7438(Class7940.field34082, var1),
               var9.field18048,
               var9.field18049,
               var9.field18050,
               var6.field18048,
               var6.field18049 + 0.05,
               var6.field18050
            );
      }
   }

   public void method2786() {
      Class79 var3 = this.method3149();
      if (this.field5001.equals(this.method3094(var3))) {
         if (!this.field5001.method32105() && this.method3148()) {
            this.method3156(this.field5001, 16);
            Class8848 var4 = this.field5001.method32111(this.field5024, this);
            if (var4 != this.field5001) {
               this.method3095(var3, var4);
            }

            this.method3162();
         }
      } else {
         this.method3161();
      }
   }

   public Class8848 method3158() {
      return this.field5001;
   }

   public int method3159() {
      return this.field5002;
   }

   public int method3160() {
      return !this.method3148() ? 0 : this.field5001.method32137() - this.method3159();
   }

   public void method3161() {
      if (!this.field5001.method32105()) {
         this.field5001.method32139(this.field5024, this, this.method3159());
         if (this.field5001.method32140()) {
            this.method3150();
         }
      }

      this.method3162();
   }

   public void method3162() {
      if (!this.field5024.field9020) {
         this.method3153(1, false);
      }

      this.field5001 = Class8848.field39973;
      this.field5002 = 0;
   }

   public boolean method3163() {
      if (this.method3148() && !this.field5001.method32105()) {
         Class3257 var3 = this.field5001.method32107();
         return var3.method11727(this.field5001) == Class2103.field13709 ? var3.method11728(this.field5001) - this.field5002 >= 5 : false;
      } else {
         return false;
      }
   }

   public boolean method3164() {
      return this.method3331();
   }

   public boolean method3165() {
      return this.method3348(7);
   }

   @Override
   public boolean method3166() {
      return super.method3166() || !this.method3165() && this.method3212() == Class2090.field13620;
   }

   public int method3167() {
      return this.field5003;
   }

   public boolean method3168(double var1, double var3, double var5, boolean var7) {
      double var10 = this.getPosX();
      double var12 = this.getPosY();
      double var14 = this.getPosZ();
      double var16 = var3;
      boolean var18 = false;
      BlockPos var19 = new BlockPos(var1, var3, var5);
      Class1655 var20 = this.field5024;
      if (var20.method7017(var19)) {
         boolean var21 = false;

         while (!var21 && var19.getY() > 0) {
            BlockPos var22 = var19.method8313();
            Class7380 var23 = var20.method6738(var22);
            if (!var23.method23384().method31087()) {
               var16--;
               var19 = var22;
            } else {
               var21 = true;
            }
         }

         if (var21) {
            this.method2793(var1, var16, var5);
            if (var20.method7052(this) && !var20.method7014(this.method3389())) {
               var18 = true;
            }
         }
      }

      if (var18) {
         if (var7) {
            var20.method6786(this, (byte)46);
         }

         if (this instanceof Class1046) {
            ((Class1046)this).method4230().method21666();
         }

         return true;
      } else {
         this.method2793(var10, var12, var14);
         return false;
      }
   }

   public boolean method3169() {
      return true;
   }

   public boolean method3170() {
      return true;
   }

   public void method3171(BlockPos var1, boolean var2) {
   }

   public boolean method2980(Class8848 var1) {
      return false;
   }

   @Override
   public Packet<?> method2835() {
      return new Class5582(this);
   }

   @Override
   public Class8847 method2981(Class2090 var1) {
      return var1 != Class2090.field13621 ? super.method2981(var1).method32099(this.method3006()) : field4941;
   }

   public ImmutableList<Class2090> method2982() {
      return ImmutableList.of(Class2090.field13619);
   }

   public Class6488 method3172(Class2090 var1) {
      Class8847 var4 = this.method2981(var1);
      return new Class6488(
         (double)(-var4.field39968 / 2.0F),
         0.0,
         (double)(-var4.field39968 / 2.0F),
         (double)(var4.field39968 / 2.0F),
         (double)var4.field39969,
         (double)(var4.field39968 / 2.0F)
      );
   }

   public Optional<BlockPos> method3173() {
      return this.field5063.<Optional<BlockPos>>method35445(field4940);
   }

   public void method3174(BlockPos var1) {
      this.field5063.method35446(field4940, Optional.<BlockPos>of(var1));
   }

   public void method3175() {
      this.field5063.method35446(field4940, Optional.<BlockPos>empty());
   }

   public boolean method3176() {
      return this.method3173().isPresent();
   }

   public void method2753(BlockPos var1) {
      if (this.method3328()) {
         this.method2759();
      }

      Class7380 var4 = this.field5024.method6738(var1);
      if (var4.method23383() instanceof Class3250) {
         this.field5024.method6725(var1, var4.method23465(Class3250.field18714, Boolean.valueOf(true)), 3);
      }

      this.method3211(Class2090.field13621);
      this.method3177(var1);
      this.method3174(var1);
      this.method3434(Vector3d.field18047);
      this.field5078 = true;
   }

   private void method3177(BlockPos var1) {
      this.method3215((double)var1.method8304() + 0.5, (double)var1.getY() + 0.6875, (double)var1.method8306() + 0.5);
   }

   private boolean method3178() {
      return this.method3173().<Boolean>map(var1 -> this.field5024.method6738(var1).method23383() instanceof Class3250).orElse(false);
   }

   public void method2907() {
      this.method3173().filter(this.field5024::method7017).ifPresent(var1 -> {
         Class7380 var4 = this.field5024.method6738(var1);
         if (var4.method23383() instanceof Class3250) {
            this.field5024.method6725(var1, var4.method23465(Class3250.field18714, Boolean.valueOf(false)), 3);
            Vector3d var5 = Class3250.method11686(this.method3204(), this.field5024, var1, this.field5031).orElseGet(() -> {
               BlockPos var3x = var1.method8311();
               return new Vector3d((double)var3x.method8304() + 0.5, (double)var3x.getY() + 0.1, (double)var3x.method8306() + 0.5);
            });
            Vector3d var6 = Vector3d.method11330(var1).method11336(var5).method11333();
            float var7 = (float)Class9679.method37793(Class9679.method37814(var6.field18050, var6.field18048) * 180.0F / (float)Math.PI - 90.0);
            this.method3215(var5.field18048, var5.field18049, var5.field18050);
            this.field5031 = var7;
            this.field5032 = 0.0F;
         }
      });
      Vector3d var3 = this.method3431();
      this.method3211(Class2090.field13619);
      this.method3215(var3.field18048, var3.field18049, var3.field18050);
      this.method3175();
   }

   @Nullable
   public Direction method3179() {
      BlockPos var3 = this.method3173().orElse((BlockPos)null);
      return var3 == null ? null : Class3250.method11678(this.field5024, var3);
   }

   @Override
   public boolean method3180() {
      return !this.method3176() && super.method3180();
   }

   @Override
   public final float method3181(Class2090 var1, Class8847 var2) {
      return var1 != Class2090.field13621 ? this.method2957(var1, var2) : 0.2F;
   }

   public float method2957(Class2090 var1, Class8847 var2) {
      return super.method3181(var1, var2);
   }

   public Class8848 method2983(Class8848 var1) {
      return Class8848.field39973;
   }

   public Class8848 method2984(Class1655 var1, Class8848 var2) {
      if (var2.method32184()) {
         var1.method6743(
            (PlayerEntity)null,
            this.getPosX(),
            this.getPosY(),
            this.getPosZ(),
            this.method3060(var2),
            Class2266.field14734,
            1.0F,
            1.0F + (var1.field9016.nextFloat() - var1.field9016.nextFloat()) * 0.4F
         );
         this.method3182(var2, var1, this);
         if (!(this instanceof PlayerEntity) || !((PlayerEntity)this).field4919.field29609) {
            var2.method32182(1);
         }
      }

      return var2;
   }

   private void method3182(Class8848 var1, Class1655 var2, Class880 var3) {
      Class3257 var6 = var1.method32107();
      if (var6.method11744()) {
         for (Pair var8 : var6.method11745().method36162()) {
            if (!var2.field9020 && var8.getFirst() != null && var2.field9016.nextFloat() < (Float)var8.getSecond()) {
               var3.method3035(new Class2023((Class2023)var8.getFirst()));
            }
         }
      }
   }

   private static byte method3183(Class2106 var0) {
      switch (Class8717.field39334[var0.ordinal()]) {
         case 1:
            return 47;
         case 2:
            return 48;
         case 3:
            return 49;
         case 4:
            return 50;
         case 5:
            return 52;
         case 6:
            return 51;
         default:
            return 47;
      }
   }

   public void method3184(Class2106 var1) {
      this.field5024.method6786(this, method3183(var1));
   }

   public void method3185(Class79 var1) {
      this.method3184(var1 != Class79.field182 ? Class2106.field13732 : Class2106.field13731);
   }

   @Override
   public Class6488 method3186() {
      if (this.method2943(Class2106.field13736).method32107() != Class8514.field38063) {
         return super.method3186();
      } else {
         float var3 = 0.5F;
         return this.method3389().method19663(0.5, 0.5, 0.5);
      }
   }
}
