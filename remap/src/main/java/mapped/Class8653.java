// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import com.mojang.datafixers.DataFixer;
import java.io.File;
import org.apache.logging.log4j.Logger;

public class Class8653
{
    private static final Logger field36323;
    private final File field36324;
    private final DataFixer field36325;
    private final Class2262[] field36326;
    private boolean field36327;
    
    public Class8653(final File parent, final DataFixer field36325) {
        this.field36326 = new Class2262[9];
        this.field36324 = new File(parent, "hotbar.nbt");
        this.field36325 = field36325;
        for (int i = 0; i < 9; ++i) {
            this.field36326[i] = new Class2262();
        }
    }
    
    private void method29481() {
        try {
            final CompoundNBT method26594 = Class8097.method26594(this.field36324);
            if (method26594 == null) {
                return;
            }
            if (!method26594.contains("DataVersion", 99)) {
                method26594.putInt("DataVersion", 1343);
            }
            final CompoundNBT method26595 = Class9346.method34651(this.field36325, Class1959.field10678, method26594, method26594.getInt("DataVersion"));
            for (int i = 0; i < 9; ++i) {
                this.field36326[i].method8505(method26595.getList(String.valueOf(i), 10));
            }
        }
        catch (final Exception ex) {
            Class8653.field36323.error("Failed to load creative mode options", ex);
        }
    }
    
    public void method29482() {
        try {
            final CompoundNBT class51 = new CompoundNBT();
            class51.putInt("DataVersion", Class9528.method35579().getWorldVersion());
            for (int i = 0; i < 9; ++i) {
                class51.put(String.valueOf(i), this.method29483(i).method8504());
            }
            Class8097.method26593(class51, this.field36324);
        }
        catch (final Exception ex) {
            Class8653.field36323.error("Failed to save creative mode options", ex);
        }
    }
    
    public Class2262 method29483(final int n) {
        if (!this.field36327) {
            this.method29481();
            this.field36327 = true;
        }
        return this.field36326[n];
    }
    
    static {
        field36323 = LogManager.getLogger();
    }
}
