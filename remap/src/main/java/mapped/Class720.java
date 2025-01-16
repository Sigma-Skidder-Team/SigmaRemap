// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import com.google.common.collect.Lists;
import com.google.common.base.Splitter;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class Class720 extends Screen
{
    private static final Logger field3146;
    private final Class8115 field3930;
    public final Screen field3931;
    public Class612 field3932;
    private Class9295 field3933;
    private Class654 field3934;
    private Class654 field3935;
    private Class654 field3936;
    private String field3937;
    private Class9575 field3938;
    private Class8027 field3939;
    private Class929 field3940;
    private boolean field3941;
    
    public Class720(final Screen field3931) {
        super(new Class2259("multiplayer.title", new Object[0]));
        this.field3930 = new Class8115();
        this.field3931 = field3931;
    }
    
    @Override
    public void init() {
        super.init();
        this.minecraft.field4651.method22505(true);
        if (this.field3941) {
            this.field3932.method3540(this.width, this.height, 32, this.height - 64);
        }
        else {
            this.field3941 = true;
            (this.field3933 = new Class9295(this.minecraft)).method34331();
            this.field3939 = new Class8027();
            try {
                (this.field3940 = new Class929(this.field3939)).start();
            }
            catch (final Exception ex) {
                Class720.field3146.warn("Unable to start LAN server detection: {}", (Object)ex.getMessage());
            }
            (this.field3932 = new Class612(this, this.minecraft, this.width, this.height, 32, this.height - 64, 36)).method3576(this.field3933);
        }
        this.children.add(this.field3932);
        this.field3935 = this.method3029(new Class654(this.width / 2 - 154, this.height - 52, 100, 20, Class8822.method30773("selectServer.select", new Object[0]), class654 -> this.method3948()));
        this.method3029(new Class654(this.width / 2 - 50, this.height - 52, 100, 20, Class8822.method30773("selectServer.direct", new Object[0]), class654 -> {
            this.field3938 = new Class9575(Class8822.method30773("selectServer.defaultName", new Object[0]), "", false);
            this.minecraft.method5244(new Class529(this, this::method3947, this.field3938));
        }));
        this.method3029(new Class654(this.width / 2 + 4 + 50, this.height - 52, 100, 20, Class8822.method30773("selectServer.add", new Object[0]), class654 -> {
            this.field3938 = new Class9575(Class8822.method30773("selectServer.defaultName", new Object[0]), "", false);
            this.minecraft.method5244(new Class538(this, this::method3946, this.field3938));
        }));
        this.field3934 = this.method3029(new Class654(this.width / 2 - 154, this.height - 28, 70, 20, Class8822.method30773("selectServer.edit", new Object[0]), class654 -> {
            final Class633 class655 = this.field3932.method3530();
            if (class655 instanceof Class634) {
                final Class9575 method3658 = ((Class634)class655).method3658();
                (this.field3938 = new Class9575(method3658.field41612, method3658.field41613, false)).method35872(method3658);
                this.minecraft.method5244(new Class538(this, this::method3945, this.field3938));
            }
        }));
        this.field3936 = this.method3029(new Class654(this.width / 2 - 74, this.height - 28, 70, 20, Class8822.method30773("selectServer.delete", new Object[0]), class654 -> {
            final Class633 class655 = this.field3932.method3530();
            if (class655 instanceof Class634) {
                final String field41612 = ((Class634)class655).method3658().field41612;
                if (field41612 != null) {
                    this.minecraft.method5244(new Class546(this::method3944, new Class2259("selectServer.deleteQuestion", new Object[0]), new Class2259("selectServer.deleteWarning", new Object[] { field41612 }), Class8822.method30773("selectServer.deleteButton", new Object[0]), Class8822.method30773("gui.cancel", new Object[0])));
                }
            }
        }));
        this.method3029(new Class654(this.width / 2 + 4, this.height - 28, 70, 20, Class8822.method30773("selectServer.refresh", new Object[0]), class654 -> this.method3943()));
        this.method3029(new Class654(this.width / 2 + 4 + 76, this.height - 28, 75, 20, Class8822.method30773("gui.cancel", new Object[0]), class654 -> this.minecraft.method5244(this.field3931)));
        this.method3951();
    }
    
    @Override
    public void tick() {
        super.tick();
        if (this.field3939.method26315()) {
            final List<Class9506> method26317 = this.field3939.method26317();
            this.field3939.method26316();
            this.field3932.method3577(method26317);
        }
        this.field3930.method26696();
    }
    
    @Override
    public void removed() {
        this.minecraft.field4651.method22505(false);
        if (this.field3940 != null) {
            this.field3940.interrupt();
            this.field3940 = null;
        }
        this.field3930.method26697();
    }
    
    private void method3943() {
        this.minecraft.method5244(new Class720(this.field3931));
    }
    
    private void method3944(final boolean b) {
        final Class633 class633 = this.field3932.method3530();
        if (b) {
            if (class633 instanceof Class634) {
                this.field3933.method34334(((Class634)class633).method3658());
                this.field3933.method34332();
                this.field3932.method3575(null);
                this.field3932.method3576(this.field3933);
            }
        }
        this.minecraft.method5244(this);
    }
    
    private void method3945(final boolean b) {
        final Class633 class633 = this.field3932.method3530();
        if (b) {
            if (class633 instanceof Class634) {
                final Class9575 method3658 = ((Class634)class633).method3658();
                method3658.field41612 = this.field3938.field41612;
                method3658.field41613 = this.field3938.field41613;
                method3658.method35872(this.field3938);
                this.field3933.method34332();
                this.field3932.method3576(this.field3933);
            }
        }
        this.minecraft.method5244(this);
    }
    
    private void method3946(final boolean b) {
        if (b) {
            this.field3933.method34335(this.field3938);
            this.field3933.method34332();
            this.field3932.method3575(null);
            this.field3932.method3576(this.field3933);
        }
        this.minecraft.method5244(this);
    }
    
    private void method3947(final boolean b) {
        if (!b) {
            this.minecraft.method5244(this);
        }
        else {
            this.method3949(this.field3938);
        }
    }
    
    @Override
    public boolean keyPressed(final int n, final int n2, final int n3) {
        if (super.keyPressed(n, n2, n3)) {
            return true;
        }
        if (n == 294) {
            this.method3943();
            return true;
        }
        if (this.field3932.method3530() == null) {
            return false;
        }
        if (n != 257 && n != 335) {
            return this.field3932.keyPressed(n, n2, n3);
        }
        this.method3948();
        return true;
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.field3937 = null;
        this.renderBackground();
        this.field3932.method2975(n, n2, n3);
        this.method3295(this.font, this.field3148.getFormattedText(), this.width / 2, 20, 16777215);
        super.method2975(n, n2, n3);
        if (this.field3937 != null) {
            this.method3032(Lists.newArrayList(Splitter.on("\n").split((CharSequence)this.field3937)), n, n2);
        }
    }
    
    public void method3948() {
        final Class633 class633 = this.field3932.method3530();
        if (!(class633 instanceof Class634)) {
            if (class633 instanceof Class635) {
                final Class9506 method3661 = ((Class635)class633).method3661();
                this.method3949(new Class9575(method3661.method35414(), method3661.method35415(), true));
            }
        }
        else {
            this.method3949(((Class634)class633).method3658());
        }
    }
    
    private void method3949(final Class9575 class9575) {
        if (class9575.field41613 != null) {
            if (class9575.field41613.contains("hypixel.net")) {
                Class9367.field40167 = Class9367.field40168;
            }
        }
        Class6430.method19176(class9575);
        this.minecraft.method5244(new Class694(this, this.minecraft, class9575));
    }
    
    public void method3950(final Class633 class633) {
        this.field3932.method3575(class633);
        this.method3951();
    }
    
    public void method3951() {
        this.field3935.field3431 = false;
        this.field3934.field3431 = false;
        this.field3936.field3431 = false;
        final Class633 class633 = this.field3932.method3530();
        if (class633 != null) {
            if (!(class633 instanceof Class636)) {
                this.field3935.field3431 = true;
                if (class633 instanceof Class634) {
                    this.field3934.field3431 = true;
                    this.field3936.field3431 = true;
                }
            }
        }
    }
    
    public Class8115 method3952() {
        return this.field3930;
    }
    
    public void method3953(final String field3937) {
        this.field3937 = field3937;
    }
    
    public Class9295 method3954() {
        return this.field3933;
    }
    
    static {
        field3146 = LogManager.getLogger();
    }
}
