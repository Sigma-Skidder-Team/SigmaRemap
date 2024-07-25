package remapped;

import com.thizzer.jtouchbar.JTouchBar;
import com.thizzer.jtouchbar.common.Color;
import com.thizzer.jtouchbar.item.TouchBarItem;
import com.thizzer.jtouchbar.item.view.TouchBarButton;
import com.thizzer.jtouchbar.item.view.TouchBarButton$class_33;
import com.thizzer.jtouchbar.item.view.TouchBarTextField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.lwjgl.glfw.GLFWNativeCocoa;

public class class_123 {
   public JTouchBar field_299;
   private LinkedHashSet<class_3158> field_297 = new LinkedHashSet<class_3158>();
   public boolean field_298 = false;
   public HashMap<Module, TouchBarButton> field_301 = new HashMap<Module, TouchBarButton>();

   public class_123() {
      SigmaMainClass.method_3328().method_3302().method_7908(this);
      if (class_357.field_1386) {
         this.field_297.add(new class_3158(344, class_1046.class));
      }
   }

   public Set<class_3158> method_377() {
      return this.field_297;
   }

   public void method_368(int var1, Module var2) {
      this.method_383(var2);
      class_3158 var5 = new class_3158(var1, var2);
      this.field_297.add(var5);
      this.method_375();
   }

   public void method_367(int var1, Class<? extends Screen> var2) {
      this.method_383(var2);
      class_3158 var5 = new class_3158(var1, var2);
      this.field_297.add(var5);
      this.method_375();
   }

   public void method_383(Object var1) {
      Iterator var4 = this.field_297.iterator();

      while (var4.hasNext()) {
         if (((class_3158)var4.next()).method_14567().equals(var1)) {
            var4.remove();
         }
      }
   }

   public int method_380(Class<? extends Screen> var1) {
      for (class_3158 var5 : this.field_297) {
         if (var5.method_14566() == class_4906.field_25373 && var5.method_14559() == var1) {
            return var5.method_14565();
         }
      }

      return -1;
   }

   public int method_381(Module var1) {
      for (class_3158 var5 : this.field_297) {
         if (var5.method_14566() == class_4906.field_25372 && var5.method_14560() == var1) {
            return var5.method_14565();
         }
      }

      return -1;
   }

   public class_3158 method_373(int var1) {
      if (var1 == -1) {
         return null;
      } else {
         for (class_3158 var5 : this.field_297) {
            if (var5.method_14565() == var1) {
               return var5;
            }
         }

         return null;
      }
   }

   public JSONObjectImpl method_369(JSONObjectImpl var1) {
      class_1336 var4 = new class_1336();

      for (class_3158 var6 : this.field_297) {
         if (var6.method_14565() != -1 && var6.method_14565() != 0) {
            var4.method_6159(var6.method_14564());
         }
      }

      var1.method_5820("keybinds", var4);
      return var1;
   }

   public void method_376(JSONObjectImpl var1) {
      if (var1.method_5850("keybinds")) {
         class_1336 var4 = var1.method_5849("keybinds");

         for (int var5 = 0; var5 < var4.method_6142(); var5++) {
            JSONObjectImpl var6 = var4.method_6143(var5);
            class_3158 var7 = new class_3158(var6);
            if (var7.method_14561()) {
               this.field_297.add(var7);
            }
         }
      }
   }

   public List<class_3158> method_382(int var1) {
      ArrayList var4 = new ArrayList();
      if (var1 != -1) {
         for (class_3158 var6 : this.field_297) {
            if (var6.method_14565() == var1) {
               var4.add(var6);
            }
         }

         return var4;
      } else {
         return null;
      }
   }

   @class_9148
   public void method_384(class_5596 var1) {
      if (MinecraftClient.getInstance().field_9601 == null && this.field_298) {
         this.method_378();
      } else if (MinecraftClient.getInstance().field_9601 != null && !this.field_298) {
         this.method_375();
      }
   }

   public boolean method_374() {
      return MinecraftClient.IS_SYSTEM_MAC
         && SigmaMainClass.method_3328().method_3312() == class_6015.field_30645
         && (
            System.getProperty("os.version").startsWith("10.14")
               || System.getProperty("os.version").startsWith("10.15")
               || System.getProperty("os.version").startsWith("10.16")
               || System.getProperty("os.version").startsWith("10.17")
               || System.getProperty("os.version").startsWith("11.")
         );
   }

   public void method_375() {
      if (this.method_374()) {
         if (this.field_299 != null) {
            this.field_299.hide(GLFWNativeCocoa.glfwGetCocoaWindow(MinecraftClient.getInstance().window.method_43181()));
         }

         this.field_299 = new JTouchBar();
         this.field_299.setCustomizationIdentifier("JelloTouch");
         this.method_379();
         if (this.field_299.getItems().size() == 0) {
            TouchBarTextField var3 = new TouchBarTextField();
            var3.setStringValue(" Jello for Sigma 5.0   -   Open the keybind manager to add keybinds here!");
            this.field_299.addItem(new TouchBarItem("Jello", var3, true));
         }

         this.field_299.show(GLFWNativeCocoa.glfwGetCocoaWindow(MinecraftClient.getInstance().window.method_43181()));
         this.field_298 = true;
      }
   }

   public void method_370(Module var1) {
      if (this.field_299 != null) {
         for (TouchBarItem var5 : this.field_299.getItems()) {
            if (var5.getView() instanceof TouchBarButton && var1.method_41992().equals(var5.getIdentifier())) {
               ((TouchBarButton)var5.getView()).setBezelColor(this.method_371(var1));
               new Thread(() -> {
                  try {
                     Thread.sleep(200L);
                     ((TouchBarButton)var5.getView()).setBezelColor(this.method_371(var1));
                  } catch (InterruptedException var6) {
                  }
               }).start();
            }
         }
      }
   }

   public void method_378() {
      if (this.method_374()) {
         if (this.field_299 != null) {
            this.field_299.hide(GLFWNativeCocoa.glfwGetCocoaWindow(MinecraftClient.getInstance().window.method_43181()));
         }

         this.field_299 = new JTouchBar();
         this.field_299.setCustomizationIdentifier("JelloTouch");
         TouchBarTextField var3 = new TouchBarTextField();
         var3.setStringValue(" Jello for Sigma 5.0   -   © SIGMA Prod");
         this.field_299.addItem(new TouchBarItem("Jello", var3, true));
         this.field_299.show(GLFWNativeCocoa.glfwGetCocoaWindow(MinecraftClient.getInstance().window.method_43181()));
         this.field_298 = false;
      }
   }

   public void method_379() {
      this.field_299.getItems().clear();
      this.field_301.clear();

      for (class_3158 var4 : this.field_297) {
         if (var4.method_14566() == class_4906.field_25372 && var4.method_14565() > 0) {
            TouchBarButton var5 = new TouchBarButton();
            var5.setTitle(var4.method_14560().method_41992());
            var5.setBezelColor(this.method_371(var4.method_14560()));
            var5.setType(TouchBarButton$class_33.TOGGLE);
            var5.setAction(new class_6285(this, var4));
            this.field_301.put(var4.method_14560(), var5);
            this.field_299.addItem(new TouchBarItem(var4.method_14560().method_41992(), var5, true));
         }
      }
   }

   public Color method_371(Module var1) {
      Color var4 = new Color(0.0F, 0.0F, 0.0F, 0.0F);
      if (var1.method_42004() != class_5664.field_28714) {
         if (var1.method_42004() != class_5664.field_28708) {
            if (var1.method_42004() != class_5664.field_28712) {
               if (var1.method_42004() != class_5664.field_28711) {
                  if (var1.method_42004() != class_5664.field_28716) {
                     if (var1.method_42004() != class_5664.field_28710) {
                        if (var1.method_42004() != class_5664.field_28709) {
                           if (var1.method_42004() == class_5664.field_28718) {
                              var4 = this.method_385(-5118535, var1.method_42015());
                           }
                        } else {
                           var4 = this.method_385(-1710108, var1.method_42015());
                        }
                     } else {
                        var4 = this.method_385(-4208147, var1.method_42015());
                     }
                  } else {
                     var4 = this.method_385(-1587309, var1.method_42015());
                  }
               } else {
                  var4 = this.method_385(-1916956, var1.method_42015());
               }
            } else {
               var4 = this.method_385(-2899864, var1.method_42015());
            }
         } else {
            var4 = this.method_385(-2697514, var1.method_42015());
         }
      } else {
         var4 = this.method_385(-20561, var1.method_42015());
      }

      var4.setAlpha(!var1.method_42015() ? 0.35F : 1.0F);
      return var4;
   }

   public Color method_385(int var1, boolean var2) {
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
