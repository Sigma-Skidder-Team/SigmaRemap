package remapped;

import java.util.List;
import net.minecraft.util.text.TranslationTextComponent;

public class class_7899 extends Screen {
   public final Screen field_40393;
   private List<class_7107> field_40389;
   private class_9521 field_40395;
   private class_9521 field_40388;
   private class_9521 field_40394;
   private class_9521 field_40392;
   public class_1863 field_40390;
   private class_8224 field_40391;

   public class_7899(Screen var1) {
      super(new TranslationTextComponent("selectWorld.title"));
      this.field_40393 = var1;
   }

   @Override
   public boolean method_26945(double var1, double var3, double var5) {
      return super.method_26945(var1, var3, var5);
   }

   @Override
   public void method_5312() {
      this.field_40390.method_8279();
   }

   @Override
   public void method_1163() {
      this.field_943.field_9600.method_38887(true);
      this.field_40390 = new class_1863(
         this.field_948, this.field_941 / 2 - 100, 22, 200, 20, this.field_40390, new TranslationTextComponent("selectWorld.search")
      );
      this.field_40390.method_8277(var1 -> this.field_40391.method_37658(() -> var1, false));
      this.field_40391 = new class_8224(
         this, this.field_943, this.field_941, this.field_940, 48, this.field_940 - 64, 36, () -> this.field_40390.method_8246(), this.field_40391
      );
      this.field_942.add(this.field_40390);
      this.field_942.add(this.field_40391);
      this.field_40388 = this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 154,
            this.field_940 - 52,
            150,
            20,
            new TranslationTextComponent("selectWorld.select"),
            var1 -> this.field_40391.method_37647().ifPresent(class_9662::method_44610)
         )
      );
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 + 4,
            this.field_940 - 52,
            150,
            20,
            new TranslationTextComponent("selectWorld.create"),
            var1 -> this.field_943.method_8609(class_6577.method_30058(this))
         )
      );
      this.field_40394 = this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 154,
            this.field_940 - 28,
            72,
            20,
            new TranslationTextComponent("selectWorld.edit"),
            var1 -> this.field_40391.method_37647().ifPresent(class_9662::method_44607)
         )
      );
      this.field_40395 = this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 76,
            this.field_940 - 28,
            72,
            20,
            new TranslationTextComponent("selectWorld.delete"),
            var1 -> this.field_40391.method_37647().ifPresent(class_9662::method_44605)
         )
      );
      this.field_40392 = this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 + 4,
            this.field_940 - 28,
            72,
            20,
            new TranslationTextComponent("selectWorld.recreate"),
            var1 -> this.field_40391.method_37647().ifPresent(class_9662::method_44609)
         )
      );
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 + 82, this.field_940 - 28, 72, 20, class_1402.field_7633, var1 -> this.field_943.method_8609(this.field_40393))
      );
      this.method_35707(false);
      this.method_41178(this.field_40390);
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      return !super.method_26946(var1, var2, var3) ? this.field_40390.method_26946(var1, var2, var3) : true;
   }

   @Override
   public void method_1156() {
      this.field_943.method_8609(this.field_40393);
   }

   @Override
   public boolean method_26938(char var1, int var2) {
      return this.field_40390.method_26938(var1, var2);
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.field_40389 = null;
      this.field_40391.method_6767(var1, var2, var3, var4);
      this.field_40390.method_6767(var1, var2, var3, var4);
      method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, 8, 16777215);
      super.method_6767(var1, var2, var3, var4);
      if (this.field_40389 != null) {
         this.method_1175(var1, this.field_40389, var2, var3);
      }
   }

   public void method_35708(List<class_7107> var1) {
      this.field_40389 = var1;
   }

   public void method_35707(boolean var1) {
      this.field_40388.field_36675 = var1;
      this.field_40395.field_36675 = var1;
      this.field_40394.field_36675 = var1;
      this.field_40392.field_36675 = var1;
   }

   @Override
   public void method_1162() {
      if (this.field_40391 != null) {
         this.field_40391.method_41183().forEach(class_9662::close);
      }
   }
}
