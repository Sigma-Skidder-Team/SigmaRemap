// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.text.ITextComponent;

import java.util.HashMap;
import java.util.Properties;
import java.util.Map;

public class Class4995
{
    private String field21474;
    private String field21475;
    private Class2005 field21476;
    private Map<ResourceLocation, ResourceLocation> field21477;
    private Class8998 field21478;
    private Class3090[] field21479;
    private Class7740 field21480;
    private Boolean field21481;
    private Boolean field21482;
    private Boolean field21483;
    private Boolean field21484;
    private Class7740 field21485;
    private Class9449[] field21486;
    private Class2004[] field21487;
    private Class181[] field21488;
    private static final Class2004[] field21489;
    private static final Class2004[] field21490;
    private static final Class2004[] field21491;
    private static final Class181[] field21492;
    private static final ResourceLocation field21493;
    private static final ResourceLocation field21494;
    private static final ResourceLocation field21495;
    private static final ResourceLocation field21496;
    private static final ResourceLocation field21497;
    private static final ResourceLocation field21498;
    private static final ResourceLocation field21499;
    private static final ResourceLocation field21500;
    private static final ResourceLocation field21501;
    private static final ResourceLocation field21502;
    private static final ResourceLocation field21503;
    private static final ResourceLocation field21504;
    private static final ResourceLocation field21505;
    
    public Class4995(final Properties properties, final String s) {
        this.field21474 = null;
        this.field21475 = null;
        this.field21476 = null;
        this.field21477 = null;
        this.field21478 = null;
        this.field21479 = null;
        this.field21480 = null;
        this.field21481 = null;
        this.field21482 = null;
        this.field21483 = null;
        this.field21484 = null;
        this.field21485 = null;
        this.field21486 = null;
        this.field21487 = null;
        this.field21488 = null;
        final Class8652 class8652 = new Class8652("CustomGuis");
        this.field21474 = class8652.method29440(s);
        this.field21475 = class8652.method29441(s);
        this.field21476 = (Class2005)class8652.method29471(properties.getProperty("container"), Class2005.values(), "container");
        this.field21477 = method15164(properties, "texture", this.field21476, "textures/gui/", this.field21475);
        this.field21478 = class8652.method29475("name", properties.getProperty("name"));
        this.field21479 = class8652.method29454(properties.getProperty("biomes"));
        this.field21480 = class8652.method29462(properties.getProperty("heights"));
        this.field21481 = class8652.method29465(properties.getProperty("large"));
        this.field21482 = class8652.method29465(properties.getProperty("trapped"));
        this.field21483 = class8652.method29465(properties.getProperty("christmas"));
        this.field21484 = class8652.method29465(properties.getProperty("ender"));
        this.field21485 = class8652.method29462(properties.getProperty("levels"));
        this.field21486 = class8652.method29476(properties.getProperty("professions"));
        this.field21487 = (Class2004[])class8652.method29472(properties.getProperty("variants"), method15160(this.field21476), "variants", Class4995.field21491);
        this.field21488 = method15161(properties.getProperty("colors"));
    }
    
    private static Class2004[] method15160(final Class2005 class2005) {
        if (class2005 != Class2005.field11264) {
            return (class2005 != Class2005.field11260) ? new Class2004[0] : Class4995.field21490;
        }
        return Class4995.field21489;
    }
    
    private static Class181[] method15161(String lowerCase) {
        if (lowerCase != null) {
            lowerCase = lowerCase.toLowerCase();
            final String[] method28937 = Config.method28937(lowerCase, " ");
            final Class181[] array = new Class181[method28937.length];
            for (int i = 0; i < method28937.length; ++i) {
                final String str = method28937[i];
                final Class181 method28938 = method15162(str);
                if (method28938 == null) {
                    method15167("Invalid color: " + str);
                    return Class4995.field21492;
                }
                array[i] = method28938;
            }
            return array;
        }
        return null;
    }
    
    private static Class181 method15162(final String s) {
        if (s != null) {
            final Class181[] values = Class181.values();
            for (int i = 0; i < values.length; ++i) {
                final Class181 class181 = values[i];
                if (class181.getName().equals(s)) {
                    return class181;
                }
                if (class181.method814().equals(s)) {
                    return class181;
                }
            }
            return null;
        }
        return null;
    }
    
    private static ResourceLocation method15163(String trim, final String str) {
        if (trim != null) {
            trim = trim.trim();
            String s = Class8969.method31832(trim, str);
            if (!s.endsWith(".png")) {
                s += ".png";
            }
            return new ResourceLocation(str + "/" + s);
        }
        return null;
    }
    
    private static Map<ResourceLocation, ResourceLocation> method15164(final Properties properties, final String s, final Class2005 class2005, final String str, final String s2) {
        final HashMap hashMap = new HashMap();
        final String property = properties.getProperty(s);
        if (property != null) {
            final ResourceLocation method15165 = method15165(class2005);
            final ResourceLocation method15166 = method15163(property, s2);
            if (method15165 != null) {
                if (method15166 != null) {
                    hashMap.put(method15165, method15166);
                }
            }
        }
        final String string = s + ".";
        for (final String key : properties.keySet()) {
            if (!key.startsWith(string)) {
                continue;
            }
            hashMap.put(new ResourceLocation(str + Class9518.method35527(key.substring(string.length()).replace('\\', '/'), "/", ".png") + ".png"), method15163(properties.getProperty(key), s2));
        }
        return hashMap;
    }
    
    private static ResourceLocation method15165(final Class2005 class2005) {
        if (class2005 == null) {
            return null;
        }
        switch (Class8294.field34096[class2005.ordinal()]) {
            case 1: {
                return Class4995.field21493;
            }
            case 2: {
                return Class4995.field21494;
            }
            case 3: {
                return Class4995.field21495;
            }
            case 4: {
                return Class4995.field21496;
            }
            case 5: {
                return Class4995.field21497;
            }
            case 6: {
                return null;
            }
            case 7: {
                return Class4995.field21499;
            }
            case 8: {
                return Class4995.field21500;
            }
            case 9: {
                return Class4995.field21501;
            }
            case 10: {
                return Class4995.field21502;
            }
            case 11: {
                return Class4995.field21498;
            }
            case 12: {
                return Class4995.field21503;
            }
            case 13: {
                return Class4995.field21504;
            }
            case 14: {
                return Class4995.field21505;
            }
            default: {
                return null;
            }
        }
    }
    
    public boolean method15166(final String str) {
        if (this.field21474 == null || this.field21474.length() <= 0) {
            method15167("No name found: " + str);
            return false;
        }
        if (this.field21475 == null) {
            method15167("No base path found: " + str);
            return false;
        }
        if (this.field21476 == null) {
            method15167("No container found: " + str);
            return false;
        }
        if (this.field21477.isEmpty()) {
            method15167("No texture found: " + str);
            return false;
        }
        if (this.field21486 == Class8652.field36318) {
            method15167("Invalid professions or careers: " + str);
            return false;
        }
        if (this.field21487 == Class4995.field21491) {
            method15167("Invalid variants: " + str);
            return false;
        }
        if (this.field21488 != Class4995.field21492) {
            return true;
        }
        method15167("Invalid colors: " + str);
        return false;
    }
    
    private static void method15167(final String str) {
        Config.warn("[CustomGuis] " + str);
    }
    
    private boolean method15168(final Class2005 class2005, final BlockPos class2006, final Class1852 class2007) {
        return this.field21476 == class2005 && (this.field21479 == null || Class7980.method26019(class2007.method6959(class2006), this.field21479)) && (this.field21480 == null || this.field21480.method24697(class2006.getY()));
    }
    
    public boolean method15169(final Class2005 class2005, final BlockPos class2006, final Class1852 class2007, final Class527 class2008) {
        if (!this.method15168(class2005, class2006, class2007)) {
            return false;
        }
        if (this.field21478 != null && !this.field21478.method32122(method15170(class2008))) {
            return false;
        }
        switch (Class8294.field34096[class2005.ordinal()]) {
            case 2: {
                return this.method15171(class2006, class2007);
            }
            case 4: {
                return this.method15172(class2006, class2007);
            }
            case 7: {
                return this.method15176(class2006, class2007);
            }
            case 13: {
                return this.method15178(class2006, class2007);
            }
            default: {
                return true;
            }
        }
    }
    
    public static String method15170(final Class527 class527) {
        final ITextComponent method3026 = class527.method3026();
        return (method3026 != null) ? method3026.getUnformattedComponentText() : null;
    }
    
    private boolean method15171(final BlockPos class354, final Class1856 class355) {
        final TileEntity method6727 = class355.getTileEntity(class354);
        if (method6727 instanceof Class490) {
            final Class490 class356 = (Class490)method6727;
            return this.field21485 == null || this.field21485.method24697(class356.method2451());
        }
        return false;
    }
    
    private boolean method15172(final BlockPos class354, final Class1856 class355) {
        final TileEntity method6727 = class355.getTileEntity(class354);
        if (!(method6727 instanceof Class475)) {
            return method6727 instanceof Class477 && this.method15174((Class477)method6727, class354, class355);
        }
        return this.method15173((Class475)method6727, class354, class355);
    }
    
    private boolean method15173(final Class475 class475, final BlockPos class476, final Class1856 class477) {
        final BlockState method6701 = class477.getBlockState(class476);
        return this.method15175((method6701.method21771(Class3865.field17498) ? method6701.get(Class3865.field17498) : Class180.field530) == Class180.field530, class475 instanceof Class478, Class7890.field32397, false);
    }
    
    private boolean method15174(final Class477 class477, final BlockPos class478, final Class1856 class479) {
        return this.method15175(false, false, false, true);
    }
    
    private boolean method15175(final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        return (this.field21481 == null || this.field21481 == b) && (this.field21482 == null || this.field21482 == b2) && (this.field21483 == null || this.field21483 == b3) && (this.field21484 == null || this.field21484 == b4);
    }
    
    private boolean method15176(final BlockPos class354, final Class1856 class355) {
        final TileEntity method6727 = class355.getTileEntity(class354);
        if (method6727 instanceof Class458) {
            final Class458 class356 = (Class458)method6727;
            return this.field21487 == null || Config.method28977(this.method15177(class356), this.field21487);
        }
        return false;
    }
    
    private Class2004 method15177(final Class458 class458) {
        return (class458 instanceof Class459) ? Class2004.field11253 : Class2004.field11252;
    }
    
    private boolean method15178(final BlockPos class354, final Class1856 class355) {
        final TileEntity method6727 = class355.getTileEntity(class354);
        if (method6727 instanceof Class440) {
            final Class440 class356 = (Class440)method6727;
            return this.field21488 == null || Config.method28977(class356.method2252(), this.field21488);
        }
        return false;
    }
    
    public boolean method15179(final Class2005 class2005, final Entity class2006, final Class1852 class2007) {
        if (!this.method15168(class2005, class2006.method1894(), class2007)) {
            return false;
        }
        if (this.field21478 != null && !this.field21478.method32122(class2006.method1867())) {
            return false;
        }
        switch (Class8294.field34096[class2005.ordinal()]) {
            case 11: {
                return this.method15181(class2006, class2007);
            }
            case 14: {
                return this.method15180(class2006, class2007);
            }
            default: {
                return true;
            }
        }
    }
    
    private boolean method15180(final Entity class399, final Class1856 class400) {
        if (class399 instanceof Class824) {
            final Class824 class401 = (Class824)class399;
            if (this.field21486 != null) {
                final Class8562 method4870 = class401.method4870();
                if (!Class9449.method35104(method4870.method28781(), method4870.method28782(), this.field21486)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    private boolean method15181(final Entity class399, final Class1856 class400) {
        if (!(class399 instanceof Class806)) {
            return false;
        }
        final Class806 class401 = (Class806)class399;
        if (this.field21487 != null && !Config.method28977(this.method15182(class401), this.field21487)) {
            return false;
        }
        if (this.field21488 != null) {
            if (class401 instanceof Class815) {
                if (!Config.method28977(((Class815)class401).method4792(), this.field21488)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private Class2004 method15182(final Class806 class806) {
        if (class806 instanceof Class808) {
            return Class2004.field11248;
        }
        if (class806 instanceof Class814) {
            return Class2004.field11249;
        }
        if (!(class806 instanceof Class813)) {
            return (class806 instanceof Class815) ? Class2004.field11251 : null;
        }
        return Class2004.field11250;
    }
    
    public Class2005 method15183() {
        return this.field21476;
    }
    
    public ResourceLocation method15184(final ResourceLocation class1932) {
        final ResourceLocation class1933 = this.field21477.get(class1932);
        return (class1933 != null) ? class1933 : class1932;
    }
    
    @Override
    public String toString() {
        return "name: " + this.field21474 + ", container: " + this.field21476 + ", textures: " + this.field21477;
    }
    
    static {
        field21489 = new Class2004[] { Class2004.field11248, Class2004.field11249, Class2004.field11250, Class2004.field11251 };
        field21490 = new Class2004[] { Class2004.field11252, Class2004.field11253 };
        field21491 = new Class2004[0];
        field21492 = new Class181[0];
        field21493 = new ResourceLocation("textures/gui/container/anvil.png");
        field21494 = new ResourceLocation("textures/gui/container/beacon.png");
        field21495 = new ResourceLocation("textures/gui/container/brewing_stand.png");
        field21496 = new ResourceLocation("textures/gui/container/generic_54.png");
        field21497 = new ResourceLocation("textures/gui/container/crafting_table.png");
        field21498 = new ResourceLocation("textures/gui/container/horse.png");
        field21499 = new ResourceLocation("textures/gui/container/dispenser.png");
        field21500 = new ResourceLocation("textures/gui/container/enchanting_table.png");
        field21501 = new ResourceLocation("textures/gui/container/furnace.png");
        field21502 = new ResourceLocation("textures/gui/container/hopper.png");
        field21503 = new ResourceLocation("textures/gui/container/inventory.png");
        field21504 = new ResourceLocation("textures/gui/container/shulker_box.png");
        field21505 = new ResourceLocation("textures/gui/container/villager2.png");
    }
}
