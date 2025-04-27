// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.util;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.google.common.collect.Lists;
import java.util.Arrays;
import org.apache.commons.lang3.Validate;
import java.util.List;
import java.util.AbstractList;

public class NonNullList<E> extends AbstractList<E>
{
    private final List<E> delegate;
    private final E defaultElement;

    public static <E> NonNullList<E> create()
    {
        return new NonNullList<>();
    }

    public static <E> NonNullList<E> withSize(int size, E fill)
    {
        Validate.notNull(fill);
        Object[] aobject = new Object[size];
        Arrays.fill(aobject, fill);
        return new NonNullList<>(Arrays.asList((E[])aobject), fill);
    }

    @SafeVarargs
    public static <E> NonNullList<E> from(E defaultElementIn, E... elements)
    {
        return new NonNullList<>(Arrays.asList(elements), defaultElementIn);
    }

    protected NonNullList()
    {
        this(Lists.newArrayList(), null);
    }

    protected NonNullList(List<E> p_i2453_1_, @Nullable E p_i2453_2_)
    {
        this.delegate = p_i2453_1_;
        this.defaultElement = p_i2453_2_;
    }

    @Nonnull
    public E get(int p_get_1_)
    {
        return this.delegate.get(p_get_1_);
    }

    public E set(int p_set_1_, E p_set_2_)
    {
        Validate.notNull(p_set_2_);
        return this.delegate.set(p_set_1_, p_set_2_);
    }

    public void add(int p_add_1_, E p_add_2_)
    {
        Validate.notNull(p_add_2_);
        this.delegate.add(p_add_1_, p_add_2_);
    }

    public E remove(int p_remove_1_)
    {
        return this.delegate.remove(p_remove_1_);
    }

    public int size()
    {
        return this.delegate.size();
    }

    public void clear()
    {
        if (this.defaultElement == null)
        {
            super.clear();
        }
        else
        {
            for (int i = 0; i < this.size(); ++i)
            {
                this.set(i, this.defaultElement);
            }
        }
    }
}

