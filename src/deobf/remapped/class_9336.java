package remapped;

import java.util.Objects;
import java.util.function.Consumer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_9336 extends Screen {
   private static final ITextComponent field_47653 = new TranslationTextComponent("createWorld.customize.buffet.biome");
   private final Screen field_47652;
   private final Consumer<class_6325> field_47654;
   private final class_6433<class_6325> field_47658;
   private class_4213 field_47659;
   private class_6325 field_47655;
   private class_9521 field_47656;

   public class_9336(Screen var1, class_6322 var2, Consumer<class_6325> var3, class_6325 var4) {
      super(new TranslationTextComponent("createWorld.customize.buffet.title"));
      this.field_47652 = var1;
      this.field_47654 = var3;
      this.field_47655 = var4;
      this.field_47658 = var2.<class_6325>method_28813(class_8669.field_44359);
   }

   @Override
   public void method_1156() {
      this.field_943.method_8609(this.field_47652);
   }

   @Override
   public void method_1163() {
      this.field_943.field_9600.method_38887(true);
      this.field_47659 = new class_4213(this, null);
      this.field_942.add(this.field_47659);
      this.field_47656 = this.<class_9521>method_1186(new class_9521(this.field_941 / 2 - 155, this.field_940 - 28, 150, 20, class_1402.field_7625, var1 -> {
         this.field_47654.accept(this.field_47655);
         this.field_943.method_8609(this.field_47652);
      }));
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 + 5, this.field_940 - 28, 150, 20, class_1402.field_7633, var1 -> this.field_943.method_8609(this.field_47652))
      );
      this.field_47659
         .method_19585(
            this.field_47659
               .method_41183()
               .stream()
               .filter(var1 -> Objects.equals(class_2714.method_12216(var1), this.field_47655))
               .findFirst()
               .orElse((class_2714)null)
         );
   }

   private void method_43108() {
      this.field_47656.field_36675 = this.field_47659.method_36226() != null;
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1170(0);
      this.field_47659.method_6767(var1, var2, var3, var4);
      method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, 8, 16777215);
      method_9788(var1, this.field_948, field_47653, this.field_941 / 2, 28, 10526880);
      super.method_6767(var1, var2, var3, var4);
   }
}
