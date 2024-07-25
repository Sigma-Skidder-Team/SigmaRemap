package remapped;

import net.minecraft.util.text.ITextComponent;

public final class class_6872 implements class_4259 {
   private static String[] field_35397;
   private final ITextComponent field_35396;
   private final class_2502 field_35395;

   public class_6872(class_2502 var1, ITextComponent var2) {
      this.field_35395 = var1;
      this.field_35396 = var2;
   }

   @Override
   public ITextComponent method_19839() {
      return this.field_35396;
   }

   @Override
   public class_4088 method_11419(int var1, class_7051 var2, PlayerEntity var3) {
      return this.field_35395.method_11419(var1, var2, var3);
   }
}
