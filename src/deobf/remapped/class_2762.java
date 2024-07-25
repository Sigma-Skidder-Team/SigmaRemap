package remapped;

public enum class_2762 {
   field_13500(class_240.field_817, 0, -1),
   field_13498(class_240.field_802, 0, 1),
   field_13501(class_240.field_804, -1, 0),
   field_13502(class_240.field_809, 1, 0);

   private final class_240 field_13494;
   private final int field_13496;
   private final int field_13499;

   private class_2762(class_240 var3, int var4, int var5) {
      this.field_13494 = var3;
      this.field_13496 = var4;
      this.field_13499 = var5;
   }

   public class_240 method_12568() {
      return this.field_13494;
   }

   public int method_12566() {
      return this.field_13496;
   }

   public int method_12565() {
      return this.field_13499;
   }

   private boolean method_12567() {
      return this == field_13498 || this == field_13500;
   }
}
