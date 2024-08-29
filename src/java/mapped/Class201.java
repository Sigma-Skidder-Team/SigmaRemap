package mapped;

import org.apache.commons.lang3.mutable.MutableInt;

public final class Class201 extends Class200<Class7585, Class209> {
   private static String[] field753;
   private static final Direction[] field745 = Direction.values();
   private final Mutable field750 = new Mutable();

   public Class201(Class1704 var1) {
      super(var1, Class1977.field12882, new Class209(var1));
   }

   private int method664(long var1) {
      int var5 = BlockPos.method8328(var1);
      int var6 = BlockPos.method8329(var1);
      int var7 = BlockPos.method8330(var1);
      Class1665 var8 = this.field746.method7344(var5 >> 4, var7 >> 4);
      return var8 == null ? 0 : var8.method7032(this.field750.method8372(var5, var6, var7));
   }

   @Override
   public int method655(long var1, long var3, int var5) {
      if (var3 != Long.MAX_VALUE) {
         if (var1 != Long.MAX_VALUE) {
            if (var5 < 15) {
               int var8 = Integer.signum(BlockPos.method8328(var3) - BlockPos.method8328(var1));
               int var9 = Integer.signum(BlockPos.method8329(var3) - BlockPos.method8329(var1));
               int var10 = Integer.signum(BlockPos.method8330(var3) - BlockPos.method8330(var1));
               Direction var11 = Direction.method548(var8, var9, var10);
               if (var11 != null) {
                  MutableInt var12 = new MutableInt();
                  BlockState var13 = this.method647(var3, var12);
                  if (var12.getValue() < 15) {
                     BlockState var14 = this.method647(var1, (MutableInt)null);
                     Class6408 var15 = this.method648(var14, var1, var11);
                     Class6408 var16 = this.method648(var13, var3, var11.method536());
                     return !Class8022.method27444(var15, var16) ? var5 + Math.max(1, var12.getValue()) : 15;
                  } else {
                     return 15;
                  }
               } else {
                  return 15;
               }
            } else {
               return var5;
            }
         } else {
            return var5 + 15 - this.method664(var3);
         }
      } else {
         return 15;
      }
   }

   @Override
   public void method665(long var1, int var3, boolean var4) {
      long var7 = Class2002.method8419(var1);

      for (Direction var12 : field745) {
         long var13 = BlockPos.method8314(var1, var12);
         long var15 = Class2002.method8419(var13);
         if (var7 == var15 || this.field748.method698(var15)) {
            this.method674(var1, var13, var3, var4);
         }
      }
   }

   @Override
   public int method651(long var1, long var3, int var5) {
      int var8 = var5;
      if (Long.MAX_VALUE != var3) {
         int var15 = this.method655(Long.MAX_VALUE, var1, 0);
         if (var5 > var15) {
            var8 = var15;
         }

         if (var8 == 0) {
            return var8;
         }
      }

      long var9 = Class2002.method8419(var1);
      Class6785 var11 = this.field748.method699(var9, true);

      for (Direction var16 : field745) {
         long var17 = BlockPos.method8314(var1, var16);
         if (var17 != var3) {
            long var19 = Class2002.method8419(var17);
            Class6785 var21;
            if (var9 != var19) {
               var21 = this.field748.method699(var19, true);
            } else {
               var21 = var11;
            }

            if (var21 != null) {
               int var22 = this.method655(var17, var1, this.method653(var21, var17));
               if (var8 > var22) {
                  var8 = var22;
               }

               if (var8 == 0) {
                  return var8;
               }
            }
         }
      }

      return var8;
   }

   @Override
   public void method661(BlockPos var1, int var2) {
      this.field748.method716();
      this.method672(Long.MAX_VALUE, var1.method8332(), 15 - var2, true);
   }
}
