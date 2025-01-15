package net.optifine.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderTypeBuffers;

public class RenderUtils
{
    private static boolean flushRenderBuffers = true;
    private static Minecraft mc = Minecraft.getInstance();

    public static void setFlushRenderBuffers(boolean flushRenderBuffers)
    {
        flushRenderBuffers = flushRenderBuffers;
    }

    public static boolean isFlushRenderBuffers()
    {
        return flushRenderBuffers;
    }

    public static void flushRenderBuffers()
    {
        if (flushRenderBuffers)
        {
            RenderTypeBuffers rendertypebuffers = mc.getRenderTypeBuffers();
            rendertypebuffers.getBufferSource().flushRenderBuffers();
            rendertypebuffers.getCrumblingBufferSource().flushRenderBuffers();
        }
    }
}
