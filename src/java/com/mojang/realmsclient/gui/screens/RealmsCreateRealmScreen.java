package com.mojang.realmsclient.gui.screens;

import com.mojang.realmsclient.RealmsMainScreen;
import com.mojang.realmsclient.dto.RealmsServer;
import net.minecraft.realms.action.CreateWorldRealmsAction;
import mapped.MatrixStack;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.realms.RealmsLabel;
import net.minecraft.realms.RealmsScreen;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class RealmsCreateRealmScreen extends RealmsScreen {
    private static final ITextComponent field4165 = new TranslationTextComponent("mco.configure.world.name");
    private static final ITextComponent field4166 = new TranslationTextComponent("mco.configure.world.description");
    private final RealmsServer field4167;
    private final RealmsMainScreen field4168;
    private TextFieldWidget field4169;
    private TextFieldWidget field4170;
    private Button field4171;
    private RealmsLabel field4172;

    public RealmsCreateRealmScreen(RealmsServer var1, RealmsMainScreen var2) {
        this.field4167 = var1;
        this.field4168 = var2;
    }

    @Override
    public void tick() {
        if (this.field4169 != null) {
            this.field4169.method5633();
        }

        if (this.field4170 != null) {
            this.field4170.method5633();
        }
    }

    @Override
    public void init() {
        this.mc.keyboardListener.enableRepeatEvents(true);
        this.field4171 = this.addButton(
                new Button(
                        this.width / 2 - 100, this.height / 4 + 120 + 17, 97, 20, new TranslationTextComponent("mco.create.world"), var1 -> this.func_224132_a()
                )
        );
        this.addButton(
                new Button(this.width / 2 + 5, this.height / 4 + 120 + 17, 95, 20, DialogTexts.GUI_CANCEL, var1 -> this.mc.displayGuiScreen(this.field4168))
        );
        this.field4171.active = false;
        this.field4169 = new TextFieldWidget(
                this.mc.fontRenderer, this.width / 2 - 100, 65, 200, 20, (TextFieldWidget) null, new TranslationTextComponent("mco.configure.world.name")
        );
        this.addListener(this.field4169);
        this.method5536(this.field4169);
        this.field4170 = new TextFieldWidget(
                this.mc.fontRenderer, this.width / 2 - 100, 115, 200, 20, (TextFieldWidget) null, new TranslationTextComponent("mco.configure.world.description")
        );
        this.addListener(this.field4170);
        this.field4172 = new RealmsLabel(new TranslationTextComponent("mco.selectServer.create"), this.width / 2, 11, 16777215);
        this.addListener(this.field4172);
        this.func_231411_u_();
    }

    @Override
    public void onClose() {
        this.mc.keyboardListener.enableRepeatEvents(false);
    }

    @Override
    public boolean charTyped(char var1, int var2) {
        boolean var5 = super.charTyped(var1, var2);
        this.field4171.active = this.func_224133_b();
        return var5;
    }

    @Override
    public boolean keyPressed(int var1, int var2, int var3) {
        if (var1 != 256) {
            boolean var6 = super.keyPressed(var1, var2, var3);
            this.field4171.active = this.func_224133_b();
            return var6;
        } else {
            this.mc.displayGuiScreen(this.field4168);
            return true;
        }
    }

    private void func_224132_a() {
        if (this.func_224133_b()) {
            RealmsResetWorldScreen realmsresetworldscreen = new RealmsResetWorldScreen(
                    this.field4168,
                    this.field4167,
                    new TranslationTextComponent("mco.selectServer.create"),
                    new TranslationTextComponent("mco.create.world.subtitle"),
                    10526880,
                    new TranslationTextComponent("mco.create.world.skip"),
                    () -> this.mc.displayGuiScreen(this.field4168.func_223942_f()),
                    () -> this.mc.displayGuiScreen(this.field4168.func_223942_f())
            );
            realmsresetworldscreen.func_224432_a(new TranslationTextComponent("mco.create.world.reset.title"));
            this.mc
                    .displayGuiScreen(new RealmsLongRunningMcoTaskScreen(this.field4168, new CreateWorldRealmsAction(this.field4167.field27443, this.field4169.getText(), this.field4170.getText(), realmsresetworldscreen)));
        }
    }

    private boolean func_224133_b() {
        return !this.field4169.getText().trim().isEmpty();
    }

    @Override
    public void render(MatrixStack var1, int var2, int var3, float var4) {
        this.renderBackground(var1);
        this.field4172.func_239560_a_(this, var1);
        this.fontRenderer.func_243248_b(var1, field4165, (float) (this.width / 2 - 100), 52.0F, 10526880);
        this.fontRenderer.func_243248_b(var1, field4166, (float) (this.width / 2 - 100), 102.0F, 10526880);
        if (this.field4169 != null) {
            this.field4169.render(var1, var2, var3, var4);
        }

        if (this.field4170 != null) {
            this.field4170.render(var1, var2, var3, var4);
        }

        super.render(var1, var2, var3, var4);
    }
}
