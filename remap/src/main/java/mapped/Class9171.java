// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class9171
{
    public Class869 field38851;
    public static boolean field38852;
    
    public Class9171() {
        this.field38851 = Class869.method5277();
        Class9463.method35173().method35188().method21094(this);
    }
    
    @Class6753
    @Class6754
    public void method33483(final Class5732 class5732) {
        final Class3247 class5733 = (Class3247)Class9463.method35173().method35189().method21551(Class3259.class);
        final Class3247 class5734 = (Class3247)Class9463.method35173().method35189().method21551(Class3251.class);
        final Class3247 class5735 = (Class3247)Class9463.method35173().method35189().method21551(Class3257.class);
        boolean field38852 = false;
        Label_0165: {
            Label_0054: {
                if (Class6430.method19146()) {
                    Label_0089: {
                        if (class5733.method9887("Type").equalsIgnoreCase("Hypixel")) {
                            if (class5733.method10260().method9887("Mode").equals("Fast")) {
                                break Label_0089;
                            }
                            if (class5733.method10260().method9887("Mode").equals("NoDmg")) {
                                break Label_0089;
                            }
                        }
                        if (!class5734.method9887("Type").equalsIgnoreCase("Hypixel")) {
                            if (!class5735.method9887("Type").equalsIgnoreCase("Hypixel")) {
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
    
    @Class6753
    @Class6754
    public void method33484(final Class5744 class5744) {
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
    
    @Class6753
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
