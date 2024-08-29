package mapped;

public class Class3432 extends Class3429 {
   private static String[] field19195;
   public static final Class8552<Class96> field19196 = Class8820.field39737;
   public static final Class8551 field19197 = Class8820.field39704;

   public Class3432(AbstractBlock var1) {
      super(true, var1);
      this.method11578(this.field18612.method35393().method23465(field19196, Class96.field247).method23465(field19197, Boolean.valueOf(false)));
   }

   public boolean method12098(World var1, BlockPos var2, BlockState var3, boolean var4, int var5) {
      if (var5 >= 8) {
         return false;
      } else {
         int var8 = var2.getX();
         int var9 = var2.getY();
         int var10 = var2.getZ();
         boolean var11 = true;
         Class96 var12 = var3.<Class96>method23463(field19196);
         switch (Class8690.field39230[var12.ordinal()]) {
            case 1:
               if (var4) {
                  var10++;
               } else {
                  var10--;
               }
               break;
            case 2:
               if (var4) {
                  var8--;
               } else {
                  var8++;
               }
               break;
            case 3:
               if (var4) {
                  var8--;
               } else {
                  var8++;
                  var9++;
                  var11 = false;
               }

               var12 = Class96.field248;
               break;
            case 4:
               if (var4) {
                  var8--;
                  var9++;
                  var11 = false;
               } else {
                  var8++;
               }

               var12 = Class96.field248;
               break;
            case 5:
               if (var4) {
                  var10++;
               } else {
                  var10--;
                  var9++;
                  var11 = false;
               }

               var12 = Class96.field247;
               break;
            case 6:
               if (var4) {
                  var10++;
                  var9++;
                  var11 = false;
               } else {
                  var10--;
               }

               var12 = Class96.field247;
         }

         return this.method12099(var1, new BlockPos(var8, var9, var10), var4, var5, var12)
            ? true
            : var11 && this.method12099(var1, new BlockPos(var8, var9 - 1, var10), var4, var5, var12);
      }
   }

   public boolean method12099(World var1, BlockPos var2, boolean var3, int var4, Class96 var5) {
      BlockState var8 = var1.getBlockState(var2);
      if (!var8.method23448(this)) {
         return false;
      } else {
         Class96 var9 = var8.<Class96>method23463(field19196);
         if (var5 != Class96.field248 || var9 != Class96.field247 && var9 != Class96.field251 && var9 != Class96.field252) {
            if (var5 != Class96.field247 || var9 != Class96.field248 && var9 != Class96.field249 && var9 != Class96.field250) {
               if (!var8.<Boolean>method23463(field19197)) {
                  return false;
               } else {
                  return !var1.method6780(var2) ? this.method12098(var1, var2, var8, var3, var4 + 1) : true;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   @Override
   public void method12091(BlockState var1, World var2, BlockPos var3, Block var4) {
      boolean var7 = var1.<Boolean>method23463(field19197);
      boolean var8 = var2.method6780(var3) || this.method12098(var2, var3, var1, true, 0) || this.method12098(var2, var3, var1, false, 0);
      if (var8 != var7) {
         var2.method6725(var3, var1.method23465(field19197, Boolean.valueOf(var8)), 3);
         var2.method6733(var3.method8313(), this);
         if (var1.<Class96>method23463(field19196).method275()) {
            var2.method6733(var3.method8311(), this);
         }
      }
   }

   @Override
   public Class8550<Class96> method12093() {
      return field19196;
   }

   @Override
   public BlockState method11500(BlockState var1, Class80 var2) {
      switch (Class8690.field39231[var2.ordinal()]) {
         case 1:
            switch (Class8690.field39230[var1.<Class96>method23463(field19196).ordinal()]) {
               case 3:
                  return var1.method23465(field19196, Class96.field250);
               case 4:
                  return var1.method23465(field19196, Class96.field249);
               case 5:
                  return var1.method23465(field19196, Class96.field252);
               case 6:
                  return var1.method23465(field19196, Class96.field251);
               case 7:
                  return var1.method23465(field19196, Class96.field255);
               case 8:
                  return var1.method23465(field19196, Class96.field256);
               case 9:
                  return var1.method23465(field19196, Class96.field253);
               case 10:
                  return var1.method23465(field19196, Class96.field254);
            }
         case 2:
            switch (Class8690.field39230[var1.<Class96>method23463(field19196).ordinal()]) {
               case 1:
                  return var1.method23465(field19196, Class96.field248);
               case 2:
                  return var1.method23465(field19196, Class96.field247);
               case 3:
                  return var1.method23465(field19196, Class96.field251);
               case 4:
                  return var1.method23465(field19196, Class96.field252);
               case 5:
                  return var1.method23465(field19196, Class96.field250);
               case 6:
                  return var1.method23465(field19196, Class96.field249);
               case 7:
                  return var1.method23465(field19196, Class96.field256);
               case 8:
                  return var1.method23465(field19196, Class96.field253);
               case 9:
                  return var1.method23465(field19196, Class96.field254);
               case 10:
                  return var1.method23465(field19196, Class96.field255);
            }
         case 3:
            switch (Class8690.field39230[var1.<Class96>method23463(field19196).ordinal()]) {
               case 1:
                  return var1.method23465(field19196, Class96.field248);
               case 2:
                  return var1.method23465(field19196, Class96.field247);
               case 3:
                  return var1.method23465(field19196, Class96.field252);
               case 4:
                  return var1.method23465(field19196, Class96.field251);
               case 5:
                  return var1.method23465(field19196, Class96.field249);
               case 6:
                  return var1.method23465(field19196, Class96.field250);
               case 7:
                  return var1.method23465(field19196, Class96.field254);
               case 8:
                  return var1.method23465(field19196, Class96.field255);
               case 9:
                  return var1.method23465(field19196, Class96.field256);
               case 10:
                  return var1.method23465(field19196, Class96.field253);
            }
         default:
            return var1;
      }
   }

   @Override
   public BlockState method11501(BlockState var1, Class2089 var2) {
      Class96 var5 = var1.<Class96>method23463(field19196);
      switch (Class8690.field39232[var2.ordinal()]) {
         case 1:
            switch (Class8690.field39230[var5.ordinal()]) {
               case 5:
                  return var1.method23465(field19196, Class96.field252);
               case 6:
                  return var1.method23465(field19196, Class96.field251);
               case 7:
                  return var1.method23465(field19196, Class96.field256);
               case 8:
                  return var1.method23465(field19196, Class96.field255);
               case 9:
                  return var1.method23465(field19196, Class96.field254);
               case 10:
                  return var1.method23465(field19196, Class96.field253);
               default:
                  return super.method11501(var1, var2);
            }
         case 2:
            switch (Class8690.field39230[var5.ordinal()]) {
               case 3:
                  return var1.method23465(field19196, Class96.field250);
               case 4:
                  return var1.method23465(field19196, Class96.field249);
               case 5:
               case 6:
               default:
                  break;
               case 7:
                  return var1.method23465(field19196, Class96.field254);
               case 8:
                  return var1.method23465(field19196, Class96.field253);
               case 9:
                  return var1.method23465(field19196, Class96.field256);
               case 10:
                  return var1.method23465(field19196, Class96.field255);
            }
         default:
            return super.method11501(var1, var2);
      }
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19196, field19197);
   }
}
