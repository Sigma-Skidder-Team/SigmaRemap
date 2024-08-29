package net.minecraft.util.text;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import mapped.Class6619;
import net.minecraft.entity.Entity;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.util.text.event.HoverEvent$Action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;

public class TextComponentUtils {
   public static IFormattableTextComponent func_240648_a_(IFormattableTextComponent p_240648_0_, Style p_240648_1_) {
      if (p_240648_1_.isEmpty()) {
         return p_240648_0_;
      } else {
         Style var4 = p_240648_0_.getStyle();
         if (var4.isEmpty()) {
            return p_240648_0_.setStyle(p_240648_1_);
         } else {
            return var4.equals(p_240648_1_) ? p_240648_0_ : p_240648_0_.setStyle(var4.mergeStyle(p_240648_1_));
         }
      }
   }

   public static IFormattableTextComponent func_240645_a_(Class6619 p_240645_0_, ITextComponent p_240645_1_, Entity p_240645_2_, int p_240645_3_) throws CommandSyntaxException {
      if (p_240645_3_ > 100) {
         return p_240645_1_.deepCopy();
      } else {
         IFormattableTextComponent var6 = p_240645_1_ instanceof ITargetedTextComponent
            ? ((ITargetedTextComponent)p_240645_1_).func_230535_a_(p_240645_0_, p_240645_2_, p_240645_3_ + 1)
            : p_240645_1_.copyRaw();

         for (ITextComponent var8 : p_240645_1_.getSiblings()) {
            var6.append(func_240645_a_(p_240645_0_, var8, p_240645_2_, p_240645_3_ + 1));
         }

         return var6.mergeStyle(func_240646_a_(p_240645_0_, p_240645_1_.getStyle(), p_240645_2_, p_240645_3_));
      }
   }

   private static Style func_240646_a_(Class6619 p_240646_0_, Style p_240646_1_, Entity p_240646_2_, int p_240646_3_) throws CommandSyntaxException {
      HoverEvent itextcomponent = p_240646_1_.getHoverEvent();
      if (itextcomponent != null) {
         ITextComponent hoverevent1 = itextcomponent.<ITextComponent>getParameter(HoverEvent$Action.SHOW_TEXT);
         if (hoverevent1 != null) {
            HoverEvent var8 = new HoverEvent(HoverEvent$Action.SHOW_TEXT, func_240645_a_(p_240646_0_, hoverevent1, p_240646_2_, p_240646_3_ + 1));
            return p_240646_1_.setHoverEvent(var8);
         }
      }

      return p_240646_1_;
   }

   public static ITextComponent getDisplayName(GameProfile profile) {
      if (profile.getName() != null) {
         return new StringTextComponent(profile.getName());
      } else {
         return profile.getId() != null ? new StringTextComponent(profile.getId().toString()) : new StringTextComponent("(unknown)");
      }
   }

   public static ITextComponent makeGreenSortedList(Collection<String> collection) {
      return makeSortedList(collection, p_197681_0_ -> new StringTextComponent(p_197681_0_).mergeStyle(TextFormatting.GREEN));
   }

   public static <T extends Comparable<T>> ITextComponent makeSortedList(Collection<T> collection, Function<T, ITextComponent> toTextComponent) {
      if (collection.isEmpty()) {
         return StringTextComponent.EMPTY;
      } else if (collection.size() == 1) {
         return toTextComponent.apply(collection.iterator().next());
      } else {
         ArrayList<T> var4 = Lists.newArrayList(collection);
         var4.sort(Comparable::compareTo);
         return func_240649_b_(var4, toTextComponent);
      }
   }

   public static <T> IFormattableTextComponent func_240649_b_(Collection<T> p_240649_0_, Function<T, ITextComponent> p_240649_1_) {
      if (p_240649_0_.isEmpty()) {
         return new StringTextComponent("");
      } else if (p_240649_0_.size() == 1) {
         return p_240649_1_.apply(p_240649_0_.iterator().next()).deepCopy();
      } else {
         StringTextComponent flag = new StringTextComponent("");
         boolean var5 = true;

         for (Object var7 : p_240649_0_) {
            if (!var5) {
               flag.append(new StringTextComponent(", ").mergeStyle(TextFormatting.GRAY));
            }

            flag.append(p_240649_1_.apply((T)var7));
            var5 = false;
         }

         return flag;
      }
   }

   public static IFormattableTextComponent wrapWithSquareBrackets(ITextComponent toWrap) {
      return new TranslationTextComponent("chat.square_brackets", toWrap);
   }

   public static ITextComponent toTextComponent(Message message) {
      return (ITextComponent)(message instanceof ITextComponent ? (ITextComponent)message : new StringTextComponent(message.getString()));
   }
}
