// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.chunk.Chunk;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;

public class Class7614
{
    private static String[] field30173;
    private final RotationManager field30174;
    private final HashMap<BlockPos, BlockState> field30175;
    private final HashMap<BlockPos, BlockState> field30176;
    private final Set<Class6977> field30177;
    private final Set<Class9488> field30178;
    private final Set<Class9488> field30179;
    
    public Class7614(final RotationManager field30174) {
        this.field30175 = new HashMap<BlockPos, BlockState>();
        this.field30176 = new HashMap<BlockPos, BlockState>();
        this.field30177 = new HashSet<Class6977>();
        this.field30178 = new HashSet<Class9488>();
        this.field30179 = new HashSet<Class9488>();
        this.field30174 = field30174;
        this.method23916();
    }
    
    private void method23915(final Class6977 class6977) {
        this.field30177.add(class6977);
    }
    
    private void method23916() {
        this.method23915(new Class6976());
        this.method23915(new Class6979());
        this.method23915(new Class6985());
        this.method23915(new Class6978());
        this.method23915(new Class6980());
        this.method23915(new Class6981());
        this.method23915(new Class6983());
        this.method23915(new Class6984());
        this.method23915(new Class6986());
        this.method23915(new Class6982());
    }
    
    public void method23917() {
        for (final Map.Entry entry : this.field30175.entrySet()) {
            this.method23921((BlockPos)entry.getKey(), (BlockState)entry.getValue());
        }
        this.field30175.clear();
    }
    
    public void method23918() {
        for (final Map.Entry entry : this.field30176.entrySet()) {
            this.method23924((BlockPos)entry.getKey(), (BlockState)entry.getValue());
        }
        this.field30176.clear();
    }
    
    public void method23919() {
        this.field30178.clear();
        this.field30175.clear();
    }
    
    public void method23920() {
        for (final Class9488 class9488 : this.field30179) {
            Minecraft.getInstance().world.method6692(class9488.field40785, class9488.field40786);
        }
        this.field30179.clear();
    }
    
    private void method23921(final BlockPos class354, final BlockState class355) {
        final Class6977 method23922 = this.method23922(class355);
        if (method23922 != null) {
            this.field30178.addAll(method23922.method21398(class354, class355, this));
        }
    }
    
    private Class6977 method23922(final BlockState class7096) {
        for (final Class6977 class7097 : this.field30177) {
            if (class7097.field27276 != class7096.getBlock().getClass()) {
                continue;
            }
            return class7097;
        }
        return null;
    }
    
    public IPacket method23923(final IPacket class4252) {
        final HashMap hashMap = new HashMap();
        if (!(class4252 instanceof Class4312)) {
            if (class4252 instanceof Class4271) {
                final Class4271 class4253 = (Class4271)class4252;
                if (this.method23925(class4253.method12817())) {
                    hashMap.put(class4253.method12818(), new Class9488(class4253.method12818(), class4253.method12817()));
                }
            }
        }
        else {
            for (final Class7870 class4254 : ((Class4312)class4252).method12963()) {
                if (this.method23925(class4254.method25491())) {
                    hashMap.put(class4254.method25489(), new Class9488(class4254.method25489(), class4254.method25491()));
                }
            }
        }
        for (final Class9488 class4255 : this.field30178) {
            hashMap.put(class4255.field40785, new Class9488(class4255.field40785, class4255.field40786));
        }
        this.field30178.clear();
        if (hashMap.size() != 0) {
            final BlockPos class4256 = (BlockPos)hashMap.keySet().toArray()[0];
            final Class4312 class4257 = new Class4312();
            class4257.field19330 = new ChunkPos(class4256.getX() >> 4, class4256.getZ() >> 4);
            final ArrayList list = new ArrayList();
            for (final Map.Entry<BlockPos, V> entry : hashMap.entrySet()) {
                final short n = (short)((entry.getKey().getX() & 0xF) << 12 | (entry.getKey().getZ() & 0xF) << 8 | entry.getKey().getY());
                final ArrayList list2 = list;
                final Class4312 class4258 = class4257;
                class4258.getClass();
                list2.add(new Class7870(class4258, n, ((Class9488)entry.getValue()).field40786));
            }
            class4257.field19331 = (Class7870[])list.toArray(new Class7870[0]);
            return class4257;
        }
        return class4252;
    }
    
    private void method23924(final BlockPos class354, final BlockState class355) {
        final Class6977 method23922 = this.method23922(class355);
        if (method23922 != null) {
            this.field30179.addAll(method23922.method21399(class354, class355, this));
        }
    }
    
    public boolean method23925(final BlockState class7096) {
        return this.method23922(class7096) != null;
    }
    
    public void method23926(final BlockPos class354, final BlockState class355) {
        this.field30175.put(class354, class355);
        this.field30176.put(class354, class355);
    }
    
    public BlockState method23927(final BlockPos class354) {
        if (this.field30175.containsKey(class354)) {
            return this.field30175.get(class354);
        }
        if (!this.field30176.containsKey(class354)) {
            return Minecraft.getInstance().world.getBlockState(class354);
        }
        return this.field30176.get(class354);
    }
    
    public void method23928(final Chunk class1862) {
        for (final Class9488 class1863 : this.field30178) {
            class1862.method7008(class1863.field40785, class1863.field40786, false);
        }
        this.field30178.clear();
    }
}
