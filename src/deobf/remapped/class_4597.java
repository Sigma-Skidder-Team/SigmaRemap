package remapped;

import java.io.IOException;
import java.util.List;

public class class_4597 implements class_6310<class_392> {
   private static String[] field_22348;
   private int field_22349;
   private int[] field_22347;

   public class_4597() {
   }

   public class_4597(class_8145 var1) {
      this.field_22349 = var1.method_37145();
      List var4 = var1.method_37114();
      this.field_22347 = new int[var4.size()];

      for (int var5 = 0; var5 < var4.size(); var5++) {
         this.field_22347[var5] = ((class_8145)var4.get(var5)).method_37145();
      }
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_22349 = var1.method_37778();
      this.field_22347 = var1.method_37762();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_22349);
      var1.method_37777(this.field_22347);
   }

   public void method_21305(class_392 var1) {
      var1.method_1917(this);
   }

   public int[] method_21304() {
      return this.field_22347;
   }

   public int method_21303() {
      return this.field_22349;
   }
}
