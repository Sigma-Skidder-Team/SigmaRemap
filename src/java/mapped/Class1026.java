package mapped;

import javax.annotation.Nullable;
import java.util.Random;
import java.util.function.Predicate;

public abstract class Class1026 extends Class1028 {
   public static final Class9289<Boolean> field5712 = Class9361.<Boolean>method35441(Class1026.class, Class7784.field33398);
   private static final Predicate<ItemEntity> field5713 = var0 -> !var0.method4135()
         && var0.method3066()
         && ItemStack.method32128(var0.method4124(), Class7699.method25421());
   public Class7699 field5714;
   private int field5715;
   private boolean field5716;
   private int field5717;

   public Class1026(Class8992<? extends Class1026> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method4219() {
      super.method4219();
      this.field5600.method20002(1, new Class2671<Class1026>(this, this));
      this.field5600.method20002(3, new Class2730<Class1026>(this));
      this.field5600.method20002(4, new Class2610(this, 1.05F, 1));
      this.field5600.method20002(5, new Class2728(this, this));
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field5712, false);
   }

   public abstract void method4545(int var1, boolean var2);

   public boolean method4547() {
      return this.field5716;
   }

   public void method4548(boolean var1) {
      this.field5716 = var1;
   }

   @Override
   public void method2871() {
      if (this.field5024 instanceof ServerWorld && this.method3066()) {
         Class7699 var3 = this.method4551();
         if (this.method4547()) {
            if (var3 != null) {
               Class880 var4 = this.method4232();
               if (var4 != null && (var4.method3204() == Class8992.field41111 || var4.method3204() == Class8992.field41041)) {
                  this.field4973 = 0;
               }
            } else if (this.field5024.method6783() % 20L == 0L) {
               Class7699 var5 = ((ServerWorld)this.field5024).method6957(this.method3432());
               if (var5 != null && Class7531.method24612(this, var5)) {
                  var5.method25414(var5.method25396(), this, (BlockPos)null, true);
               }
            }
         }
      }

      super.method2871();
   }

   @Override
   public void method4338() {
      this.field4973 += 2;
   }

   @Override
   public void method2737(Class8654 var1) {
      if (this.field5024 instanceof ServerWorld) {
         Entity var4 = var1.method31109();
         Class7699 var5 = this.method4551();
         if (var5 != null) {
            if (this.method4577()) {
               var5.method25427(this.method4554());
            }

            if (var4 != null && var4.method3204() == Class8992.field41111) {
               var5.method25437(var4);
            }

            var5.method25419(this, false);
         }

         if (this.method4577() && var5 == null && ((ServerWorld)this.field5024).method6957(this.method3432()) == null) {
            ItemStack var6 = this.method2943(Class2106.field13736);
            PlayerEntity var7 = null;
            if (!(var4 instanceof PlayerEntity)) {
               if (var4 instanceof Class1012) {
                  Class1012 var8 = (Class1012)var4;
                  Class880 var9 = var8.method4400();
                  if (var8.method4393() && var9 instanceof PlayerEntity) {
                     var7 = (PlayerEntity)var9;
                  }
               }
            } else {
               var7 = (PlayerEntity)var4;
            }

            if (!var6.method32105() && ItemStack.method32128(var6, Class7699.method25421()) && var7 != null) {
               Class2023 var11 = var7.method3034(Class8254.field35497);
               int var12 = 1;
               if (var11 == null) {
                  var12--;
               } else {
                  var12 += var11.method8629();
                  var7.method3039(Class8254.field35497);
               }

               var12 = MathHelper.method37775(var12, 0, 4);
               Class2023 var10 = new Class2023(Class8254.field35497, 120000, var12, false, false, true);
               if (!this.field5024.method6789().method17135(Class5462.field24246)) {
                  var7.method3035(var10);
               }
            }
         }
      }

      super.method2737(var1);
   }

   @Override
   public boolean method4549() {
      return !this.method4552();
   }

   public void method4550(Class7699 var1) {
      this.field5714 = var1;
   }

   @Nullable
   public Class7699 method4551() {
      return this.field5714;
   }

   public boolean method4552() {
      return this.method4551() != null && this.method4551().method25433();
   }

   public void method4553(int var1) {
      this.field5715 = var1;
   }

   public int method4554() {
      return this.field5715;
   }

   public boolean method4555() {
      return this.field5063.<Boolean>method35445(field5712);
   }

   public void method4556(boolean var1) {
      this.field5063.method35446(field5712, var1);
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      var1.method102("Wave", this.field5715);
      var1.method115("CanJoinRaid", this.field5716);
      if (this.field5714 != null) {
         var1.method102("RaidId", this.field5714.method25430());
      }
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      this.field5715 = var1.method122("Wave");
      this.field5716 = var1.method132("CanJoinRaid");
      if (var1.method119("RaidId", 3)) {
         if (this.field5024 instanceof ServerWorld) {
            this.field5714 = ((ServerWorld)this.field5024).method6956().method24610(var1.method122("RaidId"));
         }

         if (this.field5714 != null) {
            this.field5714.method25425(this.field5715, this, false);
            if (this.method4577()) {
               this.field5714.method25426(this.field5715, this);
            }
         }
      }
   }

   @Override
   public void method4246(ItemEntity var1) {
      ItemStack var4 = var1.method4124();
      boolean var5 = this.method4552() && this.method4551().method25422(this.method4554()) != null;
      if (this.method4552() && !var5 && ItemStack.method32128(var4, Class7699.method25421())) {
         Class2106 var6 = Class2106.field13736;
         ItemStack var7 = this.method2943(var6);
         double var8 = (double)this.method4269(var6);
         if (!var7.method32105() && (double)Math.max(this.field5054.nextFloat() - 0.1F, 0.0F) < var8) {
            this.method3302(var7);
         }

         this.method3134(var1);
         this.method2944(var6, var4);
         this.method2751(var1, var4.method32179());
         var1.method2904();
         this.method4551().method25426(this.method4554(), this);
         this.method4576(true);
      } else {
         super.method4246(var1);
      }
   }

   @Override
   public boolean method4254(double var1) {
      return this.method4551() != null ? false : super.method4254(var1);
   }

   @Override
   public boolean method4255() {
      return super.method4255() || this.method4551() != null;
   }

   public int method4557() {
      return this.field5717;
   }

   public void method4558(int var1) {
      this.field5717 = var1;
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      if (this.method4552()) {
         this.method4551().method25415();
      }

      return super.method2741(var1, var2);
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, Class39 var5) {
      this.method4548(this.method3204() != Class8992.field41101 || var3 != Class2202.field14391);
      return super.method4276(var1, var2, var3, var4, var5);
   }

   public abstract Class9455 method4546();

   // $VF: synthetic method
   public static Random method4560(Class1026 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static float method4561(Class1026 var0) {
      return var0.method3099();
   }

   // $VF: synthetic method
   public static float method4562(Class1026 var0) {
      return var0.method3100();
   }

   // $VF: synthetic method
   public static Random method4563(Class1026 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static Random method4564(Class1026 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static Random method4565(Class1026 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static Predicate method4566() {
      return field5713;
   }
}
