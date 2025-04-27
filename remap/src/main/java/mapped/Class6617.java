// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.util.Pair;
import net.minecraft.item.ItemStack;

public class Class6617 extends Class6601
{
    private static String[] field26171;
    public final /* synthetic */ Class2215 field26193;
    public final /* synthetic */ Class3427 field26194;
    
    public Class6617(final Class3427 field26194, final IInventory class446, final int n, final int n2, final int n3, final Class2215 field26195) {
        this.field26194 = field26194;
        this.field26193 = field26195;
        super(class446, n, n2, n3);
    }
    
    @Override
    public int method20057() {
        return 1;
    }
    
    @Override
    public boolean method20046(final ItemStack class8321) {
        return this.field26193 == Class759.method4185(class8321);
    }
    
    @Override
    public boolean method20061(final PlayerEntity playerEntity) {
        final ItemStack method20053 = this.method20053();
        if (!method20053.method27620()) {
            if (!playerEntity.method2889()) {
                if (Class8742.method30217(method20053)) {
                    return false;
                }
            }
        }
        return super.method20061(playerEntity);
    }
    
    @Override
    public Pair<ResourceLocation, ResourceLocation> method20059() {
        return (Pair<ResourceLocation, ResourceLocation>)Pair.of((Object)Class3427.field16192, Class3427.method10941()[this.field26193.getIndex()]);
    }
}
