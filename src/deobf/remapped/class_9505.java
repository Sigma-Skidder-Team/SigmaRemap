package remapped;

import java.io.IOException;
import java.util.ArrayList;

public class class_9505 extends IOException {
   private ArrayList field_48403 = new ArrayList();

   public void method_43873(Exception var1) {
      this.field_48403.add(var1);
   }

   @Override
   public String getMessage() {
      String var3 = "Composite Exception: \n";

      for (int var4 = 0; var4 < this.field_48403.size(); var4++) {
         var3 = var3 + "\t" + ((IOException)this.field_48403.get(var4)).getMessage() + "\n";
      }

      return var3;
   }
}
