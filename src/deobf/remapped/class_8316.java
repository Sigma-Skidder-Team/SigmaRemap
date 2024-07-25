package remapped;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.Random;

public class class_8316 {
   private static boolean field_42580 = true;
   private static boolean field_42606 = true;
   private static boolean field_42579 = true;
   private static boolean field_42595 = true;
   private static boolean field_42584 = true;
   private static boolean field_42597 = true;
   private static boolean field_42577 = true;
   private static boolean field_42586 = false;
   private static class_5155 field_42583 = null;
   private static class_5155 field_42608 = null;
   private static class_5155 field_42603 = null;
   private static class_5155 field_42578 = null;
   private static class_5155 field_42598 = null;
   private static class_5155 field_42588 = null;
   private static class_5155 field_42605 = null;
   private static boolean field_42582 = false;
   private static class_7373 field_42601 = null;
   private static class_7373 field_42602 = null;
   private static class_7373 field_42592 = null;
   private static class_7373 field_42581 = null;
   private static class_7373 field_42593 = null;
   private static class_7373 field_42600 = null;
   private static boolean field_42587 = false;
   private static final String field_42590 = "block/grass_block_top";
   private static final String field_42596 = "block/grass_block_side";
   private static final String field_42585 = "block/grass_path_top";
   private static final String field_42599 = "block/grass_path_side";
   private static final String field_42594 = "block/mycelium_top";
   private static final String field_42604 = "block/podzol_top";
   private static final String field_42591 = "block/snow";
   private static final Random field_42589 = new Random(0L);

   public static void method_38337(class_8359 var0) {
      field_42582 = false;
      field_42587 = false;
      method_38344(var0);
   }

   public static void method_38331() {
      if (field_42582) {
         field_42601 = class_2870.method_13191(field_42583, 0);
         if (field_42586) {
            class_7373 var2 = class_2870.method_13191(field_42608, -1);
            field_42601 = class_2870.method_13186(var2, field_42601);
         }

         field_42602 = class_2870.method_13188("grass_path", field_42578, field_42603);
         field_42592 = class_2870.method_13191(field_42603, -1);
         field_42581 = class_2870.method_13191(field_42598, -1);
         field_42593 = class_2870.method_13191(field_42588, 0);
         field_42600 = class_2870.method_13191(field_42605, -1);
         field_42587 = true;
      }
   }

   private static void method_38344(class_8359 var0) {
      field_42580 = true;
      field_42606 = true;
      field_42579 = true;
      field_42595 = true;
      field_42584 = true;
      field_42597 = true;
      field_42577 = true;
      field_42583 = var0.method_38515(new Identifier("block/grass_block_top"));
      field_42608 = var0.method_38515(new Identifier("block/grass_block_side"));
      field_42603 = var0.method_38515(new Identifier("block/grass_path_top"));
      field_42578 = var0.method_38515(new Identifier("block/grass_path_side"));
      field_42598 = var0.method_38515(new Identifier("block/mycelium_top"));
      field_42588 = var0.method_38515(new Identifier("block/podzol_top"));
      field_42605 = var0.method_38515(new Identifier("block/snow"));
      field_42582 = true;
      String var3 = "optifine/bettergrass.properties";

      try {
         Identifier var4 = new Identifier(var3);
         if (!class_3111.method_14362(var4)) {
            return;
         }

         InputStream var5 = class_3111.method_14374(var4);
         if (var5 == null) {
            return;
         }

         boolean var6 = class_3111.method_14247(var4);
         if (var6) {
            class_3111.method_14277("BetterGrass: Parsing default configuration " + var3);
         } else {
            class_3111.method_14277("BetterGrass: Parsing configuration " + var3);
         }

         class_8407 var7 = new class_8407();
         var7.load(var5);
         var5.close();
         field_42580 = method_38345(var7, "grass", true);
         field_42606 = method_38345(var7, "grass_path", true);
         field_42579 = method_38345(var7, "mycelium", true);
         field_42595 = method_38345(var7, "podzol", true);
         field_42584 = method_38345(var7, "grass.snow", true);
         field_42597 = method_38345(var7, "mycelium.snow", true);
         field_42577 = method_38345(var7, "podzol.snow", true);
         field_42586 = method_38345(var7, "grass.multilayer", false);
         field_42583 = method_38340(var7, "texture.grass", "block/grass_block_top", var0);
         field_42608 = method_38340(var7, "texture.grass_side", "block/grass_block_side", var0);
         field_42603 = method_38340(var7, "texture.grass_path", "block/grass_path_top", var0);
         field_42578 = method_38340(var7, "texture.grass_path_side", "block/grass_path_side", var0);
         field_42598 = method_38340(var7, "texture.mycelium", "block/mycelium_top", var0);
         field_42588 = method_38340(var7, "texture.podzol", "block/podzol_top", var0);
         field_42605 = method_38340(var7, "texture.snow", "block/snow", var0);
      } catch (IOException var8) {
         class_3111.method_14317("Error reading: " + var3 + ", " + var8.getClass().getName() + ": " + var8.getMessage());
      }
   }

   public static void method_38338(class_8359 var0) {
      field_42583 = method_38335(var0, field_42583.method_23644());
      field_42608 = method_38335(var0, field_42608.method_23644());
      field_42603 = method_38335(var0, field_42603.method_23644());
      field_42578 = method_38335(var0, field_42578.method_23644());
      field_42598 = method_38335(var0, field_42598.method_23644());
      field_42588 = method_38335(var0, field_42588.method_23644());
      field_42605 = method_38335(var0, field_42605.method_23644());
   }

   private static class_5155 method_38335(class_8359 var0, Identifier var1) {
      class_5155 var4 = var0.method_38528(var1);
      if (var4 == null || var4 instanceof class_2008) {
         class_3111.method_14317("Missing BetterGrass sprite: " + var1);
      }

      return var4;
   }

   private static class_5155 method_38340(Properties var0, String var1, String var2, class_8359 var3) {
      String var6 = var0.getProperty(var1);
      if (var6 == null) {
         var6 = var2;
      }

      Identifier var7 = new Identifier("textures/" + var6 + ".png");
      if (!class_3111.method_14362(var7)) {
         class_3111.method_14317("BetterGrass texture not found: " + var7);
         var6 = var2;
      }

      Identifier var8 = new Identifier(var6);
      return var3.method_38515(var8);
   }

   public static List method_38342(class_6163 var0, class_2522 var1, class_1331 var2, Direction var3, List var4) {
      if (var3 == Direction.field_817 || var3 == Direction.field_802) {
         return var4;
      } else if (field_42587) {
         class_6414 var7 = var1.method_8360();
         if (var7 instanceof class_3724) {
            return method_38339(var0, var1, var2, var3, var4);
         } else if (var7 instanceof class_402) {
            return method_38332(var0, var1, var2, var3, var4);
         } else if (var7 == class_4783.field_23201) {
            return method_38336(var0, var1, var2, var3, var4);
         } else if (var7 != class_4783.field_23592) {
            return !(var7 instanceof class_2961) ? var4 : method_38333(var0, var1, var2, var3, var4);
         } else {
            return method_38334(var0, var1, var2, var3, var4);
         }
      } else {
         return var4;
      }
   }

   private static List method_38339(class_6163 var0, class_2522 var1, class_1331 var2, Direction var3, List var4) {
      class_6414 var7 = var0.method_28262(var2.method_6081()).method_8360();
      boolean var8 = var7 == class_4783.field_23813 || var7 == class_4783.field_23552;
      if (!class_3111.method_14299()) {
         if (!var8) {
            if (field_42579) {
               return field_42581.method_33580(var1, var3, field_42589);
            }
         } else if (field_42597) {
            return field_42600.method_33580(var1, var3, field_42589);
         }
      } else if (!var8) {
         if (field_42579 && method_38343(var2.method_6100(), var3, var0) == class_4783.field_23162) {
            return field_42581.method_33580(var1, var3, field_42589);
         }
      } else if (field_42597 && method_38343(var2, var3, var0) == class_4783.field_23552) {
         return field_42600.method_33580(var1, var3, field_42589);
      }

      return var4;
   }

   private static List method_38332(class_6163 var0, class_2522 var1, class_1331 var2, Direction var3, List var4) {
      if (field_42606) {
         if (!class_3111.method_14299()) {
            return field_42602.method_33580(var1, var3, field_42589);
         } else {
            return method_38343(var2.method_6100(), var3, var0) != class_4783.field_23608 ? var4 : field_42602.method_33580(var1, var3, field_42589);
         }
      } else {
         return var4;
      }
   }

   private static List method_38336(class_6163 var0, class_2522 var1, class_1331 var2, Direction var3, List var4) {
      class_6414 var7 = method_38343(var2, Direction.field_817, var0);
      boolean var8 = var7 == class_4783.field_23813 || var7 == class_4783.field_23552;
      if (!class_3111.method_14299()) {
         if (!var8) {
            if (field_42595) {
               return field_42593.method_33580(var1, var3, field_42589);
            }
         } else if (field_42577) {
            return field_42600.method_33580(var1, var3, field_42589);
         }
      } else if (!var8) {
         if (field_42595) {
            class_1331 var9 = var2.method_6100().method_6098(var3);
            class_2522 var10 = var0.method_28262(var9);
            if (var10.method_8360() == class_4783.field_23201) {
               return field_42593.method_33580(var1, var3, field_42589);
            }
         }
      } else if (field_42577 && method_38343(var2, var3, var0) == class_4783.field_23552) {
         return field_42600.method_33580(var1, var3, field_42589);
      }

      return var4;
   }

   private static List method_38334(class_6163 var0, class_2522 var1, class_1331 var2, Direction var3, List var4) {
      class_6414 var7 = method_38343(var2, Direction.field_817, var0);
      return var7 == class_4783.field_23608 && field_42606 && method_38343(var2, var3, var0) == class_4783.field_23608
         ? field_42592.method_33580(var1, var3, field_42589)
         : var4;
   }

   private static List method_38333(class_6163 var0, class_2522 var1, class_1331 var2, Direction var3, List var4) {
      class_6414 var7 = var0.method_28262(var2.method_6081()).method_8360();
      boolean var8 = var7 == class_4783.field_23813 || var7 == class_4783.field_23552;
      if (!class_3111.method_14299()) {
         if (!var8) {
            if (field_42580) {
               return field_42601.method_33580(var1, var3, field_42589);
            }
         } else if (field_42584) {
            return field_42600.method_33580(var1, var3, field_42589);
         }
      } else if (!var8) {
         if (field_42580 && method_38343(var2.method_6100(), var3, var0) == class_4783.field_23259) {
            return field_42601.method_33580(var1, var3, field_42589);
         }
      } else if (field_42584 && method_38343(var2, var3, var0) == class_4783.field_23552) {
         return field_42600.method_33580(var1, var3, field_42589);
      }

      return var4;
   }

   private static class_6414 method_38343(class_1331 var0, Direction var1, class_6163 var2) {
      class_1331 var5 = var0.method_6098(var1);
      return var2.method_28262(var5).method_8360();
   }

   private static boolean method_38345(Properties var0, String var1, boolean var2) {
      String var5 = var0.getProperty(var1);
      return var5 != null ? Boolean.parseBoolean(var5) : var2;
   }
}
