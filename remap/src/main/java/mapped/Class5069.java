// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import org.apache.logging.log4j.Logger;

public class Class5069 extends Class5046
{
    private static final Logger field21730;
    private String field21731;
    private final Class5076 field21732;
    private final Class7437 field21733;
    private Class5060 field21734;
    private int field21735;
    private int field21736;
    private int field21737;
    private Class5611 field21738;
    private Class5611 field21739;
    private int field21740;
    private String field21741;
    private int field21742;
    private boolean field21743;
    private Class5066 field21744;
    
    public Class5069(final Class5076 field21732, final Class7437 field21733) {
        this.field21740 = -1;
        this.field21742 = -1;
        this.field21732 = field21732;
        this.field21733 = field21733;
    }
    
    @Override
    public void method15375() {
        super.method15375();
    }
    
    @Override
    public void method15369() {
        this.field21735 = this.method15421() / 2 - 160;
        this.field21736 = 150;
        this.field21737 = this.method15421() / 2 + 12;
        this.method15444(true);
        this.method15431(new Class5703(this, 1, this.field21737, Class7869.method25488(1), this.field21736 + 10, 20, Class5046.method15438("mco.configure.world.buttons.invite")));
        this.method15431(this.field21738 = new Class5664(this, 4, this.field21737, Class7869.method25488(7), this.field21736 + 10, 20, Class5046.method15438("mco.configure.world.invites.remove.tooltip")));
        this.method15431(this.field21739 = new Class5673(this, 5, this.field21737, Class7869.method25488(9), this.field21736 + 10, 20, Class5046.method15438("mco.configure.world.invites.ops.tooltip")));
        this.method15431(new Class5643(this, 0, this.field21737 + this.field21736 / 2 + 2, Class7869.method25488(12), this.field21736 / 2 + 10 - 2, 20, Class5046.method15438("gui.back")));
        (this.field21734 = new Class5060(this)).method15517(this.field21735);
        this.method15428(this.field21734);
        final Iterator<Class7427> iterator = this.field21733.field28682.iterator();
        while (iterator.hasNext()) {
            this.field21734.method15544(iterator.next());
        }
        this.method15428(this.field21744 = new Class5066(Class5046.method15438("mco.configure.world.players.title"), this.method15421() / 2, 17, 16777215));
        this.method15446();
        this.method15596();
    }
    
    private void method15596() {
        this.field21738.method16919(this.method15597(this.field21742));
        this.field21739.method16919(this.method15597(this.field21742));
    }
    
    private boolean method15597(final int n) {
        return n != -1;
    }
    
    @Override
    public void method15442() {
        this.method15444(false);
    }
    
    @Override
    public boolean method15376(final int n, final int n2, final int n3) {
        if (n != 256) {
            return super.method15376(n, n2, n3);
        }
        this.method15598();
        return true;
    }
    
    private void method15598() {
        if (!this.field21743) {
            Class7847.method25362(this.field21732);
        }
        else {
            Class7847.method25362(this.field21732.method15711());
        }
    }
    
    private void method15599(final int n) {
        this.method15596();
        final Class9513 method35444 = Class9513.method35444();
        final String method35445 = this.field21733.field28682.get(n).method22852();
        try {
            this.method15601(method35444.method35466(this.field21733.field28675, method35445));
        }
        catch (final Class2330 class2330) {
            Class5069.field21730.error("Couldn't op the user");
        }
    }
    
    private void method15600(final int n) {
        this.method15596();
        final Class9513 method35444 = Class9513.method35444();
        final String method35445 = this.field21733.field28682.get(n).method22852();
        try {
            this.method15601(method35444.method35467(this.field21733.field28675, method35445));
        }
        catch (final Class2330 class2330) {
            Class5069.field21730.error("Couldn't deop the user");
        }
    }
    
    private void method15601(final Class7434 class7434) {
        for (final Class7427 class7435 : this.field21733.field28682) {
            class7435.method22855(class7434.field28668.contains(class7435.method22850()));
        }
    }
    
    private void method15602(final int field21740) {
        this.method15596();
        if (field21740 >= 0) {
            if (field21740 < this.field21733.field28682.size()) {
                final Class7427 class7427 = this.field21733.field28682.get(field21740);
                this.field21741 = class7427.method22852();
                this.field21740 = field21740;
                Class7847.method25362(new Class5067(this, "Question", Class5046.method15438("mco.configure.world.uninvite.question") + " '" + class7427.method22850() + "' ?", 2));
            }
        }
    }
    
    @Override
    public void method15437(final boolean b, final int n) {
        if (n == 2) {
            if (b) {
                final Class9513 method35444 = Class9513.method35444();
                try {
                    method35444.method35456(this.field21733.field28675, this.field21741);
                }
                catch (final Class2330 class2330) {
                    Class5069.field21730.error("Couldn't uninvite user");
                }
                this.method15603(this.field21740);
                this.field21742 = -1;
                this.method15596();
            }
            this.field21743 = true;
            Class7847.method25362(this);
        }
    }
    
    private void method15603(final int n) {
        this.field21733.field28682.remove(n);
    }
    
    @Override
    public void method15383(final int n, final int n2, final float n3) {
        this.field21731 = null;
        this.method15413();
        if (this.field21734 != null) {
            this.field21734.method15510(n, n2, n3);
        }
        final int n4 = Class7869.method25488(12) + 20;
        final Class7710 field30674 = Class7710.field30674;
        Class5046.method15419("textures/gui/options_background.png");
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        field30674.method24611(7, Class7785.field31866);
        field30674.method24610(0.0, this.method15422(), 0.0).method24614(0.0f, (this.method15422() - n4) / 32.0f + 0.0f).method24613(64, 64, 64, 255).method24612();
        field30674.method24610(this.method15421(), this.method15422(), 0.0).method24614(this.method15421() / 32.0f, (this.method15422() - n4) / 32.0f + 0.0f).method24613(64, 64, 64, 255).method24612();
        field30674.method24610(this.method15421(), n4, 0.0).method24614(this.method15421() / 32.0f, 0.0f).method24613(64, 64, 64, 255).method24612();
        field30674.method24610(0.0, n4, 0.0).method24614(0.0f, 0.0f).method24613(64, 64, 64, 255).method24612();
        field30674.method24609();
        this.field21744.method15593(this);
        if (this.field21733 != null && this.field21733.field28682 != null) {
            this.method15407(Class5046.method15438("mco.configure.world.invited") + " (" + this.field21733.field28682.size() + ")", this.field21735, Class7869.method25488(0), 10526880);
        }
        else {
            this.method15407(Class5046.method15438("mco.configure.world.invited"), this.field21735, Class7869.method25488(0), 10526880);
        }
        super.method15383(n, n2, n3);
        if (this.field21733 != null) {
            if (this.field21731 != null) {
                this.method15604(this.field21731, n, n2);
            }
        }
    }
    
    public void method15604(final String s, final int n, final int n2) {
        if (s != null) {
            final int n3 = n + 12;
            final int n4 = n2 - 12;
            this.method15412(n3 - 3, n4 - 3, n3 + this.method15424(s) + 3, n4 + 8 + 3, -1073741824, -1073741824);
            this.method15425(s, n3, n4, 16777215);
        }
    }
    
    private void method15605(final int n, final int n2, final int n3, final int n4) {
        boolean b = false;
        Label_0076: {
            if (n3 >= n) {
                if (n3 <= n + 9) {
                    if (n4 >= n2) {
                        if (n4 <= n2 + 9) {
                            if (n4 < Class7869.method25488(12) + 20) {
                                if (n4 > Class7869.method25488(1)) {
                                    b = true;
                                    break Label_0076;
                                }
                            }
                        }
                    }
                }
            }
            b = false;
        }
        final boolean b2 = b;
        Class5046.method15419("realms:textures/gui/realms/cross_player_icon.png");
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        Class8726.method30059();
        Class5046.method15411(n, n2, 0.0f, b2 ? 7.0f : 0.0f, 8, 7, 8, 14);
        Class8726.method30060();
        if (b2) {
            this.field21731 = Class5046.method15438("mco.configure.world.invites.remove.tooltip");
        }
    }
    
    private void method15606(final int n, final int n2, final int n3, final int n4) {
        boolean b = false;
        Label_0076: {
            if (n3 >= n) {
                if (n3 <= n + 9) {
                    if (n4 >= n2) {
                        if (n4 <= n2 + 9) {
                            if (n4 < Class7869.method25488(12) + 20) {
                                if (n4 > Class7869.method25488(1)) {
                                    b = true;
                                    break Label_0076;
                                }
                            }
                        }
                    }
                }
            }
            b = false;
        }
        final boolean b2 = b;
        Class5046.method15419("realms:textures/gui/realms/op_icon.png");
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        Class8726.method30059();
        Class5046.method15411(n, n2, 0.0f, b2 ? 8.0f : 0.0f, 8, 8, 8, 16);
        Class8726.method30060();
        if (b2) {
            this.field21731 = Class5046.method15438("mco.configure.world.invites.ops.tooltip");
        }
    }
    
    private void method15607(final int n, final int n2, final int n3, final int n4) {
        boolean b = false;
        Label_0076: {
            if (n3 >= n) {
                if (n3 <= n + 9) {
                    if (n4 >= n2) {
                        if (n4 <= n2 + 9) {
                            if (n4 < Class7869.method25488(12) + 20) {
                                if (n4 > Class7869.method25488(1)) {
                                    b = true;
                                    break Label_0076;
                                }
                            }
                        }
                    }
                }
            }
            b = false;
        }
        final boolean b2 = b;
        Class5046.method15419("realms:textures/gui/realms/user_icon.png");
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        Class8726.method30059();
        Class5046.method15411(n, n2, 0.0f, b2 ? 8.0f : 0.0f, 8, 8, 8, 16);
        Class8726.method30060();
        if (b2) {
            this.field21731 = Class5046.method15438("mco.configure.world.invites.normal.tooltip");
        }
    }
    
    static {
        field21730 = LogManager.getLogger();
    }
}