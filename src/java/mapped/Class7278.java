// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import javax.annotation.Nullable;
import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.openal.ALCapabilities;
import org.lwjgl.openal.ALCCapabilities;
import org.lwjgl.openal.AL10;
import org.lwjgl.openal.AL;
import org.lwjgl.openal.ALC10;
import java.nio.IntBuffer;
import org.lwjgl.openal.ALC;
import org.apache.logging.log4j.Logger;

public class Class7278
{
    private static final Logger field28185;
    private long field28186;
    private long field28187;
    private static final Class3413 field28188;
    private Class3413 field28189;
    private Class3413 field28190;
    private final Class6379 field28191;
    
    public Class7278() {
        this.field28189 = Class7278.field28188;
        this.field28190 = Class7278.field28188;
        this.field28191 = new Class6379();
    }
    
    public void method22308() {
        this.field28186 = method22310();
        final ALCCapabilities capabilities = ALC.createCapabilities(this.field28186);
        if (Class8109.method26652(this.field28186, "Get capabilities")) {
            throw new IllegalStateException("Failed to get OpenAL capabilities");
        }
        if (!capabilities.OpenALC11) {
            throw new IllegalStateException("OpenAL 1.1 not supported");
        }
        ALC10.alcMakeContextCurrent(this.field28187 = ALC10.alcCreateContext(this.field28186, (IntBuffer)null));
        final int method22309 = this.method22309();
        final int method22310 = Class9546.method35651((int)Class9546.method35640((float)method22309), 2, 8);
        this.field28189 = new Class3414(Class9546.method35651(method22309 - method22310, 8, 255));
        this.field28190 = new Class3414(method22310);
        final ALCapabilities capabilities2 = AL.createCapabilities(capabilities);
        Class8109.method26650("Initialization");
        if (!capabilities2.AL_EXT_source_distance_model) {
            throw new IllegalStateException("AL_EXT_source_distance_model is not supported");
        }
        AL10.alEnable(512);
        if (capabilities2.AL_EXT_LINEAR_DISTANCE) {
            Class8109.method26650("Enable per-source distance models");
            Class7278.field28185.info("OpenAL initialized.");
            return;
        }
        throw new IllegalStateException("AL_EXT_LINEAR_DISTANCE is not supported");
    }
    
    private int method22309() {
        int n;
        try (final MemoryStack stackPush = MemoryStack.stackPush()) {
            final int alcGetInteger = ALC10.alcGetInteger(this.field28186, 4098);
            if (Class8109.method26652(this.field28186, "Get attributes size")) {
                throw new IllegalStateException("Failed to get OpenAL attributes");
            }
            final IntBuffer mallocInt = stackPush.mallocInt(alcGetInteger);
            ALC10.alcGetIntegerv(this.field28186, 4099, mallocInt);
            if (Class8109.method26652(this.field28186, "Get attributes")) {
                throw new IllegalStateException("Failed to get OpenAL attributes");
            }
            int i = 0;
            while (i < alcGetInteger) {
                final int value = mallocInt.get(i++);
                if (value == 0) {
                    return 30;
                }
                final int value2 = mallocInt.get(i++);
                if (value == 4112) {
                    n = value2;
                    return n;
                }
            }
            return 30;
        }
        return n;
    }
    
    private static long method22310() {
        for (int i = 0; i < 3; ++i) {
            final long alcOpenDevice = ALC10.alcOpenDevice((ByteBuffer)null);
            if (alcOpenDevice != 0L && !Class8109.method26652(alcOpenDevice, "Open device")) {
                return alcOpenDevice;
            }
        }
        throw new IllegalStateException("Failed to open OpenAL device");
    }
    
    public void method22311() {
        this.field28189.method10850();
        this.field28190.method10850();
        ALC10.alcDestroyContext(this.field28187);
        if (this.field28186 != 0L) {
            ALC10.alcCloseDevice(this.field28186);
        }
    }
    
    public Class6379 method22312() {
        return this.field28191;
    }
    
    @Nullable
    public Class9383 method22313(final Class269 class269) {
        return ((class269 != Class269.field1461) ? this.field28189 : this.field28190).method10848();
    }
    
    public void method22314(final Class9383 class9383) {
        if (!this.field28189.method10849(class9383) && !this.field28190.method10849(class9383)) {
            throw new IllegalStateException("Tried to release unknown channel");
        }
    }
    
    public String method22315() {
        return String.format("Sounds: %d/%d + %d/%d", this.field28189.method10852(), this.field28189.method10851(), this.field28190.method10852(), this.field28190.method10851());
    }
    
    static {
        field28185 = LogManager.getLogger();
        field28188 = new Class3415();
    }
}
