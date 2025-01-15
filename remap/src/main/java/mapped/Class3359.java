// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import com.google.common.collect.Lists;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

import java.util.List;
import java.util.ArrayList;

public class Class3359 extends Class3355
{
    public ArrayList<Thread> field16000;
    public Entity field16001;
    public Vec3d field16002;
    
    public Class3359(final String s, final String s2, final Class8013 class8013) {
        super("FightBot", "Jello AI Fight Bot", Class8013.field32987);
        this.field16000 = new ArrayList<Thread>();
    }
    
    @Class6753
    public void method10639(final Class5743 class5743) {
        if (this.method9906()) {
            return;
        }
    }
    
    public List<Entity> method10640() {
        final ArrayList arrayList = Lists.newArrayList((Iterable)Class3359.field15514.field4683.method6806());
        arrayList.remove(Class3359.field15514.field4684);
        final Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            final Entity class399 = (Entity)iterator.next();
            if (class399 instanceof Class512 && !Class9463.method35173().method35191().method31751(class399)) {
                continue;
            }
            iterator.remove();
        }
        final List<Entity> method13678 = Class4609.method13678(arrayList);
        if (method13678.size() <= 1) {
            return method13678;
        }
        return method13678.subList(0, Math.min(3, method13678.size() - 1));
    }
}
