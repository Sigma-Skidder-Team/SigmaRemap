package net.minecraft.util.text;

import java.util.Objects;
import javax.annotation.Nullable;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.HoverEvent;
import remapped.class_4639;

public class Style {
   public static final Style EMPTY = new Style(
      (Color)null,
      (Boolean)null,
      (Boolean)null,
      (Boolean)null,
      (Boolean)null,
      (Boolean)null,
      (ClickEvent)null,
      (HoverEvent)null,
      (String)null,
      (class_4639)null
   );
   public static final class_4639 DEFAULT_FONT = new class_4639("minecraft", "default");
   private final Color color;
   private final Boolean bold;
   private final Boolean italic;
   private final Boolean underlined;
   private final Boolean strikethrough;
   private final Boolean obfuscated;
   private final ClickEvent clickEvent;
   private final HoverEvent hoverEvent;
   private final String insertion;
   private final class_4639 fontId;

   private Style(
      Color color,
      Boolean bold,
      Boolean italic,
      Boolean underlined,
      Boolean strikethrough,
      Boolean obfuscated,
      ClickEvent clickEvent,
      HoverEvent hoverEvent,
      String insertion,
      class_4639 fontId
   ) {
      this.color = color;
      this.bold = bold;
      this.italic = italic;
      this.underlined = underlined;
      this.strikethrough = strikethrough;
      this.obfuscated = obfuscated;
      this.clickEvent = clickEvent;
      this.hoverEvent = hoverEvent;
      this.insertion = insertion;
      this.fontId = fontId;
   }

   @Nullable
   public Color getColor() {
      return this.color;
   }

   public boolean getBold() {
      return this.bold == Boolean.TRUE;
   }

   public boolean getItalic() {
      return this.italic == Boolean.TRUE;
   }

   public boolean getStrikethrough() {
      return this.strikethrough == Boolean.TRUE;
   }

   public boolean getUnderlined() {
      return this.underlined == Boolean.TRUE;
   }

   public boolean getObfuscated() {
      return this.obfuscated == Boolean.TRUE;
   }

   public boolean isEmpty() {
      return this == EMPTY;
   }

   @Nullable
   public ClickEvent getClickEvent() {
      return this.clickEvent;
   }

   @Nullable
   public HoverEvent getHoverEvent() {
      return this.hoverEvent;
   }

   @Nullable
   public String getInsertion() {
      return this.insertion;
   }

   public class_4639 getFontId() {
      return this.fontId != null ? this.fontId : DEFAULT_FONT;
   }

   public Style setColor(Color color) {
      return new Style(
         color, this.bold, this.italic, this.underlined, this.strikethrough, this.obfuscated, this.clickEvent, this.hoverEvent, this.insertion, this.fontId
      );
   }

   public Style setFormatting(TextFormatting formatting) {
      return this.setColor(formatting != null ? Color.func_240744_a_(formatting) : null);
   }

   public Style setBold(Boolean bold) {
      return new Style(
         this.color, bold, this.italic, this.underlined, this.strikethrough, this.obfuscated, this.clickEvent, this.hoverEvent, this.insertion, this.fontId
      );
   }

   public Style setItalic(Boolean italic) {
      return new Style(
         this.color, this.bold, italic, this.underlined, this.strikethrough, this.obfuscated, this.clickEvent, this.hoverEvent, this.insertion, this.fontId
      );
   }

   public Style func_244282_c(Boolean p_244282_1_) {
      return new Style(
         this.color, this.bold, this.italic, p_244282_1_, this.strikethrough, this.obfuscated, this.clickEvent, this.hoverEvent, this.insertion, this.fontId
      );
   }

   public Style setClickEvent(ClickEvent clickEvent) {
      return new Style(
         this.color, this.bold, this.italic, this.underlined, this.strikethrough, this.obfuscated, clickEvent, this.hoverEvent, this.insertion, this.fontId
      );
   }

   public Style setHoverEvent(HoverEvent hoverEvent) {
      return new Style(
         this.color, this.bold, this.italic, this.underlined, this.strikethrough, this.obfuscated, this.clickEvent, hoverEvent, this.insertion, this.fontId
      );
   }

   public Style setInsertion(String insertion) {
      return new Style(
         this.color, this.bold, this.italic, this.underlined, this.strikethrough, this.obfuscated, this.clickEvent, this.hoverEvent, insertion, this.fontId
      );
   }

   public Style setFontId(class_4639 fontId) {
      return new Style(
         this.color, this.bold, this.italic, this.underlined, this.strikethrough, this.obfuscated, this.clickEvent, this.hoverEvent, this.insertion, fontId
      );
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public Style applyFormatting(TextFormatting formatting) {
      Color obool = this.color;
      Boolean obool1 = this.bold;
      Boolean obool2 = this.italic;
      Boolean obool3 = this.strikethrough;
      Boolean obool4 = this.underlined;
      Boolean var9 = this.obfuscated;
      switch (formatting) {
         case OBFUSCATED:
            var9 = true;
            break;
         case BOLD:
            obool1 = true;
            break;
         case STRIKETHROUGH:
            obool3 = true;
            break;
         case UNDERLINE:
            obool4 = true;
            break;
         case ITALIC:
            obool2 = true;
            break;
         case RESET:
            return EMPTY;
         default:
            obool = Color.func_240744_a_(formatting);
      }

      return new Style(obool, obool1, obool2, obool4, obool3, var9, this.clickEvent, this.hoverEvent, this.insertion, this.fontId);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public Style forceFormatting(TextFormatting formatting) {
      Color obool = this.color;
      Boolean obool1 = this.bold;
      Boolean obool2 = this.italic;
      Boolean obool3 = this.strikethrough;
      Boolean obool4 = this.underlined;
      Boolean var9 = this.obfuscated;
      switch (formatting) {
         case OBFUSCATED:
            var9 = true;
            break;
         case BOLD:
            obool1 = true;
            break;
         case STRIKETHROUGH:
            obool3 = true;
            break;
         case UNDERLINE:
            obool4 = true;
            break;
         case ITALIC:
            obool2 = true;
            break;
         case RESET:
            return EMPTY;
         default:
            var9 = false;
            obool1 = false;
            obool3 = false;
            obool4 = false;
            obool2 = false;
            obool = Color.func_240744_a_(formatting);
      }

      return new Style(obool, obool1, obool2, obool4, obool3, var9, this.clickEvent, this.hoverEvent, this.insertion, this.fontId);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public Style createStyleFromFormattings(TextFormatting... formatings) {
      Color obool = this.color;
      Boolean obool1 = this.bold;
      Boolean obool2 = this.italic;
      Boolean obool3 = this.strikethrough;
      Boolean obool4 = this.underlined;
      Boolean var9 = this.obfuscated;

      for (TextFormatting var13 : formatings) {
         switch (var13) {
            case OBFUSCATED:
               var9 = true;
               break;
            case BOLD:
               obool1 = true;
               break;
            case STRIKETHROUGH:
               obool3 = true;
               break;
            case UNDERLINE:
               obool4 = true;
               break;
            case ITALIC:
               obool2 = true;
               break;
            case RESET:
               return EMPTY;
            default:
               obool = Color.func_240744_a_(var13);
         }
      }

      return new Style(obool, obool1, obool2, obool4, obool3, var9, this.clickEvent, this.hoverEvent, this.insertion, this.fontId);
   }

   public Style mergeStyle(Style style) {
      if (this == EMPTY) {
         return style;
      } else {
         return style == EMPTY
            ? this
            : new Style(
               this.color != null ? this.color : style.color,
               this.bold != null ? this.bold : style.bold,
               this.italic != null ? this.italic : style.italic,
               this.underlined != null ? this.underlined : style.underlined,
               this.strikethrough != null ? this.strikethrough : style.strikethrough,
               this.obfuscated != null ? this.obfuscated : style.obfuscated,
               this.clickEvent != null ? this.clickEvent : style.clickEvent,
               this.hoverEvent != null ? this.hoverEvent : style.hoverEvent,
               this.insertion != null ? this.insertion : style.insertion,
               this.fontId != null ? this.fontId : style.fontId
            );
      }
   }

   @Override
   public String toString() {
      return "Style{ color="
         + this.color
         + ", bold="
         + this.bold
         + ", italic="
         + this.italic
         + ", underlined="
         + this.underlined
         + ", strikethrough="
         + this.strikethrough
         + ", obfuscated="
         + this.obfuscated
         + ", clickEvent="
         + this.getClickEvent()
         + ", hoverEvent="
         + this.getHoverEvent()
         + ", insertion="
         + this.getInsertion()
         + ", font="
         + this.getFontId()
         + '}';
   }

   @Override
   public boolean equals(Object p_equals_1_) {
      if (this == p_equals_1_) {
         return true;
      } else if (!(p_equals_1_ instanceof Style)) {
         return false;
      } else {
         Style var4 = (Style)p_equals_1_;
         return this.getBold() == var4.getBold()
            && Objects.equals(this.getColor(), var4.getColor())
            && this.getItalic() == var4.getItalic()
            && this.getObfuscated() == var4.getObfuscated()
            && this.getStrikethrough() == var4.getStrikethrough()
            && this.getUnderlined() == var4.getUnderlined()
            && Objects.equals(this.getClickEvent(), var4.getClickEvent())
            && Objects.equals(this.getHoverEvent(), var4.getHoverEvent())
            && Objects.equals(this.getInsertion(), var4.getInsertion())
            && Objects.equals(this.getFontId(), var4.getFontId());
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(
         this.color, this.bold, this.italic, this.underlined, this.strikethrough, this.obfuscated, this.clickEvent, this.hoverEvent, this.insertion
      );
   }
}
