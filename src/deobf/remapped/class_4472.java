package remapped;

import java.io.IOException;
import javax.annotation.Nullable;

public class class_4472 implements class_6310<class_392> {
   private static String[] field_21801;
   private Identifier field_21800;

   public class_4472() {
   }

   public class_4472(Identifier var1) {
      this.field_21800 = var1;
   }

   public void method_20756(class_392 var1) {
      var1.method_1943(this);
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      if (var1.readBoolean()) {
         this.field_21800 = var1.method_37768();
      }
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeBoolean(this.field_21800 != null);
      if (this.field_21800 != null) {
         var1.method_37780(this.field_21800);
      }
   }

   @Nullable
   public Identifier method_20755() {
      return this.field_21800;
   }
}
