package mapped;

import java.util.Random;

public class Class4215 extends Class4213 {
   private static String[] field20541;

   public Class4215(Direction var1, Class9312 var2) {
      super(Class7792.field33464, 1, var1, var2, 2, 2, 2);
   }

   public Class4215(Class8761 var1, Class39 var2) {
      super(Class7792.field33464, var2);
   }

   @Override
   public boolean method12896(Class1658 var1, Class7480 var2, Class5646 var3, Random var4, Class9764 var5, Class7481 var6, BlockPos var7) {
      this.method13007(var1, var5, 1, 8, 0, 14, 8, 14, field20528);
      byte var10 = 7;
      Class7380 var11 = field20529;
      this.method12927(var1, var5, 0, 7, 0, 0, 7, 15, var11, var11, false);
      this.method12927(var1, var5, 15, 7, 0, 15, 7, 15, var11, var11, false);
      this.method12927(var1, var5, 1, 7, 0, 15, 7, 0, var11, var11, false);
      this.method12927(var1, var5, 1, 7, 15, 14, 7, 15, var11, var11, false);

      for (int var12 = 1; var12 <= 6; var12++) {
         var11 = field20529;
         if (var12 == 2 || var12 == 6) {
            var11 = field20528;
         }

         for (int var13 = 0; var13 <= 15; var13 += 15) {
            this.method12927(var1, var5, var13, var12, 0, var13, var12, 1, var11, var11, false);
            this.method12927(var1, var5, var13, var12, 6, var13, var12, 9, var11, var11, false);
            this.method12927(var1, var5, var13, var12, 14, var13, var12, 15, var11, var11, false);
         }

         this.method12927(var1, var5, 1, var12, 0, 1, var12, 0, var11, var11, false);
         this.method12927(var1, var5, 6, var12, 0, 9, var12, 0, var11, var11, false);
         this.method12927(var1, var5, 14, var12, 0, 14, var12, 0, var11, var11, false);
         this.method12927(var1, var5, 1, var12, 15, 14, var12, 15, var11, var11, false);
      }

      this.method12927(var1, var5, 6, 3, 6, 9, 6, 9, field20530, field20530, false);
      this.method12927(var1, var5, 7, 4, 7, 8, 5, 8, Blocks.field36521.method11579(), Blocks.field36521.method11579(), false);

      for (int var15 = 3; var15 <= 6; var15 += 3) {
         for (int var16 = 6; var16 <= 9; var16 += 3) {
            this.method12923(var1, field20532, var16, var15, 6, var5);
            this.method12923(var1, field20532, var16, var15, 9, var5);
         }
      }

      this.method12927(var1, var5, 5, 1, 6, 5, 2, 6, field20529, field20529, false);
      this.method12927(var1, var5, 5, 1, 9, 5, 2, 9, field20529, field20529, false);
      this.method12927(var1, var5, 10, 1, 6, 10, 2, 6, field20529, field20529, false);
      this.method12927(var1, var5, 10, 1, 9, 10, 2, 9, field20529, field20529, false);
      this.method12927(var1, var5, 6, 1, 5, 6, 2, 5, field20529, field20529, false);
      this.method12927(var1, var5, 9, 1, 5, 9, 2, 5, field20529, field20529, false);
      this.method12927(var1, var5, 6, 1, 10, 6, 2, 10, field20529, field20529, false);
      this.method12927(var1, var5, 9, 1, 10, 9, 2, 10, field20529, field20529, false);
      this.method12927(var1, var5, 5, 2, 5, 5, 6, 5, field20529, field20529, false);
      this.method12927(var1, var5, 5, 2, 10, 5, 6, 10, field20529, field20529, false);
      this.method12927(var1, var5, 10, 2, 5, 10, 6, 5, field20529, field20529, false);
      this.method12927(var1, var5, 10, 2, 10, 10, 6, 10, field20529, field20529, false);
      this.method12927(var1, var5, 5, 7, 1, 5, 7, 6, field20529, field20529, false);
      this.method12927(var1, var5, 10, 7, 1, 10, 7, 6, field20529, field20529, false);
      this.method12927(var1, var5, 5, 7, 9, 5, 7, 14, field20529, field20529, false);
      this.method12927(var1, var5, 10, 7, 9, 10, 7, 14, field20529, field20529, false);
      this.method12927(var1, var5, 1, 7, 5, 6, 7, 5, field20529, field20529, false);
      this.method12927(var1, var5, 1, 7, 10, 6, 7, 10, field20529, field20529, false);
      this.method12927(var1, var5, 9, 7, 5, 14, 7, 5, field20529, field20529, false);
      this.method12927(var1, var5, 9, 7, 10, 14, 7, 10, field20529, field20529, false);
      this.method12927(var1, var5, 2, 1, 2, 2, 1, 3, field20529, field20529, false);
      this.method12927(var1, var5, 3, 1, 2, 3, 1, 2, field20529, field20529, false);
      this.method12927(var1, var5, 13, 1, 2, 13, 1, 3, field20529, field20529, false);
      this.method12927(var1, var5, 12, 1, 2, 12, 1, 2, field20529, field20529, false);
      this.method12927(var1, var5, 2, 1, 12, 2, 1, 13, field20529, field20529, false);
      this.method12927(var1, var5, 3, 1, 13, 3, 1, 13, field20529, field20529, false);
      this.method12927(var1, var5, 13, 1, 12, 13, 1, 13, field20529, field20529, false);
      this.method12927(var1, var5, 12, 1, 13, 12, 1, 13, field20529, field20529, false);
      return true;
   }
}
