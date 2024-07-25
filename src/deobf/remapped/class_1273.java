package remapped;

public class class_1273 extends class_9577 {
   private static String[] field_7007;

   private class_1273(class_1799 var1) {
      super(var1);
      this.field_7008 = var1;
   }

   @Override
   public void method_16794() {
      if (this.field_7008.method_17809() == null) {
         if (class_1799.method_8006(this.field_7008) != null) {
            this.field_7008
               .method_26865()
               .method_17240(class_1799.method_8006(this.field_7008), (float)this.field_7008.method_26903(), (float)this.field_7008.method_26862());
         }
      } else {
         this.field_7008
            .method_26865()
            .method_17240(this.field_7008.method_17809(), (float)this.field_7008.method_26903(), (float)this.field_7008.method_26862());
      }
   }
}
