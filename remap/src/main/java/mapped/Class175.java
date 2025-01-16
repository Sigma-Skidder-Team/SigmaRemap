// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import net.minecraft.item.ItemStack;

import java.util.function.Predicate;

public class Class175 implements Predicate<ItemStack>
{
    private static final Dynamic2CommandExceptionType field501;
    private final Item field502;
    private final Class51 field503;
    
    public Class175(final Item field502, final Class51 field503) {
        this.field502 = field502;
        this.field503 = field503;
    }
    
    public Item method771() {
        return this.field502;
    }
    
    @Override
    public boolean test(final ItemStack class8321) {
        return class8321.getItem() == this.field502 && Class9346.method34642(this.field503, class8321.method27657(), true);
    }
    
    public ItemStack method772(final int n, final boolean b) throws CommandSyntaxException {
        final ItemStack class8321 = new ItemStack(this.field502, n);
        if (this.field503 != null) {
            class8321.method27663(this.field503);
        }
        if (b && n > class8321.method27628()) {
            throw Class175.field501.create((Object) Registry.field211.getKey(this.field502), (Object)class8321.method27628());
        }
        return class8321;
    }
    
    public String method773() {
        final StringBuilder sb = new StringBuilder(Registry.field211.getId(this.field502));
        if (this.field503 != null) {
            sb.append(this.field503);
        }
        return sb.toString();
    }
    
    static {
        field501 = new Dynamic2CommandExceptionType((o, o2) -> new Class2259("arguments.item.overstacked", new Object[] { o, o2 }));
    }
}
