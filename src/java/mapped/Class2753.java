package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.InfestedBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;

import java.util.Random;

public class Class2753 extends Class2595 {
   private static String[] field17291;
   private final SilverfishEntity field17292;
   private int field17293;

   public Class2753(SilverfishEntity var1) {
      this.field17292 = var1;
   }

   public void method10958() {
      if (this.field17293 == 0) {
         this.field17293 = 20;
      }
   }

   @Override
   public boolean method10803() {
      return this.field17293 > 0;
   }

   @Override
   public void method10805() {
      this.field17293--;
      if (this.field17293 <= 0) {
         World var3 = this.field17292.world;
         Random var4 = this.field17292.getRNG();
         BlockPos var5 = this.field17292.getPosition();

         for (int var6 = 0; var6 <= 5 && var6 >= -5; var6 = (var6 > 0 ? 0 : 1) - var6) {
            for (int var7 = 0; var7 <= 10 && var7 >= -10; var7 = (var7 > 0 ? 0 : 1) - var7) {
               for (int var8 = 0; var8 <= 10 && var8 >= -10; var8 = (var8 > 0 ? 0 : 1) - var8) {
                  BlockPos var9 = var5.add(var7, var6, var8);
                  BlockState var10 = var3.getBlockState(var9);
                  Block var11 = var10.getBlock();
                  if (var11 instanceof InfestedBlock) {
                     if (!var3.getGameRules().getBoolean(GameRules.field24224)) {
                        var3.setBlockState(var9, ((InfestedBlock)var11).method12118().getDefaultState(), 3);
                     } else {
                        var3.destroyBlock(var9, true, this.field17292);
                     }

                     if (var4.nextBoolean()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }
}
