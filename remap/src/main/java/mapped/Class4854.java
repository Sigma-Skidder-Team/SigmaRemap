// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientFonts;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Class4854 extends Panel
{
    private final List<String> field20797;
    private Class4817 field20798;
    private final TextField field20799;
    private final boolean field20800;
    
    public Class4854(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final boolean field20800, final String... array) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.field20797 = new ArrayList<String>();
        this.field20800 = field20800;
        this.addToList(this.field20799 = new TextField(this, "textbox", 0, 0, n3, 32, TextField.field20670, "", "Search...", ClientFonts.JelloLight14));
        this.field20799.setFont(ClientFonts.JelloLight18);
        this.field20799.method14473(class4831 -> this.method14560(this.field20799.getTypedText()));
        this.method14562(array);
        this.method14560("");
    }
    
    public void method14560(final String s) {
        this.runThisOnDimensionUpdate(() -> {
            if (this.field20798 != null) {
                this.method14245(this.field20798);
            }
            final Class4817 field20798 = new Class4817(this, "scrollview", 0, 40, this.field20480, this.field20481 - 40);
            this.addToList(this.field20798 = field20798);
            final ArrayList list = new ArrayList();
            Registry.field211.iterator();
            final Iterator iterator;
            while (iterator.hasNext()) {
                list.add(iterator.next());
            }
            new Class4036(Blocks.field29341, new Properties().method31786(Class7207.field27997));
            final Class4036 class4036;
            final Object o;
            ((List<Class4036>)o).add(class4036);
            new Class4036(Blocks.field29401, new Properties().method31786(Class7207.field27997));
            final Class4036 class4037;
            final Object o2;
            ((List<Class4036>)o2).add(class4037);
            method14561(list, s2).iterator();
            final Iterator iterator2;
            while (iterator2.hasNext()) {
                final Item class4038 = iterator2.next();
                if (class4038 != Items.AIR) {
                    if (this.field20800 && !(class4038 instanceof Class4036)) {
                        continue;
                    }
                    else {
                        Registry.field211.getKey(class4038);
                        final ResourceLocation class4039;
                        String str;
                        if (class4038 instanceof Class4036 && class4039.method7797().equals("air")) {
                            str = Registry.BLOCK.getKey(((Class4036)class4038).method12240()).toString();
                        }
                        else {
                            str = class4039.toString();
                        }
                        final Class4817 field20799 = this.field20798;
                        final int n;
                        new Class4902(this, "btn" + str, 0, 0, n, n, class4038.method11741());
                        final CustomGuiScreen class4040;
                        field20799.addToList(class4040);
                        final Class4902 class4041;
                        class4041.method14725(this.field20797.contains(str), false);
                        class4041.method14516(class4903 -> {
                            final int size = this.field20797.size();
                            this.field20797.remove(str);
                            if (class4041.method14723()) {
                                this.field20797.add(str);
                            }
                            if (size != this.field20797.size()) {
                                this.method14517();
                            }
                        });
                    }
                }
            }
            this.field20798.method14396().method14255(new Class6801(0));
        });
    }
    
    public static List<Item> method14561(final List<Item> list, String lowerCase) {
        lowerCase = lowerCase.toLowerCase();
        if (lowerCase.length() != 0) {
            final ArrayList list2 = new ArrayList();
            final Iterator<Item> iterator = list.iterator();
            while (iterator.hasNext()) {
                final Item class3820 = iterator.next();
                if (!class3820.method11715().getString().toLowerCase().startsWith(lowerCase.toLowerCase())) {
                    continue;
                }
                list2.add(class3820);
                iterator.remove();
            }
            final Iterator<Item> iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                final Item class3821 = iterator2.next();
                if (!class3821.method11715().getString().toLowerCase().contains(lowerCase.toLowerCase())) {
                    continue;
                }
                list2.add(class3821);
                iterator2.remove();
            }
            list2.addAll(list);
            return list2;
        }
        return list;
    }
    
    @Override
    public void draw(final float n) {
        super.draw(n);
    }
    
    public void method14562(final String... a) {
        this.field20797.clear();
        this.field20797.addAll(Arrays.asList(a));
    }
    
    public List<String> method14563() {
        return this.field20797;
    }
}
