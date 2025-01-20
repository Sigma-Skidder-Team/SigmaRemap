package mapped;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.ClientMode;
import com.mentalfrostbyte.jello.unmapped.RandomModuleThread;
import org.apache.commons.io.IOUtils;
import totalcross.json.JSONException2;
import totalcross.json.JSONObject;

public class Class6814 {
   private final List<Configuration> savedConfigs = new ArrayList<>();
   private Configuration currentConfigs;

   private static final String configFolder = "/profiles/";
   private static final String configFileExtension = ".profile";

   public void saveConfig(Configuration config) {
      try {
         this.savedConfigs.add(0, config);
         File configItself = new File(Client.getInstance().file + configFolder + config.getName + configFileExtension);
         if (!configItself.exists()) {
            configItself.createNewFile();
         }
         IOUtils.write(config.method22985(new JSONObject()).toString(0), Files.newOutputStream(configItself.toPath()));
      } catch (IOException e) {
         throw new RuntimeException(e);
      }
   }

   public void listOnly(Configuration config) {
      this.savedConfigs.add(config);
   }

   public void removeConfig(Configuration config) {
      this.savedConfigs.remove(config);
   }

   public boolean checkConfig(Configuration config) {
      if (Client.getInstance().getClientMode() == ClientMode.CLASSIC && config.getName.equals("Classic")) {
         return false;
      } else if (this.savedConfigs.size() <= 1) {
         return false;
      } else {
         this.savedConfigs.remove(config);
         if (config == this.currentConfigs) {
            this.loadConfig(this.savedConfigs.get(0));
         }

         return true;
      }
   }

   public boolean removeConfig(String configName) {
      for (Configuration var5 : this.savedConfigs) {
         if (var5.getName.equals(configName) && this.checkConfig(var5)) {
            return true;
         }
      }

      return false;
   }

   public Configuration getConfigByName(String var1) {
      for (Configuration var5 : this.savedConfigs) {
         if (var5.getName.toLowerCase().equals(var1.toLowerCase())) {
            return var5;
         }
      }

      return null;
   }

   public void loadProfile(String name) throws IOException {
      File configFolderFolder = new File(Client.getInstance().file + configFolder);
      if (!configFolderFolder.exists()) {
         configFolderFolder.mkdirs();
      }

      File[] configsFound = configFolderFolder
            .listFiles((var0, var1x) -> var1x.toLowerCase().endsWith(configFileExtension));

      for (File config : configsFound) {
         try {
            JSONObject object = new JSONObject(IOUtils.toString(Files.newInputStream(config.toPath())));
            Configuration configuration = new Configuration().method22984(object);
            configuration.getName = config.getName().substring(0, config.getName().length() - ".profile".length());
            this.savedConfigs.add(configuration);
            if (configuration.getName.equalsIgnoreCase(name)) {
               this.currentConfigs = configuration;
            }
         } catch (JSONException2 var12) {
            Client.getInstance().getLogger().warn("Unable to load profile from " + config.getName());
         }
      }

      if (this.savedConfigs.isEmpty() || this.currentConfigs == null) {
         if (name == null || name.isEmpty()) {
            name = "Default";
         }

         this.savedConfigs.add(this.currentConfigs = new Configuration(name, new JSONObject()));
      }

      Client.getInstance().moduleManager.load(this.currentConfigs.serializedConfigData);
   }

   public boolean method20768(String var1) {
      for (Configuration var5 : this.savedConfigs) {
         if (var5.getName.toLowerCase().equals(var1.toLowerCase())) {
            return true;
         }
      }

      return false;
   }

   public void saveAndReplaceConfigs() throws IOException {
      this.currentConfigs.serializedConfigData = Client.getInstance().moduleManager
            .saveCurrentConfigToJSON(new JSONObject());
      File configFolderFolder = new File(Client.getInstance().file + configFolder);
      if (!configFolderFolder.exists()) {
         configFolderFolder.mkdirs();
      }

      File[] configs = configFolderFolder.listFiles((var0, var1) -> var1.toLowerCase().endsWith(configFileExtension));

      // Delete each old config file
      for (File configItself : configs) {
         configItself.delete();
      }

      // Create new config files for each saved configuration
      for (Configuration savedConfig : this.savedConfigs) {
         File configItself = new File(
               Client.getInstance().file + configFolder + savedConfig.getName + configFileExtension);
         if (!configItself.exists()) {
            configItself.createNewFile();
         }

         IOUtils.write(savedConfig.method22985(new JSONObject()).toString(0),
               Files.newOutputStream(configItself.toPath()));
      }
   }

   public Configuration getCurrentConfig() {
      return this.currentConfigs;
   }

   public void loadConfig(Configuration var1) {
      Client.getInstance().saveClientData();
      RandomModuleThread.field8343 = new HashMap<>();
      if (Client.getInstance().getClientMode() != ClientMode.CLASSIC) {
         this.currentConfigs.serializedConfigData = Client.getInstance().moduleManager
               .saveCurrentConfigToJSON(new JSONObject());
         this.currentConfigs = var1;
         Client.getInstance().getConfig().put("profile", var1.getName);
         Client.getInstance().moduleManager.load(var1.serializedConfigData);
         Client.getInstance().saveClientData();
      } else {
         this.currentConfigs.serializedConfigData = var1.method22986();
         Client.getInstance().getConfig().put("profile", "Classic");
         Client.getInstance().moduleManager.load(var1.serializedConfigData);
         Client.getInstance().saveClientData();
      }
   }

   public List<Configuration> getAllConfigs() {
      return this.savedConfigs;
   }
}
