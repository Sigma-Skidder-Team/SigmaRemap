// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import java.util.List;
import javax.annotation.Nullable;
import com.google.common.collect.Maps;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import java.util.Random;
import java.util.UUID;
import java.util.Map;

public class Item implements Class3832
{
    public static final Map<Block, Item> field17355;
    private static final Class8967 field17356;
    private static final Class8967 field17357;
    private static final Class8967 field17358;
    private static final Class8967 field17359;
    private static final Class8967 field17360;
    public static final UUID field17361;
    public static final UUID field17362;
    public static final Random field17363;
    private final Map<ResourceLocation, Class8967> field17364;
    public final Class7207 field17365;
    private final Class1998 field17366;
    private final int field17367;
    private final int field17368;
    private final Item field17369;
    private String field17370;
    private final Class9082 field17371;
    
    public static int method11696(final Item class3820) {
        return (class3820 != null) ? Registry.field211.getId(class3820) : 0;
    }
    
    public static Item method11697(final int n) {
        return Registry.field211.method499(n);
    }
    
    @Deprecated
    public static Item method11698(final Block key) {
        return Item.field17355.getOrDefault(key, Items.AIR);
    }
    
    public Item(final Class8959 class8959) {
        this.field17364 = Maps.newHashMap();
        this.method11705(new ResourceLocation("lefthanded"), Item.field17358);
        this.method11705(new ResourceLocation("cooldown"), Item.field17359);
        this.method11705(new ResourceLocation("custom_model_data"), Item.field17360);
        this.field17365 = Class8959.method31788(class8959);
        this.field17366 = Class8959.method31789(class8959);
        this.field17369 = Class8959.method31790(class8959);
        this.field17368 = Class8959.method31791(class8959);
        this.field17367 = Class8959.method31792(class8959);
        this.field17371 = Class8959.method31793(class8959);
        if (this.field17368 > 0) {
            this.method11705(new ResourceLocation("damaged"), Item.field17356);
            this.method11705(new ResourceLocation("damage"), Item.field17357);
        }
    }
    
    public void method11699(final World class1847, final LivingEntity class1848, final ItemStack class1849, final int n) {
    }
    
    @Nullable
    public Class8967 method11700(final ResourceLocation class1932) {
        return this.field17364.get(class1932);
    }
    
    public boolean method11701() {
        return !this.field17364.isEmpty();
    }
    
    public boolean method11702(final CompoundNBT class51) {
        return false;
    }
    
    public boolean method11703(final BlockState class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099) {
        return true;
    }
    
    @Override
    public Item method11704() {
        return this;
    }
    
    public final void method11705(final ResourceLocation class1932, final Class8967 class1933) {
        this.field17364.put(class1932, class1933);
    }
    
    public Class2201 method11694(final Class7075 class7075) {
        return Class2201.field13402;
    }
    
    public float method11706(final ItemStack class8321, final BlockState class8322) {
        return 1.0f;
    }
    
    public Class9355<ItemStack> method11695(final World class1847, final PlayerEntity class1848, final Class316 class1849) {
        if (!this.method11743()) {
            return Class9355.method34676(class1848.method2715(class1849));
        }
        final ItemStack method2715 = class1848.method2715(class1849);
        if (!class1848.method2878(this.method11744().method32747())) {
            return Class9355.method34677(method2715);
        }
        class1848.method2762(class1849);
        return Class9355.method34675(method2715);
    }
    
    public ItemStack method11707(final ItemStack class8321, final World class8322, final LivingEntity class8323) {
        return this.method11743() ? class8323.method2791(class8322, class8321) : class8321;
    }
    
    public final int method11708() {
        return this.field17367;
    }
    
    public final int method11709() {
        return this.field17368;
    }
    
    public boolean method11710() {
        return this.field17368 > 0;
    }
    
    public boolean method11711(final ItemStack class8321, final LivingEntity class8322, final LivingEntity class8323) {
        return false;
    }
    
    public boolean method11712(final ItemStack class8321, final World class8322, final BlockState class8323, final BlockPos class8324, final LivingEntity class8325) {
        return false;
    }
    
    public boolean method11713(final BlockState class7096) {
        return false;
    }
    
    public boolean method11714(final ItemStack class8321, final PlayerEntity class8322, final LivingEntity class8323, final Class316 class8324) {
        return false;
    }
    
    public ITextComponent method11715() {
        return new Class2259(this.method11717(), new Object[0]);
    }
    
    @Override
    public String toString() {
        return Registry.field211.getKey(this).method7797();
    }
    
    public String method11716() {
        if (this.field17370 == null) {
            this.field17370 = Util.method27836("item", Registry.field211.getKey(this));
        }
        return this.field17370;
    }
    
    public String method11717() {
        return this.method11716();
    }
    
    public String method11718(final ItemStack class8321) {
        return this.method11717();
    }
    
    public boolean method11719() {
        return true;
    }
    
    @Nullable
    public final Item method11720() {
        return this.field17369;
    }
    
    public boolean method11721() {
        return this.field17369 != null;
    }
    
    public void method11722(final ItemStack class8321, final World class8322, final Entity class8323, final int n, final boolean b) {
    }
    
    public void method11723(final ItemStack class8321, final World class8322, final PlayerEntity class8323) {
    }
    
    public boolean method11724() {
        return false;
    }
    
    public Class1992 method11725(final ItemStack class8321) {
        return class8321.getItem().method11743() ? Class1992.field11155 : Class1992.field11154;
    }
    
    public int method11726(final ItemStack class8321) {
        if (!class8321.getItem().method11743()) {
            return 0;
        }
        return this.method11744().method32748() ? 16 : 32;
    }
    
    public void method11727(final ItemStack class8321, final World class8322, final LivingEntity class8323, final int n) {
    }
    
    public void method11728(final ItemStack class8321, final World class8322, final List<ITextComponent> list, final Class1981 class8323) {
    }
    
    public ITextComponent method11729(final ItemStack class8321) {
        return new Class2259(this.method11718(class8321), new Object[0]);
    }
    
    public boolean method11730(final ItemStack class8321) {
        return class8321.method27675();
    }
    
    public Class1998 method11731(final ItemStack class8321) {
        if (!class8321.method27675()) {
            return this.field17366;
        }
        switch (this.field17366.ordinal()) {
            case 1:
            case 2: {
                return Class1998.field11188;
            }
            case 3: {
                return Class1998.field11189;
            }
            default: {
                return this.field17366;
            }
        }
    }
    
    public boolean method11732(final ItemStack class8321) {
        return this.method11708() == 1 && this.method11710();
    }
    
    public static RayTraceResult method11733(final World class1847, final PlayerEntity class1848, final RayTraceContext.FluidMode class1849) {
        final float field2400 = class1848.rotationPitch;
        final float field2401 = class1848.rotationYaw;
        final Vec3d method1747 = class1848.method1747(1.0f);
        final float method1748 = MathHelper.cos(-field2401 * 0.017453292f - 3.1415927f);
        final float method1749 = MathHelper.sin(-field2401 * 0.017453292f - 3.1415927f);
        final float n = -MathHelper.cos(-field2400 * 0.017453292f);
        return class1847.rayTraceBlocks(new RayTraceContext(method1747, method1747.add(method1749 * n * 5.0, MathHelper.sin(-field2400 * 0.017453292f) * 5.0, method1748 * n * 5.0), RayTraceContext.BlockMode.OUTLINE, class1849, class1848));
    }
    
    public int method11734() {
        return 0;
    }
    
    public void method11735(final Class7207 class7207, final Class2265<ItemStack> class7208) {
        if (this.method11736(class7207)) {
            class7208.add(new ItemStack(this));
        }
    }
    
    public boolean method11736(final Class7207 class7207) {
        final Class7207 method11737 = this.method11737();
        return method11737 != null && (class7207 == Class7207.field27998 || class7207 == method11737);
    }
    
    @Nullable
    public final Class7207 method11737() {
        return this.field17365;
    }
    
    public boolean method11738(final ItemStack class8321, final ItemStack class8322) {
        return false;
    }
    
    public Multimap<String, Class7919> method11739(final Class2215 class2215) {
        return HashMultimap.create();
    }
    
    public boolean method11740(final ItemStack class8321) {
        return class8321.getItem() == Items.field31611;
    }
    
    public ItemStack method11741() {
        return new ItemStack(this);
    }
    
    public boolean method11742(final Class7909<Item> class7909) {
        return class7909.method25618(this);
    }
    
    public boolean method11743() {
        return this.field17371 != null;
    }
    
    @Nullable
    public Class9082 method11744() {
        return this.field17371;
    }
    
    public Class7795 method11745() {
        return Class8520.field35216;
    }
    
    public Class7795 method11746() {
        return Class8520.field35217;
    }
    
    static {
        field17355 = Maps.newHashMap();
        field17356 = ((class8321, class8322, class8323) -> class8321.method27631() ? 1.0f : 0.0f);
        field17357 = ((class8321, class8322, class8323) -> MathHelper.clamp(class8321.method27632() / (float)class8321.method27634(), 0.0f, 1.0f));
        field17358 = ((class8321, class8322, class8323) -> (class8323 != null && class8323.method2755() != Class2226.field13698) ? 1.0f : 0.0f);
        field17359 = ((class8321, class8322, class8323) -> (class8323 instanceof PlayerEntity) ? ((PlayerEntity)class8323).method2906().method25770(class8321.getItem(), 0.0f) : 0.0f);
        field17360 = ((class8321, class8322, class8323) -> class8321.method27656() ? ((float)class8321.method27657().getInt("CustomModelData")) : 0.0f);
        field17361 = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
        field17362 = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
        field17363 = new Random();
    }
}
