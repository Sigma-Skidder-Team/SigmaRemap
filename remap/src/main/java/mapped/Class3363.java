// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

import java.util.ArrayList;

public class Class3363 extends Class3355
{
    public static int field16013;
    public static int field16014;
    public static int field16015;
    public static int field16016;
    private Class7617 field16017;
    private boolean field16018;
    private boolean field16019;
    public ArrayList<Integer> field16020;
    
    public Class3363() {
        super("InvManager", "Drops all useless items from your inventory", Class8013.field32992);
        this.field16017 = new Class7617();
        this.field16020 = new ArrayList<Integer>();
        this.method9881(new Class5001("Mode", "Mode", 0, new String[] { "Basic", "OpenInv", "FakeInv" }));
        this.method9881(new Class4996("Delay", "Inventory clicks delay", 0.3f, Float.class, 0.01f, 1.0f, 0.01f));
        this.method9881(new Class4996("Block Cap", "Maximum blocks.", 150.0f, Float.class, 0.0f, 256.0f, 10.0f));
        this.method9881(new Class5001("Clean Type", "Clean type", 0, new String[] { "Skywars", "All" }));
        this.method9881(new Class4999("Fake Items", "Bypass for fake items (AAC).", false));
        this.method9881(new Class4999("Cleaner", "Cleans your inventory.", true));
        this.method9881(new Class4999("Sword", "Keeps only sword as weapon.", true));
        this.method9881(new Class5001("Tools", "How tools are handled.", 0, new String[] { "Keep", "Organize", "Throw" }));
        this.method9881(new Class4999("Archery", "Cleans bows and arrows.", true));
        this.method9881(new Class4999("Food", "Cleans food. Keeps Golden Apples.", false));
        this.method9881(new Class4999("Heads", "Cleans Heads.", false));
        this.method9881(new Class4999("Auto Shield", "Automatically equip shields for 1.9+.", false));
    }
    
    @Override
    public void method9879() {
        this.field16018 = (Class3363.field15514.field4700 instanceof Class518);
        this.field16019 = false;
    }
    
    @Class6753
    public void method10666(final Class5743 class5743) {
        if (!this.field16017.method23937()) {
            this.field16017.method23932();
        }
        if (!this.method9906() || Class3350.field15966) {
            return;
        }
        final String method9887 = this.method9887("Mode");
        if (this.method9887("Mode").equals("OpenInv") && !(Class3363.field15514.field4700 instanceof Class518)) {
            return;
        }
        final long n = (long)(this.method9886("Delay") * 1000.0f);
        if (Class3363.field15514.field4700 instanceof Class518) {
            this.field16018 = false;
        }
        if (this.field16019 && this.field16017.method23935() >= n) {
            this.field16019 = !this.field16019;
            this.method10682(this.field16018);
            Class8639.method29367(Class3363.field15514.field4684.field3008.field16154, 45, 0, Class2133.field12437, Class3363.field15514.field4684, true);
            this.field16017.method23934();
            return;
        }
        Label_0189: {
            if (Class3363.field15514.field4700 != null) {
                if (!(Class3363.field15514.field4700 instanceof Class518)) {
                    if (!(Class3363.field15514.field4700 instanceof Class535)) {
                        break Label_0189;
                    }
                }
            }
            if (this.field16017.method23935() > n) {
                if (Class3363.field16013 >= 36) {
                    if (Class3363.field15514.field4684.field3008.method10878(Class3363.field16013).method20054()) {
                        if (!method10667(Class3363.field15514.field4684.field3008.method10878(Class3363.field16013).method20053())) {
                            this.method10668(Class3363.field16013, method9887.equals("FakeInv"));
                        }
                    }
                    else {
                        this.method10668(Class3363.field16013, method9887.equals("FakeInv"));
                    }
                }
            }
            final boolean equals = this.method9887("Tools").equals("Organize");
            if (this.field16017.method23935() >= n) {
                if (Class3363.field16014 >= 36) {
                    if (equals) {
                        this.method10674(Class3363.field16014, method9887.equals("FakeInv"));
                    }
                }
            }
            if (this.field16017.method23935() >= n) {
                if (Class3363.field16016 >= 36) {
                    if (equals) {
                        this.method10675(Class3363.field16016, method9887.equals("FakeInv"));
                    }
                }
            }
            if (this.field16017.method23935() >= n) {
                if (Class3363.field16015 >= 36) {
                    if (equals) {
                        this.method10676(Class3363.field16015, method9887.equals("FakeInv"));
                    }
                }
            }
            if (this.field16017.method23935() >= n) {
                if (this.method9883("Auto Shield")) {
                    this.method10677(method9887.equals("FakeInv"));
                }
            }
            if (this.field16017.method23935() >= n) {
                if (this.method9883("Cleaner")) {
                    for (int i = 9; i < 45; ++i) {
                        if (Class3363.field15514.field4684.field3008.method10878(i).method20054()) {
                            if (this.method10670(Class3363.field15514.field4684.field3008.method10878(i).method20053(), i)) {
                                this.method10682(method9887.equals("FakeInv"));
                                Class8639.method29368(i);
                                this.field16017.method23934();
                                if (n > 0L) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!this.field16018) {
            if (!(Class3363.field15514.field4700 instanceof Class518)) {
                if (this.field16017.method23935() > 0L) {
                    if (!this.field16019) {
                        this.field16018 = true;
                        Class3363.field15514.method5269().method17292(new Class4389(-1));
                    }
                }
            }
        }
    }
    
    public static boolean method10667(final ItemStack class8321) {
        final float method10669 = method10669(class8321);
        final Class3167 method10670 = Class9463.method35173().method35189().method21551(Class3363.class);
        for (int i = 9; i < 45; ++i) {
            if (Class3363.field15514.field4684.field3008.method10878(i).method20054()) {
                final ItemStack method10671 = Class3363.field15514.field4684.field3008.method10878(i).method20053();
                if (method10669(method10671) > method10669) {
                    if (method10671.method27622() instanceof Class4077 || !method10670.method9883("Sword")) {
                        return false;
                    }
                }
            }
        }
        return class8321.method27622() instanceof Class4077 || !method10670.method9883("Sword");
    }
    
    public void method10668(final int n, final boolean b) {
        for (int i = 9; i < 45; ++i) {
            if (Class3363.field15514.field4684.field3008.method10878(i).method20054()) {
                final ItemStack method20053 = Class3363.field15514.field4684.field3008.method10878(i).method20053();
                if (method10667(method20053)) {
                    if (method10669(method20053) > 0.0f) {
                        if (method20053.method27622() instanceof Class4077 || !this.method9883("Sword")) {
                            this.method10682(b);
                            Class8639.method29370(i, n - 36);
                            this.field16017.method23934();
                            break;
                        }
                    }
                }
            }
        }
    }
    
    public static float method10669(final ItemStack class8321) {
        float n = 0.0f;
        final Class3820 method27622 = class8321.method27622();
        if (method27622 instanceof Class4072) {
            n += ((Class4072)method27622).method11709();
        }
        if (method27622 instanceof Class4077) {
            n += ((Class4077)method27622).method12281();
        }
        return n + (Class8742.method30195(Class7882.field32358, class8321) * 1.25f + Class8742.method30195(Class7882.field32362, class8321) * 0.01f);
    }
    
    public boolean method10670(final ItemStack class8321, final int n) {
        final Class3820 method27622 = class8321.method27622();
        if (!class8321.method27664().getFormattedText().toLowerCase().contains("(right click)")) {
            if (!class8321.method27664().getFormattedText().toLowerCase().contains("(clique direito)")) {
                if (!class8321.method27664().getFormattedText().toLowerCase().contains("(click derecho)")) {
                    if (class8321.method27664().getFormattedText().toLowerCase().contains("§k||")) {
                        return false;
                    }
                    if (n == Class3363.field16013 && method10667(Class3363.field15514.field4684.field3008.method10878(n).method20053())) {
                        return false;
                    }
                    if (method27622 instanceof Class4100 && this.method9883("Auto Shield")) {
                        return false;
                    }
                    Label_0126: {
                        if (!this.method9887("Tools").equals("Throw")) {
                            if (n == Class3363.field16014 || this.method9887("Tools").equals("Keep")) {
                                if (method10678(Class3363.field15514.field4684.field3008.method10878(n).method20053())) {
                                    if (Class3363.field16014 >= 0) {
                                        return false;
                                    }
                                }
                            }
                            if (n == Class3363.field16015 || this.method9887("Tools").equals("Keep")) {
                                if (method10680(Class3363.field15514.field4684.field3008.method10878(n).method20053())) {
                                    if (Class3363.field16015 >= 0) {
                                        return false;
                                    }
                                }
                            }
                            if (n != Class3363.field16016 && !this.method9887("Tools").equals("Keep")) {
                                break Label_0126;
                            }
                            if (!method10679(Class3363.field15514.field4684.field3008.method10878(n).method20053())) {
                                break Label_0126;
                            }
                            if (Class3363.field16016 < 0) {
                                break Label_0126;
                            }
                            return false;
                        }
                    }
                    if (method27622 instanceof Class4055) {
                        if (Class8639.method29344(n)) {
                            return false;
                        }
                        for (final Class2215 class8322 : Class2215.values()) {
                            if (Class3363.field15514.field4684.field3008.method10878(8 - class8322.method8402()).method20054()) {
                                if (!Class8639.method29369(Class3363.field15514.field4684.field3008.method10878(8 - class8322.method8402()).method20053())) {}
                            }
                        }
                    }
                    if (method27622 instanceof Class4036 && (this.method10672() > (int)this.method9886("Block Cap") || Class3260.field15749.contains(((Class4036)method27622).method12240()))) {
                        return true;
                    }
                    if (method27622 == Class7739.field31350 && Class9463.method35173().method35189().method21551(Class3361.class).method9906()) {
                        return method10673(Class7739.field31350) > 1;
                    }
                    if (method27622 == Class7739.field31349 && Class9463.method35173().method35189().method21551(Class3361.class).method9906()) {
                        return method10673(Class7739.field31349) > 1;
                    }
                    if (method27622 instanceof Class4089 && Class8639.method29371(class8321)) {
                        return true;
                    }
                    if (method27622 != Class7739.field31342) {
                        if (method27622.method11743()) {
                            if (this.method9883("Food")) {
                                if (method27622.method11744() != Class9582.field41767) {
                                    return true;
                                }
                            }
                        }
                        if (!(method27622 instanceof Class4076)) {
                            if (!(method27622 instanceof Class4072)) {
                                if (!(method27622 instanceof Class4077)) {
                                    if (!(method27622 instanceof Class4055)) {
                                        if (method27622 instanceof Class4087 || method27622 instanceof Class3824) {
                                            if (this.method9883("Archery")) {
                                                return true;
                                            }
                                        }
                                        if (method27622 instanceof Class4046 && this.method9883("Heads")) {
                                            return true;
                                        }
                                        if (!method27622.method11715().getFormattedText().toLowerCase().contains("tnt")) {
                                            if (!method27622.method11715().getFormattedText().toLowerCase().contains("stick")) {
                                                if (!method27622.method11715().getFormattedText().toLowerCase().contains("egg")) {
                                                    if (!method27622.method11715().getFormattedText().toLowerCase().contains("string")) {
                                                        if (!method27622.method11715().getFormattedText().toLowerCase().contains("cake")) {
                                                            if (!method27622.method11715().getFormattedText().toLowerCase().contains("mushroom")) {
                                                                if (!method27622.method11715().getFormattedText().toLowerCase().contains("flint")) {
                                                                    if (!method27622.method11715().getFormattedText().toLowerCase().contains("dyePowder")) {
                                                                        if (!method27622.method11715().getFormattedText().toLowerCase().contains("feather")) {
                                                                            if (!method27622.method11715().getFormattedText().toLowerCase().contains("bucket")) {
                                                                                if (!method27622.method11715().getFormattedText().toLowerCase().contains("chest") || class8321.method27664().getFormattedText().toLowerCase().contains("collect")) {
                                                                                    if (!method27622.method11715().getFormattedText().toLowerCase().contains("snow")) {
                                                                                        if (!method27622.method11715().getFormattedText().toLowerCase().contains("fish")) {
                                                                                            if (!method27622.method11715().getFormattedText().toLowerCase().contains("enchant")) {
                                                                                                if (!method27622.method11715().getFormattedText().toLowerCase().contains("exp")) {
                                                                                                    if (!method27622.method11715().getFormattedText().toLowerCase().contains("shears")) {
                                                                                                        if (!method27622.method11715().getFormattedText().toLowerCase().contains("anvil")) {
                                                                                                            if (!method27622.method11715().getFormattedText().toLowerCase().contains("torch")) {
                                                                                                                if (!method27622.method11715().getFormattedText().toLowerCase().contains("seeds")) {
                                                                                                                    if (!method27622.method11715().getFormattedText().toLowerCase().contains("leather")) {
                                                                                                                        if (!method27622.method11715().getFormattedText().toLowerCase().contains("reeds")) {
                                                                                                                            if (!method27622.method11715().getFormattedText().toLowerCase().contains("record")) {
                                                                                                                                if (!method27622.method11715().getFormattedText().toLowerCase().contains("snowball")) {
                                                                                                                                    if (!(method27622 instanceof Class4064)) {
                                                                                                                                        if (method27622 != Class7739.field31371) {
                                                                                                                                            if (method27622 != Class7739.field31308) {
                                                                                                                                                if (!method27622.method11715().getFormattedText().toLowerCase().contains("piston")) {
                                                                                                                                                    return false;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        return true;
                                    }
                                }
                            }
                        }
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }
    
    public ArrayList<Integer> method10671() {
        return this.field16020;
    }
    
    private int method10672() {
        int n = 0;
        for (int i = 0; i < 45; ++i) {
            if (Class3363.field15514.field4684.field3008.method10878(i).method20054()) {
                final ItemStack method20053 = Class3363.field15514.field4684.field3008.method10878(i).method20053();
                final Class3820 method20054 = method20053.method27622();
                if (method20053.method27622() instanceof Class4036) {
                    if (!Class3260.field15749.contains(((Class4036)method20054).method12240())) {
                        n += method20053.field34176;
                    }
                }
            }
        }
        return n;
    }
    
    public static int method10673(final Class3820 class3820) {
        int n = 0;
        for (int i = 0; i < 45; ++i) {
            if (Class3363.field15514.field4684.field3008.method10878(i).method20054()) {
                final ItemStack method20053 = Class3363.field15514.field4684.field3008.method10878(i).method20053();
                if (method20053.method27622() == class3820) {
                    n += method20053.field34176;
                }
            }
        }
        return n;
    }
    
    private void method10674(final int n, final boolean b) {
        for (int i = 9; i < 45; ++i) {
            if (Class3363.field15514.field4684.field3008.method10878(i).method20054()) {
                final ItemStack method20053 = Class3363.field15514.field4684.field3008.method10878(i).method20053();
                if (method10678(method20053)) {
                    if (Class3363.field16014 != i) {
                        if (!method10667(method20053)) {
                            if (Class3363.field15514.field4684.field3008.method10878(Class3363.field16014).method20054()) {
                                if (!method10678(Class3363.field15514.field4684.field3008.method10878(Class3363.field16014).method20053())) {
                                    this.method10682(b);
                                    Class8639.method29370(i, Class3363.field16014 - 36);
                                    this.field16017.method23934();
                                    if (this.method9886("Delay") > 0.0f) {
                                        return;
                                    }
                                }
                            }
                            else {
                                this.method10682(b);
                                Class8639.method29370(i, Class3363.field16014 - 36);
                                this.field16017.method23934();
                                if (this.method9886("Delay") > 0.0f) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void method10675(final int n, final boolean b) {
        for (int i = 9; i < 45; ++i) {
            if (Class3363.field15514.field4684.field3008.method10878(i).method20054()) {
                final ItemStack method20053 = Class3363.field15514.field4684.field3008.method10878(i).method20053();
                if (method10679(method20053)) {
                    if (Class3363.field16016 != i) {
                        if (!method10667(method20053)) {
                            if (Class3363.field15514.field4684.field3008.method10878(Class3363.field16016).method20054()) {
                                if (!method10679(Class3363.field15514.field4684.field3008.method10878(Class3363.field16016).method20053())) {
                                    this.method10682(b);
                                    Class8639.method29370(i, Class3363.field16016 - 36);
                                    this.field16017.method23934();
                                    if (this.method9886("Delay") > 0.0f) {
                                        return;
                                    }
                                }
                            }
                            else {
                                this.method10682(b);
                                Class8639.method29370(i, Class3363.field16016 - 36);
                                this.field16017.method23934();
                                if (this.method9886("Delay") > 0.0f) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void method10676(final int n, final boolean b) {
        for (int i = 9; i < 45; ++i) {
            if (Class3363.field15514.field4684.field3008.method10878(i).method20054()) {
                final ItemStack method20053 = Class3363.field15514.field4684.field3008.method10878(i).method20053();
                if (method10680(method20053)) {
                    if (Class3363.field16015 != i) {
                        if (!method10667(method20053)) {
                            if (Class3363.field15514.field4684.field3008.method10878(Class3363.field16015).method20054()) {
                                if (!method10680(Class3363.field15514.field4684.field3008.method10878(Class3363.field16015).method20053())) {
                                    this.method10682(b);
                                    Class8639.method29370(i, Class3363.field16015 - 36);
                                    this.field16017.method23934();
                                    if (this.method9886("Delay") > 0.0f) {
                                        return;
                                    }
                                }
                            }
                            else {
                                this.method10682(b);
                                Class8639.method29370(i, Class3363.field16015 - 36);
                                this.field16017.method23934();
                                if (this.method9886("Delay") > 0.0f) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void method10677(final boolean b) {
        if (!Class3363.field15514.field4684.field3008.method10878(45).method20054()) {
            for (int i = 9; i < 45; ++i) {
                if (Class3363.field15514.field4684.field3008.method10878(i).method20053().method27622() instanceof Class4100) {
                    this.method10682(b);
                    this.field16017.method23934();
                    Class8639.method29367(Class3363.field15514.field4684.field3008.field16154, i, 0, Class2133.field12437, Class3363.field15514.field4684, true);
                    this.field16019 = true;
                    return;
                }
            }
        }
    }
    
    public static boolean method10678(final ItemStack class8321) {
        if (class8321.method27622() instanceof Class4073) {
            final float method10681 = method10681(class8321);
            for (int i = 9; i < 45; ++i) {
                if (Class3363.field15514.field4684.field3008.method10878(i).method20054()) {
                    final ItemStack method10682 = Class3363.field15514.field4684.field3008.method10878(i).method20053();
                    if (method10681(method10682) > method10681) {
                        if (method10682.method27622() instanceof Class4073) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public static boolean method10679(final ItemStack class8321) {
        if (class8321.method27622() instanceof Class4074) {
            final float method10681 = method10681(class8321);
            for (int i = 9; i < 45; ++i) {
                if (Class3363.field15514.field4684.field3008.method10878(i).method20054()) {
                    final ItemStack method10682 = Class3363.field15514.field4684.field3008.method10878(i).method20053();
                    if (method10681(method10682) > method10681) {
                        if (method10682.method27622() instanceof Class4074) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public static boolean method10680(final ItemStack class8321) {
        if (class8321.method27622() instanceof Class4075) {
            final float method10681 = method10681(class8321);
            for (int i = 9; i < 45; ++i) {
                if (Class3363.field15514.field4684.field3008.method10878(i).method20054()) {
                    final ItemStack method10682 = Class3363.field15514.field4684.field3008.method10878(i).method20053();
                    if (method10681(method10682) > method10681) {
                        if (method10682.method27622() instanceof Class4075) {
                            if (!method10667(class8321)) {
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public static float method10681(final ItemStack class8321) {
        final Class3820 method27622 = class8321.method27622();
        if (method27622 instanceof Class4072) {
            final String lowerCase = method27622.method11715().getFormattedText().toLowerCase();
            final Class4072 class8322 = (Class4072)method27622;
            float n;
            if (!(method27622 instanceof Class4073)) {
                if (!(method27622 instanceof Class4074)) {
                    if (!(method27622 instanceof Class4075)) {
                        return 1.0f;
                    }
                    n = class8322.method11706(class8321, Class7521.field29181.method11878());
                    if (lowerCase.toLowerCase().contains("gold")) {
                        n -= 5.0f;
                    }
                }
                else {
                    n = class8322.method11706(class8321, Class7521.field29156.method11878());
                    if (lowerCase.toLowerCase().contains("gold")) {
                        n -= 5.0f;
                    }
                }
            }
            else {
                n = class8322.method11706(class8321, Class7521.field29148.method11878());
                if (lowerCase.toLowerCase().contains("gold")) {
                    n -= 5.0f;
                }
            }
            return (float)((float)(n + Class8742.method30195(Class7882.field32365, class8321) * 0.0075) + Class8742.method30195(Class7882.field32367, class8321) / 100.0);
        }
        return 0.0f;
    }
    
    private void method10682(final boolean b) {
        if (b) {
            if (this.field16018) {
                if (!(Class3363.field15514.field4700 instanceof Class518)) {
                    Class3363.field15514.method5269().method17292(new Class4323(Class2218.field13623));
                    this.field16018 = false;
                }
            }
        }
    }
    
    static {
        Class3363.field16013 = 36;
        Class3363.field16014 = 37;
        Class3363.field16015 = 38;
        Class3363.field16016 = 39;
    }
}
