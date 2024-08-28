package mapped;

import java.util.List;
import java.util.Random;

public class Class4174 extends Class4167 {
   private static String[] field20436;

   public Class4174(int var1, Class9764 var2, Direction var3) {
      super(Class7792.field33429, var1);
      this.method12939(var3);
      this.field20444 = var2;
   }

   public Class4174(Random var1, int var2, int var3) {
      super(Class7792.field33429, 0);
      this.method12939(Class76.field161.method247(var1));
      if (this.method12938().method544() != Class113.field415) {
         this.field20444 = new Class9764(var2, 64, var3, var2 + 19 - 1, 73, var3 + 19 - 1);
      } else {
         this.field20444 = new Class9764(var2, 64, var3, var2 + 19 - 1, 73, var3 + 19 - 1);
      }
   }

   public Class4174(Class7792 var1, Class39 var2) {
      super(var1, var2);
   }

   public Class4174(Class8761 var1, Class39 var2) {
      this(Class7792.field33429, var2);
   }

   @Override
   public void method12894(Class4178 var1, List<Class4178> var2, Random var3) {
      this.method12901((Class4175)var1, var2, var3, 8, 3, false);
      this.method12902((Class4175)var1, var2, var3, 3, 8, false);
      this.method12903((Class4175)var1, var2, var3, 3, 8, false);
   }

   public static Class4174 method12911(List<Class4178> var0, int var1, int var2, int var3, Direction var4, int var5) {
      Class9764 var8 = Class9764.method38388(var1, var2, var3, -8, -3, 0, 19, 10, 19, var4);
      return method12904(var8) && Class4178.method12918(var0, var8) == null ? new Class4174(var5, var8, var4) : null;
   }

   @Override
   public boolean method12896(Class1658 var1, Class7480 var2, Class5646 var3, Random var4, Class9764 var5, Class7481 var6, BlockPos var7) {
      this.method12927(var1, var5, 7, 3, 0, 11, 4, 18, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 0, 3, 7, 18, 4, 11, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 8, 5, 0, 10, 7, 18, Blocks.AIR.method11579(), Blocks.AIR.method11579(), false);
      this.method12927(var1, var5, 0, 5, 8, 18, 7, 10, Blocks.AIR.method11579(), Blocks.AIR.method11579(), false);
      this.method12927(var1, var5, 7, 5, 0, 7, 5, 7, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 7, 5, 11, 7, 5, 18, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 11, 5, 0, 11, 5, 7, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 11, 5, 11, 11, 5, 18, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 0, 5, 7, 7, 5, 7, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 11, 5, 7, 18, 5, 7, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 0, 5, 11, 7, 5, 11, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 11, 5, 11, 18, 5, 11, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 7, 2, 0, 11, 2, 5, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 7, 2, 13, 11, 2, 18, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 7, 0, 0, 11, 1, 3, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 7, 0, 15, 11, 1, 18, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);

      for (int var10 = 7; var10 <= 11; var10++) {
         for (int var11 = 0; var11 <= 2; var11++) {
            this.method12932(var1, Blocks.NETHER_BRICKS.method11579(), var10, -1, var11, var5);
            this.method12932(var1, Blocks.NETHER_BRICKS.method11579(), var10, -1, 18 - var11, var5);
         }
      }

      this.method12927(var1, var5, 0, 2, 7, 5, 2, 11, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 13, 2, 7, 18, 2, 11, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 0, 0, 7, 3, 1, 11, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 15, 0, 7, 18, 1, 11, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);

      for (int var12 = 0; var12 <= 2; var12++) {
         for (int var13 = 7; var13 <= 11; var13++) {
            this.method12932(var1, Blocks.NETHER_BRICKS.method11579(), var12, -1, var13, var5);
            this.method12932(var1, Blocks.NETHER_BRICKS.method11579(), 18 - var12, -1, var13, var5);
         }
      }

      return true;
   }
}
