// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.stream.Stream;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;

import java.util.function.Function;

public class Class7151 extends Class7139<Class6927>
{
    public Class7151(final Function<Dynamic<?>, ? extends Class6927> function) {
        super(function);
    }
    
    public Stream<BlockPos> method21902(final Random random, final Class6927 class6927, final BlockPos class6928) {
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < random.nextInt(random.nextInt(class6927.field27146) + 1) + 1; ++i) {
            arrayList.add(new BlockPos(random.nextInt(16) + class6928.getX(), random.nextInt(120) + 4, random.nextInt(16) + class6928.getZ()));
        }
        return arrayList.stream();
    }
}
