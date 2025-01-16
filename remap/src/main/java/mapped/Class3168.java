// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

public class Class3168 extends Class3167
{
    public Class3168() {
        super(Class8013.field32986, "Basic", "Automatically aims at players");
        this.method9881(new Class4996("Range", "Range value", 4.0f, Float.class, 2.8f, 8.0f, 0.01f));
    }
    
    @Class6753
    private void method9918(final Class5739 class5739) {
        if (this.method9906()) {
            final Entity method10266 = ((Class3255)this.method9914()).method10266(this.method9886("Range"));
            if (method10266 != null) {
                final float[] method10267 = Class8845.method30912(method10266);
                Class3168.field15514.player.rotationYaw = method10267[0];
                Class3168.field15514.player.rotationPitch = method10267[1];
            }
        }
    }
}
