package remapped;

import java.io.IOException;
import java.util.List;

public class class_8163 implements class_6310<class_392> {
   private static String[] field_41820;
   private int field_41819;
   private List<class_9659<?>> field_41821;

   public class_8163() {
   }

   public class_8163(int var1, class_8073 var2, boolean var3) {
      this.field_41819 = var1;
      if (!var3) {
         this.field_41821 = var2.method_36635();
      } else {
         this.field_41821 = var2.method_36629();
         var2.method_36646();
      }
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_41819 = var1.method_37778();
      this.field_41821 = class_8073.method_36630(var1);
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_41819);
      class_8073.method_36632(this.field_41821, var1);
   }

   public void method_37455(class_392 var1) {
      var1.method_1964(this);
   }

   public List<class_9659<?>> method_37452() {
      return this.field_41821;
   }

   public int method_37454() {
      return this.field_41819;
   }
}
