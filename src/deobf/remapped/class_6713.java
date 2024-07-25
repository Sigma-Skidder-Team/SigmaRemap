package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_6713 extends class_266 {
   private static final ITextComponent field_34692 = new TranslationTextComponent("selectWorld.allowCommands");
   private static final ITextComponent field_34688 = new TranslationTextComponent("selectWorld.gameMode");
   private static final ITextComponent field_34693 = new TranslationTextComponent("lanServer.otherPlayers");
   private final class_266 field_34694;
   private class_9521 field_34689;
   private class_9521 field_34687;
   private String field_34691 = "survival";
   private boolean field_34686;

   public class_6713(class_266 var1) {
      super(new TranslationTextComponent("lanServer.title"));
      this.field_34694 = var1;
   }

   @Override
   public void method_1163() {
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 155, this.field_940 - 28, 150, 20, new TranslationTextComponent("lanServer.start"), var1 -> {
            this.field_943.method_8609((class_266)null);
            int var4 = class_828.method_3611();
            TranslationTextComponent var5;
            if (!this.field_943.method_8515().method_1625(class_4666.method_21586(this.field_34691), this.field_34686, var4)) {
               var5 = new TranslationTextComponent("commands.publish.failed");
            } else {
               var5 = new TranslationTextComponent("commands.publish.started", var4);
            }

            this.field_943.field_9614.method_13991().method_18676(var5);
            this.field_943.method_8545();
         })
      );
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 + 5, this.field_940 - 28, 150, 20, class_1402.field_7633, var1 -> this.field_943.method_8609(this.field_34694))
      );
      this.field_34687 = this.<class_9521>method_1186(new class_9521(this.field_941 / 2 - 155, 100, 150, 20, StringTextComponent.EMPTY, var1 -> {
         if (!"spectator".equals(this.field_34691)) {
            if (!"creative".equals(this.field_34691)) {
               if (!"adventure".equals(this.field_34691)) {
                  this.field_34691 = "spectator";
               } else {
                  this.field_34691 = "survival";
               }
            } else {
               this.field_34691 = "adventure";
            }
         } else {
            this.field_34691 = "creative";
         }

         this.method_30831();
      }));
      this.field_34689 = this.<class_9521>method_1186(new class_9521(this.field_941 / 2 + 5, 100, 150, 20, field_34692, var1 -> {
         this.field_34686 = !this.field_34686;
         this.method_30831();
      }));
      this.method_30831();
   }

   private void method_30831() {
      this.field_34687
         .method_32687(
            new TranslationTextComponent("options.generic_value", field_34688, new TranslationTextComponent("selectWorld.gameMode." + this.field_34691))
         );
      this.field_34689.method_32687(class_1402.method_6480(field_34692, this.field_34686));
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, 50, 16777215);
      method_9788(var1, this.field_948, field_34693, this.field_941 / 2, 82, 16777215);
      super.method_6767(var1, var2, var3, var4);
   }
}
