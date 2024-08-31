package mapped;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class Class1123 extends Class875<Class5825> {
   private static final ResourceLocation field6157 = new ResourceLocation("textures/gui/container/smithing.png");

   public Class1123(Class5825 var1, PlayerInventory var2, ITextComponent var3) {
      super(var1, var2, var3, field6157);
      this.field4723 = 60;
      this.field4724 = 18;
   }

   @Override
   public void method2617(MatrixStack var1, int var2, int var3) {
      RenderSystem.disableBlend();
      super.method2617(var1, var2, var3);
   }
}
