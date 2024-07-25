package remapped;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.util.text.StringTextComponent;

public class class_9888 extends class_4145 {
   private class_9521 field_50144;
   public static int field_50142 = 0;
   private class_7114 field_50143;

   public class_9888() {
      super(new class_1876());
   }

   public class_9888(class_266 var1) {
      super(var1);
   }

   @Override
   public void method_1163() {
      super.method_1163();
      class_8369 var3 = new class_8369(
         "jello.portaloption",
         0.0,
         (double)(this.method_45553().size() - 1),
         1.0F,
         var1 -> (double)this.method_45551(),
         (var1, var2) -> class_3347.field_16509 = this.method_45552(var2.intValue()),
         (var1, var2) -> {
            int var5 = (int)var2.method_38570(var1);
            return new StringTextComponent(this.method_45552(var5).method_2045());
         }
      );
      this.field_50143 = this.<class_7114>method_1186(var3.method_4482(this.field_943.field_9577, this.field_941 / 2 + 40, 7, 114));
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      super.method_6767(var1, var2, var3, var4);
      class_73.method_149(
         0,
         0,
         MinecraftClient.method_8510().field_9602.method_43166(),
         (int)(30.0 * MinecraftClient.method_8510().field_9602.method_43189() / (double)class_6763.field_34898)
      );
      this.method_1183(var1);
      class_73.method_141();
      this.field_50143.method_6767(var1, var2, var3, var4);
      method_9770(var1, this.field_948, this.method_1168().getString(), this.field_941 / 2 - 146, 13, 16777215);
      method_9770(var1, this.field_948, "Jello Portal:", this.field_941 / 2 - 30, 13, class_314.method_1444(class_1255.field_6918.field_6917, 0.5F));
   }

   private int method_45551() {
      field_50142 = 0;

      for (class_412 var4 : this.method_45553()) {
         if (this.method_45552(field_50142).equals(class_3347.method_15348())) {
            break;
         }

         field_50142++;
      }

      return field_50142;
   }

   private List<class_412> method_45553() {
      ArrayList var3 = new ArrayList();

      for (class_412 var5 : class_412.field_1753) {
         if (var5.method_2055() >= class_412.field_1747.method_2055()) {
            var3.add(var5);
         }
      }

      return var3;
   }

   private class_412 method_45552(int var1) {
      return this.method_45553().get(var1);
   }

   @Override
   public boolean method_1161() {
      return false;
   }
}
