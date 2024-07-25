package remapped;

import net.minecraft.util.text.ITextComponent;

public class class_9123 implements class_7912 {
   private static String[] field_46683;
   private final int field_46681;
   private final boolean field_46682;

   public class_9123(int var1, boolean var2) {
      this.field_46681 = var1;
      this.field_46682 = var2;
   }

   @Override
   public void method_35792(class_3421 var1) {
      class_3421.method_15812(var1, class_3421.method_15814(var1) + this.field_46681);
   }

   @Override
   public ITextComponent method_35794() {
      return this.field_46681 >= 0 ? class_3421.method_15815() : class_3421.method_15813();
   }

   @Override
   public void method_35795(class_7966 var1, float var2, int var3) {
      MinecraftClient.getInstance().getTextureManager().bindTexture(SpectatorGui.field_42845);
      if (this.field_46681 >= 0) {
         AbstractGui.method_9778(var1, 0, 0, 160.0F, 0.0F, 16, 16, 256, 256);
      } else {
         AbstractGui.method_9778(var1, 0, 0, 144.0F, 0.0F, 16, 16, 256, 256);
      }
   }

   @Override
   public boolean method_35793() {
      return this.field_46682;
   }
}
