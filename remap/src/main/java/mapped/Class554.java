// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

import com.google.common.collect.Lists;
import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class Class554 extends Screen
{
    private final Screen field3325;
    public final Class3416 field3326;
    private final ITextComponent field3327;
    private final boolean field3328;
    private final List<String> field3329;
    private final String field3330;
    private final String field3331;
    private final String field3332;
    private final String field3333;
    private Class682 field3334;
    
    public Class554(final Screen field3325, final Class3416 field3326, final ITextComponent class2250, final ITextComponent field3327, final boolean field3328) {
        super(class2250);
        this.field3329 = Lists.newArrayList();
        this.field3325 = field3325;
        this.field3326 = field3326;
        this.field3327 = field3327;
        this.field3328 = field3328;
        this.field3330 = Class8822.method30773("selectWorld.backupEraseCache");
        this.field3331 = Class8822.method30773("selectWorld.backupJoinConfirmButton");
        this.field3332 = Class8822.method30773("selectWorld.backupJoinSkipButton");
        this.field3333 = Class8822.method30773("gui.cancel");
    }
    
    @Override
    public void init() {
        super.init();
        this.field3329.clear();
        this.field3329.addAll(this.font.method6626(this.field3327.getFormattedText(), this.width - 50));
        final int n = (this.field3329.size() + 1) * 9;
        this.addButton(new Class654(this.width / 2 - 155, 100 + n, 150, 20, this.field3331, class654 -> this.field3326.method10853(true, this.field3334.method3743())));
        this.addButton(new Class654(this.width / 2 - 155 + 160, 100 + n, 150, 20, this.field3332, class654 -> this.field3326.method10853(false, this.field3334.method3743())));
        this.addButton(new Class654(this.width / 2 - 155 + 80, 124 + n, 150, 20, this.field3333, class654 -> this.minecraft.displayGuiScreen(this.field3325)));
        this.field3334 = new Class682(this.width / 2 - 155 + 80, 76 + n, 150, 20, this.field3330, false);
        if (this.field3328) {
            this.addButton(this.field3334);
        }
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.renderBackground();
        this.drawCenteredString(this.font, this.title.getFormattedText(), this.width / 2, 50, 16777215);
        int n4 = 70;
        final Iterator<String> iterator = this.field3329.iterator();
        while (iterator.hasNext()) {
            this.drawCenteredString(this.font, iterator.next(), this.width / 2, n4, 16777215);
            n4 += 9;
        }
        super.render(n, n2, n3);
    }
    
    @Override
    public boolean shouldCloseOnEsc() {
        return false;
    }
    
    @Override
    public boolean keyPressed(final int keyCode, final int n2, final int n3) {
        if (keyCode != 256) {
            return super.keyPressed(keyCode, n2, n3);
        }
        this.minecraft.displayGuiScreen(this.field3325);
        return true;
    }
}
