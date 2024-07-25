package remapped;

import java.util.List;
import java.util.function.Consumer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_9675 extends Screen {
   public final class_6577 field_49281;
   private final Consumer<class_9512> field_49280;
   private class_9512 field_49279;
   private ITextComponent field_49283;
   private ITextComponent field_49282;
   private class_4114 field_49284;
   private class_9521 field_49278;

   public class_9675(class_6577 var1, Consumer<class_9512> var2, class_9512 var3) {
      super(new TranslationTextComponent("createWorld.customize.flat.title"));
      this.field_49281 = var1;
      this.field_49280 = var2;
      this.field_49279 = var3;
   }

   public class_9512 method_44746() {
      return this.field_49279;
   }

   public void method_44748(class_9512 var1) {
      this.field_49279 = var1;
   }

   @Override
   public void method_1163() {
      this.field_49283 = new TranslationTextComponent("createWorld.customize.flat.tile");
      this.field_49282 = new TranslationTextComponent("createWorld.customize.flat.height");
      this.field_49284 = new class_4114(this);
      this.field_942.add(this.field_49284);
      this.field_49278 = this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 155, this.field_940 - 52, 150, 20, new TranslationTextComponent("createWorld.customize.flat.removeLayer"), var1 -> {
               if (this.method_44747()) {
                  List var4 = this.field_49279.method_43905();
                  int var5 = this.field_49284.method_41183().indexOf(this.field_49284.method_36226());
                  int var6 = var4.size() - var5 - 1;
                  var4.remove(var6);
                  this.field_49284.method_19101(!var4.isEmpty() ? this.field_49284.method_41183().get(Math.min(var5, var4.size() - 1)) : null);
                  this.field_49279.method_43901();
                  this.field_49284.method_19102();
                  this.method_44744();
               }
            }
         )
      );
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 + 5, this.field_940 - 52, 150, 20, new TranslationTextComponent("createWorld.customize.presets"), var1 -> {
            this.field_943.method_8609(new class_6107(this));
            this.field_49279.method_43901();
            this.method_44744();
         })
      );
      this.<class_9521>method_1186(new class_9521(this.field_941 / 2 - 155, this.field_940 - 28, 150, 20, class_1402.field_7625, var1 -> {
         this.field_49280.accept(this.field_49279);
         this.field_943.method_8609(this.field_49281);
         this.field_49279.method_43901();
      }));
      this.<class_9521>method_1186(new class_9521(this.field_941 / 2 + 5, this.field_940 - 28, 150, 20, class_1402.field_7633, var1 -> {
         this.field_943.method_8609(this.field_49281);
         this.field_49279.method_43901();
      }));
      this.field_49279.method_43901();
      this.method_44744();
   }

   private void method_44744() {
      this.field_49278.field_36675 = this.method_44747();
   }

   private boolean method_44747() {
      return this.field_49284.method_36226() != null;
   }

   @Override
   public void method_1156() {
      this.field_943.method_8609(this.field_49281);
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      this.field_49284.method_6767(var1, var2, var3, var4);
      method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, 8, 16777215);
      int var7 = this.field_941 / 2 - 92 - 16;
      method_9771(var1, this.field_948, this.field_49283, var7, 32, 16777215);
      method_9771(var1, this.field_948, this.field_49282, var7 + 2 + 213 - this.field_948.method_45379(this.field_49282), 32, 16777215);
      super.method_6767(var1, var2, var3, var4);
   }
}
