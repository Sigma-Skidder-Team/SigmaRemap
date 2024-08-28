package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class941 extends Class939 implements Class942, Class935 {
   private Class25<ItemStack> field5312 = Class25.<ItemStack>method68(27, ItemStack.field39973);
   public float field5313;
   public float field5314;
   public int field5315;
   private int field5316;

   public Class941(Class4387<?> var1) {
      super(var1);
   }

   public Class941() {
      this(Class4387.field21422);
   }

   @Override
   public int method3629() {
      return 27;
   }

   @Override
   public ITextComponent method3686() {
      return new TranslationTextComponent("container.chest");
   }

   @Override
   public void method3645(Class7380 var1, Class39 var2) {
      super.method3645(var1, var2);
      this.field5312 = Class25.<ItemStack>method68(this.method3629(), ItemStack.field39973);
      if (!this.method3741(var2)) {
         Class7920.method26567(var2, this.field5312);
      }
   }

   @Override
   public Class39 method3646(Class39 var1) {
      super.method3646(var1);
      if (!this.method3742(var1)) {
         Class7920.method26565(var1, this.field5312);
      }

      return var1;
   }

   @Override
   public void method3647() {
      int var3 = this.field5325.method8304();
      int var4 = this.field5325.getY();
      int var5 = this.field5325.method8306();
      this.field5316++;
      this.field5315 = method3758(this.field5324, this, this.field5316, var3, var4, var5, this.field5315);
      this.field5314 = this.field5313;
      float var6 = 0.1F;
      if (this.field5315 > 0 && this.field5313 == 0.0F) {
         this.method3760(Class6067.field26449);
      }

      if (this.field5315 == 0 && this.field5313 > 0.0F || this.field5315 > 0 && this.field5313 < 1.0F) {
         float var7 = this.field5313;
         if (this.field5315 <= 0) {
            this.field5313 -= 0.1F;
         } else {
            this.field5313 += 0.1F;
         }

         if (this.field5313 > 1.0F) {
            this.field5313 = 1.0F;
         }

         float var8 = 0.5F;
         if (this.field5313 < 0.5F && var7 >= 0.5F) {
            this.method3760(Class6067.field26447);
         }

         if (this.field5313 < 0.0F) {
            this.field5313 = 0.0F;
         }
      }
   }

   public static int method3758(Class1655 var0, Class932 var1, int var2, int var3, int var4, int var5, int var6) {
      if (!var0.field9020 && var6 != 0 && (var2 + var3 + var4 + var5) % 200 == 0) {
         var6 = method3759(var0, var1, var3, var4, var5);
      }

      return var6;
   }

   public static int method3759(Class1655 var0, Class932 var1, int var2, int var3, int var4) {
      int var7 = 0;
      float var8 = 5.0F;

      for (PlayerEntity var10 : var0.<PlayerEntity>method7182(
         PlayerEntity.class,
         new Class6488(
            (double)((float)var2 - 5.0F),
            (double)((float)var3 - 5.0F),
            (double)((float)var4 - 5.0F),
            (double)((float)(var2 + 1) + 5.0F),
            (double)((float)(var3 + 1) + 5.0F),
            (double)((float)(var4 + 1) + 5.0F)
         )
      )) {
         if (var10.field4905 instanceof Class5813) {
            Class920 var11 = ((Class5813)var10.field4905).method18164();
            if (var11 == var1 || var11 instanceof Class990 && ((Class990)var11).method4070(var1)) {
               var7++;
            }
         }
      }

      return var7;
   }

   private void method3760(Class9455 var1) {
      Class111 var4 = this.method3775().<Class111>method23463(Class3348.field18866);
      if (var4 != Class111.field380) {
         double var5 = (double)this.field5325.method8304() + 0.5;
         double var7 = (double)this.field5325.getY() + 0.5;
         double var9 = (double)this.field5325.method8306() + 0.5;
         if (var4 == Class111.field381) {
            Direction var11 = Class3348.method11908(this.method3775());
            var5 += (double)var11.method539() * 0.5;
            var9 += (double)var11.method541() * 0.5;
         }

         this.field5324.method6743((PlayerEntity)null, var5, var7, var9, var1, Class2266.field14732, 0.5F, this.field5324.field9016.nextFloat() * 0.1F + 0.9F);
      }
   }

   @Override
   public boolean method3751(int var1, int var2) {
      if (var1 != 1) {
         return super.method3751(var1, var2);
      } else {
         this.field5315 = var2;
         return true;
      }
   }

   @Override
   public void method3631(PlayerEntity var1) {
      if (!var1.method2800()) {
         if (this.field5315 < 0) {
            this.field5315 = 0;
         }

         this.field5315++;
         this.method3761();
      }
   }

   @Override
   public void method3632(PlayerEntity var1) {
      if (!var1.method2800()) {
         this.field5315--;
         this.method3761();
      }
   }

   public void method3761() {
      Block var3 = this.method3775().method23383();
      if (var3 instanceof Class3348) {
         this.field5324.method6787(this.field5325, var3, 1, this.field5315);
         this.field5324.method6733(this.field5325, var3);
      }
   }

   @Override
   public Class25<ItemStack> method3724() {
      return this.field5312;
   }

   @Override
   public void method3725(Class25<ItemStack> var1) {
      this.field5312 = var1;
   }

   @Override
   public float method3762(float var1) {
      return MathHelper.method37821(var1, this.field5314, this.field5313);
   }

   public static int method3763(Class1665 var0, BlockPos var1) {
      Class7380 var4 = var0.method6738(var1);
      if (var4.method23383().method11998()) {
         Class944 var5 = var0.method6759(var1);
         if (var5 instanceof Class941) {
            return ((Class941)var5).field5315;
         }
      }

      return 0;
   }

   public static void method3764(Class941 var0, Class941 var1) {
      Class25 var4 = var0.method3724();
      var0.method3725(var1.method3724());
      var1.method3725(var4);
   }

   @Override
   public Class5812 method3690(int var1, Class974 var2) {
      return Class5813.method18162(var1, var2, this);
   }
}
