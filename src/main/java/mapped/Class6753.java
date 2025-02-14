package mapped;

import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Class6753 extends Class6754<Class6753> {
   private final String field29460;

   public Class6753(String var1, String var2, int var3, int var4) {
      super(var1, var3, var4);
      this.field29460 = var2;
   }

   public Class6753 method20589() {
      try {
         if (this.field29460 != null) {
            this.field29461.setRequestProperty("Content-Type", "application/json; charset=utf-8");
         }

         this.field29461.setDoInput(true);
         this.field29461.setDoOutput(true);
         this.field29461.setUseCaches(false);
         this.field29461.setRequestMethod("POST");
         OutputStream var3 = this.field29461.getOutputStream();
         OutputStreamWriter var4 = new OutputStreamWriter(var3, "UTF-8");
         var4.write(this.field29460);
         var4.close();
         var3.flush();
         return this;
      } catch (Exception var5) {
         throw new Class2505(var5.getMessage(), var5);
      }
   }
}
