package remapped;

import club.minnced.discord.rpc.DiscordEventHandlers;
import club.minnced.discord.rpc.DiscordRPC;
import club.minnced.discord.rpc.DiscordRichPresence;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;

public class SigmaMainClass {
   public static String clientName = "Jello";
   public static String clientVersion = "5.0.0b15";
   public static String clientProd = "Sigma Production";
   public static final boolean field_3956 = false;
   private static SigmaMainClass instance;
   private static MinecraftClient field_3950 = MinecraftClient.getInstance();
   private final File sigmaFolder = new File("sigma5");
   private JSONObjectImpl field_3974;
   private boolean field_3962 = true;
   private class_2827 field_3953;
   private class_201 field_3961;
   private EventManager eventManager;
   private ModuleManager moduleManager;
   private CommandManager commandManager;
   private GUIManager guiManager;
   private class_3116 field_3958;
   private class_4400 field_3952;
   private class_1857 field_3963;
   private class_2026 field_3969;
   private class_5571 field_3954;
   private class_8691 field_3981;
   private class_4746 field_3967;
   private SigmaIRC sigmaIRC;
   private AccountManager accountManager;
   private AgoraClient agoraClient;
   private SoundManager soundManager;
   private class_6080 notificationManager;
   private class_6645 field_3960;
   private class_4763 field_3973;
   private class_5937 field_3979;
   private class_3347 field_3968;
   private class_6015 field_3983 = class_6015.field_30640;
   public static ArrayList<class_8343> field_3959 = new ArrayList<class_8343>();
   public static boolean field_3951 = false;

   public static SigmaMainClass getInstance() {
      return instance != null ? instance : (instance = new SigmaMainClass());
   }

   public static class_2827 method_3306() {
      return getInstance().method_3326();
   }

   private SigmaMainClass() {
   }

   public void method_3317() {
      long var3 = System.currentTimeMillis();
      class_4414.method_20543();
      this.field_3953 = new class_3114(System.out, System.out, System.err);
      this.field_3953.method_12863("Initializing...");

      try {
         if (!this.sigmaFolder.exists()) {
            this.sigmaFolder.mkdirs();
         }

         this.field_3974 = class_357.method_1789(new File(this.sigmaFolder + "/config.json"));
      } catch (IOException var8) {
         var8.printStackTrace();
      }

      this.field_3961 = class_201.method_866();
      this.eventManager = new EventManager();
      this.commandManager = new CommandManager();
      this.commandManager.initList();
      NotificationIcons.initList();
      this.accountManager = new AccountManager();
      this.accountManager.initAndRunIRC();
      this.agoraClient = new AgoraClient();
      this.agoraClient.setupClient();
      this.guiManager = new GUIManager();
      this.field_3958 = new class_3116();
      this.field_3958.method_14473();
      this.field_3952 = new class_4400();
      this.field_3952.method_20492();
      this.field_3963 = new class_1857();
      this.field_3963.method_8226();
      this.field_3954 = new class_5571();
      this.field_3954.method_25292();
      this.field_3960 = new class_6645();
      this.field_3960.method_30524();
      this.field_3969 = new class_2026();
      this.field_3969.method_9478();
      this.soundManager = new SoundManager();
      this.soundManager.method_21204();
      this.notificationManager = new class_6080();
      this.notificationManager.method_27843();
      this.field_3981 = new class_8691();
      this.field_3981.method_39914();
      this.field_3973 = new class_4763();
      this.field_3973.method_21976();
      this.field_3967 = new class_4746();
      this.field_3967.method_21923();
      this.field_3979 = new class_5937();
      this.field_3979.method_27158();
      GLFW.glfwSetWindowTitle(field_3950.window.method_43181(), "Sigma 5.0");
      long var6 = System.currentTimeMillis();
      this.method_3321();
      this.field_3953.method_12863("Initialized.");
   }

   public void method_3336() {
      DiscordRPC var3 = DiscordRPC.INSTANCE;
      String var4 = "693493612754763907";
      String var5 = "";
      DiscordEventHandlers var6 = new DiscordEventHandlers();
      var6.ready = var0 -> System.out.println("Ready!");
      var3.Discord_Initialize(var4, var6, true, var5);
      DiscordRichPresence var7 = new DiscordRichPresence();
      var7.startTimestamp = System.currentTimeMillis() / 1000L;
      var7.state = "Playing Minecraft";
      var7.details = "Jello for Sigma";
      var7.largeImageKey = "jello";
      var3.Discord_UpdatePresence(var7);
      new Thread(() -> {
         while (!Thread.currentThread().isInterrupted()) {
            var3.Discord_RunCallbacks();

            try {
               Thread.sleep(2000L);
               if (getInstance().getAccountManager().method_23084() && (var7.smallImageKey == null || var7.smallImageKey.equals("premium"))) {
                  var7.smallImageKey = "premium";
                  var7.smallImageText = "Premium";
                  var3.Discord_UpdatePresence(var7);
               }
            } catch (InterruptedException var5x) {
            }
         }
      }, "RPC-Callback-Handler").start();
   }

   public void method_3321() {
   }

   public void method_3324() {
      this.field_3953.method_12863("Shutting down...");

      try {
         if (this.guiManager != null) {
            this.guiManager.method_31013(this.field_3974);
         }

         if (this.moduleManager != null) {
            this.moduleManager.method_849(this.field_3974);
         }

         class_4975 var3 = new class_4975(this.field_3974);
         if (this.eventManager != null) {
            this.eventManager.call(var3);
         }

         class_357.method_1791(var3.method_22870(), new File(this.sigmaFolder + "/config.json"));
      } catch (IOException var4) {
         this.field_3953.method_12864("Unable to shutdown correctly. Config may be corrupt?");
         var4.printStackTrace();
      }

      this.field_3953.method_12863("Done.");
   }

   public void method_3318() {
      try {
         class_357.method_1791(this.field_3974, new File(this.sigmaFolder + "/config.json"));
      } catch (IOException var4) {
         var4.printStackTrace();
      }
   }

   public void method_3330() {
      this.guiManager.method_31009();
   }

   public void method_3333() {
      GL11.glPushMatrix();
      double var3 = field_3950.window.method_43189() / (double)((float)Math.pow(field_3950.window.method_43189(), 2.0));
      GL11.glScaled(var3, var3, var3);
      GL11.glScaled((double) GUIManager.field_34898, (double) GUIManager.field_34898, (double) GUIManager.field_34898);
      GL11.glDisable(2912);
      class_3542.method_16491();
      class_3542.method_16413(0.0F, 0.0F, 1000.0F);
      class_3542.method_16442(519, 0.0F);
      class_3542.method_16488();
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(2896);
      class_3542.method_16425(class_5033.field_26042, class_8535.field_43697, class_5033.field_26047, class_8535.field_43699);
      NotificationIcons.field_11030.method_38419();
      getInstance().getEventManager().call(new class_7285());
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      class_3542.method_16361();
      class_3542.method_16491();
      class_3542.method_16488();
      class_3542.method_16442(518, 0.1F);
      GL11.glPopMatrix();
   }

   public void method_3329(class_8343 var1) {
      field_3959.add(var1);
   }

   public void method_3311() {
      if (!field_3959.isEmpty()) {
         try {
            for (class_8343 var4 : field_3959) {
               var4.method_38413();
            }

            field_3959.clear();
         } catch (ConcurrentModificationException var7) {
         }
      }

      if (getInstance().method_3312() != class_6015.field_30642) {
         double var5 = field_3950.window.method_43189() / (double)((float)Math.pow(field_3950.window.method_43189(), 2.0));
         GL11.glScaled(var5, var5, 1.0);
         GL11.glScaled((double) GUIManager.field_34898, (double) GUIManager.field_34898, 1.0);
         class_3542.method_16491();
         class_3542.method_16438();
         class_3542.method_16413(0.0F, 0.0F, 1000.0F);
         this.guiManager.method_30983();
         class_3542.method_16489();
         class_3542.method_16428();
         class_3542.method_16374();
         GL11.glAlphaFunc(518, 0.1F);
         TextureManager var10000 = field_3950.method_8577();
         field_3950.method_8577();
         var10000.method_35674(TextureManager.field_40364);
      }
   }

   public void method_3316() {
      if (field_3950 != null && field_3950.field_9601 != null && field_3950.field_9632 != null && !field_3951) {
         GL11.glTranslatef(0.0F, 0.0F, 0.0F);
         class_3542.method_16491();
         class_3542.method_16387(false);
         GL11.glDisable(2896);
         this.eventManager.call(new class_3368());
         class_3542.method_16428();
         class_3542.method_16387(true);
         TextureManager var10000 = field_3950.method_8577();
         field_3950.method_8577();
         var10000.method_35674(TextureManager.field_40364);
      }
   }

   public boolean method_3323() {
      return this.field_3962;
   }

   public void method_3320(boolean var1) {
      this.field_3962 = var1;
   }

   public class_2827 method_3326() {
      return this.field_3953;
   }

   public EventManager getEventManager() {
      return this.eventManager;
   }

   public ModuleManager getModuleManager() {
      return this.moduleManager;
   }

   public class_3116 method_3307() {
      return this.field_3958;
   }

   public class_4400 method_3331() {
      return this.field_3952;
   }

   public class_1857 method_3313() {
      return this.field_3963;
   }

   public GUIManager getGUIManager() {
      return this.guiManager;
   }

   public class_5571 method_3310() {
      return this.field_3954;
   }

   public class_6645 method_3319() {
      return this.field_3960;
   }

   public SoundManager getSoundManager() {
      return this.soundManager;
   }

   public class_6080 getNotificationManager() {
      return this.notificationManager;
   }

   public class_8691 method_3303() {
      return this.field_3981;
   }

   public class_2026 method_3300() {
      return this.field_3969;
   }

   public class_4763 method_3309() {
      return this.field_3973;
   }

   public AccountManager getAccountManager() {
      return this.accountManager;
   }

   public class_201 method_3308() {
      return this.field_3961;
   }

   public AgoraClient method_3322() {
      return this.agoraClient;
   }

   public CommandManager getCommandManager() {
      return this.commandManager;
   }

   public class_5937 method_3301() {
      return this.field_3979;
   }

   public JSONObjectImpl method_3304() {
      return this.field_3974;
   }

   public void method_3314() {
      this.field_3974 = new JSONObjectImpl();
   }

   public File method_3334() {
      return this.sigmaFolder;
   }

   public class_6015 method_3312() {
      return this.field_3983;
   }

   public void method_3327(class_6015 var1) {
      this.field_3983 = var1;
      if (var1 != class_6015.field_30644) {
         if (var1 == class_6015.field_30645) {
            this.method_3336();
            GLFW.glfwSetWindowTitle(field_3950.window.method_43181(), "Jello for Sigma 5.0");
         }
      } else {
         class_3054.method_13951();
         getInstance().getGUIManager().method_31006();
         GLFW.glfwSetWindowTitle(field_3950.window.method_43181(), "Classic Sigma 5.0");
      }

      if (this.moduleManager == null && class_1235.field_6812 != null) {
         this.moduleManager = new ModuleManager();
         this.moduleManager.registerAllModules(this.field_3983);
         this.moduleManager.method_842(this.field_3974);
         this.moduleManager.method_846();
      }

      System.gc();
   }
}
