package remapped;

import javax.annotation.Nullable;

public class class_6721 implements class_5256<class_7110> {
   private static String[] field_34705;
   private final class_6571 field_34706;

   public class_6721(class_6571 var1) {
      this.field_34706 = var1;
   }

   @Nullable
   public class_9733 method_30848(class_7110 var1, class_174 var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      class_2522 var17 = var1.method_32671();
      if (!var17.method_8345() && var17.method_8352() == class_7537.field_38470) {
         return null;
      } else {
         class_1331 var18 = new class_1331(var3, var5, var7);
         int var19 = MinecraftClient.getInstance().method_8569().method_20744(var17, var2, var18);
         if (var17.method_8360() instanceof class_305) {
            var19 = ((class_305)var17.method_8360()).method_1358(var17, var2, var18);
         }

         float var20 = (float)(var19 >> 16 & 0xFF) / 255.0F;
         float var21 = (float)(var19 >> 8 & 0xFF) / 255.0F;
         float var22 = (float)(var19 & 0xFF) / 255.0F;
         return new class_5015(var2, var3, var5, var7, var20, var21, var22, this.field_34706, null);
      }
   }
}
