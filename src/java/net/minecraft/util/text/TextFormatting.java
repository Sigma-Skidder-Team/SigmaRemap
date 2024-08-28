package net.minecraft.util.text;

import com.google.common.collect.Lists;

import javax.annotation.Nullable;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public enum TextFormatting {
   BLACK("BLACK", '0', 0, 0),
   DARK_BLUE("DARK_BLUE", '1', 1, 170),
   DARK_GREEN("DARK_GREEN", '2', 2, 43520),
   DARK_AQUA("DARK_AQUA", '3', 3, 43690),
   DARK_RED("DARK_RED", '4', 4, 11141120),
   DARK_PURPLE("DARK_PURPLE", '5', 5, 11141290),
   GOLD("GOLD", '6', 6, 16755200),
   GRAY("GRAY", '7', 7, 11184810),
   DARK_GRAY("DARK_GRAY", '8', 8, 5592405),
   BLUE("BLUE", '9', 9, 5592575),
   GREEN("GREEN", 'a', 10, 5635925),
   AQUA("AQUA", 'b', 11, 5636095),
   RED("RED", 'c', 12, 16733525),
   LIGHT_PURPLE("LIGHT_PURPLE", 'd', 13, 16733695),
   YELLOW("YELLOW", 'e', 14, 16777045),
   WHITE("WHITE", 'f', 15, 16777215),
   OBFUSCATED("OBFUSCATED", 'k', true),
   BOLD("BOLD", 'l', true),
   STRIKETHROUGH("STRIKETHROUGH", 'm', true),
   UNDERLINE("UNDERLINE", 'n', true),
   ITALIC("ITALIC", 'o', true),
   RESET("RESET", 'r', -1, (Integer)null);

   private static final Map<String, TextFormatting> NAME_MAPPING = Arrays.<TextFormatting>stream(values())
      .collect(Collectors.toMap(p_199746_0_ -> lowercaseAlpha(p_199746_0_.name), p_199747_0_ -> (TextFormatting)p_199747_0_));
   private static final Pattern FORMATTING_CODE_PATTERN = Pattern.compile("(?i)§[0-9A-FK-OR]");
   private final String name;
   private final char formattingCode;
   private final boolean fancyStyling;
   private final String controlString;
   private final int colorIndex;
   private final Integer color;
   private static final TextFormatting[] $VALUES = new TextFormatting[]{
      BLACK,
      DARK_BLUE,
      DARK_GREEN,
      DARK_AQUA,
      DARK_RED,
      DARK_PURPLE,
      GOLD,
      GRAY,
      DARK_GRAY,
      BLUE,
      GREEN,
      AQUA,
      RED,
      LIGHT_PURPLE,
      YELLOW,
      WHITE,
      OBFUSCATED,
      BOLD,
      STRIKETHROUGH,
      UNDERLINE,
      ITALIC,
      RESET
   };

   private static String lowercaseAlpha(String string) {
      return string.toLowerCase(Locale.ROOT).replaceAll("[^a-z]", "");
   }

   private TextFormatting(String formattingName, char formattingCodeIn, int index, Integer colorCode) {
      this(formattingName, formattingCodeIn, false, index, colorCode);
   }

   private TextFormatting(String formattingName, char formattingCodeIn, boolean fancyStylingIn) {
      this(formattingName, formattingCodeIn, fancyStylingIn, -1, (Integer)null);
   }

   private TextFormatting(String formattingName, char formattingCodeIn, boolean fancyStylingIn, int index, Integer colorCode) {
      this.name = formattingName;
      this.formattingCode = formattingCodeIn;
      this.fancyStyling = fancyStylingIn;
      this.colorIndex = index;
      this.color = colorCode;
      this.controlString = "§" + formattingCodeIn;
   }

   public int getColorIndex() {
      return this.colorIndex;
   }

   public boolean isFancyStyling() {
      return this.fancyStyling;
   }

   public boolean isColor() {
      return !this.fancyStyling && this != RESET;
   }

   @Nullable
   public Integer getColor() {
      return this.color;
   }

   public String getFriendlyName() {
      return this.name().toLowerCase(Locale.ROOT);
   }

   @Override
   public String toString() {
      return this.controlString;
   }

   @Nullable
   public static String getTextWithoutFormattingCodes(String text) {
      return text == null ? null : FORMATTING_CODE_PATTERN.matcher(text).replaceAll("");
   }

   @Nullable
   public static TextFormatting getValueByName(String friendlyName) {
      return friendlyName == null ? null : NAME_MAPPING.get(lowercaseAlpha(friendlyName));
   }

   @Nullable
   public static TextFormatting fromColorIndex(int index) {
      if (index < 0) {
         return RESET;
      } else {
         for (TextFormatting var6 : values()) {
            if (var6.getColorIndex() == index) {
               return var6;
            }
         }

         return null;
      }
   }

   @Nullable
   public static TextFormatting fromFormattingCode(char formattingCodeIn) {
      char var3 = Character.toString(formattingCodeIn).toLowerCase(Locale.ROOT).charAt(0);

      for (TextFormatting var7 : values()) {
         if (var7.formattingCode == var3) {
            return var7;
         }
      }

      return null;
   }

   public static Collection<String> getValidValues(boolean getColor, boolean getFancyStyling) {
      ArrayList var4 = Lists.newArrayList();

      for (TextFormatting var8 : values()) {
         if ((!var8.isColor() || getColor) && (!var8.isFancyStyling() || getFancyStyling)) {
            var4.add(var8.getFriendlyName());
         }
      }

      return var4;
   }
}
