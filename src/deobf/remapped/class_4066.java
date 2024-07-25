package remapped;

import java.util.Arrays;
import java.util.Comparator;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public enum class_4066 {
   field_19800(0, "options.narrator.off"),
   field_19796(1, "options.narrator.all"),
   field_19801(2, "options.narrator.chat"),
   field_19802(3, "options.narrator.system");

   private static final class_4066[] field_19797 = Arrays.<class_4066>stream(values())
      .sorted(Comparator.comparingInt(class_4066::method_18743))
      .<class_4066>toArray(class_4066[]::new);
   private final int field_19798;
   private final ITextComponent field_19799;

   private class_4066(int var3, String var4) {
      this.field_19798 = var3;
      this.field_19799 = new TranslationTextComponent(var4);
   }

   public int method_18743() {
      return this.field_19798;
   }

   public ITextComponent method_18746() {
      return this.field_19799;
   }

   public static class_4066 method_18744(int var0) {
      return field_19797[class_9299.method_42788(var0, field_19797.length)];
   }
}
