package remapped;

import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import net.minecraft.util.text.TranslationTextComponent;

public class class_3547 extends class_266 {
   private final Consumer<Optional<class_291>> field_17355;
   private class_5414 field_17358;
   private final Set<class_3268> field_17357 = Sets.newHashSet();
   private class_9521 field_17359;
   private List<class_7107> field_17354;
   private final class_291 field_17356;

   public class_3547(class_291 var1, Consumer<Optional<class_291>> var2) {
      super(new TranslationTextComponent("editGamerule.title"));
      this.field_17356 = var1;
      this.field_17355 = var2;
   }

   @Override
   public void method_1163() {
      this.field_943.field_9600.method_38887(true);
      super.method_1163();
      this.field_17358 = new class_5414(this, this.field_17356);
      this.field_942.add(this.field_17358);
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 155 + 160, this.field_940 - 29, 150, 20, class_1402.field_7633, var1 -> this.field_17355.accept(Optional.<class_291>empty())
         )
      );
      this.field_17359 = this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 155,
            this.field_940 - 29,
            150,
            20,
            class_1402.field_7625,
            var1 -> this.field_17355.accept(Optional.<class_291>of(this.field_17356))
         )
      );
   }

   @Override
   public void method_1162() {
      this.field_943.field_9600.method_38887(false);
   }

   @Override
   public void method_1156() {
      this.field_17355.accept(Optional.<class_291>empty());
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.field_17354 = null;
      this.field_17358.method_6767(var1, var2, var3, var4);
      method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, 20, 16777215);
      super.method_6767(var1, var2, var3, var4);
      if (this.field_17354 != null) {
         this.method_1175(var1, this.field_17354, var2, var3);
      }
   }

   private void method_16501(List<class_7107> var1) {
      this.field_17354 = var1;
   }

   private void method_16503() {
      this.field_17359.field_36675 = this.field_17357.isEmpty();
   }

   private void method_16505(class_3268 var1) {
      this.field_17357.add(var1);
      this.method_16503();
   }

   private void method_16502(class_3268 var1) {
      this.field_17357.remove(var1);
      this.method_16503();
   }
}
