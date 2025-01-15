// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.openal.AL10;
import java.util.OptionalInt;
import javax.sound.sampled.AudioFormat;
import java.nio.ByteBuffer;

public class Class6598
{
    private ByteBuffer field26159;
    private final AudioFormat field26160;
    private boolean field26161;
    private int field26162;
    
    public Class6598(final ByteBuffer field26159, final AudioFormat field26160) {
        this.field26159 = field26159;
        this.field26160 = field26160;
    }
    
    public OptionalInt method20043() {
        if (!this.field26161) {
            if (this.field26159 == null) {
                return OptionalInt.empty();
            }
            final int method26653 = Class8109.method26653(this.field26160);
            final int[] array = { 0 };
            AL10.alGenBuffers(array);
            if (Class8109.method26650("Creating buffer")) {
                return OptionalInt.empty();
            }
            AL10.alBufferData(array[0], method26653, this.field26159, (int)this.field26160.getSampleRate());
            if (Class8109.method26650("Assigning buffer data")) {
                return OptionalInt.empty();
            }
            this.field26162 = array[0];
            this.field26161 = true;
            this.field26159 = null;
        }
        return OptionalInt.of(this.field26162);
    }
    
    public void method20044() {
        if (this.field26161) {
            AL10.alDeleteBuffers(new int[] { this.field26162 });
            if (Class8109.method26650("Deleting stream buffers")) {
                return;
            }
        }
        this.field26161 = false;
    }
    
    public OptionalInt method20045() {
        final OptionalInt method20043 = this.method20043();
        this.field26161 = false;
        return method20043;
    }
}
