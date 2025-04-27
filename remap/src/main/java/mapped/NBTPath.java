// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.function.Supplier;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collections;
import java.util.List;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import net.minecraft.nbt.INBT;

public class NBTPath
{
    private final String rawText;
    private final Object2IntMap<INode> field_218078_b;
    private final INode[] nodes;
    
    public NBTPath(final String field36007, final INode[] field36008, final Object2IntMap<INode> field36009) {
        this.rawText = field36007;
        this.nodes = field36008;
        this.field_218078_b = field36009;
    }
    
    public List<INBT> func_218071_a(final INBT o) throws CommandSyntaxException {
        List<INBT> list = Collections.singletonList(o);
        for (final INode class6102 : this.nodes) {
            list = class6102.func_218056_a(list);
            if (list.isEmpty()) {
                throw this.createNothingFoundException(class6102);
            }
        }
        return list;
    }
    
    public int func_218069_b(final INBT o) {
        List<INBT> list = Collections.singletonList(o);
        final INode[] field36009 = this.nodes;
        for (int length = field36009.length, i = 0; i < length; ++i) {
            list = field36009[i].func_218056_a(list);
            if (list.isEmpty()) {
                return 0;
            }
        }
        return list.size();
    }
    
    private List<INBT> func_218072_d(final INBT o) throws CommandSyntaxException {
        List<INBT> list = Collections.singletonList(o);
        for (int i = 0; i < this.nodes.length - 1; ++i) {
            final INode class6102 = this.nodes[i];
            list = class6102.func_218052_a(list, this.nodes[i + 1]::createEmptyElement);
            if (list.isEmpty()) {
                throw this.createNothingFoundException(class6102);
            }
        }
        return list;
    }

    public List<INBT> func_218073_a(final INBT class41, final Supplier<INBT> supplier) throws CommandSyntaxException {
        return this.nodes[this.nodes.length - 1].func_218052_a(this.func_218072_d(class41), supplier);
    }

    private static int reduceToInt(List<INBT> list, Function<INBT, Integer> function) {
        return list.stream().map(function).reduce(0, (n, n2) -> n + n2);
    }

    public int func_218076_b(INBT class412, Supplier<INBT> supplier) throws CommandSyntaxException {
        List<INBT> list = this.func_218072_d(class412);
        INode class6102 = this.nodes[this.nodes.length - 1];
        return NBTPath.reduceToInt(list, class41 -> class6102.func_218051_a(class41, supplier));
    }
    
    public int method28810(final INBT o) {
        List<INBT> list = Collections.singletonList(o);
        for (int i = 0; i < this.nodes.length - 1; ++i) {
            list = this.nodes[i].func_218056_a(list);
        }
        return reduceToInt(list, this.nodes[this.nodes.length - 1]::func_218053_a);
    }
    
    private CommandSyntaxException createNothingFoundException(final INode class6102) {
        return NBTPathArgument.NOTHING_FOUND.create(this.rawText.substring(0, this.field_218078_b.getInt(class6102)));
    }
    
    @Override
    public String toString() {
        return this.rawText;
    }
}
