package mapped;

import java.io.IOException;
import java.util.ArrayList;

public class Class2462 extends IOException {
   private ArrayList field16544 = new ArrayList();

   public void method10467(Exception var1) {
      this.field16544.add(var1);
   }

   @Override
   public String getMessage() {
      String var3 = "Composite Exception: \n";

      for (int var4 = 0; var4 < this.field16544.size(); var4++) {
         var3 = var3 + "\t" + ((IOException)this.field16544.get(var4)).getMessage() + "\n";
      }

      return var3;
   }
}
