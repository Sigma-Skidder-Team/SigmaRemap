package net.minecraft.client.tutorial;

import javax.annotation.Nullable;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovementInput;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.KeybindTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.GameType;

public class Tutorial
{
    private final Minecraft minecraft;
    @Nullable
    private ITutorialStep tutorialStep;

    public Tutorial(Minecraft p_i3173_1_)
    {
        this.minecraft = p_i3173_1_;
    }

    public void handleMovement(MovementInput p_193293_1_)
    {
        if (this.tutorialStep != null)
        {
            this.tutorialStep.handleMovement(p_193293_1_);
        }
    }

    public void onMouseMove(double velocityX, double velocityY)
    {
        if (this.tutorialStep != null)
        {
            this.tutorialStep.onMouseMove(velocityX, velocityY);
        }
    }

    public void onMouseHover(@Nullable ClientWorld worldIn, @Nullable RayTraceResult result)
    {
        if (this.tutorialStep != null && result != null && worldIn != null)
        {
            this.tutorialStep.onMouseHover(worldIn, result);
        }
    }

    public void onHitBlock(ClientWorld worldIn, BlockPos pos, BlockState state, float diggingStage)
    {
        if (this.tutorialStep != null)
        {
            this.tutorialStep.onHitBlock(worldIn, pos, state, diggingStage);
        }
    }

    public void openInventory()
    {
        if (this.tutorialStep != null)
        {
            this.tutorialStep.openInventory();
        }
    }

    public void handleSetSlot(ItemStack stack)
    {
        if (this.tutorialStep != null)
        {
            this.tutorialStep.handleSetSlot(stack);
        }
    }

    public void stop()
    {
        if (this.tutorialStep != null)
        {
            this.tutorialStep.onStop();
            this.tutorialStep = null;
        }
    }

    public void reload()
    {
        if (this.tutorialStep != null)
        {
            this.stop();
        }

        this.tutorialStep = this.minecraft.gameSettings.tutorialStep.create(this);
    }

    public void tick()
    {
        if (this.tutorialStep != null)
        {
            if (this.minecraft.world != null)
            {
                this.tutorialStep.tick();
            }
            else
            {
                this.stop();
            }
        }
        else if (this.minecraft.world != null)
        {
            this.reload();
        }
    }

    public void setStep(TutorialSteps step)
    {
        this.minecraft.gameSettings.tutorialStep = step;
        this.minecraft.gameSettings.saveOptions();

        if (this.tutorialStep != null)
        {
            this.tutorialStep.onStop();
            this.tutorialStep = step.create(this);
        }
    }

    public Minecraft getMinecraft()
    {
        return this.minecraft;
    }

    public GameType getGameType()
    {
        return this.minecraft.playerController == null ? GameType.NOT_SET : this.minecraft.playerController.getCurrentGameType();
    }

    public static ITextComponent createKeybindComponent(String keybind)
    {
        return (new KeybindTextComponent("key." + keybind)).applyTextStyle(TextFormatting.BOLD);
    }
}
