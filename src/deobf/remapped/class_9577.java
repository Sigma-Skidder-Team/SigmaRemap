package remapped;

import java.util.EnumSet;

public class class_9577 extends class_3599 {
   private static String[] field_48715;

   public class_9577(class_7429 var1) {
      this.field_48716 = var1;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9564, class_1891.field_9560));
   }

   @Override
   public boolean method_16795() {
      return this.field_48716.method_33823() > 0;
   }

   @Override
   public void method_16796() {
      super.method_16796();
      class_7429.method_33821(this.field_48716).method_5620();
   }

   @Override
   public void method_16793() {
      super.method_16793();
      this.field_48716.method_33822(class_248.field_877);
   }

   @Override
   public void method_16794() {
      if (this.field_48716.method_17809() != null) {
         this.field_48716
            .method_26865()
            .method_17240(this.field_48716.method_17809(), (float)this.field_48716.method_26903(), (float)this.field_48716.method_26862());
      }
   }
}
