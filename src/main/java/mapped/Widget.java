package mapped;

import com.mentalfrostbyte.jello.unmapped.GuiComponent;
import com.mentalfrostbyte.jello.util.timer.TimerUtil;
import net.minecraft.client.Minecraft;
import org.newdawn.slick.TrueTypeFont;

import java.util.ArrayList;
import java.util.List;

public class Widget extends GuiComponent implements DragHandler {
    public boolean draggable;
    public boolean dragging;
    public int dragStartMouseX;
    public int dragStartMouseY;
    public int dragOffsetX;
    public int dragOffsetY;
    public boolean clampToBounds = true;
    public boolean allowBottomOverflow = false;
    public boolean enableHoldToDrag = true;
    public boolean enableMoveThresholdToDrag = true;
    public boolean enableImmediateDrag = false;
    public final TimerUtil dragStartTimer = new TimerUtil();
    public int dragStartDelayMs = 300;
    public int dragStartMoveThresholdPx = 2;
    private final List<DragListener> dragListeners = new ArrayList<>();

    public Widget(GuiComponent var1, String var2, int var3, int var4, int var5, int var6, boolean var7) {
        super(var1, var2, var3, var4, var5, var6);
        this.draggable = var7;
    }

    public Widget(GuiComponent var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7, boolean var8) {
        super(var1, var2, var3, var4, var5, var6, var7);
        this.draggable = var8;
    }

    public Widget(GuiComponent var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7, String var8, boolean var9) {
        super(var1, var2, var3, var4, var5, var6, var7, var8);
        this.draggable = var9;
    }

    public Widget(GuiComponent var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7, String var8, TrueTypeFont var9, boolean var10) {
        super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
        this.draggable = var10;
    }

    @Override
    public boolean isMouseDownOverComponent() {
        return this.field20909 && !this.isDragging();
    }

    @Override
    public void updatePanelDimensions(int newHeight, int newWidth) {
        super.updatePanelDimensions(newHeight, newWidth);
        if (this.isDraggable()) {
            if (!this.field20909 && !this.dragging) {
                this.dragOffsetX = this.getWidthA() / 2;
                this.dragOffsetY = this.getHeightA() / 2;
            }

            this.handleMovementAndCheckBoundaries(newHeight, newWidth);
        }
    }

    @Override
    public boolean onMouseDown(int mouseX, int mouseY, int mouseButton) {
        if (!super.onMouseDown(mouseX, mouseY, mouseButton)) {
            if (this.isDraggable()) {
                this.dragStartTimer.start();
                this.dragStartMouseX = mouseX;
                this.dragStartMouseY = mouseY;
                this.dragOffsetX = this.dragStartMouseX - this.getAbsoluteX();
                this.dragOffsetY = this.dragStartMouseY - this.getAbsoluteY();
            }

            return false;
        } else {
            return true;
        }
    }

    @Override
    public void onMouseRelease(int mouseX, int mouseY, int mouseButton) {
        super.onMouseRelease(mouseX, mouseY, mouseButton);
        if (this.isDraggable()) {
            this.dragStartTimer.stop();
            this.dragStartTimer.reset();
        }

        this.setDragging(false);
    }

    @Override
    public void handleMovementAndCheckBoundaries(int var1, int var2) {
        boolean var5 = this.dragging;
        if (!this.isDragging() && this.isDraggable()) {
            boolean var6 = this.enableHoldToDrag && this.dragStartTimer.getElapsedTime() >= (long) this.dragStartDelayMs;
            boolean var7 = this.enableMoveThresholdToDrag
                    && this.field20909
                    && (Math.abs(this.dragStartMouseX - var1) > this.dragStartMoveThresholdPx || Math.abs(this.dragStartMouseY - var2) > this.dragStartMoveThresholdPx);
            boolean var8 = this.enableImmediateDrag && this.field20909;
            if (var6 || var7 || var8) {
                this.setDragging(true);
            }
        } else if (this.isDragging()) {
            this.setXA(var1 - this.dragOffsetX - (this.screen == null ? 0 : this.screen.getAbsoluteX()));
            this.setYA(var2 - this.dragOffsetY - (this.screen == null ? 0 : this.screen.getAbsoluteY()));
            if (this.clampToBounds) {
                if (this.screen == null) {
                    if (this.getXA() < 0) {
                        this.setXA(0);
                    }

                    if (this.getXA() + this.getWidthA() > Minecraft.getInstance().mainWindow.getWidth()) {
                        this.setXA(Minecraft.getInstance().mainWindow.getWidth() - this.getWidthA());
                    }

                    if (this.getYA() < 0) {
                        this.setYA(0);
                    }

                    if (this.getYA() + this.getHeightA() > Minecraft.getInstance().mainWindow.getHeight()) {
                        this.setYA(Minecraft.getInstance().mainWindow.getHeight() - this.getHeightA());
                    }
                } else {
                    if (this.getXA() < 0) {
                        this.setXA(0);
                    }

                    if (this.getXA() + this.getWidthA() > this.screen.getWidthA()) {
                        this.setXA(this.screen.getWidthA() - this.getWidthA());
                    }

                    if (this.getYA() < 0) {
                        this.setYA(0);
                    }

                    if (this.getYA() + this.getHeightA() > this.screen.getHeightA() && !this.allowBottomOverflow) {
                        this.setYA(this.screen.getHeightA() - this.getHeightA());
                    }
                }
            }
        }

        if (this.isDragging() && !var5) {
            this.dragStartTimer.stop();
            this.dragStartTimer.reset();
        }
    }

    @Override
    public boolean isDraggable() {
        return this.draggable;
    }

    @Override
    public void setDraggable(boolean var1) {
        this.draggable = var1;
    }

    @Override
    public boolean isDragging() {
        return this.dragging;
    }

    @Override
    public void setDragging(boolean var1) {
        this.dragging = var1;
        if (var1) {
            this.setDraggable(true);
            this.notifyDragListeners();
        }
    }

    public void notifyDragListeners() {
        for (DragListener listener : this.dragListeners) {
            listener.onDragStart(this);
        }
    }
}
