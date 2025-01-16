// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;

public enum AxisRotation
{
    NONE {
        public int getCoordinate(int x, int y, int z, Direction.Axis axis)
        {
            return axis.getCoordinate(x, y, z);
        }

        public Direction.Axis rotate(Direction.Axis axisIn)
        {
            return axisIn;
        }

        public AxisRotation reverse()
        {
            return this;
        }
    }, 
    FORWARD {
        public int getCoordinate(int x, int y, int z, Direction.Axis axis)
        {
            return axis.getCoordinate(x, y, z);
        }
        
        @Override
        public Direction.Axis rotate(final Direction.Axis axisIn) {
            return AXES[Math.floorMod(axisIn.ordinal() + 1, 3)];
        }
        
        @Override
        public AxisRotation reverse() {
            return BACKWARD;
        }
    }, 
    BACKWARD {
        public int getCoordinate(int x, int y, int z, Direction.Axis axis)
        {
            return axis.getCoordinate(y, z, x);
        }

        public Direction.Axis rotate(Direction.Axis axisIn)
        {
            return AXES[Math.floorMod(axisIn.ordinal() - 1, 3)];
        }

        public AxisRotation reverse() {
            return FORWARD;
        }
    };
    
    public static final Direction.Axis[] AXES;
    public static final AxisRotation[] AXIS_ROTATIONS;
    
    public abstract int getCoordinate(final int p0, final int p1, final int p2, final Direction.Axis p3);
    
    public abstract Direction.Axis rotate(final Direction.Axis p0);
    
    public abstract AxisRotation reverse();

    public static AxisRotation from(Direction.Axis axis1, Direction.Axis axis2)
    {
        return AXIS_ROTATIONS[Math.floorMod(axis2.ordinal() - axis1.ordinal(), 3)];
    }
    
    static {
        AXES = Direction.Axis.values();
        AXIS_ROTATIONS = values();
    }
}
