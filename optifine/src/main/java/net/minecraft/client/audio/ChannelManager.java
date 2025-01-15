package net.minecraft.client.audio;

import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ChannelManager
{
    private final Set<ChannelManager.Entry> channels = Sets.newIdentityHashSet();
    private final SoundSystem sndSystem;
    private final Executor soundExecutor;

    public ChannelManager(SoundSystem p_i464_1_, Executor p_i464_2_)
    {
        this.sndSystem = p_i464_1_;
        this.soundExecutor = p_i464_2_;
    }

    public ChannelManager.Entry createChannel(SoundSystem.Mode mode)
    {
        ChannelManager.Entry channelmanager$entry = new ChannelManager.Entry();
        this.soundExecutor.execute(() ->
        {
            SoundSource soundsource = this.sndSystem.getSource(mode);

            if (soundsource != null)
            {
                channelmanager$entry.source = soundsource;
                this.channels.add(channelmanager$entry);
            }
        });
        return channelmanager$entry;
    }

    public void func_217897_a(Consumer<Stream<SoundSource>> p_217897_1_)
    {
        this.soundExecutor.execute(() ->
        {
            p_217897_1_.accept(this.channels.stream().map((p_217896_0_) -> {
                return p_217896_0_.source;
            }).filter(Objects::nonNull));
        });
    }

    public void tick()
    {
        this.soundExecutor.execute(() ->
        {
            Iterator<ChannelManager.Entry> iterator = this.channels.iterator();

            while (iterator.hasNext())
            {
                ChannelManager.Entry channelmanager$entry = iterator.next();
                channelmanager$entry.source.func_216434_i();

                if (channelmanager$entry.source.func_216435_g())
                {
                    channelmanager$entry.release();
                    iterator.remove();
                }
            }
        });
    }

    public void releaseAll()
    {
        this.channels.forEach(ChannelManager.Entry::release);
        this.channels.clear();
    }

    public class Entry
    {
        private SoundSource source;
        private boolean released;

        public boolean isReleased()
        {
            return this.released;
        }

        public void runOnSoundExecutor(Consumer<SoundSource> p_217888_1_)
        {
            ChannelManager.this.soundExecutor.execute(() ->
            {
                if (this.source != null)
                {
                    p_217888_1_.accept(this.source);
                }
            });
        }

        public void release()
        {
            this.released = true;
            ChannelManager.this.sndSystem.release(this.source);
            this.source = null;
        }
    }
}
