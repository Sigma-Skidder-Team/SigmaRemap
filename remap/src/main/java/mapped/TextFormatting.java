// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Collection;
import javax.annotation.Nullable;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.Map;

public enum TextFormatting
{
    BLACK("BLACK", '0', 0, Integer.valueOf(0)),
    DARK_BLUE("DARK_BLUE", '1', 1, Integer.valueOf(170)),
    DARK_GREEN("DARK_GREEN", '2', 2, Integer.valueOf(43520)),
    DARK_AQUA("DARK_AQUA", '3', 3, Integer.valueOf(43690)),
    DARK_RED("DARK_RED", '4', 4, Integer.valueOf(11141120)),
    DARK_PURPLE("DARK_PURPLE", '5', 5, Integer.valueOf(11141290)),
    GOLD("GOLD", '6', 6, Integer.valueOf(16755200)),
    GRAY("GRAY", '7', 7, Integer.valueOf(11184810)),
    DARK_GRAY("DARK_GRAY", '8', 8, Integer.valueOf(5592405)),
    BLUE("BLUE", '9', 9, Integer.valueOf(5592575)),
    GREEN("GREEN", 'a', 10, Integer.valueOf(5635925)),
    AQUA("AQUA", 'b', 11, Integer.valueOf(5636095)),
    RED("RED", 'c', 12, Integer.valueOf(16733525)),
    LIGHT_PURPLE("LIGHT_PURPLE", 'd', 13, Integer.valueOf(16733695)),
    YELLOW("YELLOW", 'e', 14, Integer.valueOf(16777045)),
    WHITE("WHITE", 'f', 15, Integer.valueOf(16777215)),
    OBFUSCATED("OBFUSCATED", 'k', true),
    BOLD("BOLD", 'l', true),
    STRIKETHROUGH("STRIKETHROUGH", 'm', true),
    UNDERLINE("UNDERLINE", 'n', true),
    ITALIC("ITALIC", 'o', true),
    RESET("RESET", 'r', -1, (Integer)null);
    
    private static final Map<String, TextFormatting> NAME_MAPPING;
    private static final Pattern FORMATTING_CODE_PATTERN;
    private final String name;
    private final char formattingCode;
    private final boolean fancyStyling;
    private final String controlString;
    private final int colorIndex;
    private final Integer color;
    
    private static String lowercaseAlpha(final String s) {
        return s.toLowerCase(Locale.ROOT).replaceAll("[^a-z]", "");
    }
    
    private TextFormatting(final String s2, final char c, final int n2, final Integer n3) {
        this(s2, c, false, n2, n3);
    }
    
    private TextFormatting(final String s2, final char c, final boolean b) {
        this(s2, c, b, -1, null);
    }
    
    private TextFormatting(final String field12333, final char c, final boolean field12334, final int field12335, final Integer field12336) {
        this.name = field12333;
        this.formattingCode = c;
        this.fancyStyling = field12334;
        this.colorIndex = field12335;
        this.color = field12336;
        this.controlString = "§" + c;
    }
    
    public static String getFormatString(final String s) {
        final StringBuilder sb = new StringBuilder();
        int index = -1;
        final int length = s.length();
        while ((index = s.indexOf(167, index + 1)) != -1) {
            if (index >= length - 1) {
                continue;
            }
            final TextFormatting textformatting = fromFormattingCode(s.charAt(index + 1));
            if (textformatting == null) {
                continue;
            }
            if (textformatting.isNormalStyle()) {
                sb.setLength(0);
            }
            if (textformatting == TextFormatting.RESET) {
                continue;
            }
            sb.append(textformatting);
        }
        return sb.toString();
    }
    
    public int getColorIndex() {
        return this.colorIndex;
    }
    
    public boolean isFancyStyling() {
        return this.fancyStyling;
    }
    
    public boolean isColor() {
        return !this.fancyStyling && this != TextFormatting.RESET;
    }
    
    @Nullable
    public Integer getColor() {
        return this.color;
    }
    
    public boolean isNormalStyle() {
        return !this.fancyStyling;
    }
    
    public String getFriendlyName() {
        return this.name().toLowerCase(Locale.ROOT);
    }
    
    @Override
    public String toString() {
        return this.controlString;
    }
    
    @Nullable
    public static String getTextWithoutFormattingCodes(final String input) {
        return (input != null) ? TextFormatting.FORMATTING_CODE_PATTERN.matcher(input).replaceAll("") : null;
    }
    
    @Nullable
    public static TextFormatting getValueByName(final String s) {
        return (s != null) ? TextFormatting.NAME_MAPPING.get(lowercaseAlpha(s)) : null;
    }
    
    @Nullable
    public static TextFormatting fromColorIndex(final int n) {
        if (n >= 0) {
            for (final TextFormatting textformatting : values()) {
                if (textformatting.getColorIndex() == n) {
                    return textformatting;
                }
            }
            return null;
        }
        return TextFormatting.RESET;
    }
    
    @Nullable
    public static TextFormatting fromFormattingCode(final char c) {
        final char char1 = Character.toString(c).toLowerCase(Locale.ROOT).charAt(0);
        for (final TextFormatting textformatting : values()) {
            if (textformatting.formattingCode == char1) {
                return textformatting;
            }
        }
        return null;
    }
    
    public static Collection<String> getValidValues(final boolean b, final boolean b2) {
        final ArrayList arrayList = Lists.newArrayList();
        for (final TextFormatting textformatting : values()) {
            if (!textformatting.isColor() || b) {
                if (!textformatting.isFancyStyling() || b2) {
                    arrayList.add(textformatting.getFriendlyName());
                }
            }
        }
        return arrayList;
    }
    
    static {
        NAME_MAPPING = Arrays.stream(values()).collect(Collectors.toMap(class2116 -> lowercaseAlpha(class2116.name), class2117 -> class2117));
        FORMATTING_CODE_PATTERN = Pattern.compile("(?i)§[0-9A-FK-OR]");
    }
}
