package remapped;

import java.util.List;

public class class_2871 extends class_9883 {
   private static String[] field_14068;

   private class_2871(class_9825 var1) {
      super(var1);
      this.field_14067 = var1;
   }

   @Override
   public boolean method_16795() {
      return this.field_14067.method_17809() != null && class_9825.method_45295(this.field_14067) == class_55.field_37;
   }

   @Override
   public boolean method_16799() {
      class_5834 var3 = this.field_14067.method_17809();
      if (var3 != null) {
         if (!var3.method_37330()) {
            return false;
         } else if (!(var3 instanceof class_704) || !((class_704)var3).method_37221() && !((class_704)var3).method_3186()) {
            if (!this.method_16795()) {
               return false;
            } else {
               if (this.field_14067.field_41697 % 20 == 0) {
                  List var4 = this.field_14067
                     .field_41768
                     .<class_8145>method_25869(class_5583.class, this.field_14067.method_37241().method_18898(16.0), class_3572.field_17481);
                  if (!var4.isEmpty()) {
                     for (class_5583 var6 : var4) {
                        var6.method_25363();
                     }

                     return false;
                  }
               }

               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public void method_16796() {
   }

   @Override
   public void method_16793() {
      this.field_14067.method_26860((class_5834)null);
      class_9825.method_45300(this.field_14067, class_55.field_38);
   }

   @Override
   public void method_16794() {
      class_5834 var3 = this.field_14067.method_17809();
      class_9825.method_45286(this.field_14067, new class_1343(var3.method_37302(), var3.method_37080(0.5), var3.method_37156()));
      if (!this.field_14067.method_37241().method_18898(0.2F).method_18909(var3.method_37241())) {
         if (this.field_14067.field_41744 || this.field_14067.field_29645 > 0) {
            class_9825.method_45300(this.field_14067, class_55.field_38);
         }
      } else {
         this.field_14067.method_26442(var3);
         class_9825.method_45300(this.field_14067, class_55.field_38);
         if (!this.field_14067.method_37378()) {
            this.field_14067.field_41768.method_43364(1039, this.field_14067.method_37075(), 0);
         }
      }
   }
}
