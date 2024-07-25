package remapped;

import java.util.Map;

public class class_5516 extends class_7270 {
   private static String[] field_28079;

   public class_5516(class_1161 var1, class_1161 var2) {
      this.field_28078 = var1;
      this.field_28080 = var2;
   }

   @Override
   public void method_33217(class_6752 var1, class_7839 var2) {
      Map var5 = var2.method_35479().method_36950();
      class_8482.method_39073(new class_2239(this, var5));
   }

   @Override
   public void method_33221(class_6752 var1, String var2) {
      if (var2 != null) {
         class_8482.method_39073(new class_2533(this, var2));
      }
   }

   @Override
   public void method_33222(class_6752 var1, class_9091 var2) {
      if (var2 != null) {
         class_8482.method_39073(new class_9338(this, var2));
      }
   }

   @Override
   public void method_33223(class_6752 var1, int var2, String var3) {
      class_8482.method_39073(new class_7972(this));
   }

   @Override
   public void method_33218(class_6752 var1, Throwable var2, class_7839 var3) {
      if (var2 instanceof Exception) {
         class_8482.method_39073(new class_8099(this, var2));
      }
   }
}
