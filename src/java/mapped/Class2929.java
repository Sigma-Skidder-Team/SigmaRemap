package mapped;

import com.mojang.serialization.Codec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class Class2929 extends Class2898<Class4712> {
   private static final Logger field18002 = LogManager.getLogger();
   private static final EntityType<?>[] field18003 = new EntityType[]{EntityType.field41078, EntityType.field41107, EntityType.field41107, EntityType.field41085};
   private static final BlockState field18004 = Blocks.field37012.method11579();

   public Class2929(Codec<Class4712> var1) {
      super(var1);
   }

   public boolean method11213(Class1658 var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4712 var5) {
      byte var8 = 3;
      int var9 = var3.nextInt(2) + 2;
      int var10 = -var9 - 1;
      int var11 = var9 + 1;
      byte var12 = -1;
      byte var13 = 4;
      int var14 = var3.nextInt(2) + 2;
      int var15 = -var14 - 1;
      int var16 = var14 + 1;
      int var17 = 0;

      for (int var18 = var10; var18 <= var11; var18++) {
         for (int var19 = -1; var19 <= 4; var19++) {
            for (int var20 = var15; var20 <= var16; var20++) {
               BlockPos var21 = var4.method8336(var18, var19, var20);
               Class8649 var22 = var1.getBlockState(var21).method23384();
               boolean var23 = var22.method31086();
               if (var19 == -1 && !var23) {
                  return false;
               }

               if (var19 == 4 && !var23) {
                  return false;
               }

               if ((var18 == var10 || var18 == var11 || var20 == var15 || var20 == var16)
                  && var19 == 0
                  && var1.method7007(var21)
                  && var1.method7007(var21.up())) {
                  var17++;
               }
            }
         }
      }

      if (var17 >= 1 && var17 <= 5) {
         for (int var27 = var10; var27 <= var11; var27++) {
            for (int var30 = 3; var30 >= -1; var30--) {
               for (int var32 = var15; var32 <= var16; var32++) {
                  BlockPos var34 = var4.method8336(var27, var30, var32);
                  BlockState var36 = var1.getBlockState(var34);
                  if (var27 != var10 && var30 != -1 && var32 != var15 && var27 != var11 && var30 != 4 && var32 != var16) {
                     if (!var36.method23448(Blocks.CHEST) && !var36.method23448(Blocks.field36532)) {
                        var1.setBlockState(var34, field18004, 2);
                     }
                  } else if (var34.getY() >= 0 && !var1.getBlockState(var34.down()).method23384().method31086()) {
                     var1.setBlockState(var34, field18004, 2);
                  } else if (var36.method23384().method31086() && !var36.method23448(Blocks.CHEST)) {
                     if (var30 == -1 && var3.nextInt(4) != 0) {
                        var1.setBlockState(var34, Blocks.field36526.method11579(), 2);
                     } else {
                        var1.setBlockState(var34, Blocks.field36399.method11579(), 2);
                     }
                  }
               }
            }
         }

         for (int var28 = 0; var28 < 2; var28++) {
            for (int var31 = 0; var31 < 3; var31++) {
               int var33 = var4.getX() + var3.nextInt(var9 * 2 + 1) - var9;
               int var35 = var4.getY();
               int var37 = var4.getZ() + var3.nextInt(var14 * 2 + 1) - var14;
               BlockPos var38 = new BlockPos(var33, var35, var37);
               if (var1.method7007(var38)) {
                  int var24 = 0;

                  for (Direction var26 : Class76.field161) {
                     if (var1.getBlockState(var38.method8349(var26)).method23384().method31086()) {
                        var24++;
                     }
                  }

                  if (var24 == 1) {
                     var1.setBlockState(var38, Class4178.method12934(var1, var38, Blocks.CHEST.method11579()), 2);
                     Class939.method3740(var1, var3, var38, Class8793.field39536);
                     break;
                  }
               }
            }
         }

         var1.setBlockState(var4, Blocks.field36532.method11579(), 2);
         TileEntity var29 = var1.getTileEntity(var4);
         if (!(var29 instanceof Class960)) {
            field18002.error("Failed to fetch mob spawner entity at ({}, {}, {})", var4.getX(), var4.getY(), var4.getZ());
         } else {
            ((Class960)var29).method3911().method24790(this.method11264(var3));
         }

         return true;
      } else {
         return false;
      }
   }

   private EntityType<?> method11264(Random var1) {
      return Util.<EntityType<?>>method38518(field18003, var1);
   }
}
