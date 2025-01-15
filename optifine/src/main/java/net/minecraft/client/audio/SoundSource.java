package net.minecraft.client.audio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;
import javax.sound.sampled.AudioFormat;
import net.minecraft.util.math.Vec3d;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.openal.AL10;

public class SoundSource
{
    private static final Logger LOGGER = LogManager.getLogger();
    private final int field_216441_b;
    private final AtomicBoolean field_216442_c = new AtomicBoolean(true);
    private int field_216443_d = 16384;
    @Nullable
    private IAudioStream field_216444_e;

    @Nullable
    static SoundSource func_216426_a()
    {
        int[] aint = new int[1];
        AL10.alGenSources(aint);
        return ALUtils.checkALError("Allocate new source") ? null : new SoundSource(aint[0]);
    }

    private SoundSource(int p_i1725_1_)
    {
        this.field_216441_b = p_i1725_1_;
    }

    public void func_216436_b()
    {
        if (this.field_216442_c.compareAndSet(true, false))
        {
            AL10.alSourceStop(this.field_216441_b);
            ALUtils.checkALError("Stop");

            if (this.field_216444_e != null)
            {
                try
                {
                    this.field_216444_e.close();
                }
                catch (IOException ioexception)
                {
                    LOGGER.error("Failed to close audio stream", (Throwable)ioexception);
                }

                this.func_216427_k();
                this.field_216444_e = null;
            }

            AL10.alDeleteSources(new int[] {this.field_216441_b});
            ALUtils.checkALError("Cleanup");
        }
    }

    public void func_216438_c()
    {
        AL10.alSourcePlay(this.field_216441_b);
    }

    private int func_216428_j()
    {
        return !this.field_216442_c.get() ? 4116 : AL10.alGetSourcei(this.field_216441_b, 4112);
    }

    public void func_216439_d()
    {
        if (this.func_216428_j() == 4114)
        {
            AL10.alSourcePause(this.field_216441_b);
        }
    }

    public void func_216437_e()
    {
        if (this.func_216428_j() == 4115)
        {
            AL10.alSourcePlay(this.field_216441_b);
        }
    }

    public void func_216418_f()
    {
        if (this.field_216442_c.get())
        {
            AL10.alSourceStop(this.field_216441_b);
            ALUtils.checkALError("Stop");
        }
    }

    public boolean func_216435_g()
    {
        return this.func_216428_j() == 4116;
    }

    public void func_216420_a(Vec3d p_216420_1_)
    {
        AL10.alSourcefv(this.field_216441_b, 4100, new float[] {(float)p_216420_1_.x, (float)p_216420_1_.y, (float)p_216420_1_.z});
    }

    public void func_216422_a(float p_216422_1_)
    {
        AL10.alSourcef(this.field_216441_b, 4099, p_216422_1_);
    }

    public void func_216425_a(boolean p_216425_1_)
    {
        AL10.alSourcei(this.field_216441_b, 4103, p_216425_1_ ? 1 : 0);
    }

    public void func_216430_b(float p_216430_1_)
    {
        AL10.alSourcef(this.field_216441_b, 4106, p_216430_1_);
    }

    public void func_216419_h()
    {
        AL10.alSourcei(this.field_216441_b, 53248, 0);
    }

    public void func_216423_c(float p_216423_1_)
    {
        AL10.alSourcei(this.field_216441_b, 53248, 53251);
        AL10.alSourcef(this.field_216441_b, 4131, p_216423_1_);
        AL10.alSourcef(this.field_216441_b, 4129, 1.0F);
        AL10.alSourcef(this.field_216441_b, 4128, 0.0F);
    }

    public void func_216432_b(boolean p_216432_1_)
    {
        AL10.alSourcei(this.field_216441_b, 514, p_216432_1_ ? 1 : 0);
    }

    public void func_216429_a(AudioStreamBuffer p_216429_1_)
    {
        p_216429_1_.func_216473_a().ifPresent((p_216431_1_) ->
        {
            AL10.alSourcei(this.field_216441_b, 4105, p_216431_1_);
        });
    }

    public void func_216433_a(IAudioStream p_216433_1_)
    {
        this.field_216444_e = p_216433_1_;
        AudioFormat audioformat = p_216433_1_.func_216454_a();
        this.field_216443_d = func_216417_a(audioformat, 1);
        this.func_216421_a(4);
    }

    private static int func_216417_a(AudioFormat p_216417_0_, int p_216417_1_)
    {
        return (int)((float)(p_216417_1_ * p_216417_0_.getSampleSizeInBits()) / 8.0F * (float)p_216417_0_.getChannels() * p_216417_0_.getSampleRate());
    }

    private void func_216421_a(int p_216421_1_)
    {
        if (this.field_216444_e != null)
        {
            try
            {
                for (int i = 0; i < p_216421_1_; ++i)
                {
                    ByteBuffer bytebuffer = this.field_216444_e.func_216455_a(this.field_216443_d);

                    if (bytebuffer != null)
                    {
                        (new AudioStreamBuffer(bytebuffer, this.field_216444_e.func_216454_a())).func_216472_c().ifPresent((p_216424_1_) ->
                        {
                            AL10.alSourceQueueBuffers(this.field_216441_b, new int[]{p_216424_1_});
                        });
                    }
                }
            }
            catch (IOException ioexception)
            {
                LOGGER.error("Failed to read from audio stream", (Throwable)ioexception);
            }
        }
    }

    public void func_216434_i()
    {
        if (this.field_216444_e != null)
        {
            int i = this.func_216427_k();
            this.func_216421_a(i);
        }
    }

    private int func_216427_k()
    {
        int i = AL10.alGetSourcei(this.field_216441_b, 4118);

        if (i > 0)
        {
            int[] aint = new int[i];
            AL10.alSourceUnqueueBuffers(this.field_216441_b, aint);
            ALUtils.checkALError("Unqueue buffers");
            AL10.alDeleteBuffers(aint);
            ALUtils.checkALError("Remove processed buffers");
        }

        return i;
    }
}
