package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class class_3300 implements class_8169 {
   private static final Map<String, Pair<class_9264, Identifier>> field_16332 = Util.<Map<String, Pair<class_9264, Identifier>>>make(
      Maps.newHashMap(), var0 -> {
         var0.put("textures/entity/chest/normal_left.png", new Pair(class_9264.field_47279, new Identifier("textures/entity/chest/normal_double.png")));
         var0.put("textures/entity/chest/normal_right.png", new Pair(class_9264.field_47277, new Identifier("textures/entity/chest/normal_double.png")));
         var0.put("textures/entity/chest/normal.png", new Pair(class_9264.field_47274, new Identifier("textures/entity/chest/normal.png")));
         var0.put("textures/entity/chest/trapped_left.png", new Pair(class_9264.field_47279, new Identifier("textures/entity/chest/trapped_double.png")));
         var0.put("textures/entity/chest/trapped_right.png", new Pair(class_9264.field_47277, new Identifier("textures/entity/chest/trapped_double.png")));
         var0.put("textures/entity/chest/trapped.png", new Pair(class_9264.field_47274, new Identifier("textures/entity/chest/trapped.png")));
         var0.put("textures/entity/chest/christmas_left.png", new Pair(class_9264.field_47279, new Identifier("textures/entity/chest/christmas_double.png")));
         var0.put("textures/entity/chest/christmas_right.png", new Pair(class_9264.field_47277, new Identifier("textures/entity/chest/christmas_double.png")));
         var0.put("textures/entity/chest/christmas.png", new Pair(class_9264.field_47274, new Identifier("textures/entity/chest/christmas.png")));
         var0.put("textures/entity/chest/ender.png", new Pair(class_9264.field_47274, new Identifier("textures/entity/chest/ender.png")));
      }
   );
   private static final List<String> field_16333 = Lists.newArrayList(
      new String[]{
         "base",
         "border",
         "bricks",
         "circle",
         "creeper",
         "cross",
         "curly_border",
         "diagonal_left",
         "diagonal_right",
         "diagonal_up_left",
         "diagonal_up_right",
         "flower",
         "globe",
         "gradient",
         "gradient_up",
         "half_horizontal",
         "half_horizontal_bottom",
         "half_vertical",
         "half_vertical_right",
         "mojang",
         "rhombus",
         "skull",
         "small_stripes",
         "square_bottom_left",
         "square_bottom_right",
         "square_top_left",
         "square_top_right",
         "straight_cross",
         "stripe_bottom",
         "stripe_center",
         "stripe_downleft",
         "stripe_downright",
         "stripe_left",
         "stripe_middle",
         "stripe_right",
         "stripe_top",
         "triangle_bottom",
         "triangle_top",
         "triangles_bottom",
         "triangles_top"
      }
   );
   private static final Set<String> field_16330 = field_16333.stream()
      .<String>map(var0 -> "textures/entity/shield/" + var0 + ".png")
      .collect(Collectors.<String>toSet());
   private static final Set<String> field_16327 = field_16333.stream()
      .<String>map(var0 -> "textures/entity/banner/" + var0 + ".png")
      .collect(Collectors.<String>toSet());
   public static final Identifier field_16329 = new Identifier("textures/entity/shield_base.png");
   public static final Identifier field_16331 = new Identifier("textures/entity/banner_base.png");
   public static final Identifier field_16326 = new Identifier("textures/entity/iron_golem.png");
   private final class_8169 field_16334;

   public class_3300(class_8169 var1) {
      this.field_16334 = var1;
   }

   public InputStream 㢸聛䬾뗴缰鼒(String var1) throws IOException {
      return this.field_16334.method_37465(var1);
   }

   public boolean 郝䡸㹔柿Ꮺ쟗(class_3168 var1, Identifier var2) {
      if (!"minecraft".equals(var2.method_21461())) {
         return this.field_16334.method_37467(var1, var2);
      } else {
         String var5 = var2.method_21456();
         if (!"textures/misc/enchanted_item_glint.png".equals(var5)) {
            if ("textures/entity/iron_golem/iron_golem.png".equals(var5)) {
               return this.field_16334.method_37467(var1, field_16326);
            } else if ("textures/entity/conduit/wind.png".equals(var5) || "textures/entity/conduit/wind_vertical.png".equals(var5)) {
               return false;
            } else if (field_16330.contains(var5)) {
               return this.field_16334.method_37467(var1, field_16329) && this.field_16334.method_37467(var1, var2);
            } else if (field_16327.contains(var5)) {
               return this.field_16334.method_37467(var1, field_16331) && this.field_16334.method_37467(var1, var2);
            } else {
               Pair var6 = field_16332.get(var5);
               return var6 != null && this.field_16334.method_37467(var1, (Identifier)var6.getSecond()) ? true : this.field_16334.method_37467(var1, var2);
            }
         } else {
            return false;
         }
      }
   }

   public InputStream 䴂쬫ಽ䩉㐖쬫(class_3168 var1, Identifier var2) throws IOException {
      if (!"minecraft".equals(var2.method_21461())) {
         return this.field_16334.method_37466(var1, var2);
      } else {
         String var5 = var2.method_21456();
         if ("textures/entity/iron_golem/iron_golem.png".equals(var5)) {
            return this.field_16334.method_37466(var1, field_16326);
         } else {
            if (field_16330.contains(var5)) {
               InputStream var23 = method_15136(this.field_16334.method_37466(var1, field_16329), this.field_16334.method_37466(var1, var2), 64, 2, 2, 12, 22);
               if (var23 != null) {
                  return var23;
               }
            } else if (field_16327.contains(var5)) {
               InputStream var22 = method_15136(this.field_16334.method_37466(var1, field_16331), this.field_16334.method_37466(var1, var2), 64, 0, 0, 42, 41);
               if (var22 != null) {
                  return var22;
               }
            } else {
               if ("textures/entity/enderdragon/dragon.png".equals(var5) || "textures/entity/enderdragon/dragon_exploding.png".equals(var5)) {
                  ByteArrayInputStream var21;
                  try (class_5797 var24 = class_5797.method_26230(this.field_16334.method_37466(var1, var2))) {
                     int var9 = var24.method_26228() / 256;

                     for (int var10 = 88 * var9; var10 < 200 * var9; var10++) {
                        for (int var11 = 56 * var9; var11 < 112 * var9; var11++) {
                           var24.method_26242(var11, var10, 0);
                        }
                     }

                     var21 = new ByteArrayInputStream(var24.method_26243());
                  }

                  return var21;
               }

               if ("textures/entity/conduit/closed_eye.png".equals(var5) || "textures/entity/conduit/open_eye.png".equals(var5)) {
                  return method_15131(this.field_16334.method_37466(var1, var2));
               }

               Pair var6 = field_16332.get(var5);
               if (var6 != null) {
                  class_9264 var7 = (class_9264)var6.getFirst();
                  InputStream var8 = this.field_16334.method_37466(var1, (Identifier)var6.getSecond());
                  if (var7 == class_9264.field_47274) {
                     return method_15137(var8);
                  }

                  if (var7 == class_9264.field_47279) {
                     return method_15133(var8);
                  }

                  if (var7 == class_9264.field_47277) {
                     return method_15134(var8);
                  }
               }
            }

            return this.field_16334.method_37466(var1, var2);
         }
      }
   }

   @Nullable
   public static InputStream method_15136(InputStream var0, InputStream var1, int var2, int var3, int var4, int var5, int var6) throws IOException {
      ByteArrayInputStream var22;
      try (
         class_5797 var9 = class_5797.method_26230(var1);
         class_5797 var11 = class_5797.method_26230(var0);
      ) {
         int var13 = var11.method_26228();
         int var14 = var11.method_26253();
         if (var13 != var9.method_26228() || var14 != var9.method_26253()) {
            return null;
         }

         try (class_5797 var74 = new class_5797(var13, var14, true)) {
            int var17 = var13 / var2;

            for (int var18 = var4 * var17; var18 < var6 * var17; var18++) {
               for (int var19 = var3 * var17; var19 < var5 * var17; var19++) {
                  int var20 = class_5797.method_26255(var9.method_26252(var19, var18));
                  int var21 = var11.method_26252(var19, var18);
                  var74.method_26242(
                     var19,
                     var18,
                     class_5797.method_26244(var20, class_5797.method_26264(var21), class_5797.method_26240(var21), class_5797.method_26255(var21))
                  );
               }
            }

            var22 = new ByteArrayInputStream(var74.method_26243());
         }
      }

      return var22;
   }

   public static InputStream method_15131(InputStream var0) throws IOException {
      ByteArrayInputStream var9;
      try (class_5797 var3 = class_5797.method_26230(var0)) {
         int var5 = var3.method_26228();
         int var6 = var3.method_26253();

         try (class_5797 var7 = new class_5797(2 * var5, 2 * var6, true)) {
            method_15132(var3, var7, 0, 0, 0, 0, var5, var6, 1, false, false);
            var9 = new ByteArrayInputStream(var7.method_26243());
         }
      }

      return var9;
   }

   public static InputStream method_15133(InputStream var0) throws IOException {
      ByteArrayInputStream var10;
      try (class_5797 var3 = class_5797.method_26230(var0)) {
         int var5 = var3.method_26228();
         int var6 = var3.method_26253();

         try (class_5797 var7 = new class_5797(var5 / 2, var6, true)) {
            int var9 = var6 / 64;
            method_15132(var3, var7, 29, 0, 29, 0, 15, 14, var9, false, true);
            method_15132(var3, var7, 59, 0, 14, 0, 15, 14, var9, false, true);
            method_15132(var3, var7, 29, 14, 43, 14, 15, 5, var9, true, true);
            method_15132(var3, var7, 44, 14, 29, 14, 14, 5, var9, true, true);
            method_15132(var3, var7, 58, 14, 14, 14, 15, 5, var9, true, true);
            method_15132(var3, var7, 29, 19, 29, 19, 15, 14, var9, false, true);
            method_15132(var3, var7, 59, 19, 14, 19, 15, 14, var9, false, true);
            method_15132(var3, var7, 29, 33, 43, 33, 15, 10, var9, true, true);
            method_15132(var3, var7, 44, 33, 29, 33, 14, 10, var9, true, true);
            method_15132(var3, var7, 58, 33, 14, 33, 15, 10, var9, true, true);
            method_15132(var3, var7, 2, 0, 2, 0, 1, 1, var9, false, true);
            method_15132(var3, var7, 4, 0, 1, 0, 1, 1, var9, false, true);
            method_15132(var3, var7, 2, 1, 3, 1, 1, 4, var9, true, true);
            method_15132(var3, var7, 3, 1, 2, 1, 1, 4, var9, true, true);
            method_15132(var3, var7, 4, 1, 1, 1, 1, 4, var9, true, true);
            var10 = new ByteArrayInputStream(var7.method_26243());
         }
      }

      return var10;
   }

   public static InputStream method_15134(InputStream var0) throws IOException {
      ByteArrayInputStream var10;
      try (class_5797 var3 = class_5797.method_26230(var0)) {
         int var5 = var3.method_26228();
         int var6 = var3.method_26253();

         try (class_5797 var7 = new class_5797(var5 / 2, var6, true)) {
            int var9 = var6 / 64;
            method_15132(var3, var7, 14, 0, 29, 0, 15, 14, var9, false, true);
            method_15132(var3, var7, 44, 0, 14, 0, 15, 14, var9, false, true);
            method_15132(var3, var7, 0, 14, 0, 14, 14, 5, var9, true, true);
            method_15132(var3, var7, 14, 14, 43, 14, 15, 5, var9, true, true);
            method_15132(var3, var7, 73, 14, 14, 14, 15, 5, var9, true, true);
            method_15132(var3, var7, 14, 19, 29, 19, 15, 14, var9, false, true);
            method_15132(var3, var7, 44, 19, 14, 19, 15, 14, var9, false, true);
            method_15132(var3, var7, 0, 33, 0, 33, 14, 10, var9, true, true);
            method_15132(var3, var7, 14, 33, 43, 33, 15, 10, var9, true, true);
            method_15132(var3, var7, 73, 33, 14, 33, 15, 10, var9, true, true);
            method_15132(var3, var7, 1, 0, 2, 0, 1, 1, var9, false, true);
            method_15132(var3, var7, 3, 0, 1, 0, 1, 1, var9, false, true);
            method_15132(var3, var7, 0, 1, 0, 1, 1, 4, var9, true, true);
            method_15132(var3, var7, 1, 1, 3, 1, 1, 4, var9, true, true);
            method_15132(var3, var7, 5, 1, 1, 1, 1, 4, var9, true, true);
            var10 = new ByteArrayInputStream(var7.method_26243());
         }
      }

      return var10;
   }

   public static InputStream method_15137(InputStream var0) throws IOException {
      ByteArrayInputStream var10;
      try (class_5797 var3 = class_5797.method_26230(var0)) {
         int var5 = var3.method_26228();
         int var6 = var3.method_26253();

         try (class_5797 var7 = new class_5797(var5, var6, true)) {
            int var9 = var6 / 64;
            method_15132(var3, var7, 14, 0, 28, 0, 14, 14, var9, false, true);
            method_15132(var3, var7, 28, 0, 14, 0, 14, 14, var9, false, true);
            method_15132(var3, var7, 0, 14, 0, 14, 14, 5, var9, true, true);
            method_15132(var3, var7, 14, 14, 42, 14, 14, 5, var9, true, true);
            method_15132(var3, var7, 28, 14, 28, 14, 14, 5, var9, true, true);
            method_15132(var3, var7, 42, 14, 14, 14, 14, 5, var9, true, true);
            method_15132(var3, var7, 14, 19, 28, 19, 14, 14, var9, false, true);
            method_15132(var3, var7, 28, 19, 14, 19, 14, 14, var9, false, true);
            method_15132(var3, var7, 0, 33, 0, 33, 14, 10, var9, true, true);
            method_15132(var3, var7, 14, 33, 42, 33, 14, 10, var9, true, true);
            method_15132(var3, var7, 28, 33, 28, 33, 14, 10, var9, true, true);
            method_15132(var3, var7, 42, 33, 14, 33, 14, 10, var9, true, true);
            method_15132(var3, var7, 1, 0, 3, 0, 2, 1, var9, false, true);
            method_15132(var3, var7, 3, 0, 1, 0, 2, 1, var9, false, true);
            method_15132(var3, var7, 0, 1, 0, 1, 1, 4, var9, true, true);
            method_15132(var3, var7, 1, 1, 4, 1, 2, 4, var9, true, true);
            method_15132(var3, var7, 3, 1, 3, 1, 1, 4, var9, true, true);
            method_15132(var3, var7, 4, 1, 1, 1, 2, 4, var9, true, true);
            var10 = new ByteArrayInputStream(var7.method_26243());
         }
      }

      return var10;
   }

   public Collection<Identifier> ศ哝呓뎫顸瀳(class_3168 var1, String var2, String var3, int var4, Predicate<String> var5) {
      return this.field_16334.method_37464(var1, var2, var3, var4, var5);
   }

   public Set<String> 쇽亟硙괠属室(class_3168 var1) {
      return this.field_16334.method_37468(var1);
   }

   @Nullable
   public <T> T 웨室殢ใ藸褕(class_6146<T> var1) throws IOException {
      return this.field_16334.<T>method_37469(var1);
   }

   public String 콵樽웎柿㥇竁() {
      return this.field_16334.method_37470();
   }

   @Override
   public void close() {
      this.field_16334.close();
   }

   private static void method_15132(
      class_5797 var0, class_5797 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, boolean var10
   ) {
      var7 *= var8;
      var6 *= var8;
      var4 *= var8;
      var5 *= var8;
      var2 *= var8;
      var3 *= var8;

      for (int var13 = 0; var13 < var7; var13++) {
         for (int var14 = 0; var14 < var6; var14++) {
            var1.method_26242(
               var4 + var14, var5 + var13, var0.method_26252(var2 + (!var9 ? var14 : var6 - 1 - var14), var3 + (!var10 ? var13 : var7 - 1 - var13))
            );
         }
      }
   }
}
