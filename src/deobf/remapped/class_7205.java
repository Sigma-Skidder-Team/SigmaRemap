package remapped;

import java.util.Locale;

public class class_7205 extends class_8958 implements class_7818 {
   private final String field_37022;
   private final int field_37021;

   public class_7205(String var1, int var2) {
      this.field_37022 = var1;
      this.field_37021 = var2;
   }

   public int method_32987() {
      return this.field_37021;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "%s --> %.2f ms", this.field_37022, (float)this.field_37021);
   }
}
