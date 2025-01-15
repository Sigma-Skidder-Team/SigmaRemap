// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.util.Collection;

public class Class7733 implements Class7732
{
    private static String[] field30747;
    private final Class9043 field30748;
    
    public Class7733(final Class9043 field30748) {
        this.field30748 = field30748;
    }
    
    @Override
    public Collection<GameProfile> method24681(final Class7492 class7492) throws CommandSyntaxException {
        final List<Class513> method32514 = this.field30748.method32514(class7492);
        if (!method32514.isEmpty()) {
            final ArrayList arrayList = Lists.newArrayList();
            final Iterator iterator = method32514.iterator();
            while (iterator.hasNext()) {
                arrayList.add(((Class513)iterator.next()).method2844());
            }
            return arrayList;
        }
        throw Class6886.field27005.create();
    }
}
