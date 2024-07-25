package remapped;

import net.minecraft.util.text.ITextComponent;

public class class_9145 extends class_9521 {
   private static String[] field_46773;

   public class_9145(class_3391 var1, int var2, int var3, int var4, int var5, ITextComponent var6, class_1500 var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.field_46774 = var1;
   }

   @Override
   public ITextComponent method_32685() {
      return class_1402.method_6480(super.method_32685(), class_3391.method_15679(this.field_46774));
   }
}
