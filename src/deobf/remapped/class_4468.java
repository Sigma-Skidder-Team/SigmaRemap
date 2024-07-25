package remapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;

public class class_4468 {
   private static String[] field_21790;
   private final class_95<class_3440> field_21791 = new class_95<class_3440>(32);
   private final Map<class_6414, Set<class_5019<?>>> field_21789 = Maps.newHashMap();

   public static class_4468 method_20751() {
      class_4468 var2 = new class_4468();
      var2.method_20748(
         (var0, var1, var2x, var3) -> var1 != null && var2x != null
               ? class_4948.method_22673(var1, var0.method_10313(class_3064.field_15063) != class_7422.field_37874 ? var2x : var2x.method_6100())
               : -1,
         class_4783.field_23586,
         class_4783.field_23247
      );
      var2.method_20750(class_3064.field_15063, class_4783.field_23586, class_4783.field_23247);
      var2.method_20748(
         (var0, var1, var2x, var3) -> var1 != null && var2x != null ? class_4948.method_22673(var1, var2x) : class_640.method_2941(0.5, 1.0),
         class_4783.field_23259,
         class_4783.field_23616,
         class_4783.field_23868,
         class_4783.field_23278
      );
      var2.method_20748((var0, var1, var2x, var3) -> class_8400.method_38685(), class_4783.field_23493);
      var2.method_20748((var0, var1, var2x, var3) -> class_8400.method_38687(), class_4783.field_23467);
      var2.method_20748(
         (var0, var1, var2x, var3) -> var1 != null && var2x != null ? class_4948.method_22672(var1, var2x) : class_8400.method_38682(),
         class_4783.field_23539,
         class_4783.field_23386,
         class_4783.field_23756,
         class_4783.field_23268,
         class_4783.field_23323
      );
      var2.method_20748(
         (var0, var1, var2x, var3) -> var1 != null && var2x != null ? class_4948.method_22674(var1, var2x) : -1,
         class_4783.field_23900,
         class_4783.field_23269,
         class_4783.field_23673
      );
      var2.method_20748((var0, var1, var2x, var3) -> class_9301.method_42946(var0.<Integer>method_10313(class_9301.field_47514)), class_4783.field_23349);
      var2.method_20750(class_9301.field_47514, class_4783.field_23349);
      var2.method_20748((var0, var1, var2x, var3) -> var1 != null && var2x != null ? class_4948.method_22673(var1, var2x) : -1, class_4783.field_23337);
      var2.method_20748((var0, var1, var2x, var3) -> 14731036, class_4783.field_23744, class_4783.field_23544);
      var2.method_20748((var0, var1, var2x, var3) -> {
         int var6 = var0.<Integer>method_10313(class_8138.field_41679);
         int var7 = var6 * 32;
         int var8 = 255 - var6 * 8;
         int var9 = var6 * 4;
         return var7 << 16 | var8 << 8 | var9;
      }, class_4783.field_23212, class_4783.field_23301);
      var2.method_20750(class_8138.field_41679, class_4783.field_23212, class_4783.field_23301);
      var2.method_20748((var0, var1, var2x, var3) -> var1 != null && var2x != null ? 2129968 : 7455580, class_4783.field_23860);
      return var2;
   }

   public int method_20744(class_2522 var1, class_6486 var2, class_1331 var3) {
      class_3440 var6 = this.field_21791.method_14040(class_8669.field_44462.method_14041(var1.method_8360()));
      if (var6 == null) {
         class_1513 var7 = var1.method_8323(var2, var3);
         return var7 == null ? -1 : var7.field_8060;
      } else {
         return var6.method_15879(var1, (class_5561)null, (class_1331)null, 0);
      }
   }

   public int method_20749(class_2522 var1, class_5561 var2, class_1331 var3, int var4) {
      class_3440 var7 = this.field_21791.method_14040(class_8669.field_44462.method_14041(var1.method_8360()));
      return var7 != null ? var7.method_15879(var1, var2, var3, var4) : -1;
   }

   public void method_20748(class_3440 var1, class_6414... var2) {
      for (class_6414 var8 : var2) {
         this.field_21791.method_278(var1, class_8669.field_44462.method_14041(var8));
      }
   }

   private void method_20747(Set<class_5019<?>> var1, class_6414... var2) {
      for (class_6414 var8 : var2) {
         this.field_21789.put(var8, var1);
      }
   }

   private void method_20750(class_5019<?> var1, class_6414... var2) {
      this.method_20747(ImmutableSet.of(var1), var2);
   }

   public Set<class_5019<?>> method_20746(class_6414 var1) {
      return this.field_21789.getOrDefault(var1, ImmutableSet.of());
   }
}
