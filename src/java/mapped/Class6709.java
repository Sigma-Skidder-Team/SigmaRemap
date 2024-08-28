package mapped;

public class Class6709 extends Class6707 implements Class6708 {
   private static String[] field29346;

   @Override
   public void method20449() {
      if (this.field29353 != 3) {
         if (this.field29353 != 1) {
            for (int var3 = 0; var3 < this.field29354; var3++) {
               this.field29355[var3] = new Class4741(var3);
            }
         } else {
            int var4;
            for (var4 = 0; var4 < this.field29348.method23691(); var4++) {
               this.field29355[var4] = new Class4741(var4);
            }

            while (var4 < this.field29354) {
               this.field29355[var4] = new Class4739(var4);
               var4++;
            }
         }
      } else {
         for (int var5 = 0; var5 < this.field29354; var5++) {
            this.field29355[var5] = new Class4740(var5);
         }
      }
   }

   @Override
   public void method20451() {
      for (int var3 = 0; var3 < this.field29354; var3++) {
         ((Class4740)this.field29355[var3]).method14884(this.field29347, this.field29356);
      }
   }
}
