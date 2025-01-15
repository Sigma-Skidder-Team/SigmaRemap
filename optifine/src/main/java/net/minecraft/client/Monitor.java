package net.minecraft.client;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Optional;
import net.minecraft.client.renderer.VideoMode;
import net.optifine.util.VideoModeComparator;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.glfw.GLFWVidMode.Buffer;

public final class Monitor
{
    private final long monitorPointer;
    private final List<VideoMode> videoModes;
    private VideoMode defaultVideoMode;
    private int virtualPosX;
    private int virtualPosY;

    public Monitor(long p_i191_1_)
    {
        this.monitorPointer = p_i191_1_;
        this.videoModes = Lists.newArrayList();
        this.setup();
    }

    public void setup()
    {
        RenderSystem.assertThread(RenderSystem::isInInitPhase);
        this.videoModes.clear();
        Buffer buffer = GLFW.glfwGetVideoModes(this.monitorPointer);
        GLFWVidMode glfwvidmode = GLFW.glfwGetVideoMode(this.monitorPointer);
        VideoMode videomode = new VideoMode(glfwvidmode);

        for (int i = buffer.limit() - 1; i >= 0; --i)
        {
            buffer.position(i);
            VideoMode videomode1 = new VideoMode(buffer);

            if (videomode1.getRedBits() >= 8 && videomode1.getGreenBits() >= 8 && videomode1.getBlueBits() >= 8 && videomode1.getRefreshRate() >= videomode.getRefreshRate())
            {
                this.videoModes.add(videomode1);
            }
        }

        this.videoModes.sort(new VideoModeComparator());
        int[] aint = new int[1];
        int[] aint1 = new int[1];
        GLFW.glfwGetMonitorPos(this.monitorPointer, aint, aint1);
        this.virtualPosX = aint[0];
        this.virtualPosY = aint1[0];
        GLFWVidMode glfwvidmode1 = GLFW.glfwGetVideoMode(this.monitorPointer);
        this.defaultVideoMode = new VideoMode(glfwvidmode1);
    }

    public VideoMode getVideoModeOrDefault(Optional<VideoMode> optionalVideoMode)
    {
        RenderSystem.assertThread(RenderSystem::isInInitPhase);

        if (optionalVideoMode.isPresent())
        {
            VideoMode videomode = optionalVideoMode.get();

            for (VideoMode videomode1 : this.videoModes)
            {
                if (videomode1.equals(videomode))
                {
                    return videomode1;
                }
            }
        }

        return this.getDefaultVideoMode();
    }

    public int getVideoModeIndex(VideoMode modeIn)
    {
        RenderSystem.assertThread(RenderSystem::isInInitPhase);
        return this.videoModes.indexOf(modeIn);
    }

    public VideoMode getDefaultVideoMode()
    {
        return this.defaultVideoMode;
    }

    public int getVirtualPosX()
    {
        return this.virtualPosX;
    }

    public int getVirtualPosY()
    {
        return this.virtualPosY;
    }

    public VideoMode getVideoModeFromIndex(int index)
    {
        return this.videoModes.get(index);
    }

    public int getVideoModeCount()
    {
        return this.videoModes.size();
    }

    public long getMonitorPointer()
    {
        return this.monitorPointer;
    }

    public String toString()
    {
        return String.format("Monitor[%s %sx%s %s]", this.monitorPointer, this.virtualPosX, this.virtualPosY, this.defaultVideoMode);
    }
}
