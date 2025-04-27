// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.NoSuchElementException;
import java.util.Iterator;

public class Class7245 implements Iterator<BlockPos>
{
    private final double field28078;
    private final double field28079;
    private final int field28080;
    private final int field28081;
    private double field28082;
    private double field28083;
    private double field28084;
    private double field28085;
    private int field28086;
    private double field28087;
    private double field28088;
    private final Class384 field28089;
    private boolean field28090;
    
    public Class7245(final BlockPos class354, final BlockPos class355, final double field28078, final double field28079) {
        this.field28089 = new Class384(0, 0, 0);
        this.field28090 = false;
        this.field28078 = field28078;
        this.field28079 = field28079;
        this.field28080 = class354.getX();
        this.field28081 = class355.getX();
        this.field28082 = class354.getY();
        this.field28083 = class355.getY() - 0.5;
        this.field28084 = class354.getZ();
        this.field28085 = class355.getZ() - 0.5;
        this.field28086 = this.field28080;
        this.field28087 = this.field28082;
        this.field28088 = this.field28084;
        boolean field28080 = false;
        Label_0168: {
            if (this.field28086 < this.field28081) {
                if (this.field28087 < this.field28083) {
                    if (this.field28088 < this.field28085) {
                        field28080 = true;
                        break Label_0168;
                    }
                }
            }
            field28080 = false;
        }
        this.field28090 = field28080;
    }
    
    @Override
    public boolean hasNext() {
        return this.field28090;
    }
    
    @Override
    public BlockPos next() {
        if (this.field28090) {
            this.field28089.method1280(this.field28086, this.field28087, this.field28088);
            this.method22143();
            boolean field28090 = false;
            Label_0090: {
                if (this.field28086 < this.field28081) {
                    if (this.field28087 < this.field28083) {
                        if (this.field28088 < this.field28085) {
                            field28090 = true;
                            break Label_0090;
                        }
                    }
                }
                field28090 = false;
            }
            this.field28090 = field28090;
            return this.field28089;
        }
        throw new NoSuchElementException();
    }
    
    private void method22143() {
        ++this.field28088;
        if (this.field28088 >= this.field28085) {
            this.field28088 = this.field28084;
            ++this.field28087;
            if (this.field28087 >= this.field28083) {
                this.field28087 = this.field28082;
                this.field28082 += this.field28078;
                this.field28083 += this.field28078;
                this.field28087 = this.field28082;
                this.field28084 += this.field28079;
                this.field28085 += this.field28079;
                this.field28088 = this.field28084;
                ++this.field28086;
                if (this.field28086 < this.field28081) {}
            }
        }
    }
    
    @Override
    public void remove() {
        throw new RuntimeException("Not implemented");
    }
    
    public static void main(final String[] array) throws Exception {
        final BlockPos obj = new BlockPos(-2, 10, 20);
        final BlockPos obj2 = new BlockPos(2, 12, 22);
        final double d = -0.5;
        final double d2 = 0.5;
        final Class7245 class7245 = new Class7245(obj, obj2, d, d2);
        System.out.println("Start: " + obj + ", end: " + obj2 + ", yDelta: " + d + ", zDelta: " + d2);
        while (class7245.hasNext()) {
            System.out.println("" + class7245.next());
        }
    }
}
