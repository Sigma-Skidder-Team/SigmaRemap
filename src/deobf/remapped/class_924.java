package remapped;

import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class class_924 extends class_8894<class_924> {
   private final String field_4749;

   public class_924(String var1, String var2, int var3, int var4) {
      super(var1, var3, var4);
      this.field_4749 = var2;
   }

   public class_924 method_4044() {
      try {
         if (this.field_4749 != null) {
            this.field_45622.setRequestProperty("Content-Type", "application/json; charset=utf-8");
         }

         this.field_45622.setDoInput(true);
         this.field_45622.setDoOutput(true);
         this.field_45622.setUseCaches(false);
         this.field_45622.setRequestMethod("POST");
         OutputStream var3 = this.field_45622.getOutputStream();
         OutputStreamWriter var4 = new OutputStreamWriter(var3, "UTF-8");
         var4.write(this.field_4749);
         var4.close();
         var3.flush();
         return this;
      } catch (Exception var5) {
         throw new class_8647(var5.getMessage(), var5);
      }
   }
}
