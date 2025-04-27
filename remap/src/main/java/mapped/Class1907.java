// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.chunk.AbstractChunkProvider;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.lighting.WorldLightManager;
import org.apache.logging.log4j.LogManager;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.apache.logging.log4j.Logger;

public class Class1907 extends AbstractChunkProvider
{
    private static final Logger field10341;
    private final Chunk field10342;
    private final WorldLightManager field10343;
    public volatile Class9225 field10344;
    private final ClientWorld field10345;
    
    public Class1907(final ClientWorld field10345, final int n) {
        this.field10345 = field10345;
        this.field10342 = new Class1864(field10345, new ChunkPos(0, 0));
        this.field10343 = new WorldLightManager(this, true, field10345.method6789().method20503());
        this.field10344 = new Class9225(this, method7418(n), null);
    }
    
    @Override
    public WorldLightManager getLightManager() {
        return this.field10343;
    }
    
    private static boolean method7411(final Chunk class1862, final int n, final int n2) {
        if (class1862 != null) {
            final ChunkPos method7019 = class1862.method7019();
            return method7019.field32290 == n && method7019.field32291 == n2;
        }
        return false;
    }
    
    public void method7412(final int n, final int n2) {
        if (Class9225.method34017(this.field10344, n, n2)) {
            final int method34012 = this.field10344.method34012(n, n2);
            final Chunk method34013 = this.field10344.method34016(method34012);
            if (method7411(method34013, n, n2)) {
                if (Class9570.field41194.method22619()) {
                    Class9570.method35840(Class9570.field41194, method34013);
                }
                this.field10344.method34014(method34012, method34013, null);
            }
        }
    }
    
    @Nullable
    public Chunk method7413(final int n, final int n2, final ChunkStatus class9312, final boolean b) {
        if (Class9225.method34017(this.field10344, n, n2)) {
            final Chunk method34016 = this.field10344.method34016(this.field10344.method34012(n, n2));
            if (method7411(method34016, n, n2)) {
                return method34016;
            }
        }
        return b ? this.field10342 : null;
    }
    
    @Override
    public IBlockReader method7414() {
        return this.field10345;
    }
    
    @Nullable
    public Chunk method7415(final int n, final int n2, final Class1873 class1873, final PacketBuffer class1874, final CompoundNBT class1875, final int n3) {
        if (Class9225.method34017(this.field10344, n, n2)) {
            final int method34012 = this.field10344.method34012(n, n2);
            Chunk class1876 = this.field10344.field39563.get(method34012);
            if (method7411(class1876, n, n2)) {
                int n4 = 0;
                if (class1876 instanceof Class1863) {
                    final Class1863 class1877 = (Class1863)class1876;
                    final Object method34013 = class1874.method29523("ChunkDataOF");
                    if (method34013 instanceof Class9489) {
                        final Class9489 value = (Class9489)method34013;
                        class1877.method7087(value);
                        Class8199.field33725.set(value);
                        n4 = 1;
                    }
                }
                class1876.method7063(class1873, class1874, class1875, n3);
                if (n4 != 0) {
                    Class8199.field33725.set(null);
                }
            }
            else {
                if (class1873 == null) {
                    Class1907.field10341.warn("Ignoring chunk since we don't have complete data: {}, {}", n, n2);
                    return null;
                }
                class1876 = new Class1863(this.field10345, new ChunkPos(n, n2), class1873);
                class1876.method7063(class1873, class1874, class1875, n3);
                this.field10344.method34013(method34012, class1876);
            }
            final Class8199[] method34014 = class1876.method7014();
            final WorldLightManager method34015 = this.getLightManager();
            method34015.method7255(new ChunkPos(n, n2), true);
            for (int i = 0; i < method34014.length; ++i) {
                method34015.method7254(Class353.method1088(n, i, n2), Class8199.method27155(method34014[i]));
            }
            this.field10345.method6812(n, n2);
            if (Class9570.field41192.method22619()) {
                Class9570.method35840(Class9570.field41192, class1876);
            }
            return class1876;
        }
        Class1907.field10341.warn("Ignoring chunk since it's not in the view range: {}, {}", n, n2);
        return null;
    }
    
    @Override
    public void tick(final BooleanSupplier booleanSupplier) {
    }
    
    public void method7416(final int n, final int n2) {
        Class9225.method34018(this.field10344, n);
        Class9225.method34019(this.field10344, n2);
    }
    
    public void method7417(final int n) {
        final int method34020 = Class9225.method34020(this.field10344);
        final int method34021 = method7418(n);
        if (method34020 != method34021) {
            final Class9225 field10344 = new Class9225(this, method34021, null);
            Class9225.method34018(field10344, Class9225.method34021(this.field10344));
            Class9225.method34019(field10344, Class9225.method34022(this.field10344));
            for (int i = 0; i < this.field10344.field39563.length(); ++i) {
                final Chunk class1862 = this.field10344.field39563.get(i);
                if (class1862 != null) {
                    final ChunkPos method34022 = class1862.method7019();
                    if (Class9225.method34017(field10344, method34022.field32290, method34022.field32291)) {
                        field10344.method34013(field10344.method34012(method34022.field32290, method34022.field32291), class1862);
                    }
                }
            }
            this.field10344 = field10344;
        }
    }
    
    private static int method7418(final int b) {
        return Math.max(2, b) + 3;
    }
    
    @Override
    public String makeString() {
        return "Client Chunk Cache: " + this.field10344.field39563.length() + ", " + this.method7419();
    }
    
    public int method7419() {
        return Class9225.method34023(this.field10344);
    }
    
    @Override
    public void method7420(final Class237 class237, final Class353 class238) {
        Minecraft.getInstance().worldRenderer.method5740(class238.method1102(), class238.method1103(), class238.method1104());
    }
    
    @Override
    public boolean canTick(final BlockPos class354) {
        return this.chunkExists(class354.getX() >> 4, class354.getZ() >> 4);
    }
    
    @Override
    public boolean isChunkLoaded(final ChunkPos class7859) {
        return this.chunkExists(class7859.field32290, class7859.field32291);
    }
    
    @Override
    public boolean isChunkLoaded(final Entity class399) {
        return this.chunkExists(MathHelper.floor(class399.getPosX()) >> 4, MathHelper.floor(class399.getPosZ()) >> 4);
    }
    
    static {
        field10341 = LogManager.getLogger();
    }
}
