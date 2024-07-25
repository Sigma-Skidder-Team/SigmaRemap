package remapped;

public enum class_9597 {
   field_48910("this", class_8712.field_44676),
   field_48903("killer", class_8712.field_44678),
   field_48905("killer_player", class_8712.field_44675),
   field_48906("block_entity", class_8712.field_44673);

   public final String field_48908;
   public final class_9791<?> field_48907;

   private class_9597(String var3, class_9791<?> var4) {
      this.field_48908 = var3;
      this.field_48907 = var4;
   }

   public static class_9597 method_44318(String var0) {
      for (class_9597 var6 : values()) {
         if (var6.field_48908.equals(var0)) {
            return var6;
         }
      }

      throw new IllegalArgumentException("Invalid name source " + var0);
   }
}
