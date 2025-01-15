//
// Decompiled by Procyon v0.6.0
//

package net.minecraft.util.text;

import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.List;
import java.util.Iterator;

import com.mojang.brigadier.Message;
import mapped.TextFormatting;
import mapped.StringTextComponent;

public interface ITextComponent extends Message, Iterable<ITextComponent> {
    ITextComponent setStyle(final Style p0);

    Style getStyle();

    default ITextComponent appendText(final String s) {
        return this.appendSibling(new StringTextComponent(s));
    }

    ITextComponent appendSibling(final ITextComponent p0);

    String getUnformattedComponentText();

    default String getString() {
        final StringBuilder sb = new StringBuilder();
        this.stream().forEach((p_212635_1_) ->
        {
            sb.append(p_212635_1_.getUnformattedComponentText());
        });
        return sb.toString();
    }

    default String getStringTruncated(final int n) {
        final StringBuilder sb = new StringBuilder();
        final Iterator<ITextComponent> iterator = this.stream().iterator();
        while (iterator.hasNext()) {
            final int endIndex = n - sb.length();
            if (endIndex <= 0) {
                break;
            }
            final String method8459 = iterator.next().getUnformattedComponentText();
            sb.append((method8459.length() > endIndex) ? method8459.substring(0, endIndex) : method8459);
        }
        return sb.toString();
    }

    default String getFormattedText() {
        StringBuilder stringbuilder = new StringBuilder();
        String s = "";
        Iterator<ITextComponent> iterator = this.stream().iterator();

        while (iterator.hasNext()) {
            ITextComponent itextcomponent = iterator.next();
            String s1 = itextcomponent.getUnformattedComponentText();

            if (!s1.isEmpty()) {
                String s2 = itextcomponent.getStyle().getFormattingCode();

                if (!s2.equals(s)) {
                    if (!s.isEmpty()) {
                        stringbuilder.append((Object) TextFormatting.RESET);
                    }

                    stringbuilder.append(s2);
                    s = s2;
                }

                stringbuilder.append(s1);
            }
        }

        if (!s.isEmpty()) {
            stringbuilder.append((Object) TextFormatting.RESET);
        }

        return stringbuilder.toString();
    }

    List<ITextComponent> getSiblings();

    Stream<ITextComponent> stream();

    default Stream<ITextComponent> func_212637_f() {
        return this.stream().map(ITextComponent::copyWithoutSiblings);
    }

    default Iterator<ITextComponent> iterator() {
        return this.func_212637_f().iterator();
    }

    ITextComponent shallowCopy();

    default ITextComponent deepCopy() {
        final ITextComponent itextcomponent = this.shallowCopy();
        itextcomponent.setStyle(this.getStyle().createShallowCopy());
        final Iterator<ITextComponent> iterator = this.getSiblings().iterator();
        while (iterator.hasNext()) {
            itextcomponent.appendSibling(iterator.next().deepCopy());
        }
        return itextcomponent;
    }

    default ITextComponent applyTextStyle(final Consumer<Style> consumer) {
        consumer.accept(this.getStyle());
        return this;
    }

    default ITextComponent applyTextStyles(final TextFormatting... array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            this.applyTextStyle(array[i]);
        }
        return this;
    }

    default ITextComponent applyTextStyle(final TextFormatting color) {
        final Style style = this.getStyle();
        if (color.isColor()) {
            style.setColor(color);
        }
        if (color.isFancyStyling()) {
            switch (color) {
                case OBFUSCATED:
                    style.setObfuscated(true);
                    break;

                case BOLD:
                    style.setBold(true);
                    break;

                case STRIKETHROUGH:
                    style.setStrikethrough(true);
                    break;

                case UNDERLINE:
                    style.setUnderlined(true);
                    break;

                case ITALIC:
                    style.setItalic(true);
            }
        }
        return this;
    }

    static ITextComponent copyWithoutSiblings(final ITextComponent class2250) {
        final ITextComponent method8465 = class2250.shallowCopy();
        method8465.setStyle(class2250.getStyle().createDeepCopy());
        return method8465;
    }
}
