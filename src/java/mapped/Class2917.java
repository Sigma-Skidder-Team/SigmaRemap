package mapped;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.Util;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Class2917 extends Class2914 {
   public Class2917(Codec<Class4712> var1) {
      super(var1);
   }

   @Override
   public boolean method11249(Class1660 var1, Random var2, BlockPos var3, BlockState var4) {
      if (!this.method11250(var1, var2, var3, var4)) {
         return false;
      } else {
         Direction var7 = Class76.field161.method247(var2);
         int var8 = var2.nextInt(2) + 2;
         List<Direction> var9 = Lists.newArrayList(var7, var7.method537(), var7.method538());
         Collections.shuffle(var9, var2);

         for (Direction var11 : var9.subList(0, var8)) {
            BlockPos.Mutable var12 = var3.method8354();
            int var13 = var2.nextInt(2) + 1;
            var12.method8379(var11);
            Direction var15;
            int var16;
            if (var11 != var7) {
               var12.method8379(Direction.field673);
               Direction[] var14 = new Direction[]{var11, Direction.field673};
               var15 = Util.<Direction>method38518(var14, var2);
               var16 = var2.nextInt(3) + 3;
            } else {
               var15 = var7;
               var16 = var2.nextInt(3) + 2;
            }

            for (int var17 = 0; var17 < var13 && this.method11250(var1, var2, var12, var4); var17++) {
               var12.method8379(var15);
            }

            var12.method8379(var15.method536());
            var12.method8379(Direction.field673);

            for (int var18 = 0; var18 < var16; var18++) {
               var12.method8379(var7);
               if (!this.method11250(var1, var2, var12, var4)) {
                  break;
               }

               if (var2.nextFloat() < 0.25F) {
                  var12.method8379(Direction.field673);
               }
            }
         }

         return true;
      }
   }
}
