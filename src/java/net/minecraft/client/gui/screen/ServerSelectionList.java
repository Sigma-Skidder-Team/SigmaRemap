package net.minecraft.client.gui.screen;

import com.google.common.collect.Lists;
import com.google.common.hash.Hashing;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.multiplayer.ServerList;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.texture.NativeImage;
import net.minecraft.client.util.Util;
import net.minecraft.util.DefaultUncaughtExceptionHandler;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SharedConstants;
import net.minecraft.util.text.*;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.UnknownHostException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

public class ServerSelectionList extends Class1274<ServerSelectionList.Entry> {
   private static final Logger field6820 = LogManager.getLogger();
   private static final ThreadPoolExecutor field6821 = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new DefaultUncaughtExceptionHandler(field6820)).build()
   );
   private static final ResourceLocation field6822 = new ResourceLocation("textures/misc/unknown_server.png");
   private static final ResourceLocation field6823 = new ResourceLocation("textures/gui/server_selection.png");
   private static final ITextComponent field_214358_b = new TranslationTextComponent("lanServer.scanning");
   private static final ITextComponent field6825 = new TranslationTextComponent("multiplayer.status.cannot_resolve").mergeStyle(TextFormatting.DARK_RED);
   private static final ITextComponent field6826 = new TranslationTextComponent("multiplayer.status.cannot_connect").mergeStyle(TextFormatting.DARK_RED);
   private static final ITextComponent field6827 = new TranslationTextComponent("multiplayer.status.incompatible");
   private static final ITextComponent field6828 = new TranslationTextComponent("multiplayer.status.no_connection");
   private static final ITextComponent field6829 = new TranslationTextComponent("multiplayer.status.pinging");
   private final MultiplayerScreen owner;
   private final List<NormalEntry> serverListInternet = Lists.newArrayList();
   private final Entry field6832 = new Class1159();
   private final List<Class1158> field6833 = Lists.newArrayList();

   public ServerSelectionList(MultiplayerScreen var1, Minecraft var2, int var3, int var4, int var5, int var6, int var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.owner = var1;
   }

   private void setList() {
      this.method6027();
      this.serverListInternet.forEach(this::method6030);
      this.method6030(this.field6832);
      this.field6833.forEach(this::method6030);
   }

   public void method6024(Entry var1) {
      super.method6024(var1);
      if (this.getSelected() instanceof NormalEntry) {
         NarratorChatListener.INSTANCE
            .say(new TranslationTextComponent("narrator.select", NormalEntry.method5554((NormalEntry)this.getSelected()).serverName).getString());
      }

      this.owner.method6239();
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      Entry var6 = this.getSelected();
      return var6 != null && var6.keyPressed(var1, var2, var3) || super.keyPressed(var1, var2, var3);
   }

   @Override
   public void method6049(Class2220 var1) {
      this.method6051(var1, var0 -> !(var0 instanceof Class1159));
   }

   public void updateOnlineServers(ServerList var1) {
      this.serverListInternet.clear();

      for (int i = 0; i < var1.countServers(); i++) {
         this.serverListInternet.add(new NormalEntry(this, this.owner, var1.getServerData(i)));
      }

      this.setList();
   }

   public void method6082(List<Class9162> var1) {
      this.field6833.clear();

      for (Class9162 var5 : var1) {
         this.field6833.add(new Class1158(this.owner, var5));
      }

      this.setList();
   }

   @Override
   public int method6048() {
      return super.method6048() + 30;
   }

   @Override
   public int method6022() {
      return super.method6022() + 85;
   }

   @Override
   public boolean method6057() {
      return this.owner.getListener() == this;
   }

   // $VF: synthetic method
   public static ITextComponent getfield_214358_b() {
      return field_214358_b;
   }

   // $VF: synthetic method
   public static ThreadPoolExecutor method6085() {
      return field6821;
   }

   // $VF: synthetic method
   public static ITextComponent method6086() {
      return field6827;
   }

   // $VF: synthetic method
   public static ITextComponent method6087() {
      return field6828;
   }

   // $VF: synthetic method
   public static ITextComponent method6088() {
      return field6829;
   }

   // $VF: synthetic method
   public static ResourceLocation method6089() {
      return field6822;
   }

   // $VF: synthetic method
   public static ResourceLocation method6090() {
      return field6823;
   }

   // $VF: synthetic method
   public static Logger method6091() {
      return field6820;
   }

   // $VF: synthetic method
   public static void method6092(ServerSelectionList var0, Entry var1) {
      var0.method6042(var1);
   }

   // $VF: synthetic method
   public static int method6093(ServerSelectionList var0, int var1) {
      return var0.method6055(var1);
   }

   // $VF: synthetic method
   public static ITextComponent method6094() {
      return field6825;
   }

   // $VF: synthetic method
   public static ITextComponent method6095() {
      return field6826;
   }

   public static class NormalEntry extends Entry {
      private final MultiplayerScreen owner;
      private final Minecraft mc;
      private final ServerData server;
      private final ResourceLocation serverIcon;
      private String lastIconB64;
      private DynamicTexture icon;
      private long lastClickTime;
      public final ServerSelectionList parent;

      public NormalEntry(ServerSelectionList var1, MultiplayerScreen p_i50669_2_, ServerData p_i50669_3_) {
         this.parent = var1;
         this.owner = p_i50669_2_;
         this.server = p_i50669_3_;
         this.mc = Minecraft.getInstance();
         this.serverIcon = new ResourceLocation("servers/" + Hashing.sha1().hashUnencodedChars(p_i50669_3_.serverIP) + "/icon");
         this.icon = (DynamicTexture)this.mc.getTextureManager().getTexture(this.serverIcon);
      }

      @Override
      public void render(MatrixStack var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
         if (!this.server.pinged) {
            this.server.pinged = true;
            this.server.pingToServer = -2L;
            this.server.serverMOTD = StringTextComponent.EMPTY;
            this.server.populationInfo = StringTextComponent.EMPTY;
            method6085().submit(() -> {
               try {
                  this.owner.getOldServerPinger().ping(this.server, () -> this.mc.execute(this::func_241613_a_));
               } catch (UnknownHostException var4x) {
                  this.server.pingToServer = -1L;
                  this.server.serverMOTD = method6094();
                  System.out.println("LINE 202 ServerSelectionList");
               } catch (Exception var5x) {
                  this.server.pingToServer = -1L;
                  this.server.serverMOTD = method6095();
                  System.out.println("LINE 206 ServerSelectionList");
               }
            });
         }

         boolean var13 = this.server.field33193 != SharedConstants.getVersion().getProtocolVersion();
         this.mc.fontRenderer.method38801(var1, this.server.serverName, (float)(var4 + 32 + 3), (float)(var3 + 1), 16777215);
         List var14 = this.mc.fontRenderer.trimStringToWidth(this.server.serverMOTD, var5 - 32 - 2);

         for (int var15 = 0; var15 < Math.min(var14.size(), 2); var15++) {
            this.mc.fontRenderer.method38804(var1, (Class9125)var14.get(var15), (float)(var4 + 32 + 3), (float)(var3 + 12 + 9 * var15), 8421504);
         }

         Object var26 = !var13 ? this.server.populationInfo : this.server.field33194.deepCopy().mergeStyle(TextFormatting.RED);
         int var16 = this.mc.fontRenderer.method38821((ITextProperties)var26);
         this.mc.fontRenderer.func_243248_b(var1, (ITextComponent)var26, (float)(var4 + var5 - var16 - 15 - 2), (float)(var3 + 1), 8421504);
         int var17 = 0;
         int var18;
         Object var19;
         List var20;
         if (!var13) {
            if (this.server.pinged && this.server.pingToServer != -2L) {
               if (this.server.pingToServer >= 0L) {
                  if (this.server.pingToServer >= 150L) {
                     if (this.server.pingToServer >= 300L) {
                        if (this.server.pingToServer >= 600L) {
                           if (this.server.pingToServer >= 1000L) {
                              var18 = 4;
                           } else {
                              var18 = 3;
                           }
                        } else {
                           var18 = 2;
                        }
                     } else {
                        var18 = 1;
                     }
                  } else {
                     var18 = 0;
                  }
               } else {
                  var18 = 5;
               }

               if (this.server.pingToServer >= 0L) {
                  var19 = new TranslationTextComponent("multiplayer.status.ping", this.server.pingToServer);
                  var20 = this.server.field33196;
               } else {
                  var19 = method6087();
                  var20 = Collections.emptyList();
               }
            } else {
               var17 = 1;
               var18 = (int)(Util.milliTime() / 100L + (long)(var2 * 2) & 7L);
               if (var18 > 4) {
                  var18 = 8 - var18;
               }

               var19 = method6088();
               var20 = Collections.emptyList();
            }
         } else {
            var18 = 5;
            var19 = method6086();
            var20 = this.server.field33196;
         }

         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.mc.getTextureManager().bindTexture(field6453);
         method5699(var1, var4 + var5 - 15, var3, (float)(var17 * 10), (float)(176 + var18 * 8), 10, 8, 256, 256);
         String var21 = this.server.method25580();
         if (!Objects.equals(var21, this.lastIconB64)) {
            if (!this.method5549(var21)) {
               this.server.method25581((String)null);
               this.func_241613_a_();
            } else {
               this.lastIconB64 = var21;
            }
         }

         if (this.icon == null) {
            this.method5547(var1, var4, var3, method6089());
         } else {
            this.method5547(var1, var4, var3, this.serverIcon);
         }

         int var22 = var7 - var4;
         int var23 = var8 - var3;
         if (var22 >= var5 - 15 && var22 <= var5 - 5 && var23 >= 0 && var23 <= 8) {
            this.owner.method6241(Collections.<ITextComponent>singletonList((ITextComponent)var19));
         } else if (var22 >= var5 - var16 - 15 - 2 && var22 <= var5 - 15 - 2 && var23 >= 0 && var23 <= 8) {
            this.owner.method6241(var20);
         }

         if (this.mc.gameSettings.touchscreen || var9) {
            this.mc.getTextureManager().bindTexture(method6090());
            fill(var1, var4, var3, var4 + 32, var3 + 32, -1601138544);
            RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
            int var24 = var7 - var4;
            int var25 = var8 - var3;
            if (this.method5548()) {
               if (var24 < 32 && var24 > 16) {
                  method5699(var1, var4, var3, 0.0F, 32.0F, 32, 32, 256, 256);
               } else {
                  method5699(var1, var4, var3, 0.0F, 0.0F, 32, 32, 256, 256);
               }
            }

            if (var2 > 0) {
               if (var24 < 16 && var25 < 16) {
                  method5699(var1, var4, var3, 96.0F, 32.0F, 32, 32, 256, 256);
               } else {
                  method5699(var1, var4, var3, 96.0F, 0.0F, 32, 32, 256, 256);
               }
            }

            if (var2 < this.owner.method6242().countServers() - 1) {
               if (var24 < 16 && var25 > 16) {
                  method5699(var1, var4, var3, 64.0F, 32.0F, 32, 32, 256, 256);
               } else {
                  method5699(var1, var4, var3, 64.0F, 0.0F, 32, 32, 256, 256);
               }
            }
         }
      }

      public void func_241613_a_() {
         this.owner.method6242().method27095();
      }

      public void method5547(MatrixStack var1, int var2, int var3, ResourceLocation var4) {
         this.mc.getTextureManager().bindTexture(var4);
         RenderSystem.enableBlend();
         method5699(var1, var2, var3, 0.0F, 0.0F, 32, 32, 32, 32);
         RenderSystem.disableBlend();
      }

      private boolean method5548() {
         return true;
      }

      private boolean method5549(String var1) {
         if (var1 == null) {
            this.mc.getTextureManager().method1081(this.serverIcon);
            if (this.icon != null && this.icon.method1141() != null) {
               this.icon.method1141().close();
            }

            this.icon = null;
         } else {
            try {
               NativeImage var4 = NativeImage.method7909(var1);
               Validate.validState(var4.method7886() == 64, "Must be 64 pixels wide", new Object[0]);
               Validate.validState(var4.method7887() == 64, "Must be 64 pixels high", new Object[0]);
               if (this.icon == null) {
                  this.icon = new DynamicTexture(var4);
               } else {
                  this.icon.method1142(var4);
                  this.icon.method1140();
               }

               this.mc.getTextureManager().loadTexture(this.serverIcon, this.icon);
            } catch (Throwable var5) {
               System.out.println("LINE 371 ServerSelectionList");
               method6091().error("Invalid icon for server {} ({})", this.server.serverName, this.server.serverIP, var5);
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean keyPressed(int var1, int var2, int var3) {
         if (Screen.method2476()) {
            ServerSelectionList var6 = this.owner.serverListSelector;
            int var7 = var6.getEventListeners().indexOf(this);
            if (var1 == 264 && var7 < this.owner.method6242().countServers() - 1 || var1 == 265 && var7 > 0) {
               this.method5550(var7, var1 != 264 ? var7 - 1 : var7 + 1);
               return true;
            }
         }

         return super.keyPressed(var1, var2, var3);
      }

      private void method5550(int var1, int var2) {
         this.owner.method6242().method27100(var1, var2);
         this.owner.serverListSelector.updateOnlineServers(this.owner.method6242());
         Entry var5 = this.owner.serverListSelector.getEventListeners().get(var2);
         this.owner.serverListSelector.method6024(var5);
         method6092(this.parent, var5);
      }

      @Override
      public boolean mouseClicked(double var1, double var3, int var5) {
         double var8 = var1 - (double)this.parent.method6053();
         double var10 = var3 - (double) method6093(this.parent, this.parent.getEventListeners().indexOf(this));
         if (var8 <= 32.0) {
            if (var8 < 32.0 && var8 > 16.0 && this.method5548()) {
               this.owner.method6238(this);
               this.owner.connectToSelected();
               return true;
            }

            int var12 = this.owner.serverListSelector.getEventListeners().indexOf(this);
            if (var8 < 16.0 && var10 < 16.0 && var12 > 0) {
               this.method5550(var12, var12 - 1);
               return true;
            }

            if (var8 < 16.0 && var10 > 16.0 && var12 < this.owner.method6242().countServers() - 1) {
               this.method5550(var12, var12 + 1);
               return true;
            }
         }

         this.owner.method6238(this);
         if (Util.milliTime() - this.lastClickTime < 250L) {
            this.owner.connectToSelected();
         }

         this.lastClickTime = Util.milliTime();
         return false;
      }

      public ServerData getServerData() {
         return this.server;
      }

      // $VF: synthetic method
      public static ServerData method5554(NormalEntry var0) {
         return var0.server;
      }
   }

   public abstract static class Entry extends Class1155<Entry> {
   }
}
