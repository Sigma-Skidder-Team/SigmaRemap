package net.minecraft.client.util;

public interface IMutableSearchTree<T> extends ISearchTree<T>
{
    void func_217872_a(T element);

    void clear();

    void recalculate();
}
