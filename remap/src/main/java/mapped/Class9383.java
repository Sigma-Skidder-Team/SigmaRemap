// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.nio.ByteBuffer;
import javax.sound.sampled.AudioFormat;
import java.io.IOException;
import javax.annotation.Nullable;
import org.lwjgl.openal.AL10;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.logging.log4j.Logger;

public class Class9383
{
    private static final Logger field40262;
    private final int field40263;
    private final AtomicBoolean field40264;
    private int field40265;
    private Class1742 field40266;
    
    @Nullable
    public static Class9383 method34867() {
        final int[] array = { 0 };
        AL10.alGenSources(array);
        return Class8109.method26650("Allocate new source") ? null : new Class9383(array[0]);
    }
    
    private Class9383(final int field40263) {
        this.field40264 = new AtomicBoolean(true);
        this.field40265 = 16384;
        this.field40263 = field40263;
    }
    
    public void method34868() {
        if (this.field40264.compareAndSet(true, false)) {
            AL10.alSourceStop(this.field40263);
            Class8109.method26650("Stop");
            if (this.field40266 != null) {
                try {
                    this.field40266.close();
                }
                catch (final IOException ex) {
                    Class9383.field40262.error("Failed to close audio stream", (Throwable)ex);
                }
                this.method34887();
                this.field40266 = null;
            }
            AL10.alDeleteSources(new int[] { this.field40263 });
            Class8109.method26650("Cleanup");
        }
    }
    
    public void method34869() {
        AL10.alSourcePlay(this.field40263);
    }
    
    private int method34870() {
        return this.field40264.get() ? AL10.alGetSourcei(this.field40263, 4112) : 4116;
    }
    
    public void method34871() {
        if (this.method34870() == 4114) {
            AL10.alSourcePause(this.field40263);
        }
    }
    
    public void method34872() {
        if (this.method34870() == 4115) {
            AL10.alSourcePlay(this.field40263);
        }
    }
    
    public void method34873() {
        if (this.field40264.get()) {
            AL10.alSourceStop(this.field40263);
            Class8109.method26650("Stop");
        }
    }
    
    public boolean method34874() {
        return this.method34870() == 4116;
    }
    
    public void method34875(final Class5487 class5487) {
        AL10.alSourcefv(this.field40263, 4100, new float[] { (float)class5487.field22770, (float)class5487.field22771, (float)class5487.field22772 });
    }
    
    public void method34876(final float n) {
        AL10.alSourcef(this.field40263, 4099, n);
    }
    
    public void method34877(final boolean b) {
        AL10.alSourcei(this.field40263, 4103, (int)(b ? 1 : 0));
    }
    
    public void method34878(final float n) {
        AL10.alSourcef(this.field40263, 4106, n);
    }
    
    public void method34879() {
        AL10.alSourcei(this.field40263, 53248, 0);
    }
    
    public void method34880(final float n) {
        AL10.alSourcei(this.field40263, 53248, 53251);
        AL10.alSourcef(this.field40263, 4131, n);
        AL10.alSourcef(this.field40263, 4129, 1.0f);
        AL10.alSourcef(this.field40263, 4128, 0.0f);
    }
    
    public void method34881(final boolean b) {
        AL10.alSourcei(this.field40263, 514, (int)(b ? 1 : 0));
    }
    
    public void method34882(final Class6598 class6598) {
        class6598.method20043().ifPresent(n2 -> AL10.alSourcei(this.field40263, 4105, n2));
    }
    
    public void method34883(final Class1742 field40266) {
        this.field40266 = field40266;
        this.field40265 = method34884(field40266.method6169(), 1);
        this.method34885(4);
    }
    
    private static int method34884(final AudioFormat audioFormat, final int n) {
        return (int)(n * audioFormat.getSampleSizeInBits() / 8.0f * audioFormat.getChannels() * audioFormat.getSampleRate());
    }
    
    private void method34885(final int n) {
        if (this.field40266 != null) {
            try {
                for (int i = 0; i < n; ++i) {
                    final ByteBuffer method6171 = this.field40266.method6171(this.field40265);
                    if (method6171 != null) {
                        new Class6598(method6171, this.field40266.method6169()).method20045().ifPresent(n3 -> AL10.alSourceQueueBuffers(this.field40263, new int[] { n3 }));
                    }
                }
            }
            catch (final IOException ex) {
                Class9383.field40262.error("Failed to read from audio stream", (Throwable)ex);
            }
        }
    }
    
    public void method34886() {
        if (this.field40266 != null) {
            this.method34885(this.method34887());
        }
    }
    
    private int method34887() {
        final int alGetSourcei = AL10.alGetSourcei(this.field40263, 4118);
        if (alGetSourcei > 0) {
            final int[] array = new int[alGetSourcei];
            AL10.alSourceUnqueueBuffers(this.field40263, array);
            Class8109.method26650("Unqueue buffers");
            AL10.alDeleteBuffers(array);
            Class8109.method26650("Remove processed buffers");
        }
        return alGetSourcei;
    }
    
    static {
        field40262 = LogManager.getLogger();
    }
}
