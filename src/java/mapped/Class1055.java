package mapped;

import java.util.Random;

public class Class1055 extends Class1047 {
   private static String[] field5824;
   public float field5825;
   public float field5826;
   public float field5827;
   public float field5828;
   public float field5829;
   public float field5830;
   public float field5831;
   public float field5832;
   private float field5833;
   private float field5834;
   private float field5835;
   private float field5836;
   private float field5837;
   private float field5838;

   public Class1055(Class8992<? extends Class1055> var1, Class1655 var2) {
      super(var1, var2);
      this.field5054.setSeed((long)this.method3205());
      this.field5834 = 1.0F / (this.field5054.nextFloat() + 1.0F) * 0.2F;
   }

   @Override
   public void method4219() {
      this.field5600.method20002(0, new Class2679(this, this));
      this.field5600.method20002(1, new Class2726(this));
   }

   public static Class7037 method4836() {
      return Class1006.method4220().method21849(Class9173.field42105, 10.0);
   }

   @Override
   public float method2957(Class2090 var1, Class8847 var2) {
      return var2.field39969 * 0.5F;
   }

   @Override
   public Class9455 method4241() {
      return Class6067.field27125;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field27127;
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field27126;
   }

   @Override
   public float method3099() {
      return 0.4F;
   }

   @Override
   public boolean method2940() {
      return false;
   }

   @Override
   public void method2871() {
      super.method2871();
      this.field5826 = this.field5825;
      this.field5828 = this.field5827;
      this.field5830 = this.field5829;
      this.field5832 = this.field5831;
      this.field5829 = this.field5829 + this.field5834;
      if ((double)this.field5829 > Math.PI * 2) {
         if (!this.field5024.field9020) {
            this.field5829 = (float)((double)this.field5829 - (Math.PI * 2));
            if (this.field5054.nextInt(10) == 0) {
               this.field5834 = 1.0F / (this.field5054.nextFloat() + 1.0F) * 0.2F;
            }

            this.field5024.method6786(this, (byte)19);
         } else {
            this.field5829 = (float) (Math.PI * 2);
         }
      }

      if (!this.method3255()) {
         this.field5831 = Class9679.method37771(Class9679.method37763(this.field5829)) * (float) Math.PI * 0.25F;
         if (!this.field5024.field9020) {
            double var5 = this.method3433().field18049;
            if (!this.method3033(Class8254.field35491)) {
               if (!this.method3247()) {
                  var5 -= 0.08;
               }
            } else {
               var5 = 0.05 * (double)(this.method3034(Class8254.field35491).method8629() + 1);
            }

            this.method3435(0.0, var5 * 0.98F, 0.0);
         }

         this.field5825 = (float)((double)this.field5825 + (double)(-90.0F - this.field5825) * 0.02);
      } else {
         if (!(this.field5829 < (float) Math.PI)) {
            this.field5831 = 0.0F;
            this.field5833 *= 0.9F;
            this.field5835 *= 0.99F;
         } else {
            float var3 = this.field5829 / (float) Math.PI;
            this.field5831 = Class9679.method37763(var3 * var3 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if (!((double)var3 > 0.75)) {
               this.field5835 *= 0.8F;
            } else {
               this.field5833 = 1.0F;
               this.field5835 = 1.0F;
            }
         }

         if (!this.field5024.field9020) {
            this.method3435((double)(this.field5836 * this.field5833), (double)(this.field5837 * this.field5833), (double)(this.field5838 * this.field5833));
         }

         Vector3d var7 = this.method3433();
         float var4 = Class9679.method37766(method3234(var7));
         this.field4965 = this.field4965
            + (-((float)Class9679.method37814(var7.field18048, var7.field18050)) * (180.0F / (float)Math.PI) - this.field4965) * 0.1F;
         this.field5031 = this.field4965;
         this.field5827 = (float)((double)this.field5827 + Math.PI * (double)this.field5835 * 1.5);
         this.field5825 = this.field5825 + (-((float)Class9679.method37814((double)var4, var7.field18049)) * (180.0F / (float)Math.PI) - this.field5825) * 0.1F;
      }
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      if (super.method2741(var1, var2) && this.method3014() != null) {
         this.method4838();
         return true;
      } else {
         return false;
      }
   }

   private Vector3d method4837(Vector3d var1) {
      Vector3d var4 = var1.method11350(this.field5826 * (float) (Math.PI / 180.0));
      return var4.method11351(-this.field4966 * (float) (Math.PI / 180.0));
   }

   private void method4838() {
      this.method2863(Class6067.field27128, this.method3099(), this.method3100());
      Vector3d var3 = this.method4837(new Vector3d(0.0, -1.0, 0.0)).method11339(this.getPosX(), this.getPosY(), this.getPosZ());

      for (int var4 = 0; var4 < 30; var4++) {
         Vector3d var5 = this.method4837(new Vector3d((double)this.field5054.nextFloat() * 0.6 - 0.3, -1.0, (double)this.field5054.nextFloat() * 0.6 - 0.3));
         Vector3d var6 = var5.method11344(0.3 + (double)(this.field5054.nextFloat() * 2.0F));
         ((Class1657)this.field5024)
            .method6939(
               Class7940.field34095, var3.field18048, var3.field18049 + 0.5, var3.field18050, 0, var6.field18048, var6.field18049, var6.field18050, 0.1F
            );
      }
   }

   @Override
   public void method2915(Vector3d var1) {
      this.move(Class2107.field13742, this.method3433());
   }

   public static boolean method4839(Class8992<Class1055> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      return var3.getY() > 45 && var3.getY() < var1.method6776();
   }

   @Override
   public void method2866(byte var1) {
      if (var1 != 19) {
         super.method2866(var1);
      } else {
         this.field5829 = 0.0F;
      }
   }

   public void method4840(float var1, float var2, float var3) {
      this.field5836 = var1;
      this.field5837 = var2;
      this.field5838 = var3;
   }

   public boolean method4841() {
      return this.field5836 != 0.0F || this.field5837 != 0.0F || this.field5838 != 0.0F;
   }

   // $VF: synthetic method
   public static boolean method4842(Class1055 var0) {
      return var0.field5057;
   }
}
