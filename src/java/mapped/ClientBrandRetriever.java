package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.module.impl.misc.FakeForge;

public class ClientBrandRetriever {
   public static String getClientModName() {
      return Client.getInstance().moduleManager != null && Client.getInstance().moduleManager.getModuleByClass(FakeForge.class).isEnabled()
         ? Client.getInstance().moduleManager.getModuleByClass(FakeForge.class).getStringSettingValueByName("Client Brand")
         : "vanilla";
   }
}
