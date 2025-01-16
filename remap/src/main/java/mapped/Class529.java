// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class Class529 extends Screen
{
    private Class654 field3163;
    private final Class9575 field3164;
    private Class576 field3165;
    private final BooleanConsumer field3166;
    private final Screen field3167;
    
    public Class529(final Screen field3167, final BooleanConsumer field3168, final Class9575 field3169) {
        super(new Class2259("selectServer.direct", new Object[0]));
        this.field3167 = field3167;
        this.field3164 = field3169;
        this.field3166 = field3168;
    }
    
    @Override
    public void tick() {
        this.field3165.method3376();
    }
    
    @Override
    public boolean keyPressed(final int n, final int n2, final int n3) {
        if (this.method3471() == this.field3165 && (n == 257 || n == 335)) {
            this.method3058();
            return true;
        }
        return super.keyPressed(n, n2, n3);
    }
    
    @Override
    public void init() {
        this.minecraft.field4651.method22505(true);
        this.field3163 = this.method3029(new Class654(this.width / 2 - 100, this.height / 4 + 96 + 12, 200, 20, Class8822.method30773("selectServer.select", new Object[0]), class654 -> this.method3058()));
        this.method3029(new Class654(this.width / 2 - 100, this.height / 4 + 120 + 12, 200, 20, Class8822.method30773("gui.cancel", new Object[0]), class654 -> this.field3166.accept(false)));
        (this.field3165 = new Class576(this.font, this.width / 2 - 100, 116, 200, 20, Class8822.method30773("addServer.enterIp", new Object[0]))).method3397(128);
        this.field3165.method3395(true);
        this.field3165.method3377(this.minecraft.field4648.field23469);
        this.field3165.method3374(p0 -> this.method3059());
        this.children.add(this.field3165);
        this.method3476(this.field3165);
        this.method3059();
    }
    
    @Override
    public void method2970(final Minecraft class869, final int n, final int n2) {
        final String method3378 = this.field3165.method3378();
        this.init(class869, n, n2);
        this.field3165.method3377(method3378);
    }
    
    private void method3058() {
        this.field3164.field41613 = this.field3165.method3378();
        this.field3166.accept(true);
    }
    
    @Override
    public void method3028() {
        this.minecraft.method5244(this.field3167);
    }
    
    @Override
    public void removed() {
        this.minecraft.field4651.method22505(false);
        this.minecraft.field4648.field23469 = this.field3165.method3378();
        this.minecraft.field4648.method17121();
    }
    
    private void method3059() {
        final String method3378 = this.field3165.method3378();
        final Class654 field3163 = this.field3163;
        boolean field3164 = false;
        Label_0053: {
            if (!method3378.isEmpty()) {
                if (method3378.split(":").length > 0) {
                    if (method3378.indexOf(32) == -1) {
                        field3164 = true;
                        break Label_0053;
                    }
                }
            }
            field3164 = false;
        }
        field3163.field3431 = field3164;
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.renderBackground();
        this.method3295(this.font, this.field3148.getFormattedText(), this.width / 2, 20, 16777215);
        this.method3297(this.font, Class8822.method30773("addServer.enterIp", new Object[0]), this.width / 2 - 100, 100, 10526880);
        this.field3165.method2975(n, n2, n3);
        super.method2975(n, n2, n3);
    }
}
