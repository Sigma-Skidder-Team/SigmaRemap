// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.item;

import java.util.AbstractList;

import mapped.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.nbt.INBT;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import java.util.Objects;
import com.google.common.collect.HashMultimap;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Function;
import com.mojang.brigadier.StringReader;
import com.google.common.collect.Multimap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import com.google.common.collect.Lists;
import java.util.List;
import com.google.gson.JsonParseException;
import javax.annotation.Nullable;
import java.util.function.Consumer;
import java.util.Random;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.text.DecimalFormat;
import org.apache.logging.log4j.Logger;

public final class ItemStack
{
    private static final Logger field34173;
    public static final ItemStack field34174;
    public static final DecimalFormat field34175;
    public int field34176;
    private int field34177;
    @Deprecated
    private final Item field34178;
    private Class51 field34179;
    private boolean field34180;
    private Class862 field34181;
    private Class7990 field34182;
    private boolean field34183;
    private Class7990 field34184;
    private boolean field34185;
    
    private static DecimalFormat method27617() {
        final DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
        return decimalFormat;
    }
    
    public ItemStack(final Class3832 class3832) {
        this(class3832, 1);
    }
    
    public ItemStack(final Class3832 class3832, final int field34176) {
        this.field34178 = ((class3832 != null) ? class3832.method11704() : null);
        this.field34176 = field34176;
        if (this.field34178 != null) {
            if (this.field34178.method11710()) {
                this.method27633(this.method27632());
            }
        }
        this.method27618();
    }
    
    private void method27618() {
        this.field34180 = false;
        this.field34180 = this.method27620();
    }
    
    private ItemStack(final Class51 class51) {
        this.field34178 = Registry.field211.getOrDefault(new ResourceLocation(class51.method323("id")));
        this.field34176 = class51.method317("Count");
        if (class51.method316("tag", 10)) {
            this.field34179 = class51.method327("tag");
            this.getItem().method11702(class51);
        }
        if (this.getItem().method11710()) {
            this.method27633(this.method27632());
        }
        this.method27618();
    }
    
    public static ItemStack method27619(final Class51 class51) {
        try {
            return new ItemStack(class51);
        }
        catch (final RuntimeException ex) {
            ItemStack.field34173.debug("Tried to load invalid item: {}", (Object)class51, (Object)ex);
            return ItemStack.field34174;
        }
    }
    
    public boolean method27620() {
        return this == ItemStack.field34174 || this.getItem() == null || this.getItem() == Items.AIR || this.field34176 <= 0;
    }
    
    public ItemStack method27621(final int a) {
        final int min = Math.min(a, this.field34176);
        final ItemStack method27641 = this.method27641();
        method27641.method27691(min);
        this.method27693(min);
        return method27641;
    }
    
    public Item getItem() {
        return this.field34180 ? Items.AIR : this.field34178;
    }
    
    public Class2201 method27623(final Class7075 class7075) {
        final Class512 method21652 = class7075.method21652();
        final Class7990 class7076 = new Class7990(class7075.method21654(), class7075.method21639(), false);
        if (method21652 != null) {
            if (!method21652.field3025.field27305) {
                if (!this.method27687(class7075.method21654().method6793(), class7076)) {
                    return Class2201.field13402;
                }
            }
        }
        final Item method21653 = this.getItem();
        final Class2201 method21654 = method21653.method11694(class7075);
        if (method21652 != null) {
            if (method21654 == Class2201.field13400) {
                method21652.method2859(Class8276.field33981.method8449(method21653));
            }
        }
        return method21654;
    }
    
    public float method27624(final Class7096 class7096) {
        return this.getItem().method11706(this, class7096);
    }
    
    public Class9355<ItemStack> method27625(final World class1847, final Class512 class1848, final Class316 class1849) {
        return this.getItem().method11695(class1847, class1848, class1849);
    }
    
    public ItemStack method27626(final World class1847, final LivingEntity class1848) {
        return this.getItem().method11707(this, class1847, class1848);
    }
    
    public Class51 method27627(final Class51 class51) {
        final ResourceLocation method503 = Registry.field211.getKey(this.getItem());
        class51.method306("id", (method503 != null) ? method503.toString() : "minecraft:air");
        class51.method296("Count", (byte)this.field34176);
        if (this.field34179 != null) {
            class51.method295("tag", this.field34179.method333());
        }
        return class51;
    }
    
    public int method27628() {
        return this.getItem().method11708();
    }
    
    public boolean method27629() {
        return this.method27628() > 1 && (!this.method27630() || !this.method27631());
    }
    
    public boolean method27630() {
        if (!this.field34180 && this.getItem().method11709() > 0) {
            final Class51 method27657 = this.method27657();
            return method27657 == null || !method27657.method329("Unbreakable");
        }
        return false;
    }
    
    public boolean method27631() {
        return this.method27630() && this.method27632() > 0;
    }
    
    public int method27632() {
        return (this.field34179 != null) ? this.field34179.method319("Damage") : 0;
    }
    
    public void method27633(final int b) {
        this.method27658().method298("Damage", Math.max(0, b));
    }
    
    public int method27634() {
        return this.getItem().method11709();
    }
    
    public boolean method27635(int n, final Random random, final Class513 class513) {
        if (this.method27630()) {
            if (n > 0) {
                final int method30195 = Class8742.method30195(Class7882.field32367, this);
                int n2 = 0;
                for (int n3 = 0; method30195 > 0 && n3 < n; ++n3) {
                    if (Class6272.method18609(this, method30195, random)) {
                        ++n2;
                    }
                }
                n -= n2;
                if (n <= 0) {
                    return false;
                }
            }
            if (class513 != null) {
                if (n != 0) {
                    Class7770.field31794.method13746(class513, this, this.method27632() + n);
                }
            }
            final int n4 = this.method27632() + n;
            this.method27633(n4);
            return n4 >= this.method27634();
        }
        return false;
    }
    
    public <T extends LivingEntity> void method27636(final int n, final T t, final Consumer<T> consumer) {
        if (!t.world.isRemote) {
            if (!(t instanceof Class512) || !((Class512)t).field3025.field27304) {
                if (this.method27630()) {
                    if (this.method27635(n, t.method2633(), (t instanceof Class513) ? t : null)) {
                        consumer.accept(t);
                        final Item method27622 = this.getItem();
                        this.method27693(1);
                        if (t instanceof Class512) {
                            ((Class512)t).method2859(Class8276.field33982.method8449(method27622));
                        }
                        this.method27633(0);
                    }
                }
            }
        }
    }
    
    public void method27637(final LivingEntity class511, final Class512 class512) {
        final Item method27622 = this.getItem();
        if (method27622.method11711(this, class511, class512)) {
            class512.method2859(Class8276.field33981.method8449(method27622));
        }
    }
    
    public void method27638(final World class1847, final Class7096 class1848, final BlockPos class1849, final Class512 class1850) {
        final Item method27622 = this.getItem();
        if (method27622.method11712(this, class1847, class1848, class1849, class1850)) {
            class1850.method2859(Class8276.field33981.method8449(method27622));
        }
    }
    
    public boolean method27639(final Class7096 class7096) {
        return this.getItem().method11713(class7096);
    }
    
    public boolean method27640(final Class512 class512, final LivingEntity class513, final Class316 class514) {
        return this.getItem().method11714(this, class512, class513, class514);
    }
    
    public ItemStack method27641() {
        if (!this.method27620()) {
            final ItemStack class8321 = new ItemStack(this.getItem(), this.field34176);
            class8321.method27689(this.method27688());
            if (this.field34179 != null) {
                class8321.field34179 = this.field34179.method333();
            }
            return class8321;
        }
        return ItemStack.field34174;
    }
    
    public static boolean method27642(final ItemStack class8321, final ItemStack class8322) {
        return (class8321.method27620() && class8322.method27620()) || (!class8321.method27620() && !class8322.method27620() && (class8321.field34179 != null || class8322.field34179 == null) && (class8321.field34179 == null || class8321.field34179.equals(class8322.field34179)));
    }
    
    public static boolean method27643(final ItemStack class8321, final ItemStack class8322) {
        return (class8321.method27620() && class8322.method27620()) || (!class8321.method27620() && !class8322.method27620() && class8321.method27644(class8322));
    }
    
    private boolean method27644(final ItemStack class8321) {
        return this.field34176 == class8321.field34176 && this.getItem() == class8321.getItem() && (this.field34179 != null || class8321.field34179 == null) && (this.field34179 == null || this.field34179.equals(class8321.field34179));
    }
    
    public static boolean method27645(final ItemStack class8321, final ItemStack class8322) {
        return class8321 == class8322 || (!class8321.method27620() && !class8322.method27620() && class8321.method27647(class8322));
    }
    
    public static boolean method27646(final ItemStack class8321, final ItemStack class8322) {
        return class8321 == class8322 || (!class8321.method27620() && !class8322.method27620() && class8321.method27648(class8322));
    }
    
    public boolean method27647(final ItemStack class8321) {
        return !class8321.method27620() && this.getItem() == class8321.getItem();
    }
    
    public boolean method27648(final ItemStack class8321) {
        if (this.method27630()) {
            return !class8321.method27620() && this.getItem() == class8321.getItem();
        }
        return this.method27647(class8321);
    }
    
    public String method27649() {
        return this.getItem().method11718(this);
    }
    
    @Override
    public String toString() {
        return this.field34176 + " " + this.getItem();
    }
    
    public void method27650(final World class1847, final Entity class1848, final int n, final boolean b) {
        if (this.field34177 > 0) {
            --this.field34177;
        }
        if (this.getItem() != null) {
            this.getItem().method11722(this, class1847, class1848, n, b);
        }
    }
    
    public void method27651(final World class1847, final Class512 class1848, final int n) {
        class1848.method2860(Class8276.field33980.method8449(this.getItem()), n);
        this.getItem().method11723(this, class1847, class1848);
    }
    
    public int method27652() {
        return this.getItem().method11726(this);
    }
    
    public Class1992 method27653() {
        return this.getItem().method11725(this);
    }
    
    public void method27654(final World class1847, final LivingEntity class1848, final int n) {
        this.getItem().method11727(this, class1847, class1848, n);
    }
    
    public boolean method27655() {
        return this.getItem().method11740(this);
    }
    
    public boolean method27656() {
        if (!this.field34180) {
            if (this.field34179 != null) {
                if (!this.field34179.method331()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Nullable
    public Class51 method27657() {
        return this.field34179;
    }
    
    public Class51 method27658() {
        if (this.field34179 == null) {
            this.method27663(new Class51());
        }
        return this.field34179;
    }
    
    public Class51 method27659(final String s) {
        if (this.field34179 != null && this.field34179.method316(s, 10)) {
            return this.field34179.method327(s);
        }
        final Class51 class51 = new Class51();
        this.method27676(s, class51);
        return class51;
    }
    
    @Nullable
    public Class51 method27660(final String s) {
        return (this.field34179 != null && this.field34179.method316(s, 10)) ? this.field34179.method327(s) : null;
    }
    
    public void method27661(final String s) {
        if (this.field34179 != null) {
            if (this.field34179.method315(s)) {
                this.field34179.method330(s);
                if (this.field34179.method331()) {
                    this.field34179 = null;
                }
            }
        }
    }
    
    public Class52 method27662() {
        return (this.field34179 == null) ? new Class52() : this.field34179.method328("Enchantments", 10);
    }
    
    public void method27663(final Class51 field34179) {
        this.field34179 = field34179;
        if (this.getItem().method11710()) {
            this.method27633(this.method27632());
        }
    }
    
    public ITextComponent method27664() {
        final Class51 method27660 = this.method27660("display");
        if (method27660 != null && method27660.method316("Name", 8)) {
            try {
                final ITextComponent method27661 = Class5953.method17871(method27660.method323("Name"));
                if (method27661 != null) {
                    return method27661;
                }
                method27660.method330("Name");
            }
            catch (final JsonParseException ex) {
                method27660.method330("Name");
            }
        }
        return this.getItem().method11729(this);
    }
    
    public ItemStack method27665(final ITextComponent class2250) {
        final Class51 method27659 = this.method27659("display");
        if (class2250 == null) {
            method27659.method330("Name");
        }
        else {
            method27659.method306("Name", Class5953.method17869(class2250));
        }
        return this;
    }
    
    public void method27666() {
        final Class51 method27660 = this.method27660("display");
        if (method27660 != null) {
            method27660.method330("Name");
            if (method27660.method331()) {
                this.method27661("display");
            }
        }
        if (this.field34179 != null) {
            if (this.field34179.method331()) {
                this.field34179 = null;
            }
        }
    }
    
    public boolean method27667() {
        final Class51 method27660 = this.method27660("display");
        return method27660 != null && method27660.method316("Name", 8);
    }
    
    public List<ITextComponent> method27668(final Class512 class512, final Class1981 class513) {
        final ArrayList arrayList = Lists.newArrayList();
        final ITextComponent method8469 = new StringTextComponent("").appendSibling(this.method27664()).applyTextStyle(this.method27672().field11190);
        if (this.method27667()) {
            method8469.applyTextStyle(TextFormatting.ITALIC);
        }
        arrayList.add(method8469);
        if (!class513.method7991() && !this.method27667() && this.getItem() == Items.field31425) {
            arrayList.add(new StringTextComponent("#" + Class4094.method12329(this)).applyTextStyle(TextFormatting.GRAY));
        }
        int method8470 = 0;
        if (this.method27656() && this.field34179.method316("HideFlags", 99)) {
            method8470 = this.field34179.method319("HideFlags");
        }
        if ((method8470 & 0x20) == 0x0) {
            this.getItem().method11728(this, (class512 == null) ? null : class512.world, arrayList, class513);
        }
        if (this.method27656()) {
            if ((method8470 & 0x1) == 0x0) {
                method27669(arrayList, this.method27662());
            }
            if (this.field34179.method316("display", 10)) {
                final Class51 method8471 = this.field34179.method327("display");
                if (method8471.method316("color", 3)) {
                    if (class513.method7991()) {
                        arrayList.add(new Class2259("item.color", new Object[] { String.format("#%06X", method8471.method319("color")) }).applyTextStyle(TextFormatting.GRAY));
                    }
                    else {
                        arrayList.add(new Class2259("item.dyed", new Object[0]).applyTextStyles(TextFormatting.GRAY, TextFormatting.ITALIC));
                    }
                }
                if (method8471.method314("Lore") == 9) {
                    final Class52 method8472 = method8471.method328("Lore", 8);
                    for (int i = 0; i < method8472.size(); ++i) {
                        final String method8473 = method8472.method353(i);
                        try {
                            final ITextComponent method8474 = Class5953.method17871(method8473);
                            if (method8474 != null) {
                                arrayList.add(Class9479.method35293(method8474, new Style().setColor(TextFormatting.DARK_PURPLE).setItalic(true)));
                            }
                        }
                        catch (final JsonParseException ex) {
                            method8471.method330("Lore");
                        }
                    }
                }
            }
        }
        for (final Class2215 class514 : Class2215.values()) {
            final Multimap<String, Class7919> method8475 = this.method27682(class514);
            if (!method8475.isEmpty() && (method8470 & 0x2) == 0x0) {
                arrayList.add(new StringTextComponent(""));
                arrayList.add(new Class2259("item.modifiers." + class514.method8404(), new Object[0]).applyTextStyle(TextFormatting.GRAY));
                for (final Map.Entry<K, Class7919> entry : method8475.entries()) {
                    final Class7919 class515 = entry.getValue();
                    double method8476 = class515.method25638();
                    boolean b = false;
                    if (class512 != null) {
                        if (class515.method25635() == Item.field17361) {
                            method8476 = method8476 + class512.method2710(Class8107.field33410).method23940() + Class8742.method30202(this, Class6363.field25460);
                            b = true;
                        }
                        else if (class515.method25635() == Item.field17362) {
                            method8476 += class512.method2710(Class8107.field33412).method23940();
                            b = true;
                        }
                    }
                    double n;
                    if (class515.method25637() != Class2157.field12810 && class515.method25637() != Class2157.field12811) {
                        n = method8476;
                    }
                    else {
                        n = method8476 * 100.0;
                    }
                    if (b) {
                        arrayList.add(new StringTextComponent(" ").appendSibling(new Class2259("attribute.modifier.equals." + class515.method25637().method8322(), new Object[] { ItemStack.field34175.format(n), new Class2259("attribute.name." + (String)entry.getKey(), new Object[0]) })).applyTextStyle(TextFormatting.DARK_GREEN));
                    }
                    else if (method8476 > 0.0) {
                        arrayList.add(new Class2259("attribute.modifier.plus." + class515.method25637().method8322(), new Object[] { ItemStack.field34175.format(n), new Class2259("attribute.name." + (String)entry.getKey(), new Object[0]) }).applyTextStyle(TextFormatting.BLUE));
                    }
                    else {
                        if (method8476 >= 0.0) {
                            continue;
                        }
                        arrayList.add(new Class2259("attribute.modifier.take." + class515.method25637().method8322(), new Object[] { ItemStack.field34175.format(n * -1.0), new Class2259("attribute.name." + (String)entry.getKey(), new Object[0]) }).applyTextStyle(TextFormatting.RED));
                    }
                }
            }
        }
        if (this.method27656() && this.method27657().method329("Unbreakable") && (method8470 & 0x4) == 0x0) {
            arrayList.add(new Class2259("item.unbreakable", new Object[0]).applyTextStyle(TextFormatting.BLUE));
        }
        if (this.method27656() && this.field34179.method316("CanDestroy", 9) && (method8470 & 0x8) == 0x0) {
            final Class52 method8477 = this.field34179.method328("CanDestroy", 8);
            if (!method8477.isEmpty()) {
                arrayList.add(new StringTextComponent(""));
                arrayList.add(new Class2259("item.canBreak", new Object[0]).applyTextStyle(TextFormatting.GRAY));
                for (int k = 0; k < method8477.size(); ++k) {
                    arrayList.addAll(method27670(method8477.method353(k)));
                }
            }
        }
        if (this.method27656() && this.field34179.method316("CanPlaceOn", 9) && (method8470 & 0x10) == 0x0) {
            final Class52 method8478 = this.field34179.method328("CanPlaceOn", 8);
            if (!method8478.isEmpty()) {
                arrayList.add(new StringTextComponent(""));
                arrayList.add(new Class2259("item.canPlace", new Object[0]).applyTextStyle(TextFormatting.GRAY));
                for (int l = 0; l < method8478.size(); ++l) {
                    arrayList.addAll(method27670(method8478.method353(l)));
                }
            }
        }
        if (class513.method7991()) {
            if (this.method27631()) {
                arrayList.add(new Class2259("item.durability", new Object[] { this.method27634() - this.method27632(), this.method27634() }));
            }
            arrayList.add(new StringTextComponent(Registry.field211.getKey(this.getItem()).toString()).applyTextStyle(TextFormatting.DARK_GRAY));
            if (this.method27656()) {
                arrayList.add(new Class2259("item.nbt_tags", new Object[] { this.method27657().method293().size() }).applyTextStyle(TextFormatting.DARK_GRAY));
            }
        }
        return arrayList;
    }
    
    public static void method27669(final List<ITextComponent> list, final Class52 class52) {
        for (int i = 0; i < class52.size(); ++i) {
            Registry.field209.method506(ResourceLocation.method7795(class52.method346(i).method323("id"))).ifPresent(class54 -> list2.add(class54.method18599(class53.method319("lvl"))));
        }
    }
    
    private static Collection<ITextComponent> method27670(final String s) {
        try {
            final Class7572 method23802 = new Class7572(new StringReader(s), true).method23802(true);
            final Class7096 method23803 = method23802.method23799();
            final ResourceLocation method23804 = method23802.method23801();
            final boolean b = method23803 != null;
            final boolean b2 = method23804 != null;
            if (b || b2) {
                if (b) {
                    return Lists.newArrayList((Iterable)method23803.method21696().method11855().applyTextStyle(TextFormatting.DARK_GRAY));
                }
                final Class7909<Block> method23805 = Class7188.method22057().method18460(method23804);
                if (method23805 != null) {
                    final Collection<Block> method23806 = method23805.method25616();
                    if (!method23806.isEmpty()) {
                        return method23806.stream().map((Function<? super Object, ?>) Block::method11855).map(class2250 -> class2250.method8469(TextFormatting.DARK_GRAY)).collect((Collector<? super Object, ?, Collection<ITextComponent>>)Collectors.toList());
                    }
                }
            }
        }
        catch (final CommandSyntaxException ex) {}
        return Lists.newArrayList((Iterable)new StringTextComponent("missingno").applyTextStyle(TextFormatting.DARK_GRAY));
    }
    
    public boolean method27671() {
        return this.getItem().method11730(this);
    }
    
    public Class1998 method27672() {
        return this.getItem().method11731(this);
    }
    
    public boolean method27673() {
        return this.getItem().method11732(this) && !this.method27675();
    }
    
    public void method27674(final Class6257 class6257, final int n) {
        this.method27658();
        if (!this.field34179.method316("Enchantments", 9)) {
            this.field34179.method295("Enchantments", new Class52());
        }
        final Class52 method328 = this.field34179.method328("Enchantments", 10);
        final Class51 e = new Class51();
        e.method306("id", String.valueOf(Registry.field209.getKey(class6257)));
        e.method297("lvl", (byte)n);
        ((AbstractList<Class51>)method328).add(e);
    }
    
    public boolean method27675() {
        return this.field34179 != null && this.field34179.method316("Enchantments", 9) && !this.field34179.method328("Enchantments", 10).isEmpty();
    }
    
    public void method27676(final String s, final INBT class41) {
        this.method27658().method295(s, class41);
    }
    
    public boolean method27677() {
        return this.field34181 != null;
    }
    
    public void method27678(final Class862 field34181) {
        this.field34181 = field34181;
    }
    
    @Nullable
    public Class862 method27679() {
        return this.field34180 ? null : this.field34181;
    }
    
    public int method27680() {
        return (this.method27656() && this.field34179.method316("RepairCost", 3)) ? this.field34179.method319("RepairCost") : 0;
    }
    
    public void method27681(final int n) {
        this.method27658().method298("RepairCost", n);
    }
    
    public Multimap<String, Class7919> method27682(final Class2215 class2215) {
        Object o;
        if (this.method27656() && this.field34179.method316("AttributeModifiers", 9)) {
            o = HashMultimap.create();
            final Class52 method328 = this.field34179.method328("AttributeModifiers", 10);
            for (int i = 0; i < method328.size(); ++i) {
                final Class51 method329 = method328.method346(i);
                final Class7919 method330 = Class8107.method26644(method329);
                if (method330 != null) {
                    if (!method329.method316("Slot", 8) || method329.method323("Slot").equals(class2215.method8404())) {
                        if (method330.method25635().getLeastSignificantBits() != 0L) {
                            if (method330.method25635().getMostSignificantBits() != 0L) {
                                ((Multimap)o).put((Object)method329.method323("AttributeName"), (Object)method330);
                            }
                        }
                    }
                }
            }
        }
        else {
            o = this.getItem().method11739(class2215);
        }
        ((Multimap)o).values().forEach(class2216 -> class2216.method25640((boolean)(0 != 0)));
        return (Multimap<String, Class7919>)o;
    }
    
    public void method27683(final String s, final Class7919 class7919, final Class2215 class7920) {
        this.method27658();
        if (!this.field34179.method316("AttributeModifiers", 9)) {
            this.field34179.method295("AttributeModifiers", new Class52());
        }
        final Class52 method328 = this.field34179.method328("AttributeModifiers", 10);
        final Class51 method329 = Class8107.method26641(class7919);
        method329.method306("AttributeName", s);
        if (class7920 != null) {
            method329.method306("Slot", class7920.method8404());
        }
        ((AbstractList<Class51>)method328).add(method329);
    }
    
    public ITextComponent method27684() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ldc_w           ""
        //     7: invokespecial   mapped/Class2260.<init>:(Ljava/lang/String;)V
        //    10: aload_0        
        //    11: invokevirtual   mapped/Class8321.method27664:()Lmapped/Class2250;
        //    14: invokevirtual   mapped/Class2260.method8458:(Lmapped/Class2250;)Lmapped/Class2250;
        //    17: astore_3       
        //    18: aload_0        
        //    19: invokevirtual   mapped/Class8321.method27667:()Z
        //    22: ifne            42
        //    25: aload_3        
        //    26: invokestatic    mapped/Class9479.method35299:(Lmapped/Class2250;)Lmapped/Class2250;
        //    29: astore          4
        //    31: aload_0        
        //    32: getfield        mapped/Class8321.field34180:Z
        //    35: ifeq            56
        //    38: aload           4
        //    40: areturn        
        //    41: athrow         
        //    42: aload_3        
        //    43: getstatic       mapped/Class2116.field12329:Lmapped/Class2116;
        //    46: invokeinterface mapped/Class2250.method8469:(Lmapped/Class2116;)Lmapped/Class2250;
        //    51: pop            
        //    52: goto            25
        //    55: athrow         
        //    56: aload_0        
        //    57: new             Lmapped/Class51;
        //    60: dup            
        //    61: invokespecial   mapped/Class51.<init>:()V
        //    64: invokevirtual   mapped/Class8321.method27627:(Lmapped/Class51;)Lmapped/Class51;
        //    67: astore          5
        //    69: aload           4
        //    71: aload_0        
        //    72: invokevirtual   mapped/Class8321.method27672:()Lmapped/Class1998;
        //    75: getfield        mapped/Class1998.field11190:Lmapped/Class2116;
        //    78: invokeinterface mapped/Class2250.method8469:(Lmapped/Class2116;)Lmapped/Class2250;
        //    83: aload           5
        //    85: invokedynamic   BootstrapMethod #4, accept:(Lmapped/Class51;)Ljava/util/function/Consumer;
        //    90: invokeinterface mapped/Class2250.method8467:(Ljava/util/function/Consumer;)Lmapped/Class2250;
        //    95: pop            
        //    96: goto            38
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Could not infer any expression.
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:382)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:95)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:144)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static boolean method27685(final Class7990 class7990, final Class7990 class7991) {
        return class7991 != null && class7990.method26065() == class7991.method26065() && ((class7990.method26066() == null && class7991.method26066() == null) || (class7990.method26066() != null && class7991.method26066() != null && Objects.equals(class7990.method26066().method2180(new Class51()), class7991.method26066().method2180(new Class51()))));
    }
    
    public boolean method27686(final Class1792 class1792, final Class7990 field34182) {
        if (method27685(field34182, this.field34182)) {
            return this.field34183;
        }
        this.field34182 = field34182;
        if (this.method27656() && this.field34179.method316("CanDestroy", 9)) {
            final Class52 method328 = this.field34179.method328("CanDestroy", 8);
            for (int i = 0; i < method328.size(); ++i) {
                final String method329 = method328.method353(i);
                try {
                    if (Class8808.method30732().parse(new StringReader(method329)).method25689(class1792).test(field34182)) {
                        return this.field34183 = true;
                    }
                }
                catch (final CommandSyntaxException ex) {}
            }
        }
        return this.field34183 = false;
    }
    
    public boolean method27687(final Class1792 class1792, final Class7990 field34184) {
        if (method27685(field34184, this.field34184)) {
            return this.field34185;
        }
        this.field34184 = field34184;
        if (this.method27656() && this.field34179.method316("CanPlaceOn", 9)) {
            final Class52 method328 = this.field34179.method328("CanPlaceOn", 8);
            for (int i = 0; i < method328.size(); ++i) {
                final String method329 = method328.method353(i);
                try {
                    if (Class8808.method30732().parse(new StringReader(method329)).method25689(class1792).test(field34184)) {
                        return this.field34185 = true;
                    }
                }
                catch (final CommandSyntaxException ex) {}
            }
        }
        return this.field34185 = false;
    }
    
    public int method27688() {
        return this.field34177;
    }
    
    public void method27689(final int field34177) {
        this.field34177 = field34177;
    }
    
    public int method27690() {
        return this.field34180 ? 0 : this.field34176;
    }
    
    public void method27691(final int field34176) {
        this.field34176 = field34176;
        this.method27618();
    }
    
    public void method27692(final int n) {
        this.method27691(this.field34176 + n);
    }
    
    public void method27693(final int n) {
        this.method27692(-n);
    }
    
    public void method27694(final World class1847, final LivingEntity class1848, final int n) {
        this.getItem().method11699(class1847, class1848, this, n);
    }
    
    public boolean method27695() {
        return this.getItem().method11743();
    }
    
    public Class7795 method27696() {
        return this.getItem().method11745();
    }
    
    public Class7795 method27697() {
        return this.getItem().method11746();
    }
    
    static {
        field34173 = LogManager.getLogger();
        field34174 = new ItemStack((Class3832)null);
        field34175 = method27617();
    }
}
