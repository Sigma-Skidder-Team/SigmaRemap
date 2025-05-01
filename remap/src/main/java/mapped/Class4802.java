// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientFonts;

import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;

public class Class4802 extends Class4800
{
    public Animation field20472;
    public ArrayList<String> field20473;
    
    public Class4802() {
        super(Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[0]);
        this.field20472 = new Animation(300, 300);
        this.field20473 = new ArrayList<String>();
        this.setListening(false);
        this.field20473.add(Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[1]);
        this.field20473.add(Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[2]);
        final ArrayList list = new ArrayList();
        list.add(Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[3]);
        list.add(Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[4]);
        list.add(Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[5]);
        Collections.shuffle(list);
        this.field20473.addAll(list);
        this.field20473.add(Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[2]);
        this.field20473.add(Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[2]);
        this.field20473.add(Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[6]);
        this.field20473.add(Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[7]);
        this.field20473.add(Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[2]);
        this.field20473.add(Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[2]);
        this.field20473.add(Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[8].toUpperCase());
        this.field20473.add(Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[2]);
        this.field20473.add(Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[2]);
        this.field20473.add(Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[9]);
        this.field20473.add(Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[10]);
        this.field20473.add(Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[11]);
        this.field20473.add(Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[12]);
        this.field20473.add(Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[13]);
        this.field20473.add(Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[14]);
        this.field20473.add(Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[15]);
        this.field20473.add(Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[16]);
        this.field20473.add(Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[16]);
        this.field20473.add(Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[17]);
        this.field20473.add(Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[16]);
        this.field20473.add(Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[16]);
        final ScrollablePane scrollablePane;
        this.addToList(scrollablePane = new ScrollablePane(this, Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[18], 0, 100, this.field20480, this.field20481 - 100));
        int i = 0;
        final int n = 20;
        final Iterator<String> iterator = this.field20473.iterator();
        while (iterator.hasNext()) {
            for (final String s : iterator.next().split(Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[19])) {
                scrollablePane.addToList(new Class4834(scrollablePane, Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[20] + i, 40, 40 + n * i++, 0, 0, ColorHelper.field25964, s, s.startsWith(Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[21]) ? ClientFonts.JelloMedium20 : ClientFonts.JelloLight20));
            }
        }
    }
    
    @Override
    public void draw(final float partialTicks) {
        RenderUtil.method26874(0.0f, 0.0f, (float)this.field20480, (float)this.field20481, AllUtils.applyAlpha(ClientColors.DEEP_TEAL.color, this.field20472.calcPercent() * 0.95f));
        RenderUtil.drawString(ClientFonts.JelloMedium40, 40.0f, 40.0f, Class4802.\u5a21\u3fd9\u4989\u4c39\u156e[22], ClientColors.LIGHT_GREYISH_BLUE.color);
        super.draw(this.field20472.calcPercent());
    }
    
    @Override
    public void onKeyPress(final int key) {
        super.onKeyPress(key);
        if (key == 256) {
            Minecraft.getInstance().displayGuiScreen(new Class555());
        }
    }
}
