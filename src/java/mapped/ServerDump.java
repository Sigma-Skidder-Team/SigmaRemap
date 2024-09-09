package mapped;

import java.util.Map;

public class ServerDump extends Class6255 {
   @Override
   public String method19220() {
      return "dump";
   }

   @Override
   public String method19221() {
      return "Dump information about your server, this is helpful if you report bugs.";
   }

   @Override
   public boolean method19222(Class9150 var1, String[] var2) {
      Class7133 var5 = new Class7133(
         System.getProperty("java.version"),
         System.getProperty("os.name"),
         Class9019.field41258,
         Class9019.method33359(),
         ViaVersion3.method27613().getClientName(),
         ViaVersion3.method27613().getType(),
         ViaVersion3.method27613().getVersion(),
         ViaVersion1.class.getPackage().getImplementationVersion(),
         ViaVersion3.method27614().method34430()
      );
      Map var6 = ViaVersion3.method27613().method27362().method21882();
      Class7801 var7 = new Class7801(var5, var6, ViaVersion3.method27613().method27364(), ViaVersion3.method27614().method34427().method20577());
      ViaVersion3.method27613().method27353(new ViaVersion8(this, var1, var5, var7));
      return true;
   }

   private String method19228(String var1) {
      return String.format("https://dump.viaversion.com/%s", var1);
   }

   // $VF: synthetic method
   public static String method19229(ServerDump var0, String var1) {
      return var0.method19228(var1);
   }
}
