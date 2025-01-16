// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import org.apache.logging.log4j.Logger;

public class Class8245
{
    private static final Logger field33862;
    public final Class869 field33863;
    public final Class5799 field33864;
    private BlockPos field33865;
    private ItemStack field33866;
    public float field33867;
    private float field33868;
    public int field33869;
    private boolean field33870;
    private Class101 field33871;
    private final Object2ObjectLinkedOpenHashMap<Pair<BlockPos, Class2003>, Class8104> field33872;
    private int field33873;
    
    public Class8245(final Class869 field33863, final Class5799 field33864) {
        this.field33865 = new BlockPos(-1, -1, -1);
        this.field33866 = ItemStack.field34174;
        this.field33871 = Class101.field298;
        this.field33872 = (Object2ObjectLinkedOpenHashMap<Pair<BlockPos, Class2003>, Class8104>)new Object2ObjectLinkedOpenHashMap();
        this.field33863 = field33863;
        this.field33864 = field33864;
    }
    
    public static void method27307(final Class869 class869, final Class8245 class870, final BlockPos class871, final Direction class872) {
        if (!class869.field4683.method6725(class869.field4684, class871, class872)) {
            class870.method27311(class871);
        }
    }
    
    public void method27308(final PlayerEntity playerEntity) {
        this.field33871.method588(playerEntity.field3025);
    }
    
    public void method27309(final Class101 field33871) {
        (this.field33871 = field33871).method588(this.field33863.field4684.field3025);
    }
    
    public boolean method27310() {
        return this.field33871.method591();
    }
    
    public boolean method27311(final BlockPos class354) {
        if (this.field33863.field4684.method2803(this.field33863.field4683, class354, this.field33871)) {
            return false;
        }
        final Class1848 field4683 = this.field33863.field4683;
        final BlockState method6701 = field4683.getBlockState(class354);
        if (!this.field33863.field4684.getHeldItemMainhand().getItem().method11703(method6701, field4683, class354, this.field33863.field4684)) {
            return false;
        }
        final Block method6702 = method6701.getBlock();
        Label_0101: {
            if (!(method6702 instanceof Class3953)) {
                if (!(method6702 instanceof Class3941)) {
                    if (!(method6702 instanceof Class3839)) {
                        break Label_0101;
                    }
                }
            }
            if (!this.field33863.field4684.method2908()) {
                return false;
            }
        }
        if (!method6701.method21706()) {
            method6702.method11870(field4683, class354, method6701, this.field33863.field4684);
            final boolean method6703 = field4683.setBlockState(class354, field4683.method6702(class354).method21791(), 11);
            if (method6703) {
                method6702.method11824(field4683, class354, method6701);
            }
            return method6703;
        }
        return false;
    }
    
    public boolean method27312(final BlockPos field33865, final Direction class179) {
        if (this.field33863.field4684.method2803(this.field33863.field4683, field33865, this.field33871)) {
            return false;
        }
        if (this.field33863.field4683.getWorldBorder().contains(field33865)) {
            if (!this.field33871.method590()) {
                if (!this.field33870 || !this.method27317(field33865)) {
                    if (this.field33870) {
                        this.method27339(Class2003.field11241, this.field33865, class179);
                    }
                    final BlockState method6701 = this.field33863.field4683.getBlockState(field33865);
                    this.field33863.method5319().method32920(this.field33863.field4683, field33865, method6701, 0.0f);
                    this.method27339(Class2003.field11240, field33865, class179);
                    final boolean b = !method6701.method21706();
                    if (b) {
                        if (this.field33867 == 0.0f) {
                            method6701.method21745(this.field33863.field4683, field33865, this.field33863.field4684);
                        }
                    }
                    if (b && method6701.method21719(this.field33863.field4684, this.field33863.field4684.world, field33865) >= 1.0f) {
                        this.method27311(field33865);
                    }
                    else {
                        this.field33870 = true;
                        this.field33865 = field33865;
                        this.field33866 = this.field33863.field4684.getHeldItemMainhand();
                        this.field33867 = 0.0f;
                        this.field33868 = 0.0f;
                        this.field33863.field4683.method6780(this.field33863.field4684.getEntityId(), this.field33865, (int)(this.field33867 * 10.0f) - 1);
                    }
                }
            }
            else {
                this.field33863.method5319().method32920(this.field33863.field4683, field33865, this.field33863.field4683.getBlockState(field33865), 1.0f);
                this.method27339(Class2003.field11240, field33865, class179);
                method27307(this.field33863, this, field33865, class179);
                this.field33869 = 5;
            }
            return true;
        }
        return false;
    }
    
    public void method27313() {
        if (this.field33870) {
            this.field33863.method5319().method32920(this.field33863.field4683, this.field33865, this.field33863.field4683.getBlockState(this.field33865), -1.0f);
            this.method27339(Class2003.field11241, this.field33865, Direction.DOWN);
            this.field33870 = false;
            this.field33867 = 0.0f;
            this.field33863.field4683.method6780(this.field33863.field4684.getEntityId(), this.field33865, -1);
            this.field33863.field4684.method2905();
        }
    }
    
    public boolean method27314(final BlockPos class354, final Direction class355) {
        this.method27318();
        if (this.field33869 > 0) {
            --this.field33869;
            return true;
        }
        if (this.field33871.method590() && this.field33863.field4683.getWorldBorder().contains(class354)) {
            this.field33869 = 5;
            this.field33863.method5319().method32920(this.field33863.field4683, class354, this.field33863.field4683.getBlockState(class354), 1.0f);
            this.method27339(Class2003.field11240, class354, class355);
            method27307(this.field33863, this, class354, class355);
            return true;
        }
        if (!this.method27317(class354)) {
            return this.method27312(class354, class355);
        }
        final BlockState method6701 = this.field33863.field4683.getBlockState(class354);
        if (!method6701.method21706()) {
            this.field33867 += method6701.method21719(this.field33863.field4684, this.field33863.field4684.world, class354);
            if (this.field33868 % 4.0f == 0.0f) {
                final SoundType method6702 = method6701.getSoundType();
                this.field33863.method5299().method6422(new Class6836(method6702.method24482(), Class286.field1582, (method6702.method24477() + 1.0f) / 8.0f, method6702.method24478() * 0.5f, class354));
            }
            ++this.field33868;
            this.field33863.method5319().method32920(this.field33863.field4683, class354, method6701, MathHelper.clamp(this.field33867, 0.0f, 1.0f));
            if (this.field33867 >= 1.0f) {
                this.field33870 = false;
                this.method27339(Class2003.field11242, class354, class355);
                this.method27311(class354);
                this.field33867 = 0.0f;
                this.field33868 = 0.0f;
                this.field33869 = 5;
            }
            this.field33863.field4683.method6780(this.field33863.field4684.getEntityId(), this.field33865, (int)(this.field33867 * 10.0f) - 1);
            return true;
        }
        return this.field33870 = false;
    }
    
    public float method27315() {
        return this.field33871.method590() ? 5.0f : 4.5f;
    }
    
    public void method27316() {
        this.method27318();
        if (!this.field33864.getNetworkManager().method11187()) {
            this.field33864.getNetworkManager().method11193();
        }
        else {
            this.field33864.getNetworkManager().method11179();
        }
    }
    
    private boolean method27317(final BlockPos class354) {
        final ItemStack method2713 = this.field33863.field4684.getHeldItemMainhand();
        int n = (this.field33866.method27620() && method2713.method27620()) ? 1 : 0;
        if (!this.field33866.method27620()) {
            if (!method2713.method27620()) {
                int n2 = 0;
                Label_0152: {
                    if (method2713.getItem() == this.field33866.getItem()) {
                        if (ItemStack.method27642(method2713, this.field33866)) {
                            if (method2713.method27630() || method2713.method27632() == this.field33866.method27632()) {
                                n2 = 1;
                                break Label_0152;
                            }
                        }
                    }
                    n2 = 0;
                }
                n = n2;
            }
        }
        return class354.equals(this.field33865) && n != 0;
    }
    
    public void method27318() {
        final int field2743 = this.field33863.field4684.field3006.field2743;
        if (field2743 != this.field33873) {
            this.field33873 = field2743;
            this.field33864.method17292(new Class4321(this.field33873));
        }
    }
    
    public Class2201 method27319(final Class756 class756, final Class1848 class757, final Class316 class758, final Class7005 class759) {
        this.method27318();
        final BlockPos method21447 = class759.method21447();
        if (!this.field33863.field4683.getWorldBorder().contains(method21447)) {
            return Class2201.field13403;
        }
        final ItemStack method21448 = class756.method2715(class758);
        if (this.field33871 == Class101.field301) {
            this.field33864.method17292(new Class4329(class758, class759));
            return Class2201.field13400;
        }
        final boolean b = !class756.getHeldItemMainhand().method27620() || !class756.method2714().method27620();
        if (!class756.method2804() || !b) {
            final Class2201 method21449 = class757.getBlockState(method21447).method21744(class757, class756, class758, class759);
            if (method21449.method8374()) {
                this.field33864.method17292(new Class4329(class758, class759));
                return method21449;
            }
        }
        this.field33864.method17292(new Class4329(class758, class759));
        if (!method21448.method27620() && !class756.method2906().method25769(method21448.getItem())) {
            final Class7075 class760 = new Class7075(class756, class758, class759);
            Class2201 class761;
            if (!this.field33871.method590()) {
                class761 = method21448.method27623(class760);
            }
            else {
                final int method21450 = method21448.method27690();
                class761 = method21448.method27623(class760);
                method21448.method27691(method21450);
            }
            return class761;
        }
        return Class2201.field13402;
    }
    
    public Class2201 method27320(final PlayerEntity playerEntity, final World class513, final Class316 class514) {
        if (this.field33871 == Class101.field301) {
            return Class2201.field13402;
        }
        this.method27318();
        this.field33864.method17292(new Class4307(class514));
        final ItemStack method2715 = playerEntity.method2715(class514);
        if (!playerEntity.method2906().method25769(method2715.getItem())) {
            final int method2716 = method2715.method27690();
            final Class9355<ItemStack> method2717 = method2715.method27625(class513, playerEntity, class514);
            final ItemStack class515 = method2717.method34673();
            if (class515 != method2715 || class515.method27690() != method2716) {
                playerEntity.method2716(class514, class515);
            }
            return method2717.method34672();
        }
        return Class2201.field13402;
    }
    
    public Class756 method27306(final Class1848 class1848, final Class7474 class1849, final Class6520 class1850) {
        return new Class756(this.field33863, class1848, this.field33864, class1849, class1850);
    }
    
    public void method27321(final PlayerEntity playerEntity, final Entity class513) {
        this.method27318();
        this.field33864.method17292(new Class4381(class513));
        if (this.field33871 != Class101.field301) {
            playerEntity.method2837(class513);
            playerEntity.method2905();
        }
    }
    
    public Class2201 method27322(final PlayerEntity playerEntity, final Entity class513, final Class316 class514) {
        this.method27318();
        this.field33864.method17292(new Class4381(class513, class514));
        return (this.field33871 != Class101.field301) ? playerEntity.method2836(class513, class514) : Class2201.field13402;
    }
    
    public Class2201 method27323(final PlayerEntity playerEntity, final Entity class513, final Class7007 class514, final Class316 class515) {
        this.method27318();
        final Vec3d method16742 = class514.method21451().subtract(class513.getPosX(), class513.getPosY(), class513.getPosZ());
        this.field33864.method17292(new Class4381(class513, class515, method16742));
        return (this.field33871 != Class101.field301) ? class513.method1898(playerEntity, method16742, class515) : Class2201.field13402;
    }
    
    public ItemStack method27324(final int n, final int n2, final int n3, final Class2133 class2133, final PlayerEntity class2134) {
        return Class8639.method29366(n, n2, n3, class2133, class2134);
    }
    
    public void method27325(final int n, final Class3662<?> class3662, final boolean b) {
        this.field33864.method17292(new Class4387(n, class3662, b));
    }
    
    public void method27326(final int n, final int n2) {
        this.field33864.method17292(new Class4366(n, n2));
    }
    
    public void method27327(final ItemStack class8321, final int n) {
        if (this.field33871.method590()) {
            this.field33864.method17292(new Class4287(n, class8321));
        }
    }
    
    public void method27328(final ItemStack class8321) {
        if (this.field33871.method590()) {
            if (!class8321.method27620()) {
                this.field33864.method17292(new Class4287(-1, class8321));
            }
        }
    }
    
    public void method27329(final PlayerEntity playerEntity) {
        this.method27318();
        this.field33864.method17292(new Class4399(Class2003.field11245, BlockPos.ZERO, Direction.DOWN));
        playerEntity.method2769();
    }
    
    public boolean method27330() {
        return this.field33871.method591();
    }
    
    public boolean method27331() {
        return !this.field33871.method590();
    }
    
    public boolean method27332() {
        return this.field33871.method590();
    }
    
    public boolean method27333() {
        return this.field33871.method590();
    }
    
    public boolean method27334() {
        return this.field33863.field4684.isPassenger() && this.field33863.field4684.method1920() instanceof Class806;
    }
    
    public boolean method27335() {
        return this.field33871 == Class101.field301;
    }
    
    public Class101 method27336() {
        return this.field33871;
    }
    
    public boolean method27337() {
        return this.field33870;
    }
    
    public void method27338(final int n) {
        this.field33864.method17292(new Class4267(n));
    }
    
    public void method27339(final Class2003 class2003, final BlockPos class2004, final Direction class2005) {
        final Class756 field4684 = this.field33863.field4684;
        this.field33872.put((Object)Pair.of((Object)class2004, (Object)class2003), (Object)new Class8104(field4684.method1934(), field4684.rotationPitch, field4684.rotationYaw));
        this.field33864.method17292(new Class4399(class2003, class2004, class2005));
    }
    
    public void method27340(final Class1848 class1848, final BlockPos class1849, final BlockState class1850, final Class2003 class1851, final boolean b) {
        final Class8104 class1852 = (Class8104)this.field33872.remove((Object)Pair.of((Object)class1849, (Object)class1851));
        while (true) {
            Label_0023: {
                if (class1852 == null) {
                    break Label_0023;
                }
                if (!b) {
                    break Label_0023;
                }
                if (class1851 != Class2003.field11240) {
                    if (class1848.getBlockState(class1849) != class1850) {
                        break Label_0023;
                    }
                }
                while (this.field33872.size() >= 50) {
                    final Pair obj = (Pair)this.field33872.firstKey();
                    this.field33872.removeFirst();
                    Class8245.field33862.error("Too many unacked block actions, dropping " + obj);
                }
                return;
            }
            class1848.method6824(class1849, class1850);
            if (class1852 == null) {
                continue;
            }
            final Vec3d method26627 = class1852.method26627();
            this.field33863.field4684.method1728(method26627.x, method26627.y, method26627.z, class1852.method26629(), class1852.method26628());
            continue;
        }
    }
    
    static {
        field33862 = LogManager.getLogger();
    }
}
