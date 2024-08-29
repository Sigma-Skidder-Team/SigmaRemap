package mapped;

import java.util.Random;

public class Class4216 extends Class4213 {
   private static String[] field20542;
   private int field20543;

   public Class4216(Direction var1, Class9764 var2, int var3) {
      super(Class7792.field33474, var1, var2);
      this.field20543 = var3 & 1;
   }

   public Class4216(Class8761 var1, CompoundNBT var2) {
      super(Class7792.field33474, var2);
   }

   @Override
   public boolean method12896(Class1658 var1, Class7480 var2, Class5646 var3, Random var4, Class9764 var5, Class7481 var6, BlockPos var7) {
      if (this.field20543 != 0) {
         if (this.field20543 == 1) {
            this.method12927(var1, var5, 9, 3, 18, 13, 3, 20, field20529, field20529, false);
            this.method12927(var1, var5, 9, 0, 18, 9, 2, 18, field20529, field20529, false);
            this.method12927(var1, var5, 13, 0, 18, 13, 2, 18, field20529, field20529, false);
            byte var10 = 9;
            byte var11 = 20;
            byte var12 = 5;

            for (int var13 = 0; var13 < 2; var13++) {
               this.method12923(var1, field20529, var10, 6, 20, var5);
               this.method12923(var1, field20532, var10, 5, 20, var5);
               this.method12923(var1, field20529, var10, 4, 20, var5);
               var10 = 13;
            }

            this.method12927(var1, var5, 7, 3, 7, 15, 3, 14, field20529, field20529, false);
            var10 = 10;

            for (int var18 = 0; var18 < 2; var18++) {
               this.method12927(var1, var5, var10, 0, 10, var10, 6, 10, field20529, field20529, false);
               this.method12927(var1, var5, var10, 0, 12, var10, 6, 12, field20529, field20529, false);
               this.method12923(var1, field20532, var10, 0, 10, var5);
               this.method12923(var1, field20532, var10, 0, 12, var5);
               this.method12923(var1, field20532, var10, 4, 10, var5);
               this.method12923(var1, field20532, var10, 4, 12, var5);
               var10 = 12;
            }

            var10 = 8;

            for (int var19 = 0; var19 < 2; var19++) {
               this.method12927(var1, var5, var10, 0, 7, var10, 2, 7, field20529, field20529, false);
               this.method12927(var1, var5, var10, 0, 14, var10, 2, 14, field20529, field20529, false);
               var10 = 14;
            }

            this.method12927(var1, var5, 8, 3, 8, 8, 3, 13, field20530, field20530, false);
            this.method12927(var1, var5, 14, 3, 8, 14, 3, 13, field20530, field20530, false);
            this.method13009(var1, var5, 11, 5, 13);
         }
      } else {
         for (int var16 = 0; var16 < 4; var16++) {
            this.method12927(var1, var5, 10 - var16, 3 - var16, 20 - var16, 12 + var16, 3 - var16, 20, field20529, field20529, false);
         }

         this.method12927(var1, var5, 7, 0, 6, 15, 0, 16, field20529, field20529, false);
         this.method12927(var1, var5, 6, 0, 6, 6, 3, 20, field20529, field20529, false);
         this.method12927(var1, var5, 16, 0, 6, 16, 3, 20, field20529, field20529, false);
         this.method12927(var1, var5, 7, 1, 7, 7, 1, 20, field20529, field20529, false);
         this.method12927(var1, var5, 15, 1, 7, 15, 1, 20, field20529, field20529, false);
         this.method12927(var1, var5, 7, 1, 6, 9, 3, 6, field20529, field20529, false);
         this.method12927(var1, var5, 13, 1, 6, 15, 3, 6, field20529, field20529, false);
         this.method12927(var1, var5, 8, 1, 7, 9, 1, 7, field20529, field20529, false);
         this.method12927(var1, var5, 13, 1, 7, 14, 1, 7, field20529, field20529, false);
         this.method12927(var1, var5, 9, 0, 5, 13, 0, 5, field20529, field20529, false);
         this.method12927(var1, var5, 10, 0, 7, 12, 0, 7, field20530, field20530, false);
         this.method12927(var1, var5, 8, 0, 10, 8, 0, 12, field20530, field20530, false);
         this.method12927(var1, var5, 14, 0, 10, 14, 0, 12, field20530, field20530, false);

         for (int var17 = 18; var17 >= 7; var17 -= 3) {
            this.method12923(var1, field20532, 6, 3, var17, var5);
            this.method12923(var1, field20532, 16, 3, var17, var5);
         }

         this.method12923(var1, field20532, 10, 0, 10, var5);
         this.method12923(var1, field20532, 12, 0, 10, var5);
         this.method12923(var1, field20532, 10, 0, 12, var5);
         this.method12923(var1, field20532, 12, 0, 12, var5);
         this.method12923(var1, field20532, 8, 3, 6, var5);
         this.method12923(var1, field20532, 14, 3, 6, var5);
         this.method12923(var1, field20529, 4, 2, 4, var5);
         this.method12923(var1, field20532, 4, 1, 4, var5);
         this.method12923(var1, field20529, 4, 0, 4, var5);
         this.method12923(var1, field20529, 18, 2, 4, var5);
         this.method12923(var1, field20532, 18, 1, 4, var5);
         this.method12923(var1, field20529, 18, 0, 4, var5);
         this.method12923(var1, field20529, 4, 2, 18, var5);
         this.method12923(var1, field20532, 4, 1, 18, var5);
         this.method12923(var1, field20529, 4, 0, 18, var5);
         this.method12923(var1, field20529, 18, 2, 18, var5);
         this.method12923(var1, field20532, 18, 1, 18, var5);
         this.method12923(var1, field20529, 18, 0, 18, var5);
         this.method12923(var1, field20529, 9, 7, 20, var5);
         this.method12923(var1, field20529, 13, 7, 20, var5);
         this.method12927(var1, var5, 6, 0, 21, 7, 4, 21, field20529, field20529, false);
         this.method12927(var1, var5, 15, 0, 21, 16, 4, 21, field20529, field20529, false);
         this.method13009(var1, var5, 11, 2, 16);
      }

      return true;
   }
}
