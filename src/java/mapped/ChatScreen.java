package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TranslationTextComponent;

public class ChatScreen extends Screen {
   private String field7046 = "";
   private int field7047 = -1;
   public TextFieldWidget field7048;
   private String field7049 = "";
   private Class6850 field7050;

   public ChatScreen(String var1) {
      super(NarratorChatListener.field29300);
      this.field7049 = var1;
   }

   @Override
   public void init() {
      this.mc.keyboardListener.enableRepeatEvents(true);
      this.field7047 = this.mc.ingameGUI.getChatGUI().method5934().size();
      this.field7048 = new Class1303(this, this.fontRenderer, 4, this.height - 12, this.width - 4, 12, new TranslationTextComponent("chat.editBox"));
      this.field7048.method5657(256);
      this.field7048.method5661(false);
      this.field7048.method5635(this.field7049);
      this.field7048.method5631(this::method6344);
      this.field4561.add(this.field7048);
      this.field7050 = new Class6850(this.mc, this, this.field7048, this.fontRenderer, false, false, 1, 10, true, -805306368);
      this.field7050.method20835();
      this.setFocusedDefault(this.field7048);
   }

   @Override
   public void resize(Minecraft var1, int var2, int var3) {
      String var6 = this.field7048.getText();
      this.init(var1, var2, var3);
      this.method6346(var6);
      this.field7050.method20835();
   }

   @Override
   public void onClose() {
      this.mc.keyboardListener.enableRepeatEvents(false);
      this.mc.ingameGUI.getChatGUI().method5936();
   }

   @Override
   public void tick() {
      this.field7048.method5633();
   }

   private void method6344(String var1) {
      String var4 = this.field7048.getText();
      this.field7050.method20829(!var4.equals(this.field7049));
      this.field7050.method20835();
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (!this.field7050.method20830(var1, var2, var3)) {
         if (!super.keyPressed(var1, var2, var3)) {
            if (var1 != 256) {
               if (var1 == 257 || var1 == 335) {
                  String var6 = this.field7048.getText().trim();
                  if (!var6.isEmpty()) {
                     this.method2465(var6);
                  }

                  this.mc.displayGuiScreen((Screen)null);
                  return true;
               } else if (var1 == 265) {
                  this.method6345(-1);
                  return true;
               } else if (var1 == 264) {
                  this.method6345(1);
                  return true;
               } else if (var1 == 266) {
                  this.mc.ingameGUI.getChatGUI().method5937((double)(this.mc.ingameGUI.getChatGUI().method5947() - 1));
                  return true;
               } else if (var1 != 267) {
                  return false;
               } else {
                  this.mc.ingameGUI.getChatGUI().method5937((double)(-this.mc.ingameGUI.getChatGUI().method5947() + 1));
                  return true;
               }
            } else {
               this.mc.displayGuiScreen((Screen)null);
               return true;
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   @Override
   public boolean mouseScrolled(double var1, double var3, double var5) {
      if (var5 > 1.0) {
         var5 = 1.0;
      }

      if (var5 < -1.0) {
         var5 = -1.0;
      }

      if (!this.field7050.method20831(var5)) {
         if (!method2476()) {
            var5 *= 7.0;
         }

         this.mc.ingameGUI.getChatGUI().method5937(var5);
         return true;
      } else {
         return true;
      }
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      if (!this.field7050.method20832((double)((int)var1), (double)((int)var3), var5)) {
         if (var5 == 0) {
            Class1266 var8 = this.mc.ingameGUI.getChatGUI();
            if (var8.method5938(var1, var3)) {
               return true;
            }

            Style var9 = var8.method5939(var1, var3);
            if (var9 != null && this.method2464(var9)) {
               return true;
            }
         }

         return !this.field7048.mouseClicked(var1, var3, var5) ? super.mouseClicked(var1, var3, var5) : true;
      } else {
         return true;
      }
   }

   @Override
   public void method2463(String var1, boolean var2) {
      if (!var2) {
         this.field7048.method5639(var1);
      } else {
         this.field7048.method5635(var1);
      }
   }

   public void method6345(int var1) {
      int var4 = this.field7047 + var1;
      int var5 = this.mc.ingameGUI.getChatGUI().method5934().size();
      var4 = MathHelper.method37775(var4, 0, var5);
      if (var4 != this.field7047) {
         if (var4 != var5) {
            if (this.field7047 == var5) {
               this.field7046 = this.field7048.getText();
            }

            this.field7048.method5635(this.mc.ingameGUI.getChatGUI().method5934().get(var4));
            this.field7050.method20829(false);
            this.field7047 = var4;
         } else {
            this.field7047 = var5;
            this.field7048.method5635(this.field7046);
         }
      }
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.setListener(this.field7048);
      this.field7048.method5654(true);
      method5686(var1, 2, this.height - 14, this.width - 2, this.height - 2, this.mc.gameSettings.method37141(Integer.MIN_VALUE));
      this.field7048.render(var1, var2, var3, var4);
      this.field7050.method20843(var1, var2, var3);
      Style var7 = this.mc.ingameGUI.getChatGUI().method5939((double)var2, (double)var3);
      if (var7 != null && var7.getHoverEvent() != null) {
         this.method2462(var1, var7, var2, var3);
      }

      super.render(var1, var2, var3, var4);
   }

   @Override
   public boolean isPauseScreen() {
      return false;
   }

   private void method6346(String var1) {
      this.field7048.method5635(var1);
   }

   // $VF: synthetic method
   public static Class6850 method6347(ChatScreen var0) {
      return var0.field7050;
   }
}
