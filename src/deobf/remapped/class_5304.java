package remapped;

import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class class_5304 extends class_8894<class_5304> {
   private final String field_27101;

   public class_5304(String var1, String var2, int var3, int var4) {
      super(var1, var3, var4);
      this.field_27101 = var2;
   }

   public class_5304 method_24235() {
      try {
         if (this.field_27101 != null) {
            this.field_45622.setRequestProperty("Content-Type", "application/json; charset=utf-8");
         }

         this.field_45622.setDoOutput(true);
         this.field_45622.setDoInput(true);
         this.field_45622.setRequestMethod("PUT");
         OutputStream var3 = this.field_45622.getOutputStream();
         OutputStreamWriter var4 = new OutputStreamWriter(var3, "UTF-8");
         var4.write(this.field_27101);
         var4.close();
         var3.flush();
         return this;
      } catch (Exception var5) {
         throw new class_8647(var5.getMessage(), var5);
      }
   }
}
