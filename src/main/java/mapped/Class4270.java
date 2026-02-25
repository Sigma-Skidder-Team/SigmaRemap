package mapped;

import com.mentalfrostbyte.jello.unmapped.GuiComponent;
import com.mentalfrostbyte.jello.util.ClientColors;

import java.util.ArrayList;
import java.util.List;

public class Class4270 extends InteractiveWidget {
   private List<ButtonPanel> field20695 = new ArrayList<ButtonPanel>();
   public int field20696;

   public Class4270(GuiComponent var1, String var2, int var3, int var4) {
      super(var1, var2, var3, var4, 1060, 357, false);

      for (Class2287 var10 : Class2287.values()) {
         Class4268 var11;
         this.addToList(
               var11 = new Class4268(
                     this,
                     "KEY_" + var10.field15204 + this.method13241().size(),
                     var10.method9027(),
                     var10.method9026(),
                     var10.method9028(),
                     var10.method9029(),
                     var10.field15201,
                     var10.field15204));
         var11.doThis((var2x, var3x) -> {
            this.field20696 = var11.field20690;
            this.firePressHandlers();
         });
      }

      this.method13300(false);
   }

   @Override
   public boolean onMouseDown(int mouseX, int mouseY, int mouseButton) {
      if (mouseButton <= 1) {
         return super.onMouseDown(mouseX, mouseY, mouseButton);
      } else {
         this.field20696 = mouseButton;
         this.firePressHandlers();
         return false;
      }
   }

   @Override
   public void keyPressed(int keyCode) {
      for (Class2287 var7 : Class2287.values()) {
         if (var7.field15204 == keyCode) {
            super.keyPressed(keyCode);
            return;
         }
      }

      this.field20696 = keyCode;
      this.firePressHandlers();
      super.keyPressed(keyCode);
   }

   public void method13104() {
      for (GuiComponent var4 : this.method13241()) {
         if (var4 instanceof Class4268) {
            Class4268 var5 = (Class4268) var4;
            var5.method13102();
         }
      }
   }

   public int[] method13105(int var1) {
      for (Class2287 var7 : Class2287.values()) {
         if (var7.field15204 == var1) {
            return new int[] { var7.method9027() + var7.method9028() / 2, var7.method9026() + var7.method9029() };
         }
      }

      return new int[] { this.getWidthA() / 2, 20 };
   }

   @Override
   public void updatePanelDimensions(int newHeight, int newWidth) {
      super.updatePanelDimensions(newHeight, newWidth);
   }

   @Override
   public void draw(float partialTicks) {
      byte var4 = 20;
      byte var5 = 14;
      int var6 = this.xA - var4;
      int var7 = this.yA - var4;
      int var8 = this.widthA + var4 * 2;
      int var9 = this.heightA + 5 + var4 * 2;
      RenderUtil.drawRoundedRect((float) (var6 + var5 / 2), (float) (var7 + var5 / 2), (float) (var8 - var5),
            (float) (var9 - var5), 20.0F, partialTicks * 0.5F);
      RenderUtil.method11474((float) var6, (float) var7, (float) var8, (float) var9, 14.0F,
            ClientColors.LIGHT_GREYISH_BLUE.getColor());
      super.draw(partialTicks);
   }
}
