// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextComponent;
import org.apache.commons.io.FileUtils;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.io.IOException;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class Class532 extends Class527
{
    private Class654 field3177;
    private final BooleanConsumer field3178;
    private Class576 field3179;
    private final String field3180;
    
    public Class532(final BooleanConsumer field3178, final String field3179) {
        super(new Class2259("selectWorld.edit.title", new Object[0]));
        this.field3178 = field3178;
        this.field3180 = field3179;
    }
    
    @Override
    public void method2992() {
        this.field3179.method3376();
    }
    
    @Override
    public void method2969() {
        this.field3150.field4651.method22505(true);
        final Class654 class654 = this.method3029(new Class654(this.field3152 / 2 - 100, this.field3153 / 4 + 24 + 5, 200, 20, Class8822.method30773("selectWorld.edit.resetIcon", new Object[0]), class654 -> {
            FileUtils.deleteQuietly(this.field3150.method5243().method25800(this.field3180, "icon.png"));
            class654.field3431 = false;
        }));
        this.method3029(new Class654(this.field3152 / 2 - 100, this.field3153 / 4 + 48 + 5, 200, 20, Class8822.method30773("selectWorld.edit.openFolder", new Object[0]), class654 -> Class8349.method27845().method978(this.field3150.method5243().method25800(this.field3180, "icon.png").getParentFile())));
        this.method3029(new Class654(this.field3152 / 2 - 100, this.field3153 / 4 + 72 + 5, 200, 20, Class8822.method30773("selectWorld.edit.backup", new Object[0]), class654 -> {
            method3066(this.field3150.method5243(), this.field3180);
            this.field3178.accept(false);
        }));
        this.method3029(new Class654(this.field3152 / 2 - 100, this.field3153 / 4 + 96 + 5, 200, 20, Class8822.method30773("selectWorld.edit.backupFolder", new Object[0]), class654 -> {
            final Path method25802 = this.field3150.method5243().method25802();
            try {
                Files.createDirectories(Files.exists(method25802, new LinkOption[0]) ? method25802.toRealPath(new LinkOption[0]) : method25802, (FileAttribute<?>[])new FileAttribute[0]);
            }
            catch (final IOException cause) {
                throw new RuntimeException(cause);
            }
            Class8349.method27845().method978(method25802.toFile());
        }));
        this.method3029(new Class654(this.field3152 / 2 - 100, this.field3153 / 4 + 120 + 5, 200, 20, Class8822.method30773("selectWorld.edit.optimize", new Object[0]), class654 -> this.field3150.method5244(new Class554(this, (b2, b4) -> {
            if (!(!b2)) {
                method3066(this.field3150.method5243(), this.field3180);
            }
            this.field3150.method5244(new Class736(this.field3178, this.field3180, this.field3150.method5243(), b4));
        }, new Class2259("optimizeWorld.confirm.title", new Object[0]), new Class2259("optimizeWorld.confirm.description", new Object[0]), true))));
        this.field3177 = this.method3029(new Class654(this.field3152 / 2 - 100, this.field3153 / 4 + 144 + 5, 98, 20, Class8822.method30773("selectWorld.edit.save", new Object[0]), class654 -> this.method3065()));
        this.method3029(new Class654(this.field3152 / 2 + 2, this.field3153 / 4 + 144 + 5, 98, 20, Class8822.method30773("gui.cancel", new Object[0]), class654 -> this.field3178.accept(false)));
        class654.field3431 = this.field3150.method5243().method25800(this.field3180, "icon.png").isFile();
        final Class8660 method25791 = this.field3150.method5243().method25791(this.field3180);
        (this.field3179 = new Class576(this.field3156, this.field3152 / 2 - 100, 53, 200, 20, Class8822.method30773("selectWorld.enterName", new Object[0]))).method3377((method25791 != null) ? method25791.method29549() : "");
        this.field3179.method3374(s -> this.field3177.field3431 = !s.trim().isEmpty());
        this.field3149.add(this.field3179);
        this.method3476(this.field3179);
    }
    
    @Override
    public void method2970(final Class869 class869, final int n, final int n2) {
        final String method3378 = this.field3179.method3378();
        this.method3038(class869, n, n2);
        this.field3179.method3377(method3378);
    }
    
    @Override
    public void method2971() {
        this.field3150.field4651.method22505(false);
    }
    
    private void method3065() {
        this.field3150.method5243().method25794(this.field3180, this.field3179.method3378().trim());
        this.field3178.accept(true);
    }
    
    public static void method3066(final Class7952 class7952, final String s) {
        final Class690 method5318 = Class869.method5277().method5318();
        long method5319 = 0L;
        Throwable t = null;
        try {
            method5319 = class7952.method25803(s);
        }
        catch (final IOException ex) {
            t = ex;
        }
        Class2259 class7953;
        TextComponent class7954;
        if (t != null) {
            class7953 = new Class2259("selectWorld.edit.backupFailed", new Object[0]);
            class7954 = new StringTextComponent(t.getMessage());
        }
        else {
            class7953 = new Class2259("selectWorld.edit.backupCreated", new Object[] { s });
            class7954 = new Class2259("selectWorld.edit.backupSize", new Object[] { MathHelper.method35650(method5319 / 1048576.0) });
        }
        method5318.method3852(new Class6865(Class2174.field12898, class7953, class7954));
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        this.method3295(this.field3156, this.field3148.getFormattedText(), this.field3152 / 2, 20, 16777215);
        this.method3297(this.field3156, Class8822.method30773("selectWorld.enterName", new Object[0]), this.field3152 / 2 - 100, 40, 10526880);
        this.field3179.method2975(n, n2, n3);
        super.method2975(n, n2, n3);
    }
}
