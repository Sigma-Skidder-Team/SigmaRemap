package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import net.optifine.Config;

public class Class8511 implements Class8512 {
   private String field37210 = null;

   public Class8511(String var1) {
      this.field37210 = var1;
   }

   @Override
   public void method30152(String var1, byte[] var2, Throwable var3) {
      if (var2 != null) {
         try {
            String var6 = new String(var2, "ASCII");
            JsonParser var7 = new JsonParser();
            JsonElement var8 = var7.parse(var6);
            Class6859 var9 = new Class6859(this.field37210);
            Class7773 var10 = var9.method20904(var8);
            if (var10 != null) {
               var10.method25751(true);
               Class7749.method25669(this.field37210, var10);
            }
         } catch (Exception var11) {
            Config.method26810("Error parsing configuration: " + var1 + ", " + var11.getClass().getName() + ": " + var11.getMessage());
         }
      }
   }
}
