// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import javax.sound.sampled.AudioFormat;
import org.lwjgl.openal.ALC10;
import org.lwjgl.openal.AL10;
import org.apache.logging.log4j.Logger;

public class Class8109
{
    private static final Logger field33420;
    
    private static String method26649(final int n) {
        switch (n) {
            case 40961: {
                return "Invalid name parameter.";
            }
            case 40962: {
                return "Invalid enumerated parameter value.";
            }
            case 40963: {
                return "Invalid parameter parameter value.";
            }
            case 40964: {
                return "Invalid operation.";
            }
            case 40965: {
                return "Unable to allocate memory.";
            }
            default: {
                return "An unrecognized error occurred.";
            }
        }
    }
    
    public static boolean method26650(final String s) {
        final int alGetError = AL10.alGetError();
        if (alGetError == 0) {
            return false;
        }
        Class8109.field33420.error("{}: {}", s, method26649(alGetError));
        return true;
    }
    
    private static String method26651(final int n) {
        switch (n) {
            case 40961: {
                return "Invalid device.";
            }
            case 40962: {
                return "Invalid context.";
            }
            case 40963: {
                return "Illegal enum.";
            }
            case 40964: {
                return "Invalid value.";
            }
            case 40965: {
                return "Unable to allocate memory.";
            }
            default: {
                return "An unrecognized error occurred.";
            }
        }
    }
    
    public static boolean method26652(final long l, final String s) {
        final int alcGetError = ALC10.alcGetError(l);
        if (alcGetError == 0) {
            return false;
        }
        Class8109.field33420.error("{}{}: {}", s, l, method26651(alcGetError));
        return true;
    }
    
    public static int method26653(final AudioFormat obj) {
        final AudioFormat.Encoding encoding = obj.getEncoding();
        final int channels = obj.getChannels();
        final int sampleSizeInBits = obj.getSampleSizeInBits();
        if (encoding.equals(AudioFormat.Encoding.PCM_UNSIGNED) || encoding.equals(AudioFormat.Encoding.PCM_SIGNED)) {
            if (channels != 1) {
                if (channels == 2) {
                    if (sampleSizeInBits == 8) {
                        return 4354;
                    }
                    if (sampleSizeInBits == 16) {
                        return 4355;
                    }
                }
            }
            else {
                if (sampleSizeInBits == 8) {
                    return 4352;
                }
                if (sampleSizeInBits == 16) {
                    return 4353;
                }
            }
        }
        throw new IllegalArgumentException("Invalid audio format: " + obj);
    }
    
    static {
        field33420 = LogManager.getLogger();
    }
}
