package net.minecraft.profiler;

import java.util.function.Supplier;

public interface IProfiler
{
    void startTick();

    void endTick();

    void startSection(String name);

    void startSection(Supplier<String> nameSupplier);

    void endSection();

    void endStartSection(String name);

    void endStartSection(Supplier<String> nameSupplier);

    void func_230035_c_(String p_230035_1_);

    void func_230036_c_(Supplier<String> p_230036_1_);
}
