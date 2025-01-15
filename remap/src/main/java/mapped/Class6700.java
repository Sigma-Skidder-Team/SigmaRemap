// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.commands.CommandException;
import net.minecraft.util.math.MathHelper;

import java.util.Collections;

public class Class6700 extends Class6693
{
    public Class6700() {
        super("hclip", "Horizontal clip", new String[] { "hc" });
        this.method20351("offset");
    }
    
    @Override
    public void run(final String s, final Class8025[] array, final Class6428 class6428) throws CommandException {
        if (array.length == 0) {
            throw new Class2332();
        }
        if (array.length > 1) {
            throw new Class2332("Too many arguments");
        }
        if (array[0].method26310() != Class1954.field10637) {
            throw new Class2332("Invalid distance \"" + array[0].method26314() + "\"");
        }
        final float n = (float)Math.toRadians(Class6700.field26420.field4684.rotationYaw + 90.0f);
        Class6700.field26420.method5269().method17285(new Class4328(Class6700.field26420.field4684.posX + MathHelper.cos(n) * array[0].method26311(), Class6700.field26420.field4684.posY, Class6700.field26420.field4684.posZ + MathHelper.sin(n) * array[0].method26311(), Class6700.field26420.field4684.rotationYaw, Class6700.field26420.field4684.rotationPitch, Collections.emptySet(), 0));
        class6428.method19104("Successfully HClip'd");
    }
}
