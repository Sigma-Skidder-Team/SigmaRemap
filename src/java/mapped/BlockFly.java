package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4415;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class8005;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;
import java.util.List;

public class BlockFly extends Class5325 {
    public static List<Block> field23883;
    public int field23884;
    public Animation field23885 = new Animation(114, 114, Direction.BACKWARDS);
    public int field23886 = 0;

    public BlockFly() {
        super(ModuleCategory.MOVEMENT, "BlockFly", "Allows you to automatically bridge", new Class5355(), new Class5204(), new Class5365(), new Class5176());
        this.method15972(new Class6005("ItemSpoof", "Item spoofing mode", 2, "None", "Switch", "Spoof", "LiteSpoof"));
        this.method15972(new Class6005("Tower Mode", "Tower mode", 1, "None", "NCP", "AAC", "Vanilla"));
        this.method15972(new Class6005("Picking mode", "The way it will move blocks in your inventory.", 0, "Basic", "FakeInv", "OpenInv"));
        this.method15972(new Class6004("Tower while moving", "Allows you to tower while moving.", false));
        this.method15972(new Class6004("Show Block Amount", "Shows the amount of blocks in your inventory.", true));
        this.method15972(new Class6004("NoSwing", "Removes the swing animation.", true));
        this.method15972(new Class6004("Intelligent Block Picker", "Always get the biggest blocks stack.", true));
        this.method15972(new Class6004("No Sprint", "Disable sprint.", false));
        field23883 = Arrays.asList(
                Blocks.AIR,
                Blocks.WATER,
                Blocks.LAVA,
                Blocks.ENCHANTING_TABLE,
                Blocks.BLACK_CARPET,
                Blocks.GLASS_PANE,
                Blocks.IRON_BARS,
                Blocks.ICE,
                Blocks.PACKED_ICE,
                Blocks.CHEST,
                Blocks.TRAPPED_CHEST,
                Blocks.TORCH,
                Blocks.ANVIL,
                Blocks.TRAPPED_CHEST,
                Blocks.NOTE_BLOCK,
                Blocks.JUKEBOX,
                Blocks.TNT,
                Blocks.REDSTONE_WIRE,
                Blocks.LEVER,
                Blocks.COBBLESTONE_WALL,
                Blocks.OAK_FENCE,
                Blocks.TALL_GRASS,
                Blocks.TRIPWIRE,
                Blocks.TRIPWIRE_HOOK,
                Blocks.RAIL,
                Blocks.LILY_PAD,
                Blocks.RED_MUSHROOM,
                Blocks.BROWN_MUSHROOM,
                Blocks.VINE,
                Blocks.ACACIA_TRAPDOOR,
                Blocks.LADDER,
                Blocks.FURNACE,
                Blocks.SAND,
                Blocks.CACTUS,
                Blocks.DISPENSER,
                Blocks.DROPPER,
                Blocks.CRAFTING_TABLE,
                Blocks.COBWEB,
                Blocks.PUMPKIN,
                Blocks.ACACIA_SAPLING
        );
    }

    public static boolean method16733(Class3257 var0) {
        if (!(var0 instanceof Class3292)) {
            return false;
        } else {
            Block var3 = ((Class3292) var0).method11845();
            return !field23883.contains(var3)
                    && !(var3 instanceof Class3202)
                    && !(var3 instanceof Class3194)
                    && !(var3 instanceof Class3206)
                    && !(var3 instanceof Class3468)
                    && !(var3 instanceof Class3216)
                    && !(var3 instanceof Class3420)
                    && !(var3 instanceof Class3343)
                    && !(var3 instanceof Class3250)
                    && !(var3 instanceof Class3241)
                    && !(var3 instanceof Class3348)
                    && !(var3 instanceof Class3461);
        }
    }

    public boolean method16732() {
        return this.method15974("No Sprint") && this.method15996();
    }

    public void method16734() {
        try {
            for (int var3 = 36; var3 < 45; var3++) {
                int var4 = var3 - 36;
                if (mc.field1339.field4904.method18131(var3).method18266()
                        && method16733(mc.field1339.field4904.method18131(var3).method18265().method32107())
                        && mc.field1339.field4904.method18131(var3).method18265().field39976 != 0) {
                    if (mc.field1339.field4902.field5443 == var4) {
                        return;
                    }

                    mc.field1339.field4902.field5443 = var4;
                    if (this.getStringSettingValueByName("ItemSpoof").equals("LiteSpoof") && (this.field23884 < 0 || this.field23884 != var4)) {
                        mc.getClientPlayNetHandler().method15589().method30693(new Class5539(var4));
                        this.field23884 = var4;
                    }
                    break;
                }
            }
        } catch (Exception var5) {
        }
    }

    public int method16735() {
        int var3 = 0;

        for (int var4 = 0; var4 < 45; var4++) {
            if (mc.field1339.field4904.method18131(var4).method18266()) {
                ItemStack var5 = mc.field1339.field4904.method18131(var4).method18265();
                Class3257 var6 = var5.method32107();
                if (method16733(var6)) {
                    var3 += var5.field39976;
                }
            }
        }

        return var3;
    }

    public void method16736() {
        String var3 = this.getStringSettingValueByName("Picking mode");
        if ((!var3.equals("OpenInv") || mc.field1355 instanceof Class859) && this.method16735() != 0) {
            int var4 = 43;
            if (!this.method15974("Intelligent Block Picker")) {
                if (!this.method16738()) {
                    int var5 = -1;

                    for (int var6 = 9; var6 < 36; var6++) {
                        if (mc.field1339.field4904.method18131(var6).method18266()) {
                            Class3257 var7 = mc.field1339.field4904.method18131(var6).method18265().method32107();
                            if (method16733(var7)) {
                                var5 = var6;
                                break;
                            }
                        }
                    }

                    for (int var9 = 36; var9 < 45; var9++) {
                        if (!mc.field1339.field4904.method18131(var9).method18266()) {
                            var4 = var9;
                            break;
                        }
                    }

                    if (var5 >= 0) {
                        if (!(mc.field1355 instanceof Class859) && var3.equals("FakeInv")) {
                            mc.getClientPlayNetHandler().sendPacket(new Class5564(Class2175.field14279));
                        }

                        this.method16740(var5, var4 - 36);
                        if (!(mc.field1355 instanceof Class859) && var3.equals("FakeInv")) {
                            mc.getClientPlayNetHandler().sendPacket(new Class5482(-1));
                        }
                    }
                }
            } else {
                int var8 = this.method16737();
                if (!this.method16738()) {
                    for (int var11 = 36; var11 < 45; var11++) {
                        if (!mc.field1339.field4904.method18131(var11).method18266()) {
                            var4 = var11;
                            break;
                        }
                    }
                } else {
                    for (int var10 = 36; var10 < 45; var10++) {
                        if (mc.field1339.field4904.method18131(var10).method18266()) {
                            Class3257 var12 = mc.field1339.field4904.method18131(var10).method18265().method32107();
                            if (method16733(var12)) {
                                var4 = var10;
                                if (mc.field1339.field4904.method18131(var10).method18265().field39976
                                        == mc.field1339.field4904.method18131(var8).method18265().field39976) {
                                    var4 = -1;
                                }
                                break;
                            }
                        }
                    }
                }

                if (var4 >= 0 && mc.field1339.field4904.method18131(var4).field25579 != var8) {
                    if (!(mc.field1355 instanceof Class859) && var3.equals("FakeInv") && Class8005.method27349() <= Class5989.field26136.method18582()) {
                        mc.getClientPlayNetHandler().sendPacket(new Class5564(Class2175.field14279));
                    }

                    this.method16740(var8, var4 - 36);
                    if (!(mc.field1355 instanceof Class859) && var3.equals("FakeInv")) {
                        mc.getClientPlayNetHandler().sendPacket(new Class5482(-1));
                    }
                }
            }
        }
    }

    public int method16737() {
        int var3 = -1;
        int var4 = 0;
        if (this.method16735() != 0) {
            for (int var5 = 9; var5 < 45; var5++) {
                if (mc.field1339.field4904.method18131(var5).method18266()) {
                    Class3257 var6 = mc.field1339.field4904.method18131(var5).method18265().method32107();
                    ItemStack var7 = mc.field1339.field4904.method18131(var5).method18265();
                    if (method16733(var6) && var7.field39976 > var4) {
                        var4 = var7.field39976;
                        var3 = var5;
                    }
                }
            }

            return var3;
        } else {
            return -1;
        }
    }

    public boolean method16738() {
        for (int var3 = 36; var3 < 45; var3++) {
            if (mc.field1339.field4904.method18131(var3).method18266()) {
                Class3257 var4 = mc.field1339.field4904.method18131(var3).method18265().method32107();
                if (method16733(var4)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean method16739(Hand var1) {
        if (!this.method16004().getStringSettingValueByName("ItemSpoof").equals("None")) {
            return this.method16735() != 0;
        } else return method16733(mc.field1339.method3094(var1).method32107());
    }

    public void method16740(int var1, int var2) {
        mc.field1337.method23144(mc.field1339.field4904.field25471, var1, var2, Class2259.field14696, mc.field1339);
    }

    public void method16741(Class4435 var1) {
        if (mc.field1284.field40360 == 0.8038576F) {
            mc.field1284.field40360 = 1.0F;
        }

        if (this.method16735() != 0 && (!mc.field1339.field5038 || this.getStringSettingValueByName("Tower Mode").equalsIgnoreCase("Vanilla"))) {
            if (!Class5628.method17686() || this.method15974("Tower while moving")) {
                String var4 = this.getStringSettingValueByName("Tower Mode");
                switch (var4) {
                    case "NCP":
                        if (var1.method13994() > 0.0) {
                            if (Class9567.method37079() == 0) {
                                if (var1.method13994() > 0.247 && var1.method13994() < 0.249) {
                                    var1.method13995((double) ((int) (mc.field1339.getPosY() + var1.method13994())) - mc.field1339.getPosY());
                                }
                            } else {
                                double var6 = (int) (mc.field1339.getPosY() + var1.method13994());
                                if (var6 != (double) ((int) mc.field1339.getPosY()) && mc.field1339.getPosY() + var1.method13994() - var6 < 0.15) {
                                    var1.method13995(var6 - mc.field1339.getPosY());
                                }
                            }
                        }

                        if (mc.field1339.getPosY() == (double) ((int) mc.field1339.getPosY())
                                && Class5628.method17730(mc.field1339, 0.001F)) {
                            if (mc.field1299.field44636.field13071) {
                                if (!Class5628.method17686()) {
                                    Class9567.method37090(0.0);
                                    Class9567.method37088(var1, 0.0);
                                }

                                var1.method13995(Class9567.method37080());
                            } else {
                                var1.method13995(-1.0E-5);
                            }
                        }
                        break;
                    case "AAC":
                        if (var1.method13994() > 0.247 && var1.method13994() < 0.249) {
                            var1.method13995((double) ((int) (mc.field1339.getPosY() + var1.method13994())) - mc.field1339.getPosY());
                            if (mc.field1299.field44636.field13071 && !Class5628.method17686()) {
                                Class9567.method37090(0.0);
                                Class9567.method37088(var1, 0.0);
                            }
                        } else if (mc.field1339.getPosY() == (double) ((int) mc.field1339.getPosY())
                                && Class5628.method17730(mc.field1339, 0.001F)) {
                            var1.method13995(-1.0E-10);
                        }
                        break;
                    case "Vanilla":
                        if (mc.field1299.field44636.field13071
                                && Class5628.method17730(mc.field1339, 0.001F)
                                && mc.field1338.method7055(mc.field1339, mc.field1339.field5035.method19667(0.0, 1.0, 0.0)).count() == 0L) {
                            mc.field1339
                                    .method3215(mc.field1339.getPosX(), mc.field1339.getPosY() + 1.0, mc.field1339.getPosZ());
                            var1.method13995(0.0);
                            Class9567.method37088(var1, 0.0);
                            mc.field1284.field40360 = 0.8038576F;
                        }
                }
            }
        } else if (!this.getStringSettingValueByName("Tower Mode").equals("AAC")
                || !Class5628.method17730(mc.field1339, 0.001F)
                || !mc.field1299.field44636.field13071) {
            if (!this.getStringSettingValueByName("Tower Mode").equals("NCP")
                    && !this.getStringSettingValueByName("Tower Mode").equals("Vanilla")
                    && Class5628.method17730(mc.field1339, 0.001F)
                    && mc.field1299.field44636.field13071) {
                mc.field1339.field4999 = 20;
                var1.method13995(Class9567.method37080());
            }
        } else if (!Class5628.method17686() || this.method15974("Tower while moving")) {
            mc.field1339.field4999 = 0;
            mc.field1339.method2914();
            Class9567.method37088(var1, Class9567.method37075());
            Class9567.method37090(Class9567.method37075());
        }

        if (!this.getStringSettingValueByName("Tower Mode").equalsIgnoreCase("Vanilla")) {
            Class5628.method17725(var1.method13994());
        }
    }

    @Override
    public String method15990() {
        return Client.getInstance().getClientMode() != ClientMode.CLASSIC ? super.method15990() : "Scaffold";
    }

    @EventTarget
    public void method16742(TickEvent var1) {
        if (this.method15996()) {
            if (this.method15974("Show Block Amount")) {
                this.field23886 = this.method16735();
            }
        }
    }

    @Override
    public void method15965() {
        this.field23885.changeDirection(Direction.BACKWARDS);
        super.method15965();
    }

    @EventTarget
    public void method16743(Class4415 var1) {
        this.field23885.changeDirection(Direction.FORWARDS);
        if (this.field23885.calcPercent() != 0.0F) {
            if (this.method15974("Show Block Amount")) {
                if (Client.getInstance().getClientMode() != ClientMode.JELLO) {
                    this.method16744(
                            mc.field1283.method8043() / 2,
                            mc.field1283.method8044() / 2 + 15 - (int) (10.0F * this.field23885.calcPercent()),
                            this.field23885.calcPercent()
                    );
                } else {
                    this.method16745(
                            mc.field1283.method8043() / 2,
                            mc.field1283.method8044() - 138 - (int) (25.0F * Class8056.method27664(this.field23885.calcPercent(), 0.0F, 1.0F, 1.0F)),
                            this.field23885.calcPercent()
                    );
                }
            }
        }
    }

    public void method16744(int var1, int var2, float var3) {
        var3 = (float) (0.5 + 0.5 * (double) var3);
        GL11.glAlphaFunc(518, 0.1F);
        Class3192.method11439(
                Class7925.field33954,
                (float) (var1 + 10),
                (float) (var2 + 5),
                this.field23886 + " Blocks",
                Class5628.method17688(Class1979.field12891.field12910, var3 * 0.3F)
        );
        Class3192.method11439(
                Class7925.field33954,
                (float) (var1 + 10),
                (float) (var2 + 4),
                this.field23886 + " Blocks",
                Class5628.method17688(Class1979.field12896.field12910, var3 * 0.8F)
        );
        GL11.glAlphaFunc(519, 0.0F);
    }

    public void method16745(int var1, int var2, float var3) {
        int var6 = 0;
        int var7 = ResourceRegistry.JelloLightFont18.method23942(this.field23886 + "") + 3;
        var6 += var7;
        var6 += ResourceRegistry.JelloLightFont14.method23942("Blocks");
        int var8 = var6 + 20;
        byte var9 = 32;
        var1 -= var8 / 2;
        GL11.glPushMatrix();
        Class3192.method11465(var1, var2, var8, var9, Class5628.method17688(-15461356, 0.8F * var3));
        Class3192.method11439(
                ResourceRegistry.JelloLightFont18, (float) (var1 + 10), (float) (var2 + 4), this.field23886 + "", Class5628.method17688(Class1979.field12896.field12910, var3)
        );
        Class3192.method11439(
                ResourceRegistry.JelloLightFont14, (float) (var1 + 10 + var7), (float) (var2 + 8), "Blocks", Class5628.method17688(Class1979.field12896.field12910, 0.6F * var3)
        );
        var1 += 11 + var8 / 2;
        var2 += var9;
        GL11.glPushMatrix();
        GL11.glTranslatef((float) var1, (float) var2, 0.0F);
        GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
        GL11.glTranslatef((float) (-var1), (float) (-var2), 0.0F);
        Class3192.method11449((float) var1, (float) var2, 9.0F, 23.0F, ResourcesDecrypter.selectPNG, Class5628.method17688(-15461356, 0.8F * var3));
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
