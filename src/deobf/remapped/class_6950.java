package remapped;

public enum class_6950 {
   field_35736("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_:."),
   field_35739("0123456789", "0123456789."),
   field_35740("+-*/%!&|<>=", "&|="),
   field_35732(","),
   field_35733("("),
   field_35731(")");

   private String field_35737;
   private String field_35734;
   public static final class_6950[] field_35730 = values();

   private class_6950(String var3) {
      this(var3, "");
   }

   private class_6950(String var3, String var4) {
      this.field_35737 = var3;
      this.field_35734 = var4;
   }

   public String method_31789() {
      return this.field_35737;
   }

   public String method_31790() {
      return this.field_35734;
   }

   public static class_6950 method_31793(char var0) {
      for (int var3 = 0; var3 < field_35730.length; var3++) {
         class_6950 var4 = field_35730[var3];
         if (var4.method_31789().indexOf(var0) >= 0) {
            return var4;
         }
      }

      return null;
   }

   public boolean method_31792(char var1) {
      return this.field_35734.indexOf(var1) >= 0;
   }
}
