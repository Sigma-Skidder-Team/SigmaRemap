package remapped;

import java.util.ArrayList;

public class class_8866 {
   private ArrayList field_45331 = new ArrayList();

   public void method_40791(class_1642 var1) {
      this.field_45331.add(var1);
   }

   public int method_40793() {
      return this.field_45331.size();
   }

   public float method_40790(int var1) {
      return ((class_1642)this.field_45331.get(var1)).method_7358();
   }

   public float method_40792(int var1) {
      return ((class_1642)this.field_45331.get(var1)).method_7359();
   }

   @Override
   public String toString() {
      return "[Path length=" + this.method_40793() + "]";
   }

   public void method_40789(int var1) {
      this.field_45331.remove(var1);
   }
}
