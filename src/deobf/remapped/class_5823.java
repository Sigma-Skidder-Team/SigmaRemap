package remapped;

import java.io.IOException;

public abstract class class_5823 implements class_5322 {
   public final class_8880 field_29539;
   public boolean field_29540;

   private class_5823(class_9485 var1) {
      this.field_29541 = var1;
      this.field_29539 = new class_8880(this.field_29541.field_48346.method_19192());
   }

   @Override
   public class_245 method_19192() {
      return this.field_29539;
   }

   public final void method_26343(boolean var1) throws IOException {
      if (this.field_29541.field_48339 != 6) {
         if (this.field_29541.field_48339 == 5) {
            this.field_29541.method_43820(this.field_29539);
            this.field_29541.field_48339 = 6;
            if (this.field_29541.field_48334 != null) {
               this.field_29541.field_48334.method_1518(!var1, this.field_29541);
            }
         } else {
            throw new IllegalStateException("state: " + this.field_29541.field_48339);
         }
      }
   }
}
