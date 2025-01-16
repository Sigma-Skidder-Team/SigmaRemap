// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.UUID;

public class Class808 extends Class806
{
    private static final UUID field4354;
    private static final DataParameter<Integer> field4355;
    private static final String[] field4356;
    private static final String[] field4357;
    private static final String[] field4358;
    private static final String[] field4359;
    private String field4360;
    private final String[] field4361;
    
    public Class808(final EntityType<? extends Class808> class7499, final World class7500) {
        super(class7499, class7500);
        this.field4361 = new String[2];
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class808.field4355, 0);
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        class51.putInt("Variant", this.method4772());
        if (!this.field4342.method2157(1).method27620()) {
            class51.put("ArmorItem", this.field4342.method2157(1).method27627(new CompoundNBT()));
        }
    }
    
    public ItemStack method4769() {
        return this.method2718(Class2215.field13604);
    }
    
    private void method4770(final ItemStack class8321) {
        this.method1803(Class2215.field13604, class8321);
        this.method4191(Class2215.field13604, 0.0f);
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        this.method4771(class51.getInt("Variant"));
        if (class51.contains("ArmorItem", 10)) {
            final ItemStack method27619 = ItemStack.method27619(class51.getCompound("ArmorItem"));
            if (!method27619.method27620()) {
                if (this.method4767(method27619)) {
                    this.field4342.method2160(1, method27619);
                }
            }
        }
        this.method4732();
    }
    
    public void method4771(final int i) {
        this.dataManager.set(Class808.field4355, i);
        this.method4773();
    }
    
    public int method4772() {
        return this.dataManager.get(Class808.field4355);
    }
    
    private void method4773() {
        this.field4360 = null;
    }
    
    private void method4774() {
        final int method4772 = this.method4772();
        final int n = (method4772 & 0xFF) % 7;
        final int n2 = ((method4772 & 0xFF00) >> 8) % 5;
        this.field4361[0] = Class808.field4356[n];
        this.field4361[1] = Class808.field4358[n2];
        this.field4360 = "horse/" + Class808.field4357[n] + Class808.field4359[n2];
    }
    
    public String method4775() {
        if (this.field4360 == null) {
            this.method4774();
        }
        return this.field4360;
    }
    
    public String[] method4776() {
        if (this.field4360 == null) {
            this.method4774();
        }
        return this.field4361;
    }
    
    @Override
    public void method4732() {
        super.method4732();
        this.method4777(this.field4342.method2157(1));
        this.method4191(Class2215.field13604, 0.0f);
    }
    
    private void method4777(final ItemStack class8321) {
        this.method4770(class8321);
        if (!this.world.isRemote) {
            this.method2710(Class8107.field33413).method23948(Class808.field4354);
            if (this.method4767(class8321)) {
                final int method12250 = ((Class4051)class8321.getItem()).method12250();
                if (method12250 != 0) {
                    this.method2710(Class8107.field33413).method23946(new Class7919(Class808.field4354, "Horse armor bonus", method12250, Class2157.field12809).method25640(false));
                }
            }
        }
    }
    
    @Override
    public void method4733(final Class446 class446) {
        final ItemStack method4769 = this.method4769();
        super.method4733(class446);
        final ItemStack method4770 = this.method4769();
        if (this.ticksExisted > 20) {
            if (this.method4767(method4770)) {
                if (method4769 != method4770) {
                    this.method1695(Class8520.field35274, 0.5f, 1.0f);
                }
            }
        }
    }
    
    @Override
    public void method4738(final SoundType class7696) {
        super.method4738(class7696);
        if (this.rand.nextInt(10) == 0) {
            this.method1695(Class8520.field35275, class7696.method24477() * 0.6f, class7696.method24478());
        }
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(this.method4763());
        this.method2710(Class8107.field33408).method23941(this.method4765());
        this.method2710(Class808.field4333).method23941(this.method4764());
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (this.world.isRemote) {
            if (this.dataManager.method33570()) {
                this.dataManager.method33580();
                this.method4773();
            }
        }
    }
    
    @Override
    public Class7795 method4160() {
        super.method4160();
        return Class8520.field35272;
    }
    
    @Override
    public Class7795 method2684() {
        super.method2684();
        return Class8520.field35276;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        super.method2683(class7929);
        return Class8520.field35279;
    }
    
    @Override
    public Class7795 method4737() {
        super.method4737();
        return Class8520.field35273;
    }
    
    @Override
    public boolean method4195(final PlayerEntity playerEntity, final Class316 class513) {
        final ItemStack method2715 = playerEntity.method2715(class513);
        final boolean b = !method2715.method27620();
        if (b && method2715.getItem() instanceof Class3831) {
            return super.method4195(playerEntity, class513);
        }
        if (!this.method2625()) {
            if (this.method4715() && playerEntity.method2804()) {
                this.method4740(playerEntity);
                return true;
            }
            if (this.isBeingRidden()) {
                return super.method4195(playerEntity, class513);
            }
        }
        if (b) {
            if (this.method4741(playerEntity, method2715)) {
                if (!playerEntity.field3025.field27304) {
                    method2715.method27693(1);
                }
                return true;
            }
            if (method2715.method27640(playerEntity, this, class513)) {
                return true;
            }
            if (!this.method4715()) {
                this.method4750();
                return true;
            }
            boolean b2 = false;
            Label_0223: {
                if (!this.method2625()) {
                    if (!this.method4736()) {
                        if (method2715.getItem() == Items.field31353) {
                            b2 = true;
                            break Label_0223;
                        }
                    }
                }
                b2 = false;
            }
            final boolean b3 = b2;
            if (this.method4767(method2715) || b3) {
                this.method4740(playerEntity);
                return true;
            }
        }
        if (!this.method2625()) {
            this.method4742(playerEntity);
            return true;
        }
        return super.method4195(playerEntity, class513);
    }
    
    @Override
    public boolean method4365(final Class789 class789) {
        return class789 != this && (class789 instanceof Class814 || class789 instanceof Class808) && this.method4753() && ((Class806)class789).method4753();
    }
    
    @Override
    public Class788 method4349(final Class788 class788) {
        Class806 class790;
        if (!(class788 instanceof Class814)) {
            final Class808 class789 = (Class808)class788;
            class790 = EntityType.field28989.method23371(this.world);
            final int nextInt = this.rand.nextInt(9);
            int nextInt2;
            if (nextInt >= 4) {
                if (nextInt >= 8) {
                    nextInt2 = this.rand.nextInt(7);
                }
                else {
                    nextInt2 = (class789.method4772() & 0xFF);
                }
            }
            else {
                nextInt2 = (this.method4772() & 0xFF);
            }
            final int nextInt3 = this.rand.nextInt(5);
            int n;
            if (nextInt3 >= 2) {
                if (nextInt3 >= 4) {
                    n = (nextInt2 | (this.rand.nextInt(5) << 8 & 0xFF00));
                }
                else {
                    n = (nextInt2 | (class789.method4772() & 0xFF00));
                }
            }
            else {
                n = (nextInt2 | (this.method4772() & 0xFF00));
            }
            ((Class808)class790).method4771(n);
        }
        else {
            class790 = EntityType.field29006.method23371(this.world);
        }
        this.method4754(class788, class790);
        return class790;
    }
    
    @Override
    public boolean method4766() {
        return true;
    }
    
    @Override
    public boolean method4767(final ItemStack class8321) {
        return class8321.getItem() instanceof Class4051;
    }
    
    @Nullable
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, Class5496 class1854, final CompoundNBT class1855) {
        int n;
        if (!(class1854 instanceof Class5500)) {
            n = this.rand.nextInt(7);
            class1854 = new Class5500(n);
        }
        else {
            n = ((Class5500)class1854).field22792;
        }
        this.method4771(n | this.rand.nextInt(5) << 8);
        return super.method4188(class1851, class1852, class1853, class1854, class1855);
    }
    
    static {
        field4354 = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
        field4355 = EntityDataManager.method33564(Class808.class, Class7709.field30654);
        field4356 = new String[] { "textures/entity/horse/horse_white.png", "textures/entity/horse/horse_creamy.png", "textures/entity/horse/horse_chestnut.png", "textures/entity/horse/horse_brown.png", "textures/entity/horse/horse_black.png", "textures/entity/horse/horse_gray.png", "textures/entity/horse/horse_darkbrown.png" };
        field4357 = new String[] { "hwh", "hcr", "hch", "hbr", "hbl", "hgr", "hdb" };
        field4358 = new String[] { null, "textures/entity/horse/horse_markings_white.png", "textures/entity/horse/horse_markings_whitefield.png", "textures/entity/horse/horse_markings_whitedots.png", "textures/entity/horse/horse_markings_blackdots.png" };
        field4359 = new String[] { "", "wo_", "wmo", "wdo", "bdo" };
    }
}
