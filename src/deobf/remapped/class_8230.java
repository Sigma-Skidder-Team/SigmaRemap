package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public abstract class class_8230 {
   public static final class_8230[] field_42279 = new class_8230[12];
   public static final class_8230 field_42278 = new class_2723(0, "buildingBlocks").method_37702("building_blocks");
   public static final class_8230 field_42277 = new class_3603(1, "decorations");
   public static final class_8230 field_42273 = new class_4355(2, "redstone");
   public static final class_8230 field_42265 = new class_1912(3, "transportation");
   public static final class_8230 field_42261 = new class_3883(6, "misc");
   public static final class_8230 field_42264 = new class_7484(5, "search").method_37701("item_search.png");
   public static final class_8230 field_42274 = new class_5081(7, "food");
   public static final class_8230 field_42270 = new class_4506(8, "tools")
      .method_37690(new class_8718[]{class_8718.field_44688, class_8718.field_44697, class_8718.field_44696, class_8718.field_44695});
   public static final class_8230 field_42275 = new class_2772(9, "combat")
      .method_37690(
         new class_8718[]{
            class_8718.field_44688,
            class_8718.field_44691,
            class_8718.field_44694,
            class_8718.field_44692,
            class_8718.field_44693,
            class_8718.field_44698,
            class_8718.field_44699,
            class_8718.field_44701,
            class_8718.field_44700,
            class_8718.field_44695,
            class_8718.field_44690,
            class_8718.field_44689
         }
      );
   public static final class_8230 field_42272 = new class_3402(10, "brewing");
   public static final class_8230 field_42260 = field_42261;
   public static final class_8230 field_42266 = new class_2153(4, "hotbar");
   public static final class_8230 field_42263 = new class_8375(11, "inventory").method_37701("inventory.png").method_37684().method_37697();
   private final int field_42262;
   private final String field_42268;
   private final ITextComponent field_42267;
   private String field_42276;
   private String field_42259 = "items.png";
   private boolean field_42258 = true;
   private boolean field_42269 = true;
   private class_8718[] field_42271 = new class_8718[0];
   private class_6098 field_42280;

   public class_8230(int var1, String var2) {
      this.field_42262 = var1;
      this.field_42268 = var2;
      this.field_42267 = new TranslationTextComponent("itemGroup." + var2);
      this.field_42280 = class_6098.field_31203;
      field_42279[var1] = this;
   }

   public int method_37688() {
      return this.field_42262;
   }

   public String method_37691() {
      return this.field_42276 != null ? this.field_42276 : this.field_42268;
   }

   public ITextComponent method_37699() {
      return this.field_42267;
   }

   public class_6098 method_37692() {
      if (this.field_42280.method_28022()) {
         this.field_42280 = this.method_37693();
      }

      return this.field_42280;
   }

   public abstract class_6098 method_37693();

   public String method_37703() {
      return this.field_42259;
   }

   public class_8230 method_37701(String var1) {
      this.field_42259 = var1;
      return this;
   }

   public class_8230 method_37702(String var1) {
      this.field_42276 = var1;
      return this;
   }

   public boolean method_37694() {
      return this.field_42269;
   }

   public class_8230 method_37697() {
      this.field_42269 = false;
      return this;
   }

   public boolean method_37689() {
      return this.field_42258;
   }

   public class_8230 method_37684() {
      this.field_42258 = false;
      return this;
   }

   public int method_37695() {
      return this.field_42262 % 6;
   }

   public boolean method_37700() {
      return this.field_42262 < 6;
   }

   public boolean method_37686() {
      return this.method_37695() == 5;
   }

   public class_8718[] method_37698() {
      return this.field_42271;
   }

   public class_8230 method_37690(class_8718... var1) {
      this.field_42271 = var1;
      return this;
   }

   public boolean method_37687(class_8718 var1) {
      if (var1 != null) {
         for (class_8718 var7 : this.field_42271) {
            if (var7 == var1) {
               return true;
            }
         }
      }

      return false;
   }

   public void method_37685(class_2831<class_6098> var1) {
      for (class_2451 var5 : class_8669.field_44382) {
         var5.method_11239(this, var1);
      }
   }
}
