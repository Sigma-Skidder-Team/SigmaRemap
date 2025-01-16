// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

import com.google.common.collect.Lists;
import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class Class530 extends Screen
{
    private final Screen field3168;
    private final ITextComponent field3169;
    private final ITextComponent field3170;
    private final ITextComponent field3171;
    private final ITextComponent field3172;
    private final ITextComponent field3173;
    private Class682 field3174;
    private final List<String> field3175;
    
    public Class530(final Screen field3168) {
        super(NarratorChatListener.EMPTY);
        this.field3169 = new Class2259("multiplayerWarning.header", new Object[0]).applyTextStyle(TextFormatting.BOLD);
        this.field3170 = new Class2259("multiplayerWarning.message", new Object[0]);
        this.field3171 = new Class2259("multiplayerWarning.check", new Object[0]);
        this.field3172 = new Class2259("gui.proceed", new Object[0]);
        this.field3173 = new Class2259("gui.back", new Object[0]);
        this.field3175 = Lists.newArrayList();
        this.field3168 = field3168;
    }
    
    @Override
    public void init() {
        super.init();
        this.field3175.clear();
        this.field3175.addAll(this.font.method6626(this.field3170.getFormattedText(), this.width - 50));
        final int n = (this.field3175.size() + 1) * 9;
        this.addButton(new Class654(this.width / 2 - 155, 100 + n, 150, 20, this.field3172.getFormattedText(), class654 -> {
            if (this.field3174.method3743()) {
                this.minecraft.gameSettings.field23434 = true;
                this.minecraft.gameSettings.method17121();
            }
            this.minecraft.displayGuiScreen(new Class720(this.field3168));
        }));
        this.addButton(new Class654(this.width / 2 - 155 + 160, 100 + n, 150, 20, this.field3173.getFormattedText(), class654 -> this.minecraft.displayGuiScreen(this.field3168)));
        this.addButton(this.field3174 = new Class682(this.width / 2 - 155 + 80, 76 + n, 150, 20, this.field3171.getFormattedText(), false));
    }
    
    @Override
    public String getNarrationMessage() {
        return this.field3169.getString() + "\n" + this.field3170.getString();
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.renderDirtBackground(0);
        this.drawCenteredString(this.font, this.field3169.getFormattedText(), this.width / 2, 30, 16777215);
        int n4 = 70;
        final Iterator<String> iterator = this.field3175.iterator();
        while (iterator.hasNext()) {
            this.drawCenteredString(this.font, iterator.next(), this.width / 2, n4, 16777215);
            n4 += 9;
        }
        super.render(n, n2, n3);
    }
}
