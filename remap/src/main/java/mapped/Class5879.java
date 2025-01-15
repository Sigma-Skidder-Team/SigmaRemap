// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Class5879 extends Class5846<Class844>
{
    private static String[] field24100;
    private static final float[] field24101;
    private static final float[] field24102;
    private static final float[] field24103;
    private static final float[] field24104;
    private static final float[] field24105;
    private static final float[] field24106;
    private final Class6300 field24107;
    private final Class6300 field24108;
    private final Class6300[] field24109;
    private final Class6300[] field24110;
    
    public Class5879() {
        this.field24269 = 64;
        this.field24270 = 64;
        this.field24109 = new Class6300[12];
        this.field24107 = new Class6300(this);
        this.field24107.method18634(0, 0).method18636(-6.0f, 10.0f, -8.0f, 12.0f, 12.0f, 16.0f);
        this.field24107.method18634(0, 28).method18636(-8.0f, 10.0f, -6.0f, 2.0f, 12.0f, 12.0f);
        this.field24107.method18634(0, 28).method18637(6.0f, 10.0f, -6.0f, 2.0f, 12.0f, 12.0f, true);
        this.field24107.method18634(16, 40).method18636(-6.0f, 8.0f, -6.0f, 12.0f, 2.0f, 12.0f);
        this.field24107.method18634(16, 40).method18636(-6.0f, 22.0f, -6.0f, 12.0f, 2.0f, 12.0f);
        for (int i = 0; i < this.field24109.length; ++i) {
            (this.field24109[i] = new Class6300(this, 0, 0)).method18636(-1.0f, -4.5f, -1.0f, 2.0f, 9.0f, 2.0f);
            this.field24107.method18633(this.field24109[i]);
        }
        (this.field24108 = new Class6300(this, 8, 0)).method18636(-1.0f, 15.0f, 0.0f, 2.0f, 2.0f, 1.0f);
        this.field24107.method18633(this.field24108);
        this.field24110 = new Class6300[3];
        (this.field24110[0] = new Class6300(this, 40, 0)).method18636(-2.0f, 14.0f, 7.0f, 4.0f, 4.0f, 8.0f);
        (this.field24110[1] = new Class6300(this, 0, 54)).method18636(0.0f, 14.0f, 0.0f, 3.0f, 3.0f, 7.0f);
        this.field24110[2] = new Class6300(this);
        this.field24110[2].method18634(41, 32).method18636(0.0f, 14.0f, 0.0f, 2.0f, 2.0f, 6.0f);
        this.field24110[2].method18634(25, 19).method18636(1.0f, 10.5f, 3.0f, 1.0f, 9.0f, 9.0f);
        this.field24107.method18633(this.field24110[0]);
        this.field24110[0].method18633(this.field24110[1]);
        this.field24110[1].method18633(this.field24110[2]);
        this.method17626(0.0f, 0.0f);
    }
    
    @Override
    public Iterable<Class6300> method17570() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field24107);
    }
    
    public void method17625(final Class844 class844, final float n, final float n2, final float n3, final float n4, final float n5) {
        final float n6 = n3 - class844.ticksExisted;
        this.field24107.field25184 = n4 * 0.017453292f;
        this.field24107.field25183 = n5 * 0.017453292f;
        this.method17626(n3, (1.0f - class844.method5062(n6)) * 0.55f);
        this.field24108.field25182 = -8.25f;
        Entity class845 = Class869.method5277().method5303();
        if (class844.method5058()) {
            class845 = class844.method5059();
        }
        if (class845 != null) {
            final Vec3d method1747 = class845.method1747(0.0f);
            final Vec3d method1748 = class844.method1747(0.0f);
            if (method1747.y - method1748.y <= 0.0) {
                this.field24108.field25181 = 1.0f;
            }
            else {
                this.field24108.field25181 = 0.0f;
            }
            final Vec3d method1749 = class844.method1741(0.0f);
            final double method1750 = new Vec3d(method1749.x, 0.0, method1749.z).dotProduct(new Vec3d(method1748.x - method1747.x, 0.0, method1748.z - method1747.z).normalize().rotateYaw(1.5707964f));
            this.field24108.field25180 = MathHelper.method35640((float)Math.abs(method1750)) * 2.0f * (float)Math.signum(method1750);
        }
        this.field24108.field25187 = true;
        final float method1751 = class844.method5061(n6);
        this.field24110[0].field25184 = MathHelper.sin(method1751) * 3.1415927f * 0.05f;
        this.field24110[1].field25184 = MathHelper.sin(method1751) * 3.1415927f * 0.1f;
        this.field24110[1].field25180 = -1.5f;
        this.field24110[1].field25181 = 0.5f;
        this.field24110[1].field25182 = 14.0f;
        this.field24110[2].field25184 = MathHelper.sin(method1751) * 3.1415927f * 0.15f;
        this.field24110[2].field25180 = 0.5f;
        this.field24110[2].field25181 = 0.5f;
        this.field24110[2].field25182 = 6.0f;
    }
    
    private void method17626(final float n, final float n2) {
        for (int i = 0; i < 12; ++i) {
            this.field24109[i].field25183 = 3.1415927f * Class5879.field24101[i];
            this.field24109[i].field25184 = 3.1415927f * Class5879.field24102[i];
            this.field24109[i].field25185 = 3.1415927f * Class5879.field24103[i];
            this.field24109[i].field25180 = Class5879.field24104[i] * (1.0f + MathHelper.cos(n * 1.5f + i) * 0.01f - n2);
            this.field24109[i].field25181 = 16.0f + Class5879.field24105[i] * (1.0f + MathHelper.cos(n * 1.5f + i) * 0.01f - n2);
            this.field24109[i].field25182 = Class5879.field24106[i] * (1.0f + MathHelper.cos(n * 1.5f + i) * 0.01f - n2);
        }
    }
    
    static {
        field24101 = new float[] { 1.75f, 0.25f, 0.0f, 0.0f, 0.5f, 0.5f, 0.5f, 0.5f, 1.25f, 0.75f, 0.0f, 0.0f };
        field24102 = new float[] { 0.0f, 0.0f, 0.0f, 0.0f, 0.25f, 1.75f, 1.25f, 0.75f, 0.0f, 0.0f, 0.0f, 0.0f };
        field24103 = new float[] { 0.0f, 0.0f, 0.25f, 1.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.75f, 1.25f };
        field24104 = new float[] { 0.0f, 0.0f, 8.0f, -8.0f, -8.0f, 8.0f, 8.0f, -8.0f, 0.0f, 0.0f, 8.0f, -8.0f };
        field24105 = new float[] { -8.0f, -8.0f, -8.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 8.0f, 8.0f, 8.0f, 8.0f };
        field24106 = new float[] { 8.0f, -8.0f, 0.0f, 0.0f, -8.0f, -8.0f, 8.0f, 8.0f, 8.0f, -8.0f, 0.0f, 0.0f };
    }
}
