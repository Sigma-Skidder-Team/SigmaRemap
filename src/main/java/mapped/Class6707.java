package mapped;


public class Class6707 implements Class6708 {
   private static String[] field29346;
   public Class2443 field29347;
   public Class7413 field29348;
   public Class7870 field29349;
   public Class7870 field29350;
   public Class6748 field29351;
   public int field29352;
   public int field29353;
   public int field29354;
   public Class4742[] field29355;
   public Class8428 field29356 = null;

   public Class6707() {
      this.field29356 = new Class8428();
   }

   public void method20447(Class2443 var1, Class7413 var2, Class7870 var3, Class7870 var4, Class6748 var5, int var6) {
      this.field29347 = var1;
      this.field29348 = var2;
      this.field29349 = var3;
      this.field29350 = var4;
      this.field29351 = var5;
      this.field29352 = var6;
   }

   @Override
   public void method20448() throws Class2438 {
      this.field29354 = this.field29348.method23690();
      this.field29355 = new Class4742[32];
      this.field29353 = this.field29348.method23666();
      this.method20449();
      this.method20450();
      this.method20451();
      if (this.field29356 != null || this.field29348.method23673()) {
         this.method20452();
         this.method20453();
      }
   }

   public void method20449() {
      if (this.field29353 != 3) {
         if (this.field29353 != 1) {
            for (int var3 = 0; var3 < this.field29354; var3++) {
               this.field29355[var3] = new Class4745(var3);
            }
         } else {
            int var4;
            for (var4 = 0; var4 < this.field29348.method23691(); var4++) {
               this.field29355[var4] = new Class4745(var4);
            }

            while (var4 < this.field29354) {
               this.field29355[var4] = new Class4744(var4);
               var4++;
            }
         }
      } else {
         for (int var5 = 0; var5 < this.field29354; var5++) {
            this.field29355[var5] = new Class4743(var5);
         }
      }
   }

   public void method20450() throws Class2438 {
      for (int var3 = 0; var3 < this.field29354; var3++) {
         this.field29355[var3].method14883(this.field29347, this.field29348, this.field29356);
      }
   }

   public void method20451() {
   }

   public void method20452() {
      for (int var3 = 0; var3 < this.field29354; var3++) {
         this.field29355[var3].method14885(this.field29347, this.field29348);
      }
   }

   public void method20453() {
      boolean var3 = false;
      boolean var4 = false;
      int var5 = this.field29348.method23666();

      do {
         for (int var6 = 0; var6 < this.field29354; var6++) {
            var3 = this.field29355[var6].method14886(this.field29347);
         }

         do {
            for (int var7 = 0; var7 < this.field29354; var7++) {
               var4 = this.field29355[var7].method14887(this.field29352, this.field29349, this.field29350);
            }

            this.field29349.method26386(this.field29351);
            if (this.field29352 == 0 && var5 != 3) {
               this.field29350.method26386(this.field29351);
            }
         } while (!var4);
      } while (!var3);
   }
}
