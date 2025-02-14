package mapped;

import com.mojang.realmsclient.RealmsMainScreen;
import com.mojang.realmsclient.dto.RealmsServer;
import com.mojang.realmsclient.gui.screens.RealmsCreateRealmScreen;
import net.minecraft.client.Minecraft;

public class Class1287 extends Class1286<Class1161> {
   private boolean field6850;
   public final RealmsMainScreen field6851;

   public Class1287(RealmsMainScreen var1) {
      super(var1.width, var1.height, 32, var1.height - 40, 36);
      this.field6851 = var1;
   }

   @Override
   public void method6111() {
      super.method6111();
      this.field6850 = false;
   }

   public int method6112(Class1161 var1) {
      this.field6850 = true;
      return this.method6030(var1);
   }

   @Override
   public boolean method6057() {
      return this.field6851.getListener() == this;
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (var1 != 257 && var1 != 32 && var1 != 335) {
         return super.keyPressed(var1, var2, var3);
      } else {
         Class1155 var6 = this.getSelected();
         return var6 != null ? var6.mouseClicked(0.0, 0.0, 0) : super.keyPressed(var1, var2, var3);
      }
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      if (var5 == 0 && var1 < (double)this.method6048() && var3 >= (double)this.field6787 && var3 <= (double)this.field6788) {
         int var8 = RealmsMainScreen.method2156(this.field6851).method6053();
         int var9 = this.method6048();
         int var10 = (int)Math.floor(var3 - (double)this.field6787) - this.field6795 + (int)this.method6044() - 4;
         int var11 = var10 / this.field6783;
         if (var1 >= (double)var8 && var1 <= (double)var9 && var11 >= 0 && var10 >= 0 && var11 < this.method6031()) {
            this.method6110(var10, var11, var1, var3, this.field6785);
            RealmsMainScreen.method2157(this.field6851, RealmsMainScreen.method2158(this.field6851) + 7);
            this.method6109(var11);
         }

         return true;
      } else {
         return super.mouseClicked(var1, var3, var5);
      }
   }

   @Override
   public void method6109(int var1) {
      this.method6108(var1);
      if (var1 != -1) {
         RealmsServer var4;
         if (!this.field6850) {
            if (var1 >= RealmsMainScreen.method2159(this.field6851).size()) {
               RealmsMainScreen.method2120(this.field6851, -1L);
               return;
            }

            var4 = (RealmsServer) RealmsMainScreen.method2159(this.field6851).get(var1);
         } else if (var1 != 0) {
            if (var1 - 1 >= RealmsMainScreen.method2159(this.field6851).size()) {
               RealmsMainScreen.method2120(this.field6851, -1L);
               return;
            }

            var4 = (RealmsServer) RealmsMainScreen.method2159(this.field6851).get(var1 - 1);
         } else {
            var4 = null;
         }

         RealmsMainScreen.method2160(this.field6851, var4);
         if (var4 != null) {
            if (var4.field27447 != Class2261.field14708) {
               RealmsMainScreen.method2120(this.field6851, var4.field27443);
               if (RealmsMainScreen.method2158(this.field6851) >= 10 && RealmsMainScreen.method2161(this.field6851).active) {
                  this.field6851.method2046(RealmsMainScreen.method2099(this.field6851, RealmsMainScreen.method2098(this.field6851)), this.field6851);
               }
            } else {
               RealmsMainScreen.method2120(this.field6851, -1L);
            }
         } else {
            RealmsMainScreen.method2120(this.field6851, -1L);
         }
      }
   }

   public void method6024(Class1161 var1) {
      super.method6024(var1);
      int var4 = this.getEventListeners().indexOf(var1);
      if (this.field6850 && var4 == 0) {
         Class9229.method34713(I18n.format("mco.trial.message.line1"), I18n.format("mco.trial.message.line2"));
      } else if (!this.field6850 || var4 > 0) {
         RealmsServer var5 = (RealmsServer) RealmsMainScreen.method2159(this.field6851).get(var4 - (!this.field6850 ? 0 : 1));
         RealmsMainScreen.method2120(this.field6851, var5.field27443);
         RealmsMainScreen.method2160(this.field6851, var5);
         if (var5.field27447 != Class2261.field14708) {
            Class9229.method34711(I18n.format("narrator.select", var5.field27445));
         } else {
            Class9229.method34711(I18n.format("mco.selectServer.uninitialized") + I18n.format("mco.gui.button"));
         }
      }
   }

   @Override
   public void method6110(int var1, int var2, double var3, double var5, int var7) {
      if (this.field6850) {
         if (var2 == 0) {
            RealmsMainScreen.method2111(this.field6851, true);
            return;
         }

         var2--;
      }

      if (var2 < RealmsMainScreen.method2159(this.field6851).size()) {
         RealmsServer var10 = (RealmsServer) RealmsMainScreen.method2159(this.field6851).get(var2);
         if (var10 != null) {
            if (var10.field27447 != Class2261.field14708) {
               RealmsMainScreen.method2120(this.field6851, var10.field27443);
            } else {
               RealmsMainScreen.method2120(this.field6851, -1L);
               Minecraft.getInstance().displayGuiScreen(new RealmsCreateRealmScreen(var10, this.field6851));
            }

            if (RealmsMainScreen.method2162(this.field6851) != Class1982.field12942) {
               if (RealmsMainScreen.method2162(this.field6851) != Class1982.field12941) {
                  if (RealmsMainScreen.method2162(this.field6851) == Class1982.field12940) {
                     RealmsMainScreen.method2165(this.field6851);
                  }
               } else {
                  RealmsMainScreen.method2120(this.field6851, var10.field27443);
                  RealmsMainScreen.method2164(this.field6851, var10);
               }
            } else {
               RealmsMainScreen.method2120(this.field6851, var10.field27443);
               RealmsMainScreen.method2163(this.field6851, var10);
            }
         }
      }
   }

   @Override
   public int method6036() {
      return this.method6031() * 36;
   }

   @Override
   public int method6022() {
      return 300;
   }
}
