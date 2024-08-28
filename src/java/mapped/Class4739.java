package mapped;

public class Class4739 extends Class4740 {
   private static String[] field22438;
   public int field22439;
   public float field22440;
   public float field22441;
   public float field22442;

   public Class4739(int var1) {
      super(var1);
   }

   @Override
   public void method14883(Class2443 var1, Class7413 var2, Class8428 var3) {
      super.method14883(var1, var2, var3);
   }

   @Override
   public void method14884(Class2443 var1, Class8428 var2) {
      if (this.field22471 != 0) {
         this.field22472 = var1.method10451(2);
         this.field22439 = var1.method10451(2);
         if (var2 != null) {
            var2.method29609(this.field22472, 2);
            var2.method29609(this.field22439, 2);
         }
      }
   }

   @Override
   public void method14885(Class2443 var1, Class7413 var2) {
      if (this.field22471 != 0) {
         super.method14885(var1, var2);
         switch (this.field22439) {
            case 0:
               this.field22440 = field22495[var1.method10451(6)];
               this.field22441 = field22495[var1.method10451(6)];
               this.field22442 = field22495[var1.method10451(6)];
               break;
            case 1:
               this.field22440 = this.field22441 = field22495[var1.method10451(6)];
               this.field22442 = field22495[var1.method10451(6)];
               break;
            case 2:
               this.field22440 = this.field22441 = this.field22442 = field22495[var1.method10451(6)];
               break;
            case 3:
               this.field22440 = field22495[var1.method10451(6)];
               this.field22441 = this.field22442 = field22495[var1.method10451(6)];
         }
      }
   }

   @Override
   public boolean method14886(Class2443 var1) {
      return super.method14886(var1);
   }

   @Override
   public boolean method14887(int var1, Class7870 var2, Class7870 var3) {
      if (this.field22471 != 0) {
         float var6 = this.field22481[this.field22480];
         if (this.field22477[0] == null) {
            var6 = (var6 + this.field22483[0]) * this.field22482[0];
         }

         if (var1 != 0) {
            if (var1 != 1) {
               if (this.field22479 > 4) {
                  if (this.field22479 > 8) {
                     var6 *= this.field22442;
                  } else {
                     var6 *= this.field22441;
                  }
               } else {
                  var6 *= this.field22440;
               }

               var2.method26365(var6, this.field22470);
            } else {
               if (this.field22479 > 4) {
                  if (this.field22479 > 8) {
                     var6 *= this.field22475;
                  } else {
                     var6 *= this.field22474;
                  }
               } else {
                  var6 *= this.field22473;
               }

               var2.method26365(var6, this.field22470);
            }
         } else {
            float var11;
            if (this.field22479 > 4) {
               if (this.field22479 > 8) {
                  var6 *= this.field22475;
                  var11 = var6 * this.field22442;
               } else {
                  var6 *= this.field22474;
                  var11 = var6 * this.field22441;
               }
            } else {
               var6 *= this.field22473;
               var11 = var6 * this.field22440;
            }

            var2.method26365(var6, this.field22470);
            var3.method26365(var11, this.field22470);
         }
      }

      return ++this.field22480 == 3;
   }
}
