package mapped;

import java.util.List;
import java.util.Random;

public class Class4202 extends Class4194 {
   private final boolean field20509;

   public Class4202(int var1, Random var2, Class9764 var3, Direction var4) {
      super(Class7792.field33448, var1);
      this.method12939(var4);
      this.field20495 = this.method12985(var2);
      this.field20444 = var3;
      this.field20509 = var3.method38399() > 6;
   }

   public Class4202(Class8761 var1, CompoundNBT var2) {
      super(Class7792.field33448, var2);
      this.field20509 = var2.method132("Tall");
   }

   @Override
   public void method12897(CompoundNBT var1) {
      super.method12897(var1);
      var1.method115("Tall", this.field20509);
   }

   public static Class4202 method12995(List<Class4178> var0, Random var1, int var2, int var3, int var4, Direction var5, int var6) {
      Class9764 var9 = Class9764.method38388(var2, var3, var4, -4, -1, 0, 14, 11, 15, var5);
      if (!method12989(var9) || Class4178.method12918(var0, var9) != null) {
         var9 = Class9764.method38388(var2, var3, var4, -4, -1, 0, 14, 6, 15, var5);
         if (!method12989(var9) || Class4178.method12918(var0, var9) != null) {
            return null;
         }
      }

      return new Class4202(var6, var1, var9, var5);
   }

   @Override
   public boolean method12896(Class1658 var1, Class7480 var2, Class5646 var3, Random var4, Class9764 var5, Class7481 var6, BlockPos var7) {
      byte var10 = 11;
      if (!this.field20509) {
         var10 = 6;
      }

      this.method12928(var1, var5, 0, 0, 0, 13, var10 - 1, 14, true, var4, Class9331.method35288());
      this.method12984(var1, var4, var5, this.field20495, 4, 1, 0);
      this.method12929(var1, var5, var4, 0.07F, 2, 1, 1, 11, 4, 13, Blocks.COBWEB.method11579(), Blocks.COBWEB.method11579(), false, false);
      boolean var11 = true;
      byte var12 = 12;

      for (int var13 = 1; var13 <= 13; var13++) {
         if ((var13 - 1) % 4 != 0) {
            this.method12927(var1, var5, 1, 1, var13, 1, 4, var13, Blocks.field36525.method11579(), Blocks.field36525.method11579(), false);
            this.method12927(var1, var5, 12, 1, var13, 12, 4, var13, Blocks.field36525.method11579(), Blocks.field36525.method11579(), false);
            if (this.field20509) {
               this.method12927(var1, var5, 1, 6, var13, 1, 9, var13, Blocks.field36525.method11579(), Blocks.field36525.method11579(), false);
               this.method12927(var1, var5, 12, 6, var13, 12, 9, var13, Blocks.field36525.method11579(), Blocks.field36525.method11579(), false);
            }
         } else {
            this.method12927(var1, var5, 1, 1, var13, 1, 4, var13, Blocks.field36400.method11579(), Blocks.field36400.method11579(), false);
            this.method12927(var1, var5, 12, 1, var13, 12, 4, var13, Blocks.field36400.method11579(), Blocks.field36400.method11579(), false);
            this.method12923(var1, Blocks.WALL_TORCH.method11579().method23465(Class3382.field18985, Direction.EAST), 2, 3, var13, var5);
            this.method12923(var1, Blocks.WALL_TORCH.method11579().method23465(Class3382.field18985, Direction.WEST), 11, 3, var13, var5);
            if (this.field20509) {
               this.method12927(var1, var5, 1, 6, var13, 1, 9, var13, Blocks.field36400.method11579(), Blocks.field36400.method11579(), false);
               this.method12927(var1, var5, 12, 6, var13, 12, 9, var13, Blocks.field36400.method11579(), Blocks.field36400.method11579(), false);
            }
         }
      }

      for (int var22 = 3; var22 < 12; var22 += 2) {
         this.method12927(var1, var5, 3, 1, var22, 4, 3, var22, Blocks.field36525.method11579(), Blocks.field36525.method11579(), false);
         this.method12927(var1, var5, 6, 1, var22, 7, 3, var22, Blocks.field36525.method11579(), Blocks.field36525.method11579(), false);
         this.method12927(var1, var5, 9, 1, var22, 10, 3, var22, Blocks.field36525.method11579(), Blocks.field36525.method11579(), false);
      }

      if (this.field20509) {
         this.method12927(var1, var5, 1, 5, 1, 3, 5, 13, Blocks.field36400.method11579(), Blocks.field36400.method11579(), false);
         this.method12927(var1, var5, 10, 5, 1, 12, 5, 13, Blocks.field36400.method11579(), Blocks.field36400.method11579(), false);
         this.method12927(var1, var5, 4, 5, 1, 9, 5, 2, Blocks.field36400.method11579(), Blocks.field36400.method11579(), false);
         this.method12927(var1, var5, 4, 5, 12, 9, 5, 13, Blocks.field36400.method11579(), Blocks.field36400.method11579(), false);
         this.method12923(var1, Blocks.field36400.method11579(), 9, 5, 11, var5);
         this.method12923(var1, Blocks.field36400.method11579(), 8, 5, 11, var5);
         this.method12923(var1, Blocks.field36400.method11579(), 9, 5, 10, var5);
         BlockState var23 = Blocks.OAK_FENCE
            .method11579()
            .method23465(Class3239.field18683, Boolean.valueOf(true))
            .method23465(Class3239.field18681, Boolean.valueOf(true));
         BlockState var14 = Blocks.OAK_FENCE
            .method11579()
            .method23465(Class3239.field18680, Boolean.valueOf(true))
            .method23465(Class3239.field18682, Boolean.valueOf(true));
         this.method12927(var1, var5, 3, 6, 3, 3, 6, 11, var14, var14, false);
         this.method12927(var1, var5, 10, 6, 3, 10, 6, 9, var14, var14, false);
         this.method12927(var1, var5, 4, 6, 2, 9, 6, 2, var23, var23, false);
         this.method12927(var1, var5, 4, 6, 12, 7, 6, 12, var23, var23, false);
         this.method12923(
            var1,
            Blocks.OAK_FENCE
               .method11579()
               .method23465(Class3239.field18680, Boolean.valueOf(true))
               .method23465(Class3239.field18681, Boolean.valueOf(true)),
            3,
            6,
            2,
            var5
         );
         this.method12923(
            var1,
            Blocks.OAK_FENCE
               .method11579()
               .method23465(Class3239.field18682, Boolean.valueOf(true))
               .method23465(Class3239.field18681, Boolean.valueOf(true)),
            3,
            6,
            12,
            var5
         );
         this.method12923(
            var1,
            Blocks.OAK_FENCE
               .method11579()
               .method23465(Class3239.field18680, Boolean.valueOf(true))
               .method23465(Class3239.field18683, Boolean.valueOf(true)),
            10,
            6,
            2,
            var5
         );

         for (int var15 = 0; var15 <= 2; var15++) {
            this.method12923(
               var1,
               Blocks.OAK_FENCE
                  .method11579()
                  .method23465(Class3239.field18682, Boolean.valueOf(true))
                  .method23465(Class3239.field18683, Boolean.valueOf(true)),
               8 + var15,
               6,
               12 - var15,
               var5
            );
            if (var15 != 2) {
               this.method12923(
                  var1,
                  Blocks.OAK_FENCE
                     .method11579()
                     .method23465(Class3239.field18680, Boolean.valueOf(true))
                     .method23465(Class3239.field18681, Boolean.valueOf(true)),
                  8 + var15,
                  6,
                  11 - var15,
                  var5
               );
            }
         }

         BlockState var24 = Blocks.LADDER.method11579().method23465(Class3423.field19154, Direction.SOUTH);
         this.method12923(var1, var24, 10, 1, 13, var5);
         this.method12923(var1, var24, 10, 2, 13, var5);
         this.method12923(var1, var24, 10, 3, 13, var5);
         this.method12923(var1, var24, 10, 4, 13, var5);
         this.method12923(var1, var24, 10, 5, 13, var5);
         this.method12923(var1, var24, 10, 6, 13, var5);
         this.method12923(var1, var24, 10, 7, 13, var5);
         byte var16 = 7;
         byte var17 = 7;
         BlockState var18 = Blocks.OAK_FENCE.method11579().method23465(Class3239.field18681, Boolean.valueOf(true));
         this.method12923(var1, var18, 6, 9, 7, var5);
         BlockState var19 = Blocks.OAK_FENCE.method11579().method23465(Class3239.field18683, Boolean.valueOf(true));
         this.method12923(var1, var19, 7, 9, 7, var5);
         this.method12923(var1, var18, 6, 8, 7, var5);
         this.method12923(var1, var19, 7, 8, 7, var5);
         BlockState var20 = var14.method23465(Class3239.field18683, Boolean.valueOf(true)).method23465(Class3239.field18681, Boolean.valueOf(true));
         this.method12923(var1, var20, 6, 7, 7, var5);
         this.method12923(var1, var20, 7, 7, 7, var5);
         this.method12923(var1, var18, 5, 7, 7, var5);
         this.method12923(var1, var19, 8, 7, 7, var5);
         this.method12923(var1, var18.method23465(Class3239.field18680, Boolean.valueOf(true)), 6, 7, 6, var5);
         this.method12923(var1, var18.method23465(Class3239.field18682, Boolean.valueOf(true)), 6, 7, 8, var5);
         this.method12923(var1, var19.method23465(Class3239.field18680, Boolean.valueOf(true)), 7, 7, 6, var5);
         this.method12923(var1, var19.method23465(Class3239.field18682, Boolean.valueOf(true)), 7, 7, 8, var5);
         BlockState var21 = Blocks.TORCH.method11579();
         this.method12923(var1, var21, 5, 8, 7, var5);
         this.method12923(var1, var21, 8, 8, 7, var5);
         this.method12923(var1, var21, 6, 8, 6, var5);
         this.method12923(var1, var21, 6, 8, 8, var5);
         this.method12923(var1, var21, 7, 8, 6, var5);
         this.method12923(var1, var21, 7, 8, 8, var5);
      }

      this.method12933(var1, var5, var4, 3, 3, 5, Class8793.field39555);
      if (this.field20509) {
         this.method12923(var1, field20443, 12, 9, 1, var5);
         this.method12933(var1, var5, var4, 12, 8, 1, Class8793.field39555);
      }

      return true;
   }
}
