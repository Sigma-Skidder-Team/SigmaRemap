package mapped;

import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Util;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.chunk.IChunk;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class Heightmap {
   private static String[] field32307;
   private static final Predicate<BlockState> field32308 = var0 -> !var0.isAir();
   private static final Predicate<BlockState> field32309 = var0 -> var0.getMaterial().blocksMovement();
   private final Class7776 field32310 = new Class7776(9, 256);
   private final Predicate<BlockState> field32311;
   private final IChunk field32312;

   public Heightmap(IChunk var1, Type var2) {
      this.field32311 = var2.method287();
      this.field32312 = var1;
   }

   public static void method24577(IChunk var0, Set<Type> var1) {
      int var4 = var1.size();
      ObjectArrayList var5 = new ObjectArrayList(var4);
      ObjectListIterator var6 = var5.iterator();
      int var7 = var0.getTopFilledSegment() + 16;
      BlockPos.Mutable var8 = new BlockPos.Mutable();

      for (int var9 = 0; var9 < 16; var9++) {
         for (int var10 = 0; var10 < 16; var10++) {
            for (Type var12 : var1) {
               var5.add(var0.getHeightmap(var12));
            }

            for (int var14 = var7 - 1; var14 >= 0; var14--) {
               var8.setPos(var9, var14, var10);
               BlockState var15 = var0.getBlockState(var8);
               if (!var15.isIn(Blocks.AIR)) {
                  while (var6.hasNext()) {
                     Heightmap var13 = (Heightmap)var6.next();
                     if (var13.field32311.test(var15)) {
                        var13.method24581(var9, var10, var14 + 1);
                        var6.remove();
                     }
                  }

                  if (var5.isEmpty()) {
                     break;
                  }

                  var6.back(var4);
               }
            }
         }
      }
   }

   public boolean method24578(int var1, int var2, int var3, BlockState var4) {
      int var7 = this.getHeight(var1, var3);
      if (var2 <= var7 - 2) {
         return false;
      } else {
         if (!this.field32311.test(var4)) {
            if (var7 - 1 == var2) {
               BlockPos.Mutable var8 = new BlockPos.Mutable();

               for (int var9 = var2 - 1; var9 >= 0; var9--) {
                  var8.setPos(var1, var9, var3);
                  if (this.field32311.test(this.field32312.getBlockState(var8))) {
                     this.method24581(var1, var3, var9 + 1);
                     return true;
                  }
               }

               this.method24581(var1, var3, 0);
               return true;
            }
         } else if (var2 >= var7) {
            this.method24581(var1, var3, var2 + 1);
            return true;
         }

         return false;
      }
   }

   public int getHeight(int var1, int var2) {
      return this.getHeight(getDataArrayIndex(var1, var2));
   }

   private int getHeight(int var1) {
      return this.field32310.method25762(var1);
   }

   private void method24581(int var1, int var2, int var3) {
      this.field32310.method25761(getDataArrayIndex(var1, var2), var3);
   }

   public void method24582(long[] var1) {
      System.arraycopy(var1, 0, this.field32310.method25763(), 0, var1.length);
   }

   public long[] method24583() {
      return this.field32310.method25763();
   }

   private static int getDataArrayIndex(int var0, int var1) {
      return var0 + var1 * 16;
   }

   // $VF: synthetic method
   public static Predicate method24587() {
      return field32308;
   }

   // $VF: synthetic method
   public static Predicate method24588() {
      return field32309;
   }

   public enum Type implements IStringSerializable {
      WORLD_SURFACE_WG("WORLD_SURFACE_WG", Class2029.field13170, method24587()),
      WORLD_SURFACE("WORLD_SURFACE", Class2029.field13172, method24587()),
      OCEAN_FLOOR_WG("OCEAN_FLOOR_WG", Class2029.field13170, method24588()),
      OCEAN_FLOOR("OCEAN_FLOOR", Class2029.field13171, method24588()),
      MOTION_BLOCKING("MOTION_BLOCKING", Class2029.field13172, var0 -> var0.getMaterial().blocksMovement() || !var0.getFluidState().isEmpty()),
      MOTION_BLOCKING_NO_LEAVES(
         "MOTION_BLOCKING_NO_LEAVES",
         Class2029.field13171,
         var0 -> (var0.getMaterial().blocksMovement() || !var0.getFluidState().isEmpty()) && !(var0.getBlock() instanceof Class3465)
      );

      public static final Codec<Type> field301 = IStringSerializable.<Type>createEnumCodec(Type::values, Type::method286);
      private final String field302;
      private final Class2029 field303;
      private final Predicate<BlockState> field304;
      private static final Map<String, Type> field305 = Util.<Map<String, Type>>make(Maps.newHashMap(), var0 -> {
         for (Type var6 : values()) {
            var0.put(var6.field302, var6);
         }
      });
      private static final Type[] field306 = new Type[]{WORLD_SURFACE_WG, WORLD_SURFACE, OCEAN_FLOOR_WG, OCEAN_FLOOR, MOTION_BLOCKING, MOTION_BLOCKING_NO_LEAVES};

      private Type(String var3, Class2029 var4, Predicate<BlockState> var5) {
         this.field302 = var3;
         this.field303 = var4;
         this.field304 = var5;
      }

      public String method283() {
         return this.field302;
      }

      public boolean method284() {
         return this.field303 == Class2029.field13172;
      }

      public boolean isUsageClient() {
         return this.field303 != Class2029.field13170;
      }

      @Nullable
      public static Type method286(String var0) {
         return field305.get(var0);
      }

      public Predicate<BlockState> method287() {
         return this.field304;
      }

      @Override
      public String getString() {
         return this.field302;
      }
   }
}
