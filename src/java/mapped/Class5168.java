package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4420;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import org.lwjgl.opengl.GL11;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Class5168 extends Module {
    private List<Class9238> field23439;
    private Class8817 field23440;
    private BlockPos field23441;
    private BlockPos field23442;
    private Block field23443;
    private Class9238 field23444;
    private boolean field23445;
    private boolean field23446 = true;
    private final int field23447 = 0;
    private List<String> field23448 = new ArrayList<String>();
    private int field23449;
    private int field23450;

    public Class5168() {
        super(ModuleCategory.WORLD, "JelloEdit", "Client side world edit");
        File var3 = new File(Client.getInstance().getFile() + "/shematics");
        if (var3.exists()) {
            this.field23448 = new ArrayList<String>(Arrays.asList(var3.list()));

            for (int var4 = 0; var4 < this.field23448.size(); var4++) {
                if (this.field23448.get(var4).startsWith(".")) {
                    this.field23448.remove(var4);
                    break;
                }
            }

            String[] var5 = new String[this.field23448.size()];
            var5 = this.field23448.<String>toArray(var5);
            this.method15972(new Class6005("Shematics", "shematics", 0, var5));
        }
    }

    private BlockPos method16070(int var1) {
        return new BlockPos(
                this.field23441.method8304() + this.field23440.method31843().get(var1).method17098().method8553(),
                this.field23441.getY() + this.field23440.method31843().get(var1).method17098().method8557(),
                this.field23441.method8306() + this.field23440.method31843().get(var1).method17098().method8561()
        );
    }

    private Block method16071(int var1) {
        return Block.method11536(this.field23440.method31843().get(var1).method17096()).method23383();
    }

    private BlockPos method16072() {
        this.field23443 = this.method16071(this.field23450);
        this.field23442 = this.method16070(this.field23450++);
        return this.field23442;
    }

    private Class9238 method16073() {
        return this.field23444 = this.field23439.get(this.field23449++);
    }

    @Override
    public void isInDevelopment() {
        File var3 = new File(Client.getInstance().getFile() + "/shematics/" + (String) this.method15973("Shematics"));
        if (var3.exists()) {
            this.field23440 = new Class8817(var3);
            if (this.field23440.method31836() && this.field23440.method31843().size() > 0) {
                Class5628.method17678(this.field23440.method31843().size() + " blocks loaded from schematic");
                this.field23441 = new BlockPos(
                        mc.player.getPosX() + this.field23440.method31842().method8552() * 0.0,
                        mc.player.getPosY() + this.field23440.method31842().method8556() * 0.0,
                        mc.player.getPosZ() + this.field23440.method31842().method8560() * 0.0
                );
                this.method16072();
            } else {
                Class5628.method17678("Unable to load schematic");
                this.method16000();
            }
        } else {
            Class5628.method17678("Schematic does not exist");
            this.method16000();
        }
    }

    @EventTarget
    private void method16074(Class4420 var1) {
        if (this.method15996()) {
            GL11.glAlphaFunc(516, 0.0F);

            for (Class5432 var5 : this.field23440.method31843()) {
                BlockPos var6 = new BlockPos(
                        (double) this.field23441.method8304() + var5.method17098().method8552(),
                        (double) this.field23441.getY() + var5.method17098().method8556(),
                        (double) this.field23441.method8306() + var5.method17098().method8560()
                );
                if (Class9217.method34536(var6) == Blocks.AIR) {
                    double var7 = (double) var6.method8304() - mc.gameRenderer.getActiveRenderInfo().method37504().method11320();
                    double var9 = (double) var6.getY() - mc.gameRenderer.getActiveRenderInfo().method37504().method11321();
                    double var11 = (double) var6.method8306() - mc.gameRenderer.getActiveRenderInfo().method37504().method11322();
                    Class9388 var13 = new Class9388(var7, var9, var11, var7 + 1.0, var9 + 1.0, var11 + 1.0);
                    Class3192.method11459(var13, Class5628.method17688(Class1979.field12903.field12910, 0.02F));
                    GL11.glEnable(2848);
                    Class3192.method11461(var13, Class5628.method17688(Class1979.field12903.field12910, 0.03F));
                    GL11.glColor3f(1.0F, 1.0F, 1.0F);
                }
            }

            for (Class9238 var15 : this.field23439) {
                BlockPos var16 = var15.field42516;
                double var17 = (double) var16.method8304() - mc.gameRenderer.getActiveRenderInfo().method37504().method11320();
                double var18 = (double) var16.getY() - mc.gameRenderer.getActiveRenderInfo().method37504().method11321();
                double var19 = (double) var16.method8306() - mc.gameRenderer.getActiveRenderInfo().method37504().method11322();
                Class9388 var20 = new Class9388(var17, var18, var19, var17 + 1.0, var18 + 1.0, var19 + 1.0);
                Class3192.method11459(var20, Class5628.method17688(Class1979.field12892.field12910, 0.1F));
                Class3192.method11461(var20, Class5628.method17688(Class1979.field12892.field12910, 0.2F));
                GL11.glColor3f(1.0F, 1.0F, 1.0F);
            }
        }
    }
}
