package net.minecraft.util.text;

import java.util.function.UnaryOperator;

public interface IFormattableTextComponent extends ITextComponent {
   IFormattableTextComponent setStyle(Style var1);

   default IFormattableTextComponent appendString(String string) {
      return this.append(new StringTextComponent(string));
   }

   IFormattableTextComponent append(ITextComponent var1);

   default IFormattableTextComponent modifyStyle(UnaryOperator<Style> modifyFunc) {
      this.setStyle(modifyFunc.apply(this.getStyle()));
      return this;
   }

   default IFormattableTextComponent mergeStyle(Style style) {
      this.setStyle(style.mergeStyle(this.getStyle()));
      return this;
   }

   default IFormattableTextComponent mergeStyle(TextFormatting... formats) {
      this.setStyle(this.getStyle().createStyleFromFormattings(formats));
      return this;
   }

   default IFormattableTextComponent mergeStyle(TextFormatting format) {
      this.setStyle(this.getStyle().applyFormatting(format));
      return this;
   }
}
