// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import org.apache.logging.log4j.LogManager;
import java.util.Collections;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import java.util.Random;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class Class1878 implements Class1851
{
    private static final Logger field10214;
    private final List<IChunk> field10215;
    private final int field10216;
    private final int field10217;
    private final int field10218;
    private final Class1849 field10219;
    private final long field10220;
    private final int field10221;
    private final WorldInfo field10222;
    private final Random field10223;
    private final Dimension field10224;
    private final Class7065 field10225;
    private final Class6952<Block> field10226;
    private final Class6952<Fluid> field10227;
    private final BiomeManager field10228;
    
    public Class1878(final Class1849 field10219, final List<IChunk> field10220) {
        this.field10226 = new Class6955<Block>(class355 -> this.method6965(class355).method7036());
        this.field10227 = new Class6955<Fluid>(class357 -> this.method6965(class357).method7037());
        final int method35644 = MathHelper.floor(Math.sqrt(field10220.size()));
        if (method35644 * method35644 == field10220.size()) {
            final Class7859 method35645 = field10220.get(field10220.size() / 2).method7019();
            this.field10215 = field10220;
            this.field10216 = method35645.field32290;
            this.field10217 = method35645.field32291;
            this.field10218 = method35644;
            this.field10219 = field10219;
            this.field10220 = field10219.method6753();
            this.field10225 = (Class7065)field10219.method6904().method7438().method18876();
            this.field10221 = field10219.method6743();
            this.field10222 = field10219.method6764();
            this.field10223 = field10219.method6790();
            this.field10224 = field10219.method6789();
            this.field10228 = new BiomeManager(this, WorldInfo.byHashing(this.field10220), this.field10224.getType().getMagnifier());
            return;
        }
        throw Class8349.method27859(new IllegalStateException("Cache size is not a square."));
    }
    
    public int method7150() {
        return this.field10216;
    }
    
    public int method7151() {
        return this.field10217;
    }
    
    @Override
    public IChunk method6798(final int n, final int n2) {
        return this.method6966(n, n2, ChunkStatus.field39977);
    }
    
    @Nullable
    @Override
    public IChunk getChunk(final int i, final int j, final ChunkStatus class9312, final boolean b) {
        IChunk class9313;
        if (!this.method6814(i, j)) {
            class9313 = null;
        }
        else {
            final Class7859 method7019 = this.field10215.get(0).method7019();
            class9313 = this.field10215.get(i - method7019.field32290 + (j - method7019.field32291) * this.field10218);
            if (class9313.method7027().method34451(class9312)) {
                return class9313;
            }
        }
        if (!b) {
            return null;
        }
        final IChunk class9314 = this.field10215.get(0);
        final IChunk class9315 = this.field10215.get(this.field10215.size() - 1);
        Class1878.field10214.error("Requested chunk : {} {}", (Object)i, (Object)j);
        Class1878.field10214.error("Region bounds : {} {} | {} {}", (Object)class9314.method7019().field32290, (Object)class9314.method7019().field32291, (Object)class9315.method7019().field32290, (Object)class9315.method7019().field32291);
        if (class9313 == null) {
            throw Class8349.method27859(new RuntimeException(String.format("We are asking a region for a chunk out of bound | %s %s", i, j)));
        }
        throw Class8349.method27859(new RuntimeException(String.format("Chunk is not of correct status. Expecting %s, got %s | %s %s", class9312, class9313.method7027(), i, j)));
    }
    
    @Override
    public boolean method6814(final int n, final int n2) {
        final IChunk class1860 = this.field10215.get(0);
        final IChunk class1861 = this.field10215.get(this.field10215.size() - 1);
        if (n >= class1860.method7019().field32290) {
            if (n <= class1861.method7019().field32290) {
                if (n2 >= class1860.method7019().field32291) {
                    if (n2 <= class1861.method7019().field32291) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public BlockState getBlockState(final BlockPos class354) {
        return this.method6798(class354.getX() >> 4, class354.getZ() >> 4).getBlockState(class354);
    }
    
    @Override
    public IFluidState getFluidState(final BlockPos class354) {
        return this.method6965(class354).getFluidState(class354);
    }
    
    @Nullable
    @Override
    public PlayerEntity method7130(final double n, final double n2, final double n3, final double n4, final Predicate<Entity> predicate) {
        return null;
    }
    
    @Override
    public int method6785() {
        return 0;
    }
    
    @Override
    public BiomeManager method6797() {
        return this.field10228;
    }
    
    @Override
    public Class3090 method6841(final int n, final int n2, final int n3) {
        return this.field10219.method6841(n, n2, n3);
    }
    
    @Override
    public Class1886 method6700() {
        return this.field10219.method6700();
    }
    
    @Override
    public boolean method6691(final BlockPos class354, final boolean b, final Entity class355) {
        final BlockState method6701 = this.getBlockState(class354);
        if (!method6701.method21706()) {
            if (b) {
                Block.method11838(method6701, this.field10219, class354, method6701.getBlock().method11802() ? this.getTileEntity(class354) : null, class355, ItemStack.field34174);
            }
            return this.setBlockState(class354, Class7521.field29147.getDefaultState(), 3);
        }
        return false;
    }
    
    @Nullable
    @Override
    public TileEntity getTileEntity(final BlockPos class354) {
        final IChunk method6965 = this.method6965(class354);
        final TileEntity method6966 = method6965.getTileEntity(class354);
        if (method6966 == null) {
            final Class51 method6967 = method6965.method7033(class354);
            if (method6967 != null) {
                TileEntity class355;
                if (!"DUMMY".equals(method6967.method323("id"))) {
                    class355 = TileEntity.method2190(method6967);
                }
                else {
                    final Block method6968 = this.getBlockState(class354).getBlock();
                    if (!(method6968 instanceof Class3840)) {
                        return null;
                    }
                    class355 = ((Class3840)method6968).method11898(this.field10219);
                }
                if (class355 != null) {
                    method6965.method7009(class354, class355);
                    return class355;
                }
            }
            if (method6965.getBlockState(class354).getBlock() instanceof Class3840) {
                Class1878.field10214.warn("Tried to access a block entity before it was created. {}", (Object)class354);
            }
            return null;
        }
        return method6966;
    }
    
    @Override
    public boolean setBlockState(final BlockPos class354, final BlockState class355, final int n) {
        final IChunk method6965 = this.method6965(class354);
        final BlockState method6966 = method6965.method7008(class354, class355, false);
        if (method6966 != null) {
            this.field10219.method6689(class354, method6966, class355);
        }
        final Block method6967 = class355.getBlock();
        if (!method6967.method11802()) {
            if (method6966 != null) {
                if (method6966.getBlock().method11802()) {
                    method6965.method7028(class354);
                }
            }
        }
        else if (method6965.method7027().method34448() != Class260.field1244) {
            final Class51 class356 = new Class51();
            class356.method298("x", class354.getX());
            class356.method298("y", class354.getY());
            class356.method298("z", class354.getZ());
            class356.method306("id", "DUMMY");
            method6965.method7032(class356);
        }
        else {
            method6965.method7009(class354, ((Class3840)method6967).method11898(this));
        }
        if (class355.method21753(this, class354)) {
            this.method7152(class354);
        }
        return true;
    }
    
    private void method7152(final BlockPos class354) {
        this.method6965(class354).method7029(class354);
    }
    
    @Override
    public boolean method6886(final Entity class399) {
        this.method6798(MathHelper.floor(class399.getPosX() / 16.0), MathHelper.floor(class399.getPosZ() / 16.0)).method7010(class399);
        return true;
    }
    
    @Override
    public boolean method6690(final BlockPos class354, final boolean b) {
        return this.setBlockState(class354, Class7521.field29147.getDefaultState(), 3);
    }
    
    @Override
    public WorldBorder getWorldBorder() {
        return this.field10219.getWorldBorder();
    }
    
    @Override
    public boolean isRemote() {
        return false;
    }
    
    @Deprecated
    public Class1849 method7153() {
        return this.field10219;
    }
    
    @Override
    public WorldInfo method6764() {
        return this.field10222;
    }
    
    @Override
    public Class9592 method6784(final BlockPos class354) {
        if (this.method6814(class354.getX() >> 4, class354.getZ() >> 4)) {
            return new Class9592(this.field10219.method6954(), this.field10219.method6755(), 0L, this.field10219.method6951());
        }
        throw new RuntimeException("We are asking a region for a chunk out of bound");
    }
    
    @Override
    public AbstractChunkProvider getChunkProvider() {
        return this.field10219.method6904();
    }
    
    @Override
    public long method6753() {
        return this.field10220;
    }
    
    @Override
    public Class6952<Block> method6833() {
        return this.field10226;
    }
    
    @Override
    public Class6952<Fluid> method6834() {
        return this.field10227;
    }
    
    @Override
    public int method6743() {
        return this.field10221;
    }
    
    @Override
    public Random method6790() {
        return this.field10223;
    }
    
    @Override
    public void method6694(final BlockPos class354, final Block class355) {
    }
    
    @Override
    public int method6699(final Class2020 class2020, final int n, final int n2) {
        return this.method6798(n >> 4, n2 >> 4).method7018(class2020, n & 0xF, n2 & 0xF) + 1;
    }
    
    @Override
    public void method6705(final PlayerEntity playerEntity, final BlockPos class513, final Class7795 class514, final Class286 class515, final float n, final float n2) {
    }
    
    @Override
    public void method6709(final IParticleData IParticleData, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
    }
    
    @Override
    public void method6839(final PlayerEntity playerEntity, final int n, final BlockPos class513, final int n2) {
    }
    
    @Override
    public BlockPos method6758() {
        return this.field10219.method6758();
    }
    
    @Override
    public Dimension method6789() {
        return this.field10224;
    }
    
    @Override
    public boolean method6791(final BlockPos class354, final Predicate<BlockState> predicate) {
        return predicate.test(this.getBlockState(class354));
    }
    
    @Override
    public <T extends Entity> List<T> method6739(final Class<? extends T> clazz, final AxisAlignedBB class6221, final Predicate<? super T> predicate) {
        return Collections.emptyList();
    }
    
    @Override
    public List<Entity> method6737(final Entity class399, final AxisAlignedBB class400, final Predicate<? super Entity> predicate) {
        return Collections.emptyList();
    }
    
    @Override
    public List<PlayerEntity> method6840() {
        return Collections.emptyList();
    }
    
    static {
        field10214 = LogManager.getLogger();
    }
}
