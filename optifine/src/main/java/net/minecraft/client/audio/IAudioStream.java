package net.minecraft.client.audio;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import javax.sound.sampled.AudioFormat;

public interface IAudioStream extends Closeable
{
    AudioFormat func_216454_a();

    ByteBuffer func_216453_b() throws IOException;

    @Nullable
    ByteBuffer func_216455_a(int p_216455_1_) throws IOException;
}
