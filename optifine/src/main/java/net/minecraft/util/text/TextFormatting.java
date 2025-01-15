package net.minecraft.util.text;

import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public enum TextFormatting
{
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

    private static final Map<String, TextFormatting> NAME_MAPPING = Arrays.stream(values()).collect(Collectors.toMap((p_199746_0_) -> {
        return lowercaseAlpha(p_199746_0_.name);
    }, (p_199747_0_) -> {
        return p_199747_0_;
    }));
    private static final Pattern FORMATTING_CODE_PATTERN = Pattern.compile("(?i)\u00a7[0-9A-FK-OR]");
    private final String name;
    private final char formattingCode;
    private final boolean fancyStyling;
    private final String controlString;
    private final int colorIndex;
    @Nullable
    private final Integer color;

    private static String lowercaseAlpha(String string)
    {
        return string.toLowerCase(Locale.ROOT).replaceAll("[^a-z]", "");
    }

    private TextFormatting(String p_i2613_3_, char p_i2613_4_, int p_i2613_5_, @Nullable Integer p_i2613_6_)
    {
        this(p_i2613_3_, p_i2613_4_, false, p_i2613_5_, p_i2613_6_);
    }

    private TextFormatting(String p_i2614_3_, char p_i2614_4_, boolean p_i2614_5_)
    {
        this(p_i2614_3_, p_i2614_4_, p_i2614_5_, -1, (Integer)null);
    }

    private TextFormatting(String p_i2615_3_, char p_i2615_4_, boolean p_i2615_5_, int p_i2615_6_, @Nullable Integer p_i2615_7_)
    {
        this.name = p_i2615_3_;
        this.formattingCode = p_i2615_4_;
        this.fancyStyling = p_i2615_5_;
        this.colorIndex = p_i2615_6_;
        this.color = p_i2615_7_;
        this.controlString = "\u00a7" + p_i2615_4_;
    }

    public static String getFormatString(String stringIn)
    {
        StringBuilder stringbuilder = new StringBuilder();
        int i = -1;
        int j = stringIn.length();

        while ((i = stringIn.indexOf(167, i + 1)) != -1)
        {
            if (i < j - 1)
            {
                TextFormatting textformatting = fromFormattingCode(stringIn.charAt(i + 1));

                if (textformatting != null)
                {
                    if (textformatting.isNormalStyle())
                    {
                        stringbuilder.setLength(0);
                    }

                    if (textformatting != RESET)
                    {
                        stringbuilder.append((Object)textformatting);
                    }
                }
            }
        }

        return stringbuilder.toString();
    }

    public int getColorIndex()
    {
        return this.colorIndex;
    }

    public boolean isFancyStyling()
    {
        return this.fancyStyling;
    }

    public boolean isColor()
    {
        return !this.fancyStyling && this != RESET;
    }

    @Nullable
    public Integer getColor()
    {
        return this.color;
    }

    public boolean isNormalStyle()
    {
        return !this.fancyStyling;
    }

    public String getFriendlyName()
    {
        return this.name().toLowerCase(Locale.ROOT);
    }

    public String toString()
    {
        return this.controlString;
    }

    @Nullable
    public static String getTextWithoutFormattingCodes(@Nullable String text)
    {
        return text == null ? null : FORMATTING_CODE_PATTERN.matcher(text).replaceAll("");
    }

    @Nullable
    public static TextFormatting getValueByName(@Nullable String friendlyName)
    {
        return friendlyName == null ? null : NAME_MAPPING.get(lowercaseAlpha(friendlyName));
    }

    @Nullable
    public static TextFormatting fromColorIndex(int index)
    {
        if (index < 0)
        {
            return RESET;
        }
        else
        {
            for (TextFormatting textformatting : values())
            {
                if (textformatting.getColorIndex() == index)
                {
                    return textformatting;
                }
            }

            return null;
        }
    }

    @Nullable
    public static TextFormatting fromFormattingCode(char formattingCodeIn)
    {
        char c0 = Character.toString(formattingCodeIn).toLowerCase(Locale.ROOT).charAt(0);

        for (TextFormatting textformatting : values())
        {
            if (textformatting.formattingCode == c0)
            {
                return textformatting;
            }
        }

        return null;
    }

    public static Collection<String> getValidValues(boolean getColor, boolean getFancyStyling)
    {
        List<String> list = Lists.newArrayList();

        for (TextFormatting textformatting : values())
        {
            if ((!textformatting.isColor() || getColor) && (!textformatting.isFancyStyling() || getFancyStyling))
            {
                list.add(textformatting.getFriendlyName());
            }
        }

        return list;
    }
}
