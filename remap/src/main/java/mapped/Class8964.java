// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.List;

public class Class8964
{
    private static String[] field37669;
    private Class9272 field37670;
    
    public Class8964(final Class9272 field37670) {
        this.field37670 = field37670;
    }
    
    public Class9272 method31802() {
        return this.field37670;
    }
    
    public List<Class5594> method31803() {
        final ArrayList arrayList = Lists.newArrayList();
        final UnmodifiableIterator iterator = this.field37670.method34195().iterator();
        while (((Iterator)iterator).hasNext()) {
            arrayList.add(new Class5594((Class7187)((Iterator)iterator).next()));
        }
        return arrayList;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this.field37670.equals(o);
    }
    
    @Override
    public int hashCode() {
        return this.field37670.hashCode();
    }
    
    @Override
    public String toString() {
        return this.field37670.toString();
    }
}
