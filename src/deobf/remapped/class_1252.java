package remapped;

import java.util.Arrays;
import java.util.Optional;

public enum class_1252 implements class_4530 {
   field_6897("rollable"),
   field_6898("aligned");

   private final String field_6900;

   private class_1252(String var3) {
      this.field_6900 = var3;
   }

   @Override
   public String method_21049() {
      return this.field_6900;
   }

   public static Optional<class_1252> method_5640(String var0) {
      return Arrays.<class_1252>stream(values()).filter(var1 -> var1.method_21049().equals(var0)).findFirst();
   }
}
