package mapped;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MutableBoundingBox;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public abstract class Class4167 extends Class4178 {
   public Class4167(Class7792 var1, int var2) {
      super(var1, var2);
   }

   public Class4167(Class7792 var1, CompoundNBT var2) {
      super(var1, var2);
   }

   @Override
   public void method12897(CompoundNBT var1) {
   }

   private int method12898(List<Class7258> var1) {
      boolean var4 = false;
      int var5 = 0;

      for (Class7258 var7 : var1) {
         if (var7.field31144 > 0 && var7.field31143 < var7.field31144) {
            var4 = true;
         }

         var5 += var7.field31142;
      }

      return !var4 ? -1 : var5;
   }

   private Class4167 method12899(Class4175 var1, List<Class7258> var2, List<Class4178> var3, Random var4, int var5, int var6, int var7, Direction var8, int var9) {
      int var12 = this.method12898(var2);
      boolean var13 = var12 > 0 && var9 <= 30;
      int var14 = 0;

      while (var14 < 5 && var13) {
         var14++;
         int var15 = var4.nextInt(var12);

         for (Class7258 var17 : var2) {
            var15 -= var17.field31142;
            if (var15 < 0) {
               if (!var17.method22794(var9) || var17 == var1.field20437 && !var17.field31145) {
                  break;
               }

               Class4167 var18 = Class7247.method22748(var17, var3, var4, var5, var6, var7, var8, var9);
               if (var18 != null) {
                  var17.field31143++;
                  var1.field20437 = var17;
                  if (!var17.method22795()) {
                     var2.remove(var17);
                  }

                  return var18;
               }
            }
         }
      }

      return Class4171.method12908(var3, var4, var5, var6, var7, var8, var9);
   }

   private Class4178 method12900(Class4175 var1, List<Class4178> var2, Random var3, int var4, int var5, int var6, Direction var7, int var8, boolean var9) {
      if (Math.abs(var4 - var1.method12915().field45678) <= 112 && Math.abs(var6 - var1.method12915().field45680) <= 112) {
         List var12 = var1.field20438;
         if (var9) {
            var12 = var1.field20439;
         }

         Class4167 var13 = this.method12899(var1, var12, var2, var3, var4, var5, var6, var7, var8 + 1);
         if (var13 != null) {
            var2.add(var13);
            var1.field20440.add(var13);
         }

         return var13;
      } else {
         return Class4171.method12908(var2, var3, var4, var5, var6, var7, var8);
      }
   }

   @Nullable
   public Class4178 method12901(Class4175 var1, List<Class4178> var2, Random var3, int var4, int var5, boolean var6) {
      Direction var9 = this.method12938();
      if (var9 != null) {
         switch (Class7282.field31237[var9.ordinal()]) {
            case 1:
               return this.method12900(
                  var1,
                  var2,
                  var3,
                  this.field20444.field45678 + var4,
                  this.field20444.field45679 + var5,
                  this.field20444.field45680 - 1,
                  var9,
                  this.method12916(),
                  var6
               );
            case 2:
               return this.method12900(
                  var1,
                  var2,
                  var3,
                  this.field20444.field45678 + var4,
                  this.field20444.field45679 + var5,
                  this.field20444.field45683 + 1,
                  var9,
                  this.method12916(),
                  var6
               );
            case 3:
               return this.method12900(
                  var1,
                  var2,
                  var3,
                  this.field20444.field45678 - 1,
                  this.field20444.field45679 + var5,
                  this.field20444.field45680 + var4,
                  var9,
                  this.method12916(),
                  var6
               );
            case 4:
               return this.method12900(
                  var1,
                  var2,
                  var3,
                  this.field20444.field45681 + 1,
                  this.field20444.field45679 + var5,
                  this.field20444.field45680 + var4,
                  var9,
                  this.method12916(),
                  var6
               );
         }
      }

      return null;
   }

   @Nullable
   public Class4178 method12902(Class4175 var1, List<Class4178> var2, Random var3, int var4, int var5, boolean var6) {
      Direction var9 = this.method12938();
      if (var9 != null) {
         switch (Class7282.field31237[var9.ordinal()]) {
            case 1:
               return this.method12900(
                  var1,
                  var2,
                  var3,
                  this.field20444.field45678 - 1,
                  this.field20444.field45679 + var4,
                  this.field20444.field45680 + var5,
                  Direction.WEST,
                  this.method12916(),
                  var6
               );
            case 2:
               return this.method12900(
                  var1,
                  var2,
                  var3,
                  this.field20444.field45678 - 1,
                  this.field20444.field45679 + var4,
                  this.field20444.field45680 + var5,
                  Direction.WEST,
                  this.method12916(),
                  var6
               );
            case 3:
               return this.method12900(
                  var1,
                  var2,
                  var3,
                  this.field20444.field45678 + var5,
                  this.field20444.field45679 + var4,
                  this.field20444.field45680 - 1,
                  Direction.NORTH,
                  this.method12916(),
                  var6
               );
            case 4:
               return this.method12900(
                  var1,
                  var2,
                  var3,
                  this.field20444.field45678 + var5,
                  this.field20444.field45679 + var4,
                  this.field20444.field45680 - 1,
                  Direction.NORTH,
                  this.method12916(),
                  var6
               );
         }
      }

      return null;
   }

   @Nullable
   public Class4178 method12903(Class4175 var1, List<Class4178> var2, Random var3, int var4, int var5, boolean var6) {
      Direction var9 = this.method12938();
      if (var9 != null) {
         switch (Class7282.field31237[var9.ordinal()]) {
            case 1:
               return this.method12900(
                  var1,
                  var2,
                  var3,
                  this.field20444.field45681 + 1,
                  this.field20444.field45679 + var4,
                  this.field20444.field45680 + var5,
                  Direction.EAST,
                  this.method12916(),
                  var6
               );
            case 2:
               return this.method12900(
                  var1,
                  var2,
                  var3,
                  this.field20444.field45681 + 1,
                  this.field20444.field45679 + var4,
                  this.field20444.field45680 + var5,
                  Direction.EAST,
                  this.method12916(),
                  var6
               );
            case 3:
               return this.method12900(
                  var1,
                  var2,
                  var3,
                  this.field20444.field45678 + var5,
                  this.field20444.field45679 + var4,
                  this.field20444.field45683 + 1,
                  Direction.SOUTH,
                  this.method12916(),
                  var6
               );
            case 4:
               return this.method12900(
                  var1,
                  var2,
                  var3,
                  this.field20444.field45678 + var5,
                  this.field20444.field45679 + var4,
                  this.field20444.field45683 + 1,
                  Direction.SOUTH,
                  this.method12916(),
                  var6
               );
         }
      }

      return null;
   }

   public static boolean method12904(MutableBoundingBox var0) {
      return var0 != null && var0.field45679 > 10;
   }
}
