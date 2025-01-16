// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

import javax.annotation.Nullable;
import java.util.Iterator;

public abstract class Class433 extends Class428 implements Class446, Class434
{
    private Class2265<ItemStack> field2645;
    private boolean field2646;
    private ResourceLocation field2647;
    private long field2648;
    
    public Class433(final EntityType<?> class7499, final World class7500) {
        super(class7499, class7500);
        this.field2645 = Class2265.method8507(36, ItemStack.EMPTY);
        this.field2646 = true;
    }
    
    public Class433(final EntityType<?> class7499, final double n, final double n2, final double n3, final World class7500) {
        super(class7499, class7500, n, n2, n3);
        this.field2645 = Class2265.method8507(36, ItemStack.EMPTY);
        this.field2646 = true;
    }
    
    @Override
    public void method2123(final DamageSource class7929) {
        super.method2123(class7929);
        if (this.world.method6765().method31216(Class8878.field37321)) {
            Class9193.method33639(this.world, this, this);
        }
    }
    
    @Override
    public boolean method2156() {
        final Iterator<Object> iterator = this.field2645.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().method27620()) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public ItemStack method2157(final int n) {
        this.method2163(null);
        return this.field2645.get(n);
    }
    
    @Override
    public ItemStack method2158(final int n, final int n2) {
        this.method2163(null);
        return Class8508.method28422(this.field2645, n, n2);
    }
    
    @Override
    public ItemStack method2159(final int n) {
        this.method2163(null);
        final ItemStack class8321 = this.field2645.get(n);
        if (!class8321.method27620()) {
            this.field2645.set(n, ItemStack.EMPTY);
            return class8321;
        }
        return ItemStack.EMPTY;
    }
    
    @Override
    public void method2160(final int n, final ItemStack class8321) {
        this.method2163(null);
        this.field2645.set(n, class8321);
        if (!class8321.method27620()) {
            if (class8321.method27690() > this.method2254()) {
                class8321.method27691(this.method2254());
            }
        }
    }
    
    @Override
    public boolean method1893(final int n, final ItemStack class8321) {
        if (n >= 0 && n < this.method2239()) {
            this.method2160(n, class8321);
            return true;
        }
        return false;
    }
    
    @Override
    public void method2161() {
    }
    
    @Override
    public boolean method2162(final PlayerEntity playerEntity) {
        return !this.removed && playerEntity.method1734(this) <= 64.0;
    }
    
    @Nullable
    @Override
    public Entity method1854(final DimensionType class383) {
        this.field2646 = false;
        return super.method1854(class383);
    }
    
    @Override
    public void method1652() {
        if (!this.world.isRemote) {
            if (this.field2646) {
                Class9193.method33639(this.world, this, this);
            }
        }
        super.method1652();
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        if (this.field2647 == null) {
            Class8508.method28424(class51, this.field2645);
        }
        else {
            class51.putString("LootTable", this.field2647.toString());
            if (this.field2648 != 0L) {
                class51.putLong("LootTableSeed", this.field2648);
            }
        }
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        this.field2645 = Class2265.method8507(this.method2239(), ItemStack.EMPTY);
        if (!class51.contains("LootTable", 8)) {
            Class8508.method28426(class51, this.field2645);
        }
        else {
            this.field2647 = new ResourceLocation(class51.getString("LootTable"));
            this.field2648 = class51.getLong("LootTableSeed");
        }
    }
    
    @Override
    public boolean method1770(final PlayerEntity playerEntity, final Class316 class513) {
        playerEntity.method2833(this);
        return true;
    }
    
    @Override
    public void method2130() {
        float n = 0.98f;
        if (this.field2647 == null) {
            n += (15 - Class3418.method10898(this)) * 0.001f;
        }
        this.method1936(this.getMotion().mul(n, 0.0, n));
    }
    
    public void method2163(final PlayerEntity playerEntity) {
        if (this.field2647 != null) {
            if (this.world.getServer() != null) {
                final Class9317 method6402 = this.world.getServer().method1581().method6402(this.field2647);
                this.field2647 = null;
                final Class9098 method6403 = new Class9098((Class1849)this.world).method32877(Class6683.field26367, new BlockPos(this)).method32874(this.field2648);
                if (playerEntity != null) {
                    method6403.method32876(playerEntity.method2907()).method32877(Class6683.field26362, playerEntity);
                }
                method6402.method34488(this, method6403.method32883(Class7104.field27711));
            }
        }
    }
    
    @Override
    public void method2164() {
        this.method2163(null);
        this.field2645.clear();
    }
    
    public void method2165(final ResourceLocation field2647, final long field2648) {
        this.field2647 = field2647;
        this.field2648 = field2648;
    }
    
    @Nullable
    @Override
    public Class3418 method2166(final int n, final Class464 class464, final PlayerEntity class465) {
        if (this.field2647 != null && class465.isSpectator()) {
            return null;
        }
        this.method2163(class464.field2744);
        return this.method2167(n, class464);
    }
    
    public abstract Class3418 method2167(final int p0, final Class464 p1);
}
