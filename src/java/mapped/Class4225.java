package mapped;

import java.util.Random;

public class Class4225 extends Class4213 {
   private static String[] field20556;

   public Class4225(Direction var1, Class9764 var2) {
      super(Class7792.field33471, var1, var2);
   }

   public Class4225(Class8761 var1, Class39 var2) {
      super(Class7792.field33471, var2);
   }

   @Override
   public boolean method12896(Class1658 var1, Class7480 var2, Class5646 var3, Random var4, Class9764 var5, Class7481 var6, BlockPos var7) {
      this.method12927(var1, var5, 2, -1, 2, 11, -1, 11, field20529, field20529, false);
      this.method12927(var1, var5, 0, -1, 0, 1, -1, 11, field20528, field20528, false);
      this.method12927(var1, var5, 12, -1, 0, 13, -1, 11, field20528, field20528, false);
      this.method12927(var1, var5, 2, -1, 0, 11, -1, 1, field20528, field20528, false);
      this.method12927(var1, var5, 2, -1, 12, 11, -1, 13, field20528, field20528, false);
      this.method12927(var1, var5, 0, 0, 0, 0, 0, 13, field20529, field20529, false);
      this.method12927(var1, var5, 13, 0, 0, 13, 0, 13, field20529, field20529, false);
      this.method12927(var1, var5, 1, 0, 0, 12, 0, 0, field20529, field20529, false);
      this.method12927(var1, var5, 1, 0, 13, 12, 0, 13, field20529, field20529, false);

      for (int var10 = 2; var10 <= 11; var10 += 3) {
         this.method12923(var1, field20532, 0, 0, var10, var5);
         this.method12923(var1, field20532, 13, 0, var10, var5);
         this.method12923(var1, field20532, var10, 0, 0, var5);
      }

      this.method12927(var1, var5, 2, 0, 3, 4, 0, 9, field20529, field20529, false);
      this.method12927(var1, var5, 9, 0, 3, 11, 0, 9, field20529, field20529, false);
      this.method12927(var1, var5, 4, 0, 9, 9, 0, 11, field20529, field20529, false);
      this.method12923(var1, field20529, 5, 0, 8, var5);
      this.method12923(var1, field20529, 8, 0, 8, var5);
      this.method12923(var1, field20529, 10, 0, 10, var5);
      this.method12923(var1, field20529, 3, 0, 10, var5);
      this.method12927(var1, var5, 3, 0, 3, 3, 0, 7, field20530, field20530, false);
      this.method12927(var1, var5, 10, 0, 3, 10, 0, 7, field20530, field20530, false);
      this.method12927(var1, var5, 6, 0, 10, 7, 0, 10, field20530, field20530, false);
      byte var13 = 3;

      for (int var11 = 0; var11 < 2; var11++) {
         for (int var12 = 2; var12 <= 8; var12 += 3) {
            this.method12927(var1, var5, var13, 0, var12, var13, 2, var12, field20529, field20529, false);
         }

         var13 = 10;
      }

      this.method12927(var1, var5, 5, 0, 10, 5, 2, 10, field20529, field20529, false);
      this.method12927(var1, var5, 8, 0, 10, 8, 2, 10, field20529, field20529, false);
      this.method12927(var1, var5, 6, -1, 7, 7, -1, 8, field20530, field20530, false);
      this.method13005(var1, var5, 6, -1, 3, 7, -1, 4);
      this.method13009(var1, var5, 6, 1, 6);
      return true;
   }
}
