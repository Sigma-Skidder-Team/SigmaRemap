// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;

public class Class3336 extends Class3167
{
    private int field15937;
    private ArrayList<Class8870> field15938;
    
    public Class3336() {
        super(Class8013.field32989, "Viper", "Disabler for ViperMC");
        this.field15938 = new ArrayList<Class8870>();
    }
    
    @Override
    public void method9879() {
        this.field15937 = 0;
    }
    
    @Class6753
    public void method10558(final Class5744 class5744) {
        if (!this.method9906() || Class3336.field15514.field4684 == null) {
            return;
        }
        ++this.field15937;
        if (class5744.method17036() > Class3336.field15514.field4684.posY - 1.0E-6 && class5744.method17036() < Class3336.field15514.field4684.posY + 1.0E-6) {
            class5744.method17037(Class3336.field15514.field4684.posY + 0.4);
            class5744.method17045(false);
        }
        if (this.field15937 <= 60) {
            for (int i = 0; i < 10; ++i) {
                Class3336.field15514.method5269().method17292(new Class4354(Class3336.field15514.field4684.posX, Class3336.field15514.field4684.posY + ((i > 2 && i < 8) ? 0.2 : -0.2), Class3336.field15514.field4684.posZ, true));
            }
            Class3336.field15514.field4684.field4075 = 0.0;
            if (Class3336.field15514.field4684.ticksExisted <= 1) {
                this.field15938.clear();
            }
            if (!this.field15938.isEmpty()) {
                for (int j = 0; j < this.field15938.size(); ++j) {
                    final Class8870 class5745 = this.field15938.get(j);
                    if (class5745.method31165()) {
                        Class3336.field15514.method5269().method17292(class5745.method31166());
                        this.field15938.remove(j);
                    }
                }
            }
            return;
        }
        class5744.method17037(Class3336.field15514.field4684.posY + 0.4);
        class5744.method17045(false);
    }
    
    @Class6753
    public void method10559(final Class5723 class5723) {
        if (this.method9906()) {
            final IPacket method16998 = class5723.method16998();
            if (method16998 instanceof Class4396) {
                final Class4396 class5724 = (Class4396)method16998;
                class5723.method16961(true);
            }
            if (method16998 instanceof Class4393) {
                final Class4393 class5725 = (Class4393)method16998;
                class5723.method16961(true);
            }
        }
    }
}
