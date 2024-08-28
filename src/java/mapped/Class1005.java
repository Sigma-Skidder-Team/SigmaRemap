package mapped;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Predicate;

public class Class1005 extends Class880 {
   private static final Class7087 field5565 = new Class7087(0.0F, 0.0F, 0.0F);
   private static final Class7087 field5566 = new Class7087(0.0F, 0.0F, 0.0F);
   private static final Class7087 field5567 = new Class7087(-10.0F, 0.0F, -10.0F);
   private static final Class7087 field5568 = new Class7087(-15.0F, 0.0F, 10.0F);
   private static final Class7087 field5569 = new Class7087(-1.0F, 0.0F, -1.0F);
   private static final Class7087 field5570 = new Class7087(1.0F, 0.0F, 1.0F);
   private static final Class8847 field5571 = new Class8847(0.0F, 0.0F, true);
   private static final Class8847 field5572 = Class8992.field41006.method33221().method32099(0.5F);
   public static final Class9289<Byte> field5573 = Class9361.<Byte>method35441(Class1005.class, Class7784.field33390);
   public static final Class9289<Class7087> field5574 = Class9361.<Class7087>method35441(Class1005.class, Class7784.field33400);
   public static final Class9289<Class7087> field5575 = Class9361.<Class7087>method35441(Class1005.class, Class7784.field33400);
   public static final Class9289<Class7087> field5576 = Class9361.<Class7087>method35441(Class1005.class, Class7784.field33400);
   public static final Class9289<Class7087> field5577 = Class9361.<Class7087>method35441(Class1005.class, Class7784.field33400);
   public static final Class9289<Class7087> field5578 = Class9361.<Class7087>method35441(Class1005.class, Class7784.field33400);
   public static final Class9289<Class7087> field5579 = Class9361.<Class7087>method35441(Class1005.class, Class7784.field33400);
   private static final Predicate<Entity> field5580 = var0 -> var0 instanceof Class916 && ((Class916)var0).method3602() == Class2177.field14287;
   private final Class25<Class8848> field5581 = Class25.<Class8848>method68(2, Class8848.field39973);
   private final Class25<Class8848> field5582 = Class25.<Class8848>method68(4, Class8848.field39973);
   private boolean field5583;
   public long field5584;
   private int field5585;
   private Class7087 field5586 = field5565;
   private Class7087 field5587 = field5566;
   private Class7087 field5588 = field5567;
   private Class7087 field5589 = field5568;
   private Class7087 field5590 = field5569;
   private Class7087 field5591 = field5570;

   public Class1005(Class8992<? extends Class1005> var1, Class1655 var2) {
      super(var1, var2);
      this.field5051 = 0.0F;
   }

   public Class1005(Class1655 var1, double var2, double var4, double var6) {
      this(Class8992.field41006, var1);
      this.method3215(var2, var4, var6);
   }

   @Override
   public void method3385() {
      double var3 = this.getPosX();
      double var5 = this.getPosY();
      double var7 = this.getPosZ();
      super.method3385();
      this.method3215(var3, var5, var7);
   }

   private boolean method4185() {
      return !this.method4203() && !this.method3247();
   }

   @Override
   public boolean method3138() {
      return super.method3138() && this.method4185();
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field5573, (byte)0);
      this.field5063.method35442(field5574, field5565);
      this.field5063.method35442(field5575, field5566);
      this.field5063.method35442(field5576, field5567);
      this.field5063.method35442(field5577, field5568);
      this.field5063.method35442(field5578, field5569);
      this.field5063.method35442(field5579, field5570);
   }

   @Override
   public Iterable<Class8848> method2946() {
      return this.field5581;
   }

   @Override
   public Iterable<Class8848> method2947() {
      return this.field5582;
   }

   @Override
   public Class8848 method2943(Class2106 var1) {
      switch (Class7259.field31147[var1.method8772().ordinal()]) {
         case 1:
            return this.field5581.get(var1.method8773());
         case 2:
            return this.field5582.get(var1.method8773());
         default:
            return Class8848.field39973;
      }
   }

   @Override
   public void method2944(Class2106 var1, Class8848 var2) {
      switch (Class7259.field31147[var1.method8772().ordinal()]) {
         case 1:
            this.method3023(var2);
            this.field5581.set(var1.method8773(), var2);
            break;
         case 2:
            this.method3023(var2);
            this.field5582.set(var1.method8773(), var2);
      }
   }

   @Override
   public boolean method2963(int var1, Class8848 var2) {
      Class2106 var5;
      if (var1 != 98) {
         if (var1 != 99) {
            if (var1 != 100 + Class2106.field13736.method8773()) {
               if (var1 != 100 + Class2106.field13735.method8773()) {
                  if (var1 != 100 + Class2106.field13734.method8773()) {
                     if (var1 != 100 + Class2106.field13733.method8773()) {
                        return false;
                     }

                     var5 = Class2106.field13733;
                  } else {
                     var5 = Class2106.field13734;
                  }
               } else {
                  var5 = Class2106.field13735;
               }
            } else {
               var5 = Class2106.field13736;
            }
         } else {
            var5 = Class2106.field13732;
         }
      } else {
         var5 = Class2106.field13731;
      }

      if (!var2.method32105() && !Class1006.method4301(var5, var2) && var5 != Class2106.field13736) {
         return false;
      } else {
         this.method2944(var5, var2);
         return true;
      }
   }

   @Override
   public boolean method2980(Class8848 var1) {
      Class2106 var4 = Class1006.method4271(var1);
      return this.method2943(var4).method32105() && !this.method4189(var4);
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      Class41 var4 = new Class41();

      for (Class8848 var6 : this.field5582) {
         Class39 var7 = new Class39();
         if (!var6.method32105()) {
            var6.method32112(var7);
         }

         var4.add(var7);
      }

      var1.method99("ArmorItems", var4);
      Class41 var9 = new Class41();

      for (Class8848 var11 : this.field5581) {
         Class39 var8 = new Class39();
         if (!var11.method32105()) {
            var11.method32112(var8);
         }

         var9.add(var8);
      }

      var1.method99("HandItems", var9);
      var1.method115("Invisible", this.method3342());
      var1.method115("Small", this.method4197());
      var1.method115("ShowArms", this.method4199());
      var1.method102("DisabledSlots", this.field5585);
      var1.method115("NoBasePlate", this.method4201());
      if (this.method4203()) {
         var1.method115("Marker", this.method4203());
      }

      var1.method99("Pose", this.method4187());
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      if (var1.method119("ArmorItems", 9)) {
         Class41 var4 = var1.method131("ArmorItems", 10);

         for (int var5 = 0; var5 < this.field5582.size(); var5++) {
            this.field5582.set(var5, Class8848.method32104(var4.method153(var5)));
         }
      }

      if (var1.method119("HandItems", 9)) {
         Class41 var6 = var1.method131("HandItems", 10);

         for (int var8 = 0; var8 < this.field5581.size(); var8++) {
            this.field5581.set(var8, Class8848.method32104(var6.method153(var8)));
         }
      }

      this.method3347(var1.method132("Invisible"));
      this.method4196(var1.method132("Small"));
      this.method4198(var1.method132("ShowArms"));
      this.field5585 = var1.method122("DisabledSlots");
      this.method4200(var1.method132("NoBasePlate"));
      this.method4202(var1.method132("Marker"));
      this.field5052 = !this.method4185();
      Class39 var7 = var1.method130("Pose");
      this.method4186(var7);
   }

   private void method4186(Class39 var1) {
      Class41 var4 = var1.method131("Head", 5);
      this.method4205(!var4.isEmpty() ? new Class7087(var4) : field5565);
      Class41 var5 = var1.method131("Body", 5);
      this.method4206(!var5.isEmpty() ? new Class7087(var5) : field5566);
      Class41 var6 = var1.method131("LeftArm", 5);
      this.method4207(!var6.isEmpty() ? new Class7087(var6) : field5567);
      Class41 var7 = var1.method131("RightArm", 5);
      this.method4208(!var7.isEmpty() ? new Class7087(var7) : field5568);
      Class41 var8 = var1.method131("LeftLeg", 5);
      this.method4209(!var8.isEmpty() ? new Class7087(var8) : field5569);
      Class41 var9 = var1.method131("RightLeg", 5);
      this.method4210(!var9.isEmpty() ? new Class7087(var9) : field5570);
   }

   private Class39 method4187() {
      Class39 var3 = new Class39();
      if (!field5565.equals(this.field5586)) {
         var3.method99("Head", this.field5586.method22012());
      }

      if (!field5566.equals(this.field5587)) {
         var3.method99("Body", this.field5587.method22012());
      }

      if (!field5567.equals(this.field5588)) {
         var3.method99("LeftArm", this.field5588.method22012());
      }

      if (!field5568.equals(this.field5589)) {
         var3.method99("RightArm", this.field5589.method22012());
      }

      if (!field5569.equals(this.field5590)) {
         var3.method99("LeftLeg", this.field5590.method22012());
      }

      if (!field5570.equals(this.field5591)) {
         var3.method99("RightLeg", this.field5591.method22012());
      }

      return var3;
   }

   @Override
   public boolean method3140() {
      return false;
   }

   @Override
   public void method3128(Entity var1) {
   }

   @Override
   public void method3126() {
      List var3 = this.field5024.method6770(this, this.method3389(), field5580);

      for (int var4 = 0; var4 < var3.size(); var4++) {
         Entity var5 = (Entity)var3.get(var4);
         if (this.method3277(var5) <= 0.2) {
            var5.method3101(this);
         }
      }
   }

   @Override
   public Class2274 method3397(PlayerEntity var1, Vector3d var2, Class79 var3) {
      Class8848 var6 = var1.method3094(var3);
      if (this.method4203() || var6.method32107() == Class8514.field38088) {
         return Class2274.field14820;
      } else if (var1.method2800()) {
         return Class2274.field14818;
      } else if (!var1.field5024.field9020) {
         Class2106 var7 = Class1006.method4271(var6);
         if (!var6.method32105()) {
            if (this.method4189(var7)) {
               return Class2274.field14821;
            }

            if (var7.method8772() == Class1969.field12836 && !this.method4199()) {
               return Class2274.field14821;
            }

            if (this.method4190(var1, var7, var6, var3)) {
               return Class2274.field14818;
            }
         } else {
            Class2106 var8 = this.method4188(var2);
            Class2106 var9 = !this.method4189(var8) ? var8 : var7;
            if (this.method3096(var9) && this.method4190(var1, var9, var6, var3)) {
               return Class2274.field14818;
            }
         }

         return Class2274.field14820;
      } else {
         return Class2274.field14819;
      }
   }

   private Class2106 method4188(Vector3d var1) {
      Class2106 var4 = Class2106.field13731;
      boolean var5 = this.method4197();
      double var6 = !var5 ? var1.field18049 : var1.field18049 * 2.0;
      Class2106 var8 = Class2106.field13733;
      if (var6 >= 0.1 && var6 < 0.1 + (!var5 ? 0.45 : 0.8) && this.method3096(var8)) {
         var4 = Class2106.field13733;
      } else if (var6 >= 0.9 + (!var5 ? 0.0 : 0.3) && var6 < 0.9 + (!var5 ? 0.7 : 1.0) && this.method3096(Class2106.field13735)) {
         var4 = Class2106.field13735;
      } else if (var6 >= 0.4 && var6 < 0.4 + (!var5 ? 0.8 : 1.0) && this.method3096(Class2106.field13734)) {
         var4 = Class2106.field13734;
      } else if (var6 >= 1.6 && this.method3096(Class2106.field13736)) {
         var4 = Class2106.field13736;
      } else if (!this.method3096(Class2106.field13731) && this.method3096(Class2106.field13732)) {
         var4 = Class2106.field13732;
      }

      return var4;
   }

   private boolean method4189(Class2106 var1) {
      return (this.field5585 & 1 << var1.method8774()) != 0 || var1.method8772() == Class1969.field12836 && !this.method4199();
   }

   private boolean method4190(PlayerEntity var1, Class2106 var2, Class8848 var3, Class79 var4) {
      Class8848 var7 = this.method2943(var2);
      if (!var7.method32105() && (this.field5585 & 1 << var2.method8774() + 8) != 0) {
         return false;
      } else if (var7.method32105() && (this.field5585 & 1 << var2.method8774() + 16) != 0) {
         return false;
      } else if (var1.field4919.field29609 && var7.method32105() && !var3.method32105()) {
         Class8848 var9 = var3.method32126();
         var9.method32180(1);
         this.method2944(var2, var9);
         return true;
      } else if (var3.method32105() || var3.method32179() <= 1) {
         this.method2944(var2, var3);
         var1.method3095(var4, var7);
         return true;
      } else if (var7.method32105()) {
         Class8848 var8 = var3.method32126();
         var8.method32180(1);
         this.method2944(var2, var8);
         var3.method32182(1);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      if (this.field5024.field9020 || this.field5041) {
         return false;
      } else if (Class8654.field39004.equals(var1)) {
         this.method2904();
         return false;
      } else if (this.method2760(var1) || this.field5583 || this.method4203()) {
         return false;
      } else if (var1.method31131()) {
         this.method4194(var1);
         this.method2904();
         return false;
      } else if (!Class8654.field38992.equals(var1)) {
         if (Class8654.field38994.equals(var1) && this.method3042() > 0.5F) {
            this.method4192(var1, 4.0F);
            return false;
         } else {
            boolean var5 = var1.method31113() instanceof Class884;
            boolean var6 = var5 && ((Class884)var1.method31113()).method3489() > 0;
            boolean var7 = "player".equals(var1.method31142());
            if (!var7 && !var5) {
               return false;
            } else if (var1.method31109() instanceof PlayerEntity && !((PlayerEntity)var1.method31109()).field4919.field29610) {
               return false;
            } else if (var1.method31146()) {
               this.method4195();
               this.method4191();
               this.method2904();
               return var6;
            } else {
               long var8 = this.field5024.method6783();
               if (var8 - this.field5584 > 5L && !var5) {
                  this.field5024.method6786(this, (byte)32);
                  this.field5584 = var8;
               } else {
                  this.method4193(var1);
                  this.method4191();
                  this.method2904();
               }

               return true;
            }
         }
      } else {
         if (!this.method3327()) {
            this.method3221(5);
         } else {
            this.method4192(var1, 0.15F);
         }

         return false;
      }
   }

   @Override
   public void method2866(byte var1) {
      if (var1 != 32) {
         super.method2866(var1);
      } else if (this.field5024.field9020) {
         this.field5024.method6745(this.getPosX(), this.getPosY(), this.getPosZ(), Class6067.field26359, this.method2864(), 0.3F, 1.0F, false);
         this.field5584 = this.field5024.method6783();
      }
   }

   @Override
   public boolean method3291(double var1) {
      double var5 = this.method3389().method19675() * 4.0;
      if (Double.isNaN(var5) || var5 == 0.0) {
         var5 = 4.0;
      }

      var5 *= 64.0;
      return var1 < var5 * var5;
   }

   private void method4191() {
      if (this.field5024 instanceof Class1657) {
         ((Class1657)this.field5024)
            .method6939(
               new Class7439(Class7940.field34051, Class8487.field36400.method11579()),
               this.getPosX(),
               this.method3440(0.6666666666666666),
               this.getPosZ(),
               10,
               (double)(this.method3429() / 4.0F),
               (double)(this.method3430() / 4.0F),
               (double)(this.method3429() / 4.0F),
               0.05
            );
      }
   }

   private void method4192(Class8654 var1, float var2) {
      float var5 = this.method3042();
      var5 -= var2;
      if (!(var5 <= 0.5F)) {
         this.method3043(var5);
      } else {
         this.method4194(var1);
         this.method2904();
      }
   }

   private void method4193(Class8654 var1) {
      Class3209.method11557(this.field5024, this.method3432(), new Class8848(Class8514.field38082));
      this.method4194(var1);
   }

   private void method4194(Class8654 var1) {
      this.method4195();
      this.method3052(var1);

      for (int var4 = 0; var4 < this.field5581.size(); var4++) {
         Class8848 var5 = this.field5581.get(var4);
         if (!var5.method32105()) {
            Class3209.method11557(this.field5024, this.method3432().method8311(), var5);
            this.field5581.set(var4, Class8848.field39973);
         }
      }

      for (int var6 = 0; var6 < this.field5582.size(); var6++) {
         Class8848 var7 = this.field5582.get(var6);
         if (!var7.method32105()) {
            Class3209.method11557(this.field5024, this.method3432().method8311(), var7);
            this.field5582.set(var6, Class8848.field39973);
         }
      }
   }

   private void method4195() {
      this.field5024.method6743((PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), Class6067.field26357, this.method2864(), 1.0F, 1.0F);
   }

   @Override
   public float method3123(float var1, float var2) {
      this.field4966 = this.field5033;
      this.field4965 = this.field5031;
      return 0.0F;
   }

   @Override
   public float method2957(Class2090 var1, Class8847 var2) {
      return var2.field39969 * (!this.method3005() ? 0.9F : 0.5F);
   }

   @Override
   public double method2894() {
      return !this.method4203() ? 0.1F : 0.0;
   }

   @Override
   public void method2915(Vector3d var1) {
      if (this.method4185()) {
         super.method2915(var1);
      }
   }

   @Override
   public void method3144(float var1) {
      this.field4966 = this.field5033 = var1;
      this.field4968 = this.field4967 = var1;
   }

   @Override
   public void method3143(float var1) {
      this.field4966 = this.field5033 = var1;
      this.field4968 = this.field4967 = var1;
   }

   @Override
   public void tick() {
      super.tick();
      Class7087 var3 = this.field5063.<Class7087>method35445(field5574);
      if (!this.field5586.equals(var3)) {
         this.method4205(var3);
      }

      Class7087 var4 = this.field5063.<Class7087>method35445(field5575);
      if (!this.field5587.equals(var4)) {
         this.method4206(var4);
      }

      Class7087 var5 = this.field5063.<Class7087>method35445(field5576);
      if (!this.field5588.equals(var5)) {
         this.method4207(var5);
      }

      Class7087 var6 = this.field5063.<Class7087>method35445(field5577);
      if (!this.field5589.equals(var6)) {
         this.method4208(var6);
      }

      Class7087 var7 = this.field5063.<Class7087>method35445(field5578);
      if (!this.field5590.equals(var7)) {
         this.method4209(var7);
      }

      Class7087 var8 = this.field5063.<Class7087>method35445(field5579);
      if (!this.field5591.equals(var8)) {
         this.method4210(var8);
      }
   }

   @Override
   public void method2813() {
      this.method3347(this.field5583);
   }

   @Override
   public void method3347(boolean var1) {
      this.field5583 = var1;
      super.method3347(var1);
   }

   @Override
   public boolean method3005() {
      return this.method4197();
   }

   @Override
   public void method2995() {
      this.method2904();
   }

   @Override
   public boolean method3398() {
      return this.method3342();
   }

   @Override
   public Class2315 method3422() {
      return !this.method4203() ? super.method3422() : Class2315.field15865;
   }

   private void method4196(boolean var1) {
      this.field5063.method35446(field5573, this.method4204(this.field5063.<Byte>method35445(field5573), 1, var1));
   }

   public boolean method4197() {
      return (this.field5063.<Byte>method35445(field5573) & 1) != 0;
   }

   private void method4198(boolean var1) {
      this.field5063.method35446(field5573, this.method4204(this.field5063.<Byte>method35445(field5573), 4, var1));
   }

   public boolean method4199() {
      return (this.field5063.<Byte>method35445(field5573) & 4) != 0;
   }

   private void method4200(boolean var1) {
      this.field5063.method35446(field5573, this.method4204(this.field5063.<Byte>method35445(field5573), 8, var1));
   }

   public boolean method4201() {
      return (this.field5063.<Byte>method35445(field5573) & 8) != 0;
   }

   private void method4202(boolean var1) {
      this.field5063.method35446(field5573, this.method4204(this.field5063.<Byte>method35445(field5573), 16, var1));
   }

   public boolean method4203() {
      return (this.field5063.<Byte>method35445(field5573) & 16) != 0;
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
      this.field5063.method35446(field5574, var1);
   }

   public void method4206(Class7087 var1) {
      this.field5587 = var1;
      this.field5063.method35446(field5575, var1);
   }

   public void method4207(Class7087 var1) {
      this.field5588 = var1;
      this.field5063.method35446(field5576, var1);
   }

   public void method4208(Class7087 var1) {
      this.field5589 = var1;
      this.field5063.method35446(field5577, var1);
   }

   public void method4209(Class7087 var1) {
      this.field5590 = var1;
      this.field5063.method35446(field5578, var1);
   }

   public void method4210(Class7087 var1) {
      this.field5591 = var1;
      this.field5063.method35446(field5579, var1);
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
   public boolean method3139() {
      return super.method3139() && !this.method4203();
   }

   @Override
   public boolean method3361(Entity var1) {
      return var1 instanceof PlayerEntity && !this.field5024.method6785((PlayerEntity)var1, this.method3432());
   }

   @Override
   public Class2205 method2967() {
      return Class2205.field14418;
   }

   @Override
   public Class9455 method2926(int var1) {
      return Class6067.field26358;
   }

   @Nullable
   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field26359;
   }

   @Nullable
   @Override
   public Class9455 method2880() {
      return Class6067.field26357;
   }

   @Override
   public void method3353(Class1657 var1, Class906 var2) {
   }

   @Override
   public boolean method3169() {
      return false;
   }

   @Override
   public void method3155(Class9289<?> var1) {
      if (field5573.equals(var1)) {
         this.method3385();
         this.field5019 = !this.method4203();
      }

      super.method3155(var1);
   }

   @Override
   public boolean method3170() {
      return false;
   }

   @Override
   public Class8847 method2981(Class2090 var1) {
      return this.method4217(this.method4203());
   }

   private Class8847 method4217(boolean var1) {
      if (!var1) {
         return !this.method3005() ? this.method3204().method33221() : field5572;
      } else {
         return field5571;
      }
   }

   @Override
   public Vector3d method3287(float var1) {
      if (!this.method4203()) {
         return super.method3287(var1);
      } else {
         Class6488 var4 = this.method4217(false).method32097(this.method3431());
         BlockPos var5 = this.method3432();
         int var6 = Integer.MIN_VALUE;

         for (BlockPos var8 : BlockPos.method8359(
            new BlockPos(var4.field28449, var4.field28450, var4.field28451), new BlockPos(var4.field28452, var4.field28453, var4.field28454)
         )) {
            int var9 = Math.max(this.field5024.method7020(Class1977.field12882, var8), this.field5024.method7020(Class1977.field12881, var8));
            if (var9 == 15) {
               return Vector3d.method11328(var8);
            }

            if (var9 > var6) {
               var6 = var9;
               var5 = var8.method8353();
            }
         }

         return Vector3d.method11328(var5);
      }
   }
}
