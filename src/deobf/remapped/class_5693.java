package remapped;

import java.util.LinkedList;
import java.util.List;

public class class_5693 {
   private List field_28837;

   private class_5693(class_4509 var1) {
      this.field_28838 = var1;
      this.field_28837 = new LinkedList();
   }

   public Object method_25756() {
      return this.field_28837.get(0);
   }

   public void method_25754() {
      this.field_28837.clear();
   }

   public void method_25755(Object var1) {
      for (int var4 = 0; var4 < this.field_28837.size(); var4++) {
         if (((Comparable)this.field_28837.get(var4)).compareTo(var1) > 0) {
            this.field_28837.add(var4, var1);
            break;
         }
      }

      if (!this.field_28837.contains(var1)) {
         this.field_28837.add(var1);
      }
   }

   public void method_25750(Object var1) {
      this.field_28837.remove(var1);
   }

   public int method_25753() {
      return this.field_28837.size();
   }

   public boolean method_25751(Object var1) {
      return this.field_28837.contains(var1);
   }

   @Override
   public String toString() {
      String var3 = "{";

      for (int var4 = 0; var4 < this.method_25753(); var4++) {
         var3 = var3 + this.field_28837.get(var4).toString() + ",";
      }

      return var3 + "}";
   }
}
