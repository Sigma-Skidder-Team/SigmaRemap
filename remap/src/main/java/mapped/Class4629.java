// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import net.minecraft.util.math.Vec3d;

public class Class4629 extends Class4611<Class4245>
{
    private static final Class1932 field20095;
    
    @Override
    public Class1932 method13717() {
        return Class4629.field20095;
    }
    
    public Class4245 method13799(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return new Class4245(Class8697.method29814(jsonObject.get("entered")), Class8697.method29814(jsonObject.get("exited")), Class8817.method30758(jsonObject.get("distance")));
    }
    
    public void method13800(final Class513 class513, final Vec3d class514) {
        this.method13726(class513.method2957(), class517 -> class517.method12752(class515.method2940(), class516, class515.method1938(), class515.method1941(), class515.method1945()));
    }
    
    static {
        field20095 = new Class1932("nether_travel");
    }
}
