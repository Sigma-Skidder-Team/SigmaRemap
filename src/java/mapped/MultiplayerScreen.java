package mapped;

import com.mentalfrostbyte.jello.util.ColorUtils;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class MultiplayerScreen extends Screen {
   private static final Logger field4558 = LogManager.getLogger();
   private final Class9118 field6947 = new Class9118();
   public final Screen field6948;
   public Class1279 field6949;
   private Class7970 field6950;
   private Button field6951;
   private Button field6952;
   private Button field6953;
   private List<ITextComponent> field6954;
   private ServerData field6955;
   private Class9635 field6956;
   private Class370 field6957;
   private boolean field6958;

   public MultiplayerScreen(Screen var1) {
      super(new TranslationTextComponent("multiplayer.title"));
      this.field6948 = var1;
   }

   @Override
   public void init() {
      super.init();
      this.mc.keyboardListener.enableRepeatEvents(true);
      if (this.field6958) {
         this.field6949.method6034(this.width, this.height, 32, this.height - 64);
      } else {
         this.field6958 = true;
         this.field6950 = new Class7970(this.mc);
         this.field6950.method27094();
         this.field6956 = new Class9635();

         try {
            this.field6957 = new Class370(this.field6956);
            this.field6957.start();
         } catch (Exception var4) {
            field4558.warn("Unable to start LAN server detection: {}", var4.getMessage());
         }

         this.field6949 = new Class1279(this, this.mc, this.width, this.height, 32, this.height - 64, 36);
         this.field6949.method6081(this.field6950);
      }

      this.field4561.add(this.field6949);
      this.field6952 = this.<Button>addButton(
         new Button(this.width / 2 - 154, this.height - 52, 100, 20, new TranslationTextComponent("selectServer.select"), var1 -> this.method6236())
      );
      this.<Button>addButton(
         new Button(this.width / 2 - 50, this.height - 52, 100, 20, new TranslationTextComponent("selectServer.direct"), var1 -> {
            this.field6955 = new ServerData(I18n.format("selectServer.defaultName"), "", false);
            this.mc.displayGuiScreen(new Class1320(this, this::method6235, this.field6955));
         })
      );
      this.<Button>addButton(
         new Button(this.width / 2 + 4 + 50, this.height - 52, 100, 20, new TranslationTextComponent("selectServer.add"), var1 -> {
            this.field6955 = new ServerData(I18n.format("selectServer.defaultName"), "", false);
            this.mc.displayGuiScreen(new Class1330(this, this::method6234, this.field6955));
         })
      );
      this.field6951 = this.<Button>addButton(
         new Button(this.width / 2 - 154, this.height - 28, 70, 20, new TranslationTextComponent("selectServer.edit"), var1 -> {
            Class1156 var4x = this.field6949.method6023();
            if (var4x instanceof Class1157) {
               ServerData var5 = ((Class1157)var4x).method5551();
               this.field6955 = new ServerData(var5.field33188, var5.field33189, false);
               this.field6955.method25583(var5);
               this.mc.displayGuiScreen(new Class1330(this, this::method6233, this.field6955));
            }
         })
      );
      this.field6953 = this.<Button>addButton(
         new Button(this.width / 2 - 74, this.height - 28, 70, 20, new TranslationTextComponent("selectServer.delete"), var1 -> {
            Class1156 var4x = this.field6949.method6023();
            if (var4x instanceof Class1157) {
               String var5 = ((Class1157)var4x).method5551().field33188;
               if (var5 != null) {
                  TranslationTextComponent var6 = new TranslationTextComponent("selectServer.deleteQuestion");
                  TranslationTextComponent var7 = new TranslationTextComponent("selectServer.deleteWarning", var5);
                  TranslationTextComponent var8 = new TranslationTextComponent("selectServer.deleteButton");
                  ITextComponent var9 = DialogTexts.GUI_CANCEL;
                  this.mc.displayGuiScreen(new ConfirmScreen(this::method6232, var6, var7, var8, var9));
               }
            }
         })
      );
      this.addButton(
         new Button(this.width / 2 + 4, this.height - 28, 70, 20, new TranslationTextComponent("selectServer.refresh"), var1 -> this.method6231())
      );
      this.addButton(
         new Button(this.width / 2 + 4 + 76, this.height - 28, 75, 20, DialogTexts.GUI_CANCEL, var1 -> this.mc.displayGuiScreen(this.field6948))
      );
      this.method6239();
   }

   @Override
   public void tick() {
      super.tick();
      if (this.field6956.method37555()) {
         List var3 = this.field6956.method37557();
         this.field6956.method37556();
         this.field6949.method6082(var3);
      }

      this.field6947.method34006();
   }

   @Override
   public void onClose() {
      this.mc.keyboardListener.enableRepeatEvents(false);
      if (this.field6957 != null) {
         this.field6957.interrupt();
         this.field6957 = null;
      }

      this.field6947.method34007();
   }

   private void method6231() {
      this.mc.displayGuiScreen(new MultiplayerScreen(this.field6948));
   }

   private void method6232(boolean var1) {
      Class1156 var4 = this.field6949.method6023();
      if (var1 && var4 instanceof Class1157) {
         this.field6950.method27097(((Class1157)var4).method5551());
         this.field6950.method27095();
         this.field6949.method6024((Class1156)null);
         this.field6949.method6081(this.field6950);
      }

      this.mc.displayGuiScreen(this);
   }

   private void method6233(boolean var1) {
      Class1156 var4 = this.field6949.method6023();
      if (var1 && var4 instanceof Class1157) {
         ServerData var5 = ((Class1157)var4).method5551();
         var5.field33188 = this.field6955.field33188;
         var5.field33189 = this.field6955.field33189;
         var5.method25583(this.field6955);
         this.field6950.method27095();
         this.field6949.method6081(this.field6950);
      }

      this.mc.displayGuiScreen(this);
   }

   private void method6234(boolean var1) {
      if (var1) {
         this.field6950.method27098(this.field6955);
         this.field6950.method27095();
         this.field6949.method6024((Class1156)null);
         this.field6949.method6081(this.field6950);
      }

      this.mc.displayGuiScreen(this);
   }

   private void method6235(boolean var1) {
      if (!var1) {
         this.mc.displayGuiScreen(this);
      } else {
         this.method6237(this.field6955);
      }
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (!super.keyPressed(var1, var2, var3)) {
         if (var1 != 294) {
            if (this.field6949.method6023() == null) {
               return false;
            } else if (var1 != 257 && var1 != 335) {
               return this.field6949.keyPressed(var1, var2, var3);
            } else {
               this.method6236();
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
      this.field6954 = null;
      this.renderBackground(var1);
      this.field6949.render(var1, var2, var3, var4);
      drawCenteredString(var1, this.fontRenderer, this.title, this.width / 2, 20, 16777215);
      super.render(var1, var2, var3, var4);
      if (this.field6954 != null) {
         this.method2460(var1, this.field6954, var2, var3);
      }
   }

   public void method6236() {
      Class1156 var3 = this.field6949.method6023();
      if (!(var3 instanceof Class1157)) {
         if (var3 instanceof Class1158) {
            Class9162 var4 = ((Class1158)var3).method5555();
            this.method6237(new ServerData(var4.method34207(), var4.method34208(), true));
         }
      } else {
         this.method6237(((Class1157)var3).method5551());
      }
   }

   private void method6237(ServerData var1) {
    /*  if (var1.field33189 != null && var1.field33189.contains("hypixel.net") && Class8005.method27372().method18582() < Class5989.field26155.method18582()) {
         Class8005.field34417 = Class5989.field26155;
      }*/

      ColorUtils.method17746(var1);
      this.mc.displayGuiScreen(new ConnectingScreen(this, this.mc, var1));
   }

   public void method6238(Class1156 var1) {
      this.field6949.method6024(var1);
      this.method6239();
   }

   public void method6239() {
      this.field6952.active = false;
      this.field6951.active = false;
      this.field6953.active = false;
      Class1156 var3 = this.field6949.method6023();
      if (var3 != null && !(var3 instanceof Class1159)) {
         this.field6952.active = true;
         if (var3 instanceof Class1157) {
            this.field6951.active = true;
            this.field6953.active = true;
         }
      }
   }

   public Class9118 method6240() {
      return this.field6947;
   }

   public void method6241(List<ITextComponent> var1) {
      this.field6954 = var1;
   }

   public Class7970 method6242() {
      return this.field6950;
   }
}
