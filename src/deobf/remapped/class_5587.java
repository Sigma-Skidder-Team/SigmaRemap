package remapped;

public enum class_5587 {
   field_28370,
   field_28371,
   field_28368;

   public static final class_9249[] field_28369 = class_9249.values();
   public static final class_5587[] field_28367 = values();

   private class_5587() {
   }

   public abstract int method_25384(int var1, int var2, int var3, class_9249 var4);

   public abstract class_9249 method_25382(class_9249 var1);

   public abstract class_5587 method_25383();

   public static class_5587 method_25381(class_9249 var0, class_9249 var1) {
      return field_28367[Math.floorMod(var1.ordinal() - var0.ordinal(), 3)];
   }
}
