// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import net.minecraft.util.math.BlockPos;

public class Class5434 extends Class5419<Class759>
{
    private static String[] field22631;
    private final float field22632;
    private BlockPos field22633;
    private int field22634;
    private int field22635;
    private int field22636;
    
    public Class5434(final float field22632) {
        super((Map)ImmutableMap.of((Object)Class8233.field33816, (Object)Class1952.field10628, (Object)Class8233.field33809, (Object)Class1952.field10629));
        this.field22632 = field22632;
    }
    
    public boolean method16590(final Class1849 class1849, final Class759 class1850) {
        return class1850.method2625() && this.method16593(class1849, class1850);
    }
    
    public void method16591(final Class1849 class1849, final Class759 class1850, final long n) {
        super.method16539(class1849, class1850, n);
        this.method16597(class1850).ifPresent(field22633 -> {
            this.field22633 = field22633;
            this.field22634 = 100;
            this.field22635 = 3 + class1851.field10062.nextInt(4);
            this.field22636 = 0;
            this.method16592(class1852, field22633);
        });
    }
    
    public void method16581(final Class1849 class1849, final Class759 class1850, final long n) {
        super.method16548(class1849, class1850, n);
        this.field22633 = null;
        this.field22634 = 0;
        this.field22635 = 0;
        this.field22636 = 0;
    }
    
    public boolean method16580(final Class1849 class1849, final Class759 class1850, final long n) {
        if (class1850.method2625()) {
            if (this.field22633 != null) {
                if (this.method16596(class1849, this.field22633)) {
                    if (!this.method16598(class1849, class1850)) {
                        if (!this.method16599(class1849, class1850)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean method16550(final long n) {
        return false;
    }
    
    public void method16582(final Class1849 class1849, final Class759 class1850, final long n) {
        if (this.method16594(class1849, class1850)) {
            if (this.field22636 <= 0) {
                if (this.method16595(class1849, class1850)) {
                    class1850.method4149().method22382();
                    --this.field22635;
                    this.field22636 = 5;
                }
            }
            else {
                --this.field22636;
            }
        }
        else {
            --this.field22634;
        }
    }
    
    private void method16592(final Class759 class759, final BlockPos class760) {
        class759.method2618().method1196(Class8233.field33809, new Class6949(class760, this.field22632, 0));
    }
    
    private boolean method16593(final Class1849 class1849, final Class759 class1850) {
        return this.method16594(class1849, class1850) || this.method16597(class1850).isPresent();
    }
    
    private boolean method16594(final Class1849 class1849, final Class759 class1850) {
        final BlockPos class1851 = new BlockPos(class1850);
        final BlockPos method1139 = class1851.method1139();
        return this.method16596(class1849, class1851) || this.method16596(class1849, method1139);
    }
    
    private boolean method16595(final Class1849 class1849, final Class759 class1850) {
        return this.method16596(class1849, new BlockPos(class1850));
    }
    
    private boolean method16596(final Class1849 class1849, final BlockPos class1850) {
        return class1849.getBlockState(class1850).method21755(Class7188.field27910);
    }
    
    private Optional<BlockPos> method16597(final Class759 class759) {
        return class759.method2618().method1198(Class8233.field33816);
    }
    
    private boolean method16598(final Class1849 class1849, final Class759 class1850) {
        return !this.method16594(class1849, class1850) && this.field22634 <= 0;
    }
    
    private boolean method16599(final Class1849 class1849, final Class759 class1850) {
        return this.method16594(class1849, class1850) && this.field22635 <= 0;
    }
}
