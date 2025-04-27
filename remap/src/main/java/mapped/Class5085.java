// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5085 extends RealmsScreen
{
    private Class5065 field21910;
    public final RealmsConfigureWorldScreen field21911;
    private int field21912;
    private int field21913;
    private int field21914;
    private final Class7424 field21915;
    private final Class271 field21916;
    private final int field21917;
    private int field21918;
    private int field21919;
    private Boolean field21920;
    private Boolean field21921;
    private Boolean field21922;
    private Boolean field21923;
    private Integer field21924;
    private Boolean field21925;
    private Boolean field21926;
    private Class5611 field21927;
    private Class5611 field21928;
    private Class5611 field21929;
    private Class5611 field21930;
    private Class5609 field21931;
    private Class5611 field21932;
    private Class5611 field21933;
    public String[] field21934;
    public String[] field21935;
    public String[][] field21936;
    private Class5066 field21937;
    private Class5066 field21938;
    
    public Class5085(final RealmsConfigureWorldScreen field21911, final Class7424 field21912, final Class271 field21913, final int field21914) {
        this.field21911 = field21911;
        this.field21915 = field21912;
        this.field21916 = field21913;
        this.field21917 = field21914;
    }
    
    @Override
    public void method15442() {
        this.method15444(false);
    }
    
    @Override
    public void tick() {
        this.field21910.method15587();
    }
    
    @Override
    public boolean keyPressed(final int n, final int n2, final int n3) {
        switch (n) {
            case 256: {
                Realms.setScreen(this.field21911);
                return true;
            }
            default: {
                return super.keyPressed(n, n2, n3);
            }
        }
    }
    
    @Override
    public void init() {
        this.field21913 = 170;
        this.field21912 = this.width() / 2 - this.field21913 * 2 / 2;
        this.field21914 = this.width() / 2 + 10;
        this.method15870();
        this.field21918 = this.field21915.field28605;
        this.field21919 = this.field21915.field28606;
        if (!this.field21916.equals(Class271.field1471)) {
            String s;
            if (!this.field21916.equals(Class271.field1473)) {
                if (!this.field21916.equals(Class271.field1475)) {
                    s = RealmsScreen.getLocalizedString("mco.configure.world.edit.subscreen.experience");
                }
                else {
                    s = RealmsScreen.getLocalizedString("mco.configure.world.edit.subscreen.inspiration");
                }
            }
            else {
                s = RealmsScreen.getLocalizedString("mco.configure.world.edit.subscreen.adventuremap");
            }
            this.field21938 = new Class5066(s, this.width() / 2, 26, 16711680);
            this.field21920 = true;
            this.field21924 = 0;
            this.field21926 = false;
            this.field21922 = true;
            this.field21923 = true;
            this.field21921 = true;
            this.field21925 = true;
        }
        else {
            this.field21920 = this.field21915.field28598;
            this.field21924 = this.field21915.field28602;
            this.field21926 = this.field21915.field28604;
            this.field21922 = this.field21915.field28599;
            this.field21923 = this.field21915.field28600;
            this.field21921 = this.field21915.field28601;
            this.field21925 = this.field21915.field28603;
        }
        (this.field21910 = this.method15436(11, this.field21912 + 2, Class7869.method25488(1), this.field21913 - 4, 20, RealmsScreen.getLocalizedString("mco.configure.world.edit.slot.name"))).method15591(10);
        this.field21910.method15588(this.field21915.method22842(this.field21917));
        this.method15434(this.field21910);
        this.buttonsAdd(this.field21927 = new Class5666(this, 4, this.field21914, Class7869.method25488(1), this.field21913, 20, this.method15873()));
        this.buttonsAdd(new Class5645(this, 3, this.field21912, Class7869.method25488(3), this.field21913, 20, this.method15872()));
        this.buttonsAdd(this.field21928 = new Class5629(this, 5, this.field21914, Class7869.method25488(3), this.field21913, 20, this.method15874()));
        this.buttonsAdd(new Class5612(this, 2, this.field21912, Class7869.method25488(5), this.field21913, 20, this.method15871()));
        this.buttonsAdd(this.field21929 = new Class5626(this, 6, this.field21914, Class7869.method25488(5), this.field21913, 20, this.method15875()));
        this.buttonsAdd(this.field21931 = new Class5608(this, 8, this.field21912, Class7869.method25488(7), this.field21913, this.field21924, 0.0f, 16.0f));
        this.buttonsAdd(this.field21930 = new Class5684(this, 7, this.field21914, Class7869.method25488(7), this.field21913, 20, this.method15876()));
        this.buttonsAdd(this.field21933 = new Class5654(this, 10, this.field21912, Class7869.method25488(9), this.field21913, 20, this.method15878()));
        this.buttonsAdd(this.field21932 = new Class5652(this, 9, this.field21914, Class7869.method25488(9), this.field21913, 20, this.method15877()));
        if (!this.field21916.equals(Class271.field1471)) {
            this.field21927.method16917(false);
            this.field21928.method16917(false);
            this.field21930.method16917(false);
            this.field21929.method16917(false);
            this.field21931.method16917(false);
            this.field21932.method16917(false);
            this.field21931.method16917(false);
            this.field21933.method16917(false);
        }
        if (this.field21918 == 0) {
            this.field21929.method16917(false);
        }
        this.buttonsAdd(new Class5698(this, 1, this.field21912, Class7869.method25488(13), this.field21913, 20, RealmsScreen.getLocalizedString("mco.configure.world.buttons.done")));
        this.buttonsAdd(new Class5695(this, 0, this.field21914, Class7869.method25488(13), this.field21913, 20, RealmsScreen.getLocalizedString("gui.cancel")));
        this.method15428(this.field21910);
        this.method15428(this.field21937 = new Class5066(RealmsScreen.getLocalizedString("mco.configure.world.buttons.options"), this.width() / 2, 17, 16777215));
        if (this.field21938 != null) {
            this.method15428(this.field21938);
        }
        this.method15446();
    }
    
    private void method15870() {
        this.field21934 = new String[] { RealmsScreen.getLocalizedString("options.difficulty.peaceful"), RealmsScreen.getLocalizedString("options.difficulty.easy"), RealmsScreen.getLocalizedString("options.difficulty.normal"), RealmsScreen.getLocalizedString("options.difficulty.hard") };
        this.field21935 = new String[] { RealmsScreen.getLocalizedString("selectWorld.gameMode.survival"), RealmsScreen.getLocalizedString("selectWorld.gameMode.creative"), RealmsScreen.getLocalizedString("selectWorld.gameMode.adventure") };
        this.field21936 = new String[][] { { RealmsScreen.getLocalizedString("selectWorld.gameMode.survival.line1"), RealmsScreen.getLocalizedString("selectWorld.gameMode.survival.line2") }, { RealmsScreen.getLocalizedString("selectWorld.gameMode.creative.line1"), RealmsScreen.getLocalizedString("selectWorld.gameMode.creative.line2") }, { RealmsScreen.getLocalizedString("selectWorld.gameMode.adventure.line1"), RealmsScreen.getLocalizedString("selectWorld.gameMode.adventure.line2") } };
    }
    
    private String method15871() {
        return RealmsScreen.getLocalizedString("options.difficulty") + ": " + this.field21934[this.field21918];
    }
    
    private String method15872() {
        return RealmsScreen.getLocalizedString("selectWorld.gameMode") + ": " + this.field21935[this.field21919];
    }
    
    private String method15873() {
        return RealmsScreen.getLocalizedString("mco.configure.world.pvp") + ": " + RealmsScreen.getLocalizedString(this.field21920 ? "mco.configure.world.on" : "mco.configure.world.off");
    }
    
    private String method15874() {
        return RealmsScreen.getLocalizedString("mco.configure.world.spawnAnimals") + ": " + RealmsScreen.getLocalizedString(this.field21922 ? "mco.configure.world.on" : "mco.configure.world.off");
    }
    
    private String method15875() {
        return (this.field21918 != 0) ? (RealmsScreen.getLocalizedString("mco.configure.world.spawnMonsters") + ": " + RealmsScreen.getLocalizedString(this.field21923 ? "mco.configure.world.on" : "mco.configure.world.off")) : (RealmsScreen.getLocalizedString("mco.configure.world.spawnMonsters") + ": " + RealmsScreen.getLocalizedString("mco.configure.world.off"));
    }
    
    private String method15876() {
        return RealmsScreen.getLocalizedString("mco.configure.world.spawnNPCs") + ": " + RealmsScreen.getLocalizedString(this.field21921 ? "mco.configure.world.on" : "mco.configure.world.off");
    }
    
    private String method15877() {
        return RealmsScreen.getLocalizedString("mco.configure.world.commandBlocks") + ": " + RealmsScreen.getLocalizedString(this.field21925 ? "mco.configure.world.on" : "mco.configure.world.off");
    }
    
    private String method15878() {
        return RealmsScreen.getLocalizedString("mco.configure.world.forceGameMode") + ": " + RealmsScreen.getLocalizedString(this.field21926 ? "mco.configure.world.on" : "mco.configure.world.off");
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.method15413();
        final String method15438 = RealmsScreen.getLocalizedString("mco.configure.world.edit.slot.name");
        this.method15407(method15438, this.field21912 + this.field21913 / 2 - this.method15424(method15438) / 2, Class7869.method25488(0) - 5, 16777215);
        this.field21937.method15593(this);
        if (this.field21938 != null) {
            this.field21938.method15593(this);
        }
        this.field21910.method15590(n, n2, n3);
        super.render(n, n2, n3);
    }
    
    private String method15879() {
        return this.field21910.method15586().equals(this.field21915.method22843(this.field21917)) ? "" : this.field21910.method15586();
    }
    
    private void method15880() {
        if (!this.field21916.equals(Class271.field1473)) {
            if (!this.field21916.equals(Class271.field1474)) {
                if (!this.field21916.equals(Class271.field1475)) {
                    this.field21911.method15703(new Class7424(this.field21920, this.field21922, this.field21923, this.field21921, this.field21924, this.field21925, this.field21918, this.field21919, this.field21926, this.method15879()));
                    return;
                }
            }
        }
        this.field21911.method15703(new Class7424(this.field21915.field28598, this.field21915.field28599, this.field21915.field28600, this.field21915.field28601, this.field21915.field28602, this.field21915.field28603, this.field21918, this.field21919, this.field21915.field28604, this.method15879()));
    }
}
