// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

import java.io.FileInputStream;
import org.apache.commons.lang3.StringUtils;
import java.util.Date;
import com.google.common.hash.Hashing;
import java.io.File;

public final class Class641 extends Class623<Class641> implements AutoCloseable
{
    private final Minecraft field3641;
    private final Class544 field3642;
    private final Class1934 field3643;
    private final ResourceLocation field3644;
    private File field3645;
    private final Class1773 field3646;
    private long field3647;
    public final /* synthetic */ Class620 field3648;
    
    public Class641(final Class620 field3648, final Class620 class620, final Class1934 field3649, final Class7952 class621) {
        this.field3648 = field3648;
        this.field3642 = class620.method3611();
        this.field3643 = field3649;
        this.field3641 = Minecraft.getInstance();
        this.field3644 = new ResourceLocation("worlds/" + Hashing.sha1().hashUnencodedChars((CharSequence)field3649.method7808()) + "/icon");
        this.field3645 = class621.method25800(field3649.method7808(), "icon.png");
        if (!this.field3645.isFile()) {
            this.field3645 = null;
        }
        this.field3646 = this.method3674();
    }
    
    @Override
    public void method3467(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b, final float n8) {
        String s = this.field3643.method7809();
        final String string = this.field3643.method7808() + " (" + Class620.method3612().format(new Date(this.field3643.method7812())) + ")";
        if (StringUtils.isEmpty((CharSequence)s)) {
            s = Class8822.method30773("selectWorld.world", new Object[0]) + " " + (n + 1);
        }
        final String str = "";
        String s3;
        if (!this.field3643.method7811()) {
            String s2 = Class8822.method30773("gameMode." + this.field3643.method7813().method586(), new Object[0]);
            if (this.field3643.method7814()) {
                s2 = TextFormatting.DARK_RED + Class8822.method30773("gameMode.hardcore", new Object[0]) + TextFormatting.RESET;
            }
            if (this.field3643.method7815()) {
                s2 = s2 + ", " + Class8822.method30773("selectWorld.cheats", new Object[0]);
            }
            final String method8461 = this.field3643.method7816().getFormattedText();
            if (!this.field3643.method7817()) {
                s3 = s2 + ", " + Class8822.method30773("selectWorld.version", new Object[0]) + " " + method8461;
            }
            else if (!this.field3643.method7818()) {
                s3 = s2 + ", " + Class8822.method30773("selectWorld.version", new Object[0]) + " " + TextFormatting.ITALIC + method8461 + TextFormatting.RESET;
            }
            else {
                s3 = s2 + ", " + Class8822.method30773("selectWorld.version", new Object[0]) + " " + TextFormatting.RED + method8461 + TextFormatting.RESET;
            }
        }
        else {
            s3 = Class8822.method30773("selectWorld.conversion", new Object[0]) + " " + str;
        }
        this.field3641.fontRenderer.method6610(s, (float)(n3 + 32 + 3), (float)(n2 + 1), 16777215);
        this.field3641.fontRenderer.method6610(string, (float)(n3 + 32 + 3), (float)(n2 + 9 + 3), 8421504);
        this.field3641.fontRenderer.method6610(s3, (float)(n3 + 32 + 3), (float)(n2 + 9 + 9 + 3), 8421504);
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        this.field3641.method5290().method5849((this.field3646 == null) ? Class620.method3613() : this.field3644);
        RenderSystem.enableBlend();
        AbstractGui.blit(n3, n2, 0.0f, 0.0f, 32, 32, 32, 32);
        RenderSystem.disableBlend();
        if (this.field3641.gameSettings.field23429 || b) {
            this.field3641.method5290().method5849(Class620.method3614());
            AbstractGui.fill(n3, n2, n3 + 32, n2 + 32, -1601138544);
            RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
            final int n9 = n6 - n3;
            final int n10 = (n9 >= 32) ? 0 : 32;
            if (!this.field3643.method7817()) {
                AbstractGui.blit(n3, n2, 0.0f, (float)n10, 32, 32, 256, 256);
            }
            else {
                AbstractGui.blit(n3, n2, 32.0f, (float)n10, 32, 32, 256, 256);
                if (!this.field3643.method7819()) {
                    if (!this.field3643.method7818()) {
                        if (!Class9528.method35579().isStable()) {
                            AbstractGui.blit(n3, n2, 64.0f, (float)n10, 32, 32, 256, 256);
                            if (n9 < 32) {
                                this.field3642.method3172(TextFormatting.GOLD + Class8822.method30773("selectWorld.tooltip.snapshot1", new Object[0]) + "\n" + TextFormatting.GOLD + Class8822.method30773("selectWorld.tooltip.snapshot2", new Object[0]));
                            }
                        }
                    }
                    else {
                        AbstractGui.blit(n3, n2, 96.0f, (float)n10, 32, 32, 256, 256);
                        if (n9 < 32) {
                            this.field3642.method3172(TextFormatting.RED + Class8822.method30773("selectWorld.tooltip.fromNewerVersion1", new Object[0]) + "\n" + TextFormatting.RED + Class8822.method30773("selectWorld.tooltip.fromNewerVersion2", new Object[0]));
                        }
                    }
                }
                else {
                    AbstractGui.blit(n3, n2, 96.0f, (float)n10, 32, 32, 256, 256);
                    if (n9 < 32) {
                        this.field3642.method3172(this.field3641.fontRenderer.method6627(new Class2259("selectWorld.tooltip.unsupported", new Object[] { this.field3643.method7816() }).applyTextStyle(TextFormatting.RED).getFormattedText(), 175));
                    }
                }
            }
        }
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        this.field3648.method3609(this);
        this.field3642.method3173(this.field3648.method3610().isPresent());
        if (n - Class620.method3615(this.field3648) <= 32.0) {
            this.method3669();
            return true;
        }
        if (Util.method27837() - this.field3647 >= 250L) {
            this.field3647 = Util.method27837();
            return false;
        }
        this.method3669();
        return true;
    }
    
    public void method3669() {
        if (!this.field3643.method7820() && !this.field3643.method7819()) {
            if (!this.field3643.method7818()) {
                this.method3673();
            }
            else {
                this.field3641.displayGuiScreen(new Class546(b -> {
                    if (b) {
                        try {
                            this.method3673();
                        }
                        catch (final Exception ex) {
                            Class620.method3616().error("Failure to open 'future world'", (Throwable)ex);
                            this.field3641.displayGuiScreen(new Class528(() -> this.field3641.displayGuiScreen(this.field3642), new Class2259("selectWorld.futureworld.error.title", new Object[0]), new Class2259("selectWorld.futureworld.error.text", new Object[0])));
                        }
                    }
                    else {
                        this.field3641.displayGuiScreen(this.field3642);
                    }
                }, new Class2259("selectWorld.versionQuestion", new Object[0]), new Class2259("selectWorld.versionWarning", new Object[] { this.field3643.method7816().getFormattedText() }), Class8822.method30773("selectWorld.versionJoinButton", new Object[0]), Class8822.method30773("gui.cancel", new Object[0])));
            }
        }
        else {
            Class2259 class2259 = new Class2259("selectWorld.backupQuestion", new Object[0]);
            Class2259 class2260 = new Class2259("selectWorld.backupWarning", new Object[] { this.field3643.method7816().getFormattedText(), Class9528.method35579().getName() });
            if (this.field3643.method7819()) {
                class2259 = new Class2259("selectWorld.backupQuestion.customized", new Object[0]);
                class2260 = new Class2259("selectWorld.backupWarning.customized", new Object[0]);
            }
            this.field3641.displayGuiScreen(new Class554(this.field3642, (b2, p1) -> {
                if (!(!b2)) {
                    Class532.method3066(this.field3641.method5243(), this.field3643.method7808());
                }
                this.method3673();
            }, class2259, class2260, false));
        }
    }
    
    public void method3670() {
        this.field3641.displayGuiScreen(new Class546(b -> {
            if (b) {
                this.field3641.displayGuiScreen(new Class731());
                this.field3641.method5243().method25796(this.field3643.method7808());
                this.field3648.method3608(() -> this.field3642.field3286.method3378(), true);
            }
            this.field3641.displayGuiScreen(this.field3642);
        }, new Class2259("selectWorld.deleteQuestion", new Object[0]), new Class2259("selectWorld.deleteWarning", new Object[] { this.field3643.method7809() }), Class8822.method30773("selectWorld.deleteButton", new Object[0]), Class8822.method30773("gui.cancel", new Object[0])));
    }
    
    public void method3671() {
        this.field3641.displayGuiScreen(new Class532(b -> {
            if (b) {
                this.field3648.method3608(() -> this.field3642.field3286.method3378(), true);
            }
            this.field3641.displayGuiScreen(this.field3642);
        }, this.field3643.method7808()));
    }
    
    public void method3672() {
        try {
            this.field3641.displayGuiScreen(new Class731());
            final Class539 class539 = new Class539(this.field3642);
            final WorldInfo method29394 = this.field3641.method5243().method25787(this.field3643.method7808(), null).method29394();
            if (method29394 != null) {
                class539.method3110(method29394);
                if (this.field3643.method7819()) {
                    this.field3641.displayGuiScreen(new Class546(b -> this.field3641.displayGuiScreen(b ? class539 : this.field3642), new Class2259("selectWorld.recreate.customized.title", new Object[0]), new Class2259("selectWorld.recreate.customized.text", new Object[0]), Class8822.method30773("gui.proceed", new Object[0]), Class8822.method30773("gui.cancel", new Object[0])));
                }
                else {
                    this.field3641.displayGuiScreen(class539);
                }
            }
        }
        catch (final Exception ex) {
            Class620.method3616().error("Unable to recreate world", (Throwable)ex);
            this.field3641.displayGuiScreen(new Class528(() -> this.field3641.displayGuiScreen(this.field3642), new Class2259("selectWorld.recreate.error.title", new Object[0]), new Class2259("selectWorld.recreate.error.text", new Object[0])));
        }
    }
    
    private void method3673() {
        this.field3641.method5299().method6422(Class6836.method20933(Class8520.field35662, 1.0f));
        if (this.field3641.method5243().method25798(this.field3643.method7808())) {
            this.field3641.method5262(this.field3643.method7808(), this.field3643.method7809(), null);
        }
    }
    
    @Nullable
    private Class1773 method3674() {
        if (this.field3645 != null && this.field3645.isFile()) {
            try (final FileInputStream fileInputStream = new FileInputStream(this.field3645)) {
                final Class1846 method6637 = Class1846.method6637(fileInputStream);
                Validate.validState(method6637.method6644() == 64, "Must be 64 pixels wide", new Object[0]);
                Validate.validState(method6637.method6645() == 64, "Must be 64 pixels high", new Object[0]);
                final Class1773 class1773 = new Class1773(method6637);
                this.field3641.method5290().method5851(this.field3644, class1773);
                return class1773;
            }
            catch (final Throwable t3) {
                Class620.method3616().error("Invalid icon for world {}", (Object)this.field3643.method7808(), (Object)t3);
                this.field3645 = null;
                return null;
            }
        }
        this.field3641.method5290().method5858(this.field3644);
        return null;
    }
    
    @Override
    public void close() {
        if (this.field3646 != null) {
            this.field3646.close();
        }
    }
}
