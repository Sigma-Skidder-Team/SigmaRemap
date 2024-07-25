package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public enum class_4666 {
   field_22762(-1, ""),
   field_22764(0, "survival"),
   field_22761(1, "creative"),
   field_22760(2, "adventure"),
   field_22756(3, "spectator");

   private final int field_22758;
   private final String field_22763;

   private class_4666(int var3, String var4) {
      this.field_22758 = var3;
      this.field_22763 = var4;
   }

   public int method_21589() {
      return this.field_22758;
   }

   public String method_21588() {
      return this.field_22763;
   }

   public ITextComponent method_21592() {
      return new TranslationTextComponent("gameMode." + this.field_22763);
   }

   public void method_21584(class_964 var1) {
      if (this != field_22761) {
         if (this != field_22756) {
            var1.field_4941 = false;
            var1.field_4944 = false;
            var1.field_4940 = false;
            var1.field_4942 = false;
         } else {
            var1.field_4941 = true;
            var1.field_4944 = false;
            var1.field_4940 = true;
            var1.field_4942 = true;
         }
      } else {
         var1.field_4941 = true;
         var1.field_4944 = true;
         var1.field_4940 = true;
      }

      var1.field_4938 = !this.method_21591();
   }

   public boolean method_21591() {
      return this == field_22760 || this == field_22756;
   }

   public boolean method_21587() {
      return this == field_22761;
   }

   public boolean method_21593() {
      return this == field_22764 || this == field_22760;
   }

   public static class_4666 method_21590(int var0) {
      return method_21594(var0, field_22764);
   }

   public static class_4666 method_21594(int var0, class_4666 var1) {
      for (class_4666 var7 : values()) {
         if (var7.field_22758 == var0) {
            return var7;
         }
      }

      return var1;
   }

   public static class_4666 method_21586(String var0) {
      return method_21595(var0, field_22764);
   }

   public static class_4666 method_21595(String var0, class_4666 var1) {
      for (class_4666 var7 : values()) {
         if (var7.field_22763.equals(var0)) {
            return var7;
         }
      }

      return var1;
   }
}
