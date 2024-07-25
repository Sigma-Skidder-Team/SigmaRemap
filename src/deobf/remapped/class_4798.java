package remapped;

import java.io.IOException;
import javax.annotation.Nullable;

public class class_4798 implements class_6310<class_392> {
   private static String[] field_23984;
   private int field_23985;
   private class_5734 field_23986;

   public class_4798() {
   }

   public class_4798(int var1, class_5734 var2) {
      this.field_23985 = var1;
      this.field_23986 = var2;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_23985 = var1.method_37778();
      this.field_23986 = var1.method_37775();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_23985);
      var1.method_37749(this.field_23986);
   }

   public void method_22117(class_392 var1) {
      var1.method_1942(this);
   }

   public int method_22115() {
      return this.field_23985;
   }

   @Nullable
   public class_5734 method_22116() {
      return this.field_23986;
   }

   @Override
   public boolean method_28774() {
      return true;
   }
}
