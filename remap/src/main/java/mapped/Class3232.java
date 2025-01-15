// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Class3232 extends Class3167
{
    private List<Entity> field15703;
    
    public Class3232() {
        super(Class8013.field32986, "BowAimbot", "Automatically aims at players while using a bow");
        this.field15703 = new ArrayList<Entity>();
        this.method9881(new Class5001("Sort mode", "Sort mode", 0, new String[] { "Angle", "Range" }));
        this.method9881(new Class4996("Range", "Range value", 70.0f, Float.class, 10.0f, 100.0f, 1.0f));
        this.method9881(new Class4999("Silent", "Server-sided rotations.", false));
        this.method9881(new Class4999("Teams", "Target team", true));
        this.method9881(new Class4999("Players", "Target players", true));
        this.method9881(new Class4999("Animals/Monsters", "Target animals and monsters", false));
        this.method9881(new Class4999("Anti-Bot", "Doesn't target bots", true));
        this.method9881(new Class4999("Invisible", "Target invisible entites", true));
    }
    
    @Override
    public void method9897() {
        this.field15703.clear();
    }
    
    @Class6753
    private void method10191(final Class5744 class5744) {
        if (this.method9906() && class5744.method17046()) {
            if (!(Class3232.field15514.field4684.method2766().method27622() instanceof Class4087)) {
                this.field15703.clear();
            }
            else {
                this.field15703 = this.method10193(this.method9914().method9886("Range"));
            }
            if (!this.field15703.isEmpty()) {
                if (this.method9883("Silent")) {
                    final float[] method30921 = Class8845.method30921(this.field15703.get(0));
                    class5744.method17043(method30921[0]);
                    class5744.method17041(method30921[1]);
                }
            }
        }
    }
    
    @Class6753
    private void method10192(final Class5740 class5740) {
        if (this.method9906() && !this.method9883("Silent")) {
            if (!this.field15703.isEmpty()) {
                final float[] method30921 = Class8845.method30921(this.field15703.get(0));
                Class3232.field15514.field4684.rotationYaw = method30921[0];
                Class3232.field15514.field4684.rotationPitch = method30921[1];
            }
        }
    }
    
    public List<Entity> method10193(final float n) {
        final List<Entity> method19138 = Class6430.method19138();
        final Iterator<Entity> iterator = method19138.iterator();
        while (iterator.hasNext()) {
            final Entity class399 = iterator.next();
            if (class399 == Class3232.field15514.field4684) {
                iterator.remove();
            }
            else if (Class9463.method35173().method35190().method29878(class399)) {
                iterator.remove();
            }
            else if (!(class399 instanceof LivingEntity)) {
                iterator.remove();
            }
            else if (((LivingEntity)class399).method2664() == 0.0f) {
                iterator.remove();
            }
            else if (Class3232.field15514.field4684.method1732(class399) > n) {
                iterator.remove();
            }
            else if (!Class3232.field15514.field4684.method2646((LivingEntity)class399)) {
                iterator.remove();
            }
            else if (class399 instanceof Class857) {
                iterator.remove();
            }
            else if (!this.method9883("Players") && class399 instanceof Class512) {
                iterator.remove();
            }
            else if (this.method9883("Anti-Bot") && class399 instanceof Class512 && Class9463.method35173().method35191().method31751(class399)) {
                iterator.remove();
            }
            else if (!this.method9883("Invisible") && class399.method1823()) {
                iterator.remove();
            }
            else if (!this.method9883("Animals/Monsters") && !(class399 instanceof Class512)) {
                iterator.remove();
            }
            else if (Class3232.field15514.field4684.method1920() != null && Class3232.field15514.field4684.method1920().equals(class399)) {
                iterator.remove();
            }
            else if (class399.method1850()) {
                iterator.remove();
            }
            else {
                if (!(class399 instanceof Class512) || !Class9011.method32262((Class512)class399) || this.method9883("Teams")) {
                    continue;
                }
                iterator.remove();
            }
        }
        final String method19139 = this.method9887("Sort mode");
        switch (method19139) {
            case "Range": {
                Collections.sort((List<Object>)method19138, (Comparator<? super Object>)new Class4443(this));
                break;
            }
            case "Angle": {
                Collections.sort((List<Object>)method19138, (Comparator<? super Object>)new Class4463(this));
                break;
            }
        }
        return method19138;
    }
}
