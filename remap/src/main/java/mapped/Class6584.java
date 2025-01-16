// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.util.function.Predicate;
import java.util.List;
import java.io.IOException;
import java.util.Set;

public class Class6584 implements Class6582
{
    @Override
    public Set<String> method19932() {
        return Class8707.method29900().method5291().method19932();
    }
    
    @Override
    public Class1671 method19933(final ResourceLocation class1932) throws IOException {
        if (!class1932.method7797().equals("jelloblur")) {
            return Class8707.method29900().method5291().method19933(class1932);
        }
        return new Class1672();
    }
    
    @Override
    public boolean method19934(final ResourceLocation class1932) {
        return class1932.method7797().equals("jelloblur") || Class8707.method29900().method5291().method19934(class1932);
    }
    
    @Override
    public List<Class1671> method19935(final ResourceLocation class1932) throws IOException {
        return Class8707.method29900().method5291().method19935(class1932);
    }
    
    @Override
    public Collection<ResourceLocation> method19936(final String s, final Predicate<String> predicate) {
        return Class8707.method29900().method5291().method19936(s, predicate);
    }
}
