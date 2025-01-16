// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.mods.impl.misc.NoteblockPlayer;
import net.minecraft.util.math.BlockPos;

public class Class9486
{
    private static String[] field40772;
    public BlockPos field40773;
    public float field40774;
    public Class185 field40775;
    
    public Class9486(final BlockPos field40773) {
        this.field40774 = -1.0f;
        this.field40775 = Class185.field579;
        this.field40773 = field40773;
        this.field40775 = Class185.method826(NoteblockPlayer.method10714().field4683.method6701(field40773.method1139()));
    }
    
    public int method35311() {
        switch (Class8339.field34241[this.field40775.ordinal()]) {
            case 1: {
                return 0;
            }
            case 2: {
                return 1;
            }
            case 3: {
                return 2;
            }
            case 4: {
                return 3;
            }
            case 5: {
                return 4;
            }
            case 6: {
                return 5;
            }
            case 7: {
                return 6;
            }
            case 8: {
                return 7;
            }
            case 9: {
                return 8;
            }
            case 10: {
                return 9;
            }
            case 11: {
                return 10;
            }
            case 12: {
                return 11;
            }
            case 13: {
                return 12;
            }
            case 14: {
                return 13;
            }
            case 15: {
                return 14;
            }
            case 16: {
                return 15;
            }
            default: {
                return 0;
            }
        }
    }
}
