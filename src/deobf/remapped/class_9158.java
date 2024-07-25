package remapped;

import java.io.Serializable;

public class class_9158 extends class_6064 implements Serializable {
   private static String[] field_46868;
   public static final long field_46867 = -4801347926528714435L;

   public class_9158(float var1, float var2) {
      super(var1, var2);
   }

   public class_9158(float[] var1) {
      super(var1);
   }

   public class_9158(class_9158 var1) {
      super(var1);
   }

   public class_9158(class_2120 var1) {
      super(var1);
   }

   public class_9158(class_2693 var1) {
      super(var1);
   }

   public class_9158(class_6064 var1) {
      super(var1);
   }

   public class_9158() {
   }

   public final float method_42203(class_9158 var1) {
      float var4 = this.field_31017 - var1.field_31017;
      float var5 = this.field_31019 - var1.field_31019;
      return var4 * var4 + var5 * var5;
   }

   public final float method_42204(class_9158 var1) {
      float var4 = this.field_31017 - var1.field_31017;
      float var5 = this.field_31019 - var1.field_31019;
      return (float)Math.sqrt((double)(var4 * var4 + var5 * var5));
   }

   public final float method_42202(class_9158 var1) {
      return Math.abs(this.field_31017 - var1.field_31017) + Math.abs(this.field_31019 - var1.field_31019);
   }

   public final float method_42205(class_9158 var1) {
      return Math.max(Math.abs(this.field_31017 - var1.field_31017), Math.abs(this.field_31019 - var1.field_31019));
   }
}
