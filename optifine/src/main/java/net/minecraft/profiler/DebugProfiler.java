package net.minecraft.profiler;

import com.mojang.blaze3d.platform.GlStateManager;
import java.time.Duration;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Util;
import net.optifine.Config;
import net.optifine.Lagometer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DebugProfiler implements IProfiler
{
    private static final Logger LOGGER = LogManager.getLogger();
    private static final long MAX_TICK_TIME_NS = Duration.ofMillis(300L).toNanos();
    private final IntSupplier tickCounter;
    private final DebugProfiler.DebugResultEntryImpl fixedProfiler = new DebugProfiler.DebugResultEntryImpl();
    private final DebugProfiler.DebugResultEntryImpl tickProfiler = new DebugProfiler.DebugResultEntryImpl();
    private boolean clientProfiler = false;
    private boolean lagometerActive = false;
    private boolean fastRender = false;
    private static final String SCHEDULED_EXECUTABLES = "scheduledExecutables";
    private static final String TICK = "tick";
    private static final String SOUND = "sound";
    private static final String RENDER = "render";
    private static final String DISPLAY = "display";
    private static final int HASH_SCHEDULED_EXECUTABLES = "scheduledExecutables".hashCode();
    private static final int HASH_TICK = "tick".hashCode();
    private static final int HASH_SOUND = "sound".hashCode();
    private static final int HASH_RENDER = "render".hashCode();
    private static final int HASH_DISPLAY = "display".hashCode();

    public DebugProfiler(IntSupplier p_i190_1_)
    {
        this.tickCounter = p_i190_1_;
    }

    public DebugProfiler.IDebugResultEntry getFixedProfiler()
    {
        return this.fixedProfiler;
    }

    public void startTick()
    {
        this.clientProfiler = Minecraft.getInstance().getProfiler() == this;
        this.lagometerActive = this.clientProfiler && Lagometer.isActive();
        this.fastRender = this.clientProfiler && Config.isFastRender();
        this.fixedProfiler.profiler.startTick();
        this.tickProfiler.profiler.startTick();
    }

    public void endTick()
    {
        this.fixedProfiler.profiler.endTick();
        this.tickProfiler.profiler.endTick();
    }

    public void startSection(String name)
    {
        if (this.lagometerActive)
        {
            int i = name.hashCode();

            if (i == HASH_SCHEDULED_EXECUTABLES && name.equals("scheduledExecutables"))
            {
                Lagometer.timerScheduledExecutables.start();
            }
            else if (i == HASH_TICK && name.equals("tick") && Config.isMinecraftThread())
            {
                Lagometer.timerScheduledExecutables.end();
                Lagometer.timerTick.start();
            }
        }

        if (this.fastRender)
        {
            int j = name.hashCode();

            if (j == HASH_RENDER && name.equals("render"))
            {
                GlStateManager.clearEnabled = false;
            }
            else if (j == HASH_DISPLAY && name.equals("display"))
            {
                GlStateManager.clearEnabled = true;
            }
        }

        this.fixedProfiler.profiler.startSection(name);
        this.tickProfiler.profiler.startSection(name);
    }

    public void startSection(Supplier<String> nameSupplier)
    {
        this.fixedProfiler.profiler.startSection(nameSupplier);
        this.tickProfiler.profiler.startSection(nameSupplier);
    }

    public void endSection()
    {
        this.fixedProfiler.profiler.endSection();
        this.tickProfiler.profiler.endSection();
    }

    public void endStartSection(String name)
    {
        if (this.lagometerActive)
        {
            int i = name.hashCode();

            if (i == HASH_SOUND && name.equals("sound"))
            {
                Lagometer.timerTick.end();
            }
        }

        this.fixedProfiler.profiler.endStartSection(name);
        this.tickProfiler.profiler.endStartSection(name);
    }

    public void endStartSection(Supplier<String> nameSupplier)
    {
        this.fixedProfiler.profiler.endStartSection(nameSupplier);
        this.tickProfiler.profiler.endStartSection(nameSupplier);
    }

    public void func_230035_c_(String p_230035_1_)
    {
        this.fixedProfiler.profiler.func_230035_c_(p_230035_1_);
        this.tickProfiler.profiler.func_230035_c_(p_230035_1_);
    }

    public void func_230036_c_(Supplier<String> p_230036_1_)
    {
        this.fixedProfiler.profiler.func_230036_c_(p_230036_1_);
        this.tickProfiler.profiler.func_230036_c_(p_230036_1_);
    }

    class DebugResultEntryImpl implements DebugProfiler.IDebugResultEntry
    {
        protected IResultableProfiler profiler = EmptyProfiler.INSTANCE;

        private DebugResultEntryImpl()
        {
        }

        public boolean isEnabled()
        {
            return this.profiler != EmptyProfiler.INSTANCE;
        }

        public IProfileResult disable()
        {
            IProfileResult iprofileresult = this.profiler.getResults();
            this.profiler = EmptyProfiler.INSTANCE;
            return iprofileresult;
        }

        public IProfileResult getResults()
        {
            return this.profiler.getResults();
        }

        public void enable()
        {
            if (this.profiler == EmptyProfiler.INSTANCE)
            {
                this.profiler = new Profiler(Util.nanoTime(), DebugProfiler.this.tickCounter, true);
            }
        }
    }

    public interface IDebugResultEntry
    {
        boolean isEnabled();

        IProfileResult disable();

        IProfileResult getResults();

        void enable();
    }
}
