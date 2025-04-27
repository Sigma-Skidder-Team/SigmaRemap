// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class CommandManager {
    public List<Class6693> field38411;
    public static final String field38412 = ".";
    public static final String field38413 = "§f[§6Sigma§f]§7";
    private boolean field38414;
    private static List<Runnable> field38415;

    public CommandManager() {
        this.field38411 = new ArrayList<Class6693>();
        this.field38414 = true;
    }

    public void method32666() {
        Client.getInstance().getEventBus().registerInstance(this);
        this.method32669(new Class6709());
        this.method32669(new Class6700());
        this.method32669(new Class6694());
        this.method32669(new Class6703());
        this.method32669(new Class6708());
        this.method32669(new Class6697());
        this.method32669(new Class6704());
        this.method32669(new Class6707());
        this.method32669(new Class6698());
        this.method32669(new Class6706());
        this.method32669(new Class6701());
        this.method32669(new Class6695());
        this.method32669(new Class6702());
        this.method32669(new Class6696());
        this.method32669(new Class6705());
        this.method32669(new Class6699());
        this.method32669(new Class6692());
    }

    public Class6693 method32667(final String s) {
        for (final Class6693 class6693 : this.field38411) {
            if (!class6693.method20347().equals(s)) {
                continue;
            }
            return class6693;
        }
        for (final Class6693 class6694 : this.field38411) {
            final String[] method20350 = class6694.method20350();
            for (int length = method20350.length, i = 0; i < length; ++i) {
                if (method20350[i].equals(s)) {
                    return class6694;
                }
            }
        }
        return null;
    }

    public List<Class6693> method32668() {
        return this.field38411;
    }

    private void method32669(final Class6693 class6693) {
        this.field38411.add(class6693);
    }

    public void method32670(final String str) {
        ColorUtils.method19106(this.method32671() + " Invalid command \"" + "." + str + "\"");
        ColorUtils.method19106(this.method32671() + " Use \"" + "." + "help\" for a list of commands.");
    }

    public String method32671() {
        if (!this.field38414) {
            String string = "";
            for (int i = 0; i < 8; ++i) {
                string += " ";
            }
            return string + "§7";
        }
        this.field38414 = false;
        return "§f[§6Sigma§f]§7";
    }

    public void method32672() {
        this.field38414 = true;
    }

    @EventListener
    private void method32673(final EventPlayerTick eventPlayerTick) {
        final Iterator<Runnable> iterator = CommandManager.field38415.iterator();
        while (iterator.hasNext()) {
            iterator.next().run();
        }
        CommandManager.field38415.clear();
    }

    public static void method32674(final Runnable runnable) {
        CommandManager.field38415.add(runnable);
    }

    @EventListener
    private void method32675(final Class5721 class5721) {
        if (Client.getInstance().getClientMode() == ClientMode.NOADDONS) {
            return;
        }
        if (class5721.method16990() instanceof Class4317) {
            final Class4317 class5722 = (Class4317) class5721.method16990();
            final String method12973 = class5722.method12973();
            if (method12973.startsWith(".") && method12973.substring(1).startsWith(".")) {
                class5722.field19346 = method12973.substring(1);
                return;
            }
            if (method12973.startsWith(".")) {
                class5721.setCancelled(true);
                this.method32672();
                final String[] split = method12973.substring(".".length()).split(" ");
                final Class6693 method12974 = this.method32667(split[0]);
                if (method12974 == null) {
                    this.method32670(split[0]);
                    return;
                }
                final ArrayList list = new ArrayList();
                for (int i = 1; i < split.length; ++i) {
                    list.add(new Class8025(split[i]));
                }
                ColorUtils.method19106(" ");
                try {
                    method12974.run(method12973, (Class8025[]) list.toArray(new Class8025[0]), str -> ColorUtils.method19106(this.method32671() + " " + str));
                } catch (final Class2332 class5723) {
                    if (class5723.field14074.length() > 0) {
                        ColorUtils.method19106(this.method32671() + " Error: " + class5723.field14074);
                    }
                    ColorUtils.method19106(this.method32671() + " Usage: " + "." + method12974.method20347() + " " + method12974.method20349());
                }
                ColorUtils.method19106(" ");
            }
        }
        if (class5721.method16990() instanceof Class4265 && ((Class4265) class5721.method16990()).method12802().startsWith(".")) {
            class5721.setCancelled(true);
        }
    }

    static {
        CommandManager.field38415 = new ArrayList<Runnable>();
    }
}
