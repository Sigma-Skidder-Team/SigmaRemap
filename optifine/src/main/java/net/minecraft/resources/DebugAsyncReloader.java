package net.minecraft.resources;

import com.google.common.base.Stopwatch;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import net.minecraft.profiler.IProfileResult;
import net.minecraft.profiler.Profiler;
import net.minecraft.util.Unit;
import net.minecraft.util.Util;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DebugAsyncReloader extends AsyncReloader<DebugAsyncReloader.DataPoint>
{
    private static final Logger LOGGER = LogManager.getLogger();
    private final Stopwatch timer = Stopwatch.createUnstarted();

    public DebugAsyncReloader(IResourceManager p_i1582_1_, List<IFutureReloadListener> p_i1582_2_, Executor p_i1582_3_, Executor p_i1582_4_, CompletableFuture<Unit> p_i1582_5_)
    {
        super(p_i1582_3_, p_i1582_4_, p_i1582_1_, p_i1582_2_, (p_219578_1_, p_219578_2_, p_219578_3_, p_219578_4_, p_219578_5_) ->
        {
            AtomicLong atomiclong = new AtomicLong();
            AtomicLong atomiclong1 = new AtomicLong();
            Profiler profiler = new Profiler(Util.nanoTime(), () -> {
                return 0;
            }, false);
            Profiler profiler1 = new Profiler(Util.nanoTime(), () -> {
                return 0;
            }, false);
            CompletableFuture<Void> completablefuture = p_219578_3_.reload(p_219578_1_, p_219578_2_, profiler, profiler1, (p_219577_2_) -> {
                p_219578_4_.execute(() -> {
                    long i = Util.nanoTime();
                    p_219577_2_.run();
                    atomiclong.addAndGet(Util.nanoTime() - i);
                });
            }, (p_219574_2_) -> {
                p_219578_5_.execute(() -> {
                    long i = Util.nanoTime();
                    p_219574_2_.run();
                    atomiclong1.addAndGet(Util.nanoTime() - i);
                });
            });
            return completablefuture.thenApplyAsync((p_219576_5_) -> {
                return new DebugAsyncReloader.DataPoint(p_219578_3_.func_225594_i_(), profiler.getResults(), profiler1.getResults(), atomiclong, atomiclong1);
            }, p_i1582_4_);
        }, p_i1582_5_);
        this.timer.start();
        this.resultListFuture.thenAcceptAsync(this::logStatistics, p_i1582_4_);
    }

    private void logStatistics(List<DebugAsyncReloader.DataPoint> datapoints)
    {
        this.timer.stop();
        int i = 0;
        LOGGER.info("Resource reload finished after " + this.timer.elapsed(TimeUnit.MILLISECONDS) + " ms");

        for (DebugAsyncReloader.DataPoint debugasyncreloader$datapoint : datapoints)
        {
            IProfileResult iprofileresult = debugasyncreloader$datapoint.prepareProfilerResult;
            IProfileResult iprofileresult1 = debugasyncreloader$datapoint.applyProfilerResult;
            int j = (int)((double)debugasyncreloader$datapoint.prepareDuration.get() / 1000000.0D);
            int k = (int)((double)debugasyncreloader$datapoint.applyDuration.get() / 1000000.0D);
            int l = j + k;
            String s = debugasyncreloader$datapoint.className;
            LOGGER.info(s + " took approximately " + l + " ms (" + j + " ms preparing, " + k + " ms applying)");
            i += k;
        }

        LOGGER.info("Total blocking time: " + i + " ms");
    }

    public static class DataPoint
    {
        private final String className;
        private final IProfileResult prepareProfilerResult;
        private final IProfileResult applyProfilerResult;
        private final AtomicLong prepareDuration;
        private final AtomicLong applyDuration;

        private DataPoint(String p_i2572_1_, IProfileResult p_i2572_2_, IProfileResult p_i2572_3_, AtomicLong p_i2572_4_, AtomicLong p_i2572_5_)
        {
            this.className = p_i2572_1_;
            this.prepareProfilerResult = p_i2572_2_;
            this.applyProfilerResult = p_i2572_3_;
            this.prepareDuration = p_i2572_4_;
            this.applyDuration = p_i2572_5_;
        }
    }
}
