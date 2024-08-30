package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.module.impl.misc.FakeForge;

public class ClientBrandRetriever {
   public static String getClientModName() {
      return Client.getInstance().getModuleManager() != null && Client.getInstance().getModuleManager().getModuleByClass(FakeForge.class).isEnabled()
         ? Client.getInstance().getModuleManager().getModuleByClass(FakeForge.class).getStringSettingValueByName("Client Brand")
         : "vanilla";
   }
}
