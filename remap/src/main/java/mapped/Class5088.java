// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.Date;
import java.util.Iterator;
import java.util.Collections;
import com.google.common.collect.Lists;
import java.text.SimpleDateFormat;
import java.util.List;
import java.text.DateFormat;
import org.apache.logging.log4j.Logger;

public class Class5088 extends RealmsScreen
{
    private static final Logger field21979;
    private final Class5078 field21980;
    private final long field21981;
    private final int field21982;
    private Class5611 field21983;
    private final DateFormat field21984;
    private List<Class1951> field21985;
    private final int field21986;
    private Class5058 field21987;
    private String field21988;
    private String field21989;
    private final String[] field21990;
    private Class5066 field21991;
    private Class5066 field21992;
    private Class5066 field21993;
    
    public Class5088(final long field21981, final int field21982, final Class5078 field21983) {
        this.field21984 = new SimpleDateFormat();
        this.field21985 = Lists.newArrayList();
        this.field21986 = -1;
        this.field21990 = new String[4];
        this.field21980 = field21983;
        this.field21981 = field21981;
        this.field21982 = field21982;
    }
    
    private void method15946() throws Exception {
        Collections.sort(this.field21985 = this.method15441().method22830());
        final Iterator<Class1951> iterator = this.field21985.iterator();
        while (iterator.hasNext()) {
            this.field21987.method15541(iterator.next());
        }
    }
    
    @Override
    public void init() {
        this.method15444(true);
        this.field21987 = new Class5058(this);
        try {
            this.method15946();
        }
        catch (final Exception ex) {
            Class5088.field21979.error("Couldn't load level list", ex);
            Realms.setScreen(new RealmsGenericErrorScreen("Unable to load worlds", ex.getMessage(), this.field21980));
            return;
        }
        this.field21988 = RealmsScreen.getLocalizedString("selectWorld.world");
        this.field21989 = RealmsScreen.getLocalizedString("selectWorld.conversion");
        this.field21990[Realms.method25365()] = RealmsScreen.getLocalizedString("gameMode.survival");
        this.field21990[Realms.method25366()] = RealmsScreen.getLocalizedString("gameMode.creative");
        this.field21990[Realms.method25367()] = RealmsScreen.getLocalizedString("gameMode.adventure");
        this.field21990[Realms.method25368()] = RealmsScreen.getLocalizedString("gameMode.spectator");
        this.method15428(this.field21987);
        this.buttonsAdd(new Class5616(this, 1, this.width() / 2 + 6, this.height() - 32, 153, 20, RealmsScreen.getLocalizedString("gui.back")));
        this.buttonsAdd(this.field21983 = new Class5628(this, 2, this.width() / 2 - 154, this.height() - 32, 153, 20, RealmsScreen.getLocalizedString("mco.upload.button.name")));
        this.field21983.method16917(this.field21986 >= 0 && this.field21986 < this.field21985.size());
        this.method15428(this.field21991 = new Class5066(RealmsScreen.getLocalizedString("mco.upload.select.world.title"), this.width() / 2, 13, 16777215));
        this.method15428(this.field21992 = new Class5066(RealmsScreen.getLocalizedString("mco.upload.select.world.subtitle"), this.width() / 2, Class7869.method25488(-1), 10526880));
        if (this.field21985.isEmpty()) {
            this.method15428(this.field21993 = new Class5066(RealmsScreen.getLocalizedString("mco.upload.select.world.none"), this.width() / 2, this.height() / 2 - 20, 16777215));
        }
        else {
            this.field21993 = null;
        }
        this.method15446();
    }
    
    @Override
    public void method15442() {
        this.method15444(false);
    }
    
    private void method15947() {
        if (this.field21986 != -1) {
            if (!this.field21985.get(this.field21986).method7935()) {
                Realms.setScreen(new Class5086(this.field21981, this.field21982, this.field21980, this.field21985.get(this.field21986)));
            }
        }
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.method15413();
        this.field21987.method15510(n, n2, n3);
        this.field21991.method15593(this);
        this.field21992.method15593(this);
        if (this.field21993 != null) {
            this.field21993.method15593(this);
        }
        super.render(n, n2, n3);
    }
    
    @Override
    public boolean keyPressed(final int n, final int n2, final int n3) {
        if (n != 256) {
            return super.keyPressed(n, n2, n3);
        }
        Realms.setScreen(this.field21980);
        return true;
    }
    
    @Override
    public void tick() {
        super.tick();
    }
    
    private String method15948(final Class1951 class1951) {
        return this.field21990[class1951.method7932()];
    }
    
    private String method15949(final Class1951 class1951) {
        return this.field21984.format(new Date(class1951.method7938()));
    }
    
    static {
        field21979 = LogManager.getLogger();
    }
}
