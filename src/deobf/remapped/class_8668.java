package remapped;

import net.minecraft.util.text.ITextProperties;

public interface class_8668 {
   int method_39737();

   ITextProperties method_39734(int var1);

   default ITextProperties method_39735(int var1) {
      return var1 >= 0 && var1 < this.method_39737() ? this.method_39734(var1) : ITextProperties.field_240651_c_;
   }

   static class_8668 method_39736(class_6098 var0) {
      class_2451 var3 = var0.method_27960();
      if (var3 != class_4897.field_24698) {
         return (class_8668)(var3 != class_4897.field_24805 ? class_7680.field_39032 : new class_9038(var0));
      } else {
         return new class_2059(var0);
      }
   }
}
