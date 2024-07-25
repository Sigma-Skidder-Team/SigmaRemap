package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class class_3498 implements class_6142 {
   public static final Codec<class_3498> field_17161 = class_8669.field_44398.dispatchStable(class_3498::method_16088, Function.identity());
   public final Map<class_5390<?>, Boolean> field_17160 = Maps.newHashMap();
   public final Set<class_2522> field_17162 = Sets.newHashSet();
   public final List<class_6325> field_17159;

   public class_3498(Stream<Supplier<class_6325>> var1) {
      this(var1.map(Supplier::get).collect(ImmutableList.toImmutableList()));
   }

   public class_3498(List<class_6325> var1) {
      this.field_17159 = var1;
   }

   public abstract Codec<? extends class_3498> method_16088();

   public abstract class_3498 method_16083(long var1);

   public List<class_6325> method_16086() {
      return this.field_17159;
   }

   public Set<class_6325> method_16087(int var1, int var2, int var3, int var4) {
      int var7 = var1 - var4 >> 2;
      int var8 = var2 - var4 >> 2;
      int var9 = var3 - var4 >> 2;
      int var10 = var1 + var4 >> 2;
      int var11 = var2 + var4 >> 2;
      int var12 = var3 + var4 >> 2;
      int var13 = var10 - var7 + 1;
      int var14 = var11 - var8 + 1;
      int var15 = var12 - var9 + 1;
      HashSet var16 = Sets.newHashSet();

      for (int var17 = 0; var17 < var15; var17++) {
         for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < var14; var19++) {
               int var20 = var7 + var18;
               int var21 = var8 + var19;
               int var22 = var9 + var17;
               var16.add(this.method_28192(var20, var21, var22));
            }
         }
      }

      return var16;
   }

   @Nullable
   public class_1331 method_16085(int var1, int var2, int var3, int var4, Predicate<class_6325> var5, Random var6) {
      return this.method_16084(var1, var2, var3, var4, 1, var5, var6, false);
   }

   @Nullable
   public class_1331 method_16084(int var1, int var2, int var3, int var4, int var5, Predicate<class_6325> var6, Random var7, boolean var8) {
      int var11 = var1 >> 2;
      int var12 = var3 >> 2;
      int var13 = var4 >> 2;
      int var14 = var2 >> 2;
      class_1331 var15 = null;
      int var16 = 0;
      int var17 = !var8 ? var13 : 0;
      int var18 = var17;

      while (var18 <= var13) {
         for (int var19 = -var18; var19 <= var18; var19 += var5) {
            boolean var20 = Math.abs(var19) == var18;

            for (int var21 = -var18; var21 <= var18; var21 += var5) {
               if (var8) {
                  boolean var22 = Math.abs(var21) == var18;
                  if (!var22 && !var20) {
                     continue;
                  }
               }

               int var24 = var11 + var21;
               int var23 = var12 + var19;
               if (var6.test(this.method_28192(var24, var14, var23))) {
                  if (var15 == null || var7.nextInt(var16 + 1) == 0) {
                     var15 = new class_1331(var24 << 2, var2, var23 << 2);
                     if (var8) {
                        return var15;
                     }
                  }

                  var16++;
               }
            }
         }

         var18 += var5;
      }

      return var15;
   }

   public boolean method_16090(class_5390<?> var1) {
      return this.field_17160.computeIfAbsent(var1, var1x -> this.field_17159.stream().anyMatch(var1xx -> var1xx.method_28875().method_9458(var1x)));
   }

   public Set<class_2522> method_16089() {
      if (this.field_17162.isEmpty()) {
         for (class_6325 var4 : this.field_17159) {
            this.field_17162.add(var4.method_28875().method_9460().method_19215());
         }
      }

      return this.field_17162;
   }

   static {
      class_8669.<Codec<? extends class_3498>>method_39791(class_8669.field_44398, "fixed", class_2136.field_10714);
      class_8669.<Codec<? extends class_3498>>method_39791(class_8669.field_44398, "multi_noise", class_7258.field_37188);
      class_8669.<Codec<? extends class_3498>>method_39791(class_8669.field_44398, "checkerboard", class_9369.field_47905);
      class_8669.<Codec<? extends class_3498>>method_39791(class_8669.field_44398, "vanilla_layered", class_3925.field_19065);
      class_8669.<Codec<? extends class_3498>>method_39791(class_8669.field_44398, "the_end", class_8627.field_44259);
   }
}
