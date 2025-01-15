// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import org.lwjgl.opengl.GL11;
import java.util.ArrayList;

public class Class3304 extends Class3167
{
    private ArrayList<Class7859> field15875;
    private ArrayList<Class7859> field15876;
    
    public Class3304() {
        super(Class8013.field32987, "NewChunks", "Detects new chunks on non vanilla servers");
        this.field15875 = new ArrayList<Class7859>();
        this.field15876 = new ArrayList<Class7859>();
    }
    
    @Class6753
    private void method10463(final Class5723 class5723) {
        if (this.method9906()) {
            if (class5723.method16998() instanceof Class4298) {
                final Class4298 class5724 = (Class4298)class5723.method16998();
                final Class7859 e = new Class7859(class5724.method12909(), class5724.method12910());
                if (!class5724.method12912()) {
                    this.field15876.add(e);
                }
            }
        }
    }
    
    @Class6753
    private void method10464(final Class5739 class5739) {
        if (this.method9906()) {
            final Iterator<Class7859> iterator = this.field15876.iterator();
            while (iterator.hasNext()) {
                final Class7859 class5740 = iterator.next();
                if (!this.field15875.contains(class5740)) {
                    this.field15875.add(class5740);
                }
                iterator.remove();
            }
            final Iterator<Class7859> iterator2 = this.field15875.iterator();
            while (iterator2.hasNext()) {
                final Class7859 class5741 = iterator2.next();
                if (class5741 != null) {
                    final double n = class5741.method25426() - Class3304.field15514.field4644.method5833().method18161().getX();
                    final double n2 = class5741.method25427() - Class3304.field15514.field4644.method5833().method18161().getZ();
                    final double n3 = -Class3304.field15514.field4644.method5833().method18161().getY();
                    GL11.glDisable(2929);
                    final Class7644 class5742 = new Class7644(n, n3, n2, n + 16.0, n3, n2 + 16.0);
                    Class8154.method26909(class5742, Class6430.method19118(Class265.field1285.field1292, 0.1f));
                    Class8154.method26911(class5742, Class6430.method19118(Class265.field1285.field1292, 0.1f));
                    GL11.glColor3f(1.0f, 1.0f, 1.0f);
                    GL11.glEnable(2929);
                    final int n4 = Class3304.field15514.field4684.field2441 - class5741.field32290;
                    final int n5 = Class3304.field15514.field4684.field2443 - class5741.field32291;
                    if (Math.sqrt(n4 * n4 + n5 * n5) <= 30.0) {
                        continue;
                    }
                    iterator2.remove();
                }
            }
        }
    }
    
    @Override
    public void method9897() {
        this.field15876.clear();
        this.field15875.clear();
    }
}
