package mapped;

import java.util.Random;

public class Class4179 extends Class4178 {
   private static String[] field20451;

   public Class4179(BlockPos var1) {
      super(Class7792.field33477, 0);
      this.field20444 = new Class9764(var1.method8304(), var1.getY(), var1.method8306(), var1.method8304(), var1.getY(), var1.method8306());
   }

   public Class4179(Class8761 var1, Class39 var2) {
      super(Class7792.field33477, var2);
   }

   @Override
   public void method12897(Class39 var1) {
   }

   @Override
   public boolean method12896(Class1658 var1, Class7480 var2, Class5646 var3, Random var4, Class9764 var5, Class7481 var6, BlockPos var7) {
      int var10 = var1.method6736(Class101.field297, this.field20444.field45678, this.field20444.field45680);
      Mutable var11 = new Mutable(this.field20444.field45678, var10, this.field20444.field45680);

      while (var11.getY() > 0) {
         Class7380 var12 = var1.method6738(var11);
         Class7380 var13 = var1.method6738(var11.method8313());
         if (var13 == Class8487.field36458.method11579()
            || var13 == Class8487.field36388.method11579()
            || var13 == Class8487.field36393.method11579()
            || var13 == Class8487.field36389.method11579()
            || var13 == Class8487.field36391.method11579()) {
            Class7380 var14 = !var12.method23393() && !this.method12942(var12) ? var12 : Class8487.field36415.method11579();

            for (Direction var18 : Direction.values()) {
               BlockPos var19 = var11.method8349(var18);
               Class7380 var20 = var1.method6738(var19);
               if (var20.method23393() || this.method12942(var20)) {
                  BlockPos var21 = var19.method8313();
                  Class7380 var22 = var1.method6738(var21);
                  if ((var22.method23393() || this.method12942(var22)) && var18 != Direction.field673) {
                     var1.method6725(var19, var13, 3);
                  } else {
                     var1.method6725(var19, var14, 3);
                  }
               }
            }

            this.field20444 = new Class9764(
               var11.method8304(), var11.getY(), var11.method8306(), var11.method8304(), var11.getY(), var11.method8306()
            );
            return this.method12935(var1, var5, var4, var11, Class8793.field39565, (Class7380)null);
         }

         var11.method8381(0, -1, 0);
      }

      return false;
   }

   private boolean method12942(Class7380 var1) {
      return var1 == Class8487.field36413.method11579() || var1 == Class8487.field36414.method11579();
   }
}
