package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_6905 extends class_4232 {
   private Screen field_35500;
   private ITextComponent field_35499;
   private ITextComponent field_35498;
   private final List<class_7107> field_35497 = Lists.newArrayList();
   public String field_35495;
   private int field_35501;

   public class_6905(Screen var1, String var2, String var3) {
      super(new TranslationTextComponent("of.options.detailsTitle"));
      this.field_35500 = var1;
      this.field_35499 = new StringTextComponent(var2);
      this.field_35498 = new StringTextComponent(var3);
      this.field_35495 = class_6956.method_31803("gui.done");
   }

   @Override
   public void method_1163() {
      this.<class_5932>method_1186(new class_5932(0, this.field_941 / 2 - 100, this.field_940 / 6 + 96, this.field_35495));
      this.field_35497.clear();
      this.field_35497.addAll(this.field_943.textRenderer.method_45391(this.field_35498, this.field_941 - 50));
   }

   @Override
   public void method_19728(class_7114 var1) {
      class_3111.method_14327().method_8609(this.field_35500);
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      method_9788(var1, this.field_20538, this.field_35499, this.field_941 / 2, 70, 16777215);
      byte var7 = 90;

      for (class_7107 var9 : this.field_35497) {
         method_19730(var1, this.field_20538, var9, this.field_941 / 2, var7, 16777215);
         var7 += 9;
      }

      super.method_6767(var1, var2, var3, var4);
   }

   public void method_31643(int var1) {
      this.field_35501 = var1;

      for (class_7114 var5 : this.field_20540) {
         var5.field_36675 = false;
      }
   }

   @Override
   public void method_5312() {
      super.method_5312();
      if (--this.field_35501 == 0) {
         for (class_7114 var4 : this.field_20540) {
            var4.field_36675 = true;
         }
      }
   }
}
