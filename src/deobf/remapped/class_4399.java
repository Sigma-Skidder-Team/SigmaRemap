package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.util.text.event.HoverEvent$class_48;

public class class_4399 {
   private static String[] field_21535;
   private final class_1097 field_21532;
   private final String field_21529;
   private final class_6810 field_21530;
   private ITextComponent field_21534;
   private ITextComponent field_21533;
   private class_8792 field_21531;

   public class_4399(class_1097 var1, String var2, class_6810 var3, ITextComponent var4, class_8792 var5) {
      this.field_21532 = var1;
      this.field_21529 = var2;
      this.field_21530 = var3;
      this.field_21534 = var4;
      this.field_21533 = this.method_20489();
      this.field_21531 = var5;
   }

   public class_1097 method_20486() {
      return this.field_21532;
   }

   public String method_20490() {
      return this.field_21529;
   }

   public class_6810 method_20491() {
      return this.field_21530;
   }

   public ITextComponent method_20488() {
      return this.field_21534;
   }

   private ITextComponent method_20489() {
      return TextComponentUtils.wrapWithSquareBrackets(
         this.field_21534
            .deepCopy()
            .modifyStyle(var1 -> var1.setHoverEvent(new HoverEvent(HoverEvent$class_48.SHOW_TEXT, new StringTextComponent(this.field_21529))))
      );
   }

   public ITextComponent method_20482() {
      return this.field_21533;
   }

   public void method_20485(ITextComponent var1) {
      this.field_21534 = var1;
      this.field_21533 = this.method_20489();
      this.field_21532.method_4845(this);
   }

   public class_8792 method_20483() {
      return this.field_21531;
   }

   public void method_20484(class_8792 var1) {
      this.field_21531 = var1;
      this.field_21532.method_4845(this);
   }
}
