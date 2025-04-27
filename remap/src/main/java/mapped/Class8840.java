// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import com.google.common.collect.Maps;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public class Class8840
{
    private static final Logger field37152;
    private final Minecraft field37153;
    private final Class6518 field37154;
    private final Map<Class8863, Class348> field37155;
    private Class558 field37156;
    private Class8863 field37157;
    
    public Class8840(final Minecraft field37153) {
        this.field37154 = new Class6518();
        this.field37155 = Maps.newHashMap();
        this.field37153 = field37153;
    }
    
    public void method30867(final Class4385 class4385) {
        if (class4385.method13196()) {
            this.field37154.method19672();
            this.field37155.clear();
        }
        this.field37154.method19670(class4385.method13194());
        this.field37154.method19671(class4385.method13193());
        for (final Map.Entry<ResourceLocation, V> entry : class4385.method13195().entrySet()) {
            final Class8863 method19675 = this.field37154.method19675(entry.getKey());
            if (method19675 == null) {
                Class8840.field37152.warn("Server informed client about progress for unknown advancement {}", entry.getKey());
            }
            else {
                final Class348 class4386 = (Class348)entry.getValue();
                class4386.method1030(method19675.method31039(), method19675.method31043());
                this.field37155.put(method19675, class4386);
                if (this.field37156 != null) {
                    this.field37156.method3267(method19675, class4386);
                }
                if (class4385.method13196()) {
                    continue;
                }
                if (!class4386.method1031()) {
                    continue;
                }
                if (method19675.method31036() == null) {
                    continue;
                }
                if (!method19675.method31036().method22534()) {
                    continue;
                }
                this.field37153.method5318().method3852(new Class6868(method19675));
            }
        }
    }
    
    public Class6518 method30868() {
        return this.field37154;
    }
    
    public void method30869(final Class8863 field37157, final boolean b) {
        final Class5799 method5269 = this.field37153.method5269();
        if (method5269 != null) {
            if (field37157 != null) {
                if (b) {
                    method5269.method17292(Class4334.method13013(field37157));
                }
            }
        }
        if (this.field37157 != field37157) {
            this.field37157 = field37157;
            if (this.field37156 != null) {
                this.field37156.method3268(field37157);
            }
        }
    }
    
    public void method30870(final Class558 field37156) {
        this.field37156 = field37156;
        this.field37154.method19676(field37156);
        if (field37156 != null) {
            for (final Map.Entry entry : this.field37155.entrySet()) {
                field37156.method3267((Class8863)entry.getKey(), (Class348)entry.getValue());
            }
            field37156.method3268(this.field37157);
        }
    }
    
    static {
        field37152 = LogManager.getLogger();
    }
}
