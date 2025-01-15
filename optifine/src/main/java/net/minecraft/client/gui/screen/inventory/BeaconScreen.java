package net.minecraft.client.gui.screen.inventory;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.gui.widget.button.AbstractButton;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.BeaconContainer;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.IContainerListener;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.play.client.CCloseWindowPacket;
import net.minecraft.network.play.client.CUpdateBeaconPacket;
import net.minecraft.potion.Effect;
import net.minecraft.potion.Effects;
import net.minecraft.tileentity.BeaconTileEntity;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class BeaconScreen extends ContainerScreen<BeaconContainer>
{
    private static final ResourceLocation BEACON_GUI_TEXTURES = new ResourceLocation("textures/gui/container/beacon.png");
    private BeaconScreen.ConfirmButton beaconConfirmButton;
    private boolean buttonsNotDrawn;
    private Effect field_214105_n;
    private Effect field_214106_o;

    public BeaconScreen(final BeaconContainer p_i4113_1_, PlayerInventory p_i4113_2_, ITextComponent p_i4113_3_)
    {
        super(p_i4113_1_, p_i4113_2_, p_i4113_3_);
        this.xSize = 230;
        this.ySize = 219;
        p_i4113_1_.addListener(new IContainerListener()
        {
            public void sendAllContents(Container containerToSend, NonNullList<ItemStack> itemsList)
            {
            }
            public void sendSlotContents(Container containerToSend, int slotInd, ItemStack stack)
            {
            }
            public void sendWindowProperty(Container containerIn, int varToUpdate, int newValue)
            {
                BeaconScreen.this.field_214105_n = p_i4113_1_.func_216967_f();
                BeaconScreen.this.field_214106_o = p_i4113_1_.func_216968_g();
                BeaconScreen.this.buttonsNotDrawn = true;
            }
        });
    }

    protected void init()
    {
        super.init();
        this.beaconConfirmButton = this.addButton(new BeaconScreen.ConfirmButton(this.guiLeft + 164, this.guiTop + 107));
        this.addButton(new BeaconScreen.CancelButton(this.guiLeft + 190, this.guiTop + 107));
        this.buttonsNotDrawn = true;
        this.beaconConfirmButton.active = false;
    }

    public void tick()
    {
        super.tick();
        int i = this.container.func_216969_e();

        if (this.buttonsNotDrawn && i >= 0)
        {
            this.buttonsNotDrawn = false;

            for (int j = 0; j <= 2; ++j)
            {
                int k = BeaconTileEntity.EFFECTS_LIST[j].length;
                int l = k * 22 + (k - 1) * 2;

                for (int i1 = 0; i1 < k; ++i1)
                {
                    Effect effect = BeaconTileEntity.EFFECTS_LIST[j][i1];
                    BeaconScreen.PowerButton beaconscreen$powerbutton = new BeaconScreen.PowerButton(this.guiLeft + 76 + i1 * 24 - l / 2, this.guiTop + 22 + j * 25, effect, true);
                    this.addButton(beaconscreen$powerbutton);

                    if (j >= i)
                    {
                        beaconscreen$powerbutton.active = false;
                    }
                    else if (effect == this.field_214105_n)
                    {
                        beaconscreen$powerbutton.setSelected(true);
                    }
                }
            }

            int j1 = 3;
            int k1 = BeaconTileEntity.EFFECTS_LIST[3].length + 1;
            int l1 = k1 * 22 + (k1 - 1) * 2;

            for (int i2 = 0; i2 < k1 - 1; ++i2)
            {
                Effect effect1 = BeaconTileEntity.EFFECTS_LIST[3][i2];
                BeaconScreen.PowerButton beaconscreen$powerbutton2 = new BeaconScreen.PowerButton(this.guiLeft + 167 + i2 * 24 - l1 / 2, this.guiTop + 47, effect1, false);
                this.addButton(beaconscreen$powerbutton2);

                if (3 >= i)
                {
                    beaconscreen$powerbutton2.active = false;
                }
                else if (effect1 == this.field_214106_o)
                {
                    beaconscreen$powerbutton2.setSelected(true);
                }
            }

            if (this.field_214105_n != null)
            {
                BeaconScreen.PowerButton beaconscreen$powerbutton1 = new BeaconScreen.PowerButton(this.guiLeft + 167 + (k1 - 1) * 24 - l1 / 2, this.guiTop + 47, this.field_214105_n, false);
                this.addButton(beaconscreen$powerbutton1);

                if (3 >= i)
                {
                    beaconscreen$powerbutton1.active = false;
                }
                else if (this.field_214105_n == this.field_214106_o)
                {
                    beaconscreen$powerbutton1.setSelected(true);
                }
            }
        }

        this.beaconConfirmButton.active = this.container.func_216970_h() && this.field_214105_n != null;
    }

    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
    {
        this.drawCenteredString(this.font, I18n.format("block.minecraft.beacon.primary"), 62, 10, 14737632);
        this.drawCenteredString(this.font, I18n.format("block.minecraft.beacon.secondary"), 169, 10, 14737632);

        for (Widget widget : this.buttons)
        {
            if (widget.isHovered())
            {
                widget.renderToolTip(mouseX - this.guiLeft, mouseY - this.guiTop);
                break;
            }
        }
    }

    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
    {
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.minecraft.getTextureManager().bindTexture(BEACON_GUI_TEXTURES);
        int i = (this.width - this.xSize) / 2;
        int j = (this.height - this.ySize) / 2;
        this.blit(i, j, 0, 0, this.xSize, this.ySize);
        this.itemRenderer.zLevel = 100.0F;
        this.itemRenderer.renderItemAndEffectIntoGUI(new ItemStack(Items.EMERALD), i + 42, j + 109);
        this.itemRenderer.renderItemAndEffectIntoGUI(new ItemStack(Items.DIAMOND), i + 42 + 22, j + 109);
        this.itemRenderer.renderItemAndEffectIntoGUI(new ItemStack(Items.GOLD_INGOT), i + 42 + 44, j + 109);
        this.itemRenderer.renderItemAndEffectIntoGUI(new ItemStack(Items.IRON_INGOT), i + 42 + 66, j + 109);
        this.itemRenderer.zLevel = 0.0F;
    }

    public void render(int p_render_1_, int p_render_2_, float p_render_3_)
    {
        this.renderBackground();
        super.render(p_render_1_, p_render_2_, p_render_3_);
        this.renderHoveredToolTip(p_render_1_, p_render_2_);
    }

    abstract static class Button extends AbstractButton
    {
        private boolean selected;

        protected Button(int p_i3813_1_, int p_i3813_2_)
        {
            super(p_i3813_1_, p_i3813_2_, 22, 22, "");
        }

        public void renderButton(int p_renderButton_1_, int p_renderButton_2_, float p_renderButton_3_)
        {
            Minecraft.getInstance().getTextureManager().bindTexture(BeaconScreen.BEACON_GUI_TEXTURES);
            RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
            int i = 219;
            int j = 0;

            if (!this.active)
            {
                j += this.width * 2;
            }
            else if (this.selected)
            {
                j += this.width * 1;
            }
            else if (this.isHovered())
            {
                j += this.width * 3;
            }

            this.blit(this.x, this.y, j, 219, this.width, this.height);
            this.func_212945_a();
        }

        protected abstract void func_212945_a();

        public boolean isSelected()
        {
            return this.selected;
        }

        public void setSelected(boolean selectedIn)
        {
            this.selected = selectedIn;
        }
    }

    class CancelButton extends BeaconScreen.SpriteButton
    {
        public CancelButton(int p_i1482_2_, int p_i1482_3_)
        {
            super(p_i1482_2_, p_i1482_3_, 112, 220);
        }

        public void onPress()
        {
            BeaconScreen.this.minecraft.player.connection.sendPacket(new CCloseWindowPacket(BeaconScreen.this.minecraft.player.openContainer.windowId));
            BeaconScreen.this.minecraft.displayGuiScreen((Screen)null);
        }

        public void renderToolTip(int p_renderToolTip_1_, int p_renderToolTip_2_)
        {
            BeaconScreen.this.renderTooltip(I18n.format("gui.cancel"), p_renderToolTip_1_, p_renderToolTip_2_);
        }
    }

    class ConfirmButton extends BeaconScreen.SpriteButton
    {
        public ConfirmButton(int p_i1334_2_, int p_i1334_3_)
        {
            super(p_i1334_2_, p_i1334_3_, 90, 220);
        }

        public void onPress()
        {
            BeaconScreen.this.minecraft.getConnection().sendPacket(new CUpdateBeaconPacket(Effect.getId(BeaconScreen.this.field_214105_n), Effect.getId(BeaconScreen.this.field_214106_o)));
            BeaconScreen.this.minecraft.player.connection.sendPacket(new CCloseWindowPacket(BeaconScreen.this.minecraft.player.openContainer.windowId));
            BeaconScreen.this.minecraft.displayGuiScreen((Screen)null);
        }

        public void renderToolTip(int p_renderToolTip_1_, int p_renderToolTip_2_)
        {
            BeaconScreen.this.renderTooltip(I18n.format("gui.done"), p_renderToolTip_1_, p_renderToolTip_2_);
        }
    }

    class PowerButton extends BeaconScreen.Button
    {
        private final Effect effect;
        private final TextureAtlasSprite field_212946_c;
        private final boolean field_212947_d;

        public PowerButton(int p_i3293_2_, int p_i3293_3_, Effect p_i3293_4_, boolean p_i3293_5_)
        {
            super(p_i3293_2_, p_i3293_3_);
            this.effect = p_i3293_4_;
            this.field_212946_c = Minecraft.getInstance().getPotionSpriteUploader().getSprite(p_i3293_4_);
            this.field_212947_d = p_i3293_5_;
        }

        public void onPress()
        {
            if (!this.isSelected())
            {
                if (this.field_212947_d)
                {
                    BeaconScreen.this.field_214105_n = this.effect;
                }
                else
                {
                    BeaconScreen.this.field_214106_o = this.effect;
                }

                BeaconScreen.this.buttons.clear();
                BeaconScreen.this.children.clear();
                BeaconScreen.this.init();
                BeaconScreen.this.tick();
            }
        }

        public void renderToolTip(int p_renderToolTip_1_, int p_renderToolTip_2_)
        {
            String s = I18n.format(this.effect.getName());

            if (!this.field_212947_d && this.effect != Effects.REGENERATION)
            {
                s = s + " II";
            }

            BeaconScreen.this.renderTooltip(s, p_renderToolTip_1_, p_renderToolTip_2_);
        }

        protected void func_212945_a()
        {
            Minecraft.getInstance().getTextureManager().bindTexture(this.field_212946_c.getAtlasTexture().getTextureLocation());
            blit(this.x + 2, this.y + 2, this.getBlitOffset(), 18, 18, this.field_212946_c);
        }
    }

    abstract static class SpriteButton extends BeaconScreen.Button
    {
        private final int field_212948_a;
        private final int field_212949_b;

        protected SpriteButton(int p_i3317_1_, int p_i3317_2_, int p_i3317_3_, int p_i3317_4_)
        {
            super(p_i3317_1_, p_i3317_2_);
            this.field_212948_a = p_i3317_3_;
            this.field_212949_b = p_i3317_4_;
        }

        protected void func_212945_a()
        {
            this.blit(this.x + 2, this.y + 2, this.field_212948_a, this.field_212949_b, 18, 18);
        }
    }
}
