package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

import java.util.Random;

public class Class5163 extends Module {
    private Random field23434 = new Random();
    private boolean field23435;
    private int field23436;
    private int field23437;

    public Class5163() {
        super(ModuleCategory.PLAYER, "Derp", "Spazzes around");
        this.method15972(new Class6005("Rotation Mode", "Rotation Mode", 0, "Random", "Spin", "None"));
        this.method15972(new Class6004("Hit", "Randomly hit", true));
        this.method15972(new Class6004("Sneak", "Randomly sneak", true));
    }

    @EventTarget
    public void method16065(Class4399 var1) {
        if (this.method15996() && var1.method13921()) {
            if (this.method15974("Sneak")) {
                if (this.field23435) {
                    field23386.getClientPlayNetHandler().sendPacket(new Class5583(field23386.field1339, Class1865.field10041));
                } else {
                    field23386.getClientPlayNetHandler().sendPacket(new Class5583(field23386.field1339, Class1865.field10040));
                }
            }

            this.field23435 = !this.field23435;
            this.field23436++;
            if (this.method15974("Hit") && this.field23436 > this.field23434.nextInt(5) + 3) {
                this.field23436 = 0;
                Class79 var4 = Class79.values()[this.field23434.nextInt(1)];
                field23386.field1339.method2820(var4);
            }

            String var6 = this.method15978("Rotation Mode");
            switch (var6) {
                case "Random":
                    var1.method13918(this.field23434.nextFloat() * 360.0F);
                    var1.method13916(this.field23434.nextFloat() * 180.0F - 90.0F);
                    break;
                case "Spin":
                    this.field23437 += 20;

                    while (this.field23437 > 360) {
                        this.field23437 -= 360;
                    }

                    var1.method13918((float) this.field23437 + this.field23434.nextFloat());
            }
        }
    }

    @Override
    public void method15966() {
        this.field23437 = (int) field23386.field1339.field5031;
    }
}
