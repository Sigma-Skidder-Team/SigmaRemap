// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

import java.io.IOException;

public class Class4273 implements Class4252<Class5800>
{
    private static String[] field19163;
    private int field19164;
    public int field19165;
    public int field19166;
    public int field19167;
    
    public Class4273() {
    }
    
    public Class4273(final Entity class399) {
        this(class399.method1643(), class399.method1935());
    }
    
    public Class4273(final int field19164, final Class5487 class5487) {
        this.field19164 = field19164;
        final double method35654 = MathHelper.method35654(class5487.field22770, -3.9, 3.9);
        final double method35655 = MathHelper.method35654(class5487.field22771, -3.9, 3.9);
        final double method35656 = MathHelper.method35654(class5487.field22772, -3.9, 3.9);
        this.field19165 = (int)(method35654 * 8000.0);
        this.field19166 = (int)(method35655 * 8000.0);
        this.field19167 = (int)(method35656 * 8000.0);
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19164 = class8654.method29501();
        this.field19165 = class8654.readShort();
        this.field19166 = class8654.readShort();
        this.field19167 = class8654.readShort();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29505(this.field19164);
        class8654.writeShort(this.field19165);
        class8654.writeShort(this.field19166);
        class8654.writeShort(this.field19167);
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17277(this);
    }
    
    public int method12822() {
        return this.field19164;
    }
    
    public int method12823() {
        return this.field19165;
    }
    
    public int method12824() {
        return this.field19166;
    }
    
    public int method12825() {
        return this.field19167;
    }
}
