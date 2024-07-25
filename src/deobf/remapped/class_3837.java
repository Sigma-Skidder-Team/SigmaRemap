package remapped;

public enum class_3837 {
   field_18740(class_4783.field_23893, "oak"),
   field_18735(class_4783.field_23464, "spruce"),
   field_18734(class_4783.field_23503, "birch"),
   field_18742(class_4783.field_23373, "jungle"),
   field_18738(class_4783.field_23545, "acacia"),
   field_18739(class_4783.field_23916, "dark_oak");

   private final String field_18737;
   private final class_6414 field_18741;

   private class_3837(class_6414 var3, String var4) {
      this.field_18737 = var4;
      this.field_18741 = var3;
   }

   public String method_17824() {
      return this.field_18737;
   }

   public class_6414 method_17827() {
      return this.field_18741;
   }

   @Override
   public String toString() {
      return this.field_18737;
   }

   public static class_3837 method_17826(int var0) {
      class_3837[] var3 = values();
      if (var0 < 0 || var0 >= var3.length) {
         var0 = 0;
      }

      return var3[var0];
   }

   public static class_3837 method_17825(String var0) {
      class_3837[] var3 = values();

      for (int var4 = 0; var4 < var3.length; var4++) {
         if (var3[var4].method_17824().equals(var0)) {
            return var3[var4];
         }
      }

      return var3[0];
   }
}
