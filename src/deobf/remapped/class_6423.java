package remapped;

import net.minecraft.util.text.StringTextComponent;

public class class_6423 extends class_9521 {
   private static String[] field_32827;
   private final boolean field_32828;
   private final boolean field_32826;

   public class_6423(int var1, int var2, boolean var3, class_1500 var4, boolean var5) {
      super(var1, var2, 23, 13, StringTextComponent.EMPTY, var4);
      this.field_32828 = var3;
      this.field_32826 = var5;
   }

   @Override
   public void method_32686(class_7966 var1, int var2, int var3, float var4) {
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      MinecraftClient.getInstance().method_8577().method_35674(class_7680.field_39030);
      byte var7 = 0;
      short var8 = 192;
      if (this.method_32703()) {
         var7 += 23;
      }

      if (!this.field_32828) {
         var8 += 13;
      }

      this.method_9781(var1, this.field_36670, this.field_36674, var7, var8, 23, 13);
   }

   @Override
   public void method_32692(class_3541 var1) {
      if (this.field_32826) {
         var1.method_16345(class_4949.method_22675(class_463.field_2778, 1.0F));
      }
   }
}
