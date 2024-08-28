package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;

import javax.annotation.Nullable;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Class305 implements Class303 {
   private static final Map<String, Pair<Class111, ResourceLocation>> field1180 = Util.<Map<String, Pair<Class111, ResourceLocation>>>method38508(
      Maps.newHashMap(), var0 -> {
         var0.put("textures/entity/chest/normal_left.png", new Pair(Class111.field380, new ResourceLocation("textures/entity/chest/normal_double.png")));
         var0.put("textures/entity/chest/normal_right.png", new Pair(Class111.field381, new ResourceLocation("textures/entity/chest/normal_double.png")));
         var0.put("textures/entity/chest/normal.png", new Pair(Class111.field379, new ResourceLocation("textures/entity/chest/normal.png")));
         var0.put("textures/entity/chest/trapped_left.png", new Pair(Class111.field380, new ResourceLocation("textures/entity/chest/trapped_double.png")));
         var0.put("textures/entity/chest/trapped_right.png", new Pair(Class111.field381, new ResourceLocation("textures/entity/chest/trapped_double.png")));
         var0.put("textures/entity/chest/trapped.png", new Pair(Class111.field379, new ResourceLocation("textures/entity/chest/trapped.png")));
         var0.put("textures/entity/chest/christmas_left.png", new Pair(Class111.field380, new ResourceLocation("textures/entity/chest/christmas_double.png")));
         var0.put("textures/entity/chest/christmas_right.png", new Pair(Class111.field381, new ResourceLocation("textures/entity/chest/christmas_double.png")));
         var0.put("textures/entity/chest/christmas.png", new Pair(Class111.field379, new ResourceLocation("textures/entity/chest/christmas.png")));
         var0.put("textures/entity/chest/ender.png", new Pair(Class111.field379, new ResourceLocation("textures/entity/chest/ender.png")));
      }
   );
   private static final List<String> field1181 = Lists.newArrayList(
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
   private static final Set<String> field1182 = field1181.stream()
      .<String>map(var0 -> "textures/entity/shield/" + var0 + ".png")
      .collect(Collectors.<String>toSet());
   private static final Set<String> field1183 = field1181.stream()
      .<String>map(var0 -> "textures/entity/banner/" + var0 + ".png")
      .collect(Collectors.<String>toSet());
   public static final ResourceLocation field1184 = new ResourceLocation("textures/entity/shield_base.png");
   public static final ResourceLocation field1185 = new ResourceLocation("textures/entity/banner_base.png");
   public static final ResourceLocation field1186 = new ResourceLocation("textures/entity/iron_golem.png");
   private final Class303 field1187;

   public Class305(Class303 var1) {
      this.field1187 = var1;
   }

   @Override
   public InputStream method1222(String var1) throws IOException {
      return this.field1187.method1222(var1);
   }

   @Override
   public boolean method1225(Class1946 var1, ResourceLocation var2) {
      if (!"minecraft".equals(var2.method8293())) {
         return this.field1187.method1225(var1, var2);
      } else {
         String var5 = var2.method8292();
         if (!"textures/misc/enchanted_item_glint.png".equals(var5)) {
            if ("textures/entity/iron_golem/iron_golem.png".equals(var5)) {
               return this.field1187.method1225(var1, field1186);
            } else if ("textures/entity/conduit/wind.png".equals(var5) || "textures/entity/conduit/wind_vertical.png".equals(var5)) {
               return false;
            } else if (field1182.contains(var5)) {
               return this.field1187.method1225(var1, field1184) && this.field1187.method1225(var1, var2);
            } else if (field1183.contains(var5)) {
               return this.field1187.method1225(var1, field1185) && this.field1187.method1225(var1, var2);
            } else {
               Pair var6 = field1180.get(var5);
               return var6 != null && this.field1187.method1225(var1, (ResourceLocation)var6.getSecond()) ? true : this.field1187.method1225(var1, var2);
            }
         } else {
            return false;
         }
      }
   }

   @Override
   public InputStream method1223(Class1946 var1, ResourceLocation var2) throws IOException {
      if (!"minecraft".equals(var2.method8293())) {
         return this.field1187.method1223(var1, var2);
      } else {
         String var5 = var2.method8292();
         if ("textures/entity/iron_golem/iron_golem.png".equals(var5)) {
            return this.field1187.method1223(var1, field1186);
         } else {
            if (field1182.contains(var5)) {
               InputStream var23 = method1233(this.field1187.method1223(var1, field1184), this.field1187.method1223(var1, var2), 64, 2, 2, 12, 22);
               if (var23 != null) {
                  return var23;
               }
            } else if (field1183.contains(var5)) {
               InputStream var22 = method1233(this.field1187.method1223(var1, field1185), this.field1187.method1223(var1, var2), 64, 0, 0, 42, 41);
               if (var22 != null) {
                  return var22;
               }
            } else {
               if ("textures/entity/enderdragon/dragon.png".equals(var5) || "textures/entity/enderdragon/dragon_exploding.png".equals(var5)) {
                  ByteArrayInputStream var21;
                  try (Class1806 var24 = Class1806.method7879(this.field1187.method1223(var1, var2))) {
                     int var9 = var24.method7886() / 256;

                     for (int var10 = 88 * var9; var10 < 200 * var9; var10++) {
                        for (int var11 = 56 * var9; var11 < 112 * var9; var11++) {
                           var24.method7890(var11, var10, 0);
                        }
                     }

                     var21 = new ByteArrayInputStream(var24.method7901());
                  }

                  return var21;
               }

               if ("textures/entity/conduit/closed_eye.png".equals(var5) || "textures/entity/conduit/open_eye.png".equals(var5)) {
                  return method1234(this.field1187.method1223(var1, var2));
               }

               Pair var6 = field1180.get(var5);
               if (var6 != null) {
                  Class111 var7 = (Class111)var6.getFirst();
                  InputStream var8 = this.field1187.method1223(var1, (ResourceLocation)var6.getSecond());
                  if (var7 == Class111.field379) {
                     return method1237(var8);
                  }

                  if (var7 == Class111.field380) {
                     return method1235(var8);
                  }

                  if (var7 == Class111.field381) {
                     return method1236(var8);
                  }
               }
            }

            return this.field1187.method1223(var1, var2);
         }
      }
   }

   @Nullable
   public static InputStream method1233(InputStream var0, InputStream var1, int var2, int var3, int var4, int var5, int var6) throws IOException {
      ByteArrayInputStream var22;
      try (
         Class1806 var9 = Class1806.method7879(var1);
         Class1806 var11 = Class1806.method7879(var0);
      ) {
         int var13 = var11.method7886();
         int var14 = var11.method7887();
         if (var13 != var9.method7886() || var14 != var9.method7887()) {
            return null;
         }

         try (Class1806 var74 = new Class1806(var13, var14, true)) {
            int var17 = var13 / var2;

            for (int var18 = var4 * var17; var18 < var6 * var17; var18++) {
               for (int var19 = var3 * var17; var19 < var5 * var17; var19++) {
                  int var20 = Class1806.method7911(var9.method7889(var19, var18));
                  int var21 = var11.method7889(var19, var18);
                  var74.method7890(
                     var19, var18, Class1806.method7914(var20, Class1806.method7913(var21), Class1806.method7912(var21), Class1806.method7911(var21))
                  );
               }
            }

            var22 = new ByteArrayInputStream(var74.method7901());
         }
      }

      return var22;
   }

   public static InputStream method1234(InputStream var0) throws IOException {
      ByteArrayInputStream var9;
      try (Class1806 var3 = Class1806.method7879(var0)) {
         int var5 = var3.method7886();
         int var6 = var3.method7887();

         try (Class1806 var7 = new Class1806(2 * var5, 2 * var6, true)) {
            method1238(var3, var7, 0, 0, 0, 0, var5, var6, 1, false, false);
            var9 = new ByteArrayInputStream(var7.method7901());
         }
      }

      return var9;
   }

   public static InputStream method1235(InputStream var0) throws IOException {
      ByteArrayInputStream var10;
      try (Class1806 var3 = Class1806.method7879(var0)) {
         int var5 = var3.method7886();
         int var6 = var3.method7887();

         try (Class1806 var7 = new Class1806(var5 / 2, var6, true)) {
            int var9 = var6 / 64;
            method1238(var3, var7, 29, 0, 29, 0, 15, 14, var9, false, true);
            method1238(var3, var7, 59, 0, 14, 0, 15, 14, var9, false, true);
            method1238(var3, var7, 29, 14, 43, 14, 15, 5, var9, true, true);
            method1238(var3, var7, 44, 14, 29, 14, 14, 5, var9, true, true);
            method1238(var3, var7, 58, 14, 14, 14, 15, 5, var9, true, true);
            method1238(var3, var7, 29, 19, 29, 19, 15, 14, var9, false, true);
            method1238(var3, var7, 59, 19, 14, 19, 15, 14, var9, false, true);
            method1238(var3, var7, 29, 33, 43, 33, 15, 10, var9, true, true);
            method1238(var3, var7, 44, 33, 29, 33, 14, 10, var9, true, true);
            method1238(var3, var7, 58, 33, 14, 33, 15, 10, var9, true, true);
            method1238(var3, var7, 2, 0, 2, 0, 1, 1, var9, false, true);
            method1238(var3, var7, 4, 0, 1, 0, 1, 1, var9, false, true);
            method1238(var3, var7, 2, 1, 3, 1, 1, 4, var9, true, true);
            method1238(var3, var7, 3, 1, 2, 1, 1, 4, var9, true, true);
            method1238(var3, var7, 4, 1, 1, 1, 1, 4, var9, true, true);
            var10 = new ByteArrayInputStream(var7.method7901());
         }
      }

      return var10;
   }

   public static InputStream method1236(InputStream var0) throws IOException {
      ByteArrayInputStream var10;
      try (Class1806 var3 = Class1806.method7879(var0)) {
         int var5 = var3.method7886();
         int var6 = var3.method7887();

         try (Class1806 var7 = new Class1806(var5 / 2, var6, true)) {
            int var9 = var6 / 64;
            method1238(var3, var7, 14, 0, 29, 0, 15, 14, var9, false, true);
            method1238(var3, var7, 44, 0, 14, 0, 15, 14, var9, false, true);
            method1238(var3, var7, 0, 14, 0, 14, 14, 5, var9, true, true);
            method1238(var3, var7, 14, 14, 43, 14, 15, 5, var9, true, true);
            method1238(var3, var7, 73, 14, 14, 14, 15, 5, var9, true, true);
            method1238(var3, var7, 14, 19, 29, 19, 15, 14, var9, false, true);
            method1238(var3, var7, 44, 19, 14, 19, 15, 14, var9, false, true);
            method1238(var3, var7, 0, 33, 0, 33, 14, 10, var9, true, true);
            method1238(var3, var7, 14, 33, 43, 33, 15, 10, var9, true, true);
            method1238(var3, var7, 73, 33, 14, 33, 15, 10, var9, true, true);
            method1238(var3, var7, 1, 0, 2, 0, 1, 1, var9, false, true);
            method1238(var3, var7, 3, 0, 1, 0, 1, 1, var9, false, true);
            method1238(var3, var7, 0, 1, 0, 1, 1, 4, var9, true, true);
            method1238(var3, var7, 1, 1, 3, 1, 1, 4, var9, true, true);
            method1238(var3, var7, 5, 1, 1, 1, 1, 4, var9, true, true);
            var10 = new ByteArrayInputStream(var7.method7901());
         }
      }

      return var10;
   }

   public static InputStream method1237(InputStream var0) throws IOException {
      ByteArrayInputStream var10;
      try (Class1806 var3 = Class1806.method7879(var0)) {
         int var5 = var3.method7886();
         int var6 = var3.method7887();

         try (Class1806 var7 = new Class1806(var5, var6, true)) {
            int var9 = var6 / 64;
            method1238(var3, var7, 14, 0, 28, 0, 14, 14, var9, false, true);
            method1238(var3, var7, 28, 0, 14, 0, 14, 14, var9, false, true);
            method1238(var3, var7, 0, 14, 0, 14, 14, 5, var9, true, true);
            method1238(var3, var7, 14, 14, 42, 14, 14, 5, var9, true, true);
            method1238(var3, var7, 28, 14, 28, 14, 14, 5, var9, true, true);
            method1238(var3, var7, 42, 14, 14, 14, 14, 5, var9, true, true);
            method1238(var3, var7, 14, 19, 28, 19, 14, 14, var9, false, true);
            method1238(var3, var7, 28, 19, 14, 19, 14, 14, var9, false, true);
            method1238(var3, var7, 0, 33, 0, 33, 14, 10, var9, true, true);
            method1238(var3, var7, 14, 33, 42, 33, 14, 10, var9, true, true);
            method1238(var3, var7, 28, 33, 28, 33, 14, 10, var9, true, true);
            method1238(var3, var7, 42, 33, 14, 33, 14, 10, var9, true, true);
            method1238(var3, var7, 1, 0, 3, 0, 2, 1, var9, false, true);
            method1238(var3, var7, 3, 0, 1, 0, 2, 1, var9, false, true);
            method1238(var3, var7, 0, 1, 0, 1, 1, 4, var9, true, true);
            method1238(var3, var7, 1, 1, 4, 1, 2, 4, var9, true, true);
            method1238(var3, var7, 3, 1, 3, 1, 1, 4, var9, true, true);
            method1238(var3, var7, 4, 1, 1, 1, 2, 4, var9, true, true);
            var10 = new ByteArrayInputStream(var7.method7901());
         }
      }

      return var10;
   }

   @Override
   public Collection<ResourceLocation> method1224(Class1946 var1, String var2, String var3, int var4, Predicate<String> var5) {
      return this.field1187.method1224(var1, var2, var3, var4, var5);
   }

   @Override
   public Set<String> method1226(Class1946 var1) {
      return this.field1187.method1226(var1);
   }

   @Nullable
   @Override
   public <T> T method1227(Class7170<T> var1) throws IOException {
      return this.field1187.<T>method1227(var1);
   }

   @Override
   public String method1228() {
      return this.field1187.method1228();
   }

   @Override
   public void close() {
      this.field1187.close();
   }

   private static void method1238(
      Class1806 var0, Class1806 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, boolean var10
   ) {
      var7 *= var8;
      var6 *= var8;
      var4 *= var8;
      var5 *= var8;
      var2 *= var8;
      var3 *= var8;

      for (int var13 = 0; var13 < var7; var13++) {
         for (int var14 = 0; var14 < var6; var14++) {
            var1.method7890(var4 + var14, var5 + var13, var0.method7889(var2 + (!var9 ? var14 : var6 - 1 - var14), var3 + (!var10 ? var13 : var7 - 1 - var13)));
         }
      }
   }
}
