package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.util.Util;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.atomic.AtomicInteger;

public class ConnectingScreen extends Screen {
   private static final AtomicInteger field6934 = new AtomicInteger(0);
   private static final Logger field6935 = LogManager.getLogger();
   private NetworkManager field6936;
   private boolean field6937;
   private final Screen field6938;
   private ITextComponent field6939 = new TranslationTextComponent("connect.connecting");
   private long field6940 = -1L;

   public ConnectingScreen(Screen var1, Minecraft var2, ServerData var3) {
      super(NarratorChatListener.field29300);
      this.mc = var2;
      this.field6938 = var1;
      Class9375 var6 = Class9375.method35574(var3.field33189);
      var2.unloadWorld();
      var2.setServerData(var3);
      this.method6219(var6.method35572(), var6.method35573());
   }

   public ConnectingScreen(Screen var1, Minecraft var2, String var3, int var4) {
      super(NarratorChatListener.field29300);
      this.mc = var2;
      this.field6938 = var1;
      var2.unloadWorld();
      this.method6219(var3, var4);
   }

   private void method6219(String var1, int var2) {
      field6935.info("Connecting to {}, {}", var1, var2);
      Class381 var5 = new Class381(this, "Server Connector #" + field6934.incrementAndGet(), var1, var2);
      var5.setUncaughtExceptionHandler(new Class6030(field6935));
      var5.start();
   }

   private void method6220(ITextComponent var1) {
      this.field6939 = var1;
   }

   @Override
   public void tick() {
      if (this.field6936 != null) {
         if (!this.field6936.isChannelOpen()) {
            this.field6936.handleDisconnection();
         } else {
            this.field6936.tick();
         }
      }
   }

   @Override
   public boolean shouldCloseOnEsc() {
      return false;
   }

   @Override
   public void init() {
      this.<Button>addButton(new Button(this.width / 2 - 100, this.height / 4 + 120 + 12, 200, 20, DialogTexts.GUI_CANCEL, var1 -> {
         this.field6937 = true;
         if (this.field6936 != null) {
            this.field6936.method30701(new TranslationTextComponent("connect.aborted"));
         }

         this.mc.displayGuiScreen(this.field6938);
      }));
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      long var7 = Util.milliTime();
      if (var7 - this.field6940 > 2000L) {
         this.field6940 = var7;
         NarratorChatListener.INSTANCE.say(new TranslationTextComponent("narrator.joining").getString());
      }

      drawCenteredString(var1, this.fontRenderer, this.field6939, this.width / 2, this.height / 2 - 50, 16777215);
      super.render(var1, var2, var3, var4);
   }

   // $VF: synthetic method
   public static boolean method6222(ConnectingScreen var0) {
      return var0.field6937;
   }

   // $VF: synthetic method
   public static NetworkManager method6223(ConnectingScreen var0, NetworkManager var1) {
      return var0.field6936 = var1;
   }

   // $VF: synthetic method
   public static NetworkManager method6224(ConnectingScreen var0) {
      return var0.field6936;
   }

   // $VF: synthetic method
   public static Screen method6225(ConnectingScreen var0) {
      return var0.field6938;
   }

   // $VF: synthetic method
   public static Logger method6226() {
      return field6935;
   }

   // $VF: synthetic method
   public static void method6227(ConnectingScreen var0, ITextComponent var1) {
      var0.method6220(var1);
   }
}
