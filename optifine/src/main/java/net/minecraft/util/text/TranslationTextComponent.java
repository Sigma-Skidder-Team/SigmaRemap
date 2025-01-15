package net.minecraft.util.text;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.command.CommandSource;
import net.minecraft.entity.Entity;

public class TranslationTextComponent extends TextComponent implements ITargetedTextComponent
{
    private static final LanguageMap FALLBACK_LANGUAGE = new LanguageMap();
    private static final LanguageMap LOCAL_LANGUAGE = LanguageMap.getInstance();
    private final String key;
    private final Object[] formatArgs;
    private final Object syncLock = new Object();
    private long lastTranslationUpdateTimeInMilliseconds = -1L;
    protected final List<ITextComponent> children = Lists.newArrayList();
    public static final Pattern STRING_VARIABLE_PATTERN = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");

    public TranslationTextComponent(String p_i2317_1_, Object... p_i2317_2_)
    {
        this.key = p_i2317_1_;
        this.formatArgs = p_i2317_2_;

        for (int i = 0; i < p_i2317_2_.length; ++i)
        {
            Object object = p_i2317_2_[i];

            if (object instanceof ITextComponent)
            {
                ITextComponent itextcomponent = ((ITextComponent)object).deepCopy();
                this.formatArgs[i] = itextcomponent;
                itextcomponent.getStyle().setParentStyle(this.getStyle());
            }
            else if (object == null)
            {
                this.formatArgs[i] = "null";
            }
        }
    }

    @VisibleForTesting

    synchronized void ensureInitialized()
    {
        synchronized (this.syncLock)
        {
            long i = LOCAL_LANGUAGE.getLastUpdateTimeInMilliseconds();

            if (i == this.lastTranslationUpdateTimeInMilliseconds)
            {
                return;
            }

            this.lastTranslationUpdateTimeInMilliseconds = i;
            this.children.clear();
        }

        String s = LOCAL_LANGUAGE.translateKey(this.key);

        try
        {
            this.initializeFromFormat(s);
        }
        catch (TranslationTextComponentFormatException var5)
        {
            this.children.clear();
            this.children.add(new StringTextComponent(s));
        }
    }

    protected void initializeFromFormat(String format)
    {
        Matcher matcher = STRING_VARIABLE_PATTERN.matcher(format);

        try
        {
            int i = 0;
            int j;
            int l;

            for (j = 0; matcher.find(j); j = l)
            {
                int k = matcher.start();
                l = matcher.end();

                if (k > j)
                {
                    ITextComponent itextcomponent = new StringTextComponent(String.format(format.substring(j, k)));
                    itextcomponent.getStyle().setParentStyle(this.getStyle());
                    this.children.add(itextcomponent);
                }

                String s2 = matcher.group(2);
                String s = format.substring(k, l);

                if ("%".equals(s2) && "%%".equals(s))
                {
                    ITextComponent itextcomponent2 = new StringTextComponent("%");
                    itextcomponent2.getStyle().setParentStyle(this.getStyle());
                    this.children.add(itextcomponent2);
                }
                else
                {
                    if (!"s".equals(s2))
                    {
                        throw new TranslationTextComponentFormatException(this, "Unsupported format: '" + s + "'");
                    }

                    String s1 = matcher.group(1);
                    int i1 = s1 != null ? Integer.parseInt(s1) - 1 : i++;

                    if (i1 < this.formatArgs.length)
                    {
                        this.children.add(this.getFormatArgumentAsComponent(i1));
                    }
                }
            }

            if (j < format.length())
            {
                ITextComponent itextcomponent1 = new StringTextComponent(String.format(format.substring(j)));
                itextcomponent1.getStyle().setParentStyle(this.getStyle());
                this.children.add(itextcomponent1);
            }
        }
        catch (IllegalFormatException illegalformatexception)
        {
            throw new TranslationTextComponentFormatException(this, illegalformatexception);
        }
    }

    private ITextComponent getFormatArgumentAsComponent(int index)
    {
        if (index >= this.formatArgs.length)
        {
            throw new TranslationTextComponentFormatException(this, index);
        }
        else
        {
            Object object = this.formatArgs[index];
            ITextComponent itextcomponent;

            if (object instanceof ITextComponent)
            {
                itextcomponent = (ITextComponent)object;
            }
            else
            {
                itextcomponent = new StringTextComponent(object == null ? "null" : object.toString());
                itextcomponent.getStyle().setParentStyle(this.getStyle());
            }

            return itextcomponent;
        }
    }

    public ITextComponent setStyle(Style style)
    {
        super.setStyle(style);

        for (Object object : this.formatArgs)
        {
            if (object instanceof ITextComponent)
            {
                ((ITextComponent)object).getStyle().setParentStyle(this.getStyle());
            }
        }

        if (this.lastTranslationUpdateTimeInMilliseconds > -1L)
        {
            for (ITextComponent itextcomponent : this.children)
            {
                itextcomponent.getStyle().setParentStyle(style);
            }
        }

        return this;
    }

    public Stream<ITextComponent> stream()
    {
        this.ensureInitialized();
        return Streams.<ITextComponent>concat(this.children.stream(), this.siblings.stream()).flatMap(ITextComponent::stream);
    }

    public String getUnformattedComponentText()
    {
        this.ensureInitialized();
        StringBuilder stringbuilder = new StringBuilder();

        for (ITextComponent itextcomponent : this.children)
        {
            stringbuilder.append(itextcomponent.getUnformattedComponentText());
        }

        return stringbuilder.toString();
    }

    public TranslationTextComponent shallowCopy()
    {
        Object[] aobject = new Object[this.formatArgs.length];

        for (int i = 0; i < this.formatArgs.length; ++i)
        {
            if (this.formatArgs[i] instanceof ITextComponent)
            {
                aobject[i] = ((ITextComponent)this.formatArgs[i]).deepCopy();
            }
            else
            {
                aobject[i] = this.formatArgs[i];
            }
        }

        return new TranslationTextComponent(this.key, aobject);
    }

    public ITextComponent createNames(@Nullable CommandSource p_197668_1_, @Nullable Entity p_197668_2_, int p_197668_3_) throws CommandSyntaxException
    {
        Object[] aobject = new Object[this.formatArgs.length];

        for (int i = 0; i < aobject.length; ++i)
        {
            Object object = this.formatArgs[i];

            if (object instanceof ITextComponent)
            {
                aobject[i] = TextComponentUtils.updateForEntity(p_197668_1_, (ITextComponent)object, p_197668_2_, p_197668_3_);
            }
            else
            {
                aobject[i] = object;
            }
        }

        return new TranslationTextComponent(this.key, aobject);
    }

    public boolean equals(Object p_equals_1_)
    {
        if (this == p_equals_1_)
        {
            return true;
        }
        else if (!(p_equals_1_ instanceof TranslationTextComponent))
        {
            return false;
        }
        else
        {
            TranslationTextComponent translationtextcomponent = (TranslationTextComponent)p_equals_1_;
            return Arrays.equals(this.formatArgs, translationtextcomponent.formatArgs) && this.key.equals(translationtextcomponent.key) && super.equals(p_equals_1_);
        }
    }

    public int hashCode()
    {
        int i = super.hashCode();
        i = 31 * i + this.key.hashCode();
        i = 31 * i + Arrays.hashCode(this.formatArgs);
        return i;
    }

    public String toString()
    {
        return "TranslatableComponent{key='" + this.key + '\'' + ", args=" + Arrays.toString(this.formatArgs) + ", siblings=" + this.siblings + ", style=" + this.getStyle() + '}';
    }

    public String getKey()
    {
        return this.key;
    }

    public Object[] getFormatArgs()
    {
        return this.formatArgs;
    }
}
