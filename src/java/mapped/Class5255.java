package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.event.impl.Class4420;
import com.mentalfrostbyte.jello.event.impl.Class4428;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.PremiumModule;
import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import org.lwjgl.opengl.GL11;

import java.io.File;
import java.util.*;

public class Class5255 extends PremiumModule {
    public int field23638;
    private Class2403 field23639;
    private List<String> field23640 = new ArrayList<String>();
    private final List<Class6463> field23641 = new ArrayList<Class6463>();
    private final List<BlockPos> field23642 = new ArrayList<BlockPos>();

    public Class5255() {
        super("NoteblockPlayer", "Plays noteblocks! Needs NBS files in sigma5/nbs", ModuleCategory.MISC);
        File var3 = new File(Client.getInstance().getFile() + "/nbs");
        if (var3.exists()) {
            this.field23640 = new ArrayList<String>(Arrays.asList(var3.list()));

            for (int var4 = 0; var4 < this.field23640.size(); var4++) {
                if (this.field23640.get(var4).startsWith(".")) {
                    this.field23640.remove(var4);
                    break;
                }
            }

            String[] var5 = new String[this.field23640.size()];
            var5 = this.field23640.toArray(var5);
            if (var5.length > 0) {
                this.method15972(new Class6005("Song", "songs", 0, var5));
            }
        }
    }

    public static void method16410(BlockPos var0) {
        double var3 = (double) ((float) var0.method8304() + 0.5F) - Minecraft.getInstance().field1295.method768().method37504().method11320();
        double var5 = (double) ((float) var0.getY() + 1.0F) - Minecraft.getInstance().field1295.method768().method37504().method11321();
        double var7 = (double) ((float) var0.method8306() + 0.5F) - Minecraft.getInstance().field1295.method768().method37504().method11322();
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(3042);
        GL11.glEnable(2848);
        GL11.glLineWidth(1.0F);
        GL11.glDisable(3553);
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glColor4d(1.0, 1.0, 1.0, 1.0);
        Vector3d var9 = new Vector3d(0.0, 0.0, 1.0)
                .method11350(-((float) Math.toRadians(Minecraft.getInstance().field1339.field5032)))
                .method11351(-((float) Math.toRadians(Minecraft.getInstance().field1339.field5031)));
        GL11.glBegin(1);
        GL11.glVertex3d(var9.field18048, var9.field18049, var9.field18050);
        GL11.glVertex3d(var3, var5, var7);
        GL11.glEnd();
        GL11.glEnable(3553);
        GL11.glEnable(2929);
        GL11.glDisable(2848);
        GL11.glDepthMask(true);
        GL11.glDisable(3042);
    }

    // $VF: synthetic method
    public static Minecraft method16415() {
        return field23386;
    }

    @EventTarget
    private void method16405(Class4428 var1) {
        if (this.method15996()) {
            if (this.field23639 != null) {
                if (field23386.field1337.method23152()) {
                    Class5628.method17678("§cNoteBlockPlayer isn't available in creative mode!");
                    this.method15999(false);
                } else {
                    if (!this.method16407(this.field23641) && field23386.field1339.field5055 % 4 == 0) {
                        this.method16408(this.field23641);
                    }

                    if (this.method16406(this.field23641)) {
                        if (Math.floor((float) field23386.field1339.field5055 % this.field23639.method9958()) / 20.0 == 0.0) {
                            if (this.field23638 > this.field23639.method9952()) {
                                this.field23638 = 0;
                            }

                            this.field23642.clear();

                            for (Class9616 var5 : this.field23639.method9950().values()) {
                                Class8255 var6 = var5.method37433(this.field23638);
                                if (var6 != null) {
                                    for (Class6463 var8 : this.field23641) {
                                        if ((var6.method28780() != 3 && this.method16414(var8) == 0 || var8.method19640() == var6.method28780())
                                                && Class2121.method8807(var8.field28402) == (float) (var6.method28782() - 33)
                                                && Math.sqrt(field23386.field1339.method3432().method8318(var8.field28401)) < (double) field23386.field1337.method23135()) {
                                            float[] var9 = Class9217.method34542(var8.field28401, Direction.field673);
                                            if ((double) var8.field28401.getY() > field23386.field1339.getPosY() + 1.0) {
                                                var9 = Class9217.method34542(var8.field28401, Direction.field672);
                                            }

                                            field23386.getClientPlayNetHandler().sendPacket(new Class5606(var9[0], var9[1], field23386.field1339.field5036));
                                            field23386.getClientPlayNetHandler().sendPacket(new Class5492(Class2070.field13484, var8.field28401, Direction.field673));
                                            field23386.getClientPlayNetHandler().sendPacket(new Class5511(Class79.field182));
                                            this.field23642.add(var8.field28401);
                                        }
                                    }
                                }
                            }

                            this.field23638++;
                        }
                    }
                }
            }
        }
    }

    public boolean method16406(List<Class6463> var1) {
        for (Class6463 var5 : var1) {
            if ((var5.field28402 == -1.0F || this.method16411(var5.field28402, var5.field28403))
                    && Math.sqrt(field23386.field1339.method3432().method8318(var5.field28401)) < (double) field23386.field1337.method23135()) {
                return false;
            }
        }

        return true;
    }

    public boolean method16407(List<Class6463> var1) {
        for (Class6463 var5 : var1) {
            if (var5.field28402 == -1.0F && Math.sqrt(field23386.field1339.method3432().method8318(var5.field28401)) < (double) field23386.field1337.method23135()) {
                float[] var6 = Class9217.method34542(var5.field28401, Direction.field673);
                field23386.getClientPlayNetHandler().sendPacket(new Class5606(var6[0], var6[1], field23386.field1339.field5036));
                field23386.getClientPlayNetHandler().sendPacket(new Class5492(Class2070.field13484, var5.field28401, Direction.field673));
                this.field23642.clear();
                this.field23642.add(var5.field28401);
                return true;
            }
        }

        return false;
    }

    public boolean method16408(List<Class6463> var1) {
        for (Class6463 var5 : var1) {
            if (this.method16411(var5.field28402, var5.field28403)
                    && Math.sqrt(field23386.field1339.method3432().method8318(var5.field28401)) < (double) field23386.field1337.method23135()) {
                if (0 == 0) {
                    float[] var6 = Class9217.method34542(var5.field28401, Direction.field673);
                    field23386.field1339.method2820(Class79.field182);
                    field23386.getClientPlayNetHandler().sendPacket(new Class5606(var6[0], var6[1], field23386.field1339.field5036));
                    field23386.getClientPlayNetHandler()
                            .sendPacket(new Class5570(Class79.field182, Class9217.method34567(var6[0], var6[1], field23386.field1337.method23135() + 1.0F)));
                    this.field23642.clear();
                    this.field23642.add(var5.field28401);
                }

                return true;
            }
        }

        return false;
    }

    @EventTarget
    private void method16409(Class4420 var1) {
        if (this.method15996()) {
            if (this.field23641 != null) {
                for (Class6463 var5 : this.field23641) {
                }

                for (BlockPos var7 : this.field23642) {
                    method16410(var7);
                }
            }
        }
    }

    public boolean method16411(float var1, Class108 var2) {
        int var5 = 0;

        for (Class6463 var7 : this.field23641) {
            if (var7.field28402 == var1 && var1 != -1.0F && var7.field28403 == var2) {
                var5++;
            }
        }

        return var5 > 1;
    }

    @EventTarget
    private void method16412(Class4396 var1) {
        if (this.method15996()) {
            if (this.field23641 != null) {
                if (var1.method13898() instanceof Class5584) {
                    Class5584 var4 = (Class5584) var1.method13898();

                    for (int var5 = 0; var5 < this.field23641.size(); var5++) {
                        Class6463 var6 = this.field23641.get(var5);
                        if (var6.field28401.equals(new BlockPos(var4.method17551(), var4.method17552(), var4.method17553()))) {
                            var6.field28402 = var4.method17555();
                            this.field23641.set(var5, var6);
                        }
                    }
                }

                if (var1.method13898() instanceof Class5475) {
                    Class5475 var7 = (Class5475) var1.method13898();

                    for (int var8 = 0; var8 < this.field23641.size(); var8++) {
                        Class6463 var9 = this.field23641.get(var8);
                        if (var9.field28401.equals(new BlockPos(var7.method17224(), var7.method17225(), var7.method17226()))) {
                            var9.field28402 = var7.method17228();
                            this.field23641.set(var8, var9);
                        }
                    }
                }
            }
        }
    }

    public void method16413(double var1, double var3, double var5, String var7) {
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(3042);
        GL11.glEnable(2848);
        GL11.glDisable(3553);
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glPushMatrix();
        GL11.glTranslated(
                var1 - field23386.field1295.method768().method37504().method11320() + 0.5,
                var3 - field23386.field1295.method768().method37504().method11321() + 1.0,
                var5 - field23386.field1295.method768().method37504().method11322() + 0.5
        );
        GL11.glAlphaFunc(519, 0.0F);
        GL11.glRotatef(field23386.field1295.method768().method37507(), 0.0F, -1.0F, 0.0F);
        GL11.glRotatef(field23386.field1295.method768().method37506(), 1.0F, 0.0F, 0.0F);
        ClientResource var10 = ResourceRegistry.field38855;
        GL11.glPushMatrix();
        GL11.glScalef(-0.01F, -0.01F, -0.01F);
        Class3192.method11426(
                (float) (-var10.method23942(var7) / 2 - 10),
                0.0F,
                (float) (var10.method23942(var7) / 2 + 10),
                (float) (var10.method23952() + 2),
                Class5628.method17688(Class1979.field12891.field12910, 0.4F)
        );
        GL11.glTranslated(-var10.method23942(var7) / 2, 0.0, 0.0);
        Class3192.method11439(var10, 0.0F, 0.0F, var7, Class1979.field12896.field12910);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
        GL11.glEnable(3553);
        GL11.glEnable(2929);
        GL11.glDisable(2848);
        GL11.glDepthMask(true);
        GL11.glDisable(3042);
    }

    @Override
    public void method15966() {
        if (!field23386.field1337.method23152()) {
            if (this.field23640.isEmpty()) {
                Class5628.method17678("§cNo Song available! Place NBS formated files in sigma5/nbs and restart the client to try again!");
                Class5628.method17678("§cPlaying the only integrated demo song!");
                this.field23639 = Class8471.method29870(ResourcesDecrypter.readInputStream("com/mentalfrostbyte/gui/resources/music/rememberthis.nbs"));
                if (this.field23639 == null) {
                    Class5628.method17678("§cError loading included song, wtf!");
                    this.method15999(false);
                    return;
                }
            } else {
                File var3 = new File(Client.getInstance().getFile() + "/nbs/" + this.method15978("Song"));
                this.field23639 = Class8471.method29869(var3);
                if (this.field23639 == null) {
                    Class5628.method17678("§cError loading song! Make sure song is saved as <= V3 format");
                    this.method15999(false);
                    return;
                }
            }

            System.out.println(this.field23639.method9953());
            Class5628.method17678("Now Playing: " + this.field23639.method9953());
            if (Math.floor(20.0F / this.field23639.method9958()) != (double) (20.0F / this.field23639.method9958())) {
                Class5628.method17678("§cNBS Error! Invalid tempo! (" + this.field23639.method9958() + ") Unpredictable results!");
            }

            this.field23638 = 0;
            this.field23641.clear();

            for (BlockPos var4 : Class9217.method34561(field23386.field1337.method23135())) {
                Class7380 var5 = field23386.field1338.method6738(var4);
                if (var5.method23383() instanceof Class3426) {
                    Class6463 var6 = new Class6463(var4);
                    if (this.method16414(var6) <= 24) {
                        this.field23641.add(new Class6463(var4));
                    }
                }
            }

            this.method16407(this.field23641);
            this.method16408(this.field23641);
        } else {
            Class5628.method17678("§cNoteBlockPlayer isn't available in creative mode!");
            this.method15999(false);
        }
    }

    private int method16414(Class6463 var1) {
        Map<Class108, Integer> var4 = new HashMap<>();

        for (Class6463 var6 : this.field23641) {
            int var7 = var4.getOrDefault(var6.field28403, 0);
            var4.put(var6.field28403, var7);
        }

        return var4.getOrDefault(var1.field28403, 0);
    }
}
