// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;

import java.util.List;

public class Class3212 extends Class3167
{
    private float field15650;
    private float field15651;
    private int field15652;
    private int field15653;
    private int field15654;
    private int field15655;
    private double field15656;
    
    public Class3212() {
        super(Class8013.field32990, "AAC", "Places block underneath if it is in hand");
        this.field15652 = 0;
        this.field15653 = 0;
        this.method9881(new Class4999("Haphe (AACAP)", "Never let's you touch the ground.", false));
    }
    
    @Override
    public void method9879() {
        this.field15653 = Class3212.field15514.field4684.field3006.field2743;
        this.field15650 = Class3212.field15514.field4684.rotationYaw;
        this.field15651 = Class3212.field15514.field4684.rotationPitch;
        this.field15652 = (int)Class3212.field15514.field4684.posY;
        this.field15655 = -1;
        ((Class3260)this.method9914()).field15750 = -1;
    }
    
    @Override
    public void method9897() {
        if (this.field15653 != -1) {
            if (this.method9914().method9887("ItemSpoof").equals("Switch")) {
                Class3212.field15514.field4684.field3006.field2743 = this.field15653;
            }
        }
        this.field15653 = -1;
        if (((Class3260)this.method9914()).field15750 >= 0) {
            Class3212.field15514.method5269().method17292(new Class4321(Class3212.field15514.field4684.field3006.field2743));
            ((Class3260)this.method9914()).field15750 = -1;
        }
        Class3212.field15514.field4633.field26532 = 1.0f;
    }
    
    @Class6753
    @Class6759
    public void method10098(final Class5721 class5721) {
        if (this.method9906() && Class3212.field15514.field4684 != null) {
            if (class5721.method16990() instanceof Class4321) {
                if (((Class3260)this.method9914()).field15750 >= 0) {
                    class5721.method16961(true);
                }
            }
        }
    }
    
    @Class6753
    public void method10099(final Class5723 class5723) {
        if (this.method9906()) {
            if (class5723.method16998() instanceof Class4328) {
                this.field15655 = 0;
            }
        }
    }
    
    @Class6753
    public void method10100(final Class5738 class5738) {
        if (this.method9906()) {
            if (Class3212.field15514.field4684.onGround) {
                if (Class9463.method35173().method35189().method21551(Class3385.class).method9906()) {
                    class5738.method17026(true);
                }
            }
        }
    }
    
    @Class6753
    public void method10101(final Class5717 class5717) {
        if (!this.method9906()) {
            return;
        }
        if (this.method9914().method9883("No Sprint")) {
            Class3212.field15514.field4684.method1816(false);
        }
        if (!this.method9883("Haphe (AACAP)")) {
            Class3212.field15514.field4648.field23441.field2162 = false;
            Class3212.field15514.field4684.method1816(false);
        }
        ((Class3260)this.method9914()).method10287(class5717);
        if (this.method9883("Haphe (AACAP)")) {
            if (Class3212.field15514.field4684.onGround && (Class3212.field15514.field4684.field2970 != 0.0f || Class3212.field15514.field4684.field2968 != 0.0f)) {
                this.field15654 = 0;
                Class3212.field15514.field4684.method2725();
                class5717.method16975(0.419998 + Class7482.method23140() * 0.1);
                if (this.field15655 < 3) {
                    ++this.field15655;
                }
            }
            else if (this.field15654 >= 0) {
                ++this.field15654;
            }
            if ((Class3212.field15514.field4684.field2970 == 0.0f && Class3212.field15514.field4684.field2968 == 0.0f) || Class3212.field15514.field4684.collidedHorizontally) {
                this.field15655 = 0;
            }
            this.field15656 = Class3227.method10174(this.field15654, this.field15655, () -> this.field15655 = 0);
            if (this.field15654 >= 0) {
                Class7482.method23149(class5717, this.field15656);
            }
        }
    }
    
    @Class6753
    private void method10102(final Class5735 class5735) {
        if (this.method9906()) {
            if (Class3212.field15514.field4683 != null) {
                if (Class3212.field15514.field4684 != null) {
                    if (this.method9883("Haphe (AACAP)")) {
                        if (Class7482.method23148()) {
                            if (!Class3212.field15514.field4684.method1815()) {
                                class5735.field23300 *= 1.14f;
                            }
                        }
                    }
                }
            }
        }
    }
    
    private boolean method10103() {
        final BlockRayTraceResult blockRayTraceResult = (BlockRayTraceResult)Class4609.method13699(Class3212.field15514.field4684.field4077, Class3212.field15514.field4684.field4078, Class4609.method13690(), 0.0f);
        boolean b = false;
        if (blockRayTraceResult != null) {
            if (blockRayTraceResult.getType() == RayTraceResult.Type.BLOCK) {
                if (this.method9914().method9887("ItemSpoof").equals("None")) {
                    final Class3260 class7006 = (Class3260)this.method9914();
                    if (!Class3260.method10279(Class3212.field15514.field4684.method2715(Class316.field1877).getItem())) {
                        return false;
                    }
                }
                if (this.method9883("Haphe (AACAP)")) {
                    if (!Class3212.field15514.field4684.field2967) {
                        if (!Class3212.field15514.field4684.onGround) {
                            if (blockRayTraceResult.getFace() == Direction.UP) {
                                return false;
                            }
                            if (blockRayTraceResult.getPos().getY() != this.field15652 - 1) {
                                return false;
                            }
                        }
                    }
                }
                if (blockRayTraceResult.getFace() == Direction.UP) {
                    if (blockRayTraceResult.getPos().getY() + 2 > Class3212.field15514.field4684.posY) {
                        if (Class4609.method13708(blockRayTraceResult.getPos())) {
                            return false;
                        }
                    }
                }
                if (blockRayTraceResult.getPos().getY() == Class3212.field15514.field4684.posY) {
                    return false;
                }
                ((Class3260)this.method9914()).method10282();
                final int field2743 = Class3212.field15514.field4684.field3006.field2743;
                if (!this.method9914().method9887("ItemSpoof").equals("None")) {
                    ((Class3260)this.method9914()).method10280();
                }
                final Class2201 method27319 = Class3212.field15514.field4682.method27319(Class3212.field15514.field4684, Class3212.field15514.field4683, Class316.field1877, blockRayTraceResult);
                if (this.method9914().method9887("ItemSpoof").equals("Spoof") || this.method9914().method9887("ItemSpoof").equals("LiteSpoof")) {
                    Class3212.field15514.field4684.field3006.field2743 = field2743;
                }
                if (method27319 == Class2201.field13400) {
                    if (!this.method9914().method9883("NoSwing")) {
                        Class3212.field15514.field4684.method2707(Class316.field1877);
                    }
                    else {
                        Class3212.field15514.method5269().method17292(new Class4380(Class316.field1877));
                    }
                    if (blockRayTraceResult.getFace() == Direction.UP) {
                        this.field15652 = blockRayTraceResult.getPos().getY() + 2;
                    }
                    b = true;
                }
            }
        }
        return b;
    }
    
    public List<Class9052> method10104(final Block class3833, final BlockPos class3834) {
        return Class8582.method29051(class3833, class3834, (int)Class3212.field15514.field4682.method27315());
    }
    
    @Class6753
    public void method10105(final Class5741 class5741) {
        if (!this.method9906()) {
            return;
        }
        if (this.method9883("Haphe (AACAP)")) {
            return;
        }
    }
    
    @Class6753
    @Class6755
    private void method10106(final Class5744 class5744) {
        if (this.method9906()) {
            if (!class5744.method17046()) {
                if (Class7482.method23148()) {
                    if (Class3212.field15514.field4684.onGround) {
                        if (this.method9883("Haphe (AACAP)")) {
                            if (!Class3212.field15514.field4684.field2967) {
                                Class3212.field15514.field4684.method2725();
                            }
                        }
                    }
                }
                if (!this.method9883("Haphe (AACAP)")) {
                    if (!this.method10103()) {
                        for (float n = 0.0f; n < 0.7f; n += 0.1f) {
                            if (this.method10103()) {
                                break;
                            }
                        }
                    }
                }
                else {
                    this.method10103();
                }
            }
            else {
                double field2396 = Class3212.field15514.field4684.posY;
                if (!Class3212.field15514.field4684.field2967) {
                    if (this.method9883("Haphe (AACAP)")) {
                        field2396 = this.field15652;
                    }
                }
                final List<Class9052> method10104 = this.method10104(Class7521.field29148, new BlockPos(Class3212.field15514.field4684.posX, (double)Math.round(field2396 - 1.0), Class3212.field15514.field4684.posZ));
                if (!method10104.isEmpty()) {
                    final Class9052 class5745 = method10104.get(method10104.size() - 1);
                    final BlockRayTraceResult method10105 = Class4609.method13697(this.field15650, this.field15651, 5.0f);
                    if (!method10105.getPos().equals(class5745.field38320) || !method10105.getFace().equals(class5745.field38321)) {
                        Class4609.method13673(class5745.field38320, class5745.field38321);
                        this.field15650 = Class4609.method13673(class5745.field38320, class5745.field38321)[0];
                        this.field15651 = Class4609.method13673(class5745.field38320, class5745.field38321)[1];
                    }
                }
                class5744.method17041(this.field15651);
                class5744.method17043(this.field15650);
            }
        }
    }
    
    @Class6753
    public void method10107(final Class5722 class5722) {
        if (this.method9906()) {
            if (this.method9914().method9887("Tower Mode").equalsIgnoreCase("Cubecraft")) {
                if (!Class6430.method19114() || this.method9914().method9883("Tower while moving")) {
                    class5722.method16961(true);
                }
            }
        }
    }
}
