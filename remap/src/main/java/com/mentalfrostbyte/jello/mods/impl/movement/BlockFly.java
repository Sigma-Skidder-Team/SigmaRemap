// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.ModuleWithSettings;
import com.mentalfrostbyte.jello.mods.impl.movement.blockflys.NCPBlockFly;
import com.mentalfrostbyte.jello.mods.impl.movement.blockflys.AACBlockFly;
import com.mentalfrostbyte.jello.mods.impl.movement.blockflys.HypixelBlockFly;
import com.mentalfrostbyte.jello.mods.impl.movement.speeds.HypixelSpeed;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import mapped.*;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;
import java.util.Arrays;
import java.util.List;

public class BlockFly extends ModuleWithSettings
{
    public static List<Block> field15749;
    public int field15750;
    public Class9572 field15751;
    public int field15752;
    
    public BlockFly() {
        super(Category.MOVEMENT, "BlockFly", "Allows you to automatically bridge", new Module[] { new NCPBlockFly(), new AACBlockFly(), new HypixelBlockFly() });
        this.field15751 = new Class9572(114, 114, Class2186.field12965);
        this.field15752 = 0;
        this.addSetting(new StringSetting("ItemSpoof", "Item spoofing mode", 2, new String[] { "None", "Switch", "Spoof", "LiteSpoof" }));
        this.addSetting(new StringSetting("Tower Mode", "Tower mode", 1, new String[] { "None", "NCP", "AAC", "Cubecraft" }).setPremiumMode("Cubecraft"));
        this.addSetting(new StringSetting("Picking mode", "The way you will pick blocks in your inventory.", 0, new String[] { "Basic", "FakeInv", "OpenInv" }));
        this.addSetting(new BooleanSetting("Tower while moving", "Allows you to tower while moving.", false));
        this.addSetting(new BooleanSetting("Show Block Amount", "Shows the amount of blocks in your inventory.", true));
        this.addSetting(new BooleanSetting("NoSwing", "Removes the swing animation.", true));
        this.addSetting(new BooleanSetting("Intelligent Block Picker", "Always get the biggest blocks stack.", true));
        this.addSetting(new BooleanSetting("No Sprint", "Disable sprint.", false));
        BlockFly.field15749 = Arrays.asList(Blocks.AIR, Blocks.field29173, Blocks.field29174, Blocks.field29398, Blocks.field29545, Blocks.field29382, Blocks.field29381, Blocks.field29330, Blocks.field29548, Blocks.CHEST, Blocks.field29468, Blocks.TORCH, Blocks.field29465, Blocks.field29468, Blocks.field29220, Blocks.field29335, Blocks.TNT, Blocks.REDSTONE_WIRE, Blocks.field29316, Blocks.field29418, Blocks.field29336, Blocks.field29553, Blocks.field29411, Blocks.field29410, Blocks.field29308, Blocks.field29393, Blocks.RED_MUSHROOM, Blocks.BROWN_MUSHROOM, Blocks.field29388, Blocks.field29366, Blocks.field29307, Blocks.field29299, Blocks.field29175, Blocks.field29332, Blocks.field29216, Blocks.field29481, Blocks.CRAFTING_TABLE, Blocks.field29240, Blocks.field29337, Blocks.field29170);
    }
    
    public boolean method10278() {
        return this.method9883("No Sprint") && this.method9906();
    }
    
    public static boolean method10279(final Item class3820) {
        if (!(class3820 instanceof Class4036)) {
            return false;
        }
        final Block method12240 = ((Class4036)class3820).method12240();
        if (!BlockFly.field15749.contains(method12240)) {
            if (!(method12240 instanceof Class3905)) {
                if (!(method12240 instanceof Class3874)) {
                    if (!(method12240 instanceof Class3894)) {
                        if (!(method12240 instanceof Class4000)) {
                            if (!(method12240 instanceof Class3989)) {
                                if (!(method12240 instanceof Class3992)) {
                                    if (!(method12240 instanceof Class3936)) {
                                        if (!(method12240 instanceof Class3900)) {
                                            if (!(method12240 instanceof Class3841)) {
                                                if (!(method12240 instanceof Class3865)) {
                                                    return true;
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
        return false;
    }
    
    public void method10280() {
        try {
            int i = 36;
            while (i < 45) {
                final int n = i - 36;
                if (BlockFly.mc.player.field3008.method10878(i).method20054() && method10279(BlockFly.mc.player.field3008.method10878(i).method20053().getItem()) && BlockFly.mc.player.field3008.method10878(i).method20053().field34176 != 0) {
                    if (BlockFly.mc.player.field3006.field2743 == n) {
                        return;
                    }
                    BlockFly.mc.player.field3006.field2743 = n;
                    if (this.method9887("ItemSpoof").equals("LiteSpoof") && (this.field15750 < 0 || this.field15750 != n)) {
                        BlockFly.mc.method5269().getNetworkManager().method11174(new Class4321(n));
                        this.field15750 = n;
                        break;
                    }
                    break;
                }
                else {
                    ++i;
                }
            }
        }
        catch (final Exception ex) {}
    }
    
    public int method10281() {
        int n = 0;
        for (int i = 0; i < 45; ++i) {
            if (BlockFly.mc.player.field3008.method10878(i).method20054()) {
                final ItemStack method20053 = BlockFly.mc.player.field3008.method10878(i).method20053();
                if (method10279(method20053.getItem())) {
                    n += method20053.field34176;
                }
            }
        }
        return n;
    }
    
    public void method10282() {
        final String method9887 = this.method9887("Picking mode");
        if ((!method9887.equals("OpenInv") || BlockFly.mc.field4700 instanceof Class518) && this.method10281() != 0) {
            int n = 43;
            if (!this.method9883("Intelligent Block Picker")) {
                if (!this.method10284()) {
                    int n2 = -1;
                    for (int i = 9; i < 36; ++i) {
                        if (BlockFly.mc.player.field3008.method10878(i).method20054() && method10279(BlockFly.mc.player.field3008.method10878(i).method20053().getItem())) {
                            n2 = i;
                            break;
                        }
                    }
                    for (int j = 36; j < 45; ++j) {
                        if (!BlockFly.mc.player.field3008.method10878(j).method20054()) {
                            n = j;
                            break;
                        }
                    }
                    if (n2 >= 0) {
                        if (!(BlockFly.mc.field4700 instanceof Class518)) {
                            if (method9887.equals("FakeInv")) {
                                BlockFly.mc.method5269().method17292(new Class4323(Class2218.field13623));
                            }
                        }
                        this.method10286(n2, n - 36);
                        if (!(BlockFly.mc.field4700 instanceof Class518)) {
                            if (method9887.equals("FakeInv")) {
                                BlockFly.mc.method5269().method17292(new Class4389(-1));
                            }
                        }
                    }
                }
            }
            else {
                final int method9888 = this.method10283();
                if (!this.method10284()) {
                    for (int k = 36; k < 45; ++k) {
                        if (!BlockFly.mc.player.field3008.method10878(k).method20054()) {
                            n = k;
                            break;
                        }
                    }
                }
                else {
                    int l = 36;
                    while (l < 45) {
                        if (BlockFly.mc.player.field3008.method10878(l).method20054() && method10279(BlockFly.mc.player.field3008.method10878(l).method20053().getItem())) {
                            n = l;
                            if (BlockFly.mc.player.field3008.method10878(n).method20053().field34176 != BlockFly.mc.player.field3008.method10878(method9888).method20053().field34176) {
                                break;
                            }
                            n = -1;
                            break;
                        }
                        else {
                            ++l;
                        }
                    }
                }
                if (n >= 0) {
                    if (BlockFly.mc.player.field3008.method10878(n).field26174 != method9888) {
                        if (!(BlockFly.mc.field4700 instanceof Class518)) {
                            if (method9887.equals("FakeInv")) {
                                BlockFly.mc.method5269().method17292(new Class4323(Class2218.field13623));
                            }
                        }
                        this.method10286(method9888, n - 36);
                        if (!(BlockFly.mc.field4700 instanceof Class518)) {
                            if (method9887.equals("FakeInv")) {
                                BlockFly.mc.method5269().method17292(new Class4389(-1));
                            }
                        }
                    }
                }
            }
        }
    }
    
    public int method10283() {
        int n = -1;
        int field34176 = 0;
        if (this.method10281() != 0) {
            for (int i = 9; i < 45; ++i) {
                if (BlockFly.mc.player.field3008.method10878(i).method20054()) {
                    final Item method27622 = BlockFly.mc.player.field3008.method10878(i).method20053().getItem();
                    final ItemStack method27623 = BlockFly.mc.player.field3008.method10878(i).method20053();
                    if (method10279(method27622)) {
                        if (method27623.field34176 > field34176) {
                            field34176 = method27623.field34176;
                            n = i;
                        }
                    }
                }
            }
            return n;
        }
        return -1;
    }
    
    public boolean method10284() {
        for (int i = 36; i < 45; ++i) {
            if (BlockFly.mc.player.field3008.method10878(i).method20054() && method10279(BlockFly.mc.player.field3008.method10878(i).method20053().getItem())) {
                return true;
            }
        }
        return false;
    }
    
    public boolean method10285(final Class316 class316) {
        if (!this.method9914().method9887("ItemSpoof").equals("None")) {
            if (this.method10281() == 0) {
                return false;
            }
        }
        else if (!method10279(BlockFly.mc.player.method2715(class316).getItem())) {
            return false;
        }
        return true;
    }
    
    public void method10286(final int n, final int n2) {
        BlockFly.mc.field4682.method27324(BlockFly.mc.player.field3008.field16154, n, n2, Class2133.field12439, BlockFly.mc.player);
    }
    
    public void method10287(final Class5717 class5717) {
        if (Client.method35173().method35189().method21551(Speed.class).method9906() && !HypixelSpeed.field15955) {
            return;
        }
        if (BlockFly.mc.timer.timerSpeed == 0.8038576f) {
            BlockFly.mc.timer.timerSpeed = 1.0f;
        }
        if (this.method10281() != 0 && (!BlockFly.mc.player.collidedVertically || this.method9887("Tower Mode").equalsIgnoreCase("Cubecraft"))) {
            if (!Class6430.method19114() || this.method9883("Tower while moving")) {
                final String method9887 = this.method9887("Tower Mode");
                switch (method9887) {
                    case "NCP": {
                        if (class5717.method16974() > 0.0) {
                            if (Class7482.method23140() == 0) {
                                if (class5717.method16974() > 0.247 && class5717.method16974() < 0.249) {
                                    class5717.method16975((int)(BlockFly.mc.player.posY + class5717.method16974()) - BlockFly.mc.player.posY);
                                }
                            }
                            else {
                                final double n2 = (int)(BlockFly.mc.player.posY + class5717.method16974());
                                if (n2 != (int) BlockFly.mc.player.posY && BlockFly.mc.player.posY + class5717.method16974() - n2 < 0.15) {
                                    class5717.method16975(n2 - BlockFly.mc.player.posY);
                                }
                            }
                        }
                        if (BlockFly.mc.player.posY != (int) BlockFly.mc.player.posY || !Class6430.method19160(BlockFly.mc.player, 0.001f)) {
                            break;
                        }
                        if (BlockFly.mc.gameSettings.field23439.field2162) {
                            if (!Class6430.method19114()) {
                                Class7482.method23151(0.0);
                                Class7482.method23149(class5717, 0.0);
                            }
                            class5717.method16975(Class7482.method23141());
                            break;
                        }
                        class5717.method16975(-1.0E-5);
                        break;
                    }
                    case "AAC": {
                        if (class5717.method16974() > 0.247 && class5717.method16974() < 0.249) {
                            class5717.method16975((int)(BlockFly.mc.player.posY + class5717.method16974()) - BlockFly.mc.player.posY);
                            if (BlockFly.mc.gameSettings.field23439.field2162 && !Class6430.method19114()) {
                                Class7482.method23151(0.0);
                                Class7482.method23149(class5717, 0.0);
                                break;
                            }
                            break;
                        }
                        else {
                            if (BlockFly.mc.player.posY == (int) BlockFly.mc.player.posY && Class6430.method19160(BlockFly.mc.player, 0.001f)) {
                                class5717.method16975(-1.0E-10);
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    case "Cubecraft": {
                        if (BlockFly.mc.gameSettings.field23439.field2162 && Class6430.method19160(BlockFly.mc.player, 0.001f) && BlockFly.mc.world.method6981(BlockFly.mc.player, BlockFly.mc.player.boundingBox.offset(0.0, 1.0, 0.0)).count() == 0L) {
                            BlockFly.mc.player.setPosition(BlockFly.mc.player.posX, BlockFly.mc.player.posY + 1.0, BlockFly.mc.player.posZ);
                            class5717.method16975(0.0);
                            Class7482.method23149(class5717, 0.0);
                            BlockFly.mc.timer.timerSpeed = 0.8038576f;
                            break;
                        }
                        break;
                    }
                }
            }
        }
        else if (this.method9887("Tower Mode").equals("AAC") && Class6430.method19160(BlockFly.mc.player, 0.001f) && BlockFly.mc.gameSettings.field23439.field2162) {
            if (!Class6430.method19114() || this.method9883("Tower while moving")) {
                BlockFly.mc.player.field2985 = 0;
                BlockFly.mc.player.method2725();
                Class7482.method23149(class5717, Class7482.method23136());
                Class7482.method23151(Class7482.method23136());
            }
        }
        else if (!this.method9887("Tower Mode").equals("NCP") && !this.method9887("Tower Mode").equals("Cubecraft") && Class6430.method19160(BlockFly.mc.player, 0.001f) && BlockFly.mc.gameSettings.field23439.field2162) {
            BlockFly.mc.player.field2985 = 20;
            class5717.method16975(Class7482.method23141());
        }
        if (!this.method9887("Tower Mode").equalsIgnoreCase("Cubecraft")) {
            Class6430.method19155(class5717.method16974());
        }
    }
    
    @Override
    public String getName2() {
        if (Client.method35173().method35209() != Class2209.field13465) {
            return super.getName2();
        }
        return "Scaffold";
    }
    
    @EventListener
    public void method10288(final Class5743 class5743) {
        if (!this.method9906()) {
            return;
        }
        if (this.method9883("Show Block Amount")) {
            this.field15752 = this.method10281();
        }
    }
    
    @Override
    public void onDisable() {
        this.field15751.method35855(Class2186.field12965);
        super.onDisable();
    }
    
    @EventListener
    public void method10289(final Class5740 class5740) {
        this.field15751.method35855(Class2186.field12964);
        if (this.field15751.method35858() == 0.0f) {
            return;
        }
        if (this.method9883("Show Block Amount")) {
            if (Client.method35173().method35209() != Class2209.field13464) {
                this.method10290(BlockFly.mc.field4632.method7694() / 2, BlockFly.mc.field4632.method7695() / 2 + 15 - (int)(10.0f * this.field15751.method35858()), this.field15751.method35858());
            }
            else {
                this.method10291(BlockFly.mc.field4632.method7694() / 2, BlockFly.mc.field4632.method7695() - 138 - (int)(25.0f * Class8468.method28270(this.field15751.method35858(), 0.0f, 1.0f, 1.0f)), this.field15751.method35858());
            }
        }
    }
    
    public void method10290(final int n, final int n2, float n3) {
        n3 = (float)(0.5 + 0.5 * n3);
        GL11.glAlphaFunc(518, 0.1f);
        Class8154.method26889(Class9493.field40815, (float)(n + 10), (float)(n2 + 5), this.field15752 + " Blocks", Class6430.method19118(Class265.field1273.field1292, n3 * 0.3f));
        Class8154.method26889(Class9493.field40815, (float)(n + 10), (float)(n2 + 4), this.field15752 + " Blocks", Class6430.method19118(Class265.field1278.field1292, n3 * 0.8f));
        GL11.glAlphaFunc(519, 0.0f);
    }
    
    public void method10291(int n, int n2, final float n3) {
        final int n4 = 0;
        final int n5 = ClientFonts.JelloLight18.getWidth(this.field15752 + "") + 3;
        final int n6 = n4 + n5 + ClientFonts.JelloLight14.getWidth("Blocks") + 20;
        final int n7 = 32;
        n -= n6 / 2;
        GL11.glPushMatrix();
        Class8154.method26915(n, n2, n6, n7, Class6430.method19118(-15461356, 0.8f * n3));
        Class8154.method26889(ClientFonts.JelloLight18, (float)(n + 10), (float)(n2 + 4), this.field15752 + "", Class6430.method19118(Class265.field1278.field1292, n3));
        Class8154.method26889(ClientFonts.JelloLight14, (float)(n + 10 + n5), (float)(n2 + 8), "Blocks", Class6430.method19118(Class265.field1278.field1292, 0.6f * n3));
        n += 11 + n6 / 2;
        n2 += n7;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)n, (float)n2, 0.0f);
        GL11.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        GL11.glTranslatef((float)(-n), (float)(-n2), 0.0f);
        Class8154.method26899((float)n, (float)n2, 9.0f, 23.0f, ClientAssets.select, Class6430.method19118(-15461356, 0.8f * n3));
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
