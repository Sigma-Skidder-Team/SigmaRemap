// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import com.mentalfrostbyte.jello.commands.CommandException;

public class Class6697 extends Class6693
{
    public Class6697() {
        super("peek", "Preview a shulker content without opening it", new String[] { "shulker" });
    }
    
    @Override
    public void run(final String s, final Class8025[] array, final Class6428 class6428) throws CommandException {
        if (array.length != 0) {
            throw new Class2332();
        }
        final Class8321 method2345 = Class6697.field26420.field4684.field3006.method2345();
        if (method2345.method27622() instanceof Class4036 && ((Class4036)method2345.method27622()).method12240() instanceof Class3841) {
            method20353(method2345);
            class6428.method19104("Now peeking shulker");
            return;
        }
        throw new Class2332("You must hold the shulker you want to peek into first");
    }
    
    public static void method20353(final Class8321 class8321) {
        Class51 method333 = new Class51();
        if (class8321.method27657() != null) {
            method333 = class8321.method27657().method333();
        }
        final Class2265<Class8321> class8324 = Class2265.method8507(27, new Class8321(Class7739.field30754));
        if (method333 != null) {
            if (method333.method315("BlockEntityTag")) {
                final Class51 method335 = method333.method327("BlockEntityTag");
                method20354(method335);
                if (method335.method315("Items")) {
                    Class8508.method28426(method335, class8324);
                }
            }
        }
        Class9070.method32674(() -> {
            final Class2265<Class8321> class8324;
            final Object o = new Class443((Class8321[])class8324.toArray((Object[])new Class8321[0]));
            final Class869 field26420 = Class6697.field26420;
            new Class745(new Class3435(-1, Class6697.field26420.field4684.field3006, class8322), Class6697.field26420.field4684.field3006, class8323.method27664());
            final Class745 class8325;
            field26420.method5244(class8325);
        });
    }
    
    public static void method20354(final Class51 class51) {
        if (class51.method315("Items")) {
            final Class52 method328 = class51.method328("Items", 10);
            for (int i = 0; i < method328.size(); ++i) {
                final Class51 method329 = method328.method346(i).method327("tag");
                if (method329.method315("ench")) {
                    final Class52 method330 = method329.method328("ench", 10);
                    final Class52 class52 = new Class52();
                    for (int j = 0; j < method330.size(); ++j) {
                        final Class51 method331 = method330.method346(j);
                        final short method332 = method331.method318("lvl");
                        final short method333 = method331.method318("id");
                        if (Class9526.field41009 != null) {
                            final String s = (String)Class9526.field41009.get((Object)method333);
                            final Class51 e = new Class51();
                            e.method297("lvl", method332);
                            e.method306("id", s);
                            ((AbstractList<Class51>)class52).add(e);
                        }
                    }
                    method329.method295("Enchantments", class52);
                }
            }
        }
    }
}
