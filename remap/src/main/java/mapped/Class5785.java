// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;
import org.apache.logging.log4j.LogManager;
import javax.annotation.Nullable;
import org.apache.logging.log4j.Logger;

public class Class5785 extends Class5784
{
    private static final Logger field23765;
    private Vec3d field23766;
    private int field23767;
    
    public Class5785(final Class852 class852) {
        super(class852);
    }
    
    @Override
    public void method17247() {
        if (this.field23766 != null) {
            if (this.field23767 > 0 && this.field23767++ >= 10) {
                this.field23764.method5127().method33696(Class7193.field27948);
            }
            else {
                final double method16747 = this.field23766.squareDistanceTo(this.field23764.getPosX(), this.field23764.getPosY(), this.field23764.getPosZ());
                if (method16747 >= 100.0) {
                    if (method16747 <= 22500.0) {
                        if (!this.field23764.collidedHorizontally) {
                            if (!this.field23764.collidedVertically) {
                                return;
                            }
                        }
                    }
                }
                ++this.field23767;
            }
        }
        else {
            Class5785.field23765.warn("Aborting charge player as no target was set.");
            this.field23764.method5127().method33696(Class7193.field27948);
        }
    }
    
    @Override
    public void method17249() {
        this.field23766 = null;
        this.field23767 = 0;
    }
    
    public void method17256(final Vec3d field23766) {
        this.field23766 = field23766;
    }
    
    @Override
    public float method17251() {
        return 3.0f;
    }
    
    @Nullable
    @Override
    public Vec3d method17254() {
        return this.field23766;
    }
    
    @Override
    public Class7193<Class5785> method17253() {
        return Class7193.field27956;
    }
    
    static {
        field23765 = LogManager.getLogger();
    }
}