package net.minecraft.util.text;

import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import remapped.class_8145;
import remapped.class_9155;

public class TranslationTextComponent extends TextComponent implements ITargetedTextComponent {
   private static final Object[] field_240753_d_ = new Object[0];
   private static final ITextProperties field_240754_e_ = ITextProperties.func_240652_a_("%");
   private static final ITextProperties field_240755_f_ = ITextProperties.func_240652_a_("null");
   private final String key;
   private final Object[] formatArgs;
   private LanguageMap field_240756_i_;
   private final List<ITextProperties> children = Lists.newArrayList();
   private static final Pattern STRING_VARIABLE_PATTERN = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");

   public TranslationTextComponent(String p_i232574_1_) {
      this.key = p_i232574_1_;
      this.formatArgs = field_240753_d_;
   }

   public TranslationTextComponent(String translationKey, Object... args) {
      this.key = translationKey;
      this.formatArgs = args;
   }

   private void ensureInitialized() {
      LanguageMap s = LanguageMap.getInstance();
      if (s != this.field_240756_i_) {
         this.field_240756_i_ = s;
         this.children.clear();
         String translationtextcomponentformatexception = s.func_230503_a_(this.key);

         try {
            this.func_240758_a_(translationtextcomponentformatexception);
         } catch (TranslationTextComponentFormatException var6) {
            this.children.clear();
            this.children.add(ITextProperties.func_240652_a_(translationtextcomponentformatexception));
         }
      }
   }

   private void func_240758_a_(String p_240758_1_) {
      Matcher illegalargumentexception = STRING_VARIABLE_PATTERN.matcher(p_240758_1_);

      try {
         int j = 0;
         int s3 = 0;

         while (illegalargumentexception.find(s3)) {
            int l = illegalargumentexception.start();
            int s4 = illegalargumentexception.end();
            if (l > s3) {
               String s1 = p_240758_1_.substring(s3, l);
               if (s1.indexOf(37) != -1) {
                  throw new IllegalArgumentException();
               }

               this.children.add(ITextProperties.func_240652_a_(s1));
            }

            String var15 = illegalargumentexception.group(2);
            String s2 = p_240758_1_.substring(l, s4);
            if ("%".equals(var15) && "%%".equals(s2)) {
               this.children.add(field_240754_e_);
            } else {
               if (!"s".equals(var15)) {
                  throw new TranslationTextComponentFormatException(this, "Unsupported format: '" + s2 + "'");
               }

               String i1 = illegalargumentexception.group(1);
               int var12 = i1 != null ? Integer.parseInt(i1) - 1 : j++;
               if (var12 < this.formatArgs.length) {
                  this.children.add(this.func_240757_a_(var12));
               }
            }

            s3 = s4;
         }

         if (s3 < p_240758_1_.length()) {
            String var14 = p_240758_1_.substring(s3);
            if (var14.indexOf(37) != -1) {
               throw new IllegalArgumentException();
            }

            this.children.add(ITextProperties.func_240652_a_(var14));
         }
      } catch (IllegalArgumentException var13) {
         throw new TranslationTextComponentFormatException(this, var13);
      }
   }

   private ITextProperties func_240757_a_(int p_240757_1_) {
      if (p_240757_1_ >= this.formatArgs.length) {
         throw new TranslationTextComponentFormatException(this, p_240757_1_);
      } else {
         Object var4 = this.formatArgs[p_240757_1_];
         if (var4 instanceof ITextComponent) {
            return (ITextComponent)var4;
         } else {
            return var4 == null ? field_240755_f_ : ITextProperties.func_240652_a_(var4.toString());
         }
      }
   }

   public TranslationTextComponent copyRaw() {
      return new TranslationTextComponent(this.key, this.formatArgs);
   }

   @Override
   public <T> Optional<T> func_230534_b_(ITextProperties$class_41<T> p_230534_1_, Style p_230534_2_) {
      this.ensureInitialized();

      for (ITextProperties optional : this.children) {
         Optional var7 = optional.<T>func_230439_a_(p_230534_1_, p_230534_2_);
         if (var7.isPresent()) {
            return var7;
         }
      }

      return Optional.<T>empty();
   }

   @Override
   public <T> Optional<T> func_230533_b_(ITextProperties$class_42<T> p_230533_1_) {
      this.ensureInitialized();

      for (ITextProperties optional : this.children) {
         Optional var6 = optional.<T>func_230438_a_(p_230533_1_);
         if (var6.isPresent()) {
            return var6;
         }
      }

      return Optional.<T>empty();
   }

   @Override
   public IFormattableTextComponent func_230535_a_(class_9155 p_230535_1_, class_8145 p_230535_2_, int p_230535_3_) throws CommandSyntaxException {
      Object[] i = new Object[this.formatArgs.length];

      for (int object = 0; object < i.length; object++) {
         Object var8 = this.formatArgs[object];
         if (var8 instanceof ITextComponent) {
            i[object] = TextComponentUtils.func_240645_a_(p_230535_1_, (ITextComponent)var8, p_230535_2_, p_230535_3_);
         } else {
            i[object] = var8;
         }
      }

      return new TranslationTextComponent(this.key, i);
   }

   @Override
   public boolean equals(Object p_equals_1_) {
      if (this == p_equals_1_) {
         return true;
      } else if (!(p_equals_1_ instanceof TranslationTextComponent)) {
         return false;
      } else {
         TranslationTextComponent var4 = (TranslationTextComponent)p_equals_1_;
         return Arrays.equals(this.formatArgs, var4.formatArgs) && this.key.equals(var4.key) && super.equals(p_equals_1_);
      }
   }

   @Override
   public int hashCode() {
      int var3 = super.hashCode();
      var3 = 31 * var3 + this.key.hashCode();
      return 31 * var3 + Arrays.hashCode(this.formatArgs);
   }

   @Override
   public String toString() {
      return "TranslatableComponent{key='"
         + this.key
         + '\''
         + ", args="
         + Arrays.toString(this.formatArgs)
         + ", siblings="
         + this.siblings
         + ", style="
         + this.getStyle()
         + '}';
   }

   public String getKey() {
      return this.key;
   }

   public Object[] getFormatArgs() {
      return this.formatArgs;
   }
}
