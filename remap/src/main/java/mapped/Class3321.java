// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Class3321 extends Class3167
{
    private List<Class4273> field15922;
    public int field15923;
    
    public Class3321() {
        super(Class8013.field32986, "Delay", "For anticheats with \"good\" velocity checks");
        this.field15922 = new ArrayList<Class4273>();
        this.field15923 = 0;
        this.method9881(new Class4996("Delay", "Ticks delay", 7.0f, Float.class, 1.0f, 20.0f, 1.0f));
    }
    
    @Class6753
    private void method10518(final Class5723 class5723) {
        if (this.method9906()) {
            if (Class3321.field15514.player != null) {
                if (class5723.method16998() instanceof Class4273) {
                    final Class4273 class5724 = (Class4273)class5723.method16998();
                    final List<Entity> method6739 = Class3321.field15514.world.method6739((Class<? extends Entity>) PlayerEntity.class, Class3321.field15514.player.getBoundingBox().intersect(14.0), class5725 -> {
                        final void void1;
                        if (class5725.method1732(Class3321.field15514.player) < 6.0f) {
                            if (Class3321.field15514.player != class5725) {
                                if (!Class9463.method35173().method35191().method31751(class5725)) {
                                    return (boolean)void1;
                                }
                            }
                        }
                        return (boolean)void1;
                    });
                    if (class5724.method12822() == Class3321.field15514.player.getEntityId()) {
                        if (method6739.size() > 0) {
                            this.field15922.add(class5724);
                            class5723.method16961(true);
                            if (this.field15923 == 0) {
                                this.field15923 = (int)this.method9886("Delay");
                            }
                        }
                    }
                }
            }
        }
    }
    
    @Class6753
    private void method10519(final Class5721 class5721) {
        if (this.method9906()) {
            if (class5721.method16990() instanceof Class4381) {
                if (((Class4381)class5721.method16990()).method13171() != Class2029.field11565) {}
            }
        }
    }
    
    @Class6753
    private void method10520(final Class5743 class5743) {
        if (this.field15923 != 0) {
            if (this.field15923 > 0) {
                --this.field15923;
            }
        }
        else {
            this.method10521();
        }
    }
    
    private void method10521() {
        final Iterator<Class4273> iterator = this.field15922.iterator();
        while (iterator.hasNext()) {
            Class3321.field15514.method5269().method17277(iterator.next());
        }
        this.field15922.clear();
    }
}
