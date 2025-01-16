// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.text.SimpleDateFormat;
import org.apache.logging.log4j.LogManager;
import java.util.Optional;
import java.util.Date;
import java.util.Locale;
import java.util.Collections;
import java.util.function.Supplier;
import java.util.List;
import java.text.DateFormat;
import org.apache.logging.log4j.Logger;

public class Class620 extends Class608<Class641>
{
    private static final Logger field3594;
    private static final DateFormat field3595;
    private static final ResourceLocation field3596;
    private static final ResourceLocation field3597;
    private final Class544 field3598;
    private List<Class1934> field3599;
    
    public Class620(final Class544 field3598, final Minecraft class869, final int n, final int n2, final int n3, final int n4, final int n5, final Supplier<String> supplier, final Class620 class870) {
        super(class869, n, n2, n3, n4, n5);
        this.field3598 = field3598;
        if (class870 != null) {
            this.field3599 = class870.field3599;
        }
        this.method3608(supplier, false);
    }
    
    public void method3608(final Supplier<String> supplier, final boolean b) {
        this.method3533();
        final Class7952 method5243 = this.field3540.method5243();
        Label_0092: {
            if (this.field3599 != null) {
                if (!b) {
                    break Label_0092;
                }
            }
            try {
                this.field3599 = method5243.method25785();
            }
            catch (final Class2323 class2323) {
                Class620.field3594.error("Couldn't load level list", (Throwable)class2323);
                this.field3540.displayGuiScreen(new Class728(new Class2259("selectWorld.unable_to_load", new Object[0]), class2323.getMessage()));
                return;
            }
            Collections.sort(this.field3599);
        }
        final String lowerCase = supplier.get().toLowerCase(Locale.ROOT);
        for (final Class1934 class2324 : this.field3599) {
            if (class2324.method7809().toLowerCase(Locale.ROOT).contains(lowerCase) || class2324.method7808().toLowerCase(Locale.ROOT).contains(lowerCase)) {
                this.method3536(new Class641(this, this, class2324, this.field3540.method5243()));
            }
        }
    }
    
    @Override
    public int method3555() {
        return super.method3555() + 20;
    }
    
    @Override
    public int method3529() {
        return super.method3529() + 50;
    }
    
    @Override
    public boolean method3561() {
        return this.field3598.getFocused() == this;
    }
    
    public void method3609(final Class641 class641) {
        super.method3531(class641);
        if (class641 != null) {
            final Class1934 method3684 = Class641.method3684(class641);
            NarratorChatListener.field32404.method25556(new Class2259("narrator.select", new Object[] { new Class2259("narrator.select.world", new Object[] { method3684.method7809(), new Date(method3684.method7812()), method3684.method7814() ? Class8822.method30773("gameMode.hardcore", new Object[0]) : Class8822.method30773("gameMode." + method3684.method7813().method586(), new Object[0]), method3684.method7815() ? Class8822.method30773("selectWorld.cheats", new Object[0]) : "", method3684.method7816() }) }).getString());
        }
    }
    
    @Override
    public void method3556(final int n) {
        super.method3556(n);
        this.field3598.method3173(true);
    }
    
    public Optional<Class641> method3610() {
        return Optional.ofNullable(this.method3530());
    }
    
    public Class544 method3611() {
        return this.field3598;
    }
    
    static {
        field3594 = LogManager.getLogger();
        field3595 = new SimpleDateFormat();
        field3596 = new ResourceLocation("textures/misc/unknown_server.png");
        field3597 = new ResourceLocation("textures/gui/world_selection.png");
    }
}
