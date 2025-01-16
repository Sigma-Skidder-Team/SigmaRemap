// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import com.mentalfrostbyte.jello.commands.CommandException;
import net.minecraft.item.ItemStack;

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
        final ItemStack method2345 = Class6697.field26420.field4684.field3006.method2345();
        if (method2345.getItem() instanceof Class4036 && ((Class4036)method2345.getItem()).method12240() instanceof Class3841) {
            method20353(method2345);
            class6428.method19104("Now peeking shulker");
            return;
        }
        throw new Class2332("You must hold the shulker you want to peek into first");
    }
    
    public static void method20353(final ItemStack class8321) {
        CompoundNBT method333 = new CompoundNBT();
        if (class8321.method27657() != null) {
            method333 = class8321.method27657().copy();
        }
        final Class2265<ItemStack> class8324 = Class2265.method8507(27, new ItemStack(Items.AIR));
        if (method333 != null) {
            if (method333.contains("BlockEntityTag")) {
                final CompoundNBT method335 = method333.getCompound("BlockEntityTag");
                method20354(method335);
                if (method335.contains("Items")) {
                    Class8508.method28426(method335, class8324);
                }
            }
        }
        Class9070.method32674(() -> {
            final Class2265<ItemStack> class8324;
            final Object o = new Class443((ItemStack[])class8324.toArray((Object[])new ItemStack[0]));
            final Minecraft field26420 = Class6697.field26420;
            new Class745(new Class3435(-1, Class6697.field26420.field4684.field3006, class8322), Class6697.field26420.field4684.field3006, class8323.method27664());
            final Class745 class8325;
            field26420.method5244(class8325);
        });
    }
    
    public static void method20354(final CompoundNBT class51) {
        if (class51.contains("Items")) {
            final ListNBT method328 = class51.getList("Items", 10);
            for (int i = 0; i < method328.size(); ++i) {
                final CompoundNBT method329 = method328.method346(i).getCompound("tag");
                if (method329.contains("ench")) {
                    final ListNBT method330 = method329.getList("ench", 10);
                    final ListNBT class52 = new ListNBT();
                    for (int j = 0; j < method330.size(); ++j) {
                        final CompoundNBT method331 = method330.method346(j);
                        final short method332 = method331.getShort("lvl");
                        final short method333 = method331.getShort("id");
                        if (Class9526.field41009 != null) {
                            final String s = (String)Class9526.field41009.get((Object)method333);
                            final CompoundNBT e = new CompoundNBT();
                            e.putShort("lvl", method332);
                            e.putString("id", s);
                            ((AbstractList<CompoundNBT>)class52).add(e);
                        }
                    }
                    method329.put("Enchantments", class52);
                }
            }
        }
    }
}
