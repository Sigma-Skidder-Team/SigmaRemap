package net.minecraft.util.math.shapes;

import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.ints.IntArrayList;

public final class IndirectMerger implements IDoubleListMerger
{
    private final DoubleArrayList field_197856_a;
    private final IntArrayList list1;
    private final IntArrayList list2;

    protected IndirectMerger(DoubleList p_i3863_1_, DoubleList p_i3863_2_, boolean p_i3863_3_, boolean p_i3863_4_)
    {
        int i = 0;
        int j = 0;
        double d0 = Double.NaN;
        int k = p_i3863_1_.size();
        int l = p_i3863_2_.size();
        int i1 = k + l;
        this.field_197856_a = new DoubleArrayList(i1);
        this.list1 = new IntArrayList(i1);
        this.list2 = new IntArrayList(i1);

        while (true)
        {
            boolean flag = i < k;
            boolean flag1 = j < l;

            if (!flag && !flag1)
            {
                if (this.field_197856_a.isEmpty())
                {
                    this.field_197856_a.add(Math.min(p_i3863_1_.getDouble(k - 1), p_i3863_2_.getDouble(l - 1)));
                }

                return;
            }

            boolean flag2 = flag && (!flag1 || p_i3863_1_.getDouble(i) < p_i3863_2_.getDouble(j) + 1.0E-7D);
            double d1 = flag2 ? p_i3863_1_.getDouble(i++) : p_i3863_2_.getDouble(j++);

            if ((i != 0 && flag || flag2 || p_i3863_4_) && (j != 0 && flag1 || !flag2 || p_i3863_3_))
            {
                if (!(d0 >= d1 - 1.0E-7D))
                {
                    this.list1.add(i - 1);
                    this.list2.add(j - 1);
                    this.field_197856_a.add(d1);
                    d0 = d1;
                }
                else if (!this.field_197856_a.isEmpty())
                {
                    this.list1.set(this.list1.size() - 1, i - 1);
                    this.list2.set(this.list2.size() - 1, j - 1);
                }
            }
        }
    }

    public boolean forMergedIndexes(IDoubleListMerger.IConsumer consumer)
    {
        for (int i = 0; i < this.field_197856_a.size() - 1; ++i)
        {
            if (!consumer.merge(this.list1.getInt(i), this.list2.getInt(i), i))
            {
                return false;
            }
        }

        return true;
    }

    public DoubleList func_212435_a()
    {
        return this.field_197856_a;
    }
}
