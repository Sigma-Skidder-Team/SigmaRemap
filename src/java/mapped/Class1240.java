package mapped;

import net.minecraft.util.text.TranslationTextComponent;

public class Class1240 extends Class1206 {
   public final Class806 field6590;

   public Class1240(Class806 var1) {
      super(var1.field4564 - 37, 6, 20, 20, new TranslationTextComponent("mco.selectServer.info"), null);
      this.field6590 = var1;
      this.field6513 = var1x -> Class806.method2111(this.field6590, !Class806.method2112(this.field6590));
   }

   @Override
   public void method5655(MatrixStack var1, int var2, int var3, float var4) {
      Class806.method2110(this.field6590, var1, var2, var3, this.field6477, this.field6478, this.method5737());
   }
}
