package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.FileUtil;
import com.thizzer.jtouchbar.JTouchBar;
import com.thizzer.jtouchbar.common.Color;
import com.thizzer.jtouchbar.item.TouchBarItem;
import com.thizzer.jtouchbar.item.view.TouchBarButton;
import com.thizzer.jtouchbar.item.view.TouchBarButton$ButtonType;
import com.thizzer.jtouchbar.item.view.TouchBarTextField;
import org.lwjgl.glfw.GLFWNativeCocoa;

import java.util.*;

public class Class4378 {
   public JTouchBar field21386;
   private LinkedHashSet<Class7957> field21387 = new LinkedHashSet<Class7957>();
   public boolean field21388 = false;
   public HashMap<Module, TouchBarButton> field21389 = new HashMap<Module, TouchBarButton>();

   public Class4378() {
      Client.getInstance().getEventManager().register(this);
      if (FileUtil.field25727) {
         this.field21387.add(new Class7957(344, Class1145.class));
      }
   }

   public Set<Class7957> method13724() {
      return this.field21387;
   }

   public void method13725(int var1, Module var2) {
      this.method13727(var2);
      Class7957 var5 = new Class7957(var1, var2);
      this.field21387.add(var5);
      this.method13736();
   }

   public void method13726(int var1, Class<? extends Screen> var2) {
      this.method13727(var2);
      Class7957 var5 = new Class7957(var1, var2);
      this.field21387.add(var5);
      this.method13736();
   }

   public void method13727(Object var1) {
      Iterator var4 = this.field21387.iterator();

      while (var4.hasNext()) {
         if (((Class7957)var4.next()).method27056().equals(var1)) {
            var4.remove();
         }
      }
   }

   public int method13728(Class<? extends Screen> var1) {
      for (Class7957 var5 : this.field21387) {
         if (var5.method27055() == Class2067.field13470 && var5.method27057() == var1) {
            return var5.method27053();
         }
      }

      return -1;
   }

   public int method13729(Module var1) {
      for (Class7957 var5 : this.field21387) {
         if (var5.method27055() == Class2067.field13469 && var5.method27058() == var1) {
            return var5.method27053();
         }
      }

      return -1;
   }

   public Class7957 method13730(int var1) {
      if (var1 == -1) {
         return null;
      } else {
         for (Class7957 var5 : this.field21387) {
            if (var5.method27053() == var1) {
               return var5;
            }
         }

         return null;
      }
   }

   public JSONObject method13731(JSONObject var1) {
      Class2344 var4 = new Class2344();

      for (Class7957 var6 : this.field21387) {
         if (var6.method27053() != -1 && var6.method27053() != 0) {
            var4.method9158(var6.method27051());
         }
      }

      var1.method21806("keybinds", var4);
      return var1;
   }

   public void method13732(JSONObject var1) {
      if (var1.has("keybinds")) {
         Class2344 var4 = var1.method21768("keybinds");

         for (int var5 = 0; var5 < var4.method9134(); var5++) {
            JSONObject var6 = var4.method9129(var5);
            Class7957 var7 = new Class7957(var6);
            if (var7.method27052()) {
               this.field21387.add(var7);
            }
         }
      }
   }

   public List<Class7957> method13733(int var1) {
      ArrayList var4 = new ArrayList();
      if (var1 != -1) {
         for (Class7957 var6 : this.field21387) {
            if (var6.method27053() == var1) {
               var4.add(var6);
            }
         }

         return var4;
      } else {
         return null;
      }
   }

   @EventTarget
   public void method13734(TickEvent var1) {
      if (Minecraft.getInstance().world == null && this.field21388) {
         this.method13738();
      } else if (Minecraft.getInstance().world != null && !this.field21388) {
         this.method13736();
      }
   }

   public boolean method13735() {
      return Minecraft.IS_RUNNING_ON_MAC
         && Client.getInstance().getClientMode() == ClientMode.JELLO
         && (
            System.getProperty("os.version").startsWith("10.14")
               || System.getProperty("os.version").startsWith("10.15")
               || System.getProperty("os.version").startsWith("10.16")
               || System.getProperty("os.version").startsWith("10.17")
               || System.getProperty("os.version").startsWith("11.")
         );
   }

   public void method13736() {
      if (this.method13735()) {
         if (this.field21386 != null) {
            this.field21386.hide(GLFWNativeCocoa.glfwGetCocoaWindow(Minecraft.getInstance().mainWindow.method8039()));
         }

         this.field21386 = new JTouchBar();
         this.field21386.setCustomizationIdentifier("JelloTouch");
         this.method13739();
         if (this.field21386.getItems().size() == 0) {
            TouchBarTextField var3 = new TouchBarTextField();
            var3.setStringValue(" Jello for Sigma 5.0   -   Open the keybind manager to add keybinds here!");
            this.field21386.addItem(new TouchBarItem("Jello", var3, true));
         }

         this.field21386.show(GLFWNativeCocoa.glfwGetCocoaWindow(Minecraft.getInstance().mainWindow.method8039()));
         this.field21388 = true;
      }
   }

   public void method13737(Module var1) {
      if (this.field21386 != null) {
         for (TouchBarItem var5 : this.field21386.getItems()) {
            if (var5.getView() instanceof TouchBarButton && var1.method15991().equals(var5.getIdentifier())) {
               ((TouchBarButton)var5.getView()).setBezelColor(this.method13740(var1));
               new Thread(() -> {
                  try {
                     Thread.sleep(200L);
                     ((TouchBarButton)var5.getView()).setBezelColor(this.method13740(var1));
                  } catch (InterruptedException var6) {
                  }
               }).start();
            }
         }
      }
   }

   public void method13738() {
      if (this.method13735()) {
         if (this.field21386 != null) {
            this.field21386.hide(GLFWNativeCocoa.glfwGetCocoaWindow(Minecraft.getInstance().mainWindow.method8039()));
         }

         this.field21386 = new JTouchBar();
         this.field21386.setCustomizationIdentifier("JelloTouch");
         TouchBarTextField var3 = new TouchBarTextField();
         var3.setStringValue(" Jello for Sigma 5.0   -   © SIGMA Prod");
         this.field21386.addItem(new TouchBarItem("Jello", var3, true));
         this.field21386.show(GLFWNativeCocoa.glfwGetCocoaWindow(Minecraft.getInstance().mainWindow.method8039()));
         this.field21388 = false;
      }
   }

   public void method13739() {
      this.field21386.getItems().clear();
      this.field21389.clear();

      for (Class7957 var4 : this.field21387) {
         if (var4.method27055() == Class2067.field13469 && var4.method27053() > 0) {
            TouchBarButton var5 = new TouchBarButton();
            var5.setTitle(var4.method27058().method15991());
            var5.setBezelColor(this.method13740(var4.method27058()));
            var5.setType(TouchBarButton$ButtonType.TOGGLE);
            var5.setAction(new Class2544(this, var4));
            this.field21389.put(var4.method27058(), var5);
            this.field21386.addItem(new TouchBarItem(var4.method27058().method15991(), var5, true));
         }
      }
   }

   public Color method13740(Module var1) {
      Color var4 = new Color(0.0F, 0.0F, 0.0F, 0.0F);
      if (var1.method15993() != ModuleCategory.COMBAT) {
         if (var1.method15993() != ModuleCategory.GUI) {
            if (var1.method15993() != ModuleCategory.ITEM) {
               if (var1.method15993() != ModuleCategory.MISC) {
                  if (var1.method15993() != ModuleCategory.MOVEMENT) {
                     if (var1.method15993() != ModuleCategory.PLAYER) {
                        if (var1.method15993() != ModuleCategory.RENDER) {
                           if (var1.method15993() == ModuleCategory.WORLD) {
                              var4 = this.method13741(-5118535, var1.method15996());
                           }
                        } else {
                           var4 = this.method13741(-1710108, var1.method15996());
                        }
                     } else {
                        var4 = this.method13741(-4208147, var1.method15996());
                     }
                  } else {
                     var4 = this.method13741(-1587309, var1.method15996());
                  }
               } else {
                  var4 = this.method13741(-1916956, var1.method15996());
               }
            } else {
               var4 = this.method13741(-2899864, var1.method15996());
            }
         } else {
            var4 = this.method13741(-2697514, var1.method15996());
         }
      } else {
         var4 = this.method13741(-20561, var1.method15996());
      }

      var4.setAlpha(!var1.method15996() ? 0.35F : 1.0F);
      return var4;
   }

   public Color method13741(int var1, boolean var2) {
      int var5 = var1 >> 16 & 0xFF;
      int var6 = var1 >> 8 & 0xFF;
      int var7 = var1 & 0xFF;
      float[] var8 = java.awt.Color.RGBtoHSB(var5, var6, var7, null);
      float var9 = var8[0];
      float var10 = var8[1];
      float var11 = var8[2];
      if (var2) {
         var10 *= 1.5F;
         var11 *= 0.6F;
      }

      int var12 = java.awt.Color.HSBtoRGB(var9, var10, var11);
      float var13 = (float)(var12 >> 24 & 0xFF) / 255.0F;
      float var14 = (float)(var12 >> 16 & 0xFF) / 255.0F;
      float var15 = (float)(var12 >> 8 & 0xFF) / 255.0F;
      float var16 = (float)(var12 & 0xFF) / 255.0F;
      return new Color(var14, var15, var16, var13);
   }
}
