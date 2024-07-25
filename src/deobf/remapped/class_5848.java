package remapped;

public enum class_5848 {
   field_29714("this", class_8712.field_44676),
   field_29709("killer", class_8712.field_44678),
   field_29711("direct_killer", class_8712.field_44669),
   field_29713("killer_player", class_8712.field_44675);

   private final String field_29708;
   private final class_9791<? extends Entity> field_29712;

   private class_5848(String var3, class_9791<? extends Entity> var4) {
      this.field_29708 = var3;
      this.field_29712 = var4;
   }

   public class_9791<? extends Entity> method_26666() {
      return this.field_29712;
   }

   public static class_5848 method_26664(String var0) {
      for (class_5848 var6 : values()) {
         if (var6.field_29708.equals(var0)) {
            return var6;
         }
      }

      throw new IllegalArgumentException("Invalid entity target " + var0);
   }
}
