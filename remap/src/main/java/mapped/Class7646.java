// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Optional;
import org.lwjgl.glfw.GLFWVidMode$Buffer;
import java.util.Comparator;
import org.lwjgl.glfw.GLFW;
import com.google.common.collect.Lists;
import java.util.List;

public final class Class7646
{
    private final long field30367;
    private final List<Class8680> field30368;
    private Class8680 field30369;
    private int field30370;
    private int field30371;
    
    public Class7646(final long field30367) {
        this.field30367 = field30367;
        this.field30368 = Lists.newArrayList();
        this.method24205();
    }
    
    public void method24205() {
        Class8726.method29989(Class8726::method29990);
        this.field30368.clear();
        final GLFWVidMode$Buffer glfwGetVideoModes = GLFW.glfwGetVideoModes(this.field30367);
        final Class8680 class8680 = new Class8680(GLFW.glfwGetVideoMode(this.field30367));
        for (int i = glfwGetVideoModes.limit() - 1; i >= 0; --i) {
            glfwGetVideoModes.position(i);
            final Class8680 class8681 = new Class8680(glfwGetVideoModes);
            if (class8681.method29721() >= 8) {
                if (class8681.method29722() >= 8) {
                    if (class8681.method29723() >= 8) {
                        if (class8681.method29724() >= class8680.method29724()) {
                            this.field30368.add(class8681);
                        }
                    }
                }
            }
        }
        this.field30368.sort(new Class4435());
        final int[] array = { 0 };
        final int[] array2 = { 0 };
        GLFW.glfwGetMonitorPos(this.field30367, array, array2);
        this.field30370 = array[0];
        this.field30371 = array2[0];
        this.field30369 = new Class8680(GLFW.glfwGetVideoMode(this.field30367));
    }
    
    public Class8680 method24206(final Optional<Class8680> optional) {
        Class8726.method29989(Class8726::method29990);
        if (optional.isPresent()) {
            final Class8680 class8680 = optional.get();
            for (final Class8680 class8681 : this.field30368) {
                if (!class8681.equals(class8680)) {
                    continue;
                }
                return class8681;
            }
        }
        return this.method24208();
    }
    
    public int method24207(final Class8680 class8680) {
        Class8726.method29989(Class8726::method29990);
        return this.field30368.indexOf(class8680);
    }
    
    public Class8680 method24208() {
        return this.field30369;
    }
    
    public int method24209() {
        return this.field30370;
    }
    
    public int method24210() {
        return this.field30371;
    }
    
    public Class8680 method24211(final int n) {
        return this.field30368.get(n);
    }
    
    public int method24212() {
        return this.field30368.size();
    }
    
    public long method24213() {
        return this.field30367;
    }
    
    @Override
    public String toString() {
        return String.format("Monitor[%s %sx%s %s]", this.field30367, this.field30370, this.field30371, this.field30369);
    }
}
