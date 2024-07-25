package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_8896 {
   private static String[] field_45628;
   public String field_45631;
   public String field_45629;
   public class_9023 field_45632;
   public List<class_7144> field_45627 = new ArrayList<class_7144>();
   public boolean field_45630 = false;

   public class_8896(String var1, String var2, class_9023 var3) {
      this.field_45631 = var1;
      this.field_45629 = var2;
      this.field_45632 = var3;
   }

   public void method_40951() {
      this.field_45627 = new ArrayList<class_7144>();
      class_2939[] var3 = new class_2939[0];
      if (this.field_45632 != class_9023.field_46154) {
         if (this.field_45632 == class_9023.field_46153) {
            var3 = class_1199.method_5303(this.field_45629);
         }
      } else {
         var3 = class_1199.method_5309(this.field_45629);
      }

      for (class_2939 var7 : var3) {
         this.field_45627.add(new class_7144(var7.field_14295, var7.field_14296, var7.field_14294));
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 != this) {
         if (var1 instanceof class_8896) {
            class_8896 var4 = (class_8896)var1;
            return var4.field_45629.equals(this.field_45629);
         } else {
            return false;
         }
      } else {
         return true;
      }
   }
}
