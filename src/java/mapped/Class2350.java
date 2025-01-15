// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.io.IOException;

public class Class2350 extends IOException
{
    private ArrayList field14134;
    
    public Class2350() {
        this.field14134 = new ArrayList();
    }
    
    public void method9492(final Exception e) {
        this.field14134.add(e);
    }
    
    @Override
    public String getMessage() {
        String string = "Composite Exception: \n";
        for (int i = 0; i < this.field14134.size(); ++i) {
            string = string + "\t" + ((IOException)this.field14134.get(i)).getMessage() + "\n";
        }
        return string;
    }
}
