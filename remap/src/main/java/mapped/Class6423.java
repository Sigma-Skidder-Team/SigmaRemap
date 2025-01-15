// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

import java.util.Iterator;

public interface Class6423
{
    public static final Class6423 field25532 = (class5491, class5492) -> class5492;
    
    ItemStack method19090(final Class5491 p0, final ItemStack p1);
    
    default void method19101() {
        Class3955.method12069(Items.field31280, new Class6410());
        Class3955.method12069(Items.field31581, new Class6412());
        Class3955.method12069(Items.field31580, new Class6413());
        Class3955.method12069(Items.field31374, new Class6414());
        Class3955.method12069(Items.field31355, new Class6417());
        Class3955.method12069(Items.field31510, new Class6411());
        Class3955.method12069(Items.field31579, new Class6424());
        Class3955.method12069(Items.field31582, new Class6425());
        final Class6419 class6419 = new Class6419();
        final Iterator<Class3831> iterator = Class3831.method11772().iterator();
        while (iterator.hasNext()) {
            Class3955.method12069(iterator.next(), class6419);
        }
        Class3955.method12069(Items.field31546, new Class6408());
        Class3955.method12069(Items.field31532, new Class6418());
        Class3955.method12069(Items.field31511, new Class6426());
        Class3955.method12069(Items.field31356, new Class6405(Class241.field1181));
        Class3955.method12069(Items.field31585, new Class6405(Class241.field1182));
        Class3955.method12069(Items.field31586, new Class6405(Class241.field1183));
        Class3955.method12069(Items.field31587, new Class6405(Class241.field1184));
        Class3955.method12069(Items.field31589, new Class6405(Class241.field1186));
        Class3955.method12069(Items.field31588, new Class6405(Class241.field1185));
        final Class6422 class6420 = new Class6422();
        Class3955.method12069(Items.field31351, class6420);
        Class3955.method12069(Items.field31350, class6420);
        Class3955.method12069(Items.field31360, class6420);
        Class3955.method12069(Items.field31361, class6420);
        Class3955.method12069(Items.field31359, class6420);
        Class3955.method12069(Items.field31362, class6420);
        Class3955.method12069(Items.field31349, new Class6420());
        Class3955.method12069(Items.field31277, new Class6403());
        Class3955.method12069(Items.field31400, new Class6399());
        Class3955.method12069(Class7521.field29283, new Class6407());
        final Class6396 class6421 = new Class6396();
        Class3955.method12069(Items.field31527, class6421);
        Class3955.method12069(Items.field31526, class6421);
        Class3955.method12069(Items.field31528, class6421);
        Class3955.method12069(Items.field31523, class6421);
        Class3955.method12069(Items.field31525, class6421);
        Class3955.method12069(Items.field31524, new Class6427());
        Class3955.method12069(Class7521.field29342, new Class6400());
        Class3955.method12069(Class7521.field29648.method11704(), new Class6401());
        final Class181[] values = Class181.values();
        for (int length = values.length, i = 0; i < length; ++i) {
            Class3955.method12069(Class3942.method12059(values[i]).method11704(), new Class6401());
        }
        Class3955.method12069(Items.field31442.method11704(), new Class6402());
        Class3955.method12069(Items.field31426.method11704(), new Class6398());
    }
}
