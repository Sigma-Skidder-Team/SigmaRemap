package mapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import net.minecraft.util.math.BlockPos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class Class9597 {
   private static String[] field44890;
   private final Class7176[] field44891 = new Class7176[32];
   private final int field44892;
   private final Class6764 field44893;
   private final Class8662 field44894 = new Class8662();

   public Class9597(Class6764 var1, int var2) {
      this.field44893 = var1;
      this.field44892 = var2;
   }

   @Nullable
   public Class8238 method37250(Class1667 var1, MobEntity var2, Set<BlockPos> var3, float var4, int var5, float var6) {
      this.field44894.method31191();
      this.field44893.method20613(var1, var2);
      Class7176 var9 = this.field44893.method20615();
      Map var10 = var3.stream()
         .collect(
            Collectors.toMap(
               var1x -> this.field44893.method20616((double)var1x.getX(), (double)var1x.getY(), (double)var1x.getZ()),
               Function.<BlockPos>identity()
            )
         );
      Class8238 var11 = this.method37251(var9, var10, var4, var5, var6);
      this.field44893.method20614();
      return var11;
   }

   @Nullable
   private Class8238 method37251(Class7176 var1, Map<Class7175, BlockPos> var2, float var3, int var4, float var5) {
      Set<Class7175> var8 = var2.keySet();
      var1.field30852 = 0.0F;
      var1.field30853 = this.method37252(var1, var8);
      var1.field30854 = var1.field30853;
      this.field44894.method31191();
      this.field44894.method31190(var1);
      ImmutableSet var9 = ImmutableSet.of();
      int var10 = 0;
      Set<Class7175> var11 = Sets.newHashSetWithExpectedSize(var8.size());
      int var12 = (int)((float)this.field44892 * var5);

      while (!this.field44894.method31196()) {
         if (++var10 >= var12) {
            break;
         }

         Class7176 var13 = this.field44894.method31192();
         var13.field30856 = true;

         for (Class7175 var15 : var8) {
            if (var13.method22529(var15) <= (float)var4) {
               var15.method22523();
               var11.add(var15);
            }
         }

         if (!var11.isEmpty()) {
            break;
         }

         if (!(var13.method22527(var1) >= var3)) {
            int var20 = this.field44893.method20617(this.field44891, var13);

            for (int var21 = 0; var21 < var20; var21++) {
               Class7176 var16 = this.field44891[var21];
               float var17 = var13.method22527(var16);
               var16.field30857 = var13.field30857 + var17;
               float var18 = var13.field30852 + var17 + var16.field30858;
               if (var16.field30857 < var3 && (!var16.method22532() || var18 < var16.field30852)) {
                  var16.field30855 = var13;
                  var16.field30852 = var18;
                  var16.field30853 = this.method37252(var16, var8) * 1.5F;
                  if (!var16.method22532()) {
                     var16.field30854 = var16.field30852 + var16.field30853;
                     this.field44894.method31190(var16);
                  } else {
                     this.field44894.method31193(var16, var16.field30852 + var16.field30853);
                  }
               }
            }
         }
      }

      Optional var19 = var11.isEmpty()
         ? var8.stream()
            .map(var2x -> this.method37253(var2x.method22522(), (BlockPos)var2.get(var2x), false))
            .min(Comparator.comparingDouble(Class8238::method28713).thenComparingInt(Class8238::method28698))
         : var11.stream()
            .map(var2x -> this.method37253(var2x.method22522(), (BlockPos)var2.get(var2x), true))
            .min(Comparator.comparingInt(Class8238::method28698));
      return var19.isPresent() ? (Class8238)var19.get() : null;
   }

   private float method37252(Class7176 var1, Set<Class7175> var2) {
      float var5 = Float.MAX_VALUE;

      for (Class7175 var7 : var2) {
         float var8 = var1.method22527(var7);
         var7.method22521(var8, var1);
         var5 = Math.min(var8, var5);
      }

      return var5;
   }

   private Class8238 method37253(Class7176 var1, BlockPos var2, boolean var3) {
      ArrayList var6 = Lists.newArrayList();
      Class7176 var7 = var1;
      var6.add(0, var1);

      while (var7.field30855 != null) {
         var7 = var7.field30855;
         var6.add(0, var7);
      }

      return new Class8238(var6, var2, var3);
   }
}
