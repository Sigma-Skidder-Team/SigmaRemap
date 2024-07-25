package remapped;

import net.minecraft.util.text.StringTextComponent;

public class class_1495 extends class_9521 {
   private static String[] field_7951;

   public class_1495(class_7039 var1) {
      super(var1.field_941 - 62, 6, 20, 20, StringTextComponent.EMPTY, null);
      this.field_7952 = var1;
      this.field_48464 = var1x -> {
         if (class_7039.method_32248(this.field_7952) != null) {
            class_9665.method_44667().method_37581(class_7039.method_32248(this.field_7952));
            if (class_7039.method_32215(this.field_7952)) {
               class_8974 var4 = class_3524.method_16270();
               var4.field_45982 = false;
               class_7039.method_32223(this.field_7952, false);
               class_3524.method_16271(var4);
            }
         }
      };
   }

   @Override
   public void method_32686(class_7966 var1, int var2, int var3, float var4) {
      class_7039.method_32220(
         this.field_7952, var1, var2, var3, class_7039.method_32215(this.field_7952), this.field_36670, this.field_36674, this.method_32703(), this.field_36675
      );
   }
}
