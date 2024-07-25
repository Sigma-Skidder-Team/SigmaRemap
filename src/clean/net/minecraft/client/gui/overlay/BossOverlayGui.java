package net.minecraft.client.gui.overlay;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.client.gui.ClientBossInfo;
import net.minecraft.network.play.server.SUpdateBossInfoPacket;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.BossInfo;

public class BossOverlayGui extends AbstractGui
{
    private static final ResourceLocation GUI_BARS_TEXTURES = new ResourceLocation("textures/gui/bars.png");
    private final Minecraft client;
    private final Map<UUID, ClientBossInfo> mapBossInfos = Maps.newLinkedHashMap();

    public BossOverlayGui(Minecraft clientIn)
    {
        this.client = clientIn;
    }

    public void func_238484_a_(MatrixStack p_238484_1_)
    {
        if (!this.mapBossInfos.isEmpty())
        {
            int i = this.client.getMainWindow().getScaledWidth();
            int j = 12;

            for (ClientBossInfo clientbossinfo : this.mapBossInfos.values())
            {
                int k = i / 2 - 91;
                RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
                this.client.getTextureManager().bindTexture(GUI_BARS_TEXTURES);
                this.func_238485_a_(p_238484_1_, k, j, clientbossinfo);
                ITextComponent itextcomponent = clientbossinfo.getName();
                int l = this.client.fontRenderer.getStringPropertyWidth(itextcomponent);
                int i1 = i / 2 - l / 2;
                int j1 = j - 9;
                this.client.fontRenderer.func_243246_a(p_238484_1_, itextcomponent, (float)i1, (float)j1, 16777215);
                j += 10 + 9;

                if (j >= this.client.getMainWindow().getScaledHeight() / 3)
                {
                    break;
                }
            }
        }
    }

    private void func_238485_a_(MatrixStack p_238485_1_, int p_238485_2_, int p_238485_3_, BossInfo p_238485_4_)
    {
        this.blit(p_238485_1_, p_238485_2_, p_238485_3_, 0, p_238485_4_.getColor().ordinal() * 5 * 2, 182, 5);

        if (p_238485_4_.getOverlay() != BossInfo.Overlay.PROGRESS)
        {
            this.blit(p_238485_1_, p_238485_2_, p_238485_3_, 0, 80 + (p_238485_4_.getOverlay().ordinal() - 1) * 5 * 2, 182, 5);
        }

        int i = (int)(p_238485_4_.getPercent() * 183.0F);

        if (i > 0)
        {
            this.blit(p_238485_1_, p_238485_2_, p_238485_3_, 0, p_238485_4_.getColor().ordinal() * 5 * 2 + 5, i, 5);

            if (p_238485_4_.getOverlay() != BossInfo.Overlay.PROGRESS)
            {
                this.blit(p_238485_1_, p_238485_2_, p_238485_3_, 0, 80 + (p_238485_4_.getOverlay().ordinal() - 1) * 5 * 2 + 5, i, 5);
            }
        }
    }

    public void read(SUpdateBossInfoPacket packetIn)
    {
        if (packetIn.getOperation() == SUpdateBossInfoPacket.Operation.ADD)
        {
            this.mapBossInfos.put(packetIn.getUniqueId(), new ClientBossInfo(packetIn));
        }
        else if (packetIn.getOperation() == SUpdateBossInfoPacket.Operation.REMOVE)
        {
            this.mapBossInfos.remove(packetIn.getUniqueId());
        }
        else
        {
            this.mapBossInfos.get(packetIn.getUniqueId()).updateFromPacket(packetIn);
        }
    }

    public void clearBossInfos()
    {
        this.mapBossInfos.clear();
    }

    public boolean shouldPlayEndBossMusic()
    {
        if (!this.mapBossInfos.isEmpty())
        {
            for (BossInfo bossinfo : this.mapBossInfos.values())
            {
                if (bossinfo.shouldPlayEndBossMusic())
                {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean shouldDarkenSky()
    {
        if (!this.mapBossInfos.isEmpty())
        {
            for (BossInfo bossinfo : this.mapBossInfos.values())
            {
                if (bossinfo.shouldDarkenSky())
                {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean shouldCreateFog()
    {
        if (!this.mapBossInfos.isEmpty())
        {
            for (BossInfo bossinfo : this.mapBossInfos.values())
            {
                if (bossinfo.shouldCreateFog())
                {
                    return true;
                }
            }
        }

        return false;
    }
}
