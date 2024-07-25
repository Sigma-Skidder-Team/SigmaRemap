package remapped;

import java.util.Arrays;
import javax.annotation.Nullable;

public enum class_8427 {
   field_43111("base", "b", false),
   field_43113("square_bottom_left", "bl"),
   field_43094("square_bottom_right", "br"),
   field_43135("square_top_left", "tl"),
   field_43119("square_top_right", "tr"),
   field_43103("stripe_bottom", "bs"),
   field_43091("stripe_top", "ts"),
   field_43126("stripe_left", "ls"),
   field_43139("stripe_right", "rs"),
   field_43106("stripe_center", "cs"),
   field_43098("stripe_middle", "ms"),
   field_43121("stripe_downright", "drs"),
   field_43093("stripe_downleft", "dls"),
   field_43118("small_stripes", "ss"),
   field_43092("cross", "cr"),
   field_43101("straight_cross", "sc"),
   field_43100("triangle_bottom", "bt"),
   field_43129("triangle_top", "tt"),
   field_43109("triangles_bottom", "bts"),
   field_43136("triangles_top", "tts"),
   field_43105("diagonal_left", "ld"),
   field_43112("diagonal_up_right", "rd"),
   field_43125("diagonal_up_left", "lud"),
   field_43131("diagonal_right", "rud"),
   field_43116("circle", "mc"),
   field_43102("rhombus", "mr"),
   field_43124("half_vertical", "vh"),
   field_43137("half_horizontal", "hh"),
   field_43120("half_vertical_right", "vhr"),
   field_43133("half_horizontal_bottom", "hhb"),
   field_43114("border", "bo"),
   field_43128("curly_border", "cbo"),
   field_43123("gradient", "gra"),
   field_43096("gradient_up", "gru"),
   field_43104("bricks", "bri"),
   field_43130("globe", "glb", true),
   field_43107("creeper", "cre", true),
   field_43097("skull", "sku", true),
   field_43110("flower", "flo", true),
   field_43090("mojang", "moj", true),
   field_43099("piglin", "pig", true);

   private static final class_8427[] field_43138 = values();
   public static final int field_43117 = field_43138.length;
   public static final int field_43108 = (int)Arrays.<class_8427>stream(field_43138).filter(var0 -> var0.field_43134).count();
   public static final int field_43115 = field_43117 - field_43108 - 1;
   private final boolean field_43134;
   private final String field_43095;
   private final String field_43122;

   private class_8427(String var3, String var4) {
      this(var3, var4, false);
   }

   private class_8427(String var3, String var4, boolean var5) {
      this.field_43095 = var3;
      this.field_43122 = var4;
      this.field_43134 = var5;
   }

   public class_4639 method_38784(boolean var1) {
      String var4 = !var1 ? "shield" : "banner";
      return new class_4639("entity/" + var4 + "/" + this.method_38785());
   }

   public String method_38785() {
      return this.field_43095;
   }

   public String method_38789() {
      return this.field_43122;
   }

   @Nullable
   public static class_8427 method_38788(String var0) {
      for (class_8427 var6 : values()) {
         if (var6.field_43122.equals(var0)) {
            return var6;
         }
      }

      return null;
   }
}
