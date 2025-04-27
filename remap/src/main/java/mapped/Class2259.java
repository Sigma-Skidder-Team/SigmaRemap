// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.google.common.collect.Streams;
import java.util.stream.Stream;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.IllegalFormatException;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import net.minecraft.entity.Entity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponent;

import java.util.regex.Pattern;
import java.util.List;

public class Class2259 extends TextComponent implements Class2253
{
    private static final Class8837 field13809;
    private static final Class8837 field13810;
    private final String field13811;
    private final Object[] field13812;
    private final Object field13813;
    private long field13814;
    public final List<ITextComponent> field13815;
    public static final Pattern field13816;
    
    public Class2259(final String field13811, final Object... field13812) {
        this.field13813 = new Object();
        this.field13814 = -1L;
        this.field13815 = Lists.newArrayList();
        this.field13811 = field13811;
        this.field13812 = field13812;
        for (int i = 0; i < field13812.length; ++i) {
            final Object o = field13812[i];
            if (!(o instanceof ITextComponent)) {
                if (o == null) {
                    this.field13812[i] = "null";
                }
            }
            else {
                final ITextComponent method8466 = ((ITextComponent)o).deepCopy();
                this.field13812[i] = method8466;
                method8466.getStyle().method30422(this.getStyle());
            }
        }
    }
    
    @VisibleForTesting
    public synchronized void method8492() {
        synchronized (this.field13813) {
            final long method30863 = Class2259.field13810.method30863();
            if (method30863 == this.field13814) {
                return;
            }
            this.field13814 = method30863;
            this.field13815.clear();
        }
        final String method30864 = Class2259.field13810.method30860(this.field13811);
        try {
            this.method8493(method30864);
        }
        catch (final Class2373 class2373) {
            this.field13815.clear();
            this.field13815.add(new StringTextComponent(method30864));
        }
    }
    
    public void method8493(final String input) {
        final Matcher matcher = Class2259.field13816.matcher(input);
        try {
            int n = 0;
            int beginIndex;
            int end;
            for (beginIndex = 0; matcher.find(beginIndex); beginIndex = end) {
                final int start = matcher.start();
                end = matcher.end();
                if (start > beginIndex) {
                    final StringTextComponent class2260 = new StringTextComponent(String.format(input.substring(beginIndex, start)));
                    class2260.getStyle().method30422(this.getStyle());
                    this.field13815.add(class2260);
                }
                final String group = matcher.group(2);
                final String substring = input.substring(start, end);
                if ("%".equals(group) && "%%".equals(substring)) {
                    final StringTextComponent class2261 = new StringTextComponent("%");
                    class2261.getStyle().method30422(this.getStyle());
                    this.field13815.add(class2261);
                }
                else {
                    if (!"s".equals(group)) {
                        throw new Class2373(this, "Unsupported format: '" + substring + "'");
                    }
                    final String group2 = matcher.group(1);
                    final int n2 = (group2 != null) ? (Integer.parseInt(group2) - 1) : n++;
                    if (n2 < this.field13812.length) {
                        this.field13815.add(this.method8494(n2));
                    }
                }
            }
            if (beginIndex < input.length()) {
                final StringTextComponent class2262 = new StringTextComponent(String.format(input.substring(beginIndex)));
                class2262.getStyle().method30422(this.getStyle());
                this.field13815.add(class2262);
            }
        }
        catch (final IllegalFormatException ex) {
            throw new Class2373(this, ex);
        }
    }
    
    private ITextComponent method8494(final int n) {
        if (n < this.field13812.length) {
            final Object o = this.field13812[n];
            ITextComponent class2250;
            if (!(o instanceof ITextComponent)) {
                class2250 = new StringTextComponent((o != null) ? o.toString() : "null");
                class2250.getStyle().method30422(this.getStyle());
            }
            else {
                class2250 = (ITextComponent)o;
            }
            return class2250;
        }
        throw new Class2373(this, n);
    }
    
    @Override
    public ITextComponent setStyle(final Style class8768) {
        super.setStyle(class8768);
        for (final Object o : this.field13812) {
            if (o instanceof ITextComponent) {
                ((ITextComponent)o).getStyle().method30422(this.getStyle());
            }
        }
        if (this.field13814 > -1L) {
            final Iterator<ITextComponent> iterator = this.field13815.iterator();
            while (iterator.hasNext()) {
                iterator.next().getStyle().method30422(class8768);
            }
        }
        return this;
    }
    
    @Override
    public Stream<ITextComponent> stream() {
        this.method8492();
        return Streams.concat(new Stream[] { this.field13815.stream(), this.siblings.stream() }).flatMap(ITextComponent::stream);
    }
    
    @Override
    public String getUnformattedComponentText() {
        this.method8492();
        final StringBuilder sb = new StringBuilder();
        final Iterator<ITextComponent> iterator = this.field13815.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next().getUnformattedComponentText());
        }
        return sb.toString();
    }
    
    public Class2259 method8495() {
        final Object[] array = new Object[this.field13812.length];
        for (int i = 0; i < this.field13812.length; ++i) {
            if (!(this.field13812[i] instanceof ITextComponent)) {
                array[i] = this.field13812[i];
            }
            else {
                array[i] = ((ITextComponent)this.field13812[i]).deepCopy();
            }
        }
        return new Class2259(this.field13811, array);
    }
    
    @Override
    public ITextComponent method8473(final Class7492 class7492, final Entity class7493, final int n) throws CommandSyntaxException {
        final Object[] array = new Object[this.field13812.length];
        for (int i = 0; i < array.length; ++i) {
            final Object o = this.field13812[i];
            if (!(o instanceof ITextComponent)) {
                array[i] = o;
            }
            else {
                array[i] = Class9479.method35294(class7492, (ITextComponent)o, class7493, n);
            }
        }
        return new Class2259(this.field13811, array);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Class2259) {
            final Class2259 class2259 = (Class2259)o;
            if (Arrays.equals(this.field13812, class2259.field13812)) {
                if (this.field13811.equals(class2259.field13811)) {
                    return super.equals(o);
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * super.hashCode() + this.field13811.hashCode()) + Arrays.hashCode(this.field13812);
    }
    
    @Override
    public String toString() {
        return "TranslatableComponent{key='" + this.field13811 + '\'' + ", args=" + Arrays.toString(this.field13812) + ", siblings=" + this.siblings + ", style=" + this.getStyle() + '}';
    }
    
    public String method8496() {
        return this.field13811;
    }
    
    public Object[] method8497() {
        return this.field13812;
    }
    
    static {
        field13809 = new Class8837();
        field13810 = Class8837.method30858();
        field13816 = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");
    }
}
