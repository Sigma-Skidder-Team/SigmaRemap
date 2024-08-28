package mapped;

import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Class6757 extends Class6754<Class6757> {
   private final String field29464;

   public Class6757(String var1, String var2, int var3, int var4) {
      super(var1, var3, var4);
      this.field29464 = var2;
   }

   public Class6757 method20589() {
      try {
         if (this.field29464 != null) {
            this.field29461.setRequestProperty("Content-Type", "application/json; charset=utf-8");
         }

         this.field29461.setDoOutput(true);
         this.field29461.setDoInput(true);
         this.field29461.setRequestMethod("PUT");
         OutputStream var3 = this.field29461.getOutputStream();
         OutputStreamWriter var4 = new OutputStreamWriter(var3, "UTF-8");
         var4.write(this.field29464);
         var4.close();
         var3.flush();
         return this;
      } catch (Exception var5) {
         throw new Class2505(var5.getMessage(), var5);
      }
   }
}
