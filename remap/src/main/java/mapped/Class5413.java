// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import java.util.Locale;
import java.util.function.Function;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.nbt.INBT;
import net.minecraft.util.text.ITextComponent;

public class Class5413 implements Class5414
{
    private static final SimpleCommandExceptionType field22577;
    public static final Function<String, Class6595> field22578;
    private final TileEntity field22579;
    private final BlockPos field22580;
    
    public Class5413(final TileEntity field22579, final BlockPos field22580) {
        this.field22579 = field22579;
        this.field22580 = field22580;
    }
    
    @Override
    public void method16525(final CompoundNBT class51) {
        class51.putInt("x", this.field22580.getX());
        class51.putInt("y", this.field22580.getY());
        class51.putInt("z", this.field22580.getZ());
        this.field22579.method2179(class51);
        this.field22579.method2161();
        final BlockState method6701 = this.field22579.method2186().getBlockState(this.field22580);
        this.field22579.method2186().method6693(this.field22580, method6701, method6701, 3);
    }
    
    @Override
    public CompoundNBT method16526() {
        return this.field22579.method2180(new CompoundNBT());
    }
    
    @Override
    public ITextComponent method16527() {
        return new Class2259("commands.data.block.modified", new Object[] { this.field22580.getX(), this.field22580.getY(), this.field22580.getZ() });
    }
    
    @Override
    public ITextComponent method16528(final INBT class41) {
        return new Class2259("commands.data.block.query", new Object[] { this.field22580.getX(), this.field22580.getY(), this.field22580.getZ(), class41.toFormattedComponent() });
    }
    
    @Override
    public ITextComponent method16529(final NBTPath class8570, final double d, final int i) {
        return new Class2259("commands.data.block.get", new Object[] { class8570, this.field22580.getX(), this.field22580.getY(), this.field22580.getZ(), String.format(Locale.ROOT, "%.2f", d), i });
    }
    
    static {
        field22577 = new SimpleCommandExceptionType((Message)new Class2259("commands.data.block.invalid", new Object[0]));
        field22578 = (s -> new Class6594(s));
    }
}
