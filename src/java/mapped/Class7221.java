package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.util.text.ITextComponent;

public class Class7221 implements Class7222 {
   private static String[] field31051;

   private Class7221() {
   }

   @Override
   public void method22697(Class8036 var1) {
      var1.method27572();
   }

   @Override
   public ITextComponent method22698() {
      return Class8036.method27576();
   }

   @Override
   public void method22699(MatrixStack var1, float var2, int var3) {
      Minecraft.getInstance().getTextureManager().bindTexture(Class1195.field6470);
      AbstractGui.method5699(var1, 0, 0, 128.0F, 0.0F, 16, 16, 256, 256);
   }

   @Override
   public boolean method22700() {
      return true;
   }

   // $VF: synthetic method
   public Class7221(Class7230 var1) {
      this();
   }
}
