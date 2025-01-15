// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class5522 extends Class5515
{
    public Class5522() {
        super(Class7499.field29019, "sheep_wool", 0.7f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5841<Object>();
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float n) {
        final Class8551 method5306 = Class869.method5277().method5306();
        Class4703 obj = method5306.method28719().get(Class802.class);
        if (obj instanceof Class4729) {
            if (obj.method13960() == null) {
                final Class4729 class5902 = new Class4729(method5306);
                class5902.field20301 = (M)new Class5838();
                class5902.field20284 = 0.7f;
                obj = class5902;
            }
            final Class4729 class5903 = (Class4729)obj;
            final Iterator<Class1799<Class802, Class5838<Class802>>> iterator = class5903.method13992().iterator();
            while (iterator.hasNext()) {
                if (!(iterator.next() instanceof Class1836)) {
                    continue;
                }
                iterator.remove();
            }
            final Class1836 class5904 = new Class1836(class5903);
            class5904.field10019 = (Class5841)class5901;
            class5903.method13978(class5904);
            return (Class9559)class5903;
        }
        Class8571.method28848("Not a RenderSheep: " + obj);
        return null;
    }
}
