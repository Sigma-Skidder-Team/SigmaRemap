package mapped;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;

import java.util.List;
import java.util.Random;

public class Class4192 extends Class4188 {
   private static String[] field20487;

   public Class4192(int var1, Class9764 var2, Direction var3, Class102 var4) {
      super(Class7792.field33428, var1, var4);
      this.method12939(var3);
      this.field20444 = var2;
   }

   public Class4192(Class8761 var1, CompoundNBT var2) {
      super(Class7792.field33428, var2);
   }

   public static Class9764 method12975(List<Class4178> var0, Random var1, int var2, int var3, int var4, Direction var5) {
      Class9764 var8 = new Class9764(var2, var3 - 5, var4, var2, var3 + 3 - 1, var4);
      switch (Class7441.field32015[var5.ordinal()]) {
         case 1:
         default:
            var8.field45681 = var2 + 3 - 1;
            var8.field45680 = var4 - 8;
            break;
         case 2:
            var8.field45681 = var2 + 3 - 1;
            var8.field45683 = var4 + 8;
            break;
         case 3:
            var8.field45678 = var2 - 8;
            var8.field45683 = var4 + 3 - 1;
            break;
         case 4:
            var8.field45681 = var2 + 8;
            var8.field45683 = var4 + 3 - 1;
      }

      return Class4178.method12918(var0, var8) != null ? null : var8;
   }

   @Override
   public void method12894(Class4178 var1, List<Class4178> var2, Random var3) {
      int var6 = this.method12916();
      Direction var7 = this.method12938();
      if (var7 != null) {
         switch (Class7441.field32015[var7.ordinal()]) {
            case 1:
            default:
               Class6883.method20959(
                  var1, var2, var3, this.field20444.field45678, this.field20444.field45679, this.field20444.field45680 - 1, Direction.NORTH, var6
               );
               break;
            case 2:
               Class6883.method20959(
                  var1, var2, var3, this.field20444.field45678, this.field20444.field45679, this.field20444.field45683 + 1, Direction.SOUTH, var6
               );
               break;
            case 3:
               Class6883.method20959(
                  var1, var2, var3, this.field20444.field45678 - 1, this.field20444.field45679, this.field20444.field45680, Direction.WEST, var6
               );
               break;
            case 4:
               Class6883.method20959(
                  var1, var2, var3, this.field20444.field45681 + 1, this.field20444.field45679, this.field20444.field45680, Direction.EAST, var6
               );
         }
      }
   }

   @Override
   public boolean method12896(ISeedReader var1, Class7480 var2, ChunkGenerator var3, Random var4, Class9764 var5, Class7481 var6, BlockPos var7) {
      if (!this.method12919(var1, var5)) {
         this.method12927(var1, var5, 0, 5, 0, 2, 7, 1, field20443, field20443, false);
         this.method12927(var1, var5, 0, 0, 7, 2, 2, 8, field20443, field20443, false);

         for (int var10 = 0; var10 < 5; var10++) {
            this.method12927(var1, var5, 0, 5 - var10 - (var10 >= 4 ? 0 : 1), 2 + var10, 2, 7 - var10, 2 + var10, field20443, field20443, false);
         }

         return true;
      } else {
         return false;
      }
   }
}
