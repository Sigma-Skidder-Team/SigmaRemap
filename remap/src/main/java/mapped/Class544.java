// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import com.google.common.base.Splitter;

public class Class544 extends Screen
{
    public final Screen field3280;
    private String field3281;
    private Class654 field3282;
    private Class654 field3283;
    private Class654 field3284;
    private Class654 field3285;
    public Class576 field3286;
    private Class620 field3287;
    
    public Class544(final Screen field3280) {
        super(new Class2259("selectWorld.title", new Object[0]));
        this.field3280 = field3280;
    }
    
    @Override
    public boolean mouseScrolled(final double n, final double n2, final double n3) {
        return super.mouseScrolled(n, n2, n3);
    }
    
    @Override
    public void tick() {
        this.field3286.method3376();
    }
    
    @Override
    public void init() {
        this.minecraft.field4651.method22505(true);
        (this.field3286 = new Class576(this.font, this.width / 2 - 100, 22, 200, 20, this.field3286, Class8822.method30773("selectWorld.search", new Object[0]))).method3374(p0 -> this.field3287.method3608(() -> s, false));
        this.field3287 = new Class620(this, this.minecraft, this.width, this.height, 48, this.height - 64, 36, () -> this.field3286.method3378(), this.field3287);
        this.children.add(this.field3286);
        this.children.add(this.field3287);
        this.field3283 = this.addButton(new Class654(this.width / 2 - 154, this.height - 52, 150, 20, Class8822.method30773("selectWorld.select", new Object[0]), class654 -> this.field3287.method3610().ifPresent(Class641::method3669)));
        this.addButton(new Class654(this.width / 2 + 4, this.height - 52, 150, 20, Class8822.method30773("selectWorld.create", new Object[0]), class654 -> this.minecraft.displayGuiScreen(new Class539(this))));
        this.field3284 = this.addButton(new Class654(this.width / 2 - 154, this.height - 28, 72, 20, Class8822.method30773("selectWorld.edit", new Object[0]), class654 -> this.field3287.method3610().ifPresent(Class641::method3671)));
        this.field3282 = this.addButton(new Class654(this.width / 2 - 76, this.height - 28, 72, 20, Class8822.method30773("selectWorld.delete", new Object[0]), class654 -> this.field3287.method3610().ifPresent(Class641::method3670)));
        this.field3285 = this.addButton(new Class654(this.width / 2 + 4, this.height - 28, 72, 20, Class8822.method30773("selectWorld.recreate", new Object[0]), class654 -> this.field3287.method3610().ifPresent(Class641::method3672)));
        this.addButton(new Class654(this.width / 2 + 82, this.height - 28, 72, 20, Class8822.method30773("gui.cancel", new Object[0]), class654 -> this.minecraft.displayGuiScreen(this.field3280)));
        this.method3173(false);
        this.setFocusedDefault(this.field3286);
    }
    
    @Override
    public boolean keyPressed(final int keyCode, final int n2, final int n3) {
        return super.keyPressed(keyCode, n2, n3) || this.field3286.keyPressed(keyCode, n2, n3);
    }
    
    @Override
    public void onClose() {
        this.minecraft.displayGuiScreen(this.field3280);
    }
    
    @Override
    public boolean charTyped(final char c, final int n) {
        return this.field3286.charTyped(c, n);
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.field3281 = null;
        this.field3287.render(n, n2, n3);
        this.field3286.render(n, n2, n3);
        this.drawCenteredString(this.font, this.title.getFormattedText(), this.width / 2, 8, 16777215);
        super.render(n, n2, n3);
        if (this.field3281 != null) {
            this.renderTooltip(Lists.newArrayList(Splitter.on("\n").split((CharSequence)this.field3281)), n, n2);
        }
    }
    
    public void method3172(final String field3281) {
        this.field3281 = field3281;
    }
    
    public void method3173(final boolean b) {
        this.field3283.field3431 = b;
        this.field3282.field3431 = b;
        this.field3284.field3431 = b;
        this.field3285.field3431 = b;
    }
    
    @Override
    public void removed() {
        if (this.field3287 != null) {
            this.field3287.children().forEach(Class641::close);
        }
    }
}
