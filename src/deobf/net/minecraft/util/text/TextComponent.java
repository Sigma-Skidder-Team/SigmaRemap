package net.minecraft.util.text;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import remapped.class_7107;

public abstract class TextComponent implements IFormattableTextComponent {
   public final List<ITextComponent> siblings = Lists.newArrayList();
   private class_7107 field_244278_d = class_7107.field_36653;
   private LanguageMap field_244279_e;
   private Style style = Style.EMPTY;

   @Override
   public IFormattableTextComponent append(ITextComponent sibling) {
      this.siblings.add(sibling);
      return this;
   }

   @Override
   public String getUnformattedComponentText() {
      return "";
   }

   @Override
   public List<ITextComponent> getSiblings() {
      return this.siblings;
   }

   @Override
   public IFormattableTextComponent setStyle(Style style) {
      this.style = style;
      return this;
   }

   @Override
   public Style getStyle() {
      return this.style;
   }

   public abstract TextComponent copyRaw();

   @Override
   public final IFormattableTextComponent deepCopy() {
      TextComponent var3 = this.copyRaw();
      var3.siblings.addAll(this.siblings);
      var3.setStyle(this.style);
      return var3;
   }

   @Override
   public class_7107 func_241878_f() {
      LanguageMap var3 = LanguageMap.getInstance();
      if (this.field_244279_e != var3) {
         this.field_244278_d = var3.func_241870_a(this);
         this.field_244279_e = var3;
      }

      return this.field_244278_d;
   }

   @Override
   public boolean equals(Object p_equals_1_) {
      if (this == p_equals_1_) {
         return true;
      } else if (!(p_equals_1_ instanceof TextComponent)) {
         return false;
      } else {
         TextComponent var4 = (TextComponent)p_equals_1_;
         return this.siblings.equals(var4.siblings) && Objects.equals(this.getStyle(), var4.getStyle());
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.getStyle(), this.siblings);
   }

   @Override
   public String toString() {
      return "BaseComponent{style=" + this.style + ", siblings=" + this.siblings + '}';
   }
}
