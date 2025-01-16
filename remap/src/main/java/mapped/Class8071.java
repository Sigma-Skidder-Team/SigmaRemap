// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util2.Direction;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import java.util.Objects;
import org.apache.logging.log4j.Logger;

public class Class8071
{
    private static final Logger field33246;
    public Class1849 field33247;
    public Class513 field33248;
    private Class101 field33249;
    private boolean field33250;
    private int field33251;
    private BlockPos field33252;
    private int field33253;
    private boolean field33254;
    private BlockPos field33255;
    private int field33256;
    private int field33257;
    
    public Class8071(final Class1849 field33247) {
        this.field33249 = Class101.field297;
        this.field33252 = BlockPos.ZERO;
        this.field33255 = BlockPos.ZERO;
        this.field33257 = -1;
        this.field33247 = field33247;
    }
    
    public void method26481(final Class101 field33249) {
        (this.field33249 = field33249).method588(this.field33248.field3025);
        this.field33248.method2882();
        this.field33248.field3040.method1537().method20586(new Class4330(Class2156.field12804, new Class513[] { this.field33248 }));
        this.field33247.method6867();
    }
    
    public Class101 method26482() {
        return this.field33249;
    }
    
    public boolean method26483() {
        return this.field33249.method591();
    }
    
    public boolean method26484() {
        return this.field33249.method590();
    }
    
    public void method26485(final Class101 field33249) {
        if (this.field33249 == Class101.field297) {
            this.field33249 = field33249;
        }
        this.method26481(this.field33249);
    }
    
    public void method26476() {
        ++this.field33253;
        if (!this.field33254) {
            if (this.field33250) {
                final BlockState method6701 = this.field33247.getBlockState(this.field33252);
                if (!method6701.method21706()) {
                    this.method26486(method6701, this.field33252, this.field33251);
                }
                else {
                    this.field33247.method6780(this.field33248.getEntityId(), this.field33252, -1);
                    this.field33257 = -1;
                    this.field33250 = false;
                }
            }
        }
        else {
            final BlockState method6702 = this.field33247.getBlockState(this.field33255);
            if (!method6702.method21706()) {
                if (this.method26486(method6702, this.field33255, this.field33256) >= 1.0f) {
                    this.field33254 = false;
                    this.method26488(this.field33255);
                }
            }
            else {
                this.field33254 = false;
            }
        }
    }
    
    private float method26486(final BlockState class7096, final BlockPos class7097, final int n) {
        final float n2 = class7096.method21719(this.field33248, this.field33248.world, class7097) * (this.field33253 - n + 1);
        final int field33257 = (int)(n2 * 10.0f);
        if (field33257 != this.field33257) {
            this.field33247.method6780(this.field33248.getEntityId(), class7097, field33257);
            this.field33257 = field33257;
        }
        return n2;
    }
    
    public void method26478(final BlockPos field33255, final Class2003 class2003, final Direction class2004, final int n) {
        final double n2 = this.field33248.getPosX() - (field33255.getX() + 0.5);
        final double n3 = this.field33248.getPosY() - (field33255.getY() + 0.5) + 1.5;
        final double n4 = this.field33248.getPosZ() - (field33255.getZ() + 0.5);
        if (n2 * n2 + n3 * n3 + n4 * n4 <= 36.0) {
            if (field33255.getY() < n) {
                if (class2003 != Class2003.field11240) {
                    if (class2003 != Class2003.field11242) {
                        if (class2003 == Class2003.field11241) {
                            this.field33250 = false;
                            if (!Objects.equals(this.field33252, field33255)) {
                                Class8071.field33246.warn("Mismatch in destroy block pos: " + this.field33252 + " " + field33255);
                                this.field33247.method6780(this.field33248.getEntityId(), this.field33252, -1);
                                this.field33248.field3039.method17469(new Class4320(this.field33252, this.field33247.getBlockState(this.field33252), class2003, true, "aborted mismatched destroying"));
                            }
                            this.field33247.method6780(this.field33248.getEntityId(), field33255, -1);
                            this.field33248.field3039.method17469(new Class4320(field33255, this.field33247.getBlockState(field33255), class2003, true, "aborted destroying"));
                        }
                    }
                    else {
                        if (field33255.equals(this.field33252)) {
                            final int n5 = this.field33253 - this.field33251;
                            final BlockState method6701 = this.field33247.getBlockState(field33255);
                            if (!method6701.method21706()) {
                                if (method6701.method21719(this.field33248, this.field33248.world, field33255) * (n5 + 1) >= 0.7f) {
                                    this.field33250 = false;
                                    this.field33247.method6780(this.field33248.getEntityId(), field33255, -1);
                                    this.method26487(field33255, class2003, "destroyed");
                                    return;
                                }
                                if (!this.field33254) {
                                    this.field33250 = false;
                                    this.field33254 = true;
                                    this.field33255 = field33255;
                                    this.field33256 = this.field33251;
                                }
                            }
                        }
                        this.field33248.field3039.method17469(new Class4320(field33255, this.field33247.getBlockState(field33255), class2003, true, "stopped destroying"));
                    }
                }
                else {
                    if (!this.field33247.method6760(this.field33248, field33255)) {
                        this.field33248.field3039.method17469(new Class4320(field33255, this.field33247.getBlockState(field33255), class2003, false, "may not interact"));
                        return;
                    }
                    if (this.method26484()) {
                        if (this.field33247.method6725(null, field33255, class2004)) {
                            this.field33248.field3039.method17469(new Class4320(field33255, this.field33247.getBlockState(field33255), class2003, true, "fire put out"));
                        }
                        else {
                            this.method26487(field33255, class2003, "creative destroy");
                        }
                        return;
                    }
                    if (this.field33248.method2803(this.field33247, field33255, this.field33249)) {
                        this.field33248.field3039.method17469(new Class4320(field33255, this.field33247.getBlockState(field33255), class2003, false, "block action restricted"));
                        return;
                    }
                    this.field33247.method6725(null, field33255, class2004);
                    this.field33251 = this.field33253;
                    float method6702 = 1.0f;
                    final BlockState method6703 = this.field33247.getBlockState(field33255);
                    if (!method6703.method21706()) {
                        method6703.method21745(this.field33247, field33255, this.field33248);
                        method6702 = method6703.method21719(this.field33248, this.field33248.world, field33255);
                    }
                    if (!method6703.method21706() && method6702 >= 1.0f) {
                        this.method26487(field33255, class2003, "insta mine");
                    }
                    else {
                        if (this.field33250) {
                            this.field33248.field3039.method17469(new Class4320(this.field33252, this.field33247.getBlockState(this.field33252), Class2003.field11240, false, "abort destroying since another started (client insta mine, server disagreed)"));
                        }
                        this.field33250 = true;
                        this.field33252 = field33255.toImmutable();
                        final int field33256 = (int)(method6702 * 10.0f);
                        this.field33247.method6780(this.field33248.getEntityId(), field33255, field33256);
                        this.field33248.field3039.method17469(new Class4320(field33255, this.field33247.getBlockState(field33255), class2003, true, "actual start of destroying"));
                        this.field33257 = field33256;
                    }
                }
            }
            else {
                this.field33248.field3039.method17469(new Class4320(field33255, this.field33247.getBlockState(field33255), class2003, false, "too high"));
            }
        }
        else {
            this.field33248.field3039.method17469(new Class4320(field33255, this.field33247.getBlockState(field33255), class2003, false, "too far"));
        }
    }
    
    public void method26487(final BlockPos class354, final Class2003 class355, final String s) {
        if (!this.method26488(class354)) {
            this.field33248.field3039.method17469(new Class4320(class354, this.field33247.getBlockState(class354), class355, false, s));
        }
        else {
            this.field33248.field3039.method17469(new Class4320(class354, this.field33247.getBlockState(class354), class355, true, s));
        }
    }
    
    public boolean method26488(final BlockPos class354) {
        final BlockState method6701 = this.field33247.getBlockState(class354);
        if (!this.field33248.getHeldItemMainhand().getItem().method11703(method6701, this.field33247, class354, this.field33248)) {
            return false;
        }
        final TileEntity method6702 = this.field33247.getTileEntity(class354);
        final Block method6703 = method6701.getBlock();
        Label_0072: {
            if (!(method6703 instanceof Class3953)) {
                if (!(method6703 instanceof Class3941)) {
                    if (!(method6703 instanceof Class3839)) {
                        break Label_0072;
                    }
                }
            }
            if (!this.field33248.method2908()) {
                this.field33247.method6693(class354, method6701, method6701, 3);
                return false;
            }
        }
        if (this.field33248.method2803(this.field33247, class354, this.field33249)) {
            return false;
        }
        method6703.method11870(this.field33247, class354, method6701, this.field33248);
        final boolean method6704 = this.field33247.method6690(class354, false);
        if (method6704) {
            method6703.method11824(this.field33247, class354, method6701);
        }
        if (!this.method26484()) {
            final ItemStack method6705 = this.field33248.getHeldItemMainhand();
            final ItemStack method6706 = method6705.method27641();
            final boolean method6707 = this.field33248.method2825(method6701);
            method6705.method27638(this.field33247, method6701, class354, this.field33248);
            if (method6704) {
                if (method6707) {
                    method6703.method11852(this.field33247, this.field33248, class354, method6701, method6702, method6706);
                }
            }
            return true;
        }
        return true;
    }
    
    public Class2201 method26479(final PlayerEntity playerEntity, final World class513, final ItemStack class514, final Class316 class515) {
        if (this.field33249 == Class101.field301) {
            return Class2201.field13402;
        }
        if (!playerEntity.method2906().method25769(class514.getItem())) {
            final int method27690 = class514.method27690();
            final int method27691 = class514.method27632();
            final Class9355<ItemStack> method27692 = class514.method27625(class513, playerEntity, class515);
            final ItemStack class516 = method27692.method34673();
            if (class516 == class514) {
                if (class516.method27690() == method27690) {
                    if (class516.method27652() <= 0) {
                        if (class516.method27632() == method27691) {
                            return method27692.method34672();
                        }
                    }
                }
            }
            if (method27692.method34672() == Class2201.field13403) {
                if (class516.method27652() > 0) {
                    if (!playerEntity.method2756()) {
                        return method27692.method34672();
                    }
                }
            }
            playerEntity.method2716(class515, class516);
            if (this.method26484()) {
                class516.method27691(method27690);
                if (class516.method27630()) {
                    if (class516.method27632() != method27691) {
                        class516.method27633(method27691);
                    }
                }
            }
            if (class516.method27620()) {
                playerEntity.method2716(class515, ItemStack.field34174);
            }
            if (!playerEntity.method2756()) {
                ((Class513) playerEntity).method2929(playerEntity.field3008);
            }
            return method27692.method34672();
        }
        return Class2201.field13402;
    }
    
    public Class2201 method26480(final PlayerEntity playerEntity, final World class513, final ItemStack class514, final Class316 class515, final BlockRayTraceResult class516) {
        final BlockPos method21447 = class516.getPos();
        final BlockState method21448 = class513.getBlockState(method21447);
        if (this.field33249 != Class101.field301) {
            final boolean b = !playerEntity.getHeldItemMainhand().method27620() || !playerEntity.method2714().method27620();
            if (!playerEntity.method2804() || !b) {
                final Class2201 method21449 = method21448.method21744(class513, playerEntity, class515, class516);
                if (method21449.method8374()) {
                    return method21449;
                }
            }
            if (class514.method27620() || playerEntity.method2906().method25769(class514.getItem())) {
                return Class2201.field13402;
            }
            final Class7075 class517 = new Class7075(playerEntity, class515, class516);
            if (!this.method26484()) {
                return class514.method27623(class517);
            }
            final int method21450 = class514.method27690();
            final Class2201 method21451 = class514.method27623(class517);
            class514.method27691(method21450);
            return method21451;
        }
        else {
            final Class434 method21452 = method21448.method21754(class513, method21447);
            if (method21452 == null) {
                return Class2201.field13402;
            }
            playerEntity.method2833(method21452);
            return Class2201.field13400;
        }
    }
    
    public void method26489(final Class1849 field33247) {
        this.field33247 = field33247;
    }
    
    static {
        field33246 = LogManager.getLogger();
    }
}
