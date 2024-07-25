package remapped;

import net.minecraft.util.text.TranslationTextComponent;

public class class_7808 extends class_4591 {
   private final class_7454 field_39529;
   private class_9521 field_39524;
   private class_9521 field_39523;
   private class_9521 field_39526;
   private class_9776 field_39525 = class_9776.field_49631;
   private boolean field_39527;
   private boolean field_39528;

   public class_7808(class_7454 var1) {
      this.field_39529 = var1;
   }

   @Override
   public class_8116 method_21257() {
      return this.field_39529.method_33929();
   }

   @Override
   public int method_21255() {
      return 135;
   }

   @Override
   public void method_1163() {
      super.method_1163();
      this.field_39524 = this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 50 - 100 - 4, 165, 100, 20, new TranslationTextComponent("advMode.mode.sequence"), var1 -> {
            this.method_35393();
            this.method_35396();
         })
      );
      this.field_39523 = this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 50, 165, 100, 20, new TranslationTextComponent("advMode.mode.unconditional"), var1 -> {
            this.field_39527 = !this.field_39527;
            this.method_35395();
         })
      );
      this.field_39526 = this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 + 50 + 4, 165, 100, 20, new TranslationTextComponent("advMode.mode.redstoneTriggered"), var1 -> {
            this.field_39528 = !this.field_39528;
            this.method_35392();
         })
      );
      this.field_22315.field_36675 = false;
      this.field_22316.field_36675 = false;
      this.field_39524.field_36675 = false;
      this.field_39523.field_36675 = false;
      this.field_39526.field_36675 = false;
   }

   public void method_35394() {
      class_8116 var3 = this.field_39529.method_33929();
      this.field_22318.method_8281(var3.method_36920());
      this.field_22324 = var3.method_36927();
      this.field_39525 = this.field_39529.method_33927();
      this.field_39527 = this.field_39529.method_33930();
      this.field_39528 = this.field_39529.method_33926();
      this.method_21260();
      this.method_35396();
      this.method_35395();
      this.method_35392();
      this.field_22315.field_36675 = true;
      this.field_22316.field_36675 = true;
      this.field_39524.field_36675 = true;
      this.field_39523.field_36675 = true;
      this.field_39526.field_36675 = true;
   }

   @Override
   public void method_1191(MinecraftClient var1, int var2, int var3) {
      super.method_1191(var1, var2, var3);
      this.method_21260();
      this.method_35396();
      this.method_35395();
      this.method_35392();
      this.field_22315.field_36675 = true;
      this.field_22316.field_36675 = true;
      this.field_39524.field_36675 = true;
      this.field_39523.field_36675 = true;
      this.field_39526.field_36675 = true;
   }

   @Override
   public void method_21259(class_8116 var1) {
      this.field_943
         .method_8614()
         .sendPacket(
            new class_6066(
               new BlockPos(var1.method_36923()), this.field_22318.method_8246(), this.field_39525, var1.method_36927(), this.field_39527, this.field_39528
            )
         );
   }

   private void method_35396() {
      switch (this.field_39525) {
         case field_49629:
            this.field_39524.method_32687(new TranslationTextComponent("advMode.mode.sequence"));
            break;
         case field_49632:
            this.field_39524.method_32687(new TranslationTextComponent("advMode.mode.auto"));
            break;
         case field_49631:
            this.field_39524.method_32687(new TranslationTextComponent("advMode.mode.redstone"));
      }
   }

   private void method_35393() {
      switch (this.field_39525) {
         case field_49629:
            this.field_39525 = class_9776.field_49632;
            break;
         case field_49632:
            this.field_39525 = class_9776.field_49631;
            break;
         case field_49631:
            this.field_39525 = class_9776.field_49629;
      }
   }

   private void method_35395() {
      if (!this.field_39527) {
         this.field_39523.method_32687(new TranslationTextComponent("advMode.mode.unconditional"));
      } else {
         this.field_39523.method_32687(new TranslationTextComponent("advMode.mode.conditional"));
      }
   }

   private void method_35392() {
      if (!this.field_39528) {
         this.field_39526.method_32687(new TranslationTextComponent("advMode.mode.redstoneTriggered"));
      } else {
         this.field_39526.method_32687(new TranslationTextComponent("advMode.mode.autoexec.bat"));
      }
   }
}
