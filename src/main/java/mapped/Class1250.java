// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1250 implements Runnable
{
    public final /* synthetic */ long field6801;
    public final /* synthetic */ long field6802;
    public final /* synthetic */ long field6803;
    public final /* synthetic */ Class11 field6804;
    
    public Class1250(final Class11 field6804, final long field6805, final long field6806, final long field6807) {
        this.field6804 = field6804;
        this.field6801 = field6805;
        this.field6802 = field6806;
        this.field6803 = field6807;
    }
    
    @Override
    public void run() {
        switch (Class8132.field33504[this.field6804.field29.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: {
                for (long field6801 = this.field6801; field6801 < this.field6802; ++field6801) {
                    Class8601.field36113.putByte(this.field6803 + this.field6804.field31 * field6801, (byte)0);
                }
                break;
            }
            case 6: {
                for (long field6802 = this.field6801; field6802 < this.field6802; ++field6802) {
                    Class8601.field36113.putShort(this.field6803 + this.field6804.field31 * field6802, (short)0);
                }
                break;
            }
            case 7: {
                for (long field6803 = this.field6801; field6803 < this.field6802; ++field6803) {
                    Class8601.field36113.putInt(this.field6803 + this.field6804.field31 * field6803, 0);
                }
                break;
            }
            case 8: {
                for (long field6804 = this.field6801; field6804 < this.field6802; ++field6804) {
                    Class8601.field36113.putLong(this.field6803 + this.field6804.field31 * field6804, 0L);
                }
                break;
            }
            case 9: {
                for (long field6805 = this.field6801; field6805 < this.field6802; ++field6805) {
                    Class8601.field36113.putFloat(this.field6803 + this.field6804.field31 * field6805, 0.0f);
                }
                break;
            }
            case 10: {
                for (long field6806 = this.field6801; field6806 < this.field6802; ++field6806) {
                    Class8601.field36113.putDouble(this.field6803 + this.field6804.field31 * field6806, 0.0);
                }
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid array type.");
            }
        }
    }
}
