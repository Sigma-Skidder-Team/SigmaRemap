package mapped;

import net.minecraft.client.gui.AbstractGui;
import net.minecraft.client.gui.FontRenderer;

public class Class1172 extends Class1155<Class1172> {
   private static String[] field6347;
   private final String field6348;
   private final String field6349;
   public final Class803 field6350;

   public Class1172(Class803 var1, String var2, String var3) {
      this.field6350 = var1;
      this.field6348 = var2;
      this.field6349 = var3;
   }

   @Override
   public void method5544(MatrixStack var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      FontRenderer var13 = Class803.method1953(this.field6350).fontRenderer;
      AbstractGui.drawString(var1, var13, this.field6348, var4, var3, 10526880);
      AbstractGui.method5693(var1, var13, Class803.method1954(this.field6350, this.field6348, this.field6349), var4, var3 + 12, 16777215);
   }
}
