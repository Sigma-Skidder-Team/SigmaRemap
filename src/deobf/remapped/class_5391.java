package remapped;

import net.minecraft.util.text.ITextComponent;

public class class_5391 implements class_963 {
   private static String[] field_27522;
   private final class_341 field_27521;
   private final class_5121 field_27520;

   public class_5391(class_341 var1, class_5121 var2) {
      this.field_27521 = var1;
      this.field_27520 = var2;
   }

   @Override
   public void method_4227(class_8135 var1) {
      this.field_27520.method_23501(var1.method_37006());
      this.field_27520.method_23495(new class_3194(this.field_27521, this.field_27520));
   }

   @Override
   public void method_9090(ITextComponent var1) {
   }

   @Override
   public class_5121 method_9091() {
      return this.field_27520;
   }
}
