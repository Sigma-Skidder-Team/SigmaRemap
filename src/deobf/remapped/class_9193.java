package remapped;

public enum class_9193 {
   field_47031(true, false),
   field_47036(false, false),
   field_47033(false, true);

   private static final class_9193[] field_47034 = values();
   private boolean field_47032;
   private boolean field_47030;

   private class_9193(boolean var3, boolean var4) {
      this.field_47032 = var3;
      this.field_47030 = var4;
   }

   public boolean method_42383() {
      return this.field_47032;
   }

   public boolean method_42384() {
      return this.field_47030;
   }

   public class_9193 method_42382() {
      return field_47034[(this.ordinal() + 1) % field_47034.length];
   }
}
