package remapped;

import java.util.function.Consumer;

public class class_9046 {
   private static String[] field_46312;
   private class_4850 field_46311;
   private boolean field_46309;

   public boolean method_41529() {
      return this.field_46309;
   }

   public class_9046(class_9779 var1, class_4850 var2) {
      this.field_46310 = var1;
      this.field_46311 = var2;
   }

   public void method_41530(Consumer<class_4850> var1) {
      class_9779.method_45147(this.field_46310).execute(() -> {
         if (this.field_46311 != null) {
            var1.accept(this.field_46311);
         }
      });
   }

   public void method_41526() {
      this.field_46309 = true;
      class_9779.method_45145(this.field_46310).method_15143(this.field_46311);
      this.field_46311 = null;
   }
}
