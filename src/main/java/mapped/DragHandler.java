package mapped;

public interface DragHandler {
   void handleMovementAndCheckBoundaries(int var1, int var2);

   boolean isDraggable();

   void setDraggable(boolean var1);

   boolean isDragging();

   void setDragging(boolean var1);
}
