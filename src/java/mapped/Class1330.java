package mapped;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import java.net.IDN;
import java.util.function.Predicate;

public class Class1330 extends Screen {
    private static final ITextComponent field7036 = new TranslationTextComponent("addServer.enterName");
    private static final ITextComponent field7037 = new TranslationTextComponent("addServer.enterIp");
    private Class1206 field7038;
    private final BooleanConsumer field7039;
    private final ServerData field7040;
    private Class1189 field7041;
    private Class1189 field7042;
    private Class1206 field7043;
    private final Screen field7044;
    private final Predicate<String> field7045 = var0 -> {
        if (Class9001.method33256(var0)) {
            return true;
        } else {
            String[] var3x = var0.split(":");
            if (var3x.length == 0) {
                return true;
            } else {
                try {
                    String var4 = IDN.toASCII(var3x[0]);
                    return true;
                } catch (IllegalArgumentException var5) {
                    return false;
                }
            }
        }
    };

    public Class1330(Screen var1, BooleanConsumer var2, ServerData var3) {
        super(new TranslationTextComponent("addServer.title"));
        this.field7044 = var1;
        this.field7039 = var2;
        this.field7040 = var3;
    }

    @Override
    public void tick() {
        this.field7042.method5633();
        this.field7041.method5633();
    }

    @Override
    public void method1921() {
        this.mc.keyboardListener.method36347(true);
        this.field7042 = new Class1189(this.fontRenderer, this.field4564 / 2 - 100, 66, 200, 20, new TranslationTextComponent("addServer.enterName"));
        this.field7042.method5654(true);
        this.field7042.method5635(this.field7040.field33188);
        this.field7042.method5631(this::method6337);
        this.field4561.add(this.field7042);
        this.field7041 = new Class1189(this.fontRenderer, this.field4564 / 2 - 100, 106, 200, 20, new TranslationTextComponent("addServer.enterIp"));
        this.field7041.method5657(128);
        this.field7041.method5635(this.field7040.field33189);
        this.field7041.method5638(this.field7045);
        this.field7041.method5631(this::method6337);
        this.field4561.add(this.field7041);
        this.field7043 = this.<Class1206>method2455(
                new Class1206(this.field4564 / 2 - 100, this.field4565 / 4 + 72, 200, 20, method6336(this.field7040.method25577()), var1 -> {
                    this.field7040.method25578(Class2168.values()[(this.field7040.method25577().ordinal() + 1) % Class2168.values().length]);
                    this.field7043.method5743(method6336(this.field7040.method25577()));
                })
        );
        this.field7038 = this.<Class1206>method2455(
                new Class1206(
                        this.field4564 / 2 - 100, this.field4565 / 4 + 96 + 18, 200, 20, new TranslationTextComponent("addServer.add"), var1 -> this.method6338()
                )
        );
        this.<Class1206>method2455(
                new Class1206(this.field4564 / 2 - 100, this.field4565 / 4 + 120 + 18, 200, 20, DialogTexts.GUI_CANCEL, var1 -> this.field7039.accept(false))
        );
        this.method6339();
    }

    private static ITextComponent method6336(Class2168 var0) {
        return new TranslationTextComponent("addServer.resourcePack").appendString(": ").append(var0.method8891());
    }

    @Override
    public void resize(Minecraft var1, int var2, int var3) {
        String var6 = this.field7041.method5636();
        String var7 = this.field7042.method5636();
        this.init(var1, var2, var3);
        this.field7041.method5635(var6);
        this.field7042.method5635(var7);
    }

    private void method6337(String var1) {
        this.method6339();
    }

    @Override
    public void onClose() {
        this.mc.keyboardListener.method36347(false);
    }

    private void method6338() {
        this.field7040.field33188 = this.field7042.method5636();
        this.field7040.field33189 = this.field7041.method5636();
        this.field7039.accept(true);
    }

    @Override
    public void method1945() {
        this.method6339();
        this.mc.displayGuiScreen(this.field7044);
    }

    private void method6339() {
        String var3 = this.field7041.method5636();
        boolean var4 = !var3.isEmpty() && var3.split(":").length > 0 && var3.indexOf(32) == -1;
        this.field7038.field6482 = var4 && !this.field7042.method5636().isEmpty();
    }

    @Override
    public void method1923(MatrixStack var1, int var2, int var3, float var4) {
        this.method2469(var1);
        method5691(var1, this.fontRenderer, this.field4560, this.field4564 / 2, 17, 16777215);
        method5693(var1, this.fontRenderer, field7036, this.field4564 / 2 - 100, 53, 10526880);
        method5693(var1, this.fontRenderer, field7037, this.field4564 / 2 - 100, 94, 10526880);
        this.field7042.method1923(var1, var2, var3, var4);
        this.field7041.method1923(var1, var2, var3, var4);
        super.method1923(var1, var2, var3, var4);
    }
}
