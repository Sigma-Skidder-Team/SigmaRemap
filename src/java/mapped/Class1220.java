package mapped;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1220 extends Class1206 implements Class1219 {
   public final Class806 field6548;

   public Class1220(Class806 var1) {
      super(var1.field4564 / 2 + 47, 6, 22, 22, StringTextComponent.EMPTY, null);
      this.field6548 = var1;
      this.field6513 = var1x -> Class806.method2119(this.field6548, var1x);
   }

   @Override
   public void method1919() {
      this.method5743(new TranslationTextComponent(Class806.method2117(this.field6548) != 0 ? "mco.invites.pending" : "mco.invites.nopending"));
   }

   @Override
   public void method5655(MatrixStack var1, int var2, int var3, float var4) {
      Class806.method2118(this.field6548, var1, var2, var3, this.field6477, this.field6478, this.method5737(), this.field6482);
   }
}
