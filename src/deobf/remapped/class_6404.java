package remapped;

import java.io.IOException;
import java.util.UUID;
import javax.annotation.Nullable;

public class class_6404 implements class_6310<class_1243> {
   private static String[] field_32688;
   private UUID field_32689;

   public class_6404() {
   }

   public class_6404(UUID var1) {
      this.field_32689 = var1;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_32689 = var1.method_37753();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37746(this.field_32689);
   }

   public void method_29235(class_1243 var1) {
      var1.method_5537(this);
   }

   @Nullable
   public Entity method_29233(class_6331 var1) {
      return var1.method_28925(this.field_32689);
   }
}
