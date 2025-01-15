package net.minecraft.client.renderer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class GLAllocation
{

    public static synchronized ByteBuffer createDirectByteBuffer(int capacity)
    {
        return ByteBuffer.allocateDirect(capacity).order(ByteOrder.nativeOrder());
    }

    public static FloatBuffer createDirectFloatBuffer(int capacity)
    {
        return createDirectByteBuffer(capacity << 2).asFloatBuffer();
    }
}
