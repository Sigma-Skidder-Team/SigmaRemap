package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public abstract class class_7149 {
   public static final class_7149 field_36826 = new class_1630("default");
   private static final class_7149 field_36825 = new class_8637("flat");
   private static final class_7149 field_36821 = new class_9714("large_biomes");
   public static final class_7149 field_36818 = new class_8517("amplified");
   private static final class_7149 field_36819 = new class_386("single_biome_surface");
   private static final class_7149 field_36827 = new class_7935("single_biome_caves");
   private static final class_7149 field_36823 = new class_2628("single_biome_floating_islands");
   private static final class_7149 field_36820 = new class_9689("debug_all_block_states");
   public static final List<class_7149> field_36824 = Lists.newArrayList(
      new class_7149[]{field_36826, field_36825, field_36821, field_36818, field_36819, field_36827, field_36823, field_36820}
   );
   public static final Map<Optional<class_7149>, class_2876> field_36822 = ImmutableMap.of(
      Optional.<class_7149>of(field_36825),
      (class_2876)(var0, var1) -> {
         class_6541 var4 = var1.method_13300();
         return new class_9675(
            var0,
            var2 -> var0.field_33523
                  .method_3065(
                     new class_2904(
                        var1.method_13295(),
                        var1.method_13287(),
                        var1.method_13293(),
                        class_2904.method_13292(
                           var0.field_33523.method_3062().<class_8760>method_28813(class_8669.field_44415), var1.method_13296(), new class_6463(var2)
                        )
                     )
                  ),
            !(var4 instanceof class_6463)
               ? class_9512.method_43900(var0.field_33523.method_3062().<class_6325>method_28813(class_8669.field_44359))
               : ((class_6463)var4).method_29443()
         );
      },
      Optional.<class_7149>of(field_36819),
      (class_2876)(var0, var1) -> new class_9336(
            var0,
            var0.field_33523.method_3062(),
            var2 -> var0.field_33523.method_3065(method_32811(var0.field_33523.method_3062(), var1, field_36819, var2)),
            method_32814(var0.field_33523.method_3062(), var1)
         ),
      Optional.<class_7149>of(field_36827),
      (class_2876)(var0, var1) -> new class_9336(
            var0,
            var0.field_33523.method_3062(),
            var2 -> var0.field_33523.method_3065(method_32811(var0.field_33523.method_3062(), var1, field_36827, var2)),
            method_32814(var0.field_33523.method_3062(), var1)
         ),
      Optional.<class_7149>of(field_36823),
      (class_2876)(var0, var1) -> new class_9336(
            var0,
            var0.field_33523.method_3062(),
            var2 -> var0.field_33523.method_3065(method_32811(var0.field_33523.method_3062(), var1, field_36823, var2)),
            method_32814(var0.field_33523.method_3062(), var1)
         )
   );
   private final ITextComponent field_36817;

   private class_7149(String var1) {
      this.field_36817 = new TranslationTextComponent("generator." + var1);
   }

   private static class_2904 method_32811(class_6322 var0, class_2904 var1, class_7149 var2, class_6325 var3) {
      class_2136 var6 = new class_2136(var3);
      class_6433 var7 = var0.<class_8760>method_28813(class_8669.field_44415);
      class_6433 var8 = var0.<class_7902>method_28813(class_8669.field_44360);
      Supplier var9;
      if (var2 != field_36827) {
         if (var2 != field_36823) {
            var9 = () -> var8.method_39807(class_7902.field_40411);
         } else {
            var9 = () -> var8.method_39807(class_7902.field_40402);
         }
      } else {
         var9 = () -> var8.method_39807(class_7902.field_40408);
      }

      return new class_2904(
         var1.method_13295(),
         var1.method_13287(),
         var1.method_13293(),
         class_2904.method_13292(var7, var1.method_13296(), new class_322(var6, var1.method_13295(), var9))
      );
   }

   private static class_6325 method_32814(class_6322 var0, class_2904 var1) {
      return var1.method_13300()
         .method_29817()
         .method_16086()
         .stream()
         .findFirst()
         .orElse(var0.<class_6325>method_28813(class_8669.field_44359).method_39807(class_8606.field_44136));
   }

   public static Optional<class_7149> method_32812(class_2904 var0) {
      class_6541 var3 = var0.method_13300();
      if (!(var3 instanceof class_6463)) {
         return !(var3 instanceof class_8510) ? Optional.<class_7149>empty() : Optional.<class_7149>of(field_36820);
      } else {
         return Optional.<class_7149>of(field_36825);
      }
   }

   public ITextComponent method_32809() {
      return this.field_36817;
   }

   public class_2904 method_32810(class_7522 var1, long var2, boolean var4, boolean var5) {
      class_6433 var8 = var1.<class_6325>method_28813(class_8669.field_44359);
      class_6433 var9 = var1.<class_8760>method_28813(class_8669.field_44415);
      class_6433 var10 = var1.<class_7902>method_28813(class_8669.field_44360);
      return new class_2904(
         var2, var4, var5, class_2904.method_13292(var9, class_8760.method_40218(var9, var8, var10, var2), this.method_32813(var8, var10, var2))
      );
   }

   public abstract class_6541 method_32813(class_8669<class_6325> var1, class_8669<class_7902> var2, long var3);
}
