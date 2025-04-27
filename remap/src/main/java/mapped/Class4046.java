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
    public Class4046(final Block class3833, final Block class3834, final Properties class3835) {
        super(class3833, class3834, class3835);
    }
    
    @Override
    public ITextComponent method11729(final ItemStack class8321) {
        if (class8321.getItem() == Items.field31525) {
            if (class8321.method27656()) {
                Object o = null;
                final CompoundNBT method27657 = class8321.method27657();
                if (!method27657.contains("SkullOwner", 8)) {
                    if (method27657.contains("SkullOwner", 10)) {
                        final CompoundNBT method27658 = method27657.getCompound("SkullOwner");
                        if (method27658.contains("Name", 8)) {
                            o = method27658.getString("Name");
                        }
                    }
                }
                else {
                    o = method27657.getString("SkullOwner");
                }
                if (o != null) {
                    return new Class2259(this.getTranslationKey() + ".named", o);
                }
            }
        }
        return super.method11729(class8321);
    }
    
    @Override
    public boolean method11702(final CompoundNBT class51) {
        super.method11702(class51);
        if (class51.contains("SkullOwner", 8) && !StringUtils.isBlank(class51.getString("SkullOwner"))) {
            class51.put("SkullOwner", Class9346.method34641(new CompoundNBT(), Class493.method2508(new GameProfile(null, class51.getString("SkullOwner")))));
            return true;
        }
        return false;
    }
}
