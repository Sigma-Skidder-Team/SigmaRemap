package net.minecraft.client.audio;

import java.nio.ByteBuffer;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import javax.sound.sampled.AudioFormat;
import org.lwjgl.openal.AL10;

public class AudioStreamBuffer
{
    @Nullable
    private ByteBuffer field_216475_a;
    private final AudioFormat field_216476_b;
    private boolean field_216477_c;
    private int field_216478_d;

    public AudioStreamBuffer(ByteBuffer p_i930_1_, AudioFormat p_i930_2_)
    {
        this.field_216475_a = p_i930_1_;
        this.field_216476_b = p_i930_2_;
    }

    OptionalInt func_216473_a()
    {
        if (!this.field_216477_c)
        {
            if (this.field_216475_a == null)
            {
                return OptionalInt.empty();
            }

            int i = ALUtils.func_216479_a(this.field_216476_b);
            int[] aint = new int[1];
            AL10.alGenBuffers(aint);

            if (ALUtils.checkALError("Creating buffer"))
            {
                return OptionalInt.empty();
            }

            AL10.alBufferData(aint[0], i, this.field_216475_a, (int)this.field_216476_b.getSampleRate());

            if (ALUtils.checkALError("Assigning buffer data"))
            {
                return OptionalInt.empty();
            }

            this.field_216478_d = aint[0];
            this.field_216477_c = true;
            this.field_216475_a = null;
        }

        return OptionalInt.of(this.field_216478_d);
    }

    public void func_216474_b()
    {
        if (this.field_216477_c)
        {
            AL10.alDeleteBuffers(new int[] {this.field_216478_d});

            if (ALUtils.checkALError("Deleting stream buffers"))
            {
                return;
            }
        }

        this.field_216477_c = false;
    }

    public OptionalInt func_216472_c()
    {
        OptionalInt optionalint = this.func_216473_a();
        this.field_216477_c = false;
        return optionalint;
    }
}
