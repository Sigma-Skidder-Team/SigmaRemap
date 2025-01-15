// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.AnvilConverterException;
import java.util.Iterator;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.List;

public class Class7417
{
    private static String[] field28588;
    private final Class7952 field28589;
    
    public Class7417(final Class7952 field28589) {
        this.field28589 = field28589;
    }
    
    public String method22823() {
        return this.field28589.method25784();
    }
    
    public boolean method22824(final String s) {
        return this.field28589.method25798(s);
    }
    
    public boolean method22825(final String s, final Class732 class732) {
        return this.field28589.method25790(s, class732);
    }
    
    public boolean method22826(final String s) {
        return this.field28589.method25789(s);
    }
    
    public boolean method22827(final String s) {
        return this.field28589.method25795(s);
    }
    
    public boolean method22828(final String s) {
        return this.field28589.method25796(s);
    }
    
    public void method22829(final String s, final String s2) {
        this.field28589.method25794(s, s2);
    }
    
    public List<Class1951> method22830() throws AnvilConverterException {
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator<Class1934> iterator = this.field28589.method25785().iterator();
        while (iterator.hasNext()) {
            arrayList.add(new Class1951(iterator.next()));
        }
        return arrayList;
    }
}
