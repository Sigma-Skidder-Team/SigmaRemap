package remapped;

import java.util.Arrays;
import java.util.stream.Stream;
import net.minecraft.util.text.TranslationTextComponent;

public class class_3113 extends class_3259 {
   private class_2825 field_15491;
   private static final class_1013[] field_15492 = new class_1013[]{
      class_1013.field_5199, class_1013.field_5307, class_1013.field_5271, class_1013.field_5234, class_1013.field_5292
   };

   public class_3113(Screen var1, class_8881 var2) {
      super(var1, var2, new TranslationTextComponent("options.mouse_settings.title"));
   }

   @Override
   public void method_1163() {
      this.field_15491 = new class_2825(this.field_943, this.field_941, this.field_940, 32, this.field_940 - 32, 25);
      if (!class_9732.method_44938()) {
         this.field_15491.method_12856(field_15492);
      } else {
         this.field_15491
            .method_12856(Stream.<class_1013>concat(Arrays.stream(field_15492), Stream.of(class_1013.field_5299)).<class_1013>toArray(class_1013[]::new));
      }

      this.field_942.add(this.field_15491);
      this.<class_9521>method_1186(new class_9521(this.field_941 / 2 - 100, this.field_940 - 27, 200, 20, class_1402.field_7625, var1 -> {
         this.field_16164.method_40873();
         this.field_943.method_8609(this.field_16162);
      }));
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      this.field_15491.method_6767(var1, var2, var3, var4);
      method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, 5, 16777215);
      super.method_6767(var1, var2, var3, var4);
   }
}
