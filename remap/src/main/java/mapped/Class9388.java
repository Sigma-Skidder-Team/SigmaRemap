// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.Comparator;
import java.util.Arrays;
import com.mojang.authlib.GameProfile;
import java.util.UUID;

import net.minecraft.item.ItemStack;
import org.apache.commons.lang3.StringUtils;

public class Class9388
{
    private static final Class440[] field40280;
    private static final Class440 field40281;
    public static final Class9388 field40282;
    private final Class475 field40283;
    private final Class475 field40284;
    private final Class477 field40285;
    private final Class465 field40286;
    private final Class437 field40287;
    private final Class492 field40288;
    private final Class5904 field40289;
    private final Class5905 field40290;
    
    public Class9388() {
        this.field40283 = new Class475();
        this.field40284 = new Class478();
        this.field40285 = new Class477();
        this.field40286 = new Class465();
        this.field40287 = new Class437();
        this.field40288 = new Class492();
        this.field40289 = new Class5904();
        this.field40290 = new Class5905();
    }
    
    public void method34897(final ItemStack class8321, final Class7351 class8322, final Class7807 class8323, final int n, final int n2) {
        final Item method27622 = class8321.getItem();
        if (!(method27622 instanceof Class4036)) {
            if (method27622 != Items.field31583) {
                if (method27622 == Items.field31607) {
                    class8322.method22567();
                    class8322.method22565(1.0f, -1.0f, -1.0f);
                    this.field40290.method17564(class8322, Class1796.method6532(class8323, this.field40290.method17647(Class5905.field24278), false, class8321.method27671()), n, n2, 1.0f, 1.0f, 1.0f, 1.0f);
                    class8322.method22568();
                }
            }
            else {
                final boolean b = class8321.method27660("BlockEntityTag") != null;
                class8322.method22567();
                class8322.method22565(1.0f, -1.0f, -1.0f);
                final Class3687 class8324 = b ? Class7637.field30243 : Class7637.field30244;
                final Class4150 method27623 = class8324.method11332().method7512(Class1796.method6532(class8323, this.field40289.method17647(class8324.method11330()), false, class8321.method27671()));
                this.field40289.method17649().method18644(class8322, method27623, n, n2, 1.0f, 1.0f, 1.0f, 1.0f);
                if (!b) {
                    this.field40289.method17648().method18644(class8322, method27623, n, n2, 1.0f, 1.0f, 1.0f, 1.0f);
                }
                else {
                    Class4165.method12473(class8322, class8323, n, n2, this.field40289.method17648(), class8324, false, Class465.method2387(Class4100.method12343(class8321), Class465.method2382(class8321)));
                }
                class8322.method22568();
            }
        }
        else {
            final Block method27624 = ((Class4036)method27622).method12240();
            if (!(method27624 instanceof Class3932)) {
                Object o;
                if (!(method27624 instanceof Class3944)) {
                    if (!(method27624 instanceof Class3900)) {
                        if (method27624 != Class7521.field29759) {
                            if (method27624 != Class7521.field29292) {
                                if (method27624 != Class7521.field29409) {
                                    if (method27624 != Class7521.field29468) {
                                        if (!(method27624 instanceof Class3942)) {
                                            return;
                                        }
                                        final Class181 method27625 = Class3942.method12057(method27622);
                                        if (method27625 != null) {
                                            o = Class9388.field40280[method27625.method813()];
                                        }
                                        else {
                                            o = Class9388.field40281;
                                        }
                                    }
                                    else {
                                        o = this.field40284;
                                    }
                                }
                                else {
                                    o = this.field40285;
                                }
                            }
                            else {
                                o = this.field40283;
                            }
                        }
                        else {
                            o = this.field40288;
                        }
                    }
                    else {
                        this.field40287.method2214(((Class3900)method27624).method11993());
                        o = this.field40287;
                    }
                }
                else {
                    this.field40286.method2383(class8321, ((Class3944)method27624).method12064());
                    o = this.field40286;
                }
                Class9550.field41126.method35728(o, class8322, class8323, n, n2);
            }
            else {
                GameProfile gameProfile = null;
                if (class8321.method27656()) {
                    final CompoundNBT method27626 = class8321.method27657();
                    if (!method27626.contains("SkullOwner", 10)) {
                        if (method27626.contains("SkullOwner", 8)) {
                            if (!StringUtils.isBlank((CharSequence)method27626.getString("SkullOwner"))) {
                                gameProfile = Class493.method2508(new GameProfile((UUID)null, method27626.getString("SkullOwner")));
                                method27626.remove("SkullOwner");
                                method27626.put("SkullOwner", Class9346.method34641(new CompoundNBT(), gameProfile));
                            }
                        }
                    }
                    else {
                        gameProfile = Class9346.method34640(method27626.getCompound("SkullOwner"));
                    }
                }
                Class4174.method12498(null, 180.0f, ((Class3932)method27624).method12050(), gameProfile, 0.0f, class8322, class8323, n);
            }
        }
    }
    
    static {
        field40280 = Arrays.stream(Class181.values()).sorted(Comparator.comparingInt(Class181::method813)).map((Function<? super Class181, ?>)Class440::new).toArray(Class440[]::new);
        field40281 = new Class440((Class181)null);
        field40282 = new Class9388();
    }
}
