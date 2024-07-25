package remapped;

import java.util.Vector;
import javax.swing.JList;

public class class_3657 extends JList<String> {
   private static String[] field_17814;
   private final class_341 field_17815;
   private int field_17816;

   public class_3657(class_341 var1) {
      this.field_17815 = var1;
      var1.method_1686(this::method_16994);
   }

   public void method_16994() {
      if (this.field_17816++ % 20 == 0) {
         Vector var3 = new Vector();

         for (int var4 = 0; var4 < this.field_17815.method_1600().method_39951().size(); var4++) {
            var3.add(this.field_17815.method_1600().method_39951().get(var4).method_3247().getName());
         }

         this.setListData(var3);
      }
   }
}
