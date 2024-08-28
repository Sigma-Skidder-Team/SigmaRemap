package mapped;

import javax.annotation.Nullable;
import java.util.Random;
import java.util.function.Predicate;

public class Class1097 extends Class1018 {
   private static final Class9289<Integer> field6017 = Class9361.<Integer>method35441(Class1097.class, Class7784.field33391);
   private static final Class9289<Integer> field6018 = Class9361.<Integer>method35441(Class1097.class, Class7784.field33391);
   private static final Class9289<Integer> field6019 = Class9361.<Integer>method35441(Class1097.class, Class7784.field33391);
   private static final Class9289<Byte> field6020 = Class9361.<Byte>method35441(Class1097.class, Class7784.field33390);
   private static final Class9289<Byte> field6021 = Class9361.<Byte>method35441(Class1097.class, Class7784.field33390);
   private static final Class9289<Byte> field6022 = Class9361.<Byte>method35441(Class1097.class, Class7784.field33390);
   private static final Class8522 field6023 = new Class8522().method30203(8.0).method30205().method30204();
   private boolean field6024;
   private boolean field6025;
   public int field6026;
   private Vector3d field6027;
   private float field6028;
   private float field6029;
   private float field6030;
   private float field6031;
   private float field6032;
   private float field6033;
   private Class2616 field6034;
   private static final Predicate<Class1000> field6035 = var0 -> {
      Class3257 var3 = var0.method4124().method32107();
      return (var3 == Blocks.field37009.method11581() || var3 == Blocks.field36591.method11581()) && var0.method3066() && !var0.method4135();
   };

   public Class1097(Class8992<? extends Class1097> var1, Class1655 var2) {
      super(var1, var2);
      this.field5596 = new Class6834(this);
      if (!this.method3005()) {
         this.method4281(true);
      }
   }

   @Override
   public boolean method2980(ItemStack var1) {
      Class2106 var4 = Class1006.method4271(var1);
      return !this.method2943(var4).method32105() ? false : var4 == Class2106.field13731 && super.method2980(var1);
   }

   public int method5186() {
      return this.field5063.<Integer>method35445(field6017);
   }

   public void method5187(int var1) {
      this.field5063.method35446(field6017, var1);
   }

   public boolean method5188() {
      return this.method5206(2);
   }

   public boolean method5189() {
      return this.method5206(8);
   }

   public void method5190(boolean var1) {
      this.method5207(8, var1);
   }

   public boolean method5191() {
      return this.method5206(16);
   }

   public void method5192(boolean var1) {
      this.method5207(16, var1);
   }

   public boolean method5193() {
      return this.field5063.<Integer>method35445(field6019) > 0;
   }

   public void method5194(boolean var1) {
      this.field5063.method35446(field6019, !var1 ? 0 : 1);
   }

   private int method5195() {
      return this.field5063.<Integer>method35445(field6019);
   }

   private void method5196(int var1) {
      this.field5063.method35446(field6019, var1);
   }

   public void method5197(boolean var1) {
      this.method5207(2, var1);
      if (!var1) {
         this.method5199(0);
      }
   }

   public int method5198() {
      return this.field5063.<Integer>method35445(field6018);
   }

   public void method5199(int var1) {
      this.field5063.method35446(field6018, var1);
   }

   public Class2293 method5200() {
      return Class2293.method9046(this.field5063.<Byte>method35445(field6020));
   }

   public void method5201(Class2293 var1) {
      if (var1.method9042() > 6) {
         var1 = Class2293.method9048(this.field5054);
      }

      this.field5063.method35446(field6020, (byte)var1.method9042());
   }

   public Class2293 method5202() {
      return Class2293.method9046(this.field5063.<Byte>method35445(field6021));
   }

   public void method5203(Class2293 var1) {
      if (var1.method9042() > 6) {
         var1 = Class2293.method9048(this.field5054);
      }

      this.field5063.method35446(field6021, (byte)var1.method9042());
   }

   public boolean method5204() {
      return this.method5206(4);
   }

   public void method5205(boolean var1) {
      this.method5207(4, var1);
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field6017, 0);
      this.field5063.method35442(field6018, 0);
      this.field5063.method35442(field6020, (byte)0);
      this.field5063.method35442(field6021, (byte)0);
      this.field5063.method35442(field6022, (byte)0);
      this.field5063.method35442(field6019, 0);
   }

   private boolean method5206(int var1) {
      return (this.field5063.<Byte>method35445(field6022) & var1) != 0;
   }

   private void method5207(int var1, boolean var2) {
      byte var5 = this.field5063.<Byte>method35445(field6022);
      if (!var2) {
         this.field5063.method35446(field6022, (byte)(var5 & ~var1));
      } else {
         this.field5063.method35446(field6022, (byte)(var5 | var1));
      }
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      var1.method109("MainGene", this.method5200().method9043());
      var1.method109("HiddenGene", this.method5202().method9043());
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      this.method5201(Class2293.method9047(var1.method126("MainGene")));
      this.method5203(Class2293.method9047(var1.method126("HiddenGene")));
   }

   @Nullable
   @Override
   public Class1045 method4389(ServerWorld var1, Class1045 var2) {
      Class1097 var5 = Class8992.field41061.method33215(var1);
      if (var2 instanceof Class1097) {
         var5.method5225(this, (Class1097)var2);
      }

      var5.method5227();
      return var5;
   }

   @Override
   public void method4219() {
      this.field5600.method20002(0, new Class2603(this));
      this.field5600.method20002(2, new Class2748(this, 2.0));
      this.field5600.method20002(2, new Class2788(this, this, 1.0));
      this.field5600.method20002(3, new Class2649(this, 1.2F, true));
      this.field5600.method20002(4, new Class2680(this, 1.0, Class120.method339(Blocks.field37009.method11581()), false));
      this.field5600.method20002(6, new Class2771<PlayerEntity>(this, PlayerEntity.class, 8.0F, 2.0, 2.0));
      this.field5600.method20002(6, new Class2771<Class1009>(this, Class1009.class, 4.0F, 2.0, 2.0));
      this.field5600.method20002(7, new Class2623(this));
      this.field5600.method20002(8, new Class2689(this));
      this.field5600.method20002(8, new Class2769(this));
      this.field6034 = new Class2616(this, PlayerEntity.class, 6.0F);
      this.field5600.method20002(9, this.field6034);
      this.field5600.method20002(10, new Class2668(this));
      this.field5600.method20002(12, new Class2732(this));
      this.field5600.method20002(13, new Class2764(this, 1.25));
      this.field5600.method20002(14, new Class2737(this, 1.0));
      this.field5601.method20002(1, new Class2706(this).method10918(new Class[0]));
   }

   public static Class7037 method5208() {
      return Class1006.method4220().method21849(Class9173.field42108, 0.15F).method21849(Class9173.field42110, 6.0);
   }

   public Class2293 method5209() {
      return Class2293.method9050(this.method5200(), this.method5202());
   }

   public boolean method5210() {
      return this.method5209() == Class2293.field15235;
   }

   public boolean method5211() {
      return this.method5209() == Class2293.field15236;
   }

   public boolean method5212() {
      return this.method5209() == Class2293.field15237;
   }

   public boolean method5213() {
      return this.method5209() == Class2293.field15239;
   }

   @Override
   public boolean method4307() {
      return this.method5209() == Class2293.field15240;
   }

   @Override
   public boolean method4295(PlayerEntity var1) {
      return false;
   }

   @Override
   public boolean method3114(Entity var1) {
      this.method2863(Class6067.field26879, 1.0F, 1.0F);
      if (!this.method4307()) {
         this.field6025 = true;
      }

      return super.method3114(var1);
   }

   @Override
   public void tick() {
      super.tick();
      if (this.method5211()) {
         if (this.field5024.method6794() && !this.method3250()) {
            this.method5190(true);
            this.method5194(false);
         } else if (!this.method5193()) {
            this.method5190(false);
         }
      }

      if (this.method4232() == null) {
         this.field6024 = false;
         this.field6025 = false;
      }

      if (this.method5186() > 0) {
         if (this.method4232() != null) {
            this.method4262(this.method4232(), 90.0F, 90.0F);
         }

         if (this.method5186() == 29 || this.method5186() == 14) {
            this.method2863(Class6067.field26875, 1.0F, 1.0F);
         }

         this.method5187(this.method5186() - 1);
      }

      if (this.method5188()) {
         this.method5199(this.method5198() + 1);
         if (this.method5198() <= 20) {
            if (this.method5198() == 1) {
               this.method2863(Class6067.field26869, 1.0F, 1.0F);
            }
         } else {
            this.method5197(false);
            this.method5224();
         }
      }

      if (!this.method5204()) {
         this.field6026 = 0;
      } else {
         this.method5223();
      }

      if (this.method5189()) {
         this.field5032 = 0.0F;
      }

      this.method5217();
      this.method5215();
      this.method5218();
      this.method5219();
   }

   public boolean method5214() {
      return this.method5211() && this.field5024.method6794();
   }

   private void method5215() {
      if (!this.method5193()
         && this.method5189()
         && !this.method5214()
         && !this.method2943(Class2106.field13731).method32105()
         && this.field5054.nextInt(80) == 1) {
         this.method5194(true);
      } else if (this.method2943(Class2106.field13731).method32105() || !this.method5189()) {
         this.method5194(false);
      }

      if (this.method5193()) {
         this.method5216();
         if (!this.field5024.field9020 && this.method5195() > 80 && this.field5054.nextInt(20) == 1) {
            if (this.method5195() > 100 && this.method5229(this.method2943(Class2106.field13731))) {
               if (!this.field5024.field9020) {
                  this.method2944(Class2106.field13731, ItemStack.EMPTY);
               }

               this.method5190(false);
            }

            this.method5194(false);
            return;
         }

         this.method5196(this.method5195() + 1);
      }
   }

   private void method5216() {
      if (this.method5195() % 5 == 0) {
         this.method2863(
            Class6067.field26873, 0.5F + 0.5F * (float)this.field5054.nextInt(2), (this.field5054.nextFloat() - this.field5054.nextFloat()) * 0.2F + 1.0F
         );

         for (int var3 = 0; var3 < 6; var3++) {
            Vector3d var4 = new Vector3d(
               ((double)this.field5054.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.field5054.nextFloat() - 0.5) * 0.1
            );
            var4 = var4.method11350(-this.field5032 * (float) (Math.PI / 180.0));
            var4 = var4.method11351(-this.field5031 * (float) (Math.PI / 180.0));
            double var5 = (double)(-this.field5054.nextFloat()) * 0.6 - 0.3;
            Vector3d var7 = new Vector3d(((double)this.field5054.nextFloat() - 0.5) * 0.8, var5, 1.0 + ((double)this.field5054.nextFloat() - 0.5) * 0.4);
            var7 = var7.method11351(-this.field4965 * (float) (Math.PI / 180.0));
            var7 = var7.method11339(this.getPosX(), this.method3442() + 1.0, this.getPosZ());
            this.field5024
               .method6746(
                  new Class7438(Class7940.field34082, this.method2943(Class2106.field13731)),
                  var7.field18048,
                  var7.field18049,
                  var7.field18050,
                  var4.field18048,
                  var4.field18049 + 0.05,
                  var4.field18050
               );
         }
      }
   }

   private void method5217() {
      this.field6029 = this.field6028;
      if (!this.method5189()) {
         this.field6028 = Math.max(0.0F, this.field6028 - 0.19F);
      } else {
         this.field6028 = Math.min(1.0F, this.field6028 + 0.15F);
      }
   }

   private void method5218() {
      this.field6031 = this.field6030;
      if (!this.method5191()) {
         this.field6030 = Math.max(0.0F, this.field6030 - 0.19F);
      } else {
         this.field6030 = Math.min(1.0F, this.field6030 + 0.15F);
      }
   }

   private void method5219() {
      this.field6033 = this.field6032;
      if (!this.method5204()) {
         this.field6032 = Math.max(0.0F, this.field6032 - 0.19F);
      } else {
         this.field6032 = Math.min(1.0F, this.field6032 + 0.15F);
      }
   }

   public float method5220(float var1) {
      return MathHelper.method37821(var1, this.field6029, this.field6028);
   }

   public float method5221(float var1) {
      return MathHelper.method37821(var1, this.field6031, this.field6030);
   }

   public float method5222(float var1) {
      return MathHelper.method37821(var1, this.field6033, this.field6032);
   }

   private void method5223() {
      this.field6026++;
      if (this.field6026 <= 32) {
         if (!this.field5024.field9020) {
            Vector3d var3 = this.method3433();
            if (this.field6026 != 1) {
               if ((float)this.field6026 != 7.0F && (float)this.field6026 != 15.0F && (float)this.field6026 != 23.0F) {
                  this.method3435(this.field6027.field18048, var3.field18049, this.field6027.field18050);
               } else {
                  this.method3435(0.0, !this.field5036 ? var3.field18049 : 0.27, 0.0);
               }
            } else {
               float var4 = this.field5031 * (float) (Math.PI / 180.0);
               float var5 = !this.method3005() ? 0.2F : 0.1F;
               this.field6027 = new Vector3d(
                  var3.field18048 + (double)(-MathHelper.method37763(var4) * var5), 0.0, var3.field18050 + (double)(MathHelper.method37764(var4) * var5)
               );
               this.method3434(this.field6027.method11339(0.0, 0.27, 0.0));
            }
         }
      } else {
         this.method5205(false);
      }
   }

   private void method5224() {
      Vector3d var3 = this.method3433();
      this.field5024
         .method6746(
            Class7940.field34093,
            this.getPosX() - (double)(this.method3429() + 1.0F) * 0.5 * (double) MathHelper.method37763(this.field4965 * (float) (Math.PI / 180.0)),
            this.method3442() - 0.1F,
            this.getPosZ() + (double)(this.method3429() + 1.0F) * 0.5 * (double) MathHelper.method37764(this.field4965 * (float) (Math.PI / 180.0)),
            var3.field18048,
            0.0,
            var3.field18050
         );
      this.method2863(Class6067.field26870, 1.0F, 1.0F);

      for (Class1097 var5 : this.field5024.<Class1097>method7182(Class1097.class, this.method3389().method19664(10.0))) {
         if (!var5.method3005() && var5.field5036 && !var5.method3250() && var5.method5230()) {
            var5.method2914();
         }
      }

      if (!this.field5024.method6714() && this.field5054.nextInt(700) == 0 && this.field5024.method6789().method17135(Class5462.field24227)) {
         this.method3300(Class8514.field37901);
      }
   }

   @Override
   public void method4246(Class1000 var1) {
      if (this.method2943(Class2106.field13731).method32105() && field6035.test(var1)) {
         this.method3134(var1);
         ItemStack var4 = var1.method4124();
         this.method2944(Class2106.field13731, var4);
         this.field5605[Class2106.field13731.method8773()] = 2.0F;
         this.method2751(var1, var4.method32179());
         var1.method2904();
      }
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      this.method5190(false);
      return super.method2741(var1, var2);
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, Class39 var5) {
      this.method5201(Class2293.method9048(this.field5054));
      this.method5203(Class2293.method9048(this.field5054));
      this.method5227();
      if (var4 == null) {
         var4 = new Class5097(0.2F);
      }

      return super.method4276(var1, var2, var3, (Class5093)var4, var5);
   }

   public void method5225(Class1097 var1, Class1097 var2) {
      if (var2 != null) {
         if (!this.field5054.nextBoolean()) {
            this.method5201(var2.method5226());
            this.method5203(var1.method5226());
         } else {
            this.method5201(var1.method5226());
            this.method5203(var2.method5226());
         }
      } else if (!this.field5054.nextBoolean()) {
         this.method5201(Class2293.method9048(this.field5054));
         this.method5203(var1.method5226());
      } else {
         this.method5201(var1.method5226());
         this.method5203(Class2293.method9048(this.field5054));
      }

      if (this.field5054.nextInt(32) == 0) {
         this.method5201(Class2293.method9048(this.field5054));
      }

      if (this.field5054.nextInt(32) == 0) {
         this.method5203(Class2293.method9048(this.field5054));
      }
   }

   private Class2293 method5226() {
      return !this.field5054.nextBoolean() ? this.method5202() : this.method5200();
   }

   public void method5227() {
      if (this.method5213()) {
         this.method3085(Class9173.field42105).method38661(10.0);
      }

      if (this.method5210()) {
         this.method3085(Class9173.field42108).method38661(0.07F);
      }
   }

   private void method5228() {
      if (!this.method3250()) {
         this.method4243(0.0F);
         this.method4230().method21666();
         this.method5190(true);
      }
   }

   @Override
   public Class2274 method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      if (!this.method5214()) {
         if (this.method5191()) {
            this.method5192(false);
            return Class2274.method9002(this.field5024.field9020);
         } else if (!this.method4381(var5)) {
            return Class2274.field14820;
         } else {
            if (this.method4232() != null) {
               this.field6024 = true;
            }

            if (!this.method3005()) {
               if (!this.field5024.field9020 && this.method4767() == 0 && this.method4502()) {
                  this.method4501(var1, var5);
                  this.method4503(var1);
               } else {
                  if (this.field5024.field9020 || this.method5189() || this.method3250()) {
                     return Class2274.field14820;
                  }

                  this.method5228();
                  this.method5194(true);
                  ItemStack var6 = this.method2943(Class2106.field13731);
                  if (!var6.method32105() && !var1.field4919.field29609) {
                     this.method3302(var6);
                  }

                  this.method2944(Class2106.field13731, new ItemStack(var5.method32107(), 1));
                  this.method4501(var1, var5);
               }
            } else {
               this.method4501(var1, var5);
               this.method4768((int)((float)(-this.method4767() / 20) * 0.1F), true);
            }

            return Class2274.field14818;
         }
      } else {
         return Class2274.field14820;
      }
   }

   @Nullable
   @Override
   public Class9455 method4241() {
      if (!this.method4307()) {
         return !this.method5211() ? Class6067.field26871 : Class6067.field26877;
      } else {
         return Class6067.field26876;
      }
   }

   @Override
   public void method3241(BlockPos var1, Class7380 var2) {
      this.method2863(Class6067.field26874, 0.15F, 1.0F);
   }

   @Override
   public boolean method4381(ItemStack var1) {
      return var1.method32107() == Blocks.field37009.method11581();
   }

   private boolean method5229(ItemStack var1) {
      return this.method4381(var1) || var1.method32107() == Blocks.field36591.method11581();
   }

   @Nullable
   @Override
   public Class9455 method2880() {
      return Class6067.field26872;
   }

   @Nullable
   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field26878;
   }

   public boolean method5230() {
      return !this.method5191() && !this.method5214() && !this.method5193() && !this.method5204() && !this.method5189();
   }

   // $VF: synthetic method
   public static Random method5232(Class1097 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static Random method5233(Class1097 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static Random method5234(Class1097 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static Random method5235(Class1097 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static Random method5236(Class1097 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static Class8522 method5237() {
      return field6023;
   }

   // $VF: synthetic method
   public static Class2616 method5238(Class1097 var0) {
      return var0.field6034;
   }

   // $VF: synthetic method
   public static boolean method5239(Class1097 var0) {
      return var0.field6024;
   }

   // $VF: synthetic method
   public static boolean method5240(Class1097 var0) {
      return var0.field6025;
   }

   // $VF: synthetic method
   public static Random method5241(Class1097 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static Random method5242(Class1097 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static Predicate method5243() {
      return field6035;
   }

   // $VF: synthetic method
   public static Random method5244(Class1097 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static Random method5245(Class1097 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static void method5246(Class1097 var0) {
      var0.method5228();
   }

   // $VF: synthetic method
   public static Random method5247(Class1097 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static Random method5248(Class1097 var0) {
      return var0.field5054;
   }
}
