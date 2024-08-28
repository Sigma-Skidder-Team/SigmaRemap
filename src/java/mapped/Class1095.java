package mapped;

import com.google.common.collect.Lists;

import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Predicate;

public class Class1095 extends Class1018 {
   private static final Class9289<Integer> field5993 = Class9361.<Integer>method35441(Class1095.class, Class7784.field33391);
   private static final Class9289<Byte> field5994 = Class9361.<Byte>method35441(Class1095.class, Class7784.field33390);
   private static final Class9289<Optional<UUID>> field5995 = Class9361.<Optional<UUID>>method35441(Class1095.class, Class7784.field33404);
   private static final Class9289<Optional<UUID>> field5996 = Class9361.<Optional<UUID>>method35441(Class1095.class, Class7784.field33404);
   private static final Predicate<Class1000> field5997 = var0 -> !var0.method4135() && var0.method3066();
   private static final Predicate<Entity> field5998 = var0 -> {
      if (!(var0 instanceof Class880)) {
         return false;
      } else {
         Class880 var3 = (Class880)var0;
         return var3.method3018() != null && var3.method3019() < var3.field5055 + 600;
      }
   };
   private static final Predicate<Entity> field5999 = var0 -> var0 instanceof Class1089 || var0 instanceof Class1094;
   private static final Predicate<Entity> field6000 = var0 -> !var0.method3334() && Class8088.field34761.test(var0);
   private Class2595 field6001;
   private Class2595 field6002;
   private Class2595 field6003;
   private float field6004;
   private float field6005;
   private float field6006;
   private float field6007;
   private int field6008;

   public Class1095(Class8992<? extends Class1095> var1, Class1655 var2) {
      super(var1, var2);
      this.field5595 = new Class8091(this);
      this.field5596 = new Class6833(this);
      this.method4224(Class2163.field14199, 0.0F);
      this.method4224(Class2163.field14200, 0.0F);
      this.method4281(true);
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field5995, Optional.<UUID>empty());
      this.field5063.method35442(field5996, Optional.<UUID>empty());
      this.field5063.method35442(field5993, 0);
      this.field5063.method35442(field5994, (byte)0);
   }

   @Override
   public void method4219() {
      this.field6001 = new Class2709<Class1018>(this, Class1018.class, 10, false, false, var0 -> var0 instanceof Class1089 || var0 instanceof Class1094);
      this.field6002 = new Class2709<Class1088>(this, Class1088.class, 10, false, false, Class1088.field5963);
      this.field6003 = new Class2709<Class1049>(this, Class1049.class, 20, false, false, var0 -> var0 instanceof Class1050);
      this.field5600.method20002(0, new Class2604(this));
      this.field5600.method20002(1, new Class2698(this));
      this.field5600.method20002(2, new Class2750(this, 2.2));
      this.field5600.method20002(3, new Class2786(this, 1.0));
      this.field5600
         .method20002(
            4,
            new Class2770<PlayerEntity>(
               this, PlayerEntity.class, 16.0F, 1.6, 1.4, var1 -> field6000.test(var1) && !this.method5151(var1.method3375()) && !this.method5133()
            )
         );
      this.field5600
         .method20002(4, new Class2770<Class1012>(this, Class1012.class, 8.0F, 1.6, 1.4, var1 -> !((Class1012)var1).method4393() && !this.method5133()));
      this.field5600.method20002(4, new Class2770<Class1096>(this, Class1096.class, 8.0F, 1.6, 1.4, var1 -> !this.method5133()));
      this.field5600.method20002(5, new Class2729(this));
      this.field5600.method20002(6, new Class2755(this));
      this.field5600.method20002(6, new Class2641(this, 1.25));
      this.field5600.method20002(7, new Class2650(this, 1.2F, true));
      this.field5600.method20002(7, new Class2693(this));
      this.field5600.method20002(8, new Class2765(this, this, 1.25));
      this.field5600.method20002(9, new Class2609(this, 32, 200));
      this.field5600.method20002(10, new Class2636(this, 1.2F, 12, 2));
      this.field5600.method20002(10, new Class2745(this, 0.4F));
      this.field5600.method20002(11, new Class2737(this, 1.0));
      this.field5600.method20002(11, new Class2790(this));
      this.field5600.method20002(12, new Class2614(this, PlayerEntity.class, 24.0F));
      this.field5600.method20002(13, new Class2694(this));
      this.field5601
         .method20002(3, new Class2714(Class880.class, false, false, var1 -> field5998.test(var1) && !this.method5151(var1.method3375())));
   }

   @Override
   public Class9455 method3060(Class8848 var1) {
      return Class6067.field26592;
   }

   @Override
   public void method2871() {
      if (!this.field5024.field9020 && this.method3066() && this.method3138()) {
         this.field6008++;
         Class8848 var3 = this.method2943(Class2106.field13731);
         if (this.method5122(var3)) {
            if (this.field6008 <= 600) {
               if (this.field6008 > 560 && this.field5054.nextFloat() < 0.1F) {
                  this.method2863(this.method3060(var3), 1.0F, 1.0F);
                  this.field5024.method6786(this, (byte)45);
               }
            } else {
               Class8848 var4 = var3.method32111(this.field5024, this);
               if (!var4.method32105()) {
                  this.method2944(Class2106.field13731, var4);
               }

               this.field6008 = 0;
            }
         }

         Class880 var5 = this.method4232();
         if (var5 == null || !var5.method3066()) {
            this.method5143(false);
            this.method5144(false);
         }
      }

      if (this.method3176() || this.method2896()) {
         this.field4981 = false;
         this.field4982 = 0.0F;
         this.field4984 = 0.0F;
      }

      super.method2871();
      if (this.method5133() && this.field5054.nextFloat() < 0.05F) {
         this.method2863(Class6067.field26588, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean method2896() {
      return this.method3044();
   }

   private boolean method5122(Class8848 var1) {
      return var1.method32107().method11744() && this.method4232() == null && this.field5036 && !this.method3176();
   }

   @Override
   public void method4270(Class9755 var1) {
      if (this.field5054.nextFloat() < 0.2F) {
         float var4 = this.field5054.nextFloat();
         Class8848 var5;
         if (!(var4 < 0.05F)) {
            if (!(var4 < 0.2F)) {
               if (!(var4 < 0.4F)) {
                  if (!(var4 < 0.6F)) {
                     if (!(var4 < 0.8F)) {
                        var5 = new Class8848(Class8514.field37839);
                     } else {
                        var5 = new Class8848(Class8514.field37890);
                     }
                  } else {
                     var5 = new Class8848(Class8514.field37842);
                  }
               } else {
                  var5 = !this.field5054.nextBoolean() ? new Class8848(Class8514.field38081) : new Class8848(Class8514.field38080);
               }
            } else {
               var5 = new Class8848(Class8514.field37904);
            }
         } else {
            var5 = new Class8848(Class8514.field38049);
         }

         this.method2944(Class2106.field13731, var5);
      }
   }

   @Override
   public void method2866(byte var1) {
      if (var1 != 45) {
         super.method2866(var1);
      } else {
         Class8848 var4 = this.method2943(Class2106.field13731);
         if (!var4.method32105()) {
            for (int var5 = 0; var5 < 8; var5++) {
               Vector3d var6 = new Vector3d(((double)this.field5054.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .method11350(-this.field5032 * (float) (Math.PI / 180.0))
                  .method11351(-this.field5031 * (float) (Math.PI / 180.0));
               this.field5024
                  .method6746(
                     new Class7438(Class7940.field34082, var4),
                     this.getPosX() + this.method3320().field18048 / 2.0,
                     this.getPosY(),
                     this.getPosZ() + this.method3320().field18050 / 2.0,
                     var6.field18048,
                     var6.field18049 + 0.05,
                     var6.field18050
                  );
            }
         }
      }
   }

   public static Class7037 method5123() {
      return Class1006.method4220()
         .method21849(Class9173.field42108, 0.3F)
         .method21849(Class9173.field42105, 10.0)
         .method21849(Class9173.field42106, 32.0)
         .method21849(Class9173.field42110, 2.0);
   }

   public Class1095 method4389(Class1657 var1, Class1045 var2) {
      Class1095 var5 = Class8992.field41033.method33215(var1);
      var5.method5126(!this.field5054.nextBoolean() ? ((Class1095)var2).method5125() : this.method5125());
      return var5;
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, Class39 var5) {
      Optional var8 = var1.method7178(this.method3432());
      Class186 var9 = Class186.method571(var8);
      boolean var10 = false;
      if (!(var4 instanceof Class5100)) {
         var4 = new Class5100(var9);
      } else {
         var9 = ((Class5100)var4).field23197;
         if (((Class5100)var4).method15580() >= 2) {
            var10 = true;
         }
      }

      this.method5126(var9);
      if (var10) {
         this.method4770(-24000);
      }

      if (var1 instanceof Class1657) {
         this.method5124();
      }

      this.method4270(var2);
      return super.method4276(var1, var2, var3, (Class5093)var4, var5);
   }

   private void method5124() {
      if (this.method5125() != Class186.field691) {
         this.field5601.method20002(4, this.field6003);
         this.field5601.method20002(6, this.field6001);
         this.field5601.method20002(6, this.field6002);
      } else {
         this.field5601.method20002(4, this.field6001);
         this.field5601.method20002(4, this.field6002);
         this.field5601.method20002(6, this.field6003);
      }
   }

   @Override
   public void method4501(PlayerEntity var1, Class8848 var2) {
      if (this.method4381(var2)) {
         this.method2863(this.method3060(var2), 1.0F, 1.0F);
      }

      super.method4501(var1, var2);
   }

   @Override
   public float method2957(Class2090 var1, Class8847 var2) {
      return !this.method3005() ? 0.4F : var2.field39969 * 0.85F;
   }

   public Class186 method5125() {
      return Class186.method570(this.field5063.<Integer>method35445(field5993));
   }

   private void method5126(Class186 var1) {
      this.field5063.method35446(field5993, var1.method568());
   }

   private List<UUID> method5127() {
      ArrayList var3 = Lists.newArrayList();
      var3.add(this.field5063.<Optional<UUID>>method35445(field5995).orElse((UUID)null));
      var3.add(this.field5063.<Optional<UUID>>method35445(field5996).orElse((UUID)null));
      return var3;
   }

   private void method5128(UUID var1) {
      if (!this.field5063.<Optional<UUID>>method35445(field5995).isPresent()) {
         this.field5063.method35446(field5995, Optional.<UUID>ofNullable(var1));
      } else {
         this.field5063.method35446(field5996, Optional.<UUID>ofNullable(var1));
      }
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      List<UUID> var4 = this.method5127();
      Class41 var5 = new Class41();

      for (UUID var7 : var4) {
         if (var7 != null) {
            var5.add(Class8354.method29281(var7));
         }
      }

      var1.method99("Trusted", var5);
      var1.method115("Sleeping", this.method3176());
      var1.method109("Type", this.method5125().method567());
      var1.method115("Sitting", this.method5129());
      var1.method115("Crouching", this.method3336());
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      Class41 var4 = var1.method131("Trusted", 11);

      for (int var5 = 0; var5 < var4.size(); var5++) {
         this.method5128(Class8354.method29282(var4.get(var5)));
      }

      this.method5135(var1.method132("Sleeping"));
      this.method5126(Class186.method569(var1.method126("Type")));
      this.method5130(var1.method132("Sitting"));
      this.method5143(var1.method132("Crouching"));
      if (this.field5024 instanceof Class1657) {
         this.method5124();
      }
   }

   public boolean method5129() {
      return this.method5137(1);
   }

   public void method5130(boolean var1) {
      this.method5136(1, var1);
   }

   public boolean method5131() {
      return this.method5137(64);
   }

   private void method5132(boolean var1) {
      this.method5136(64, var1);
   }

   private boolean method5133() {
      return this.method5137(128);
   }

   private void method5134(boolean var1) {
      this.method5136(128, var1);
   }

   @Override
   public boolean method3176() {
      return this.method5137(32);
   }

   private void method5135(boolean var1) {
      this.method5136(32, var1);
   }

   private void method5136(int var1, boolean var2) {
      if (!var2) {
         this.field5063.method35446(field5994, (byte)(this.field5063.<Byte>method35445(field5994) & ~var1));
      } else {
         this.field5063.method35446(field5994, (byte)(this.field5063.<Byte>method35445(field5994) | var1));
      }
   }

   private boolean method5137(int var1) {
      return (this.field5063.<Byte>method35445(field5994) & var1) != 0;
   }

   @Override
   public boolean method2980(Class8848 var1) {
      Class2106 var4 = Class1006.method4271(var1);
      return !this.method2943(var4).method32105() ? false : var4 == Class2106.field13731 && super.method2980(var1);
   }

   @Override
   public boolean method4252(Class8848 var1) {
      Class3257 var4 = var1.method32107();
      Class8848 var5 = this.method2943(Class2106.field13731);
      return var5.method32105() || this.field6008 > 0 && var4.method11744() && !var5.method32107().method11744();
   }

   private void method5138(Class8848 var1) {
      if (!var1.method32105() && !this.field5024.field9020) {
         Class1000 var4 = new Class1000(
            this.field5024, this.getPosX() + this.method3320().field18048, this.getPosY() + 1.0, this.getPosZ() + this.method3320().field18050, var1
         );
         var4.method4134(40);
         var4.method4129(this.method3375());
         this.method2863(Class6067.field26597, 1.0F, 1.0F);
         this.field5024.method6916(var4);
      }
   }

   private void method5139(Class8848 var1) {
      Class1000 var4 = new Class1000(this.field5024, this.getPosX(), this.getPosY(), this.getPosZ(), var1);
      this.field5024.method6916(var4);
   }

   @Override
   public void method4246(Class1000 var1) {
      Class8848 var4 = var1.method4124();
      if (this.method4252(var4)) {
         int var5 = var4.method32179();
         if (var5 > 1) {
            this.method5139(var4.method32106(var5 - 1));
         }

         this.method5138(this.method2943(Class2106.field13731));
         this.method3134(var1);
         this.method2944(Class2106.field13731, var4.method32106(1));
         this.field5605[Class2106.field13731.method8773()] = 2.0F;
         this.method2751(var1, var4.method32179());
         var1.method2904();
         this.field6008 = 0;
      }
   }

   @Override
   public void tick() {
      super.tick();
      if (this.method3138()) {
         boolean var3 = this.method3250();
         if (var3 || this.method4232() != null || this.field5024.method6794()) {
            this.method5148();
         }

         if (var3 || this.method3176()) {
            this.method5130(false);
         }

         if (this.method5131() && this.field5024.field9016.nextFloat() < 0.2F) {
            BlockPos var4 = this.method3432();
            Class7380 var5 = this.field5024.method6738(var4);
            this.field5024.method6999(2001, var4, Class3209.method11535(var5));
         }
      }

      this.field6005 = this.field6004;
      if (!this.method5145()) {
         this.field6004 = this.field6004 + (0.0F - this.field6004) * 0.4F;
      } else {
         this.field6004 = this.field6004 + (1.0F - this.field6004) * 0.4F;
      }

      this.field6007 = this.field6006;
      if (!this.method3336()) {
         this.field6006 = 0.0F;
      } else {
         this.field6006 += 0.2F;
         if (this.field6006 > 3.0F) {
            this.field6006 = 3.0F;
         }
      }
   }

   @Override
   public boolean method4381(Class8848 var1) {
      return var1.method32107() == Class8514.field38170;
   }

   @Override
   public void method4284(PlayerEntity var1, Class1006 var2) {
      ((Class1095)var2).method5128(var1.method3375());
   }

   public boolean method5140() {
      return this.method5137(16);
   }

   public void method5141(boolean var1) {
      this.method5136(16, var1);
   }

   public boolean method5142() {
      return this.field6006 == 3.0F;
   }

   public void method5143(boolean var1) {
      this.method5136(4, var1);
   }

   @Override
   public boolean method3336() {
      return this.method5137(4);
   }

   public void method5144(boolean var1) {
      this.method5136(8, var1);
   }

   public boolean method5145() {
      return this.method5137(8);
   }

   public float method5146(float var1) {
      return Class9679.method37821(var1, this.field6005, this.field6004) * 0.11F * (float) Math.PI;
   }

   public float method5147(float var1) {
      return Class9679.method37821(var1, this.field6007, this.field6006);
   }

   @Override
   public void method4233(Class880 var1) {
      if (this.method5133() && var1 == null) {
         this.method5134(false);
      }

      super.method4233(var1);
   }

   @Override
   public int method3067(float var1, float var2) {
      return Class9679.method37773((var1 - 5.0F) * var2);
   }

   private void method5148() {
      this.method5135(false);
   }

   private void method5149() {
      this.method5144(false);
      this.method5143(false);
      this.method5130(false);
      this.method5135(false);
      this.method5134(false);
      this.method5132(false);
   }

   private boolean method5150() {
      return !this.method3176() && !this.method5129() && !this.method5131();
   }

   @Override
   public void method4237() {
      Class9455 var3 = this.method4241();
      if (var3 != Class6067.field26594) {
         super.method4237();
      } else {
         this.method2863(var3, 2.0F, this.method3100());
      }
   }

   @Nullable
   @Override
   public Class9455 method4241() {
      if (!this.method3176()) {
         if (!this.field5024.method6740() && this.field5054.nextFloat() < 0.1F) {
            List var3 = this.field5024.<Entity>method6772(PlayerEntity.class, this.method3389().method19663(16.0, 16.0, 16.0), Class8088.field34763);
            if (var3.isEmpty()) {
               return Class6067.field26594;
            }
         }

         return Class6067.field26589;
      } else {
         return Class6067.field26595;
      }
   }

   @Nullable
   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field26593;
   }

   @Nullable
   @Override
   public Class9455 method2880() {
      return Class6067.field26591;
   }

   private boolean method5151(UUID var1) {
      return this.method5127().contains(var1);
   }

   @Override
   public void method3052(Class8654 var1) {
      Class8848 var4 = this.method2943(Class2106.field13731);
      if (!var4.method32105()) {
         this.method3302(var4);
         this.method2944(Class2106.field13731, Class8848.field39973);
      }

      super.method3052(var1);
   }

   public static boolean method5152(Class1095 var0, Class880 var1) {
      double var4 = var1.getPosZ() - var0.getPosZ();
      double var6 = var1.getPosX() - var0.getPosX();
      double var8 = var4 / var6;

      for (int var11 = 0; var11 < 6; var11++) {
         double var12 = var8 != 0.0 ? var4 * (double)((float)var11 / 6.0F) : 0.0;
         double var14 = var8 != 0.0 ? var12 / var8 : var6 * (double)((float)var11 / 6.0F);

         for (int var16 = 1; var16 < 4; var16++) {
            if (!var0.field5024
               .method6738(new BlockPos(var0.getPosX() + var14, var0.getPosY() + (double)var16, var0.getPosZ() + var12))
               .method23384()
               .method31089()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public Vector3d method3394() {
      return new Vector3d(0.0, (double)(0.55F * this.method3393()), (double)(this.method3429() * 0.4F));
   }

   // $VF: synthetic method
   public static boolean method5163(Class1095 var0, UUID var1) {
      return var0.method5151(var1);
   }

   // $VF: synthetic method
   public static Random method5164(Class1095 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static boolean method5165(Class1095 var0) {
      return var0.method5150();
   }

   // $VF: synthetic method
   public static Predicate method5166() {
      return field5997;
   }

   // $VF: synthetic method
   public static void method5167(Class1095 var0) {
      var0.method5149();
   }

   // $VF: synthetic method
   public static boolean method5168(Class1095 var0) {
      return var0.method5133();
   }

   // $VF: synthetic method
   public static Predicate method5169() {
      return field5999;
   }

   // $VF: synthetic method
   public static void method5170(Class1095 var0, boolean var1) {
      var0.method5132(var1);
   }

   // $VF: synthetic method
   public static void method5171(Class1095 var0, UUID var1) {
      var0.method5128(var1);
   }

   // $VF: synthetic method
   public static float method5172(Class1095 var0, float var1) {
      return var0.field6006 = var1;
   }

   // $VF: synthetic method
   public static float method5173(Class1095 var0, float var1) {
      return var0.field6007 = var1;
   }

   // $VF: synthetic method
   public static List<UUID> method5174(Class1095 var0) {
      return var0.method5127();
   }

   // $VF: synthetic method
   public static void method5175(Class1095 var0, boolean var1) {
      var0.method5134(var1);
   }

   // $VF: synthetic method
   public static void method5176(Class1095 var0) {
      var0.method5148();
   }

   // $VF: synthetic method
   public static Random method5177(Class1095 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static Random method5178(Class1095 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static void method5179(Class1095 var0, boolean var1) {
      var0.method5135(var1);
   }

   public class Class2614 extends Class2612 {

      public Class2614(Class1006 var1, Class<? extends Class880> var2, float var3) {
         super(var1, var2, var3);
      }

      @Override
      public boolean method10803() {
         return super.method10803() && !Class1095.this.method5131() && !Class1095.this.method5145();
      }

      @Override
      public boolean method10806() {
         return super.method10806() && !Class1095.this.method5131() && !Class1095.this.method5145();
      }
   }

   public class Class2714 extends Class2709<Class880> {
      private Class880 field17201;
      private Class880 field17202;
      private int field17203;

      public Class2714(Class<Class880> var1, boolean var2, boolean var3, Predicate<Class880> var4) {
         super(Class1095.this, var1, 10, var2, var3, var4);
      }

      @Override
      public boolean method10803() {
         if (this.field17189 > 0 && this.field17153.method3013().nextInt(this.field17189) != 0) {
            return false;
         } else {
            for (UUID var4 : method5174(Class1095.this)) {
               if (var4 != null && Class1095.this.field5024 instanceof Class1657) {
                  Entity var5 = ((Class1657)Class1095.this.field5024).method6942(var4);
                  if (var5 instanceof Class880) {
                     Class880 var6 = (Class880)var5;
                     this.field17202 = var6;
                     this.field17201 = var6.method3014();
                     int var7 = var6.method3015();
                     return var7 != this.field17203 && this.method10915(this.field17201, this.field17191);
                  }
               }
            }

            return false;
         }
      }

      @Override
      public void method10804() {
         this.method10923(this.field17201);
         this.field17190 = this.field17201;
         if (this.field17202 != null) {
            this.field17203 = this.field17202.method3015();
         }

         Class1095.this.method2863(Class6067.field26588, 1.0F, 1.0F);
         method5175(Class1095.this, true);
         method5176(Class1095.this);
         super.method10804();
      }
   }
}
