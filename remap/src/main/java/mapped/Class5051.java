// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Locale;
import java.util.Iterator;
import java.util.Map;
import com.google.common.collect.Lists;
import java.util.List;

public class Class5051 extends RealmsScreen
{
    private final RealmsScreen field21693;
    private final int field21694 = 0;
    private final Backup field21695;
    private final List<String> field21696;
    private Class5055 field21697;
    public String[] field21698;
    public String[] field21699;
    
    public Class5051(final RealmsScreen field21693, final Backup field21694) {
        this.field21696 = Lists.newArrayList();
        this.field21698 = new String[] { RealmsScreen.getLocalizedString("options.difficulty.peaceful"), RealmsScreen.getLocalizedString("options.difficulty.easy"), RealmsScreen.getLocalizedString("options.difficulty.normal"), RealmsScreen.getLocalizedString("options.difficulty.hard") };
        this.field21699 = new String[] { RealmsScreen.getLocalizedString("selectWorld.gameMode.survival"), RealmsScreen.getLocalizedString("selectWorld.gameMode.creative"), RealmsScreen.getLocalizedString("selectWorld.gameMode.adventure") };
        this.field21693 = field21693;
        this.field21695 = field21694;
        if (field21694.changeList != null) {
            final Iterator<Map.Entry<String, String>> iterator = field21694.changeList.entrySet().iterator();
            while (iterator.hasNext()) {
                this.field21696.add(((Map.Entry<String, V>)iterator.next()).getKey());
            }
        }
    }
    
    @Override
    public void tick() {
    }
    
    @Override
    public void init() {
        this.method15444(true);
        this.buttonsAdd(new Class5627(this, 0, this.width() / 2 - 100, this.height() / 4 + 120 + 24, RealmsScreen.getLocalizedString("gui.back")));
        this.method15428(this.field21697 = new Class5055(this));
        this.method15434(this.field21697);
    }
    
    @Override
    public void method15442() {
        this.method15444(false);
    }
    
    @Override
    public boolean keyPressed(final int n, final int n2, final int n3) {
        if (n != 256) {
            return super.keyPressed(n, n2, n3);
        }
        Realms.setScreen(this.field21693);
        return true;
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.method15413();
        this.drawCenteredString("Changes from last backup", this.width() / 2, 10, 16777215);
        this.field21697.method15497(n, n2, n3);
        super.render(n, n2, n3);
    }
    
    private String method15483(final String s, final String s2) {
        final String lowerCase = s.toLowerCase(Locale.ROOT);
        if (lowerCase.contains("game") && lowerCase.contains("mode")) {
            return this.method15485(s2);
        }
        return (lowerCase.contains("game") && lowerCase.contains("difficulty")) ? this.method15484(s2) : s2;
    }
    
    private String method15484(final String s) {
        try {
            return this.field21698[Integer.parseInt(s)];
        }
        catch (final Exception ex) {
            return "UNKNOWN";
        }
    }
    
    private String method15485(final String s) {
        try {
            return this.field21699[Integer.parseInt(s)];
        }
        catch (final Exception ex) {
            return "UNKNOWN";
        }
    }
}
