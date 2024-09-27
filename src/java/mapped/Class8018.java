package mapped;

import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.structure.EndCityPieces;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.List;
import java.util.Random;

public final class Class8018 implements Class8015 {
   @Override
   public void init() {
   }

   @Override
   public boolean method27401(TemplateManager var1, int var2, Class4186 var3, BlockPos var4, List<Class4178> var5, Random var6) {
      if (var2 <= 8) {
         Rotation var9 = var3.field20454.method36437();
         Class4186 var10 = EndCityPieces.method36644(var5, EndCityPieces.method36643(var1, var3, var4, "base_floor", var9, true));
         int var11 = var6.nextInt(3);
         if (var11 != 0) {
            if (var11 != 1) {
               if (var11 == 2) {
                  var10 = EndCityPieces.method36644(var5, EndCityPieces.method36643(var1, var10, new BlockPos(-1, 0, -1), "second_floor_2", var9, false));
                  var10 = EndCityPieces.method36644(var5, EndCityPieces.method36643(var1, var10, new BlockPos(-1, 4, -1), "third_floor_2", var9, false));
                  var10 = EndCityPieces.method36644(var5, EndCityPieces.method36643(var1, var10, new BlockPos(-1, 8, -1), "third_roof", var9, true));
                  EndCityPieces.method36646(var1, EndCityPieces.method36645(), var2 + 1, var10, (BlockPos)null, var5, var6);
               }
            } else {
               var10 = EndCityPieces.method36644(var5, EndCityPieces.method36643(var1, var10, new BlockPos(-1, 0, -1), "second_floor_2", var9, false));
               var10 = EndCityPieces.method36644(var5, EndCityPieces.method36643(var1, var10, new BlockPos(-1, 8, -1), "second_roof", var9, false));
               EndCityPieces.method36646(var1, EndCityPieces.method36645(), var2 + 1, var10, (BlockPos)null, var5, var6);
            }
         } else {
            EndCityPieces.method36644(var5, EndCityPieces.method36643(var1, var10, new BlockPos(-1, 4, -1), "base_roof", var9, true));
         }

         return true;
      } else {
         return false;
      }
   }
}
