package mapped;

import java.util.Random;

public class Class2594 extends Class2595 {
   private static String[] field16811;
   private final Class1088 field16812;
   private final double field16813;
   private boolean field16814;

   public Class2594(Class1088 var1, double var2) {
      this.field16812 = var1;
      this.field16813 = var2;
   }

   @Override
   public boolean method10803() {
      return !Class1088.method5058(this.field16812) && !this.field16812.method5045() && this.field16812.method3250();
   }

   @Override
   public void method10804() {
      short var3 = 512;
      byte var4 = 4;
      Random var5 = Class1088.method5065(this.field16812);
      int var6 = var5.nextInt(1025) - 512;
      int var7 = var5.nextInt(9) - 4;
      int var8 = var5.nextInt(1025) - 512;
      if ((double)var7 + this.field16812.getPosY() > (double)(this.field16812.field5024.method6776() - 1)) {
         var7 = 0;
      }

      BlockPos var9 = new BlockPos(
         (double)var6 + this.field16812.getPosX(), (double)var7 + this.field16812.getPosY(), (double)var8 + this.field16812.getPosZ()
      );
      Class1088.method5066(this.field16812, var9);
      Class1088.method5067(this.field16812, true);
      this.field16814 = false;
   }

   @Override
   public void method10805() {
      if (this.field16812.method4230().method21664()) {
         Vector3d var3 = Vector3d.method11330(Class1088.method5068(this.field16812));
         Vector3d var4 = Class8037.method27588(this.field16812, 16, 3, var3, (float) (Math.PI / 10));
         if (var4 == null) {
            var4 = Class8037.method27587(this.field16812, 8, 7, var3);
         }

         if (var4 != null) {
            int var5 = Class9679.method37769(var4.field18048);
            int var6 = Class9679.method37769(var4.field18050);
            byte var7 = 34;
            if (!this.field16812.field5024.method7019(var5 - 34, 0, var6 - 34, var5 + 34, 0, var6 + 34)) {
               var4 = null;
            }
         }

         if (var4 == null) {
            this.field16814 = true;
            return;
         }

         this.field16812.method4230().method21654(var4.field18048, var4.field18049, var4.field18050, this.field16813);
      }
   }

   @Override
   public boolean method10806() {
      return !this.field16812.method4230().method21664()
         && !this.field16814
         && !Class1088.method5058(this.field16812)
         && !this.field16812.method4507()
         && !this.field16812.method5045();
   }

   @Override
   public void method10807() {
      Class1088.method5067(this.field16812, false);
      super.method10807();
   }
}
