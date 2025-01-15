// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Random;

public class Class7953 implements Class7954
{
    private static String[] field32671;
    private final ItemStack field32672;
    private final int field32673;
    private final int field32674;
    private final int field32675;
    private final int field32676;
    private final Item field32677;
    private final int field32678;
    private final float field32679;
    
    public Class7953(final Item field32677, final int field32678, final Item class3820, final int field32679, final int field32680, final int field32681, final int field32682) {
        this.field32672 = new ItemStack(class3820);
        this.field32674 = field32680;
        this.field32675 = field32681;
        this.field32676 = field32682;
        this.field32677 = field32677;
        this.field32678 = field32678;
        this.field32673 = field32679;
        this.field32679 = 0.05f;
    }
    
    @Override
    public Class9017 method25804(final Entity class399, final Random random) {
        final ItemStack class400 = new ItemStack(Items.field31514, this.field32674);
        final List<? super Object> list = Class90.field212.method509().filter(class401 -> !class401.method26449().isEmpty() && Class7652.method24243(class401)).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList());
        return new Class9017(class400, new ItemStack(this.field32677, this.field32678), Class5333.method16476(new ItemStack(this.field32672.getItem(), this.field32673), (Class8061)list.get(random.nextInt(list.size()))), this.field32675, this.field32676, this.field32679);
    }
}
