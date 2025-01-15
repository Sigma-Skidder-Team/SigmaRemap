package net.minecraft.client.renderer;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.nio.ByteBuffer;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.optifine.Config;
import net.optifine.shaders.SVertexBuilder;
import org.lwjgl.system.MemoryUtil;

public class WorldVertexBufferUploader
{
    public static void draw(BufferBuilder bufferBuilderIn)
    {
        if (!RenderSystem.isOnRenderThread())
        {
            RenderSystem.recordRenderCall(() ->
            {
                if (bufferBuilderIn.getDrawMode() == 7 && Config.isQuadsToTriangles())
                {
                    bufferBuilderIn.quadsToTriangles();
                }

                Pair<BufferBuilder.DrawState, ByteBuffer> pair1 = bufferBuilderIn.getNextBuffer();
                BufferBuilder.DrawState bufferbuilder$drawstate1 = pair1.getFirst();
                draw(pair1.getSecond(), bufferbuilder$drawstate1.getDrawMode(), bufferbuilder$drawstate1.getFormat(), bufferbuilder$drawstate1.getVertexCount());
            });
        }
        else
        {
            if (bufferBuilderIn.getDrawMode() == 7 && Config.isQuadsToTriangles())
            {
                bufferBuilderIn.quadsToTriangles();
            }

            Pair<BufferBuilder.DrawState, ByteBuffer> pair = bufferBuilderIn.getNextBuffer();
            BufferBuilder.DrawState bufferbuilder$drawstate = pair.getFirst();
            draw(pair.getSecond(), bufferbuilder$drawstate.getDrawMode(), bufferbuilder$drawstate.getFormat(), bufferbuilder$drawstate.getVertexCount());
        }
    }

    private static void draw(ByteBuffer bufferIn, int modeIn, VertexFormat vertexFormatIn, int countIn)
    {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        bufferIn.clear();

        if (countIn > 0)
        {
            vertexFormatIn.setupBufferState(MemoryUtil.memAddress(bufferIn));

            if (Config.isShaders())
            {
                SVertexBuilder.drawArrays(modeIn, 0, countIn, vertexFormatIn, bufferIn);
            }
            else
            {
                GlStateManager.drawArrays(modeIn, 0, countIn);
            }

            vertexFormatIn.clearBufferState();
        }
    }
}
