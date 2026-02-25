package mapped;

import com.mentalfrostbyte.jello.unmapped.GuiComponent;

public class Class4361 extends InteractiveWidget {
   public Class4361(GuiComponent var1, String var2, int var3, int var4) {
      super(var1, var2, var3, var4, 30, 30, false);
   }

   @Override
   public void draw(float partialTicks) {
      RenderUtil.method11455((float)this.xA, (float)this.yA, 30.0F, 30.0F, !this.method13298() ? Class4334.field21177 : Class4334.field21178);
      super.draw(partialTicks);
   }
}
