package mapped;

import com.google.gson.JsonObject;
import com.mentalfrostbyte.jello.viaversion.commands.CustomCommandManager;
import com.mentalfrostbyte.jello.viaversion.data.PlayerData;
import com.mentalfrostbyte.jello.viaversion.data.PlayerHandler;
import com.mentalfrostbyte.jello.viaversion.managers.AbstractResourceManager;
import com.mentalfrostbyte.jello.viaversion.managers.SmallResourceManager;
import com.mentalfrostbyte.jello.viaversion.task.AbstractScheduledTask;

import java.io.File;
import java.util.UUID;
import java.util.logging.Logger;

public interface Class8006<T> {
   Logger getLogger();

   String getClientName();

   String getType();

   default boolean method27374() {
      return false;
   }

   String getVersion();

   AbstractScheduledTask scheduleTask(Runnable var1);

   AbstractScheduledTask scheduleTaskWithDelay(Runnable var1);

   AbstractScheduledTask scheduleTaskWithDelay(Runnable var1, Long var2);

   AbstractScheduledTask scheduleTaskImmediately(Runnable var1, Long var2);

   void cancelTask(AbstractScheduledTask var1);

   PlayerData[] getPlayerData();

   void updatePlayerData(UUID var1, String var2);

   boolean validatePlayerData(UUID var1, String var2);

   default boolean method27375(Class7161 var1, String var2) {
      if (!var1.method22488()) {
         UUID var5 = var1.<Class6038>method22438(Class6038.class).method18681();
         return var5 != null ? this.validatePlayerData(var5, var2) : false;
      } else {
         return false;
      }
   }

   boolean isMultiplayer();

   PlayerHandler<T> getEventHandler();

   AbstractResourceManager getResourceManager();

   SmallResourceManager getResourceManager2();

   File getConfigFile();

   void cancelAllTasks();

   JsonObject getPlayerStatus();

   boolean isConnectionSecure();

   CustomCommandManager getCustomCommandManager();
}
