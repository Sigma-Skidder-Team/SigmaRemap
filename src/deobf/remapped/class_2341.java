package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2341 extends class_1094 {
   private static final ITextComponent field_11685 = new TranslationTextComponent(field_11682[1]);
   private static final ITextComponent field_11677 = new TranslationTextComponent(field_11682[2]);
   private final class_7675 field_11679;
   private final class_7039 field_11681;
   private class_1863 field_11684;
   private class_1863 field_11678;
   private class_9521 field_11683;
   private class_8949 field_11680;

   public class_2341(class_7675 var1, class_7039 var2) {
      this.field_11679 = var1;
      this.field_11681 = var2;
   }

   @Override
   public void method_5312() {
      if (this.field_11684 != null) {
         this.field_11684.method_8279();
      }

      if (this.field_11678 != null) {
         this.field_11678.method_8279();
      }
   }

   @Override
   public void method_1163() {
      this.field_943.field_9600.method_38887(true);
      this.field_11683 = this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 100, this.field_940 / 4 + 120 + 17, 97, 20, new TranslationTextComponent("mco.create.world"), var1 -> this.method_10735()
         )
      );
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 + 5, this.field_940 / 4 + 120 + 17, 95, 20, class_1402.field_7633, var1 -> this.field_943.method_8609(this.field_11681)
         )
      );
      this.field_11683.field_36675 = false;
      this.field_11684 = new class_1863(
         this.field_943.field_9668, this.field_941 / 2 - 100, 65, 200, 20, (class_1863)null, new TranslationTextComponent("mco.configure.world.name")
      );
      this.<class_1863>method_1159(this.field_11684);
      this.method_41178(this.field_11684);
      this.field_11678 = new class_1863(
         this.field_943.field_9668, this.field_941 / 2 - 100, 115, 200, 20, (class_1863)null, new TranslationTextComponent("mco.configure.world.description")
      );
      this.<class_1863>method_1159(this.field_11678);
      this.field_11680 = new class_8949(new TranslationTextComponent("mco.selectServer.create"), this.field_941 / 2, 11, 16777215);
      this.<class_8949>method_1159(this.field_11680);
      this.method_4820();
   }

   @Override
   public void method_1162() {
      this.field_943.field_9600.method_38887(false);
   }

   @Override
   public boolean method_26938(char var1, int var2) {
      boolean var5 = super.method_26938(var1, var2);
      this.field_11683.field_36675 = this.method_10734();
      return var5;
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (var1 != 256) {
         boolean var6 = super.method_26946(var1, var2, var3);
         this.field_11683.field_36675 = this.method_10734();
         return var6;
      } else {
         this.field_943.method_8609(this.field_11681);
         return true;
      }
   }

   private void method_10735() {
      if (this.method_10734()) {
         class_5824 var3 = new class_5824(
            this.field_11681,
            this.field_11679,
            new TranslationTextComponent("mco.selectServer.create"),
            new TranslationTextComponent("mco.create.world.subtitle"),
            10526880,
            new TranslationTextComponent("mco.create.world.skip"),
            () -> this.field_943.method_8609(this.field_11681.method_32264()),
            () -> this.field_943.method_8609(this.field_11681.method_32264())
         );
         var3.method_26362(new TranslationTextComponent("mco.create.world.reset.title"));
         this.field_943
            .method_8609(
               new class_1065(
                  this.field_11681, new class_8950(this.field_11679.field_39016, this.field_11684.method_8246(), this.field_11678.method_8246(), var3)
               )
            );
      }
   }

   private boolean method_10734() {
      return !this.field_11684.method_8246().trim().isEmpty();
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      this.field_11680.method_41093(this, var1);
      this.field_948.method_45378(var1, field_11685, (float)(this.field_941 / 2 - 100), 52.0F, 10526880);
      this.field_948.method_45378(var1, field_11677, (float)(this.field_941 / 2 - 100), 102.0F, 10526880);
      if (this.field_11684 != null) {
         this.field_11684.method_6767(var1, var2, var3, var4);
      }

      if (this.field_11678 != null) {
         this.field_11678.method_6767(var1, var2, var3, var4);
      }

      super.method_6767(var1, var2, var3, var4);
   }
}
