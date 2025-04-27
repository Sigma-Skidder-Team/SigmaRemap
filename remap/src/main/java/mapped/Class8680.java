// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.regex.Matcher;
import java.util.Optional;
import java.util.Objects;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.glfw.GLFWVidMode$Buffer;
import java.util.regex.Pattern;

public final class Class8680
{
    private final int field36478;
    private final int field36479;
    private final int field36480;
    private final int field36481;
    private final int field36482;
    private final int field36483;
    private static final Pattern field36484;
    
    public Class8680(final int field36478, final int field36479, final int field36480, final int field36481, final int field36482, final int field36483) {
        this.field36478 = field36478;
        this.field36479 = field36479;
        this.field36480 = field36480;
        this.field36481 = field36481;
        this.field36482 = field36482;
        this.field36483 = field36483;
    }
    
    public Class8680(final GLFWVidMode$Buffer glfwVidMode$Buffer) {
        this.field36478 = glfwVidMode$Buffer.width();
        this.field36479 = glfwVidMode$Buffer.height();
        this.field36480 = glfwVidMode$Buffer.redBits();
        this.field36481 = glfwVidMode$Buffer.greenBits();
        this.field36482 = glfwVidMode$Buffer.blueBits();
        this.field36483 = glfwVidMode$Buffer.refreshRate();
    }
    
    public Class8680(final GLFWVidMode glfwVidMode) {
        this.field36478 = glfwVidMode.width();
        this.field36479 = glfwVidMode.height();
        this.field36480 = glfwVidMode.redBits();
        this.field36481 = glfwVidMode.greenBits();
        this.field36482 = glfwVidMode.blueBits();
        this.field36483 = glfwVidMode.refreshRate();
    }
    
    public int method29719() {
        return this.field36478;
    }
    
    public int method29720() {
        return this.field36479;
    }
    
    public int method29721() {
        return this.field36480;
    }
    
    public int method29722() {
        return this.field36481;
    }
    
    public int method29723() {
        return this.field36482;
    }
    
    public int method29724() {
        return this.field36483;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final Class8680 class8680 = (Class8680)o;
            if (this.field36478 == class8680.field36478) {
                if (this.field36479 == class8680.field36479) {
                    if (this.field36480 == class8680.field36480) {
                        if (this.field36481 == class8680.field36481) {
                            if (this.field36482 == class8680.field36482) {
                                return this.field36483 == class8680.field36483;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.field36478, this.field36479, this.field36480, this.field36481, this.field36482, this.field36483);
    }
    
    @Override
    public String toString() {
        return String.format("%sx%s@%s (%sbit)", this.field36478, this.field36479, this.field36483, this.field36480 + this.field36481 + this.field36482);
    }
    
    public static Optional<Class8680> method29725(final String input) {
        if (input == null) {
            return Optional.empty();
        }
        try {
            final Matcher matcher = Class8680.field36484.matcher(input);
            if (matcher.matches()) {
                final int int1 = Integer.parseInt(matcher.group(1));
                final int int2 = Integer.parseInt(matcher.group(2));
                final String group = matcher.group(3);
                int int3;
                if (group == null) {
                    int3 = 60;
                }
                else {
                    int3 = Integer.parseInt(group);
                }
                final String group2 = matcher.group(4);
                int int4;
                if (group2 == null) {
                    int4 = 24;
                }
                else {
                    int4 = Integer.parseInt(group2);
                }
                final int n = int4 / 3;
                return Optional.of(new Class8680(int1, int2, n, n, n, int3));
            }
        }
        catch (final Exception ex) {}
        return Optional.empty();
    }
    
    public String method29726() {
        return String.format("%sx%s@%s:%s", this.field36478, this.field36479, this.field36483, this.field36480 + this.field36481 + this.field36482);
    }
    
    static {
        field36484 = Pattern.compile("(\\d+)x(\\d+)(?:@(\\d+)(?::(\\d+))?)?");
    }
}
