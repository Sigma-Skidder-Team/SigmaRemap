// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;
import java.util.Random;

public abstract class Class456 extends Class460
{
    public ResourceLocation field2710;
    public long field2711;
    
    public Class456(final Class5412<?> class5412) {
        super(class5412);
    }
    
    public static void method2323(final IBlockReader class1855, final Random random, final BlockPos class1856, final ResourceLocation class1857) {
        final TileEntity method6727 = class1855.getTileEntity(class1856);
        if (method6727 instanceof Class456) {
            ((Class456)method6727).method2327(class1857, random.nextLong());
        }
    }
    
    public boolean method2324(final CompoundNBT class51) {
        if (!class51.contains("LootTable", 8)) {
            return false;
        }
        this.field2710 = new ResourceLocation(class51.getString("LootTable"));
        this.field2711 = class51.getLong("LootTableSeed");
        return true;
    }
    
    public boolean method2325(final CompoundNBT class51) {
        if (this.field2710 != null) {
            class51.putString("LootTable", this.field2710.toString());
            if (this.field2711 != 0L) {
                class51.putLong("LootTableSeed", this.field2711);
            }
            return true;
        }
        return false;
    }
    
    public void method2326(final PlayerEntity playerEntity) {
        if (this.field2710 != null) {
            if (this.field2656.getServer() != null) {
                final Class9317 method6402 = this.field2656.getServer().method1581().method6402(this.field2710);
                this.field2710 = null;
                final Class9098 method6403 = new Class9098((Class1849)this.field2656).method32877(Class6683.field26367, new BlockPos(this.field2657)).method32874(this.field2711);
                if (playerEntity != null) {
                    method6403.method32876(playerEntity.method2907()).method32877(Class6683.field26362, playerEntity);
                }
                method6402.method34488(this, method6403.method32883(Class7104.field27711));
            }
        }
    }
    
    public void method2327(final ResourceLocation field2710, final long field2711) {
        this.field2710 = field2710;
        this.field2711 = field2711;
    }
    
    @Override
    public boolean method2156() {
        this.method2326(null);
        return this.method2246().stream().allMatch(ItemStack::method27620);
    }
    
    @Override
    public ItemStack method2157(final int n) {
        this.method2326(null);
        return this.method2246().get(n);
    }
    
    @Override
    public ItemStack method2158(final int n, final int n2) {
        this.method2326(null);
        final ItemStack method28422 = Class8508.method28422(this.method2246(), n, n2);
        if (!method28422.method27620()) {
            this.method2161();
        }
        return method28422;
    }
    
    @Override
    public ItemStack method2159(final int n) {
        this.method2326(null);
        return Class8508.method28423(this.method2246(), n);
    }
    
    @Override
    public void method2160(final int n, final ItemStack class8321) {
        this.method2326(null);
        this.method2246().set(n, class8321);
        if (class8321.method27690() > this.method2254()) {
            class8321.method27691(this.method2254());
        }
        this.method2161();
    }
    
    @Override
    public boolean method2162(final PlayerEntity playerEntity) {
        return this.field2656.getTileEntity(this.field2657) == this && playerEntity.method1733(this.field2657.getX() + 0.5, this.field2657.getY() + 0.5, this.field2657.getZ() + 0.5) <= 64.0;
    }
    
    @Override
    public void method2164() {
        this.method2246().clear();
    }
    
    public abstract Class2265<ItemStack> method2246();
    
    public abstract void method2247(final Class2265<ItemStack> p0);
    
    @Override
    public boolean method2328(final PlayerEntity playerEntity) {
        return super.method2328(playerEntity) && (this.field2710 == null || !playerEntity.isSpectator());
    }
    
    @Nullable
    @Override
    public Class3418 method2166(final int n, final Class464 class464, final PlayerEntity class465) {
        if (!this.method2328(class465)) {
            return null;
        }
        this.method2326(class464.field2744);
        return this.method2253(n, class464);
    }
}
