package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class class_2987 extends class_6127<class_5834> {
   private static String[] field_14690;

   @Override
   public Set<class_6044<?>> method_28152() {
      return ImmutableSet.of(
         class_6044.field_30901,
         class_6044.field_30907,
         class_6044.field_30891,
         class_6044.field_30904,
         class_6044.field_30911,
         class_6044.field_30873,
         new class_6044[]{
            class_6044.field_30914, class_6044.field_30902, class_6044.field_30876, class_6044.field_30878, class_6044.field_30906, class_6044.field_30905
         }
      );
   }

   @Override
   public void method_28154(class_6331 var1, class_5834 var2) {
      class_1150 var5 = var2.method_26525();
      var5.method_5106(class_6044.field_30905, method_13673(var1, var2));
      Optional var6 = Optional.empty();
      Optional var7 = Optional.empty();
      Optional var8 = Optional.empty();
      Optional var9 = Optional.empty();
      Optional var10 = Optional.empty();
      Optional var11 = Optional.empty();
      Optional var12 = Optional.empty();
      int var13 = 0;
      ArrayList var14 = Lists.newArrayList();
      ArrayList var15 = Lists.newArrayList();

      for (class_5834 var17 : var5.<List<class_5834>>method_5138(class_6044.field_30901).orElse(ImmutableList.of())) {
         if (!(var17 instanceof class_6704)) {
            if (!(var17 instanceof class_7263)) {
               if (!(var17 instanceof class_2599)) {
                  if (!(var17 instanceof PlayerEntity)) {
                     if (var6.isPresent() || !(var17 instanceof class_3204) && !(var17 instanceof class_4653)) {
                        if (!var10.isPresent() && class_134.method_466(var17.method_37387())) {
                           var10 = Optional.<class_5834>of(var17);
                        }
                     } else {
                        var6 = Optional.<class_5834>of((class_5886)var17);
                     }
                  } else {
                     PlayerEntity var22 = (PlayerEntity)var17;
                     if (!var11.isPresent() && class_3572.field_17480.test(var17) && !class_134.method_500(var22)) {
                        var11 = Optional.<PlayerEntity>of(var22);
                     }

                     if (!var12.isPresent() && !var22.method_37221() && class_134.method_512(var22)) {
                        var12 = Optional.<PlayerEntity>of(var22);
                     }
                  }
               } else {
                  class_2599 var21 = (class_2599)var17;
                  if (var21.method_26449() && !var9.isPresent()) {
                     var9 = Optional.<class_2599>of(var21);
                  } else if (var21.method_31995()) {
                     var14.add(var21);
                  }
               }
            } else {
               var14.add((class_7263)var17);
            }
         } else {
            class_6704 var18 = (class_6704)var17;
            if (var18.method_26449() && !var8.isPresent()) {
               var8 = Optional.<class_6704>of(var18);
            } else if (var18.method_30714()) {
               var13++;
               if (!var7.isPresent() && var18.method_30707()) {
                  var7 = Optional.<class_6704>of(var18);
               }
            }
         }
      }

      for (class_5834 var20 : var5.<List<class_5834>>method_5138(class_6044.field_30907).orElse(ImmutableList.of())) {
         if (var20 instanceof class_6993 && ((class_6993)var20).method_31995()) {
            var15.add((class_6993)var20);
         }
      }

      var5.method_5106(class_6044.field_30891, var6);
      var5.method_5106(class_6044.field_30873, var7);
      var5.method_5106(class_6044.field_30914, var8);
      var5.method_5106(class_6044.field_30908, var10);
      var5.method_5106(class_6044.field_30904, var11);
      var5.method_5106(class_6044.field_30911, var12);
      var5.method_5105(class_6044.field_30876, var15);
      var5.method_5105(class_6044.field_30902, var14);
      var5.method_5105(class_6044.field_30878, var14.size());
      var5.method_5105(class_6044.field_30906, var13);
   }

   private static Optional<BlockPos> method_13673(class_6331 var0, class_5834 var1) {
      return BlockPos.method_6102(var1.method_37075(), 8, 4, var1x -> method_13672(var0, var1x));
   }

   private static boolean method_13672(class_6331 var0, BlockPos var1) {
      class_2522 var4 = var0.method_28262(var1);
      boolean var5 = var4.method_8349(class_2351.field_11808);
      return var5 && var4.method_8350(class_4783.field_23511) ? class_8474.method_39004(var4) : var5;
   }
}
