package mapped;

import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

public class Class1027 extends Class1026 implements Class1022 {
   private static final UUID field5718 = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final Class9689 field5719 = new Class9689(field5718, "Drinking speed penalty", -0.25, Class2045.field13352);
   private static final Class9289<Boolean> field5720 = Class9361.<Boolean>method35441(Class1027.class, Class7784.field33398);
   private int field5721;
   private Class2712<Class1026> field5722;
   private Class2711<PlayerEntity> field5723;

   public Class1027(Class8992<? extends Class1027> var1, Class1655 var2) {
      super(var1, var2);
   }

   @Override
   public void method4219() {
      super.method4219();
      this.field5722 = new Class2712<Class1026>(
         this, Class1026.class, true, var1 -> var1 != null && this.method4552() && var1.method3204() != Class8992.field41101
      );
      this.field5723 = new Class2711<PlayerEntity>(this, PlayerEntity.class, 10, true, false, (Predicate<Class880>)null);
      this.field5600.method20002(1, new Class2603(this));
      this.field5600.method20002(2, new Class2598(this, 1.0, 60, 10.0F));
      this.field5600.method20002(2, new Class2737(this, 1.0));
      this.field5600.method20002(3, new Class2612(this, PlayerEntity.class, 8.0F));
      this.field5600.method20002(3, new Class2668(this));
      this.field5601.method20002(1, new Class2704(this, Class1026.class));
      this.field5601.method20002(2, this.field5722);
      this.field5601.method20002(3, this.field5723);
   }

   @Override
   public void method2850() {
      super.method2850();
      this.method3210().method35442(field5720, false);
   }

   @Override
   public Class9455 method4241() {
      return Class6067.field27233;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field27237;
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field27235;
   }

   public void method4567(boolean var1) {
      this.method3210().method35446(field5720, var1);
   }

   public boolean method4568() {
      return this.method3210().<Boolean>method35445(field5720);
   }

   public static Class7037 method4569() {
      return Class1009.method4343().method21849(Class9173.field42105, 26.0).method21849(Class9173.field42108, 0.25);
   }

   @Override
   public void method2871() {
      if (!this.field5024.field9020 && this.method3066()) {
         this.field5722.method10927();
         if (this.field5722.method10926() > 0) {
            this.field5723.method10925(false);
         } else {
            this.field5723.method10925(true);
         }

         if (!this.method4568()) {
            Class8812 var7 = null;
            if (this.field5054.nextFloat() < 0.15F && this.method3263(Class8953.field40469) && !this.method3033(Class8254.field35479)) {
               var7 = Class8137.field34999;
            } else if (this.field5054.nextFloat() < 0.15F
               && (this.method3327() || this.method3047() != null && this.method3047().method31141())
               && !this.method3033(Class8254.field35478)) {
               var7 = Class8137.field34988;
            } else if (this.field5054.nextFloat() < 0.05F && this.method3042() < this.method3075()) {
               var7 = Class8137.field35001;
            } else if (this.field5054.nextFloat() < 0.5F
               && this.method4232() != null
               && !this.method3033(Class8254.field35467)
               && this.method4232().getDistanceSq(this) > 121.0) {
               var7 = Class8137.field34990;
            }

            if (var7 != null) {
               this.method2944(Class2106.field13731, Class9741.method38187(new ItemStack(Class8514.field37971), var7));
               this.field5721 = this.method3090().method32137();
               this.method4567(true);
               if (!this.method3245()) {
                  this.field5024
                     .method6743(
                        (PlayerEntity)null,
                        this.getPosX(),
                        this.getPosY(),
                        this.getPosZ(),
                        Class6067.field27236,
                        this.method2864(),
                        1.0F,
                        0.8F + this.field5054.nextFloat() * 0.4F
                     );
               }

               Class9805 var8 = this.method3085(Class9173.field42108);
               var8.method38670(field5719);
               var8.method38667(field5719);
            }
         } else if (this.field5721-- <= 0) {
            this.method4567(false);
            ItemStack var3 = this.method3090();
            this.method2944(Class2106.field13731, ItemStack.EMPTY);
            if (var3.method32107() == Class8514.field37971) {
               List<Class2023> var4 = Class9741.method38176(var3);
               if (var4 != null) {
                  for (Class2023 var6 : var4) {
                     this.method3035(new Class2023(var6));
                  }
               }
            }

            this.method3085(Class9173.field42108).method38670(field5719);
         }

         if (this.field5054.nextFloat() < 7.5E-4F) {
            this.field5024.method6786(this, (byte)15);
         }
      }

      super.method2871();
   }

   @Override
   public Class9455 method4546() {
      return Class6067.field27234;
   }

   @Override
   public void method2866(byte var1) {
      if (var1 != 15) {
         super.method2866(var1);
      } else {
         for (int var4 = 0; var4 < this.field5054.nextInt(35) + 10; var4++) {
            this.field5024
               .method6746(
                  Class7940.field34100,
                  this.getPosX() + this.field5054.nextGaussian() * 0.13F,
                  this.method3389().field28453 + 0.5 + this.field5054.nextGaussian() * 0.13F,
                  this.getPosZ() + this.field5054.nextGaussian() * 0.13F,
                  0.0,
                  0.0,
                  0.0
               );
         }
      }
   }

   @Override
   public float method3072(Class8654 var1, float var2) {
      var2 = super.method3072(var1, var2);
      if (var1.method31109() == this) {
         var2 = 0.0F;
      }

      if (var1.method31144()) {
         var2 = (float)((double)var2 * 0.15);
      }

      return var2;
   }

   @Override
   public void method4530(Class880 var1, float var2) {
      if (!this.method4568()) {
         Vector3d var5 = var1.method3433();
         double var6 = var1.getPosX() + var5.field18048 - this.getPosX();
         double var8 = var1.method3442() - 1.1F - this.getPosY();
         double var10 = var1.getPosZ() + var5.field18050 - this.getPosZ();
         float var12 = MathHelper.method37766(var6 * var6 + var10 * var10);
         Class8812 var13 = Class8137.field35003;
         if (!(var1 instanceof Class1026)) {
            if (var12 >= 8.0F && !var1.method3033(Class8254.field35468)) {
               var13 = Class8137.field34993;
            } else if (var1.method3042() >= 8.0F && !var1.method3033(Class8254.field35485)) {
               var13 = Class8137.field35005;
            } else if (var12 <= 3.0F && !var1.method3033(Class8254.field35484) && this.field5054.nextFloat() < 0.25F) {
               var13 = Class8137.field35014;
            }
         } else {
            if (!(var1.method3042() <= 4.0F)) {
               var13 = Class8137.field35008;
            } else {
               var13 = Class8137.field35001;
            }

            this.method4233((Class880)null);
         }

         Class896 var14 = new Class896(this.field5024, this);
         var14.method3511(Class9741.method38187(new ItemStack(Class8514.field38115), var13));
         var14.field5032 -= -20.0F;
         var14.method3462(var6, var8 + (double)(var12 * 0.2F), var10, 0.75F, 8.0F);
         if (!this.method3245()) {
            this.field5024
               .method6743(
                  (PlayerEntity)null,
                  this.getPosX(),
                  this.getPosY(),
                  this.getPosZ(),
                  Class6067.field27238,
                  this.method2864(),
                  1.0F,
                  0.8F + this.field5054.nextFloat() * 0.4F
               );
         }

         this.field5024.method6916(var14);
      }
   }

   @Override
   public float method2957(Class2090 var1, Class8847 var2) {
      return 1.62F;
   }

   @Override
   public void method4545(int var1, boolean var2) {
   }

   @Override
   public boolean method4570() {
      return false;
   }
}
