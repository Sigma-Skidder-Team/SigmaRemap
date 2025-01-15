package net.minecraft.client.settings;

import java.util.Optional;
import javax.annotation.Nullable;
import net.minecraft.client.MainWindow;
import net.minecraft.client.Monitor;
import net.minecraft.client.renderer.VideoMode;
import net.minecraft.client.resources.I18n;

public class FullscreenResolutionOption extends SliderPercentageOption
{
    public FullscreenResolutionOption(MainWindow p_i1330_1_)
    {
        this(p_i1330_1_, p_i1330_1_.getMonitor());
    }

    private FullscreenResolutionOption(MainWindow p_i1331_1_, @Nullable Monitor p_i1331_2_)
    {
        super("options.fullscreen.resolution", -1.0D, p_i1331_2_ != null ? (double)(p_i1331_2_.getVideoModeCount() - 1) : -1.0D, 1.0F, (p_225306_2_) ->
        {
            if (p_i1331_2_ == null)
            {
                return -1.0D;
            }
            else {
                Optional<VideoMode> optional = p_i1331_1_.getVideoMode();
                return optional.map((p_225304_1_) -> {
                    return (double)p_i1331_2_.getVideoModeIndex(p_225304_1_);
                }).orElse(-1.0D);
            }
        }, (p_225303_2_, p_225303_3_) ->
        {
            if (p_i1331_2_ != null)
            {
                if (p_225303_3_ == -1.0D)
                {
                    p_i1331_1_.setVideoMode(Optional.empty());
                }
                else
                {
                    p_i1331_1_.setVideoMode(Optional.of(p_i1331_2_.getVideoModeFromIndex(p_225303_3_.intValue())));
                }
            }
        }, (p_225305_1_, p_225305_2_) ->
        {
            if (p_i1331_2_ == null)
            {
                return I18n.format("options.fullscreen.unavailable");
            }
            else {
                double d0 = p_225305_2_.get(p_225305_1_);
                String s = p_225305_2_.getDisplayString();
                return d0 == -1.0D ? s + I18n.format("options.fullscreen.current") : p_i1331_2_.getVideoModeFromIndex((int)d0).toString();
            }
        });
    }
}
