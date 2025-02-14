package com.mentalfrostbyte.jello.module.impl.render.classic;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventRender2D;
import com.mentalfrostbyte.jello.event.impl.EventRenderNameTag;
import com.mentalfrostbyte.jello.event.impl.EventRender3D;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.unmapped.ResourceList;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.render.PositionUtils;
import com.mentalfrostbyte.jello.util.ClientColors;
import mapped.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.vector.Vector2f;
import org.lwjgl.opengl.GL11;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Nametags extends Module {
    private final HashMap<PlayerEntity, Vector2f> playerScreenPositions = new HashMap<>();

    public Nametags() {
        super(ModuleCategory.RENDER, "NameTags", "Render better name tags");
    }

    @EventTarget
    public void on2D(EventRender2D event) {
        if (this.isEnabled()) {
            int nameBoxHeight = 20;
            int itemStackHeight = 32;

            for (Entry<PlayerEntity, Vector2f> entry : this.playerScreenPositions.entrySet()) {
                PlayerEntity player = entry.getKey();
                if (!player.isInvisible()) {
                    Vector2f vec = entry.getValue();
                    String name = player.getName().getUnformattedComponentText();
                    int width = ResourceList.bold16.getWidth(name) + 8;
                    int x = Math.round(vec.x);
                    int y = Math.round(vec.y);
                    GL11.glPushMatrix();
                    GL11.glTranslatef((float) (-width / 2), -nameBoxHeight, 0.0F);
                    RenderUtil.renderBackgroundBox((float) x, (float) y, (float) width, 20.0F,
                            MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor(), 0.5F));
                    RenderUtil.drawString(ResourceList.bold16, (float) (x + 3), (float) y, name,
                            MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor(), 0.5F));
                    RenderUtil.drawString(ResourceList.bold16, (float) (x + 3), (float) (y - 1), name,
                            ClientColors.LIGHT_GREYISH_BLUE.getColor());
                    GL11.glPopMatrix();
                    List<ItemStack> validStacks = InvManagerUtils.getValidStacks(player);
                    if (!validStacks.isEmpty()) {
                        int totalWidth = itemStackHeight * validStacks.size();
                        GL11.glPushMatrix();
                        GL11.glTranslatef((float) (-totalWidth / 2), -nameBoxHeight - itemStackHeight - 2, 0.0F);
                        GL11.glPopMatrix();
                    }
                }
            }
        }
    }

    @EventTarget
    public void on3D(EventRender3D event) {
        if (this.isEnabled()) {
            this.playerScreenPositions.clear();

            for (Entity entity : mc.world.getAllEntities()) {
                if (entity instanceof PlayerEntity && !(entity instanceof ClientPlayerEntity)) {
                    PlayerEntity plr = (PlayerEntity) entity;
                    Vector3D_ relativePosition = PositionUtils.getRelativePosition(plr);
                    double[] screenCords = RenderUtil.worldToScreen(relativePosition.x,
                            relativePosition.y + (double) plr.getHeight() + 0.3F, relativePosition.z);

                    if (screenCords != null && screenCords[2] >= 0.0 && screenCords[2] < 1.0) {
                        this.playerScreenPositions.put(plr,
                                new Vector2f((float) screenCords[0], (float) screenCords[1]));
                    }
                }
            }
        }
    }

    @EventTarget
    public void onNametagsRender(EventRenderNameTag event) {
        if (this.isEnabled() && event.getEntity() instanceof PlayerEntity) {
            event.setCancelled(true);
        }
    }
}
