// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import org.apache.logging.log4j.LogManager;
import javax.annotation.Nullable;
import java.util.UUID;
import java.util.Set;
import java.util.Iterator;
import org.apache.logging.log4j.Logger;

public class Class8107
{
    private static final Logger field33404;
    public static final Class8725 field33405;
    public static final Class8725 field33406;
    public static final Class8725 field33407;
    public static final Class8725 field33408;
    public static final Class8725 field33409;
    public static final Class8725 field33410;
    public static final Class8725 field33411;
    public static final Class8725 field33412;
    public static final Class8725 field33413;
    public static final Class8725 field33414;
    public static final Class8725 field33415;
    
    public static ListNBT method26639(final Class6821 class6821) {
        final ListNBT class6822 = new ListNBT();
        final Iterator<Class7619> iterator = class6821.method20880().iterator();
        while (iterator.hasNext()) {
            class6822.add(method26640(iterator.next()));
        }
        return class6822;
    }
    
    private static CompoundNBT method26640(final Class7619 class7619) {
        final CompoundNBT class7620 = new CompoundNBT();
        class7620.putString("Name", class7619.method23939().method29978());
        class7620.putDouble("Base", class7619.method23940());
        final Set<Class7919> method23943 = class7619.method23943();
        if (method23943 != null) {
            if (!method23943.isEmpty()) {
                final ListNBT class7621 = new ListNBT();
                for (final Class7919 class7622 : method23943) {
                    if (!class7622.method25639()) {
                        continue;
                    }
                    class7621.add(method26641(class7622));
                }
                class7620.put("Modifiers", class7621);
            }
        }
        return class7620;
    }
    
    public static CompoundNBT method26641(final Class7919 class7919) {
        final CompoundNBT class7920 = new CompoundNBT();
        class7920.putString("Name", class7919.method25636());
        class7920.putDouble("Amount", class7919.method25638());
        class7920.putInt("Operation", class7919.method25637().method8322());
        class7920.putUniqueId("UUID", class7919.method25635());
        return class7920;
    }
    
    public static void method26642(final Class6821 class6821, final ListNBT class6822) {
        for (int i = 0; i < class6822.size(); ++i) {
            final CompoundNBT method346 = class6822.method346(i);
            final Class7619 method347 = class6821.method20878(method346.getString("Name"));
            if (method347 != null) {
                method26643(method347, method346);
            }
            else {
                Class8107.field33404.warn("Ignoring unknown attribute '{}'", method346.getString("Name"));
            }
        }
    }
    
    private static void method26643(final Class7619 class7619, final CompoundNBT class7620) {
        class7619.method23941(class7620.getDouble("Base"));
        if (class7620.contains("Modifiers", 9)) {
            final ListNBT method328 = class7620.getList("Modifiers", 10);
            for (int i = 0; i < method328.size(); ++i) {
                final Class7919 method329 = method26644(method328.method346(i));
                if (method329 != null) {
                    final Class7919 method330 = class7619.method23945(method329.method25635());
                    if (method330 != null) {
                        class7619.method23947(method330);
                    }
                    class7619.method23946(method329);
                }
            }
        }
    }
    
    @Nullable
    public static Class7919 method26644(final CompoundNBT class51) {
        final UUID method301 = class51.getUniqueId("UUID");
        try {
            return new Class7919(method301, class51.getString("Name"), class51.getDouble("Amount"), Class2157.method8323(class51.getInt("Operation")));
        }
        catch (final Exception ex) {
            Class8107.field33404.warn("Unable to create attribute: {}", ex.getMessage());
            return null;
        }
    }
    
    static {
        field33404 = LogManager.getLogger();
        field33405 = new Class8723(null, "generic.maxHealth", 20.0, 0.0, 1024.0).method29975("Max Health").method29981(true);
        field33406 = new Class8723(null, "generic.followRange", 32.0, 0.0, 2048.0).method29975("Follow Range");
        field33407 = new Class8723(null, "generic.knockbackResistance", 0.0, 0.0, 1.0).method29975("Knockback Resistance");
        field33408 = new Class8723(null, "generic.movementSpeed", 0.699999988079071, 0.0, 1024.0).method29975("Movement Speed").method29981(true);
        field33409 = new Class8723(null, "generic.flyingSpeed", 0.4000000059604645, 0.0, 1024.0).method29975("Flying Speed").method29981(true);
        field33410 = new Class8723(null, "generic.attackDamage", 2.0, 0.0, 2048.0);
        field33411 = new Class8723(null, "generic.attackKnockback", 0.0, 0.0, 5.0);
        field33412 = new Class8723(null, "generic.attackSpeed", 4.0, 0.0, 1024.0).method29981(true);
        field33413 = new Class8723(null, "generic.armor", 0.0, 0.0, 30.0).method29981(true);
        field33414 = new Class8723(null, "generic.armorToughness", 0.0, 0.0, 20.0).method29981(true);
        field33415 = new Class8723(null, "generic.luck", 0.0, -1024.0, 1024.0).method29981(true);
    }
}
