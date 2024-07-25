package remapped;

import java.io.Serializable;

public class class_4985 implements Serializable {
   private static String[] field_25813;
   public int field_25814;
   public int field_25815;

   public class_4985(int var1, int var2) {
      this.field_25814 = var1;
      this.field_25815 = var2;
   }

   public class_4985(long var1) {
      this.field_25814 = (int)var1;
      this.field_25815 = (int)(var1 >> 32);
   }

   public Long method_22946() {
      return class_2034.method_9540(this.field_25814, this.field_25815);
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof class_4985)) {
            return false;
         } else {
            class_4985 var4 = (class_4985)var1;
            return this.field_25814 == var4.field_25814 && this.field_25815 == var4.field_25815;
         }
      } else {
         return true;
      }
   }
}
