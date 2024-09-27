package mapped;

import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.structure.EndCityPieces;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.List;
import java.util.Random;

public final class Class8016 implements Class8015 {
   public boolean field34444;

   @Override
   public void init() {
      this.field34444 = false;
   }

   @Override
   public boolean method27401(TemplateManager var1, int var2, Class4186 var3, BlockPos var4, List<Class4178> var5, Random var6) {
      Rotation var9 = var3.field20454.method36437();
      int var10 = var6.nextInt(4) + 1;
      Class4186 var11 = EndCityPieces.method36644(var5, EndCityPieces.method36643(var1, var3, new BlockPos(0, 0, -4), "bridge_piece", var9, true));
      var11.field20448 = -1;
      byte var12 = 0;

      for (int var13 = 0; var13 < var10; var13++) {
         if (!var6.nextBoolean()) {
            if (!var6.nextBoolean()) {
               var11 = EndCityPieces.method36644(var5, EndCityPieces.method36643(var1, var11, new BlockPos(0, var12, -8), "bridge_gentle_stairs", var9, true));
            } else {
               var11 = EndCityPieces.method36644(var5, EndCityPieces.method36643(var1, var11, new BlockPos(0, var12, -4), "bridge_steep_stairs", var9, true));
            }

            var12 = 4;
         } else {
            var11 = EndCityPieces.method36644(var5, EndCityPieces.method36643(var1, var11, new BlockPos(0, var12, -4), "bridge_piece", var9, true));
            var12 = 0;
         }
      }

      if (!this.field34444 && var6.nextInt(10 - var2) == 0) {
         EndCityPieces.method36644(var5, EndCityPieces.method36643(var1, var11, new BlockPos(-8 + var6.nextInt(8), var12, -70 + var6.nextInt(10)), "ship", var9, true));
         this.field34444 = true;
      } else if (!EndCityPieces.method36646(var1, EndCityPieces.method36650(), var2 + 1, var11, new BlockPos(-3, var12 + 1, -11), var5, var6)) {
         return false;
      }

      var11 = EndCityPieces.method36644(var5, EndCityPieces.method36643(var1, var11, new BlockPos(4, var12, 0), "bridge_end", var9.method250(Rotation.field187), true));
      var11.field20448 = -1;
      return true;
   }
}
