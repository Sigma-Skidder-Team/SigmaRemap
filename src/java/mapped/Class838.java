package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.AbstractOption;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class Class838 extends Screen {
   private static String[] field4628;
   public List<Widget> field4629 = this.field4566;
   public FontRenderer field4630 = Minecraft.getInstance().fontRenderer;
   public boolean field4631 = false;

   public Class838(ITextComponent var1) {
      super(var1);
   }

   public void method2563(Widget var1) {
   }

   public void method2564(Widget var1) {
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      boolean var8 = super.mouseClicked(var1, var3, var5);
      this.field4631 = true;
      Widget var9 = method2566((int)var1, (int)var3, this.field4629);
      if (var9 != null && var9.active) {
         if (var5 == 1 && var9 instanceof Class1230) {
            Class1230 var10 = (Class1230)var9;
            if (var10.method5811() == AbstractOption.field25344) {
               var9.playDownSound(super.mc.getSoundHandler());
            }
         }

         if (var5 != 0) {
            if (var5 == 1) {
               this.method2564(var9);
            }
         } else {
            this.method2563(var9);
         }

         return true;
      } else {
         return var8;
      }
   }

   @Override
   public boolean mouseReleased(double var1, double var3, int var5) {
      if (!this.field4631) {
         return false;
      } else {
         this.field4631 = false;
         this.setDragging(false);
         return this.getListener() != null && this.getListener().mouseReleased(var1, var3, var5) ? true : super.mouseReleased(var1, var3, var5);
      }
   }

   @Override
   public boolean mouseDragged(double var1, double var3, int var5, double var6, double var8) {
      return this.field4631 ? super.mouseDragged(var1, var3, var5, var6, var8) : false;
   }

   public static Widget method2566(int var0, int var1, List<Widget> var2) {
      for (int var5 = 0; var5 < var2.size(); var5++) {
         Widget var6 = (Widget)var2.get(var5);
         if (var6.visible) {
            int var7 = GuiUtils.method24650(var6);
            int var8 = GuiUtils.method24651(var6);
            if (var0 >= var6.x && var1 >= var6.y && var0 < var6.x + var7 && var1 < var6.y + var8) {
               return var6;
            }
         }
      }

      return null;
   }

   public static void method2567(MatrixStack var0, FontRenderer var1, Class9125 var2, int var3, int var4, int var5) {
      var1.method38802(var0, var2, (float)(var3 - var1.method38822(var2) / 2), (float)var4, var5);
   }
}
