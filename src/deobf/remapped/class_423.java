package remapped;

import java.util.Arrays;
import java.util.Comparator;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public enum class_423 {
   field_1790(0, "peaceful"),
   field_1784(1, "easy"),
   field_1789(2, "normal"),
   field_1782(3, "hard");

   private static final class_423[] field_1786 = Arrays.<class_423>stream(values())
      .sorted(Comparator.comparingInt(class_423::method_2097))
      .<class_423>toArray(class_423[]::new);
   private final int field_1788;
   private final String field_1787;

   private class_423(int var3, String var4) {
      this.field_1788 = var3;
      this.field_1787 = var4;
   }

   public int method_2097() {
      return this.field_1788;
   }

   public ITextComponent method_2101() {
      return new TranslationTextComponent("options.difficulty." + this.field_1787);
   }

   public static class_423 method_2100(int var0) {
      return field_1786[var0 % field_1786.length];
   }

   @Nullable
   public static class_423 method_2095(String var0) {
      for (class_423 var6 : values()) {
         if (var6.field_1787.equals(var0)) {
            return var6;
         }
      }

      return null;
   }

   public String method_2098() {
      return this.field_1787;
   }

   public class_423 method_2096() {
      return field_1786[(this.field_1788 + 1) % field_1786.length];
   }
}
