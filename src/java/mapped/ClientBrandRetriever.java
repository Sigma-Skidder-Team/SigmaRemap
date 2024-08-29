package mapped;

import com.mentalfrostbyte.jello.Client;

public class ClientBrandRetriever {
   public static String getClientModName() {
      return Client.getInstance().getModuleManager() != null && Client.getInstance().getModuleManager().getModuleByClass(Class5170.class).isEnabled()
         ? Client.getInstance().getModuleManager().getModuleByClass(Class5170.class).getStringSettingValueByName("Client Brand")
         : "vanilla";
   }
}
