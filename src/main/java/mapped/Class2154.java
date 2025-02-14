package mapped;

import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;
import java.util.Arrays;

public enum Class2154 {
   field14082("base", "b", false),
   field14083("square_bottom_left", "bl"),
   field14084("square_bottom_right", "br"),
   field14085("square_top_left", "tl"),
   field14086("square_top_right", "tr"),
   field14087("stripe_bottom", "bs"),
   field14088("stripe_top", "ts"),
   field14089("stripe_left", "ls"),
   field14090("stripe_right", "rs"),
   field14091("stripe_center", "cs"),
   field14092("stripe_middle", "ms"),
   field14093("stripe_downright", "drs"),
   field14094("stripe_downleft", "dls"),
   field14095("small_stripes", "ss"),
   field14096("cross", "cr"),
   field14097("straight_cross", "sc"),
   field14098("triangle_bottom", "bt"),
   field14099("triangle_top", "tt"),
   field14100("triangles_bottom", "bts"),
   field14101("triangles_top", "tts"),
   field14102("diagonal_left", "ld"),
   field14103("diagonal_up_right", "rd"),
   field14104("diagonal_up_left", "lud"),
   field14105("diagonal_right", "rud"),
   field14106("circle", "mc"),
   field14107("rhombus", "mr"),
   field14108("half_vertical", "vh"),
   field14109("half_horizontal", "hh"),
   field14110("half_vertical_right", "vhr"),
   field14111("half_horizontal_bottom", "hhb"),
   field14112("border", "bo"),
   field14113("curly_border", "cbo"),
   field14114("gradient", "gra"),
   field14115("gradient_up", "gru"),
   field14116("bricks", "bri"),
   field14117("globe", "glb", true),
   field14118("creeper", "cre", true),
   field14119("skull", "sku", true),
   field14120("flower", "flo", true),
   field14121("mojang", "moj", true),
   field14122("piglin", "pig", true);

   private static final Class2154[] field14123 = values();
   public static final int field14124 = field14123.length;
   public static final int field14125 = (int)Arrays.<Class2154>stream(field14123).filter(var0 -> var0.field14127).count();
   public static final int field14126 = field14124 - field14125 - 1;
   private final boolean field14127;
   private final String field14128;
   private final String field14129;
   private static final Class2154[] field14130 = new Class2154[]{
      field14082,
      field14083,
      field14084,
      field14085,
      field14086,
      field14087,
      field14088,
      field14089,
      field14090,
      field14091,
      field14092,
      field14093,
      field14094,
      field14095,
      field14096,
      field14097,
      field14098,
      field14099,
      field14100,
      field14101,
      field14102,
      field14103,
      field14104,
      field14105,
      field14106,
      field14107,
      field14108,
      field14109,
      field14110,
      field14111,
      field14112,
      field14113,
      field14114,
      field14115,
      field14116,
      field14117,
      field14118,
      field14119,
      field14120,
      field14121,
      field14122
   };

   private Class2154(String var3, String var4) {
      this(var3, var4, false);
   }

   private Class2154(String var3, String var4, boolean var5) {
      this.field14128 = var3;
      this.field14129 = var4;
      this.field14127 = var5;
   }

   public ResourceLocation method8869(boolean var1) {
      String var4 = !var1 ? "shield" : "banner";
      return new ResourceLocation("entity/" + var4 + "/" + this.method8870());
   }

   public String method8870() {
      return this.field14128;
   }

   public String method8871() {
      return this.field14129;
   }

   @Nullable
   public static Class2154 method8872(String var0) {
      for (Class2154 var6 : values()) {
         if (var6.field14129.equals(var0)) {
            return var6;
         }
      }

      return null;
   }

   // $VF: synthetic method
   public static String method8874(Class2154 var0) {
      return var0.field14129;
   }
}
