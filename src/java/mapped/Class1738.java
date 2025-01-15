// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import javax.annotation.Nullable;
import it.unimi.dsi.fastutil.chars.Char2ObjectMap;
import org.apache.logging.log4j.Logger;

public class Class1738 implements Class1737
{
    private static String[] field9691;
    private static final Logger field9692;
    private final Class1846 field9693;
    private final Char2ObjectMap<Class2027> field9694;
    private boolean field9695;
    private float field9696;
    
    public Class1738(final Class1846 field9693, final Char2ObjectMap<Class2027> field9694) {
        this.field9695 = false;
        this.field9696 = -1.0f;
        this.field9693 = field9693;
        this.field9694 = field9694;
    }
    
    @Override
    public void close() {
        this.field9693.close();
    }
    
    @Nullable
    @Override
    public Class2022 method6150(final char c) {
        return (Class2022)this.field9694.get(c);
    }
    
    public boolean method6151() {
        return this.field9695;
    }
    
    public float method6152() {
        return this.field9696;
    }
    
    static {
        field9692 = LogManager.getLogger();
    }
}
