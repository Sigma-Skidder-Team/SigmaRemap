package mapped;

import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.structure.EndCityPieces;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.List;
import java.util.Random;

public final class Class8017 implements Class8015 {
   @Override
   public void init() {
   }

   @Override
   public boolean method27401(TemplateManager var1, int var2, Class4186 var3, BlockPos var4, List<Class4178> var5, Random var6) {
      Rotation var9 = var3.field20454.method36437();
      Class4186 var10 = EndCityPieces.method36644(
         var5, EndCityPieces.method36643(var1, var3, new BlockPos(3 + var6.nextInt(2), -3, 3 + var6.nextInt(2)), "tower_base", var9, true)
      );
      var10 = EndCityPieces.method36644(var5, EndCityPieces.method36643(var1, var10, new BlockPos(0, 7, 0), "tower_piece", var9, true));
      Class4186 var11 = var6.nextInt(3) != 0 ? null : var10;
      int var12 = 1 + var6.nextInt(3);

      for (int var13 = 0; var13 < var12; var13++) {
         var10 = EndCityPieces.method36644(var5, EndCityPieces.method36643(var1, var10, new BlockPos(0, 4, 0), "tower_piece", var9, true));
         if (var13 < var12 - 1 && var6.nextBoolean()) {
            var11 = var10;
         }
      }

      if (var11 == null) {
         if (var2 != 7) {
            return EndCityPieces.method36646(var1, EndCityPieces.method36649(), var2 + 1, var10, (BlockPos)null, var5, var6);
         }

         EndCityPieces.method36644(var5, EndCityPieces.method36643(var1, var10, new BlockPos(-1, 4, -1), "tower_top", var9, true));
      } else {
         for (Class6793 var14 : EndCityPieces.method36647()) {
            if (var6.nextBoolean()) {
               Class4186 var15 = EndCityPieces.method36644(
                  var5, EndCityPieces.method36643(var1, var11, (BlockPos)var14.method20693(), "bridge_end", var9.method250((Rotation)var14.method20692()), true)
               );
               EndCityPieces.method36646(var1, EndCityPieces.method36648(), var2 + 1, var15, (BlockPos)null, var5, var6);
            }
         }

         EndCityPieces.method36644(var5, EndCityPieces.method36643(var1, var10, new BlockPos(-1, 4, -1), "tower_top", var9, true));
      }

      return true;
   }
}
