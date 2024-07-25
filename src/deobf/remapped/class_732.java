package remapped;

import com.google.common.collect.AbstractIterator;

public class class_732 extends AbstractIterator {
   private static String[] field_3993;
   private class_523 field_3992;

   public class_732(class_5393 var1) {
      this.field_3994 = var1;
      this.field_3992 = null;
   }

   public Object computeNext() {
      if (this.field_3992 != null) {
         if (!this.field_3992.equals(this.field_3994.field_27526)) {
            int var3 = this.field_3992.getX();
            int var4 = this.field_3992.method_12165();
            int var5 = this.field_3992.method_12185();
            if (var3 >= this.field_3994.field_27526.method_12173()) {
               if (var5 >= this.field_3994.field_27526.method_12185()) {
                  if (var4 < this.field_3994.field_27526.method_12165()) {
                     var3 = this.field_3994.field_27527.method_12173();
                     var5 = this.field_3994.field_27527.method_12185();
                     var4++;
                  }
               } else {
                  var3 = this.field_3994.field_27527.method_12173();
                  var5++;
               }
            } else {
               var3++;
            }

            this.field_3992.method_2548(var3, var4, var5);
            return this.field_3992;
         } else {
            return (class_523)this.endOfData();
         }
      } else {
         this.field_3992 = new class_523(
            this.field_3994.field_27527.method_12173(), this.field_3994.field_27527.method_12165(), this.field_3994.field_27527.method_12185(), 3
         );
         return this.field_3992;
      }
   }
}
