package com.mentalfrostbyte.jello.unmapped;

import com.google.gson.JsonObject;
import com.mentalfrostbyte.jello.viaversion.commands.CommandRegistrar;
import com.mentalfrostbyte.jello.viaversion.commands.CustomCommandExecutor;
import com.mentalfrostbyte.jello.viaversion.data.PlayerData;
import com.mentalfrostbyte.jello.viaversion.data.PlayerHandler;
import com.mentalfrostbyte.jello.viaversion.event.EventHandler;
import com.mentalfrostbyte.jello.viaversion.managers.*;
import com.mentalfrostbyte.jello.viaversion.commands.CustomCommandManager;
import com.mentalfrostbyte.jello.viaversion.task.AbstractScheduledTask;
import com.mentalfrostbyte.jello.viaversion.task.ScheduledTask;
import com.mentalfrostbyte.jello.viaversion.task.TaskScheduler;
import io.netty.channel.Channel;
import mapped.*;
import net.minecraft.client.Minecraft;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class JelloPortal implements Class8006<ClientPlayerEntity> {
   public static Channel clientChannel;
   public static ViaVerList currentVersion = JelloPortal.defaultVersion;
   public static final ViaVerList defaultVersion = ViaVerList._1_16_4;
   private Logger logger;
   private Logger customLogger;
   private Path configPath;
   private EventHandler eventHandler;
   private ResourceManager resourceManager;
   private PacketManager packetManager;
   private TaskScheduler taskScheduler;
   private CustomCommandManager commandManager;
   private List<ScheduledTask> scheduledTasks = new ArrayList<>();

   public JelloPortal(Channel channel) {
      if (channel != null) {
         clientChannel = channel;
      }

      if (ViaVersion3.getInstance() != null) {
         ViaVersion3.getInstance().initialize();
      }

      this.taskScheduler = new TaskScheduler();
      Class7777 var4 = new Class7777();
      this.eventHandler = new com.mentalfrostbyte.jello.viaversion.event.EventHandler();
      this.resourceManager = new ResourceManager(new File("assets/viaversion/"));
      this.customLogger = new JelloPortalLogger(this.logger);
      this.commandManager = new CustomCommandManager();
      ViaVersion3.initialize(ViaVersion1.getInstance().create(this).register(var4).register(new CommandRegistrar()).register(new CustomCommandExecutor()).initialize());
      ViaVersion3.getInstance().start();
      if (channel != null) {
         this.packetManager = new PacketManager(channel);
      }
   }

   public static int getFakeInventoryThreshold() {
      return defaultVersion.getFakeInvThreshold();
   }

   public static int getFakeInvStatus() {
      return currentVersion == null ? ViaVerList._1_8_x.getFakeInvThreshold() : currentVersion.getFakeInvThreshold();
   }

   @Override
   public String getClientName() {
      return "Jello";
   }

   @Override
   public String getType() {
      return "Unknown";
   }

   @Override
   public String getVersion() {
      return "1.0";
   }

   @Override
   public AbstractScheduledTask scheduleTask(Runnable task) {
      return this.scheduleTaskWithDelay(task);
   }

   @Override
   public AbstractScheduledTask scheduleTaskWithDelay(Runnable task) {
      return this.scheduleTaskWithDelay(task, 0L);
   }

   @Override
   public AbstractScheduledTask scheduleTaskWithDelay(Runnable task, Long delay) {
      if (Minecraft.getInstance().world != null) {
         ScheduledTask scheduledTask = new ScheduledTask(this.taskScheduler.scheduleTask(this, task).setDelay(delay * 50L, TimeUnit.MILLISECONDS).start());
         this.scheduledTasks.add(scheduledTask);
         return scheduledTask;
      } else {
         task.run();
         return null;
      }
   }

   @Override
   public AbstractScheduledTask scheduleTaskImmediately(Runnable task, Long delay) {
      ScheduledTask scheduledTask = new ScheduledTask(this.taskScheduler.scheduleTask(this, task).setDelay(delay * 50L, TimeUnit.MILLISECONDS).start());
      this.scheduledTasks.add(scheduledTask);
      return scheduledTask;
   }

   @Override
   public void cancelTask(AbstractScheduledTask var1) {
      if (var1 instanceof ScheduledTask) {
         ((ScheduledTask)var1).getTaskHandle().cancel();
      }
   }

   @Override
   public PlayerData[] getPlayerData() {
      return null;
   }

   @Override
   public void updatePlayerData(UUID var1, String var2) {
   }

   @Override
   public boolean validatePlayerData(UUID var1, String var2) {
      return false;
   }

   @Override
   public boolean isMultiplayer() {
      return false;
   }

   @Override
   public SmallResourceManager getResourceManager2() {
      return this.resourceManager;
   }

   @Override
   public void cancelAllTasks() {
      for (ScheduledTask var4 : this.scheduledTasks) {
         var4.getTaskHandle().cancel();
      }
   }

   @Override
   public JsonObject getPlayerStatus() {
      return new JsonObject();
   }

   @Override
   public boolean isConnectionSecure() {
      return true;
   }

   @Override
   public Logger getLogger() {
      return this.customLogger;
   }

   @Override
   public PlayerHandler<ClientPlayerEntity> getEventHandler() {
      return this.eventHandler;
   }

   @Override
   public AbstractResourceManager getResourceManager() {
      return this.resourceManager;
   }

   public void shutdownPortal() {
      try {
         this.taskScheduler.shutdown();
         clientChannel.close();
      } catch (InterruptedException var4) {
      }
   }

   @Override
   public File getConfigFile() {
      return null;
   }

   @Override
   public CustomCommandManager getCustomCommandManager() {
      return this.commandManager;
   }

   public static ViaVerList getCurrentVersion() {
      return !Minecraft.getInstance().isSingleplayer() ? currentVersion : defaultVersion;
   }

   public PacketManager method2getPacketManager373() {
      return this.packetManager;
   }
}
