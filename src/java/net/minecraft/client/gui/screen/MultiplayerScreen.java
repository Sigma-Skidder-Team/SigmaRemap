package net.minecraft.client.gui.screen;

import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mojang.blaze3d.matrix.MatrixStack;
import mapped.*;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.multiplayer.ServerList;
import net.minecraft.client.network.ServerPinger;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class MultiplayerScreen extends Screen {
   private static final Logger LOGGER = LogManager.getLogger();
   private final ServerPinger oldServerPinger = new ServerPinger();
   public final Screen parentScreen;
   public ServerSelectionList serverListSelector;
   private ServerList savedServerList;
   private Button btnEditServer;
   private Button btnSelectServer;
   private Button btnDeleteServer;
   private List<ITextComponent> hoveringText;
   private ServerData selectedServer;
   private LanServerList lanServerList;
   private LanServerFindThread lanServerDetector;
   private boolean initialized;

   public MultiplayerScreen(Screen var1) {
      super(new TranslationTextComponent("multiplayer.title"));
      this.parentScreen = var1;
   }

   public void init() {
      super.init();
      this.mc.keyboardListener.enableRepeatEvents(true);
      if (this.initialized) {
         this.serverListSelector.updateSize(this.width, this.height, 32, this.height - 64);
      } else {
         this.initialized = true;
         this.savedServerList = new ServerList(this.mc);
         this.savedServerList.loadServerList();
         this.lanServerList = new LanServerList();

         try {
            this.lanServerDetector = new LanServerFindThread(this.lanServerList);
            this.lanServerDetector.start();
         } catch (Exception exception) {
            LOGGER.warn("Unable to start LAN server detection: {}", exception.getMessage());
         }

         this.serverListSelector = new ServerSelectionList(this, this.mc, this.width, this.height, 32, this.height - 64, 36);
         this.serverListSelector.updateOnlineServers(this.savedServerList);
      }

      this.children.add(this.serverListSelector);
      this.btnSelectServer = this.addButton(
         new Button(this.width / 2 - 154, this.height - 52, 100, 20, new TranslationTextComponent("selectServer.select"), var1 -> this.connectToSelected())
      );
      this.addButton(
         new Button(this.width / 2 - 50, this.height - 52, 100, 20, new TranslationTextComponent("selectServer.direct"), var1 -> {
            this.selectedServer = new ServerData(I18n.format("selectServer.defaultName"), "", false);
            this.mc.displayGuiScreen(new ServerListScreen(this, this::func_214290_d, this.selectedServer));
         })
      );
      this.addButton(
         new Button(this.width / 2 + 4 + 50, this.height - 52, 100, 20, new TranslationTextComponent("selectServer.add"), var1 -> {
            this.selectedServer = new ServerData(I18n.format("selectServer.defaultName"), "", false);
            this.mc.displayGuiScreen(new AddServerScreen(this, this::func_214284_c, this.selectedServer));
         })
      );
      this.btnEditServer = this.addButton(
         new Button(this.width / 2 - 154, this.height - 28, 70, 20, new TranslationTextComponent("selectServer.edit"), var1 -> {
            ServerSelectionList.Entry serverselectionlist$entry = this.serverListSelector.getSelected();
            if (serverselectionlist$entry instanceof ServerSelectionList.NormalEntry) {
               ServerData serverdata = ((ServerSelectionList.NormalEntry)serverselectionlist$entry).getServerData();
               this.selectedServer = new ServerData(serverdata.serverName, serverdata.serverIP, false);
               this.selectedServer.copyFrom(serverdata);
               this.mc.displayGuiScreen(new AddServerScreen(this, this::func_214292_b, this.selectedServer));
            }
         })
      );
      this.btnDeleteServer = this.addButton(
         new Button(this.width / 2 - 74, this.height - 28, 70, 20, new TranslationTextComponent("selectServer.delete"), var1 -> {
            ServerSelectionList.Entry serverselectionlist$entry = this.serverListSelector.getSelected();
            if (serverselectionlist$entry instanceof ServerSelectionList.NormalEntry) {
               String s = ((ServerSelectionList.NormalEntry)serverselectionlist$entry).getServerData().serverName;
               if (s != null) {
                  TranslationTextComponent itextcomponent = new TranslationTextComponent("selectServer.deleteQuestion");
                  TranslationTextComponent itextcomponent1 = new TranslationTextComponent("selectServer.deleteWarning", s);
                  TranslationTextComponent itextcomponent2 = new TranslationTextComponent("selectServer.deleteButton");
                  ITextComponent itextcomponent3 = DialogTexts.GUI_CANCEL;
                  this.mc.displayGuiScreen(new ConfirmScreen(this::func_214285_a, itextcomponent, itextcomponent1, itextcomponent2, itextcomponent3));
               }
            }
         })
      );
      this.addButton(
         new Button(this.width / 2 + 4, this.height - 28, 70, 20, new TranslationTextComponent("selectServer.refresh"), var1 -> this.method6231())
      );
      this.addButton(
         new Button(this.width / 2 + 4 + 76, this.height - 28, 75, 20, DialogTexts.GUI_CANCEL, var1 -> this.mc.displayGuiScreen(this.parentScreen))
      );
      this.method6239();
   }

   @Override
   public void tick() {
      super.tick();
      if (this.lanServerList.method37555()) {
         List var3 = this.lanServerList.method37557();
         this.lanServerList.method37556();
         this.serverListSelector.method6082(var3);
      }

      this.oldServerPinger.method34006();
   }

   @Override
   public void onClose() {
      this.mc.keyboardListener.enableRepeatEvents(false);
      if (this.lanServerDetector != null) {
         this.lanServerDetector.interrupt();
         this.lanServerDetector = null;
      }

      this.oldServerPinger.method34007();
   }

   private void method6231() {
      this.mc.displayGuiScreen(new MultiplayerScreen(this.parentScreen));
   }

   private void func_214285_a(boolean var1) {
      ServerSelectionList.Entry var4 = this.serverListSelector.getSelected();
      if (var1 && var4 instanceof ServerSelectionList.NormalEntry) {
         this.savedServerList.method27097(((ServerSelectionList.NormalEntry)var4).getServerData());
         this.savedServerList.method27095();
         this.serverListSelector.method6024((ServerSelectionList.Entry)null);
         this.serverListSelector.updateOnlineServers(this.savedServerList);
      }

      this.mc.displayGuiScreen(this);
   }

   private void func_214292_b(boolean var1) {
      ServerSelectionList.Entry var4 = this.serverListSelector.getSelected();
      if (var1 && var4 instanceof ServerSelectionList.NormalEntry) {
         ServerData var5 = ((ServerSelectionList.NormalEntry)var4).getServerData();
         var5.serverName = this.selectedServer.serverName;
         var5.serverIP = this.selectedServer.serverIP;
         var5.copyFrom(this.selectedServer);
         this.savedServerList.method27095();
         this.serverListSelector.updateOnlineServers(this.savedServerList);
      }

      this.mc.displayGuiScreen(this);
   }

   private void func_214284_c(boolean var1) {
      if (var1) {
         this.savedServerList.method27098(this.selectedServer);
         this.savedServerList.method27095();
         this.serverListSelector.method6024((ServerSelectionList.Entry)null);
         this.serverListSelector.updateOnlineServers(this.savedServerList);
      }

      this.mc.displayGuiScreen(this);
   }

   private void func_214290_d(boolean var1) {
      if (!var1) {
         this.mc.displayGuiScreen(this);
      } else {
         this.method6237(this.selectedServer);
      }
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (!super.keyPressed(var1, var2, var3)) {
         if (var1 != 294) {
            if (this.serverListSelector.getSelected() == null) {
               return false;
            } else if (var1 != 257 && var1 != 335) {
               return this.serverListSelector.keyPressed(var1, var2, var3);
            } else {
               this.connectToSelected();
               return true;
            }
         } else {
            this.method6231();
            return true;
         }
      } else {
         return true;
      }
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.hoveringText = null;
      this.renderBackground(var1);
      this.serverListSelector.render(var1, var2, var3, var4);
      drawCenteredString(var1, this.font, this.title, this.width / 2, 20, 16777215);
      super.render(var1, var2, var3, var4);
      if (this.hoveringText != null) {
         this.method2460(var1, this.hoveringText, var2, var3);
      }
   }

   public void connectToSelected() {
      ServerSelectionList.Entry var3 = this.serverListSelector.getSelected();
      if (!(var3 instanceof ServerSelectionList.NormalEntry)) {
         if (var3 instanceof Class1158) {
            Class9162 var4 = ((Class1158)var3).method5555();
            this.method6237(new ServerData(var4.method34207(), var4.method34208(), true));
         }
      } else {
         this.method6237(((ServerSelectionList.NormalEntry)var3).getServerData());
      }
   }

   private void method6237(ServerData var1) {
    /*  if (var1.field33189 != null && var1.field33189.contains("hypixel.net") && Class8005.method27372().method18582() < Class5989.field26155.method18582()) {
         Class8005.field34417 = Class5989.field26155;
      }*/

      MultiUtilities.method17746(var1);
      this.mc.displayGuiScreen(new ConnectingScreen(this, this.mc, var1));
   }

   public void method6238(ServerSelectionList.Entry var1) {
      this.serverListSelector.method6024(var1);
      this.method6239();
   }

   public void method6239() {
      this.btnSelectServer.active = false;
      this.btnEditServer.active = false;
      this.btnDeleteServer.active = false;
      ServerSelectionList.Entry var3 = this.serverListSelector.getSelected();
      if (var3 != null && !(var3 instanceof Class1159)) {
         this.btnSelectServer.active = true;
         if (var3 instanceof ServerSelectionList.NormalEntry) {
            this.btnEditServer.active = true;
            this.btnDeleteServer.active = true;
         }
      }
   }

   public ServerPinger getOldServerPinger() {
      return this.oldServerPinger;
   }

   public void method6241(List<ITextComponent> var1) {
      this.hoveringText = var1;
   }

   public ServerList method6242() {
      return this.savedServerList;
   }
}
