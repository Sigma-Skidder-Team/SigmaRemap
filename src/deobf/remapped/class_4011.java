package remapped;

import net.minecraft.util.text.ITextComponent;

public class class_4011 extends class_9521 {
   private static String[] field_19479;

   public class_4011(class_668 var1, int var2, int var3, int var4, int var5, ITextComponent var6, class_1500 var7, class_6577 var8) {
      super(var2, var3, var4, var5, var6, var7);
      this.field_19478 = var1;
      this.field_19480 = var8;
   }

   @Override
   public ITextComponent method_32685() {
      return class_1402.method_6480(super.method_32685(), class_668.method_3061(this.field_19478).method_13293() && !this.field_19480.field_33539);
   }
}
