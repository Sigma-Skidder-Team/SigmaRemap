package mapped;

import org.newdawn.slick.TrueTypeFont;
import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.util.timer.TimerUtil;
import net.minecraft.client.Minecraft;

import java.util.ArrayList;
import java.util.List;

public class AnimatedIconPanel extends CustomGuiScreen implements Class4347 {
    public boolean field20876;
   public boolean field20877;
   public int field20878;
   public int field20879;
   public int field20880;
   public int field20881;
   public boolean field20882 = true;
   public boolean field20883 = false;
   public boolean field20884 = true;
   public boolean field20885 = true;
   public boolean field20886 = false;
   public final TimerUtil timerUtil = new TimerUtil();
   public int field20888 = 300;
   public int field20889 = 2;
   private final List<Class6751> field20890 = new ArrayList<Class6751>();

   public AnimatedIconPanel(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, boolean var7) {
      super(var1, var2, var3, var4, var5, var6);
      this.field20876 = var7;
   }

   public AnimatedIconPanel(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7, boolean var8) {
      super(var1, var2, var3, var4, var5, var6, var7);
      this.field20876 = var8;
   }

   public AnimatedIconPanel(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7, String var8, boolean var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8);
      this.field20876 = var9;
   }

   public AnimatedIconPanel(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7, String var8, TrueTypeFont var9, boolean var10) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      this.field20876 = var10;
   }

   @Override
   public boolean method13212() {
      return this.field20909 && !this.method13216();
   }

   @Override
   public void updatePanelDimensions(int newHeight, int newWidth) {
      super.updatePanelDimensions(newHeight, newWidth);
      if (this.method13214()) {
         if (!this.field20909 && !this.field20877) {
            this.field20880 = this.getWidthA() / 2;
            this.field20881 = this.getHeightA() / 2;
         }

         this.method13213(newHeight, newWidth);
      }
   }

   @Override
   public boolean onClick(int mouseX, int mouseY, int mouseButton) {
      if (!super.onClick(mouseX, mouseY, mouseButton)) {
         if (this.method13214()) {
            this.timerUtil.start();
            this.field20878 = mouseX;
            this.field20879 = mouseY;
            this.field20880 = this.field20878 - this.method13271();
            this.field20881 = this.field20879 - this.method13272();
         }

         return false;
      } else {
         return true;
      }
   }

   @Override
   public void onClick2(int mouseX, int mouseY, int mouseButton) {
      super.onClick2(mouseX, mouseY, mouseButton);
      if (this.method13214()) {
         this.timerUtil.stop();
         this.timerUtil.reset();
      }

      this.method13217(false);
   }

   @Override
   public void method13213(int var1, int var2) {
      boolean var5 = this.field20877;
      if (!this.method13216() && this.method13214()) {
         boolean var6 = this.field20884 && this.timerUtil.getElapsedTime() >= (long)this.field20888;
         boolean var7 = this.field20885
            && this.field20909
            && (Math.abs(this.field20878 - var1) > this.field20889 || Math.abs(this.field20879 - var2) > this.field20889);
         boolean var8 = this.field20886 && this.field20909;
         if (var6 || var7 || var8) {
            this.method13217(true);
         }
      } else if (this.method13216()) {
         this.setXA(var1 - this.field20880 - (this.screen == null ? 0 : this.screen.method13271()));
         this.setYA(var2 - this.field20881 - (this.screen == null ? 0 : this.screen.method13272()));
         if (this.field20882) {
            if (this.screen == null) {
               if (this.getXA() < 0) {
                  this.setXA(0);
               }

               if (this.getXA() + this.getWidthA() > Minecraft.getInstance().mainWindow.getWidth()) {
                  this.setXA(Minecraft.getInstance().mainWindow.getWidth() - this.getWidthA());
               }

               if (this.getYA() < 0) {
                  this.setYA(0);
               }

               if (this.getYA() + this.getHeightA() > Minecraft.getInstance().mainWindow.getHeight()) {
                  this.setYA(Minecraft.getInstance().mainWindow.getHeight() - this.getHeightA());
               }
            } else {
               if (this.getXA() < 0) {
                  this.setXA(0);
               }

               if (this.getXA() + this.getWidthA() > this.screen.getWidthA()) {
                  this.setXA(this.screen.getWidthA() - this.getWidthA());
               }

               if (this.getYA() < 0) {
                  this.setYA(0);
               }

               if (this.getYA() + this.getHeightA() > this.screen.getHeightA() && !this.field20883) {
                  this.setYA(this.screen.getHeightA() - this.getHeightA());
               }
            }
         }
      }

      if (this.method13216() && !var5) {
         this.timerUtil.stop();
         this.timerUtil.reset();
      }
   }

   @Override
   public boolean method13214() {
      return this.field20876;
   }

   @Override
   public void method13215(boolean var1) {
      this.field20876 = var1;
   }

   @Override
   public boolean method13216() {
      return this.field20877;
   }

   @Override
   public void method13217(boolean var1) {
      this.field20877 = var1;
      if (var1) {
         this.method13215(true);
         this.method13219();
      }
   }

   public AnimatedIconPanel method13218(Class6751 var1) {
      this.field20890.add(var1);
      return this;
   }

   public void method13219() {
      for (Class6751 var4 : this.field20890) {
         var4.method20580(this);
      }
   }
}
