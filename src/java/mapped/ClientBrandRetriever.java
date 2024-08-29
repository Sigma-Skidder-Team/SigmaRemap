package mapped;

import com.mentalfrostbyte.jello.Client;

public class ClientBrandRetriever {
   public static String getClientModName() {
      return Client.getInstance().getModuleManager() != null && Client.getInstance().getModuleManager().method14662(Class5170.class).method15996()
         ? Client.getInstance().getModuleManager().method14662(Class5170.class).getStringSettingValueByName("Client Brand")
         : "vanilla";
   }
}
