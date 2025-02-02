// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.ModuleWithSettings;
import com.mentalfrostbyte.jello.mods.impl.movement.Fly;
import com.mentalfrostbyte.jello.mods.impl.movement.LongJump;
import com.mentalfrostbyte.jello.mods.impl.world.Disabler;

import java.util.Random;

public class Class9171
{
    public Minecraft field38851;
    public static boolean field38852;
    
    public Class9171() {
        this.field38851 = Minecraft.method5277();
        Client.getInstance().method35188().method21094(this);
    }
    
    @EventListener
    @Class6754
    public void method33483(final Class5732 class5732) {
        final ModuleWithSettings class5733 = (ModuleWithSettings) Client.getInstance().method35189().method21551(Fly.class);
        final ModuleWithSettings class5734 = (ModuleWithSettings) Client.getInstance().method35189().method21551(Disabler.class);
        final ModuleWithSettings class5735 = (ModuleWithSettings) Client.getInstance().method35189().method21551(LongJump.class);
        boolean field38852 = false;
        Label_0165: {
            Label_0054: {
                if (ColorUtils.method19146()) {
                    Label_0089: {
                        if (class5733.getStringSettingValueByName("Type").equalsIgnoreCase("Hypixel")) {
                            if (class5733.method10260().getStringSettingValueByName("Mode").equals("Fast")) {
                                break Label_0089;
                            }
                            if (class5733.method10260().getStringSettingValueByName("Mode").equals("NoDmg")) {
                                break Label_0089;
                            }
                        }
                        if (!class5734.getStringSettingValueByName("Type").equalsIgnoreCase("Hypixel")) {
                            if (!class5735.getStringSettingValueByName("Type").equalsIgnoreCase("Hypixel")) {
                                break Label_0054;
                            }
                        }
                    }
                    field38852 = true;
                    break Label_0165;
                }
            }
            field38852 = false;
        }
        Class9171.field38852 = field38852;
    }
    
    @EventListener
    @Class6754
    public void method33484(final UpdateWalkingEvent updateWalkingEvent) {
        if (this.field38851.method5282() != null && Class9171.field38852) {
            final Class6999 class5745 = new Class6999();
            class5745.field27302 = true;
            class5745.field27303 = true;
            class5745.field27301 = true;
            class5745.field27304 = true;
            class5745.method21426((float)(3.0 + Math.random()));
            this.field38851.method5269().method17292(new Class4358(class5745));
        }
    }
    
    @EventListener
    @Class6754
    public void method33485(final Class5723 class5723) {
        if (this.field38851.method5282() != null && Class9171.field38852) {
            final IPacket method16998 = class5723.method16998();
            if (method16998 instanceof Class4396) {
                class5723.method16999(new Class4396(Integer.MIN_VALUE + new Random().nextInt(100)));
            }
            if (method16998 instanceof Class4393) {
                final Class4393 class5724 = (Class4393)method16998;
                if (class5724.method13209() < 0) {
                    class5723.method16999(new Class4393(Integer.MAX_VALUE, class5724.method13209(), false));
                }
            }
        }
    }
    
    static {
        Class9171.field38852 = false;
    }
}
