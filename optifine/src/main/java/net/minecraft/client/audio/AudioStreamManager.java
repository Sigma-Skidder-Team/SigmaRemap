package net.minecraft.client.audio;

import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import net.minecraft.resources.IResource;
import net.minecraft.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Util;

public class AudioStreamManager
{
    private final IResourceManager resourceManager;
    private final Map<ResourceLocation, CompletableFuture<AudioStreamBuffer>> field_217919_b = Maps.newHashMap();

    public AudioStreamManager(IResourceManager p_i1360_1_)
    {
        this.resourceManager = p_i1360_1_;
    }

    public CompletableFuture<AudioStreamBuffer> func_217909_a(ResourceLocation p_217909_1_)
    {
        return this.field_217919_b.computeIfAbsent(p_217909_1_, (p_217913_1_) ->
        {
            return CompletableFuture.supplyAsync(() -> {
                try (
                        IResource iresource = this.resourceManager.getResource(p_217913_1_);
                        InputStream inputstream = iresource.getInputStream();
                        IAudioStream iaudiostream = new OggAudioStream(inputstream);
                    )
                {
                    ByteBuffer bytebuffer = iaudiostream.func_216453_b();
                    AudioStreamBuffer audiostreambuffer = new AudioStreamBuffer(bytebuffer, iaudiostream.func_216454_a());
                    return audiostreambuffer;
                }
                catch (IOException ioexception)
                {
                    throw new CompletionException(ioexception);
                }
            }, Util.getServerExecutor());
        });
    }

    public CompletableFuture<IAudioStream> func_217917_b(ResourceLocation p_217917_1_)
    {
        return CompletableFuture.supplyAsync(() ->
        {
            try {
                IResource iresource = this.resourceManager.getResource(p_217917_1_);
                InputStream inputstream = iresource.getInputStream();
                return new OggAudioStream(inputstream);
            }
            catch (IOException ioexception)
            {
                throw new CompletionException(ioexception);
            }
        }, Util.getServerExecutor());
    }

    public void func_217912_a()
    {
        this.field_217919_b.values().forEach((p_217910_0_) ->
        {
            p_217910_0_.thenAccept(AudioStreamBuffer::func_216474_b);
        });
        this.field_217919_b.clear();
    }

    public CompletableFuture<?> func_217908_a(Collection<Sound> p_217908_1_)
    {
        return CompletableFuture.allOf(p_217908_1_.stream().map((p_217911_1_) ->
        {
            return this.func_217909_a(p_217911_1_.getSoundAsOggLocation());
        }).toArray((p_217916_0_) ->
        {
            return new CompletableFuture[p_217916_0_];
        }));
    }
}
