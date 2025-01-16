// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;

public class Class3270 extends Class3167
{
    private int field15760;
    private Class7617 field15761;
    
    public Class3270() {
        super(Class8013.field32990, "Bow", "Fly for Bow");
        this.field15761 = new Class7617();
    }
    
    @Override
    public void method9897() {
        if (Class3270.field15514.field4633.field26532 == 0.1f) {
            Class3270.field15514.field4633.field26532 = 1.0f;
        }
    }
    
    @Override
    public void method9917() {
    }
    
    @Class6753
    public void method10304(final Class5751 class5751) {
        if (this.method9906()) {
            if (Class3270.field15514.player.method2715(Class316.field1877).getItem() == Items.field31279) {
                if (this.field15760 >= 1) {
                    class5751.method16961(true);
                }
            }
        }
    }
    
    @Class6753
    public void method10305(final Class5717 class5717) {
        if (!this.method9906()) {
            return;
        }
        final double field22771 = class5717.method16978().y;
        class5717.method16978().y = 0.0;
        final double method16752 = class5717.method16978().length();
        class5717.method16978().y = field22771;
        final float n = Class7482.method23143()[1];
        final float n2 = Class7482.method23143()[2];
        final float n3 = Class7482.method23143()[0];
        System.out.println(method16752);
        if ((n != 0.0f || n2 != 0.0f) && class5717.method16978().y >= -0.5) {
            final double cos = Math.cos(Math.toRadians(n3));
            final double sin = Math.sin(Math.toRadians(n3));
            class5717.method16973(n * method16752 * cos + n2 * method16752 * sin);
            class5717.method16977(n * method16752 * sin - n2 * method16752 * cos);
            Class3270.field15514.player.getMotion().x = class5717.method16972();
            Class3270.field15514.player.getMotion().y = class5717.method16974();
            return;
        }
        class5717.method16973(0.0);
        class5717.method16977(0.0);
    }
    
    @Class6753
    public void method10306(final Class5744 class5744) {
        if (!this.method9906() || !class5744.method17046()) {
            return;
        }
        if (!this.field15761.method23937()) {
            this.field15761.method23932();
        }
        final int method10307 = this.method10307();
        if (method10307 < 0 && method10307 > 8) {
            return;
        }
        if (Class3270.field15514.player.method2715(Class316.field1877).getItem() == Items.field31279) {
            if (Class3363.method10673(Items.field31280) == 0) {
                if (this.field15761.method23935() > 5000L) {
                    Class9463.method35173().method35197().method25776(new Class6224("BowFly", "You have no arrows"));
                    this.field15761.method23934();
                }
                if (Class3270.field15514.field4633.field26532 == 0.1f) {
                    Class3270.field15514.field4633.field26532 = 1.0f;
                }
                return;
            }
            float field2399 = Class3270.field15514.player.rotationYaw;
            float n = -90.0f;
            if (Class3270.field15514.player.field2970 != 0.0f || Class3270.field15514.player.field2968 != 0.0f) {
                n = -80.0f;
            }
            if (Class3270.field15514.player.field2970 < 0.0f) {
                field2399 -= 180.0f;
            }
            if (Class3270.field15514.player.getMotion().y < -0.1) {
                n = 90.0f;
            }
            class5744.method17041(n);
            class5744.method17043(field2399);
            if (Class3270.field15514.player.onGround && Class3270.field15514.player.collidedVertically) {
                Class3270.field15514.player.method2725();
            }
            else if (Class3270.field15514.player.getMotion().y >= 0.0) {
                if (Class3270.field15514.field4633.field26532 == 0.1f) {
                    Class3270.field15514.field4633.field26532 = 1.0f;
                }
            }
            else {
                Class3270.field15514.field4633.field26532 = 0.1f;
            }
            ++this.field15760;
            if (this.field15760 < 4) {
                if (this.field15760 == 1) {
                    Class3270.field15514.method5269().method17292(new Class4307(Class316.field1877));
                }
            }
            else {
                Class3270.field15514.method5269().method17292(new Class4399(Class2003.field11245, BlockPos.ZERO, Direction.DOWN));
                this.field15760 = 0;
            }
        }
    }
    
    private int method10307() {
        for (int i = 36; i < 45; ++i) {
            if (Class3270.field15514.player.field3008.method10878(i).method20054() && Class3270.field15514.player.field3008.method10878(i).method20053().getItem() == Items.field31279) {
                return i - 36;
            }
        }
        for (int j = 9; j < 36; ++j) {
            if (Class3270.field15514.player.field3008.method10878(j).method20054() && Class3270.field15514.player.field3008.method10878(j).method20053().getItem() == Items.field31279) {
                Class8639.method29370(j, 7);
                return 7;
            }
        }
        return -1;
    }
}
