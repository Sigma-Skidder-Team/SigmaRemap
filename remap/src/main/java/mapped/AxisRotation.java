// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum AxisRotation
{
    NONE {
        public int getCoordinate(int x, int y, int z, Axis axis)
        {
            return axis.getCoordinate(x, y, z);
        }

        public Axis rotate(Axis axisIn)
        {
            return axisIn;
        }

        public AxisRotation reverse()
        {
            return this;
        }
    }, 
    FORWARD {
        public int getCoordinate(int x, int y, int z, Axis axis)
        {
            return axis.getCoordinate(x, y, z);
        }
        
        @Override
        public Axis rotate(final Axis axisIn) {
            return AXES[Math.floorMod(axisIn.ordinal() + 1, 3)];
        }
        
        @Override
        public AxisRotation reverse() {
            return BACKWARD;
        }
    }, 
    BACKWARD {
        public int getCoordinate(int x, int y, int z, Axis axis)
        {
            return axis.getCoordinate(y, z, x);
        }

        public Axis rotate(Axis axisIn)
        {
            return AXES[Math.floorMod(axisIn.ordinal() - 1, 3)];
        }

        public AxisRotation reverse() {
            return FORWARD;
        }
    };
    
    public static final Axis[] AXES;
    public static final AxisRotation[] AXIS_ROTATIONS;
    
    public abstract int getCoordinate(final int p0, final int p1, final int p2, final Axis p3);
    
    public abstract Axis rotate(final Axis p0);
    
    public abstract AxisRotation reverse();

    public static AxisRotation from(Axis axis1, Axis axis2)
    {
        return AXIS_ROTATIONS[Math.floorMod(axis2.ordinal() - axis1.ordinal(), 3)];
    }
    
    static {
        AXES = Axis.values();
        AXIS_ROTATIONS = values();
    }
}
