package remapped;

import java.io.Serializable;

public class class_8074 implements Serializable {
   private static String[] field_41304;
   private int field_41303;
   private int field_41305;

   public class_8074(class_533 var1, int var2, int var3) {
      this.field_41306 = var1;
      this.field_41303 = var2;
      this.field_41305 = var3;
   }

   public int method_36651() {
      return this.field_41303;
   }

   public int method_36650() {
      return this.field_41305;
   }

   @Override
   public int hashCode() {
      return this.field_41303 * this.field_41305;
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof class_8074)) {
         return false;
      } else {
         class_8074 var4 = (class_8074)var1;
         return var4.field_41303 == this.field_41303 && var4.field_41305 == this.field_41305;
      }
   }
}
