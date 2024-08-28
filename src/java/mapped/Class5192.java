package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.event.impl.Class4418;
import com.mentalfrostbyte.jello.event.impl.Class4420;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import org.lwjgl.opengl.GL11;

import java.util.*;

public class Class5192 extends Module {
    public List<Class7871> field23499 = new ArrayList<Class7871>();
    public Set<Class7481> field23500 = new HashSet<Class7481>();

    public Class5192() {
        super(ModuleCategory.RENDER, "Search", "Searches blocks through the world");
        Class6009 var3;
        this.method15972(var3 = new Class6009<Float>("Chunk Range", "Range at which search scans blocks", 5.0F, Float.class, 1.0F, 12.0F, 1.0F));
        Class6004 var4;
        this.method15972(var4 = new Class6004("Holes", "Shows 1x1 explosion protection holes", false));
        this.method15972(new Class6010("Color", "The rendered block color", Class1979.field12899.field12910, true));
        Class6003 var5;
        this.method15972(var5 = new Class6003("Blocks", "Blocks to render", true));
        var5.method18616(var1 -> this.field23499.clear());
        var3.method18616(var1 -> this.field23499.clear());
        var4.method18616(var1 -> this.field23499.clear());
    }

    @EventTarget
    public void method16163(Class4396 var1) {
        if (this.method15996()) {
            if (var1.method13898() instanceof Class5607) {
                Class5607 var4 = (Class5607) var1.method13898();
                this.method16164(mc.world.method6722(var4.method17632()).method7072());
            }

            if (var1.method13898() instanceof Class5549) {
                Class5549 var5 = (Class5549) var1.method13898();
                this.method16164(new Class7481(var5.field24642.field13027, var5.field24642.field13029));
            }

            if (var1.method13898() instanceof Class5526 && Minecraft.getInstance().world != null) {
                Class5526 var6 = (Class5526) var1.method13898();
                this.method16164(new Class7481(var6.method17378(), var6.method17379()));
            }
        }
    }

    public void method16164(Class7481 var1) {
        for (Class7871 var5 : this.field23499) {
            if (var5.method26390(var1)) {
                this.field23500.add(var5.method26392());
            }
        }
    }

    @EventTarget
    public void method16165(Class4418 var1) {
        this.field23499.clear();
        this.field23500.clear();
    }

    public List<BlockPos> method16166(Class7481 var1) {
        ArrayList var4 = new ArrayList();
        int var5 = var1.field32174 * 16;
        int var6 = var1.field32175 * 16;
        byte var7 = 1;
        int var8 = var5 + 15;
        int var9 = var6 + 15;
        short var10 = 255;

        for (float var11 = var7; var11 <= (float) var10 && !(var11 > 100.0F); var11++) {
            for (float var12 = (float) var5; var12 <= (float) var8; var12++) {
                for (float var13 = (float) var6; var13 <= (float) var9; var13++) {
                    BlockPos var14 = new BlockPos(var12, var11, var13);
                    var4.add(var14);
                }
            }
        }

        return var4;
    }

    public List<BlockPos> method16167(Class7481 var1) {
        ArrayList var4 = new ArrayList();
        if (var1 == null) {
            return null;
        } else {
            List var5 = (List) this.method15973("Blocks");

            for (BlockPos var7 : this.method16166(var1)) {
                String var8 = Class2348.field16072.method9181(mc.world.method6738(var7).method23383()).toString();
                if (var5.contains(var8)) {
                    var4.add(var7);
                }
            }

            if (this.method15974("Holes")) {
                label57:
                for (BlockPos var13 : this.method16166(var1)) {
                    if (mc.world.method6738(var13).method23383() == Blocks.AIR) {
                        for (Direction var11 : Direction.values()) {
                            if (var11 != Direction.field673
                                    && mc.world.method6738(var13.method8337(var11.method556())).method23383() != Blocks.field36527
                                    && mc.world.method6738(var13.method8337(var11.method556())).method23383() != Blocks.BEDROCK) {
                                continue label57;
                            }
                        }

                        var4.add(var13.method8313());
                    }
                }
            }

            return var4;
        }
    }

    @EventTarget
    public void method16168(TickEvent var1) {
        if (this.method15996()) {
            if (mc.player.field5055 < 20) {
                this.field23499.clear();
            } else {
                int var4 = (int) this.method15977("Chunk Range");
                List<Class7481> var5 = new ArrayList();

                for (int var6 = -5; var6 < 5; var6++) {
                    for (int var7 = -5; var7 < 5; var7++) {
                        var5.add(new Class7481(mc.player.field5072 + var6, mc.player.field5074 + var7));
                    }
                }

                Iterator var11 = this.field23499.iterator();

                while (var11.hasNext()) {
                    Class7871 var12 = (Class7871) var11.next();
                    if (var12.method26391(new Class7481(mc.player.field5072, mc.player.field5074)) > 7
                            || this.field23500.contains(var12.method26392())) {
                        var11.remove();
                    }
                }

                this.field23500.clear();

                label52:
                for (Class7481 var8 : var5) {
                    for (Class7871 var10 : this.field23499) {
                        if (var10.method26390(var8)) {
                            continue label52;
                        }
                    }

                    this.field23499.add(new Class7871(var8.field32174, var8.field32175, this.method16167(var8)));
                    break;
                }
            }
        }
    }

    @Override
    public void isInDevelopment() {
        this.field23499.clear();
        this.field23500.clear();
    }

    @EventTarget
    public void method16169(Class4420 var1) {
        if (this.method15996()) {
            this.method16170();
        }
    }

    public void method16170() {
        int var3 = Class5628.method17688(this.method15976("Color"), 0.14F);
        GL11.glPushMatrix();
        GL11.glDisable(2929);

        for (Class7871 var5 : this.field23499) {
            for (BlockPos var7 : var5.field33732) {
                double var8 = (double) var7.method8304() - mc.gameRenderer.getActiveRenderInfo().method37504().method11320();
                double var10 = (double) var7.getY() - mc.gameRenderer.getActiveRenderInfo().method37504().method11321();
                double var12 = (double) var7.method8306() - mc.gameRenderer.getActiveRenderInfo().method37504().method11322();
                Class9388 var14 = new Class9388(var8, var10, var12, var8 + 1.0, var10 + 1.0, var12 + 1.0);
                Class3192.method11459(var14, var3);
            }
        }

        GL11.glEnable(2929);
        GL11.glPopMatrix();
    }
}
