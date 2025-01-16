// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class541 extends Screen
{
    public Class576 field3264;
    public Class576 field3265;
    public Class654 field3266;
    public Class654 field3267;
    public Class654 field3268;
    public boolean field3269;
    private Class6823 field3270;
    
    public Class541() {
        super(NarratorChatListener.EMPTY);
    }
    
    @Override
    public void tick() {
        this.field3264.method3376();
    }
    
    public abstract Class865 method3157();
    
    public abstract int method3158();
    
    @Override
    public void init() {
        this.minecraft.field4651.method22505(true);
        this.field3266 = this.addButton(new Class654(this.width / 2 - 4 - 150, this.height / 4 + 120 + 12, 150, 20, Class8822.method30773("gui.done", new Object[0]), class654 -> this.method3160()));
        this.field3267 = this.addButton(new Class654(this.width / 2 + 4, this.height / 4 + 120 + 12, 150, 20, Class8822.method30773("gui.cancel", new Object[0]), class654 -> this.onClose()));
        this.field3268 = this.addButton(new Class654(this.width / 2 + 150 - 20, this.method3158(), 20, 20, "O", class654 -> {
            final Class865 method3157 = this.method3157();
            method3157.method5219(!method3157.method5220());
            this.method3159();
        }));
        (this.field3264 = new Class577(this, this.font, this.width / 2 - 150, 50, 300, 20, Class8822.method30773("advMode.command", new Object[0]))).method3397(32500);
        this.field3264.method3374(this::method3162);
        this.children.add(this.field3264);
        (this.field3265 = new Class576(this.font, this.width / 2 - 150, this.method3158(), 276, 20, Class8822.method30773("advMode.previousOutput", new Object[0]))).method3397(32500);
        this.field3265.method3405(false);
        this.field3265.method3377("-");
        this.children.add(this.field3265);
        this.setFocusedDefault(this.field3264);
        this.field3264.method3395(true);
        (this.field3270 = new Class6823(this.minecraft, this, this.field3264, this.font, true, true, 0, 7, false, Integer.MIN_VALUE)).method20885(true);
        this.field3270.method20890();
    }
    
    @Override
    public void method2970(final Minecraft class869, final int n, final int n2) {
        final String method3378 = this.field3264.method3378();
        this.init(class869, n, n2);
        this.field3264.method3377(method3378);
        this.field3270.method20890();
    }
    
    public void method3159() {
        if (!this.method3157().method5220()) {
            this.field3268.method3367("X");
            this.field3265.method3377("-");
        }
        else {
            this.field3268.method3367("O");
            this.field3265.method3377(this.method3157().method5208().getString());
        }
    }
    
    public void method3160() {
        final Class865 method3157 = this.method3157();
        this.method3161(method3157);
        if (!method3157.method5220()) {
            method3157.method5218(null);
        }
        this.minecraft.displayGuiScreen(null);
    }
    
    @Override
    public void removed() {
        this.minecraft.field4651.method22505(false);
    }
    
    public abstract void method3161(final Class865 p0);
    
    @Override
    public void onClose() {
        this.method3157().method5219(this.field3269);
        this.minecraft.displayGuiScreen(null);
    }
    
    private void method3162(final String s) {
        this.field3270.method20890();
    }
    
    @Override
    public boolean keyPressed(final int keyCode, final int n2, final int n3) {
        if (this.field3270.method20886(keyCode, n2, n3)) {
            return true;
        }
        if (super.keyPressed(keyCode, n2, n3)) {
            return true;
        }
        if (keyCode != 257 && keyCode != 335) {
            return false;
        }
        this.method3160();
        return true;
    }
    
    @Override
    public boolean mouseScrolled(final double n, final double n2, final double n3) {
        return this.field3270.method20887(n3) || super.mouseScrolled(n, n2, n3);
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        return this.field3270.method20888(n, n2, n3) || super.mouseClicked(n, n2, n3);
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.renderBackground();
        this.drawCenteredString(this.font, Class8822.method30773("advMode.setCommand", new Object[0]), this.width / 2, 20, 16777215);
        this.drawString(this.font, Class8822.method30773("advMode.command", new Object[0]), this.width / 2 - 150, 40, 10526880);
        this.field3264.render(n, n2, n3);
        final int n4 = 75;
        if (!this.field3265.method3378().isEmpty()) {
            this.drawString(this.font, Class8822.method30773("advMode.previousOutput", new Object[0]), this.width / 2 - 150, n4 + (46 + this.method3158() - 135) + 4, 10526880);
            this.field3265.render(n, n2, n3);
        }
        super.render(n, n2, n3);
        this.field3270.method20897(n, n2);
    }
}
