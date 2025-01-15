// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Class6064 implements Class6063
{
    private static String[] field24655;
    private List<Class6287> field24656;
    
    private Class6064() {
        this.field24656 = new ArrayList<Class6287>(100);
    }
    
    public List<Class6287> method18053() {
        return this.field24656;
    }
    
    @Override
    public void method18052(final Class6287 class6287) throws IOException {
        this.field24656.add(class6287);
    }
}
