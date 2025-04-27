// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.ChunkPos;

import java.util.AbstractList;

public class Class6774
{
    public static Class6822 method20679(final CompoundNBT class51) {
        final Class6822 class52 = new Class6822(class51.getInt("xPos"), class51.getInt("zPos"));
        class52.field26784 = class51.getByteArray("Blocks");
        class52.field26783 = new Class9364(class51.getByteArray("Data"), 7);
        class52.field26782 = new Class9364(class51.getByteArray("SkyLight"), 7);
        class52.field26781 = new Class9364(class51.getByteArray("BlockLight"), 7);
        class52.field26780 = class51.getByteArray("HeightMap");
        class52.field26779 = class51.getBoolean("TerrainPopulated");
        class52.field26785 = class51.getList("Entities", 10);
        class52.field26786 = class51.getList("TileEntities", 10);
        class52.field26787 = class51.getList("TileTicks", 10);
        try {
            class52.field26778 = class51.getLong("LastUpdate");
        }
        catch (final ClassCastException ex) {
            class52.field26778 = class51.getInt("LastUpdate");
        }
        return class52;
    }
    
    public static void method20680(final Class6822 class6822, final CompoundNBT class6823, final Class1868 class6824) {
        class6823.putInt("xPos", class6822.field26788);
        class6823.putInt("zPos", class6822.field26789);
        class6823.putLong("LastUpdate", class6822.field26778);
        final int[] array = new int[class6822.field26780.length];
        for (int i = 0; i < class6822.field26780.length; ++i) {
            array[i] = class6822.field26780[i];
        }
        class6823.putIntArray("HeightMap", array);
        class6823.putBoolean("TerrainPopulated", class6822.field26779);
        final ListNBT class6825 = new ListNBT();
        for (int j = 0; j < 8; ++j) {
            int n = 1;
            for (int n2 = 0; n2 < 16 && n != 0; ++n2) {
                for (int n3 = 0; n3 < 16 && n != 0; ++n3) {
                    for (int k = 0; k < 16; ++k) {
                        if (class6822.field26784[n2 << 11 | k << 7 | n3 + (j << 4)] != 0) {
                            n = 0;
                            break;
                        }
                    }
                }
            }
            if (n == 0) {
                final byte[] array2 = new byte[4096];
                final Class7281 class6826 = new Class7281();
                final Class7281 class6827 = new Class7281();
                final Class7281 class6828 = new Class7281();
                for (int l = 0; l < 16; ++l) {
                    for (int n4 = 0; n4 < 16; ++n4) {
                        for (int n5 = 0; n5 < 16; ++n5) {
                            array2[n4 << 8 | n5 << 4 | l] = (byte)(class6822.field26784[l << 11 | n5 << 7 | n4 + (j << 4)] & 0xFF);
                            class6826.method22323(l, n4, n5, class6822.field26783.method34741(l, n4 + (j << 4), n5));
                            class6827.method22323(l, n4, n5, class6822.field26782.method34741(l, n4 + (j << 4), n5));
                            class6828.method22323(l, n4, n5, class6822.field26781.method34741(l, n4 + (j << 4), n5));
                        }
                    }
                }
                final CompoundNBT e = new CompoundNBT();
                e.putByte("Y", (byte)(j & 0xFF));
                e.putByteArray("Blocks", array2);
                e.putByteArray("Data", class6826.method22321());
                e.putByteArray("SkyLight", class6827.method22321());
                e.putByteArray("BlockLight", class6828.method22321());
                class6825.add(e);
            }
        }
        class6823.put("Sections", class6825);
        class6823.putIntArray("Biomes", new Class1873(new ChunkPos(class6822.field26788, class6822.field26789), class6824).method7125());
        class6823.put("Entities", class6822.field26785);
        class6823.put("TileEntities", class6822.field26786);
        if (class6822.field26787 != null) {
            class6823.put("TileTicks", class6822.field26787);
        }
        class6823.putBoolean("convertedFromAlphaFormat", true);
    }
}
