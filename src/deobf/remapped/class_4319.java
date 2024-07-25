package remapped;

import java.util.Map;

public class class_4319 {
   private class_7826 field_21024;
   private Map<String, String> field_21025;

   public class_4319(class_7826 var1, Map<String, String> var2) {
      this.field_21024 = var1;
      this.field_21025 = var2;
   }

   public class_7826 method_20102() {
      return this.field_21024;
   }

   public Map<String, String> method_20101() {
      return this.field_21025;
   }

   @Override
   public String toString() {
      return String.format("VersionTagsTuple<%s, %s>", this.field_21024, this.field_21025);
   }
}
