package mapped;

import net.minecraft.client.gui.DialogTexts;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class799 extends Class798 {
    private static final ITextComponent field4165 = new TranslationTextComponent("mco.configure.world.name");
    private static final ITextComponent field4166 = new TranslationTextComponent("mco.configure.world.description");
    private final Class6128 field4167;
    private final Class806 field4168;
    private Class1189 field4169;
    private Class1189 field4170;
    private Class1206 field4171;
    private Class1153 field4172;

    public Class799(Class6128 var1, Class806 var2) {
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
    public void method1921() {
        this.field4562.keyboardListener.method36347(true);
        this.field4171 = this.<Class1206>method2455(
                new Class1206(
                        this.field4564 / 2 - 100, this.field4565 / 4 + 120 + 17, 97, 20, new TranslationTextComponent("mco.create.world"), var1 -> this.method1933()
                )
        );
        this.<Class1206>method2455(
                new Class1206(this.field4564 / 2 + 5, this.field4565 / 4 + 120 + 17, 95, 20, DialogTexts.GUI_CANCEL, var1 -> this.field4562.displayGuiScreen(this.field4168))
        );
        this.field4171.field6482 = false;
        this.field4169 = new Class1189(
                this.field4562.fontRenderer, this.field4564 / 2 - 100, 65, 200, 20, (Class1189) null, new TranslationTextComponent("mco.configure.world.name")
        );
        this.<Class1189>method2456(this.field4169);
        this.method5536(this.field4169);
        this.field4170 = new Class1189(
                this.field4562.fontRenderer, this.field4564 / 2 - 100, 115, 200, 20, (Class1189) null, new TranslationTextComponent("mco.configure.world.description")
        );
        this.<Class1189>method2456(this.field4170);
        this.field4172 = new Class1153(new TranslationTextComponent("mco.selectServer.create"), this.field4564 / 2, 11, 16777215);
        this.<Class1153>method2456(this.field4172);
        this.method1930();
    }

    @Override
    public void onClose() {
        this.field4562.keyboardListener.method36347(false);
    }

    @Override
    public boolean method1932(char var1, int var2) {
        boolean var5 = super.method1932(var1, var2);
        this.field4171.field6482 = this.method1934();
        return var5;
    }

    @Override
    public boolean method1920(int var1, int var2, int var3) {
        if (var1 != 256) {
            boolean var6 = super.method1920(var1, var2, var3);
            this.field4171.field6482 = this.method1934();
            return var6;
        } else {
            this.field4562.displayGuiScreen(this.field4168);
            return true;
        }
    }

    private void method1933() {
        if (this.method1934()) {
            Class814 var3 = new Class814(
                    this.field4168,
                    this.field4167,
                    new TranslationTextComponent("mco.selectServer.create"),
                    new TranslationTextComponent("mco.create.world.subtitle"),
                    10526880,
                    new TranslationTextComponent("mco.create.world.skip"),
                    () -> this.field4562.displayGuiScreen(this.field4168.method2060()),
                    () -> this.field4562.displayGuiScreen(this.field4168.method2060())
            );
            var3.method2247(new TranslationTextComponent("mco.create.world.reset.title"));
            this.field4562
                    .displayGuiScreen(new Class797(this.field4168, new Class792(this.field4167.field27443, this.field4169.method5636(), this.field4170.method5636(), var3)));
        }
    }

    private boolean method1934() {
        return !this.field4169.method5636().trim().isEmpty();
    }

    @Override
    public void method1923(MatrixStack var1, int var2, int var3, float var4) {
        this.method2469(var1);
        this.field4172.method5542(this, var1);
        this.field4568.method38805(var1, field4165, (float) (this.field4564 / 2 - 100), 52.0F, 10526880);
        this.field4568.method38805(var1, field4166, (float) (this.field4564 / 2 - 100), 102.0F, 10526880);
        if (this.field4169 != null) {
            this.field4169.method1923(var1, var2, var3, var4);
        }

        if (this.field4170 != null) {
            this.field4170.method1923(var1, var2, var3, var4);
        }

        super.method1923(var1, var2, var3, var4);
    }
}
