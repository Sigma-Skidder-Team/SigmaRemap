// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class3174 extends Class3167
{
    public Class8013 field15535;
    public Class3167 field15536;
    private String field15537;
    
    public Class3174() {
        super(Class8013.field32990, "VClip", "Climp Walls like spiders!");
        this.field15537 = ">";
    }
    
    @Class6753
    private void method9943(final Class5748 class5748) {
        if (this.method9906()) {
            if (Class3174.field15514.field4648.field23440.method1056()) {
                if (class5748.method17055() == Class1958.field10672) {
                    if (Class3174.field15514.field4684.rotationPitch >= 0.0f) {
                        this.method9948(this.method9946());
                    }
                    else {
                        this.method9948(this.method9947());
                    }
                }
            }
        }
    }
    
    @Class6753
    private void method9944(final Class5721 class5721) {
        if (class5721.method16990() instanceof Class4317) {
            final String method12973 = ((Class4317)class5721.method16990()).method12973();
            final String s = "hclip";
            if (!method12973.startsWith("/" + s)) {
                return;
            }
            class5721.method16961(true);
            int int1 = 0;
            final String replaceAll = method12973.replace("/" + s, "").replaceAll("\\s", "");
            if (method9945(replaceAll)) {
                int1 = Integer.parseInt(replaceAll);
            }
            final float n = (float)Math.toRadians(Class3174.field15514.field4684.rotationYaw + 90.0f);
            Class3174.field15514.field4684.setPosition(Class3174.field15514.field4684.posX + MathHelper.cos(n) * int1, Class3174.field15514.field4684.posY, Class3174.field15514.field4684.posZ + MathHelper.sin(n) * int1);
        }
    }
    
    public static boolean method9945(final String s) {
        return s.matches("-?\\d+(\\.\\d+)?");
    }
    
    private int method9946() {
        boolean method21723 = false;
        int n = 0;
        for (int i = 0; i < 10; ++i) {
            final BlockPos class354 = new BlockPos(Class3174.field15514.field4684.posX, Class3174.field15514.field4684.posY - i, Class3174.field15514.field4684.posZ);
            if (Class3174.field15514.field4683.method6701(class354).method21723() && method21723) {
                n = -i;
                break;
            }
            method21723 = Class3174.field15514.field4683.method6701(class354).method21723();
        }
        return n;
    }
    
    private int method9947() {
        boolean method21723 = false;
        int n = 0;
        for (int i = 10; i > 0; --i) {
            final BlockPos class354 = new BlockPos(Class3174.field15514.field4684.posX, Class3174.field15514.field4684.posY + i, Class3174.field15514.field4684.posZ);
            if (Class3174.field15514.field4683.method6701(class354).method21723()) {
                if (method21723) {
                    if (!Class3174.field15514.field4683.method6701(class354.method1139()).method21723()) {
                        n = i;
                        break;
                    }
                }
            }
            method21723 = Class3174.field15514.field4683.method6701(class354).method21723();
        }
        return n;
    }
    
    private void method9948(final int i) {
        if (i == 0) {
            Class6430.method19106("§cCouldn't VClip");
        }
        else {
            Class3174.field15514.method5269().method17292(new Class4354(Class3174.field15514.field4684.posX, Class3174.field15514.field4684.posY + i, Class3174.field15514.field4684.posZ, false));
            Class3174.field15514.field4684.setPosition(Class3174.field15514.field4684.posX, Class3174.field15514.field4684.posY + i, Class3174.field15514.field4684.posZ);
            Class9463.method35173().method35197().method25776(new Class6224("Successfuly VCliped", i + " Blocks", 2000, Class7853.field32190));
        }
    }
}
