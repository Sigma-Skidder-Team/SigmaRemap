// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import com.google.common.collect.Lists;
import net.minecraft.entity.Entity;

import java.util.Collection;
import java.util.function.Supplier;

public class Class8954 implements Class8953
{
    private static String[] field37649;
    private final Class9043 field37650;
    
    public Class8954(final Class9043 field37650) {
        this.field37650 = field37650;
    }
    
    @Override
    public Collection<String> method31766(final Class7492 class7492, final Supplier<Collection<String>> supplier) throws CommandSyntaxException {
        final List<? extends Entity> method32511 = this.field37650.method32511(class7492);
        if (!method32511.isEmpty()) {
            final ArrayList arrayList = Lists.newArrayList();
            final Iterator iterator = method32511.iterator();
            while (iterator.hasNext()) {
                arrayList.add(((Entity)iterator.next()).method1867());
            }
            return arrayList;
        }
        throw Class6886.field27004.create();
    }
}
