package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_3391 extends Screen {
   private static final ITextComponent field_16701 = new TranslationTextComponent("jigsaw_block.joint_label");
   private static final ITextComponent field_16705 = new TranslationTextComponent(field_16714[0]);
   private static final ITextComponent field_16710 = new TranslationTextComponent(field_16714[1]);
   private static final ITextComponent field_16702 = new TranslationTextComponent(field_16714[2]);
   private static final ITextComponent field_16713 = new TranslationTextComponent(field_16714[3]);
   private final class_6786 field_16700;
   private class_1863 field_16708;
   private class_1863 field_16712;
   private class_1863 field_16715;
   private class_1863 field_16707;
   private int field_16709;
   private boolean field_16711 = true;
   private class_9521 field_16704;
   private class_9521 field_16703;
   private class_1252 field_16706;

   public class_3391(class_6786 var1) {
      super(class_7542.field_38486);
      this.field_16700 = var1;
   }

   @Override
   public void method_5312() {
      this.field_16708.method_8279();
      this.field_16712.method_8279();
      this.field_16715.method_8279();
      this.field_16707.method_8279();
   }

   private void method_15677() {
      this.method_15676();
      this.field_943.method_8609((Screen)null);
   }

   private void method_15674() {
      this.field_943.method_8609((Screen)null);
   }

   private void method_15676() {
      this.field_943
         .method_8614()
         .method_4813(
            new class_1074(
               this.field_16700.method_17399(),
               new Identifier(this.field_16708.method_8246()),
               new Identifier(this.field_16712.method_8246()),
               new Identifier(this.field_16715.method_8246()),
               this.field_16707.method_8246(),
               this.field_16706
            )
         );
   }

   private void method_15675() {
      this.field_943.method_8614().method_4813(new class_9054(this.field_16700.method_17399(), this.field_16709, this.field_16711));
   }

   @Override
   public void method_1156() {
      this.method_15674();
   }

   @Override
   public void method_1163() {
      this.field_943.field_9600.method_38887(true);
      this.field_16715 = new class_1863(this.field_948, this.field_941 / 2 - 152, 20, 300, 20, new TranslationTextComponent("jigsaw_block.pool"));
      this.field_16715.method_8255(128);
      this.field_16715.method_8281(this.field_16700.method_31108().toString());
      this.field_16715.method_8277(var1 -> this.method_15678());
      this.field_942.add(this.field_16715);
      this.field_16708 = new class_1863(this.field_948, this.field_941 / 2 - 152, 55, 300, 20, new TranslationTextComponent("jigsaw_block.name"));
      this.field_16708.method_8255(128);
      this.field_16708.method_8281(this.field_16700.method_31111().toString());
      this.field_16708.method_8277(var1 -> this.method_15678());
      this.field_942.add(this.field_16708);
      this.field_16712 = new class_1863(this.field_948, this.field_941 / 2 - 152, 90, 300, 20, new TranslationTextComponent("jigsaw_block.target"));
      this.field_16712.method_8255(128);
      this.field_16712.method_8281(this.field_16700.method_31102().toString());
      this.field_16712.method_8277(var1 -> this.method_15678());
      this.field_942.add(this.field_16712);
      this.field_16707 = new class_1863(this.field_948, this.field_941 / 2 - 152, 125, 300, 20, new TranslationTextComponent("jigsaw_block.final_state"));
      this.field_16707.method_8255(256);
      this.field_16707.method_8281(this.field_16700.method_31106());
      this.field_942.add(this.field_16707);
      this.field_16706 = this.field_16700.method_31103();
      int var3 = this.field_948.method_45379(field_16701) + 10;
      this.field_16704 = this.<class_9521>method_1186(new class_9521(this.field_941 / 2 - 152 + var3, 150, 300 - var3, 20, this.method_15672(), var1 -> {
         class_1252[] var4x = class_1252.values();
         int var5 = (this.field_16706.ordinal() + 1) % var4x.length;
         this.field_16706 = var4x[var5];
         var1.method_32687(this.method_15672());
      }));
      boolean var4 = class_195.method_860(this.field_16700.method_17403()).method_1029().method_42626();
      this.field_16704.field_36675 = var4;
      this.field_16704.field_36677 = var4;
      this.<class_9313>method_1186(new class_9313(this, this.field_941 / 2 - 154, 180, 100, 20, StringTextComponent.EMPTY, 0.0));
      this.<class_9145>method_1186(
         new class_9145(this, this.field_941 / 2 - 50, 180, 100, 20, new TranslationTextComponent("jigsaw_block.keep_jigsaws"), var1 -> {
            this.field_16711 = !this.field_16711;
            var1.method_32693(250);
         })
      );
      this.<class_9521>method_1186(new class_9521(this.field_941 / 2 + 54, 180, 100, 20, new TranslationTextComponent("jigsaw_block.generate"), var1 -> {
         this.method_15677();
         this.method_15675();
      }));
      this.field_16703 = this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 4 - 150, 210, 150, 20, class_1402.field_7625, var1 -> this.method_15677())
      );
      this.<class_9521>method_1186(new class_9521(this.field_941 / 2 + 4, 210, 150, 20, class_1402.field_7633, var1 -> this.method_15674()));
      this.method_41178(this.field_16715);
      this.method_15678();
   }

   private void method_15678() {
      this.field_16703.field_36675 = Identifier.method_21453(this.field_16708.method_8246())
         && Identifier.method_21453(this.field_16712.method_8246())
         && Identifier.method_21453(this.field_16715.method_8246());
   }

   @Override
   public void method_1191(MinecraftClient var1, int var2, int var3) {
      String var6 = this.field_16708.method_8246();
      String var7 = this.field_16712.method_8246();
      String var8 = this.field_16715.method_8246();
      String var9 = this.field_16707.method_8246();
      int var10 = this.field_16709;
      class_1252 var11 = this.field_16706;
      this.method_1164(var1, var2, var3);
      this.field_16708.method_8281(var6);
      this.field_16712.method_8281(var7);
      this.field_16715.method_8281(var8);
      this.field_16707.method_8281(var9);
      this.field_16709 = var10;
      this.field_16706 = var11;
      this.field_16704.method_32687(this.method_15672());
   }

   private ITextComponent method_15672() {
      return new TranslationTextComponent("jigsaw_block.joint." + this.field_16706.method_21049());
   }

   @Override
   public void method_1162() {
      this.field_943.field_9600.method_38887(false);
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (super.method_26946(var1, var2, var3)) {
         return true;
      } else if (this.field_16703.field_36675 && (var1 == 257 || var1 == 335)) {
         this.method_15677();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      method_9771(var1, this.field_948, field_16705, this.field_941 / 2 - 153, 10, 10526880);
      this.field_16715.method_6767(var1, var2, var3, var4);
      method_9771(var1, this.field_948, field_16710, this.field_941 / 2 - 153, 45, 10526880);
      this.field_16708.method_6767(var1, var2, var3, var4);
      method_9771(var1, this.field_948, field_16702, this.field_941 / 2 - 153, 80, 10526880);
      this.field_16712.method_6767(var1, var2, var3, var4);
      method_9771(var1, this.field_948, field_16713, this.field_941 / 2 - 153, 115, 10526880);
      this.field_16707.method_6767(var1, var2, var3, var4);
      if (class_195.method_860(this.field_16700.method_17403()).method_1029().method_42626()) {
         method_9771(var1, this.field_948, field_16701, this.field_941 / 2 - 153, 156, 16777215);
      }

      super.method_6767(var1, var2, var3, var4);
   }
}
