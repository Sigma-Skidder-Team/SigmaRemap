package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class1153 implements Class1152 {
   private static String[] field6290;
   private final ITextComponent field6291;
   private final int field6292;
   private final int field6293;
   private final int field6294;

   public Class1153(ITextComponent var1, int var2, int var3, int var4) {
      this.field6291 = var1;
      this.field6292 = var2;
      this.field6293 = var3;
      this.field6294 = var4;
   }

   public void method5542(Screen var1, MatrixStack var2) {
      Screen.method5691(var2, Minecraft.getInstance().field1294, this.field6291, this.field6292, this.field6293, this.field6294);
   }

   public String method5543() {
      return this.field6291.getString();
   }
}
