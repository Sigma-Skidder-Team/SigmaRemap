package net.minecraft.client;

import net.minecraft.client.gui.IGuiEventListener;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.util.InputMappings;
import net.minecraft.client.util.MouseSmoother;
import net.minecraft.client.util.NativeUtil;
import net.minecraft.util.math.MathHelper;

public class MouseHelper
{
    private final Minecraft minecraft;
    private boolean leftDown;
    private boolean middleDown;
    private boolean rightDown;
    private double mouseX;
    private double mouseY;
    private int simulatedRightClicks;
    private int activeButton = -1;
    private boolean ignoreFirstMove = true;
    private int touchScreenCounter;
    private double eventTime;
    private final MouseSmoother xSmoother = new MouseSmoother();
    private final MouseSmoother ySmoother = new MouseSmoother();
    private double xVelocity;
    private double yVelocity;
    private double accumulatedScrollDelta;
    private double lastLookTime = Double.MIN_VALUE;
    private boolean mouseGrabbed;

    public MouseHelper(Minecraft p_i1788_1_)
    {
        this.minecraft = p_i1788_1_;
    }

    private void mouseButtonCallback(long handle, int button, int action, int mods)
    {
        if (handle == this.minecraft.getMainWindow().getHandle())
        {
            boolean flag = action == 1;

            if (Minecraft.IS_RUNNING_ON_MAC && button == 0)
            {
                if (flag)
                {
                    if ((mods & 2) == 2)
                    {
                        button = 1;
                        ++this.simulatedRightClicks;
                    }
                }
                else if (this.simulatedRightClicks > 0)
                {
                    button = 1;
                    --this.simulatedRightClicks;
                }
            }

            int i = button;

            if (flag)
            {
                if (this.minecraft.gameSettings.touchscreen && this.touchScreenCounter++ > 0)
                {
                    return;
                }

                this.activeButton = i;
                this.eventTime = NativeUtil.getTime();
            }
            else if (this.activeButton != -1)
            {
                if (this.minecraft.gameSettings.touchscreen && --this.touchScreenCounter > 0)
                {
                    return;
                }

                this.activeButton = -1;
            }

            boolean[] aboolean = new boolean[] {false};

            if (this.minecraft.loadingGui == null)
            {
                if (this.minecraft.currentScreen == null)
                {
                    if (!this.mouseGrabbed && flag)
                    {
                        this.grabMouse();
                    }
                }
                else
                {
                    double d0 = this.mouseX * (double)this.minecraft.getMainWindow().getScaledWidth() / (double)this.minecraft.getMainWindow().getWidth();
                    double d1 = this.mouseY * (double)this.minecraft.getMainWindow().getScaledHeight() / (double)this.minecraft.getMainWindow().getHeight();

                    if (flag)
                    {
                        Screen.wrapScreenError(() ->
                        {
                            aboolean[0] = this.minecraft.currentScreen.mouseClicked(d0, d1, i);
                        }, "mouseClicked event handler", this.minecraft.currentScreen.getClass().getCanonicalName());
                    }
                    else
                    {
                        Screen.wrapScreenError(() ->
                        {
                            aboolean[0] = this.minecraft.currentScreen.mouseReleased(d0, d1, i);
                        }, "mouseReleased event handler", this.minecraft.currentScreen.getClass().getCanonicalName());
                    }
                }
            }

            if (!aboolean[0] && (this.minecraft.currentScreen == null || this.minecraft.currentScreen.passEvents) && this.minecraft.loadingGui == null)
            {
                if (i == 0)
                {
                    this.leftDown = flag;
                }
                else if (i == 2)
                {
                    this.middleDown = flag;
                }
                else if (i == 1)
                {
                    this.rightDown = flag;
                }

                KeyBinding.setKeyBindState(InputMappings.Type.MOUSE.getOrMakeInput(i), flag);

                if (flag)
                {
                    if (this.minecraft.player.isSpectator() && i == 2)
                    {
                        this.minecraft.ingameGUI.getSpectatorGui().onMiddleClick();
                    }
                    else
                    {
                        KeyBinding.onTick(InputMappings.Type.MOUSE.getOrMakeInput(i));
                    }
                }
            }
        }
    }

    private void scrollCallback(long handle, double xoffset, double yoffset)
    {
        if (handle == Minecraft.getInstance().getMainWindow().getHandle())
        {
            double d0 = (this.minecraft.gameSettings.discreteMouseScroll ? Math.signum(yoffset) : yoffset) * this.minecraft.gameSettings.mouseWheelSensitivity;

            if (this.minecraft.loadingGui == null)
            {
                if (this.minecraft.currentScreen != null)
                {
                    double d1 = this.mouseX * (double)this.minecraft.getMainWindow().getScaledWidth() / (double)this.minecraft.getMainWindow().getWidth();
                    double d2 = this.mouseY * (double)this.minecraft.getMainWindow().getScaledHeight() / (double)this.minecraft.getMainWindow().getHeight();
                    this.minecraft.currentScreen.mouseScrolled(d1, d2, d0);
                }
                else if (this.minecraft.player != null)
                {
                    if (this.accumulatedScrollDelta != 0.0D && Math.signum(d0) != Math.signum(this.accumulatedScrollDelta))
                    {
                        this.accumulatedScrollDelta = 0.0D;
                    }

                    this.accumulatedScrollDelta += d0;
                    float f1 = (float)((int)this.accumulatedScrollDelta);

                    if (f1 == 0.0F)
                    {
                        return;
                    }

                    this.accumulatedScrollDelta -= (double)f1;

                    if (this.minecraft.player.isSpectator())
                    {
                        if (this.minecraft.ingameGUI.getSpectatorGui().isMenuActive())
                        {
                            this.minecraft.ingameGUI.getSpectatorGui().onMouseScroll((double)(-f1));
                        }
                        else
                        {
                            float f = MathHelper.clamp(this.minecraft.player.abilities.getFlySpeed() + f1 * 0.005F, 0.0F, 0.2F);
                            this.minecraft.player.abilities.setFlySpeed(f);
                        }
                    }
                    else
                    {
                        this.minecraft.player.inventory.changeCurrentItem((double)f1);
                    }
                }
            }
        }
    }

    public void registerCallbacks(long handle)
    {
        InputMappings.setMouseCallbacks(handle, (p_228032_1_, p_228032_3_, p_228032_5_) ->
        {
            this.minecraft.execute(() -> {
                this.cursorPosCallback(p_228032_1_, p_228032_3_, p_228032_5_);
            });
        }, (p_228028_1_, p_228028_3_, p_228028_4_, p_228028_5_) ->
        {
            this.minecraft.execute(() -> {
                this.mouseButtonCallback(p_228028_1_, p_228028_3_, p_228028_4_, p_228028_5_);
            });
        }, (p_228029_1_, p_228029_3_, p_228029_5_) ->
        {
            this.minecraft.execute(() -> {
                this.scrollCallback(p_228029_1_, p_228029_3_, p_228029_5_);
            });
        });
    }

    private void cursorPosCallback(long handle, double xpos, double ypos)
    {
        if (handle == Minecraft.getInstance().getMainWindow().getHandle())
        {
            if (this.ignoreFirstMove)
            {
                this.mouseX = xpos;
                this.mouseY = ypos;
                this.ignoreFirstMove = false;
            }

            IGuiEventListener iguieventlistener = this.minecraft.currentScreen;

            if (iguieventlistener != null && this.minecraft.loadingGui == null)
            {
                double d0 = xpos * (double)this.minecraft.getMainWindow().getScaledWidth() / (double)this.minecraft.getMainWindow().getWidth();
                double d1 = ypos * (double)this.minecraft.getMainWindow().getScaledHeight() / (double)this.minecraft.getMainWindow().getHeight();
                Screen.wrapScreenError(() ->
                {
                    iguieventlistener.mouseMoved(d0, d1);
                }, "mouseMoved event handler", iguieventlistener.getClass().getCanonicalName());

                if (this.activeButton != -1 && this.eventTime > 0.0D)
                {
                    double d2 = (xpos - this.mouseX) * (double)this.minecraft.getMainWindow().getScaledWidth() / (double)this.minecraft.getMainWindow().getWidth();
                    double d3 = (ypos - this.mouseY) * (double)this.minecraft.getMainWindow().getScaledHeight() / (double)this.minecraft.getMainWindow().getHeight();
                    Screen.wrapScreenError(() ->
                    {
                        iguieventlistener.mouseDragged(d0, d1, this.activeButton, d2, d3);
                    }, "mouseDragged event handler", iguieventlistener.getClass().getCanonicalName());
                }
            }

            this.minecraft.getProfiler().startSection("mouse");

            if (this.isMouseGrabbed() && this.minecraft.isGameFocused())
            {
                this.xVelocity += xpos - this.mouseX;
                this.yVelocity += ypos - this.mouseY;
            }

            this.updatePlayerLook();
            this.mouseX = xpos;
            this.mouseY = ypos;
            this.minecraft.getProfiler().endSection();
        }
    }

    public void updatePlayerLook()
    {
        double d0 = NativeUtil.getTime();
        double d1 = d0 - this.lastLookTime;
        this.lastLookTime = d0;

        if (this.isMouseGrabbed() && this.minecraft.isGameFocused())
        {
            double d4 = this.minecraft.gameSettings.mouseSensitivity * (double)0.6F + (double)0.2F;
            double d5 = d4 * d4 * d4 * 8.0D;
            double d2;
            double d3;

            if (this.minecraft.gameSettings.smoothCamera)
            {
                double d6 = this.xSmoother.smooth(this.xVelocity * d5, d1 * d5);
                double d7 = this.ySmoother.smooth(this.yVelocity * d5, d1 * d5);
                d2 = d6;
                d3 = d7;
            }
            else
            {
                this.xSmoother.reset();
                this.ySmoother.reset();
                d2 = this.xVelocity * d5;
                d3 = this.yVelocity * d5;
            }

            this.xVelocity = 0.0D;
            this.yVelocity = 0.0D;
            int i = 1;

            if (this.minecraft.gameSettings.invertMouse)
            {
                i = -1;
            }

            this.minecraft.getTutorial().onMouseMove(d2, d3);

            if (this.minecraft.player != null)
            {
                this.minecraft.player.rotateTowards(d2, d3 * (double)i);
            }
        }
        else
        {
            this.xVelocity = 0.0D;
            this.yVelocity = 0.0D;
        }
    }

    public boolean isLeftDown()
    {
        return this.leftDown;
    }

    public boolean isRightDown()
    {
        return this.rightDown;
    }

    public double getMouseX()
    {
        return this.mouseX;
    }

    public double getMouseY()
    {
        return this.mouseY;
    }

    public void setIgnoreFirstMove()
    {
        this.ignoreFirstMove = true;
    }

    public boolean isMouseGrabbed()
    {
        return this.mouseGrabbed;
    }

    public void grabMouse()
    {
        if (this.minecraft.isGameFocused())
        {
            if (!this.mouseGrabbed)
            {
                if (!Minecraft.IS_RUNNING_ON_MAC)
                {
                    KeyBinding.updateKeyBindState();
                }

                this.mouseGrabbed = true;
                this.mouseX = (double)(this.minecraft.getMainWindow().getWidth() / 2);
                this.mouseY = (double)(this.minecraft.getMainWindow().getHeight() / 2);
                InputMappings.setCursorPosAndMode(this.minecraft.getMainWindow().getHandle(), 212995, this.mouseX, this.mouseY);
                this.minecraft.displayGuiScreen((Screen)null);
                this.minecraft.leftClickCounter = 10000;
                this.ignoreFirstMove = true;
            }
        }
    }

    public void ungrabMouse()
    {
        if (this.mouseGrabbed)
        {
            this.mouseGrabbed = false;
            this.mouseX = (double)(this.minecraft.getMainWindow().getWidth() / 2);
            this.mouseY = (double)(this.minecraft.getMainWindow().getHeight() / 2);
            InputMappings.setCursorPosAndMode(this.minecraft.getMainWindow().getHandle(), 212993, this.mouseX, this.mouseY);
        }
    }
}
