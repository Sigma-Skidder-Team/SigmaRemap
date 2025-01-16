// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.function.Supplier;
import java.io.File;
import com.mojang.datafixers.DataFixer;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.dimension.DimensionType;

public class Class387 implements AutoCloseable
{
    private final Class1914 field2245;
    public final DataFixer field2246;
    private Class8734 field2247;
    
    public Class387(final File file, final DataFixer field2246) {
        this.field2246 = field2246;
        this.field2245 = new Class1914(new Class1881(file), "chunk");
    }
    
    public CompoundNBT method1307(final DimensionType class383, final Supplier<Class8213> supplier, CompoundNBT class384) {
        final int method1308 = method1308(class384);
        if (method1308 < 1493) {
            class384 = Class9346.method34652(this.field2246, Class1959.field10677, class384, method1308, 1493);
            if (class384.getCompound("Level").getBoolean("hasLegacyStructureData")) {
                if (this.field2247 == null) {
                    this.field2247 = Class8734.method30176(class383, supplier.get());
                }
                class384 = this.field2247.method30171(class384);
            }
        }
        class384 = Class9346.method34651(this.field2246, Class1959.field10677, class384, Math.max(1493, method1308));
        if (method1308 < Class9528.method35579().getWorldVersion()) {
            class384.putInt("DataVersion", Class9528.method35579().getWorldVersion());
        }
        return class384;
    }
    
    public static int method1308(final CompoundNBT class51) {
        return class51.contains("DataVersion", 99) ? class51.getInt("DataVersion") : -1;
    }
    
    @Nullable
    public CompoundNBT method1309(final ChunkPos class7859) throws IOException {
        return this.field2245.method7557(class7859);
    }
    
    public void method1310(final ChunkPos class7859, final CompoundNBT class7860) {
        this.field2245.method7556(class7859, class7860);
        if (this.field2247 != null) {
            this.field2247.method30170(class7859.method25422());
        }
    }
    
    public void method1311() {
        this.field2245.method7559().join();
    }
    
    @Override
    public void close() throws IOException {
        this.field2245.close();
    }
}
