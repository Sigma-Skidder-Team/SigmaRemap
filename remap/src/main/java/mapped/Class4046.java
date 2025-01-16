// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.authlib.GameProfile;
import java.util.UUID;

import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import org.apache.commons.lang3.StringUtils;

public class Class4046 extends Class4043
{
    public Class4046(final Block class3833, final Block class3834, final Class8959 class3835) {
        super(class3833, class3834, class3835);
    }
    
    @Override
    public ITextComponent method11729(final ItemStack class8321) {
        if (class8321.getItem() == Items.field31525) {
            if (class8321.method27656()) {
                Object o = null;
                final Class51 method27657 = class8321.method27657();
                if (!method27657.method316("SkullOwner", 8)) {
                    if (method27657.method316("SkullOwner", 10)) {
                        final Class51 method27658 = method27657.method327("SkullOwner");
                        if (method27658.method316("Name", 8)) {
                            o = method27658.method323("Name");
                        }
                    }
                }
                else {
                    o = method27657.method323("SkullOwner");
                }
                if (o != null) {
                    return new Class2259(this.method11717() + ".named", new Object[] { o });
                }
            }
        }
        return super.method11729(class8321);
    }
    
    @Override
    public boolean method11702(final Class51 class51) {
        super.method11702(class51);
        if (class51.method316("SkullOwner", 8) && !StringUtils.isBlank((CharSequence)class51.method323("SkullOwner"))) {
            class51.method295("SkullOwner", Class9346.method34641(new Class51(), Class493.method2508(new GameProfile((UUID)null, class51.method323("SkullOwner")))));
            return true;
        }
        return false;
    }
}
