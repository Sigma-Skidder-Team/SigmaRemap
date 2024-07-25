package remapped;

import net.minecraft.util.text.TranslationTextComponent;

public class class_9728 extends class_8446 {
   private static final class_1013[] field_49446 = new class_1013[]{
      class_1013.field_5254,
      class_1013.field_5291,
      class_1013.field_5301,
      class_1013.field_5289,
      class_1013.field_5203,
      class_1013.field_5230,
      class_1013.field_5232,
      class_1013.field_5256,
      class_1013.field_5303,
      class_1013.field_5304,
      class_1013.field_5259,
      class_1013.field_5224
   };

   public class_9728(Screen var1, GameOptions var2) {
      super(var1, var2, new TranslationTextComponent("options.accessibility.title"), field_49446);
   }

   @Override
   public void method_38846() {
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 155,
            this.field_940 - 27,
            150,
            20,
            new TranslationTextComponent("options.accessibility.link"),
            var1 -> this.field_943.method_8609(new class_260(var1x -> {
                  if (var1x) {
                     Util.getOperatingSystem().method_37581("https://aka.ms/MinecraftJavaAccessibility");
                  }

                  this.field_943.method_8609(this);
               }, "https://aka.ms/MinecraftJavaAccessibility", true))
         )
      );
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 + 5, this.field_940 - 27, 150, 20, class_1402.field_7625, var1 -> this.field_943.method_8609(this.field_16162))
      );
   }
}
