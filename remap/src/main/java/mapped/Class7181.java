// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

import java.util.function.Consumer;

public class Class7181 extends Class7180
{
    private static String[] field27854;
    public final /* synthetic */ Class3820 field27855;
    public final /* synthetic */ Class6376 field27856;
    
    public Class7181(final Class6376 field27856, final Class3820 field27857) {
        this.field27856 = field27856;
        this.field27855 = field27857;
        super(field27856);
    }
    
    @Override
    public void method21974(final Consumer<ItemStack> consumer, final Class7529 class7529) {
        consumer.accept(new ItemStack(this.field27855));
    }
}
