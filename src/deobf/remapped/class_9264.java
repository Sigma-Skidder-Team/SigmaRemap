package remapped;

public enum class_9264 implements class_4530 {
   field_47274("single", 0),
   field_47279("left", 2),
   field_47277("right", 1);

   public static final class_9264[] field_47276 = values();
   private final String field_47280;
   private final int field_47275;

   private class_9264(String var3, int var4) {
      this.field_47280 = var3;
      this.field_47275 = var4;
   }

   @Override
   public String method_21049() {
      return this.field_47280;
   }

   public class_9264 method_42710() {
      return field_47276[this.field_47275];
   }
}
