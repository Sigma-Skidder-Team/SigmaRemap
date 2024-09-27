package mapped;

import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Stream;
import javax.annotation.Nullable;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.server.ServerWorld;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Class8170 {
   private static final Logger field35149 = LogManager.getLogger();
   private static final int field35150 = (int)Math.pow(17.0, 2.0);
   private static final Class179[] field35151 = Stream.<Class179>of(Class179.values())
      .filter(var0 -> var0 != Class179.field628)
      .<Class179>toArray(Class179[]::new);

   public static Class7307 method28415(int var0, Iterable<Entity> var1, Class8629 var2) {
      Class7672 var5 = new Class7672();
      Object2IntOpenHashMap var6 = new Object2IntOpenHashMap();

      for (Entity var8 : var1) {
         if (var8 instanceof MobEntity) {
            MobEntity var9 = (MobEntity)var8;
            if (var9.method4282() || var9.method4255()) {
               continue;
            }
         }

         Class179 var11 = var8.getType().method33209();
         if (var11 != Class179.field628) {
            BlockPos var12 = var8.getPosition();
            long var13 = ChunkPos.asLong(var12.getX() >> 4, var12.getZ() >> 4);
            var2.method30928(var13, var5x -> {
               Class7763 var8x = method28416(var12, var5x).method32499().method31969(var8.getType());
               if (var8x != null) {
                  var5.method25204(var8.getPosition(), var8x.method25733());
               }

               var6.addTo(var11, 1);
            });
         }
      }

      return new Class7307(var0, var6, var5);
   }

   private static Biome method28416(BlockPos var0, IChunk var1) {
      return Class1962.field12770.getBiome(0L, var0.getX(), var0.getY(), var0.getZ(), var1.getBiomes());
   }

   public static void method28417(ServerWorld var0, Chunk var1, Class7307 var2, boolean var3, boolean var4, boolean var5) {
      var0.getProfiler().startSection("spawner");

      for (Class179 var11 : field35151) {
         if ((var3 || !var11.method520()) && (var4 || var11.method520()) && (var5 || !var11.method521()) && Class7307.method23093(var2, var11)) {
            method28418(
               var11,
               var0,
               var1,
               (var1x, var2x, var3x) -> Class7307.method23095(var2, var1x, var2x, var3x),
               (var1x, var2x) -> Class7307.method23094(var2, var1x, var2x)
            );
         }
      }

      var0.getProfiler().endSection();
   }

   public static void method28418(Class179 var0, ServerWorld var1, Chunk var2, Class8145 var3, Class8940 var4) {
      BlockPos var7 = method28427(var1, var2);
      if (var7.getY() >= 1) {
         method28419(var0, var1, var2, var7, var3, var4);
      }
   }

   public static void method28419(Class179 var0, ServerWorld var1, IChunk var2, BlockPos var3, Class8145 var4, Class8940 var5) {
      Class7480 var8 = var1.method6893();
      ChunkGenerator var9 = var1.getChunkProvider().method7370();
      int var10 = var3.getY();
      BlockState var11 = var2.getBlockState(var3);
      if (!var11.method23400(var2, var3)) {
         BlockPos.Mutable var12 = new BlockPos.Mutable();
         int var13 = 0;

         for (int var14 = 0; var14 < 3; var14++) {
            int var15 = var3.getX();
            int var16 = var3.getZ();
            byte var17 = 6;
            Class6692 var18 = null;
            Class5093 var19 = null;
            int var20 = MathHelper.ceil(var1.rand.nextFloat() * 4.0F);
            int var21 = 0;

            for (int var22 = 0; var22 < var20; var22++) {
               var15 += var1.rand.nextInt(6) - var1.rand.nextInt(6);
               var16 += var1.rand.nextInt(6) - var1.rand.nextInt(6);
               var12.method8372(var15, var10, var16);
               double var23 = (double)var15 + 0.5;
               double var25 = (double)var16 + 0.5;
               PlayerEntity var27 = var1.method7186(var23, (double)var10, var25, -1.0, false);
               if (var27 != null) {
                  double var28 = var27.getDistanceNearest(var23, (double)var10, var25);
                  if (method28420(var1, var2, var12, var28)) {
                     if (var18 == null) {
                        var18 = method28424(var1, var8, var9, var0, var1.rand, var12);
                        if (var18 == null) {
                           break;
                        }

                        var20 = var18.field29312 + var1.rand.nextInt(1 + var18.field29313 - var18.field29312);
                     }

                     if (method28421(var1, var0, var8, var9, var18, var12, var28) && var4.method28251(var18.field29311, var12, var2)) {
                        MobEntity var30 = method28422(var1, var18.field29311);
                        if (var30 == null) {
                           return;
                        }

                        var30.setLocationAndAngles(var23, (double)var10, var25, var1.rand.nextFloat() * 360.0F, 0.0F);
                        if (method28423(var1, var30, var28)) {
                           var19 = var30.method4276(var1, var1.method6807(var30.getPosition()), Class2202.field14391, var19, (CompoundNBT)null);
                           var13++;
                           var21++;
                           var1.method6995(var30);
                           var5.run(var30, var2);
                           if (var13 >= var30.method4267()) {
                              return;
                           }

                           if (var30.method4268(var21)) {
                              break;
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private static boolean method28420(ServerWorld var0, IChunk var1, BlockPos.Mutable var2, double var3) {
      if (!(var3 <= 576.0)) {
         if (var0.method6947().method8317(new Vector3d((double)var2.getX() + 0.5, (double)var2.getY(), (double)var2.getZ() + 0.5), 24.0)) {
            return false;
         } else {
            ChunkPos var7 = new ChunkPos(var2);
            return Objects.equals(var7, var1.getPos()) || var0.getChunkProvider().method7352(var7);
         }
      } else {
         return false;
      }
   }

   private static boolean method28421(ServerWorld var0, Class179 var1, Class7480 var2, ChunkGenerator var3, Class6692 var4, BlockPos.Mutable var5, double var6) {
      EntityType var10 = var4.field29311;
      if (var10.method33209() != Class179.field628) {
         if (!var10.method33208() && var6 > (double)(var10.method33209().method522() * var10.method33209().method522())) {
            return false;
         } else if (var10.method33206() && method28425(var0, var2, var3, var1, var4, var5)) {
            Class2068 var11 = Class6914.method21120(var10);
            if (!method28429(var11, var0, var5, var10)) {
               return false;
            } else {
               return Class6914.method21122(var10, var0, Class2202.field14391, var5, var0.rand)
                  ? var0.hasNoCollisions(var10.method33219((double)var5.getX() + 0.5, (double)var5.getY(), (double)var5.getZ() + 0.5))
                  : false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Nullable
   private static MobEntity method28422(ServerWorld var0, EntityType<?> var1) {
      try {
         Entity var4 = var1.create(var0);
         if (!(var4 instanceof MobEntity)) {
            throw new IllegalStateException("Trying to spawn a non-mob: " + Registry.ENTITY_TYPE.getKey(var1));
         } else {
            return (MobEntity)var4;
         }
      } catch (Exception var5) {
         field35149.warn("Failed to create mob", var5);
         return null;
      }
   }

   private static boolean method28423(ServerWorld var0, MobEntity var1, double var2) {
      return var2 > (double)(var1.getType().method33209().method522() * var1.getType().method33209().method522()) && var1.method4254(var2)
         ? false
         : var1.method4265(var0, Class2202.field14391) && var1.method4266(var0);
   }

   @Nullable
   private static Class6692 method28424(ServerWorld var0, Class7480 var1, ChunkGenerator var2, Class179 var3, Random var4, BlockPos var5) {
      Biome var8 = var0.getBiome(var5);
      if (var3 == Class179.field627 && var8.getCategory() == Class100.RIVER && var4.nextFloat() < 0.98F) {
         return null;
      } else {
         List var9 = method28426(var0, var1, var2, var3, var5, var8);
         return !var9.isEmpty() ? Class8879.<Class6692>method32314(var4, var9) : null;
      }
   }

   private static boolean method28425(ServerWorld var0, Class7480 var1, ChunkGenerator var2, Class179 var3, Class6692 var4, BlockPos var5) {
      return method28426(var0, var1, var2, var3, var5, (Biome)null).contains(var4);
   }

   private static List<Class6692> method28426(ServerWorld var0, Class7480 var1, ChunkGenerator var2, Class179 var3, BlockPos var4, Biome var5) {
      return var3 == Class179.field623
            && var0.getBlockState(var4.down()).getBlock() == Blocks.NETHER_BRICKS
            && var1.method24345(var4, false, Structure.field18070).method17117()
         ? Structure.field18070.method11374()
         : var2.method17808(var5 == null ? var0.getBiome(var4) : var5, var1, var3, var4);
   }

   private static BlockPos method28427(World var0, Chunk var1) {
      ChunkPos var4 = var1.getPos();
      int var5 = var4.getX() + var0.rand.nextInt(16);
      int var6 = var4.getZ() + var0.rand.nextInt(16);
      int var7 = var1.getTopBlockY(Heightmap.Type.field296, var5, var6) + 1;
      int var8 = var0.rand.nextInt(var7 + 1);
      return new BlockPos(var5, var8, var6);
   }

   public static boolean method28428(IBlockReader var0, BlockPos var1, BlockState var2, FluidState var3, EntityType<?> var4) {
      if (!var2.method23456(var0, var1)) {
         if (!var2.method23401()) {
            if (var3.method23474()) {
               return !var2.isIn(BlockTags.field32811) ? !var4.method33220(var2) : false;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static boolean method28429(Class2068 var0, IWorldReader var1, BlockPos var2, EntityType<?> var3) {
      if (var0 == Class2068.field13474) {
         return true;
      } else if (var3 != null && var1.getWorldBorder().contains(var2)) {
         BlockState var6 = var1.getBlockState(var2);
         FluidState var7 = var1.getFluidState(var2);
         BlockPos var8 = var2.up();
         BlockPos var9 = var2.down();
         switch (Class8470.field36295[var0.ordinal()]) {
            case 1:
               return var7.method23486(FluidTags.field40469)
                  && var1.getFluidState(var9).method23486(FluidTags.field40469)
                  && !var1.getBlockState(var8).method23400(var1, var8);
            case 2:
               return var7.method23486(FluidTags.field40470);
            case 3:
            default:
               BlockState var10 = var1.getBlockState(var9);
               return !var10.method23385(var1, var9, var3)
                  ? false
                  : method28428(var1, var2, var6, var7, var3) && method28428(var1, var8, var1.getBlockState(var8), var1.getFluidState(var8), var3);
         }
      } else {
         return false;
      }
   }

   public static void method28430(Class1659 var0, Biome var1, int var2, int var3, Random var4) {
      Class8835 var7 = var1.method32499();
      List var8 = var7.method31968(Class179.field624);
      if (!var8.isEmpty()) {
         int var9 = var2 << 4;
         int var10 = var3 << 4;

         while (var4.nextFloat() < var7.method31970()) {
            Class6692 var11 = Class8879.<Class6692>method32314(var4, var8);
            int var12 = var11.field29312 + var4.nextInt(1 + var11.field29313 - var11.field29312);
            Class5093 var13 = null;
            int var14 = var9 + var4.nextInt(16);
            int var15 = var10 + var4.nextInt(16);
            int var16 = var14;
            int var17 = var15;

            for (int var18 = 0; var18 < var12; var18++) {
               boolean var19 = false;

               for (int var20 = 0; !var19 && var20 < 4; var20++) {
                  BlockPos var21 = method28431(var0, var11.field29311, var14, var15);
                  if (var11.field29311.method33206() && method28429(Class6914.method21120(var11.field29311), var0, var21, var11.field29311)) {
                     float var22 = var11.field29311.method33213();
                     double var23 = MathHelper.clamp((double)var14, (double)var9 + (double)var22, (double)var9 + 16.0 - (double)var22);
                     double var25 = MathHelper.clamp((double)var15, (double)var10 + (double)var22, (double)var10 + 16.0 - (double)var22);
                     if (!var0.hasNoCollisions(var11.field29311.method33219(var23, (double)var21.getY(), var25))
                        || !Class6914.method21122(
                           var11.field29311, var0, Class2202.field14392, new BlockPos(var23, (double)var21.getY(), var25), var0.method6814()
                        )) {
                        continue;
                     }

                     Entity var27;
                     try {
                        var27 = var11.field29311.create(var0.method6970());
                     } catch (Exception var29) {
                        field35149.warn("Failed to create mob", var29);
                        continue;
                     }

                     var27.setLocationAndAngles(var23, (double)var21.getY(), var25, var4.nextFloat() * 360.0F, 0.0F);
                     if (var27 instanceof MobEntity) {
                        MobEntity var28 = (MobEntity)var27;
                        if (var28.method4265(var0, Class2202.field14392) && var28.method4266(var0)) {
                           var13 = var28.method4276(var0, var0.method6807(var28.getPosition()), Class2202.field14392, var13, (CompoundNBT)null);
                           var0.method6995(var28);
                           var19 = true;
                        }
                     }
                  }

                  var14 += var4.nextInt(5) - var4.nextInt(5);

                  for (var15 += var4.nextInt(5) - var4.nextInt(5);
                     var14 < var9 || var14 >= var9 + 16 || var15 < var10 || var15 >= var10 + 16;
                     var15 = var17 + var4.nextInt(5) - var4.nextInt(5)
                  ) {
                     var14 = var16 + var4.nextInt(5) - var4.nextInt(5);
                  }
               }
            }
         }
      }
   }

   private static BlockPos method28431(IWorldReader var0, EntityType<?> var1, int var2, int var3) {
      int var6 = var0.method6736(Class6914.method21121(var1), var2, var3);
      BlockPos.Mutable var7 = new BlockPos.Mutable(var2, var6, var3);
      if (var0.method6812().getHasCeiling()) {
         do {
            var7.method8379(Direction.DOWN);
         } while (!var0.getBlockState(var7).isAir());

         do {
            var7.method8379(Direction.DOWN);
         } while (var0.getBlockState(var7).isAir() && var7.getY() > 0);
      }

      if (Class6914.method21120(var1) == Class2068.field13472) {
         BlockPos var8 = var7.down();
         if (var0.getBlockState(var8).method23440(var0, var8, Class1947.field12614)) {
            return var8;
         }
      }

      return var7.toImmutable();
   }

   // $VF: synthetic method
   public static Biome method28437(BlockPos var0, IChunk var1) {
      return method28416(var0, var1);
   }

   // $VF: synthetic method
   public static int method28438() {
      return field35150;
   }
}
