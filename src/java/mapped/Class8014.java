package mapped;

import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.structure.EndCityPieces;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.List;
import java.util.Random;

public final class Class8014 implements Class8015 {
   @Override
   public void init() {
   }

   @Override
   public boolean method27401(TemplateManager var1, int var2, Class4186 var3, BlockPos var4, List<Class4178> var5, Random var6) {
      Rotation var9 = var3.field20454.method36437();
      Class4186 var10 = EndCityPieces.method36644(var5, EndCityPieces.method36643(var1, var3, new BlockPos(-3, 4, -3), "fat_tower_base", var9, true));
      var10 = EndCityPieces.method36644(var5, EndCityPieces.method36643(var1, var10, new BlockPos(0, 4, 0), "fat_tower_middle", var9, true));

      for (int var11 = 0; var11 < 2 && var6.nextInt(3) != 0; var11++) {
         var10 = EndCityPieces.method36644(var5, EndCityPieces.method36643(var1, var10, new BlockPos(0, 8, 0), "fat_tower_middle", var9, true));

         for (Class6793 var13 : EndCityPieces.method36651()) {
            if (var6.nextBoolean()) {
               Class4186 var14 = EndCityPieces.method36644(
                  var5, EndCityPieces.method36643(var1, var10, (BlockPos)var13.method20693(), "bridge_end", var9.method250((Rotation)var13.method20692()), true)
               );
               EndCityPieces.method36646(var1, EndCityPieces.method36648(), var2 + 1, var14, (BlockPos)null, var5, var6);
            }
         }
      }

      EndCityPieces.method36644(var5, EndCityPieces.method36643(var1, var10, new BlockPos(-2, 8, -2), "fat_tower_top", var9, true));
      return true;
   }
}
