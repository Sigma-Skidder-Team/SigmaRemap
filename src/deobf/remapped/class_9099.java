package remapped;

import java.util.ArrayList;
import java.util.Collection;

public class class_9099 {
   private static String[] field_46606;
   private ArrayList field_46607 = new ArrayList();

   public void method_41937(class_6500 var1) {
      this.field_46607.add(var1);
   }

   public int method_41941() {
      return this.field_46607.size();
   }

   public class_6500 method_41939(int var1) {
      return (class_6500)this.field_46607.get(var1);
   }

   public boolean method_41940(class_6500 var1) {
      return this.field_46607.contains(var1);
   }

   public void method_41938(Collection var1) {
      var1.addAll(this.field_46607);
   }
}
