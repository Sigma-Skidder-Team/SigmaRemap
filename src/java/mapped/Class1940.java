package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

import java.util.List;
import java.util.Random;

public enum Class1940 {
   field12604 {
      @Override
      public void method8204(ServerWorld var1, Class7819 var2, List<EnderCrystalEntity> var3, int var4, BlockPos var5) {
         BlockPos var8 = new BlockPos(0, 128, 0);

         for (EnderCrystalEntity var10 : var3) {
            var10.method4142(var8);
         }

         var2.method26113(field12605);
      }
   },
   field12605 {
      @Override
      public void method8204(ServerWorld var1, Class7819 var2, List<EnderCrystalEntity> var3, int var4, BlockPos var5) {
         if (var4 >= 100) {
            var2.method26113(field12606);
         } else if (var4 == 0 || var4 == 50 || var4 == 51 || var4 == 52 || var4 >= 95) {
            var1.playEvent(3001, new BlockPos(0, 128, 0), 0);
         }
      }
   },
   field12606 {
      @Override
      public void method8204(ServerWorld var1, Class7819 var2, List<EnderCrystalEntity> var3, int var4, BlockPos var5) {
         byte var8 = 40;
         boolean var9 = var4 % 40 == 0;
         boolean var10 = var4 % 40 == 39;
         if (var9 || var10) {
            List var11 = Class2944.method11286(var1);
            int var12 = var4 / 40;
            if (var12 >= var11.size()) {
               if (var9) {
                  var2.method26113(field12607);
               }
            } else {
               Class9648 var13 = (Class9648)var11.get(var12);
               if (!var9) {
                  byte var14 = 10;

                  for (BlockPos var16 : BlockPos.method8359(
                          new BlockPos(var13.method37626() - 10, var13.method37629() - 10, var13.method37627() - 10),
                          new BlockPos(var13.method37626() + 10, var13.method37629() + 10, var13.method37627() + 10)
                  )) {
                     var1.removeBlock(var16, false);
                  }

                  var1.method6755(
                          (Entity)null,
                          (double)((float)var13.method37626() + 0.5F),
                          (double)var13.method37629(),
                          (double)((float)var13.method37627() + 0.5F),
                          5.0F,
                          Class2141.field14016
                  );
                  Class4707 var18 = new Class4707(true, ImmutableList.of(var13), new BlockPos(0, 128, 0));
                  Class2898.field17962
                          .method11216(var18)
                          .method26521(var1, var1.getChunkProvider().method7370(), new Random(), new BlockPos(var13.method37626(), 45, var13.method37627()));
               } else {
                  for (EnderCrystalEntity var19 : var3) {
                     var19.method4142(new BlockPos(var13.method37626(), var13.method37629() + 1, var13.method37627()));
                  }
               }
            }
         }
      }
   },
   field12607 {
      @Override
      public void method8204(ServerWorld var1, Class7819 var2, List<EnderCrystalEntity> var3, int var4, BlockPos var5) {
         if (var4 < 100) {
            if (var4 < 80) {
               if (var4 != 0) {
                  if (var4 < 5) {
                     var1.playEvent(3001, new BlockPos(0, 128, 0), 0);
                  }
               } else {
                  for (EnderCrystalEntity var9 : var3) {
                     var9.method4142(new BlockPos(0, 128, 0));
                  }
               }
            } else {
               var1.playEvent(3001, new BlockPos(0, 128, 0), 0);
            }
         } else {
            var2.method26113(field12608);
            var2.method26130();

            for (EnderCrystalEntity var11 : var3) {
               var11.method4142((BlockPos)null);
               var1.method6755(var11, var11.getPosX(), var11.getPosY(), var11.getPosZ(), 6.0F, Class2141.field14014);
               var11.method2904();
            }
         }
      }
   },
   field12608 {
      @Override
      public void method8204(ServerWorld var1, Class7819 var2, List<EnderCrystalEntity> var3, int var4, BlockPos var5) {

      }
   };

   private static final Class1940[] field12609 = new Class1940[]{field12604, field12605, field12606, field12607, field12608};

   private Class1940() {
   }

   public abstract void method8204(ServerWorld var1, Class7819 var2, List<EnderCrystalEntity> var3, int var4, BlockPos var5);
}
