package remapped;

import java.util.EnumSet;
import java.util.List;

public class class_4337 extends class_956 {
   private static String[] field_21081;
   private final class_8127 field_21080;
   private class_5834 field_21083;
   private final class_4931 field_21082 = new class_4931().method_22607(64.0);

   public class_4337(class_8127 var1) {
      super(var1, false, true);
      this.field_21080 = var1;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9563));
   }

   @Override
   public boolean method_16795() {
      class_4092 var3 = this.field_21080.method_37241().method_18899(10.0, 8.0, 10.0);
      List var4 = this.field_21080.field_41768.<class_7666>method_25863(class_7666.class, this.field_21082, this.field_21080, var3);
      List var5 = this.field_21080.field_41768.method_25871(this.field_21082, this.field_21080, var3);

      for (class_5834 var7 : var4) {
         class_7666 var8 = (class_7666)var7;

         for (class_704 var10 : var5) {
            int var11 = var8.method_34691(var10);
            if (var11 <= -100) {
               this.field_21083 = var10;
            }
         }
      }

      return this.field_21083 == null
         ? false
         : !(this.field_21083 instanceof class_704) || !this.field_21083.method_37221() && !((class_704)this.field_21083).method_3186();
   }

   @Override
   public void method_16796() {
      this.field_21080.method_26860(this.field_21083);
      super.method_16796();
   }
}
