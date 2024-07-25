package net.minecraft.util.text;

import com.mojang.brigadier.Message;
import java.util.List;
import java.util.Optional;
import remapped.class_7107;

public interface ITextComponent extends Message, ITextProperties {
   Style getStyle();

   String getUnformattedComponentText();

   @Override
   default String getString() {
      return ITextProperties.super.getString();
   }

   default String getStringTruncated(int maxLen) {
      StringBuilder var4 = new StringBuilder();
      this.func_230438_a_(p_240639_2_ -> {
         int var5 = maxLen - var4.length();
         if (var5 <= 0) {
            return field_240650_b_;
         } else {
            var4.append(p_240639_2_.length() <= var5 ? p_240639_2_ : p_240639_2_.substring(0, var5));
            return Optional.empty();
         }
      });
      return var4.toString();
   }

   List<ITextComponent> getSiblings();

   IFormattableTextComponent copyRaw();

   IFormattableTextComponent deepCopy();

   class_7107 func_241878_f();

   @Override
   default <T> Optional<T> func_230439_a_(ITextProperties$class_41<T> p_230439_1_, Style p_230439_2_) {
      Style optional = this.getStyle().mergeStyle(p_230439_2_);
      Optional var6 = this.<T>func_230534_b_(p_230439_1_, optional);
      if (var6.isPresent()) {
         return var6;
      } else {
         for (ITextComponent optional1 : this.getSiblings()) {
            Optional var9 = optional1.<T>func_230439_a_(p_230439_1_, optional);
            if (var9.isPresent()) {
               return var9;
            }
         }

         return Optional.<T>empty();
      }
   }

   @Override
   default <T> Optional<T> func_230438_a_(ITextProperties$class_42<T> p_230438_1_) {
      Optional var4 = this.<T>func_230533_b_(p_230438_1_);
      if (var4.isPresent()) {
         return var4;
      } else {
         for (ITextComponent optional1 : this.getSiblings()) {
            Optional var7 = optional1.<T>func_230438_a_(p_230438_1_);
            if (var7.isPresent()) {
               return var7;
            }
         }

         return Optional.<T>empty();
      }
   }

   default <T> Optional<T> func_230534_b_(ITextProperties$class_41<T> p_230534_1_, Style p_230534_2_) {
      return p_230534_1_.accept(p_230534_2_, this.getUnformattedComponentText());
   }

   default <T> Optional<T> func_230533_b_(ITextProperties$class_42<T> p_230533_1_) {
      return p_230533_1_.accept(this.getUnformattedComponentText());
   }

   static ITextComponent func_244388_a(String p_244388_0_) {
      return (ITextComponent)(p_244388_0_ != null ? new StringTextComponent(p_244388_0_) : StringTextComponent.EMPTY);
   }
}
