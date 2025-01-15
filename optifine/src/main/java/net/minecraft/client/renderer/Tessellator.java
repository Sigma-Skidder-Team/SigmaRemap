package net.minecraft.client.renderer;

import com.mojang.blaze3d.systems.RenderSystem;
import net.optifine.SmartAnimations;

public class Tessellator
{
    private final BufferBuilder buffer;
    private static final Tessellator INSTANCE = new Tessellator();

    public static Tessellator getInstance()
    {
        RenderSystem.assertThread(RenderSystem::isOnGameThreadOrInit);
        return INSTANCE;
    }

    public Tessellator(int p_i129_1_)
    {
        this.buffer = new BufferBuilder(p_i129_1_);
    }

    public Tessellator()
    {
        this(2097152);
    }

    public void draw()
    {
        if (this.buffer.animatedSprites != null)
        {
            SmartAnimations.spritesRendered(this.buffer.animatedSprites);
        }

        this.buffer.finishDrawing();
        WorldVertexBufferUploader.draw(this.buffer);
    }

    public BufferBuilder getBuffer()
    {
        return this.buffer;
    }
}
